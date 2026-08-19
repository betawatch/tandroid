package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.LinearInterpolator;
import androidx.core.graphics.ColorUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.MessageDrawable;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.EmptyStubSpan;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.ReplyMessageLine;
import org.telegram.ui.Components.chat.ViewPositionWatcher;
import org.telegram.ui.Components.spoilers.SpoilerEffect;
import org.telegram.ui.MessageEnterTransitionContainer;
import org.telegram.ui.recyclerview.ChatListItemAnimator;

/* loaded from: classes4.dex */
public class TextMessageEnterTransition implements MessageEnterTransitionContainer.Transition {
    private AnimatedEmojiSpan.EmojiGroupedSpans animatedEmojiStack;
    private ValueAnimator animator;
    boolean changeColor;
    private ChatActivity chatActivity;
    MessageEnterTransitionContainer container;
    boolean crossfade;
    Bitmap crossfadeTextBitmap;
    float crossfadeTextOffset;
    private final int currentAccount;
    MessageObject currentMessageObject;
    boolean drawBitmaps;
    private float drawableFromBottom;
    float drawableFromTop;
    ChatActivityEnterView enterView;
    int fromColor;
    Drawable fromMessageDrawable;
    float fromRadius;
    private float fromStartX;
    private float fromStartY;
    private Matrix gradientMatrix;
    private Paint gradientPaint;
    private LinearGradient gradientShader;
    boolean hasReply;
    float lastMessageX;
    float lastMessageY;
    StaticLayout layout;
    RecyclerListView listView;
    private float listViewTargetBottomPadding;
    private int messageId;
    private final RectF messageReplySelectorRect;
    ChatMessageCell messageView;
    float progress;
    int replayFromColor;
    int replayObjectFromColor;
    float replyFromObjectStartY;
    float replyFromStartWidth;
    float replyFromStartX;
    float replyFromStartY;
    float replyNameDx;
    private final RectF replySelectorRect;
    private final Theme.ResourcesProvider resourcesProvider;
    private float[] roundRectRadii;
    StaticLayout rtlLayout;
    private float scaleFrom;
    private float scaleY;
    Bitmap textLayoutBitmap;
    Bitmap textLayoutBitmapRtl;
    MessageObject.TextLayoutBlock textLayoutBlock;
    float textX;
    float textY;
    private final PointF tmpPointF;
    int toColor;
    float toXOffset;
    float toXOffsetRtl;
    Paint bitmapPaint = new Paint(1);
    boolean initBitmaps = false;
    private AnimationNotificationsLocker notificationsLocker = new AnimationNotificationsLocker();

    public TextMessageEnterTransition(final ChatMessageCell chatMessageCell, final ChatActivity chatActivity, RecyclerListView recyclerListView, final MessageEnterTransitionContainer messageEnterTransitionContainer, Theme.ResourcesProvider resourcesProvider) {
        int i;
        float f;
        int i2;
        int i3;
        int i4;
        MessageDrawable currentBackgroundDrawable;
        StaticLayout.Builder obtain;
        StaticLayout.Builder breakStrategy;
        StaticLayout.Builder hyphenationFrequency;
        StaticLayout.Builder alignment;
        StaticLayout build;
        StaticLayout.Builder obtain2;
        StaticLayout.Builder breakStrategy2;
        StaticLayout.Builder hyphenationFrequency2;
        StaticLayout.Builder alignment2;
        StaticLayout build2;
        StaticLayout.Builder obtain3;
        StaticLayout.Builder breakStrategy3;
        StaticLayout.Builder hyphenationFrequency3;
        StaticLayout.Builder alignment3;
        StaticLayout build3;
        Object[] spans;
        TextPaint textPaint;
        this.drawBitmaps = false;
        PointF pointF = new PointF();
        this.tmpPointF = pointF;
        this.replySelectorRect = new RectF();
        this.messageReplySelectorRect = new RectF();
        this.resourcesProvider = resourcesProvider;
        this.currentAccount = UserConfig.selectedAccount;
        if (chatMessageCell.getMessageObject().textLayoutBlocks == null || chatMessageCell.getMessageObject().textLayoutBlocks.size() > 1 || chatMessageCell.getMessageObject().textLayoutBlocks.isEmpty() || chatMessageCell.getMessageObject().textLayoutBlocks.get(0).textLayout.getLineCount() > 10) {
            return;
        }
        this.messageView = chatMessageCell;
        this.listView = recyclerListView;
        this.container = messageEnterTransitionContainer;
        this.chatActivity = chatActivity;
        this.enterView = chatActivity.getChatActivityEnterView();
        final ChatActivityEnterView chatActivityEnterView = chatActivity.getChatActivityEnterView();
        if (chatActivityEnterView == null || chatActivityEnterView.getEditField() == null || chatActivityEnterView.getEditField().getLayout() == null) {
            return;
        }
        ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.getRecordCircle();
        this.fromRadius = recordCircle == null ? 0.0f : recordCircle.drawingCircleRadius;
        this.bitmapPaint.setFilterBitmap(true);
        this.currentMessageObject = chatMessageCell.getMessageObject();
        if (!chatMessageCell.getTransitionParams().wasDraw) {
            chatMessageCell.draw(new Canvas());
        }
        chatMessageCell.setEnterTransitionInProgress(true);
        Editable editText = chatActivityEnterView.getEditText();
        CharSequence charSequence = chatMessageCell.getMessageObject().messageText;
        this.crossfade = false;
        int height = chatActivityEnterView.getEditField().getLayout().getHeight();
        TextPaint textPaint2 = Theme.chat_msgTextPaint;
        AndroidUtilities.dp(20.0f);
        if (chatMessageCell.getMessageObject().getEmojiOnlyCount() != 0) {
            boolean z = chatMessageCell.getMessageObject().emojiOnlyCount == chatMessageCell.getMessageObject().animatedEmojiCount;
            switch (Math.max(chatMessageCell.getMessageObject().emojiOnlyCount, chatMessageCell.getMessageObject().animatedEmojiCount)) {
                case 0:
                case 1:
                case 2:
                    if (z) {
                        textPaint = Theme.chat_msgTextPaintEmoji[0];
                        break;
                    } else {
                        textPaint = Theme.chat_msgTextPaintEmoji[2];
                        break;
                    }
                case 3:
                    if (z) {
                        textPaint = Theme.chat_msgTextPaintEmoji[1];
                        break;
                    } else {
                        textPaint = Theme.chat_msgTextPaintEmoji[3];
                        break;
                    }
                case 4:
                    if (z) {
                        textPaint = Theme.chat_msgTextPaintEmoji[2];
                        break;
                    } else {
                        textPaint = Theme.chat_msgTextPaintEmoji[4];
                        break;
                    }
                case 5:
                    if (z) {
                        textPaint = Theme.chat_msgTextPaintEmoji[3];
                        break;
                    } else {
                        textPaint = Theme.chat_msgTextPaintEmoji[5];
                        break;
                    }
                case 6:
                    if (z) {
                        textPaint = Theme.chat_msgTextPaintEmoji[4];
                        break;
                    } else {
                        textPaint = Theme.chat_msgTextPaintEmoji[5];
                        break;
                    }
                default:
                    textPaint = Theme.chat_msgTextPaintEmoji[5];
                    break;
            }
            textPaint2 = textPaint;
            if (textPaint2 != null) {
                textPaint2.getTextSize();
                AndroidUtilities.dp(4.0f);
            }
        }
        boolean z2 = (charSequence instanceof Spannable) && (spans = ((Spannable) charSequence).getSpans(0, charSequence.length(), Object.class)) != null && spans.length > 0;
        if (editText.length() != charSequence.length() || z2) {
            this.crossfade = true;
            int[] iArr = new int[1];
            CharSequence trim = AndroidUtilities.trim(editText, iArr);
            if (iArr[0] > 0) {
                i = chatActivityEnterView.getEditField().getLayout().getLineTop(chatActivityEnterView.getEditField().getLayout().getLineForOffset(iArr[0]));
                height = chatActivityEnterView.getEditField().getLayout().getLineBottom(chatActivityEnterView.getEditField().getLayout().getLineForOffset(iArr[0] + trim.length())) - i;
            } else {
                i = 0;
            }
            AnimatedEmojiSpan.cloneSpans(charSequence);
            charSequence = Emoji.replaceEmoji(editText, textPaint2.getFontMetricsInt(), false);
        } else {
            i = 0;
        }
        this.scaleFrom = chatActivityEnterView.getEditField().getTextSize() / textPaint2.getTextSize();
        int lineCount = chatActivityEnterView.getEditField().getLayout().getLineCount();
        int width = (int) (chatActivityEnterView.getEditField().getLayout().getWidth() / this.scaleFrom);
        if (Build.VERSION.SDK_INT >= 24) {
            obtain3 = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint2, width);
            breakStrategy3 = obtain3.setBreakStrategy(1);
            hyphenationFrequency3 = breakStrategy3.setHyphenationFrequency(0);
            alignment3 = hyphenationFrequency3.setAlignment(Layout.Alignment.ALIGN_NORMAL);
            build3 = alignment3.build();
            this.layout = build3;
        } else {
            this.layout = new StaticLayout(charSequence, textPaint2, width, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        }
        this.animatedEmojiStack = AnimatedEmojiSpan.update(2, (View) null, this.animatedEmojiStack, this.layout);
        ViewPositionWatcher.computeCoordinatesInParent(chatActivityEnterView.getEditField(), chatActivity.contentView, pointF);
        float f2 = pointF.y;
        this.fromStartX = pointF.x;
        this.fromStartY = ((AndroidUtilities.dp(10.0f) + f2) - chatActivityEnterView.getEditField().getScrollY()) + i;
        this.toXOffset = 0.0f;
        float f3 = Float.MAX_VALUE;
        for (int i5 = 0; i5 < this.layout.getLineCount(); i5++) {
            float lineLeft = this.layout.getLineLeft(i5);
            if (lineLeft < f3) {
                f3 = lineLeft;
            }
        }
        if (f3 != Float.MAX_VALUE) {
            this.toXOffset = f3;
        }
        this.scaleY = height / (this.layout.getHeight() * this.scaleFrom);
        this.drawableFromTop = AndroidUtilities.dp(4.0f) + f2;
        if (this.enterView.isTopViewVisible()) {
            this.drawableFromTop -= AndroidUtilities.dp(12.0f);
        }
        this.drawableFromBottom = f2 + chatActivityEnterView.getEditField().getMeasuredHeight();
        MessageObject.TextLayoutBlock textLayoutBlock = chatMessageCell.getMessageObject().textLayoutBlocks.get(0);
        this.textLayoutBlock = textLayoutBlock;
        StaticLayout staticLayout = textLayoutBlock.textLayout;
        int i6 = Theme.key_chat_messageTextOut;
        double calculateLuminance = ColorUtils.calculateLuminance(getThemedColor(i6));
        int i7 = Theme.key_chat_messagePanelText;
        if (Math.abs(calculateLuminance - ColorUtils.calculateLuminance(getThemedColor(i7))) > 0.20000000298023224d) {
            this.crossfade = true;
            this.changeColor = true;
        }
        this.fromColor = getThemedColor(i7);
        this.toColor = getThemedColor(i6);
        if (staticLayout.getLineCount() == this.layout.getLineCount()) {
            i2 = staticLayout.getLineCount();
            int i8 = 0;
            i3 = 0;
            i4 = 0;
            while (true) {
                if (i8 < i2) {
                    if (isRtlLine(this.layout, i8)) {
                        i4++;
                    } else {
                        i3++;
                    }
                    f = 12.0f;
                    if (staticLayout.getLineEnd(i8) != this.layout.getLineEnd(i8)) {
                        this.crossfade = true;
                    } else {
                        i8++;
                    }
                } else {
                    f = 12.0f;
                }
            }
        } else {
            f = 12.0f;
            this.crossfade = true;
            i2 = lineCount;
            i3 = 0;
            i4 = 0;
        }
        if (!this.crossfade && i4 > 0 && i3 > 0) {
            SpannableString spannableString = new SpannableString(charSequence);
            SpannableString spannableString2 = new SpannableString(charSequence);
            float f4 = Float.MAX_VALUE;
            for (int i9 = 0; i9 < i2; i9++) {
                if (isRtlLine(this.layout, i9)) {
                    spannableString.setSpan(new EmptyStubSpan(), this.layout.getLineStart(i9), this.layout.getLineEnd(i9), 0);
                    float lineLeft2 = this.layout.getLineLeft(i9);
                    f4 = lineLeft2 < f4 ? lineLeft2 : f4;
                } else {
                    spannableString2.setSpan(new EmptyStubSpan(), this.layout.getLineStart(i9), this.layout.getLineEnd(i9), 0);
                }
            }
            if (Build.VERSION.SDK_INT >= 24) {
                obtain = StaticLayout.Builder.obtain(spannableString, 0, spannableString.length(), textPaint2, width);
                breakStrategy = obtain.setBreakStrategy(1);
                hyphenationFrequency = breakStrategy.setHyphenationFrequency(0);
                Layout.Alignment alignment4 = Layout.Alignment.ALIGN_NORMAL;
                alignment = hyphenationFrequency.setAlignment(alignment4);
                build = alignment.build();
                this.layout = build;
                obtain2 = StaticLayout.Builder.obtain(spannableString2, 0, spannableString2.length(), textPaint2, width);
                breakStrategy2 = obtain2.setBreakStrategy(1);
                hyphenationFrequency2 = breakStrategy2.setHyphenationFrequency(0);
                alignment2 = hyphenationFrequency2.setAlignment(alignment4);
                build2 = alignment2.build();
                this.rtlLayout = build2;
            } else {
                Layout.Alignment alignment5 = Layout.Alignment.ALIGN_NORMAL;
                TextPaint textPaint3 = textPaint2;
                this.layout = new StaticLayout(spannableString, textPaint3, width, alignment5, 1.0f, 0.0f, false);
                this.rtlLayout = new StaticLayout(spannableString2, textPaint3, width, alignment5, 1.0f, 0.0f, false);
            }
        }
        this.toXOffsetRtl = this.layout.getWidth() - chatMessageCell.getMessageObject().textLayoutBlocks.get(0).textLayout.getWidth();
        try {
            if (this.drawBitmaps) {
                int width2 = this.layout.getWidth();
                int height2 = this.layout.getHeight();
                Bitmap.Config config = Bitmap.Config.ARGB_8888;
                this.textLayoutBitmap = Bitmap.createBitmap(width2, height2, config);
                this.layout.draw(new Canvas(this.textLayoutBitmap));
                StaticLayout staticLayout2 = this.rtlLayout;
                if (staticLayout2 != null) {
                    this.textLayoutBitmapRtl = Bitmap.createBitmap(staticLayout2.getWidth(), this.rtlLayout.getHeight(), config);
                    this.rtlLayout.draw(new Canvas(this.textLayoutBitmapRtl));
                }
                if (this.crossfade) {
                    if (chatMessageCell.getMeasuredHeight() < recyclerListView.getMeasuredHeight()) {
                        this.crossfadeTextOffset = 0.0f;
                        this.crossfadeTextBitmap = Bitmap.createBitmap(chatMessageCell.getMeasuredWidth(), chatMessageCell.getMeasuredHeight(), config);
                    } else {
                        this.crossfadeTextOffset = chatMessageCell.getTop();
                        this.crossfadeTextBitmap = Bitmap.createBitmap(chatMessageCell.getMeasuredWidth(), recyclerListView.getMeasuredHeight(), config);
                    }
                }
            }
        } catch (Exception unused) {
            this.drawBitmaps = false;
        }
        boolean z3 = (chatMessageCell.getMessageObject().getReplyMsgId() == 0 || chatMessageCell.replyNameLayout == null) ? false : true;
        this.hasReply = z3;
        if (z3) {
            SimpleTextView replyNameTextView = chatActivity.getReplyNameTextView();
            ViewPositionWatcher.computeCoordinatesInParent(replyNameTextView, chatActivity.contentView, this.tmpPointF);
            PointF pointF2 = this.tmpPointF;
            this.replyFromStartX = pointF2.x;
            this.replyFromStartY = pointF2.y;
            this.replyFromStartWidth = ((View) replyNameTextView.getParent()).getWidth();
            SimpleTextView replyObjectTextView = chatActivity.getReplyObjectTextView();
            ViewPositionWatcher.computeCoordinatesInParent(replyObjectTextView, chatActivity.contentView, this.tmpPointF);
            this.replyFromObjectStartY = this.tmpPointF.y;
            this.replayFromColor = replyNameTextView.getTextColor();
            this.replayObjectFromColor = replyObjectTextView.getTextColor();
            this.drawableFromTop -= AndroidUtilities.dp(46.0f);
        }
        this.listViewTargetBottomPadding = recyclerListView.getPaddingBottom() - (chatActivity.getInputIslandHeightTarget() - AndroidUtilities.dp(44.0f));
        this.gradientMatrix = new Matrix();
        Paint paint = new Paint(1);
        this.gradientPaint = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        LinearGradient linearGradient = new LinearGradient(0.0f, AndroidUtilities.dp(f), 0.0f, 0.0f, 0, -16777216, Shader.TileMode.CLAMP);
        this.gradientShader = linearGradient;
        this.gradientPaint.setShader(linearGradient);
        this.messageId = chatMessageCell.getMessageObject().stableId;
        chatActivityEnterView.getEditField().setAlpha(0.0f);
        chatActivityEnterView.setTextTransitionIsRunning(true);
        StaticLayout staticLayout3 = chatMessageCell.replyNameLayout;
        if (staticLayout3 != null && staticLayout3.getText().length() > 1 && chatMessageCell.replyNameLayout.getPrimaryHorizontal(0) != 0.0f) {
            this.replyNameDx = chatMessageCell.replyNameLayout.getWidth() - chatMessageCell.replyNameLayout.getLineWidth(0);
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.animator = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.TextMessageEnterTransition$$ExternalSyntheticLambda0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                TextMessageEnterTransition.$r8$lambda$YK_Y1kkCmpvCeJmCqPx7W5SznX0(TextMessageEnterTransition.this, chatActivityEnterView, messageEnterTransitionContainer, valueAnimator);
            }
        });
        this.animator.setInterpolator(new LinearInterpolator());
        this.animator.setDuration(250L);
        messageEnterTransitionContainer.addTransition(this);
        this.notificationsLocker.lock();
        this.animator.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.TextMessageEnterTransition.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                TextMessageEnterTransition.this.notificationsLocker.unlock();
                messageEnterTransitionContainer.removeTransition(TextMessageEnterTransition.this);
                chatMessageCell.setEnterTransitionInProgress(false);
                chatMessageCell.getTransitionParams().lastDrawingBackgroundRect.set(chatMessageCell.getBackgroundDrawableLeft(), chatMessageCell.getBackgroundDrawableTop(), chatMessageCell.getBackgroundDrawableRight(), chatMessageCell.getBackgroundDrawableBottom());
                chatActivityEnterView.setTextTransitionIsRunning(false);
                chatActivityEnterView.getEditField().setAlpha(1.0f);
                chatActivity.getReplyNameTextView().setAlpha(1.0f);
                chatActivity.getReplyObjectTextView().setAlpha(1.0f);
                AnimatedEmojiSpan.release((View) null, TextMessageEnterTransition.this.animatedEmojiStack);
            }
        });
        if (SharedConfig.getDevicePerformanceClass() != 2 || (currentBackgroundDrawable = chatMessageCell.getCurrentBackgroundDrawable(true)) == null) {
            return;
        }
        this.fromMessageDrawable = currentBackgroundDrawable.getTransitionDrawable(getThemedColor(Theme.key_chat_messagePanelBackground));
    }

    public static /* synthetic */ void $r8$lambda$YK_Y1kkCmpvCeJmCqPx7W5SznX0(TextMessageEnterTransition textMessageEnterTransition, ChatActivityEnterView chatActivityEnterView, MessageEnterTransitionContainer messageEnterTransitionContainer, ValueAnimator valueAnimator) {
        textMessageEnterTransition.getClass();
        textMessageEnterTransition.progress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        chatActivityEnterView.getEditField().setAlpha(textMessageEnterTransition.progress);
        messageEnterTransitionContainer.invalidate();
    }

    public void start() {
        ValueAnimator valueAnimator = this.animator;
        if (valueAnimator != null) {
            valueAnimator.start();
        }
    }

    private boolean isRtlLine(Layout layout, int i) {
        return layout.getLineRight(i) == ((float) layout.getWidth()) && layout.getLineLeft(i) != 0.0f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:241:0x0419, code lost:
    
        if (android.text.TextUtils.isEmpty(r3.caption) != false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x0435, code lost:
    
        if ((org.telegram.messenger.MessageObject.getMedia(r45.currentMessageObject.replyMessageObject.messageOwner) instanceof org.telegram.tgnet.TLRPC.TL_messageMediaInvoice) != false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x0481, code lost:
    
        if (android.text.TextUtils.isEmpty(r4.caption) != false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x049d, code lost:
    
        if ((org.telegram.messenger.MessageObject.getMedia(r45.currentMessageObject.replyMessageObject.messageOwner) instanceof org.telegram.tgnet.TLRPC.TL_messageMediaInvoice) != false) goto L109;
     */
    @Override // org.telegram.ui.MessageEnterTransitionContainer.Transition
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onDraw(Canvas canvas) {
        int i;
        float f;
        float f2;
        float f3;
        Canvas canvas2;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        int i2;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        int themedColor;
        int themedColor2;
        float f16;
        float f17;
        float f18;
        StaticLayout staticLayout;
        float f19;
        float f20;
        Drawable drawable;
        if (this.drawBitmaps && !this.initBitmaps && this.crossfadeTextBitmap != null && this.messageView.getTransitionParams().wasDraw) {
            this.initBitmaps = true;
            Canvas canvas3 = new Canvas(this.crossfadeTextBitmap);
            canvas3.translate(0.0f, this.crossfadeTextOffset);
            AnimatedEmojiSpan.EmojiGroupedSpans emojiGroupedSpans = this.messageView.animatedEmojiStack;
            if (emojiGroupedSpans != null) {
                emojiGroupedSpans.clearPositions();
            }
            ChatMessageCell chatMessageCell = this.messageView;
            chatMessageCell.drawMessageText(canvas3, chatMessageCell.getMessageObject().textLayoutBlocks, true, 1.0f, true);
            this.messageView.drawAnimatedEmojis(canvas3, 1.0f);
        }
        float y = (this.listView.getY() - this.container.getY()) + this.listView.getMeasuredHeight();
        float x = this.fromStartX - this.container.getX();
        float y2 = this.fromStartY - this.container.getY();
        this.textX = this.messageView.getTextX();
        this.textY = this.messageView.getTextY();
        if (this.messageView.getMessageObject().stableId != this.messageId) {
            return;
        }
        float x2 = (this.messageView.getX() + this.listView.getX()) - this.container.getX();
        float top = (((this.messageView.getTop() + this.messageView.getPaddingTop()) + this.listView.getTop()) - this.container.getY()) - (this.listViewTargetBottomPadding - this.listView.getPaddingBottom());
        this.lastMessageX = x2;
        this.lastMessageY = top;
        float interpolation = ChatListItemAnimator.DEFAULT_INTERPOLATOR.getInterpolation(this.progress);
        float f21 = this.progress;
        float f22 = f21 > 0.4f ? 1.0f : f21 / 0.4f;
        float interpolation2 = CubicBezierInterpolator.EASE_OUT.getInterpolation(CubicBezierInterpolator.EASE_OUT_QUINT.getInterpolation(f21));
        float f23 = x2 + this.textX;
        float f24 = top + this.textY;
        float f25 = 1.0f - interpolation2;
        int measuredHeight = (int) ((this.container.getMeasuredHeight() * f25) + (y * interpolation2));
        boolean z = this.messageView.getBottom() - AndroidUtilities.dp(4.0f) > this.listView.getMeasuredHeight() && (((float) this.messageView.getMeasuredHeight()) + top) - ((float) AndroidUtilities.dp(8.0f)) > ((float) measuredHeight) && this.container.getMeasuredHeight() > 0;
        if (z) {
            i = measuredHeight;
            f2 = f22;
            f = interpolation2;
            f3 = 1.0f;
            canvas2 = canvas;
            canvas2.saveLayerAlpha(0.0f, Math.max(0.0f, top), this.container.getMeasuredWidth(), this.container.getMeasuredHeight(), NotificationCenter.didReceiveSmsCode, 31);
        } else {
            i = measuredHeight;
            f = interpolation2;
            f2 = f22;
            f3 = 1.0f;
            canvas2 = canvas;
        }
        canvas2.save();
        canvas2.clipRect(0.0f, ((this.listView.getY() + this.chatActivity.getChatListViewPadding()) - this.container.getY()) - AndroidUtilities.dp(3.0f), this.container.getMeasuredWidth(), this.container.getMeasuredHeight());
        canvas2.save();
        float backgroundDrawableLeft = this.messageView.getBackgroundDrawableLeft() + x2 + ((x - (f23 - this.toXOffset)) * f25);
        float backgroundDrawableTop = this.messageView.getBackgroundDrawableTop() + top;
        float f26 = f3 - interpolation;
        float y3 = ((this.drawableFromTop - this.container.getY()) * f26) + (backgroundDrawableTop * interpolation);
        float backgroundDrawableBottom = ((backgroundDrawableTop + (this.messageView.getBackgroundDrawableBottom() - this.messageView.getBackgroundDrawableTop())) * interpolation) + ((this.drawableFromBottom - this.container.getY()) * f26);
        int backgroundDrawableRight = (int) (this.messageView.getBackgroundDrawableRight() + x2 + (AndroidUtilities.dp(4.0f) * f25));
        MessageDrawable currentBackgroundDrawable = !this.currentMessageObject.isAnimatedEmojiStickers() ? this.messageView.getCurrentBackgroundDrawable(true) : null;
        if (currentBackgroundDrawable != null) {
            this.messageView.setBackgroundTopY(this.container.getTop() - this.listView.getTop());
            Drawable shadowDrawable = currentBackgroundDrawable.getShadowDrawable();
            if (f2 == f3 || (drawable = this.fromMessageDrawable) == null) {
                f4 = x;
                f5 = y2;
            } else {
                f4 = x;
                f5 = y2;
                drawable.setBounds((int) backgroundDrawableLeft, (int) y3, backgroundDrawableRight, (int) backgroundDrawableBottom);
                this.fromMessageDrawable.draw(canvas2);
            }
            f6 = f;
            if (shadowDrawable != null) {
                shadowDrawable.setAlpha((int) (f6 * 255.0f));
                shadowDrawable.setBounds((int) backgroundDrawableLeft, (int) y3, backgroundDrawableRight, (int) backgroundDrawableBottom);
                shadowDrawable.draw(canvas2);
                shadowDrawable.setAlpha(NotificationCenter.didReceiveSmsCode);
            }
            currentBackgroundDrawable.setAlpha((int) (f2 * 255.0f));
            currentBackgroundDrawable.setBounds((int) backgroundDrawableLeft, (int) y3, backgroundDrawableRight, (int) backgroundDrawableBottom);
            currentBackgroundDrawable.setDrawFullBubble(true);
            currentBackgroundDrawable.draw(canvas2);
            currentBackgroundDrawable.setDrawFullBubble(false);
            currentBackgroundDrawable.setAlpha(NotificationCenter.didReceiveSmsCode);
        } else {
            f4 = x;
            f5 = y2;
            f6 = f;
        }
        canvas2.restore();
        canvas2.save();
        if (currentBackgroundDrawable != null) {
            if (this.currentMessageObject.isOutOwner()) {
                canvas2.clipRect(AndroidUtilities.dp(4.0f) + backgroundDrawableLeft, AndroidUtilities.dp(4.0f) + y3, backgroundDrawableRight - AndroidUtilities.dp(10.0f), backgroundDrawableBottom - AndroidUtilities.dp(4.0f));
            } else {
                canvas2.clipRect(AndroidUtilities.dp(4.0f) + backgroundDrawableLeft, AndroidUtilities.dp(4.0f) + y3, backgroundDrawableRight - AndroidUtilities.dp(4.0f), backgroundDrawableBottom - AndroidUtilities.dp(4.0f));
            }
        }
        float f27 = ((f5 - f24) * f26) + top;
        canvas2.translate((this.messageView.getLeft() + this.listView.getX()) - this.container.getX(), f27);
        this.messageView.drawTime(canvas2, f2, false);
        this.messageView.drawNamesLayout(canvas2, f2);
        this.messageView.drawCommentButton(canvas2, f2);
        this.messageView.drawCaptionLayout(canvas2, false, f2);
        this.messageView.drawReactionsLayout(canvas2, f2, null);
        this.messageView.drawCommentLayout(canvas2, f2);
        this.messageView.drawLinkPreview(canvas2, f2);
        canvas2.restore();
        if (this.hasReply) {
            this.chatActivity.getReplyNameTextView().setAlpha(0.0f);
            this.chatActivity.getReplyObjectTextView().setAlpha(0.0f);
            AndroidUtilities.lerp(AndroidUtilities.dp(35.0f), this.messageView.replyHeight, f6);
            int dp = AndroidUtilities.dp(10.0f);
            float x3 = this.replyFromStartX - this.container.getX();
            float y4 = this.replyFromStartY - this.container.getY();
            ChatMessageCell chatMessageCell2 = this.messageView;
            float f28 = chatMessageCell2.replyStartX + x2;
            f7 = backgroundDrawableBottom;
            float f29 = top + chatMessageCell2.replyStartY;
            if (chatMessageCell2.replyLine == null) {
                chatMessageCell2.replyLine = new ReplyMessageLine(chatMessageCell2);
            }
            ChatMessageCell chatMessageCell3 = this.messageView;
            chatMessageCell3.replyLine.check(chatMessageCell3.getMessageObject(), this.messageView.getCurrentUser(), this.messageView.getCurrentChat(), this.resourcesProvider, 0);
            if (this.currentMessageObject.shouldDrawWithoutBackground()) {
                themedColor = getThemedColor(Theme.key_chat_stickerReplyNameText);
                getThemedColor(Theme.key_chat_stickerReplyLine);
            } else {
                ReplyMessageLine replyMessageLine = this.messageView.replyLine;
                if (replyMessageLine != null) {
                    themedColor = replyMessageLine.nameColorAnimated.get();
                    this.messageView.replyLine.getColor();
                } else if (this.currentMessageObject.isOutOwner()) {
                    themedColor = getThemedColor(Theme.key_chat_outReplyNameText);
                    getThemedColor(Theme.key_chat_outReplyLine);
                } else {
                    themedColor = getThemedColor(Theme.key_chat_inReplyNameText);
                    getThemedColor(Theme.key_chat_inReplyLine);
                }
            }
            if (!this.currentMessageObject.shouldDrawWithoutBackground()) {
                if (this.currentMessageObject.isOutOwner()) {
                    if (this.currentMessageObject.isReplyToStory()) {
                        f8 = y3;
                        i2 = backgroundDrawableRight;
                        themedColor2 = themedColor;
                    } else {
                        int themedColor3 = getThemedColor(Theme.key_chat_outReplyMessageText);
                        f8 = y3;
                        MessageObject messageObject = this.currentMessageObject;
                        i2 = backgroundDrawableRight;
                        if (!messageObject.forceAvatar) {
                            if (messageObject.hasValidReplyMessageObject()) {
                                MessageObject messageObject2 = this.currentMessageObject.replyMessageObject;
                                if (messageObject2.type != 0) {
                                }
                                if (!(MessageObject.getMedia(this.currentMessageObject.replyMessageObject.messageOwner) instanceof TLRPC.TL_messageMediaGame)) {
                                }
                            }
                            if (!this.messageView.isReplyQuote) {
                                themedColor3 = getThemedColor(Theme.key_chat_outReplyMediaMessageText);
                                f20 = 0.6f;
                                themedColor2 = ColorUtils.blendARGB(themedColor3, Theme.adaptHue(themedColor3, themedColor), f20);
                            }
                        }
                        f20 = 0.0f;
                        themedColor2 = ColorUtils.blendARGB(themedColor3, Theme.adaptHue(themedColor3, themedColor), f20);
                    }
                } else {
                    f8 = y3;
                    i2 = backgroundDrawableRight;
                    if (!this.currentMessageObject.isReplyToStory()) {
                        int themedColor4 = getThemedColor(Theme.key_chat_inReplyMessageText);
                        MessageObject messageObject3 = this.currentMessageObject;
                        if (!messageObject3.forceAvatar) {
                            if (messageObject3.hasValidReplyMessageObject()) {
                                MessageObject messageObject4 = this.currentMessageObject.replyMessageObject;
                                if (messageObject4.type != 0) {
                                }
                                if (!(MessageObject.getMedia(this.currentMessageObject.replyMessageObject.messageOwner) instanceof TLRPC.TL_messageMediaGame)) {
                                }
                            }
                            if (!this.messageView.isReplyQuote) {
                                themedColor4 = getThemedColor(Theme.key_chat_inReplyMediaMessageText);
                                f19 = 0.6f;
                                themedColor2 = ColorUtils.blendARGB(themedColor4, Theme.adaptHue(themedColor4, themedColor), f19);
                            }
                        }
                        f19 = 0.0f;
                        themedColor2 = ColorUtils.blendARGB(themedColor4, Theme.adaptHue(themedColor4, themedColor), f19);
                    }
                    themedColor2 = themedColor;
                }
            } else {
                f8 = y3;
                i2 = backgroundDrawableRight;
                ReplyMessageLine replyMessageLine2 = this.messageView.replyLine;
                if (replyMessageLine2 != null) {
                    themedColor2 = replyMessageLine2.nameColorAnimated.get();
                } else {
                    if (this.currentMessageObject.hasValidReplyMessageObject()) {
                        MessageObject messageObject5 = this.currentMessageObject.replyMessageObject;
                        if (messageObject5.type == 0 || !TextUtils.isEmpty(messageObject5.caption)) {
                            TLRPC.MessageMedia messageMedia = this.currentMessageObject.replyMessageObject.messageOwner.media;
                            if (!(messageMedia instanceof TLRPC.TL_messageMediaGame) && !(messageMedia instanceof TLRPC.TL_messageMediaInvoice)) {
                                themedColor2 = getThemedColor(Theme.key_chat_outReplyMessageText);
                            }
                        }
                    }
                    themedColor2 = getThemedColor(Theme.key_chat_outReplyMediaMessageText);
                }
            }
            Theme.chat_replyTextPaint.setColor(ColorUtils.blendARGB(this.replayObjectFromColor, themedColor2, interpolation));
            Theme.chat_replyNamePaint.setColor(ColorUtils.blendARGB(this.replayFromColor, themedColor, interpolation));
            if (this.messageView.needReplyImage) {
                x3 -= AndroidUtilities.dp(44.0f);
            }
            float f30 = x3;
            float lerp = AndroidUtilities.lerp(f30, f28, f6);
            float lerp2 = AndroidUtilities.lerp((AndroidUtilities.dp(12.0f) * interpolation) + y4, f29, interpolation);
            if (this.roundRectRadii == null) {
                this.roundRectRadii = new float[]{r4, r4, 0.0f, 0.0f, 0.0f, 0.0f, r4, r4};
                float dp2 = AndroidUtilities.dp(4.0f);
                float[] fArr = this.roundRectRadii;
                fArr[5] = 0.0f;
                fArr[4] = 0.0f;
                fArr[3] = 0.0f;
                fArr[2] = 0.0f;
            }
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(f30, y4, this.replyFromStartWidth + f30, AndroidUtilities.dp(35.0f) + y4);
            rectF.offset(0.0f, AndroidUtilities.dp(12.0f) * interpolation);
            this.messageReplySelectorRect.set(this.messageView.replySelectorRect);
            this.messageReplySelectorRect.offset(x2, f27);
            AndroidUtilities.lerp(rectF, this.messageReplySelectorRect, f6, this.replySelectorRect);
            ChatMessageCell chatMessageCell4 = this.messageView;
            float f31 = f2;
            chatMessageCell4.replyLine.drawBackground(canvas, this.replySelectorRect, f31, chatMessageCell4.isReplyQuote, chatMessageCell4.getMessageObject().shouldDrawWithoutBackground());
            canvas2 = canvas;
            this.messageView.replyLine.drawLine(canvas2, this.replySelectorRect, f31);
            if (this.messageView.needReplyImage) {
                canvas2.save();
                float lerp3 = AndroidUtilities.lerp(AndroidUtilities.dp(35.0f), Math.min(this.replySelectorRect.height() - AndroidUtilities.dp(10.0f), AndroidUtilities.dp(this.messageView.isReplyQuote ? 3.0f : 7.0f) + Theme.chat_replyNamePaint.getTextSize() + Theme.chat_replyTextPaint.getTextSize()), f6);
                ImageReceiver imageReceiver = this.messageView.replyImageReceiver;
                float lerp4 = AndroidUtilities.lerp(lerp, this.replySelectorRect.left + AndroidUtilities.dp(8.0f), f6);
                float f32 = this.replySelectorRect.top;
                ChatMessageCell chatMessageCell5 = this.messageView;
                f16 = f31;
                imageReceiver.setImageCoords(lerp4, AndroidUtilities.lerp(lerp2, f32 + AndroidUtilities.dp(((!chatMessageCell5.isReplyQuote || (staticLayout = chatMessageCell5.replyTextLayout) == null || staticLayout.getLineCount() > 1) ? 0 : 2) + 5), f6), lerp3, lerp3);
                this.messageView.replyImageReceiver.draw(canvas2);
                canvas2.restore();
                f17 = lerp3;
            } else {
                f16 = f31;
                f17 = 0.0f;
            }
            canvas2.save();
            float f33 = dp * f6;
            canvas2.translate(f33, 0.0f);
            MessageObject messageObject6 = this.currentMessageObject;
            float f34 = -((messageObject6 == null || !messageObject6.shouldDrawWithoutBackground()) ? AndroidUtilities.dp(f3) : AndroidUtilities.dp(6.0f));
            MessageObject messageObject7 = this.currentMessageObject;
            float dp3 = (messageObject7 == null || !messageObject7.shouldDrawWithoutBackground()) ? AndroidUtilities.dp(3.0f) : AndroidUtilities.dp(f3);
            float f35 = this.messageView.replyTextOffset;
            float f36 = (f28 - f35) + f34;
            float f37 = (f28 - this.replyNameDx) + f34;
            AndroidUtilities.lerp(f30 - f35, f36, f6);
            float lerp5 = AndroidUtilities.lerp(f30, f37, f6) + (this.messageView.needReplyImage ? AndroidUtilities.dp(3.0f) + f17 : 0.0f);
            if (this.messageView.replyNameLayout != null) {
                canvas2.save();
                canvas2.translate(lerp5, (dp3 * f6) + lerp2);
                int alpha = Theme.chat_replyNamePaint.getAlpha();
                Theme.chat_replyNamePaint.setAlpha((int) (alpha * f6));
                this.messageView.replyNameLayout.draw(canvas2);
                Theme.chat_replyNamePaint.setAlpha(alpha);
                SimpleTextView replyNameTextView = this.chatActivity.getReplyNameTextView();
                f9 = backgroundDrawableLeft;
                f18 = f36;
                f10 = f16;
                canvas2.saveLayerAlpha(0.0f, 0.0f, replyNameTextView.getWidth(), replyNameTextView.getHeight(), (int) (f25 * 255.0f), 31);
                replyNameTextView.setAlpha(1.0f);
                replyNameTextView.draw(canvas2);
                replyNameTextView.setAlpha(0.0f);
                canvas2.restore();
                canvas2.restore();
            } else {
                f18 = f36;
                f9 = backgroundDrawableLeft;
                f10 = f16;
            }
            ChatMessageCell chatMessageCell6 = this.messageView;
            if (chatMessageCell6.isReplyQuote && chatMessageCell6.replyQuoteDrawable != null) {
                int color = chatMessageCell6.replyLine.getColor();
                ChatMessageCell chatMessageCell7 = this.messageView;
                if (color != chatMessageCell7.replyQuoteDrawableColor) {
                    Drawable drawable2 = chatMessageCell7.replyQuoteDrawable;
                    ChatMessageCell chatMessageCell8 = this.messageView;
                    int color2 = chatMessageCell8.replyLine.getColor();
                    chatMessageCell8.replyQuoteDrawableColor = color2;
                    drawable2.setColorFilter(new PorterDuffColorFilter(color2, PorterDuff.Mode.SRC_IN));
                }
                ChatMessageCell chatMessageCell9 = this.messageView;
                chatMessageCell9.replyQuoteDrawable.setBounds((int) (((this.replySelectorRect.right - f33) - AndroidUtilities.dp((!chatMessageCell9.drawPinnedTop ? 1 : 0) + 2)) - this.messageView.replyQuoteDrawable.getIntrinsicWidth()), (int) (this.replySelectorRect.top + AndroidUtilities.dp((!this.messageView.drawPinnedTop ? 1 : 0) + 2)), (int) ((this.replySelectorRect.right - f33) - AndroidUtilities.dp((!this.messageView.drawPinnedTop ? 1 : 0) + 2)), (int) (this.replySelectorRect.top + AndroidUtilities.dp((!this.messageView.drawPinnedTop ? 1 : 0) + 2) + this.messageView.replyQuoteDrawable.getIntrinsicHeight()));
                this.messageView.replyQuoteDrawable.setAlpha((int) (f6 * 255.0f));
                this.messageView.replyQuoteDrawable.draw(canvas2);
            }
            if (this.messageView.replyTextLayout != null) {
                canvas2.save();
                float lerp6 = lerp2 + AndroidUtilities.lerp(AndroidUtilities.dp(19.0f), Theme.chat_replyNamePaint.getTextSize() + AndroidUtilities.dp(4.0f) + dp3, f6);
                ChatMessageCell chatMessageCell10 = this.messageView;
                float dp4 = (chatMessageCell10.isReplyQuote && chatMessageCell10.needReplyImage) ? f18 - AndroidUtilities.dp(2.0f) : f18;
                ChatMessageCell chatMessageCell11 = this.messageView;
                if (chatMessageCell11.needReplyImage && (!chatMessageCell11.isReplyQuote || chatMessageCell11.replyTextRTL)) {
                    dp4 += f17 + AndroidUtilities.dp(3.0f);
                }
                ChatMessageCell chatMessageCell12 = this.messageView;
                if (chatMessageCell12.isReplyTaskOrPollOption && chatMessageCell12.replyTaskCheckbox != null) {
                    float lerp7 = AndroidUtilities.lerp(f30 - chatMessageCell12.replyTextOffset, dp4, f6);
                    this.messageView.replyTaskCheckbox.setBounds((int) lerp7, ((int) lerp6) + AndroidUtilities.dp(2.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
                    Theme.chat_instantViewRectPaint.setColor(getThemedColor(this.currentMessageObject.isOutOwner() ? Theme.key_chat_outMenu : Theme.key_chat_inMenu));
                    canvas2.drawCircle(lerp7 + AndroidUtilities.dp(6.0f), AndroidUtilities.dp(8.0f) + lerp6, AndroidUtilities.dp(5.0f), Theme.chat_instantViewRectPaint);
                    this.messageView.replyTaskCheckbox.setColor(-1, this.currentMessageObject.isOutOwner() ? Theme.key_chat_outAudioSeekbarFill : Theme.key_chat_inAudioSeekbarFill, Theme.key_checkboxCheck);
                    this.messageView.replyTaskCheckbox.setAlpha(interpolation);
                    this.messageView.replyTaskCheckbox.draw(canvas2);
                }
                if (this.messageView.isReplyTaskOrPollOption) {
                    dp4 += AndroidUtilities.dp(16.0f);
                }
                ChatMessageCell chatMessageCell13 = this.messageView;
                if (chatMessageCell13.replyTextRTL && chatMessageCell13.replyTextOffset > 0) {
                    dp4 = ((this.replySelectorRect.right - AndroidUtilities.dp(8.0f)) - this.messageView.replyTextLayout.getWidth()) - f33;
                }
                canvas2.translate(AndroidUtilities.lerp(f30 - this.messageView.replyTextOffset, dp4, f6), lerp6);
                canvas2.save();
                SpoilerEffect.clipOutCanvas(canvas2, this.messageView.replySpoilers);
                ChatMessageCell chatMessageCell14 = this.messageView;
                AnimatedEmojiSpan.drawAnimatedEmojis(canvas2, chatMessageCell14.replyTextLayout, chatMessageCell14.animatedEmojiReplyStack, 0.0f, chatMessageCell14.replySpoilers, 0.0f, 0.0f, 0.0f, 1.0f);
                this.messageView.replyTextLayout.draw(canvas2);
                canvas2.restore();
                for (SpoilerEffect spoilerEffect : this.messageView.replySpoilers) {
                    if (spoilerEffect.shouldInvalidateColor()) {
                        spoilerEffect.setColor(this.messageView.replyTextLayout.getPaint().getColor());
                    }
                    spoilerEffect.draw(canvas2);
                }
                canvas2.restore();
            }
            canvas2.restore();
        } else {
            f7 = backgroundDrawableBottom;
            f8 = y3;
            i2 = backgroundDrawableRight;
            f9 = backgroundDrawableLeft;
            f10 = f2;
        }
        canvas2.save();
        if (this.messageView.getMessageObject() == null || this.messageView.getMessageObject().type != 19) {
            canvas2.clipRect(f9 + AndroidUtilities.dp(4.0f), f8 + AndroidUtilities.dp(4.0f), i2 - AndroidUtilities.dp(4.0f), f7 - AndroidUtilities.dp(4.0f));
        }
        float f38 = f6 + (this.scaleFrom * f25);
        float f39 = this.drawBitmaps ? (this.scaleY * f25) + f6 : 1.0f;
        canvas2.save();
        float f40 = f4 * f25;
        float f41 = f5 * f26;
        canvas2.translate(((f23 - this.toXOffset) * f6) + f40, ((f24 + this.textLayoutBlock.textYOffset(this.messageView.getMessageObject().textLayoutBlocks, this.messageView.transitionParams)) * interpolation) + f41);
        float f42 = f38 * f39;
        canvas2.scale(f38, f42, 0.0f, 0.0f);
        if (this.drawBitmaps) {
            if (this.crossfade) {
                f15 = f10;
                this.bitmapPaint.setAlpha((int) ((1.0f - f15) * 255.0f));
            } else {
                f15 = f10;
            }
            canvas2.drawBitmap(this.textLayoutBitmap, 0.0f, 0.0f, this.bitmapPaint);
            f11 = f6;
            f12 = f40;
            f13 = f42;
            f14 = f15;
        } else {
            float f43 = f10;
            boolean z2 = this.crossfade;
            if (z2 && this.changeColor) {
                int color3 = this.layout.getPaint().getColor();
                this.layout.getPaint().setColor(ColorUtils.blendARGB(this.fromColor, this.toColor, f43));
                float f44 = 1.0f - f43;
                canvas2.saveLayerAlpha(0.0f, 0.0f, this.layout.getWidth(), this.layout.getHeight(), (int) (f44 * 255.0f), 31);
                this.layout.draw(canvas2);
                f12 = f40;
                f13 = f42;
                f11 = f6;
                f14 = f43;
                AnimatedEmojiSpan.drawAnimatedEmojis(canvas2, this.layout, this.animatedEmojiStack, 0.0f, null, 0.0f, 0.0f, 0.0f, f44);
                this.layout.getPaint().setColor(color3);
                canvas.restore();
                canvas2 = canvas;
            } else {
                f11 = f6;
                f12 = f40;
                f13 = f42;
                f14 = f43;
                if (z2) {
                    float f45 = 1.0f - f14;
                    canvas2 = canvas;
                    canvas2.saveLayerAlpha(0.0f, 0.0f, this.layout.getWidth(), this.layout.getHeight(), (int) (f45 * 255.0f), 31);
                    this.layout.draw(canvas2);
                    AnimatedEmojiSpan.drawAnimatedEmojis(canvas2, this.layout, this.animatedEmojiStack, 0.0f, null, 0.0f, 0.0f, 0.0f, f45);
                    canvas2.restore();
                } else {
                    canvas2 = canvas;
                    this.layout.draw(canvas2);
                    AnimatedEmojiSpan.drawAnimatedEmojis(canvas2, this.layout, this.animatedEmojiStack, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f);
                }
            }
        }
        canvas2.restore();
        if (this.rtlLayout != null) {
            canvas2.save();
            canvas2.translate(f12 + ((f23 - this.toXOffsetRtl) * f11), f41 + ((f24 + this.textLayoutBlock.textYOffset(this.messageView.getMessageObject().textLayoutBlocks, this.messageView.transitionParams)) * interpolation));
            canvas2.scale(f38, f13, 0.0f, 0.0f);
            if (this.drawBitmaps) {
                if (this.crossfade) {
                    this.bitmapPaint.setAlpha((int) ((1.0f - f14) * 255.0f));
                }
                canvas2.drawBitmap(this.textLayoutBitmapRtl, 0.0f, 0.0f, this.bitmapPaint);
            } else {
                boolean z3 = this.crossfade;
                if (z3 && this.changeColor) {
                    int color4 = this.rtlLayout.getPaint().getColor();
                    this.rtlLayout.getPaint().setColor(ColorUtils.setAlphaComponent(ColorUtils.blendARGB(this.fromColor, this.toColor, f14), (int) (Color.alpha(color4) * (1.0f - f14))));
                    this.rtlLayout.draw(canvas2);
                    this.rtlLayout.getPaint().setColor(color4);
                } else if (z3) {
                    int alpha2 = this.rtlLayout.getPaint().getAlpha();
                    this.rtlLayout.getPaint().setAlpha((int) (alpha2 * (1.0f - f14)));
                    this.rtlLayout.draw(canvas2);
                    this.rtlLayout.getPaint().setAlpha(alpha2);
                } else {
                    this.rtlLayout.draw(canvas2);
                }
            }
            canvas2.restore();
        }
        if (this.crossfade) {
            canvas2.save();
            canvas2.translate(((this.messageView.getLeft() + this.listView.getX()) - this.container.getX()) + ((f4 - f23) * f25), f27);
            canvas2.scale(f38, f13, this.messageView.getTextX(), this.messageView.getTextY());
            canvas2.translate(0.0f, -this.crossfadeTextOffset);
            if (this.crossfadeTextBitmap != null) {
                this.bitmapPaint.setAlpha((int) (f14 * 255.0f));
                canvas2.drawBitmap(this.crossfadeTextBitmap, 0.0f, 0.0f, this.bitmapPaint);
            } else {
                int color5 = Theme.chat_msgTextPaint.getColor();
                Theme.chat_msgTextPaint.setColor(this.toColor);
                ChatMessageCell chatMessageCell15 = this.messageView;
                float f46 = f14;
                chatMessageCell15.drawMessageText(canvas, chatMessageCell15.getMessageObject().textLayoutBlocks, true, f46, true);
                canvas2 = canvas;
                this.messageView.drawAnimatedEmojis(canvas2, f46);
                if (Theme.chat_msgTextPaint.getColor() != color5) {
                    Theme.chat_msgTextPaint.setColor(color5);
                }
            }
            canvas2.restore();
        }
        canvas2.restore();
        if (z) {
            float f47 = i;
            this.gradientMatrix.setTranslate(0.0f, f47);
            this.gradientShader.setLocalMatrix(this.gradientMatrix);
            canvas2.drawRect(0.0f, f47, this.container.getMeasuredWidth(), this.container.getMeasuredHeight(), this.gradientPaint);
            canvas2.restore();
        }
        float f48 = this.progress;
        float f49 = f48 > 0.4f ? 1.0f : f48 / 0.4f;
        if (f49 == 1.0f) {
            this.enterView.setTextTransitionIsRunning(false);
        }
        if (this.enterView.getSendButton().getVisibility() != 0 || f49 >= 1.0f) {
            return;
        }
        ViewPositionWatcher.computeCoordinatesInParent(this.enterView.getSendButton(), this.chatActivity.contentView, this.tmpPointF);
        canvas2.save();
        canvas2.translate(this.tmpPointF.x - this.container.getX(), this.tmpPointF.y - this.container.getY());
        View sendButton = this.enterView.getSendButton();
        canvas2.saveLayerAlpha(0.0f, 0.0f, sendButton.getWidth(), sendButton.getHeight(), (int) ((1.0f - f49) * 255.0f));
        sendButton.draw(canvas2);
        canvas2.restore();
        canvas2.restore();
        canvas2.restore();
    }

    private int getThemedColor(int i) {
        return Theme.getColor(i, this.resourcesProvider);
    }
}
