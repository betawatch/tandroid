package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.CharacterStyle;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.Forum.ForumUtilities;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Components.Premium.boosts.BoostRepository;
import org.telegram.ui.PaymentFormActivity;

/* loaded from: classes5.dex */
public class UndoView extends FrameLayout {
    public static int ACTION_RINGTONE_ADDED = 83;
    private float additionalTranslationY;
    private BackupImageView avatarImageView;
    Drawable backgroundDrawable;
    private int currentAccount;
    private int currentAction;
    private Runnable currentActionRunnable;
    private Runnable currentCancelRunnable;
    private ArrayList currentDialogIds;
    private Object currentInfoObject;
    private Object currentInfoObject2;
    float enterOffset;
    private int enterOffsetMargin;
    private boolean fromTop;
    private int hideAnimationType;
    private CharSequence infoText;
    private LinkSpanDrawable.LinksTextView infoTextView;
    private int infoTextViewEmojiCacheType;
    private boolean isShown;
    private long lastUpdateTime;
    private RLottieImageView leftImageView;
    private BaseFragment parentFragment;
    private int prevSeconds;
    private Paint progressPaint;
    private RectF rect;
    private final Theme.ResourcesProvider resourcesProvider;
    private TextView subinfoTextView;
    private TextPaint textPaint;
    private int textWidth;
    int textWidthOut;
    StaticLayout timeLayout;
    StaticLayout timeLayoutOut;
    private long timeLeft;
    private String timeLeftString;
    float timeReplaceProgress;
    private LinearLayout undoButton;
    private ImageView undoImageView;
    private TextView undoTextView;
    private int undoViewHeight;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$new$1(View view, MotionEvent motionEvent) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$showWithAction$3(View view, MotionEvent motionEvent) {
        return true;
    }

    protected boolean canUndo() {
        return true;
    }

    public void didPressUrl(CharacterStyle characterStyle) {
    }

    protected void onRemoveDialogAction(long j, int i) {
    }

    public class LinkMovementMethodMy extends LinkMovementMethod {
        public LinkMovementMethodMy() {
        }

        @Override // android.text.method.LinkMovementMethod, android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
        public boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
            CharacterStyle[] characterStyleArr;
            try {
                if (motionEvent.getAction() != 0 || ((characterStyleArr = (CharacterStyle[]) spannable.getSpans(textView.getSelectionStart(), textView.getSelectionEnd(), CharacterStyle.class)) != null && characterStyleArr.length != 0)) {
                    if (motionEvent.getAction() == 1) {
                        CharacterStyle[] characterStyleArr2 = (CharacterStyle[]) spannable.getSpans(textView.getSelectionStart(), textView.getSelectionEnd(), CharacterStyle.class);
                        if (characterStyleArr2 != null && characterStyleArr2.length > 0) {
                            UndoView.this.didPressUrl(characterStyleArr2[0]);
                        }
                        Selection.removeSelection(spannable);
                        return true;
                    }
                    return super.onTouchEvent(textView, spannable, motionEvent);
                }
                return false;
            } catch (Exception e) {
                FileLog.e(e);
                return false;
            }
        }
    }

    public UndoView(Context context) {
        this(context, null, false, null);
    }

    public UndoView(Context context, BaseFragment baseFragment) {
        this(context, baseFragment, false, null);
    }

    public UndoView(Context context, BaseFragment baseFragment, boolean z, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.infoTextViewEmojiCacheType = 0;
        this.currentAccount = UserConfig.selectedAccount;
        this.currentAction = -1;
        this.hideAnimationType = 1;
        this.enterOffsetMargin = AndroidUtilities.dp(8.0f);
        this.timeReplaceProgress = 1.0f;
        this.resourcesProvider = resourcesProvider;
        this.parentFragment = baseFragment;
        this.fromTop = z;
        LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(context, resourcesProvider) { // from class: org.telegram.ui.Components.UndoView.1
            @Override // org.telegram.ui.Components.LinkSpanDrawable.LinksTextView
            protected int emojiCacheType() {
                return UndoView.this.infoTextViewEmojiCacheType;
            }
        };
        this.infoTextView = linksTextView;
        linksTextView.setTextSize(1, 15.0f);
        LinkSpanDrawable.LinksTextView linksTextView2 = this.infoTextView;
        int i = Theme.key_undo_infoColor;
        linksTextView2.setTextColor(getThemedColor(i));
        LinkSpanDrawable.LinksTextView linksTextView3 = this.infoTextView;
        int i2 = Theme.key_undo_cancelColor;
        linksTextView3.setLinkTextColor(getThemedColor(i2));
        this.infoTextView.setMovementMethod(new LinkMovementMethodMy());
        addView(this.infoTextView, LayoutHelper.createFrame(-2, -2.0f, 51, 45.0f, 13.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.subinfoTextView = textView;
        textView.setTextSize(1, 13.0f);
        this.subinfoTextView.setTextColor(getThemedColor(i));
        this.subinfoTextView.setLinkTextColor(getThemedColor(i2));
        this.subinfoTextView.setHighlightColor(0);
        this.subinfoTextView.setSingleLine(true);
        this.subinfoTextView.setEllipsize(TextUtils.TruncateAt.END);
        this.subinfoTextView.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
        addView(this.subinfoTextView, LayoutHelper.createFrame(-2, -2.0f, 51, 58.0f, 27.0f, 8.0f, 0.0f));
        RLottieImageView rLottieImageView = new RLottieImageView(context);
        this.leftImageView = rLottieImageView;
        rLottieImageView.setScaleType(ImageView.ScaleType.CENTER);
        RLottieImageView rLottieImageView2 = this.leftImageView;
        int i3 = Theme.key_undo_background;
        rLottieImageView2.setLayerColor("info1", getThemedColor(i3) | (-16777216));
        this.leftImageView.setLayerColor("info2", getThemedColor(i3) | (-16777216));
        this.leftImageView.setLayerColor("luc12", getThemedColor(i));
        this.leftImageView.setLayerColor("luc11", getThemedColor(i));
        this.leftImageView.setLayerColor("luc10", getThemedColor(i));
        this.leftImageView.setLayerColor("luc9", getThemedColor(i));
        this.leftImageView.setLayerColor("luc8", getThemedColor(i));
        this.leftImageView.setLayerColor("luc7", getThemedColor(i));
        this.leftImageView.setLayerColor("luc6", getThemedColor(i));
        this.leftImageView.setLayerColor("luc5", getThemedColor(i));
        this.leftImageView.setLayerColor("luc4", getThemedColor(i));
        this.leftImageView.setLayerColor("luc3", getThemedColor(i));
        this.leftImageView.setLayerColor("luc2", getThemedColor(i));
        this.leftImageView.setLayerColor("luc1", getThemedColor(i));
        this.leftImageView.setLayerColor("Oval", getThemedColor(i));
        addView(this.leftImageView, LayoutHelper.createFrame(54, -2.0f, 19, 3.0f, 0.0f, 0.0f, 0.0f));
        BackupImageView backupImageView = new BackupImageView(context);
        this.avatarImageView = backupImageView;
        backupImageView.setRoundRadius(AndroidUtilities.dp(15.0f));
        addView(this.avatarImageView, LayoutHelper.createFrame(30, 30.0f, 19, 15.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.undoButton = linearLayout;
        linearLayout.setOrientation(0);
        this.undoButton.setBackground(Theme.createRadSelectorDrawable(getThemedColor(i2) & 587202559, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f)));
        addView(this.undoButton, LayoutHelper.createFrame(-2, -2.0f, 21, 0.0f, 0.0f, 11.0f, 0.0f));
        this.undoButton.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.UndoView$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UndoView.this.lambda$new$0(view);
            }
        });
        ImageView imageView = new ImageView(context);
        this.undoImageView = imageView;
        imageView.setImageResource(R.drawable.chats_undo);
        this.undoImageView.setColorFilter(new PorterDuffColorFilter(getThemedColor(i2), PorterDuff.Mode.MULTIPLY));
        this.undoButton.addView(this.undoImageView, LayoutHelper.createLinear(-2, -2, 19, 4, 4, 0, 4));
        TextView textView2 = new TextView(context);
        this.undoTextView = textView2;
        textView2.setTextSize(1, 14.0f);
        this.undoTextView.setTypeface(AndroidUtilities.bold());
        this.undoTextView.setTextColor(getThemedColor(i2));
        this.undoTextView.setText(LocaleController.getString(R.string.UndoNoCaps));
        this.undoButton.addView(this.undoTextView, LayoutHelper.createLinear(-2, -2, 19, 6, 4, 8, 4));
        this.rect = new RectF(AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), AndroidUtilities.dp(33.0f), AndroidUtilities.dp(33.0f));
        Paint paint = new Paint(1);
        this.progressPaint = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.progressPaint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        this.progressPaint.setStrokeCap(Paint.Cap.ROUND);
        this.progressPaint.setColor(getThemedColor(i));
        TextPaint textPaint = new TextPaint(1);
        this.textPaint = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        this.textPaint.setTypeface(AndroidUtilities.bold());
        this.textPaint.setColor(getThemedColor(i));
        setWillNotDraw(false);
        this.backgroundDrawable = Theme.createRoundRectDrawable(AndroidUtilities.dp(10.0f), getThemedColor(i3));
        setOnTouchListener(new View.OnTouchListener() { // from class: org.telegram.ui.Components.UndoView$$ExternalSyntheticLambda1
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean lambda$new$1;
                lambda$new$1 = UndoView.lambda$new$1(view, motionEvent);
                return lambda$new$1;
            }
        });
        setVisibility(4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(View view) {
        if (canUndo()) {
            hide(false, 1);
        }
    }

    public void setColors(int i, int i2) {
        Theme.setDrawableColor(this.backgroundDrawable, i);
        this.infoTextView.setTextColor(i2);
        this.subinfoTextView.setTextColor(i2);
        int i3 = i | (-16777216);
        this.leftImageView.setLayerColor("info1", i3);
        this.leftImageView.setLayerColor("info2", i3);
    }

    private boolean isTooltipAction() {
        int i = this.currentAction;
        return i == 6 || i == 3 || i == 5 || i == 7 || i == 8 || i == 87 || i == 9 || i == 10 || i == 13 || i == 14 || i == 19 || i == 20 || i == 21 || i == 22 || i == 23 || i == 30 || i == 31 || i == 32 || i == 102 || i == 33 || i == 34 || i == 35 || i == 36 || i == 74 || i == 37 || i == 38 || i == 39 || i == 40 || i == 42 || i == 43 || i == 77 || i == 44 || i == 78 || i == 79 || i == 100 || i == 101 || i == ACTION_RINGTONE_ADDED;
    }

    private boolean hasSubInfo() {
        int i;
        Object obj;
        int i2 = this.currentAction;
        return i2 == 11 || i2 == 24 || i2 == 6 || i2 == 3 || i2 == 5 || i2 == 13 || i2 == 14 || i2 == 74 || (i2 == 7 && MessagesController.getInstance(this.currentAccount).dialogFilters.isEmpty()) || (i = this.currentAction) == ACTION_RINGTONE_ADDED || i == 85 || (i == 88 && (obj = this.currentInfoObject2) != null && ((Integer) obj).intValue() > 0);
    }

    public boolean isMultilineSubInfo() {
        int i = this.currentAction;
        return i == 12 || i == 15 || i == 24 || i == 74 || i == ACTION_RINGTONE_ADDED;
    }

    public void setAdditionalTranslationY(float f) {
        if (this.additionalTranslationY != f) {
            this.additionalTranslationY = f;
            updatePosition();
        }
    }

    public Object getCurrentInfoObject() {
        return this.currentInfoObject;
    }

    public void hide(boolean z, int i) {
        if (getVisibility() == 0 && this.isShown) {
            this.currentInfoObject = null;
            this.currentInfoObject2 = null;
            this.isShown = false;
            Runnable runnable = this.currentActionRunnable;
            if (runnable != null) {
                if (z) {
                    runnable.run();
                }
                this.currentActionRunnable = null;
            }
            Runnable runnable2 = this.currentCancelRunnable;
            if (runnable2 != null) {
                if (!z) {
                    runnable2.run();
                }
                this.currentCancelRunnable = null;
            }
            int i2 = this.currentAction;
            if (i2 == 0 || i2 == 1 || i2 == 95 || i2 == 26 || i2 == 27) {
                for (int i3 = 0; i3 < this.currentDialogIds.size(); i3++) {
                    long longValue = ((Long) this.currentDialogIds.get(i3)).longValue();
                    MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
                    int i4 = this.currentAction;
                    messagesController.removeDialogAction(longValue, i4 == 0 || i4 == 26, z);
                    onRemoveDialogAction(longValue, this.currentAction);
                }
            }
            if (i != 0) {
                AnimatorSet animatorSet = new AnimatorSet();
                if (i == 1) {
                    animatorSet.playTogether(ObjectAnimator.ofFloat(this, "enterOffset", (this.fromTop ? -1.0f : 1.0f) * (this.enterOffsetMargin + this.undoViewHeight)));
                    animatorSet.setDuration(250L);
                } else {
                    animatorSet.playTogether(ObjectAnimator.ofFloat(this, (Property<UndoView, Float>) View.SCALE_X, 0.8f), ObjectAnimator.ofFloat(this, (Property<UndoView, Float>) View.SCALE_Y, 0.8f), ObjectAnimator.ofFloat(this, (Property<UndoView, Float>) View.ALPHA, 0.0f));
                    animatorSet.setDuration(180L);
                }
                animatorSet.setInterpolator(new DecelerateInterpolator());
                animatorSet.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.Components.UndoView.2
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        UndoView.this.setVisibility(4);
                        UndoView.this.setScaleX(1.0f);
                        UndoView.this.setScaleY(1.0f);
                        UndoView.this.setAlpha(1.0f);
                    }
                });
                animatorSet.start();
                return;
            }
            setEnterOffset((this.fromTop ? -1.0f : 1.0f) * (this.enterOffsetMargin + this.undoViewHeight));
            setVisibility(4);
        }
    }

    public void showWithAction(long j, int i, Runnable runnable) {
        showWithAction(j, i, (Object) null, (Object) null, runnable, (Runnable) null);
    }

    public void showWithAction(long j, int i, Object obj) {
        showWithAction(j, i, obj, (Object) null, (Runnable) null, (Runnable) null);
    }

    public void showWithAction(long j, int i, Runnable runnable, Runnable runnable2) {
        showWithAction(j, i, (Object) null, (Object) null, runnable, runnable2);
    }

    public void showWithAction(long j, int i, Object obj, Runnable runnable, Runnable runnable2) {
        showWithAction(j, i, obj, (Object) null, runnable, runnable2);
    }

    public void showWithAction(long j, int i, Object obj, Object obj2, Runnable runnable, Runnable runnable2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Long.valueOf(j));
        showWithAction(arrayList, i, obj, obj2, runnable, runnable2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x084d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x087d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x18e8  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x190f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x1a08  */
    /* JADX WARN: Removed duplicated region for block: B:576:0x18c8  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x1955  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x08be  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0874  */
    /* JADX WARN: Type inference failed for: r3v259, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r3v265, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r3v274, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r3v277, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r3v285, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r3v288, types: [java.lang.CharSequence] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void showWithAction(ArrayList arrayList, int i, Object obj, Object obj2, Runnable runnable, Runnable runnable2) {
        long j;
        boolean z;
        int dp;
        int i2;
        float f;
        CharSequence replaceTags;
        int i3;
        SpannableStringBuilder spannableStringBuilder;
        String str;
        SpannableStringBuilder spannableStringBuilder2;
        String string;
        int i4;
        int i5;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        int i6;
        int i7;
        int i8;
        if (!AndroidUtilities.shouldShowClipboardToast() && ((i8 = this.currentAction) == 52 || i8 == 56 || i8 == 57 || i8 == 58 || i8 == 59 || i8 == 60 || i8 == 80 || i8 == 33)) {
            return;
        }
        Runnable runnable3 = this.currentActionRunnable;
        if (runnable3 != null) {
            runnable3.run();
        }
        this.isShown = true;
        this.currentActionRunnable = runnable;
        this.currentCancelRunnable = runnable2;
        this.currentDialogIds = arrayList;
        Long l = (Long) arrayList.get(0);
        long longValue = l.longValue();
        this.currentAction = i;
        this.timeLeft = 5000L;
        this.currentInfoObject = obj;
        this.currentInfoObject2 = obj2;
        this.lastUpdateTime = SystemClock.elapsedRealtime();
        this.undoTextView.setText(LocaleController.getString(R.string.UndoNoCaps));
        this.undoImageView.setVisibility(0);
        this.leftImageView.setPadding(0, 0, 0, 0);
        this.leftImageView.setScaleX(1.0f);
        this.leftImageView.setScaleY(1.0f);
        this.infoTextView.setTextSize(1, 15.0f);
        this.avatarImageView.setVisibility(8);
        this.infoTextView.setGravity(51);
        ((FrameLayout.LayoutParams) this.subinfoTextView.getLayoutParams()).leftMargin = AndroidUtilities.dp(58.0f);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.infoTextView.getLayoutParams();
        layoutParams.height = -2;
        layoutParams.topMargin = AndroidUtilities.dp(13.0f);
        layoutParams.bottomMargin = 0;
        this.leftImageView.setScaleType(ImageView.ScaleType.CENTER);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.leftImageView.getLayoutParams();
        layoutParams2.gravity = 19;
        layoutParams2.bottomMargin = 0;
        layoutParams2.topMargin = 0;
        layoutParams2.leftMargin = AndroidUtilities.dp(3.0f);
        layoutParams2.width = AndroidUtilities.dp(54.0f);
        layoutParams2.height = -2;
        this.infoTextView.setMinHeight(0);
        if ((runnable == null && runnable2 == null) || i == ACTION_RINGTONE_ADDED) {
            setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.UndoView$$ExternalSyntheticLambda2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    UndoView.this.lambda$showWithAction$2(view);
                }
            });
            setOnTouchListener(null);
        } else {
            setOnClickListener(null);
            setOnTouchListener(new View.OnTouchListener() { // from class: org.telegram.ui.Components.UndoView$$ExternalSyntheticLambda3
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    boolean lambda$showWithAction$3;
                    lambda$showWithAction$3 = UndoView.lambda$showWithAction$3(view, motionEvent);
                    return lambda$showWithAction$3;
                }
            });
        }
        this.infoTextView.setMovementMethod(null);
        if (isTooltipAction()) {
            if (i == ACTION_RINGTONE_ADDED) {
                this.subinfoTextView.setSingleLine(false);
                replaceTags = LocaleController.getString(R.string.SoundAdded);
                SpannableStringBuilder replaceSingleTag = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.SoundAddedSubtitle), runnable);
                this.currentActionRunnable = null;
                int i9 = R.raw.sound_download;
                this.timeLeft = 4000L;
                r14 = replaceSingleTag;
                i3 = i9;
            } else if (i == 74) {
                this.subinfoTextView.setSingleLine(false);
                replaceTags = LocaleController.getString(R.string.ReportChatSent);
                r14 = LocaleController.formatString("ReportSentInfo", R.string.ReportSentInfo, new Object[0]);
                i3 = R.raw.ic_admin;
                this.timeLeft = 4000L;
            } else {
                if (i == 34) {
                    TLRPC.User user = (TLRPC.User) obj;
                    SpannableStringBuilder replaceTags2 = ChatObject.isChannelOrGiga((TLRPC.Chat) obj2) ? AndroidUtilities.replaceTags(LocaleController.formatString("VoipChannelInvitedUser", R.string.VoipChannelInvitedUser, UserObject.getFirstName(user))) : AndroidUtilities.replaceTags(LocaleController.formatString("VoipGroupInvitedUser", R.string.VoipGroupInvitedUser, UserObject.getFirstName(user)));
                    AvatarDrawable avatarDrawable = new AvatarDrawable();
                    avatarDrawable.setTextSize(AndroidUtilities.dp(12.0f));
                    avatarDrawable.setInfo(this.currentAccount, user);
                    this.avatarImageView.setForUserOrChat(user, avatarDrawable);
                    this.avatarImageView.setVisibility(0);
                    this.timeLeft = 3000L;
                    replaceTags = replaceTags2;
                } else if (i == 44) {
                    TLRPC.Chat chat = (TLRPC.Chat) obj2;
                    if (obj instanceof TLRPC.User) {
                        TLRPC.User user2 = (TLRPC.User) obj;
                        replaceTags = ChatObject.isChannelOrGiga(chat) ? AndroidUtilities.replaceTags(LocaleController.formatString(R.string.VoipChannelUserJoined, UserObject.getFirstName(user2))) : AndroidUtilities.replaceTags(LocaleController.formatString(R.string.VoipChatUserJoined, UserObject.getFirstName(user2)));
                    } else if (obj instanceof TLRPC.Chat) {
                        TLRPC.Chat chat2 = (TLRPC.Chat) obj;
                        replaceTags = ChatObject.isChannelOrGiga(chat) ? AndroidUtilities.replaceTags(LocaleController.formatString(R.string.VoipChannelChatJoined, chat2.title)) : AndroidUtilities.replaceTags(LocaleController.formatString(R.string.VoipChatChatJoined, chat2.title));
                    } else {
                        replaceTags = "";
                    }
                    AvatarDrawable avatarDrawable2 = new AvatarDrawable();
                    avatarDrawable2.setTextSize(AndroidUtilities.dp(12.0f));
                    TLObject tLObject = (TLObject) obj;
                    avatarDrawable2.setInfo(this.currentAccount, tLObject);
                    this.avatarImageView.setForUserOrChat(tLObject, avatarDrawable2);
                    this.avatarImageView.setVisibility(0);
                    this.timeLeft = 3000L;
                } else if (i == 37) {
                    AvatarDrawable avatarDrawable3 = new AvatarDrawable();
                    avatarDrawable3.setTextSize(AndroidUtilities.dp(12.0f));
                    if (obj instanceof TLRPC.User) {
                        TLRPC.User user3 = (TLRPC.User) obj;
                        avatarDrawable3.setInfo(this.currentAccount, user3);
                        this.avatarImageView.setForUserOrChat(user3, avatarDrawable3);
                        str6 = ContactsController.formatName(user3.first_name, user3.last_name);
                    } else {
                        TLRPC.Chat chat3 = (TLRPC.Chat) obj;
                        avatarDrawable3.setInfo(this.currentAccount, chat3);
                        this.avatarImageView.setForUserOrChat(chat3, avatarDrawable3);
                        str6 = chat3.title;
                    }
                    if (ChatObject.isChannelOrGiga((TLRPC.Chat) obj2)) {
                        i6 = 0;
                        replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("VoipChannelUserChanged", R.string.VoipChannelUserChanged, str6));
                    } else {
                        i6 = 0;
                        replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("VoipGroupUserChanged", R.string.VoipGroupUserChanged, str6));
                    }
                    this.avatarImageView.setVisibility(i6);
                    this.timeLeft = 3000L;
                } else if (i == 33) {
                    replaceTags = LocaleController.getString(R.string.VoipGroupCopyInviteLinkCopied);
                    i3 = R.raw.voip_invite;
                    this.timeLeft = 3000L;
                } else if (i == 77) {
                    replaceTags = (CharSequence) obj;
                    i3 = R.raw.payment_success;
                    this.timeLeft = 5000L;
                    if (this.parentFragment != null && (obj2 instanceof TLRPC.Message)) {
                        final TLRPC.Message message = (TLRPC.Message) obj2;
                        setOnTouchListener(null);
                        this.infoTextView.setMovementMethod(null);
                        setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.UndoView$$ExternalSyntheticLambda4
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                UndoView.this.lambda$showWithAction$6(message, view);
                            }
                        });
                    }
                } else if (i == 30) {
                    if (obj instanceof TLRPC.User) {
                        str5 = UserObject.getFirstName((TLRPC.User) obj);
                    } else {
                        str5 = ((TLRPC.Chat) obj).title;
                    }
                    replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("VoipGroupUserCantNowSpeak", R.string.VoipGroupUserCantNowSpeak, str5));
                    i3 = R.raw.voip_muted;
                    this.timeLeft = 3000L;
                } else if (i == 35) {
                    if (obj instanceof TLRPC.User) {
                        str4 = UserObject.getFirstName((TLRPC.User) obj);
                    } else {
                        str4 = obj instanceof TLRPC.Chat ? ((TLRPC.Chat) obj).title : "";
                    }
                    replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("VoipGroupUserCantNowSpeakForYou", R.string.VoipGroupUserCantNowSpeakForYou, str4));
                    i3 = R.raw.voip_muted;
                    this.timeLeft = 3000L;
                } else if (i == 31) {
                    if (obj instanceof TLRPC.User) {
                        str3 = UserObject.getFirstName((TLRPC.User) obj);
                    } else {
                        str3 = ((TLRPC.Chat) obj).title;
                    }
                    replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("VoipGroupUserCanNowSpeak", R.string.VoipGroupUserCanNowSpeak, str3));
                    i3 = R.raw.voip_unmuted;
                    this.timeLeft = 3000L;
                } else if (i == 38) {
                    replaceTags = obj instanceof TLRPC.Chat ? AndroidUtilities.replaceTags(LocaleController.formatString("VoipGroupYouCanNowSpeakIn", R.string.VoipGroupYouCanNowSpeakIn, ((TLRPC.Chat) obj).title)) : AndroidUtilities.replaceTags(LocaleController.getString(R.string.VoipGroupYouCanNowSpeak));
                    i3 = R.raw.voip_allow_talk;
                    this.timeLeft = 3000L;
                } else if (i == 42) {
                    if (ChatObject.isChannelOrGiga((TLRPC.Chat) obj)) {
                        replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.VoipChannelSoundMuted));
                    } else {
                        replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.VoipGroupSoundMuted));
                    }
                    i3 = R.raw.ic_mute;
                    this.timeLeft = 3000L;
                } else if (i == 43) {
                    if (ChatObject.isChannelOrGiga((TLRPC.Chat) obj)) {
                        replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.VoipChannelSoundUnmuted));
                    } else {
                        replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.VoipGroupSoundUnmuted));
                    }
                    i3 = R.raw.ic_unmute;
                    this.timeLeft = 3000L;
                } else {
                    int i10 = this.currentAction;
                    if (i10 == 39 || i10 == 100) {
                        replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(i10 == 39 ? R.string.VoipGroupAudioRecordStarted : R.string.VoipGroupVideoRecordStarted));
                        i3 = R.raw.voip_record_start;
                        this.timeLeft = 3000L;
                    } else {
                        if (i10 == 40 || i10 == 101) {
                            String string2 = LocaleController.getString(i10 == 40 ? R.string.VoipGroupAudioRecordSaved : R.string.VoipGroupVideoRecordSaved);
                            i3 = R.raw.voip_record_saved;
                            this.timeLeft = 4000L;
                            this.infoTextView.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
                            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(string2);
                            int indexOf = string2.indexOf("**");
                            int lastIndexOf = string2.lastIndexOf("**");
                            spannableStringBuilder = spannableStringBuilder3;
                            spannableStringBuilder = spannableStringBuilder3;
                            spannableStringBuilder = spannableStringBuilder3;
                            if (indexOf >= 0 && lastIndexOf >= 0 && indexOf != lastIndexOf) {
                                spannableStringBuilder3.replace(lastIndexOf, lastIndexOf + 2, (CharSequence) "");
                                spannableStringBuilder3.replace(indexOf, indexOf + 2, (CharSequence) "");
                                try {
                                    spannableStringBuilder3.setSpan(new URLSpanNoUnderline("tg://openmessage?user_id=" + UserConfig.getInstance(this.currentAccount).getClientUserId()), indexOf, lastIndexOf - 2, 33);
                                    spannableStringBuilder = spannableStringBuilder3;
                                } catch (Exception e) {
                                    FileLog.e(e);
                                    spannableStringBuilder = spannableStringBuilder3;
                                }
                            }
                        } else if (i == 36) {
                            if (obj instanceof TLRPC.User) {
                                str2 = UserObject.getFirstName((TLRPC.User) obj);
                            } else {
                                str2 = ((TLRPC.Chat) obj).title;
                            }
                            replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("VoipGroupUserCanNowSpeakForYou", R.string.VoipGroupUserCanNowSpeakForYou, str2));
                            i3 = R.raw.voip_unmuted;
                            this.timeLeft = 3000L;
                        } else if (i == 32 || i == 102) {
                            if (obj instanceof TLRPC.User) {
                                str = UserObject.getFirstName((TLRPC.User) obj);
                            } else {
                                str = ((TLRPC.Chat) obj).title;
                            }
                            replaceTags = i == 102 ? AndroidUtilities.replaceTags(LocaleController.formatString(R.string.VoipConferenceKicked, str)) : AndroidUtilities.replaceTags(LocaleController.formatString(R.string.VoipGroupRemovedFromGroup, str));
                            i3 = R.raw.ic_ban;
                            this.timeLeft = 3000L;
                        } else if (i == 9 || i == 10) {
                            TLRPC.User user4 = (TLRPC.User) obj;
                            replaceTags = i == 9 ? AndroidUtilities.replaceTags(LocaleController.formatString("EditAdminTransferChannelToast", R.string.EditAdminTransferChannelToast, UserObject.getFirstName(user4))) : AndroidUtilities.replaceTags(LocaleController.formatString("EditAdminTransferGroupToast", R.string.EditAdminTransferGroupToast, UserObject.getFirstName(user4)));
                            i3 = R.raw.contact_check;
                        } else if (i == 8) {
                            replaceTags = LocaleController.formatString("NowInContacts", R.string.NowInContacts, UserObject.getFirstName((TLRPC.User) obj));
                            i3 = R.raw.contact_check;
                        } else if (i == 87) {
                            replaceTags = LocaleController.formatString(R.string.ProxyAddedSuccess, new Object[0]);
                            i3 = R.raw.contact_check;
                        } else if (i == 22) {
                            if (!DialogObject.isUserDialog(longValue)) {
                                TLRPC.Chat chat4 = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-longValue));
                                if (!ChatObject.isChannel(chat4) || chat4.megagroup) {
                                    if (obj == null) {
                                        replaceTags = LocaleController.getString(R.string.MainGroupProfilePhotoSetHint);
                                    } else {
                                        replaceTags = LocaleController.getString(R.string.MainGroupProfileVideoSetHint);
                                    }
                                } else if (obj == null) {
                                    replaceTags = LocaleController.getString(R.string.MainChannelProfilePhotoSetHint);
                                } else {
                                    replaceTags = LocaleController.getString(R.string.MainChannelProfileVideoSetHint);
                                }
                            } else if (obj == null) {
                                replaceTags = LocaleController.getString(R.string.MainProfilePhotoSetHint);
                            } else {
                                replaceTags = LocaleController.getString(R.string.MainProfileVideoSetHint);
                            }
                            i3 = R.raw.contact_check;
                        } else if (i == 23) {
                            replaceTags = LocaleController.getString(R.string.ChatWasMovedToMainList);
                            i3 = R.raw.contact_check;
                        } else {
                            if (i == 6) {
                                replaceTags = LocaleController.getString(R.string.ArchiveHidden);
                                r14 = LocaleController.getString(R.string.ArchiveHiddenInfo);
                                i3 = R.raw.chats_swipearchive;
                                i5 = 48;
                            } else {
                                if (i10 == 13) {
                                    string = LocaleController.getString(R.string.QuizWellDone);
                                    r14 = LocaleController.getString(R.string.QuizWellDoneInfo);
                                    i4 = R.raw.wallet_congrats;
                                } else if (i10 == 14) {
                                    string = LocaleController.getString(R.string.QuizWrongAnswer);
                                    r14 = LocaleController.getString(R.string.QuizWrongAnswerInfo);
                                    i4 = R.raw.wallet_science;
                                } else if (i == 7) {
                                    replaceTags = LocaleController.getString(R.string.ArchivePinned);
                                    r14 = MessagesController.getInstance(this.currentAccount).dialogFilters.isEmpty() ? LocaleController.getString(R.string.ArchivePinnedInfo) : null;
                                    i3 = R.raw.chats_infotip;
                                } else if (i == 20 || i == 21) {
                                    MessagesController.DialogFilter dialogFilter = (MessagesController.DialogFilter) obj2;
                                    Spannable replaceAnimatedEmoji = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(dialogFilter.name, this.infoTextView.getPaint().getFontMetricsInt(), false), dialogFilter.entities, this.infoTextView.getPaint().getFontMetricsInt());
                                    this.infoTextViewEmojiCacheType = dialogFilter.title_noanimate ? 26 : 0;
                                    if (longValue != 0) {
                                        if (DialogObject.isEncryptedDialog(longValue)) {
                                            longValue = MessagesController.getInstance(this.currentAccount).getEncryptedChat(Integer.valueOf(DialogObject.getEncryptedChatId(longValue))).user_id;
                                        }
                                        if (DialogObject.isUserDialog(longValue)) {
                                            TLRPC.User user5 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(longValue));
                                            String firstName = UserObject.getFirstName(user5);
                                            if (UserObject.isUserSelf(user5)) {
                                                firstName = LocaleController.getString(R.string.SavedMessages);
                                            } else if (UserObject.isReplyUser(user5)) {
                                                firstName = LocaleController.getString(R.string.RepliesTitle);
                                            }
                                            spannableStringBuilder2 = i == 20 ? AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.FilterUserAddedToExisting, firstName, replaceAnimatedEmoji)) : AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.FilterUserRemovedFrom, firstName, replaceAnimatedEmoji));
                                        } else {
                                            TLRPC.Chat chat5 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-longValue));
                                            spannableStringBuilder2 = i == 20 ? AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.FilterChatAddedToExisting, chat5.title, replaceAnimatedEmoji)) : AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.FilterChatRemovedFrom, chat5.title, replaceAnimatedEmoji));
                                        }
                                    } else {
                                        spannableStringBuilder2 = i == 20 ? AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.FilterChatsAddedToExisting, LocaleController.formatPluralString("ChatsSelected", ((Integer) obj).intValue(), new Object[0]), replaceAnimatedEmoji)) : AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.FilterChatsRemovedFrom, LocaleController.formatPluralString("ChatsSelected", ((Integer) obj).intValue(), new Object[0]), replaceAnimatedEmoji));
                                    }
                                    i3 = i == 20 ? R.raw.folder_in : R.raw.folder_out;
                                    spannableStringBuilder = spannableStringBuilder2;
                                } else if (i == 19) {
                                    replaceTags = this.infoText;
                                    i3 = R.raw.ic_delete;
                                } else if (i == 82) {
                                    replaceTags = LocaleController.getString(((MediaController.PhotoEntry) obj).isVideo ? R.string.AttachMediaVideoDeselected : R.string.AttachMediaPhotoDeselected);
                                } else if (i == 78 || i == 79) {
                                    int intValue = ((Integer) obj).intValue();
                                    if (i == 78) {
                                        replaceTags = LocaleController.formatPluralString("PinnedDialogsCount", intValue, new Object[0]);
                                    } else {
                                        replaceTags = LocaleController.formatPluralString("UnpinnedDialogsCount", intValue, new Object[0]);
                                    }
                                    i3 = this.currentAction == 78 ? R.raw.ic_pin : R.raw.ic_unpin;
                                    if (obj2 instanceof Integer) {
                                        this.timeLeft = ((Integer) obj2).intValue();
                                    }
                                } else {
                                    if (i == 3) {
                                        replaceTags = LocaleController.getString(R.string.ChatArchived);
                                    } else {
                                        replaceTags = LocaleController.getString(R.string.ChatsArchived);
                                    }
                                    r14 = MessagesController.getInstance(this.currentAccount).dialogFilters.isEmpty() ? LocaleController.getString(R.string.ChatArchivedInfo) : null;
                                    i3 = R.raw.chats_infotip;
                                }
                                replaceTags = string;
                                i3 = i4;
                                i5 = 44;
                            }
                            this.infoTextView.setText(replaceTags);
                            if (i3 == 0) {
                                this.leftImageView.setAnimation(i3, i5, i5);
                                RLottieDrawable animatedDrawable = this.leftImageView.getAnimatedDrawable();
                                animatedDrawable.setPlayInDirectionOfCustomEndFrame(false);
                                animatedDrawable.setCustomEndFrame(animatedDrawable.getFramesCount());
                                this.leftImageView.setVisibility(0);
                                this.leftImageView.setProgress(0.0f);
                                this.leftImageView.playAnimation();
                            } else {
                                this.leftImageView.setVisibility(8);
                            }
                            if (r14 == null) {
                                layoutParams.leftMargin = AndroidUtilities.dp(58.0f);
                                layoutParams.topMargin = AndroidUtilities.dp(6.0f);
                                layoutParams.rightMargin = AndroidUtilities.dp(8.0f);
                                ((FrameLayout.LayoutParams) this.subinfoTextView.getLayoutParams()).rightMargin = AndroidUtilities.dp(8.0f);
                                this.subinfoTextView.setText(r14);
                                this.subinfoTextView.setVisibility(0);
                                this.infoTextView.setTextSize(1, 14.0f);
                                this.infoTextView.setTypeface(AndroidUtilities.bold());
                                i7 = 8;
                            } else {
                                layoutParams.leftMargin = AndroidUtilities.dp(58.0f);
                                layoutParams.topMargin = AndroidUtilities.dp(13.0f);
                                layoutParams.rightMargin = AndroidUtilities.dp(8.0f);
                                i7 = 8;
                                this.subinfoTextView.setVisibility(8);
                                this.infoTextView.setTextSize(1, 15.0f);
                                this.infoTextView.setTypeface(Typeface.DEFAULT);
                            }
                            this.undoButton.setVisibility(i7);
                        }
                        replaceTags = spannableStringBuilder;
                    }
                }
                i3 = 0;
            }
            i5 = 36;
            this.infoTextView.setText(replaceTags);
            if (i3 == 0) {
            }
            if (r14 == null) {
            }
            this.undoButton.setVisibility(i7);
        } else {
            int i11 = this.currentAction;
            if (i11 == 45 || i11 == 46 || i11 == 47 || i11 == 52 || i11 == 53 || i11 == 54 || i11 == 55 || i11 == 56 || i11 == 57 || i11 == 58 || i11 == 59 || i11 == 60 || i11 == 71 || i11 == 70 || i11 == 75 || i11 == 76 || i11 == 41 || i11 == 78 || i11 == 79 || i11 == 61 || i11 == 80) {
                this.undoImageView.setVisibility(8);
                this.leftImageView.setVisibility(0);
                this.infoTextView.setTypeface(Typeface.DEFAULT);
                int i12 = this.currentAction;
                long j2 = -1;
                if (i12 == 76) {
                    this.infoTextView.setText(LocaleController.getString(R.string.BroadcastGroupConvertSuccess));
                    this.leftImageView.setAnimation(R.raw.gigagroup_convert, 36, 36);
                    layoutParams.topMargin = AndroidUtilities.dp(9.0f);
                    this.infoTextView.setTextSize(1, 14.0f);
                } else if (i12 == 75) {
                    this.infoTextView.setText(LocaleController.getString(R.string.GigagroupConvertCancelHint));
                    this.leftImageView.setAnimation(R.raw.chats_infotip, 36, 36);
                    layoutParams.topMargin = AndroidUtilities.dp(9.0f);
                    this.infoTextView.setTextSize(1, 14.0f);
                } else {
                    if (i == 70) {
                        int intValue2 = ((Integer) obj2).intValue();
                        this.subinfoTextView.setSingleLine(false);
                        this.infoTextView.setText(LocaleController.formatString("AutoDeleteHintOnText", R.string.AutoDeleteHintOnText, LocaleController.formatTTLString(intValue2)));
                        this.leftImageView.setAnimation(R.raw.fire_on, 36, 36);
                        layoutParams.topMargin = AndroidUtilities.dp(9.0f);
                        this.timeLeft = 4000L;
                        this.leftImageView.setPadding(0, 0, 0, AndroidUtilities.dp(3.0f));
                        j = -1;
                        z = true;
                    } else {
                        if (i12 == 71) {
                            this.infoTextView.setText(LocaleController.getString(R.string.AutoDeleteHintOffText));
                            this.leftImageView.setAnimation(R.raw.fire_off, 36, 36);
                            this.infoTextView.setTextSize(1, 14.0f);
                            this.timeLeft = 3000L;
                            this.leftImageView.setPadding(0, 0, 0, AndroidUtilities.dp(4.0f));
                        } else if (i12 == 45) {
                            this.infoTextView.setText(LocaleController.getString(R.string.ImportMutualError));
                            this.leftImageView.setAnimation(R.raw.error, 36, 36);
                            layoutParams.topMargin = AndroidUtilities.dp(9.0f);
                            this.infoTextView.setTextSize(1, 14.0f);
                        } else if (i12 == 46) {
                            this.infoTextView.setText(LocaleController.getString(R.string.ImportNotAdmin));
                            this.leftImageView.setAnimation(R.raw.error, 36, 36);
                            layoutParams.topMargin = AndroidUtilities.dp(9.0f);
                            this.infoTextView.setTextSize(1, 14.0f);
                        } else if (i12 == 47) {
                            this.infoTextView.setText(LocaleController.getString(R.string.ImportedInfo));
                            this.leftImageView.setAnimation(R.raw.imported, 36, 36);
                            this.leftImageView.setPadding(0, 0, 0, AndroidUtilities.dp(5.0f));
                            layoutParams.topMargin = AndroidUtilities.dp(9.0f);
                            this.infoTextView.setTextSize(1, 14.0f);
                        } else if (i12 == 52 || i12 == 56 || i12 == 57 || i12 == 58 || i12 == 59 || i12 == 60 || i12 == 80) {
                            if (!AndroidUtilities.shouldShowClipboardToast()) {
                                return;
                            }
                            int i13 = R.raw.copy;
                            int i14 = this.currentAction;
                            if (i14 == 80) {
                                this.infoTextView.setText(LocaleController.getString(R.string.EmailCopied));
                            } else if (i14 == 60) {
                                this.infoTextView.setText(LocaleController.getString(R.string.PhoneCopied));
                            } else if (i14 == 56) {
                                this.infoTextView.setText(LocaleController.getString(R.string.UsernameCopied));
                            } else if (i14 == 57) {
                                this.infoTextView.setText(LocaleController.getString(R.string.HashtagCopied));
                            } else if (i14 == 52) {
                                this.infoTextView.setText(LocaleController.getString(R.string.MessageCopied));
                            } else if (i14 == 59) {
                                i13 = R.raw.voip_invite;
                                this.infoTextView.setText(LocaleController.getString(R.string.LinkCopied));
                            } else {
                                this.infoTextView.setText(LocaleController.getString(R.string.TextCopied));
                            }
                            this.leftImageView.setAnimation(i13, 30, 30);
                            this.timeLeft = 3000L;
                            this.infoTextView.setTextSize(1, 15.0f);
                        } else if (i12 == 54) {
                            this.infoTextView.setText(LocaleController.getString(R.string.ChannelNotifyMembersInfoOn));
                            this.leftImageView.setAnimation(R.raw.silent_unmute, 30, 30);
                            this.timeLeft = 3000L;
                            this.infoTextView.setTextSize(1, 15.0f);
                        } else if (i12 == 55) {
                            this.infoTextView.setText(LocaleController.getString(R.string.ChannelNotifyMembersInfoOff));
                            this.leftImageView.setAnimation(R.raw.silent_mute, 30, 30);
                            this.timeLeft = 3000L;
                            this.infoTextView.setTextSize(1, 15.0f);
                        } else if (i12 == 41) {
                            if (obj2 != null) {
                                this.infoTextView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("InvLinkToChats", R.string.InvLinkToChats, LocaleController.formatPluralString("Chats", ((Integer) obj2).intValue(), new Object[0]))));
                            } else if (longValue == UserConfig.getInstance(this.currentAccount).clientUserId) {
                                this.infoTextView.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.InvLinkToSavedMessages)));
                            } else if (DialogObject.isChatDialog(longValue)) {
                                this.infoTextView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("InvLinkToGroup", R.string.InvLinkToGroup, MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-longValue)).title)));
                            } else {
                                this.infoTextView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("InvLinkToUser", R.string.InvLinkToUser, UserObject.getFirstName(MessagesController.getInstance(this.currentAccount).getUser(l)))));
                            }
                            this.leftImageView.setAnimation(R.raw.contact_check, 36, 36);
                            this.timeLeft = 3000L;
                        } else if (i12 == 53) {
                            Integer num = (Integer) obj;
                            if (obj2 != null && !(obj2 instanceof TLRPC.TL_forumTopic)) {
                                int intValue3 = ((Integer) obj2).intValue();
                                if (num.intValue() == 1) {
                                    this.infoTextView.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralString("FwdMessageToManyChats", intValue3, new Object[0])));
                                } else {
                                    this.infoTextView.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralString("FwdMessagesToManyChats", intValue3, new Object[0])));
                                }
                                this.leftImageView.setAnimation(R.raw.forward, 30, 30);
                            } else if (longValue == UserConfig.getInstance(this.currentAccount).clientUserId) {
                                if (num.intValue() == 1) {
                                    this.infoTextView.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.FwdMessageToSavedMessages), new BulletinFactory$$ExternalSyntheticLambda0()));
                                } else {
                                    this.infoTextView.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.FwdMessagesToSavedMessages), new BulletinFactory$$ExternalSyntheticLambda0()));
                                }
                                this.leftImageView.setAnimation(R.raw.saved_messages, 30, 30);
                                this.timeLeft = 3000L;
                            } else {
                                if (DialogObject.isChatDialog(longValue)) {
                                    TLRPC.Chat chat6 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-longValue));
                                    TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) obj2;
                                    r14 = ChatObject.isMonoForum(chat6) ? ForumUtilities.getMonoForumTitle(this.currentAccount, chat6) : null;
                                    if (num.intValue() == 1) {
                                        LinkSpanDrawable.LinksTextView linksTextView = this.infoTextView;
                                        int i15 = R.string.FwdMessageToGroup;
                                        if (r14 == null) {
                                            r14 = tL_forumTopic != null ? tL_forumTopic.title : chat6.title;
                                        }
                                        linksTextView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("FwdMessageToGroup", i15, r14)));
                                    } else {
                                        LinkSpanDrawable.LinksTextView linksTextView2 = this.infoTextView;
                                        int i16 = R.string.FwdMessagesToGroup;
                                        if (r14 == null) {
                                            r14 = tL_forumTopic != null ? tL_forumTopic.title : chat6.title;
                                        }
                                        linksTextView2.setText(AndroidUtilities.replaceTags(LocaleController.formatString("FwdMessagesToGroup", i16, r14)));
                                    }
                                } else {
                                    TLRPC.User user6 = MessagesController.getInstance(this.currentAccount).getUser(l);
                                    if (num.intValue() == 1) {
                                        this.infoTextView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("FwdMessageToUser", R.string.FwdMessageToUser, UserObject.getFirstName(user6))));
                                    } else {
                                        this.infoTextView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("FwdMessagesToUser", R.string.FwdMessagesToUser, UserObject.getFirstName(user6))));
                                    }
                                }
                                this.leftImageView.setAnimation(R.raw.forward, 30, 30);
                            }
                            j2 = 300;
                            this.timeLeft = 3000L;
                        } else if (i12 == 61) {
                            if (obj2 != null) {
                                this.infoTextView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("BackgroundToChats", R.string.BackgroundToChats, LocaleController.formatPluralString("Chats", ((Integer) obj2).intValue(), new Object[0]))));
                                this.leftImageView.setAnimation(R.raw.forward, 30, 30);
                            } else if (longValue == UserConfig.getInstance(this.currentAccount).clientUserId) {
                                this.infoTextView.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.BackgroundToSavedMessages)));
                                this.leftImageView.setAnimation(R.raw.saved_messages, 30, 30);
                            } else {
                                if (DialogObject.isChatDialog(longValue)) {
                                    this.infoTextView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("BackgroundToGroup", R.string.BackgroundToGroup, MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-longValue)).title)));
                                } else {
                                    this.infoTextView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("BackgroundToUser", R.string.BackgroundToUser, UserObject.getFirstName(MessagesController.getInstance(this.currentAccount).getUser(l)))));
                                }
                                this.leftImageView.setAnimation(R.raw.forward, 30, 30);
                            }
                            this.timeLeft = 3000L;
                        }
                        j = j2;
                        z = false;
                    }
                    this.subinfoTextView.setVisibility(8);
                    this.undoTextView.setTextColor(getThemedColor(Theme.key_undo_cancelColor));
                    this.undoButton.setVisibility(8);
                    layoutParams.leftMargin = AndroidUtilities.dp(58.0f);
                    layoutParams.rightMargin = AndroidUtilities.dp(8.0f);
                    this.leftImageView.setProgress(0.0f);
                    this.leftImageView.playAnimation();
                    if (j > 0) {
                        this.leftImageView.postDelayed(new Runnable() { // from class: org.telegram.ui.Components.UndoView$$ExternalSyntheticLambda5
                            @Override // java.lang.Runnable
                            public final void run() {
                                UndoView.this.lambda$showWithAction$7();
                            }
                        }, j);
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append((Object) this.infoTextView.getText());
                    sb.append(this.subinfoTextView.getVisibility() == 0 ? ". " + ((Object) this.subinfoTextView.getText()) : "");
                    AndroidUtilities.makeAccessibilityAnnouncement(sb.toString());
                    if (isMultilineSubInfo()) {
                        int measuredWidth = ((ViewGroup) getParent()).getMeasuredWidth();
                        if (measuredWidth == 0) {
                            measuredWidth = AndroidUtilities.displaySize.x;
                        }
                        measureChildWithMargins(this.subinfoTextView, View.MeasureSpec.makeMeasureSpec(measuredWidth - AndroidUtilities.dp(16.0f), TLObject.FLAG_30), 0, View.MeasureSpec.makeMeasureSpec(0, 0), 0);
                        this.undoViewHeight = this.subinfoTextView.getMeasuredHeight() + AndroidUtilities.dp(37.0f);
                    } else if (hasSubInfo()) {
                        this.undoViewHeight = AndroidUtilities.dp(52.0f);
                    } else if (getParent() instanceof ViewGroup) {
                        ViewGroup viewGroup = (ViewGroup) getParent();
                        int measuredWidth2 = (viewGroup.getMeasuredWidth() - viewGroup.getPaddingLeft()) - viewGroup.getPaddingRight();
                        if (measuredWidth2 <= 0) {
                            measuredWidth2 = AndroidUtilities.displaySize.x;
                        }
                        measureChildWithMargins(this.infoTextView, View.MeasureSpec.makeMeasureSpec(measuredWidth2 - AndroidUtilities.dp(16.0f), TLObject.FLAG_30), 0, View.MeasureSpec.makeMeasureSpec(0, 0), 0);
                        int measuredHeight = this.infoTextView.getMeasuredHeight();
                        int i17 = this.currentAction;
                        int dp2 = measuredHeight + AndroidUtilities.dp((i17 == 16 || i17 == 17 || i17 == 18 || i17 == 84 || i17 == 86) ? 14.0f : 28.0f);
                        this.undoViewHeight = dp2;
                        int i18 = this.currentAction;
                        if (i18 == 18) {
                            this.undoViewHeight = Math.max(dp2, AndroidUtilities.dp(52.0f));
                        } else if (i18 == 25) {
                            this.undoViewHeight = Math.max(dp2, AndroidUtilities.dp(50.0f));
                        } else if (z) {
                            this.undoViewHeight = dp2 - AndroidUtilities.dp(8.0f);
                        }
                    }
                    if (getVisibility() != 0) {
                        setVisibility(0);
                        setEnterOffset((this.fromTop ? -1.0f : 1.0f) * (this.enterOffsetMargin + this.undoViewHeight));
                        AnimatorSet animatorSet = new AnimatorSet();
                        boolean z2 = this.fromTop;
                        float f2 = (z2 ? -1.0f : 1.0f) * (this.enterOffsetMargin + this.undoViewHeight);
                        if (z2) {
                            i2 = 2;
                            f = 1.0f;
                        } else {
                            i2 = 2;
                            f = -1.0f;
                        }
                        float[] fArr = new float[i2];
                        fArr[0] = f2;
                        fArr[1] = f;
                        animatorSet.playTogether(ObjectAnimator.ofFloat(this, "enterOffset", fArr));
                        animatorSet.setInterpolator(new DecelerateInterpolator());
                        animatorSet.setDuration(180L);
                        animatorSet.start();
                        return;
                    }
                    return;
                }
                j = -1;
                z = true;
                this.subinfoTextView.setVisibility(8);
                this.undoTextView.setTextColor(getThemedColor(Theme.key_undo_cancelColor));
                this.undoButton.setVisibility(8);
                layoutParams.leftMargin = AndroidUtilities.dp(58.0f);
                layoutParams.rightMargin = AndroidUtilities.dp(8.0f);
                this.leftImageView.setProgress(0.0f);
                this.leftImageView.playAnimation();
                if (j > 0) {
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append((Object) this.infoTextView.getText());
                if (this.subinfoTextView.getVisibility() == 0) {
                }
                sb2.append(this.subinfoTextView.getVisibility() == 0 ? ". " + ((Object) this.subinfoTextView.getText()) : "");
                AndroidUtilities.makeAccessibilityAnnouncement(sb2.toString());
                if (isMultilineSubInfo()) {
                }
                if (getVisibility() != 0) {
                }
            } else if (i11 == 24 || i11 == 25) {
                int intValue4 = ((Integer) obj).intValue();
                TLRPC.User user7 = (TLRPC.User) obj2;
                this.undoImageView.setVisibility(8);
                this.leftImageView.setVisibility(0);
                if (intValue4 != 0) {
                    this.infoTextView.setTypeface(AndroidUtilities.bold());
                    this.infoTextView.setTextSize(1, 14.0f);
                    this.leftImageView.clearLayerColors();
                    RLottieImageView rLottieImageView = this.leftImageView;
                    int i19 = Theme.key_undo_infoColor;
                    rLottieImageView.setLayerColor("BODY", getThemedColor(i19));
                    this.leftImageView.setLayerColor("Wibe Big", getThemedColor(i19));
                    this.leftImageView.setLayerColor("Wibe Big 3", getThemedColor(i19));
                    this.leftImageView.setLayerColor("Wibe Small", getThemedColor(i19));
                    this.infoTextView.setText(LocaleController.getString(R.string.ProximityAlertSet));
                    this.leftImageView.setAnimation(R.raw.ic_unmute, 28, 28);
                    this.subinfoTextView.setVisibility(0);
                    this.subinfoTextView.setSingleLine(false);
                    this.subinfoTextView.setMaxLines(3);
                    if (user7 != null) {
                        this.subinfoTextView.setText(LocaleController.formatString("ProximityAlertSetInfoUser", R.string.ProximityAlertSetInfoUser, UserObject.getFirstName(user7), LocaleController.formatDistance(intValue4, 2)));
                    } else {
                        this.subinfoTextView.setText(LocaleController.formatString("ProximityAlertSetInfoGroup2", R.string.ProximityAlertSetInfoGroup2, LocaleController.formatDistance(intValue4, 2)));
                    }
                    this.undoButton.setVisibility(8);
                    layoutParams.topMargin = AndroidUtilities.dp(6.0f);
                } else {
                    this.infoTextView.setTypeface(Typeface.DEFAULT);
                    this.infoTextView.setTextSize(1, 15.0f);
                    this.leftImageView.clearLayerColors();
                    RLottieImageView rLottieImageView2 = this.leftImageView;
                    int i20 = Theme.key_undo_infoColor;
                    rLottieImageView2.setLayerColor("Body Main", getThemedColor(i20));
                    this.leftImageView.setLayerColor("Body Top", getThemedColor(i20));
                    this.leftImageView.setLayerColor("Line", getThemedColor(i20));
                    this.leftImageView.setLayerColor("Curve Big", getThemedColor(i20));
                    this.leftImageView.setLayerColor("Curve Small", getThemedColor(i20));
                    layoutParams.topMargin = AndroidUtilities.dp(14.0f);
                    this.infoTextView.setText(LocaleController.getString(R.string.ProximityAlertCancelled));
                    this.leftImageView.setAnimation(R.raw.ic_mute, 28, 28);
                    this.subinfoTextView.setVisibility(8);
                    this.undoTextView.setTextColor(getThemedColor(Theme.key_undo_cancelColor));
                    this.undoButton.setVisibility(0);
                }
                layoutParams.leftMargin = AndroidUtilities.dp(58.0f);
                this.leftImageView.setProgress(0.0f);
                this.leftImageView.playAnimation();
            } else if (i11 == 11) {
                this.infoTextView.setText(LocaleController.getString(R.string.AuthAnotherClientOk));
                this.leftImageView.setAnimation(R.raw.contact_check, 36, 36);
                layoutParams.leftMargin = AndroidUtilities.dp(58.0f);
                layoutParams.topMargin = AndroidUtilities.dp(6.0f);
                this.subinfoTextView.setText(((TLRPC.TL_authorization) obj).app_name);
                this.subinfoTextView.setVisibility(0);
                this.infoTextView.setTextSize(1, 14.0f);
                this.infoTextView.setTypeface(AndroidUtilities.bold());
                this.undoTextView.setTextColor(getThemedColor(Theme.key_text_RedRegular));
                this.undoImageView.setVisibility(8);
                this.undoButton.setVisibility(0);
                this.leftImageView.setVisibility(0);
                this.leftImageView.setProgress(0.0f);
                this.leftImageView.playAnimation();
            } else if (i11 == 15) {
                this.timeLeft = 10000L;
                this.undoTextView.setText(LocaleController.getString(R.string.Open));
                this.infoTextView.setText(LocaleController.getString(R.string.FilterAvailableTitle));
                this.leftImageView.setAnimation(R.raw.filter_new, 36, 36);
                int ceil = ((int) Math.ceil(this.undoTextView.getPaint().measureText(this.undoTextView.getText().toString()))) + AndroidUtilities.dp(26.0f);
                layoutParams.leftMargin = AndroidUtilities.dp(58.0f);
                layoutParams.rightMargin = ceil;
                layoutParams.topMargin = AndroidUtilities.dp(6.0f);
                ((FrameLayout.LayoutParams) this.subinfoTextView.getLayoutParams()).rightMargin = ceil;
                String string3 = LocaleController.getString(R.string.FilterAvailableText);
                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(string3);
                int indexOf2 = string3.indexOf(42);
                int lastIndexOf2 = string3.lastIndexOf(42);
                if (indexOf2 >= 0 && lastIndexOf2 >= 0 && indexOf2 != lastIndexOf2) {
                    spannableStringBuilder4.replace(lastIndexOf2, lastIndexOf2 + 1, (CharSequence) "");
                    spannableStringBuilder4.replace(indexOf2, indexOf2 + 1, (CharSequence) "");
                    spannableStringBuilder4.setSpan(new URLSpanNoUnderline("tg://settings/folders"), indexOf2, lastIndexOf2 - 1, 33);
                }
                this.subinfoTextView.setText(spannableStringBuilder4);
                this.subinfoTextView.setVisibility(0);
                this.subinfoTextView.setSingleLine(false);
                this.subinfoTextView.setMaxLines(2);
                this.undoButton.setVisibility(0);
                this.undoImageView.setVisibility(8);
                this.leftImageView.setVisibility(0);
                this.leftImageView.setProgress(0.0f);
                this.leftImageView.playAnimation();
            } else if (i11 == 16 || i11 == 17) {
                this.timeLeft = 4000L;
                this.infoTextView.setTextSize(1, 14.0f);
                this.infoTextView.setGravity(16);
                this.infoTextView.setMinHeight(AndroidUtilities.dp(30.0f));
                String str7 = (String) obj;
                if ("🎲".equals(str7)) {
                    this.infoTextView.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.DiceInfo2)));
                    this.leftImageView.setImageResource(R.drawable.dice);
                } else {
                    if ("🎯".equals(str7)) {
                        this.infoTextView.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.DartInfo)));
                    } else {
                        String serverString = LocaleController.getServerString("DiceEmojiInfo_" + str7);
                        if (!TextUtils.isEmpty(serverString)) {
                            LinkSpanDrawable.LinksTextView linksTextView3 = this.infoTextView;
                            linksTextView3.setText(Emoji.replaceEmoji(serverString, linksTextView3.getPaint().getFontMetricsInt(), false));
                        } else {
                            this.infoTextView.setText(Emoji.replaceEmoji(LocaleController.formatString("DiceEmojiInfo", R.string.DiceEmojiInfo, str7), this.infoTextView.getPaint().getFontMetricsInt(), false));
                        }
                    }
                    this.leftImageView.setImageDrawable(Emoji.getEmojiDrawable(str7));
                    this.leftImageView.setScaleType(ImageView.ScaleType.FIT_XY);
                    layoutParams.topMargin = AndroidUtilities.dp(14.0f);
                    layoutParams.bottomMargin = AndroidUtilities.dp(14.0f);
                    layoutParams2.leftMargin = AndroidUtilities.dp(14.0f);
                    layoutParams2.width = AndroidUtilities.dp(26.0f);
                    layoutParams2.height = AndroidUtilities.dp(26.0f);
                }
                this.undoTextView.setText(LocaleController.getString(R.string.SendDice));
                if (this.currentAction == 16) {
                    dp = ((int) Math.ceil(this.undoTextView.getPaint().measureText(this.undoTextView.getText().toString()))) + AndroidUtilities.dp(26.0f);
                    this.undoTextView.setVisibility(0);
                    this.undoTextView.setTextColor(getThemedColor(Theme.key_undo_cancelColor));
                    this.undoImageView.setVisibility(8);
                    this.undoButton.setVisibility(0);
                } else {
                    dp = AndroidUtilities.dp(8.0f);
                    this.undoTextView.setVisibility(8);
                    this.undoButton.setVisibility(8);
                }
                layoutParams.leftMargin = AndroidUtilities.dp(58.0f);
                layoutParams.rightMargin = dp;
                layoutParams.topMargin = AndroidUtilities.dp(6.0f);
                layoutParams.bottomMargin = AndroidUtilities.dp(7.0f);
                layoutParams.height = -1;
                this.subinfoTextView.setVisibility(8);
                this.leftImageView.setVisibility(0);
            } else if (i11 == 18) {
                this.timeLeft = Math.max(4000, Math.min((r0.length() / 50) * 1600, 10000));
                this.infoTextView.setTextSize(1, 14.0f);
                this.infoTextView.setGravity(16);
                this.infoTextView.setText((CharSequence) obj);
                this.undoTextView.setVisibility(8);
                this.undoButton.setVisibility(8);
                layoutParams.leftMargin = AndroidUtilities.dp(58.0f);
                layoutParams.rightMargin = AndroidUtilities.dp(8.0f);
                layoutParams.topMargin = AndroidUtilities.dp(6.0f);
                layoutParams.bottomMargin = AndroidUtilities.dp(7.0f);
                layoutParams.height = -1;
                layoutParams2.gravity = 51;
                int dp3 = AndroidUtilities.dp(8.0f);
                layoutParams2.bottomMargin = dp3;
                layoutParams2.topMargin = dp3;
                this.leftImageView.setVisibility(0);
                this.leftImageView.setAnimation(R.raw.chats_infotip, 36, 36);
                this.leftImageView.setProgress(0.0f);
                this.leftImageView.playAnimation();
                this.infoTextView.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
            } else if (i11 == 12) {
                this.infoTextView.setText(LocaleController.getString(R.string.ColorThemeChanged));
                this.leftImageView.setImageResource(R.drawable.toast_pallete);
                layoutParams.leftMargin = AndroidUtilities.dp(58.0f);
                layoutParams.rightMargin = AndroidUtilities.dp(48.0f);
                layoutParams.topMargin = AndroidUtilities.dp(6.0f);
                ((FrameLayout.LayoutParams) this.subinfoTextView.getLayoutParams()).rightMargin = AndroidUtilities.dp(48.0f);
                String string4 = LocaleController.getString(R.string.ColorThemeChangedInfo);
                SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(string4);
                int indexOf3 = string4.indexOf(42);
                int lastIndexOf3 = string4.lastIndexOf(42);
                if (indexOf3 >= 0 && lastIndexOf3 >= 0 && indexOf3 != lastIndexOf3) {
                    spannableStringBuilder5.replace(lastIndexOf3, lastIndexOf3 + 1, (CharSequence) "");
                    spannableStringBuilder5.replace(indexOf3, indexOf3 + 1, (CharSequence) "");
                    spannableStringBuilder5.setSpan(new URLSpanNoUnderline("tg://settings/themes"), indexOf3, lastIndexOf3 - 1, 33);
                }
                this.subinfoTextView.setText(spannableStringBuilder5);
                this.subinfoTextView.setVisibility(0);
                this.subinfoTextView.setSingleLine(false);
                this.subinfoTextView.setMaxLines(2);
                this.undoTextView.setVisibility(8);
                this.undoButton.setVisibility(0);
                this.leftImageView.setVisibility(0);
            } else if (i11 == 84) {
                this.infoTextView.setVisibility(0);
                this.infoTextView.setTextSize(1, 15.0f);
                this.infoTextView.setTypeface(Typeface.DEFAULT);
                this.infoTextView.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.UnlockPremiumTranscriptionHint)));
                this.leftImageView.setVisibility(0);
                this.leftImageView.setAnimation(R.raw.voice_to_text, 36, 36);
                this.leftImageView.setProgress(0.0f);
                this.leftImageView.playAnimation();
                this.undoTextView.setText(LocaleController.getString(R.string.PremiumMore));
                layoutParams.leftMargin = AndroidUtilities.dp(58.0f);
                layoutParams.rightMargin = ((int) Math.ceil(this.undoTextView.getPaint().measureText(this.undoTextView.getText().toString()))) + AndroidUtilities.dp(26.0f);
                int dp4 = AndroidUtilities.dp(6.0f);
                layoutParams.bottomMargin = dp4;
                layoutParams.topMargin = dp4;
                layoutParams.height = -2;
                this.avatarImageView.setVisibility(8);
                this.subinfoTextView.setVisibility(8);
                this.undoTextView.setVisibility(0);
                this.undoButton.setVisibility(0);
                this.undoImageView.setVisibility(8);
            } else if (i11 == 85) {
                this.infoTextView.setVisibility(0);
                this.infoTextView.setTextSize(1, 15.0f);
                this.infoTextView.setTypeface(AndroidUtilities.bold());
                this.infoTextView.setText(LocaleController.getString(R.string.SwipeToReplyHint));
                this.leftImageView.setVisibility(0);
                this.leftImageView.setAnimation(R.raw.hint_swipe_reply, 64, 64);
                this.leftImageView.setProgress(0.0f);
                this.leftImageView.playAnimation();
                this.subinfoTextView.setVisibility(0);
                this.subinfoTextView.setText(LocaleController.getString(R.string.SwipeToReplyHintMessage));
                layoutParams.leftMargin = AndroidUtilities.dp(58.0f);
                layoutParams.rightMargin = ((int) Math.ceil(this.undoTextView.getPaint().measureText(this.undoTextView.getText().toString()))) + AndroidUtilities.dp(26.0f);
                layoutParams.topMargin = AndroidUtilities.dp(6.0f);
                layoutParams.height = -2;
                this.avatarImageView.setVisibility(8);
                this.undoButton.setVisibility(8);
            } else if (i11 == 90 || i11 == 91 || i11 == 92 || i11 == 93 || i11 == 94) {
                switch (i11) {
                    case 90:
                        this.infoTextView.setText(LocaleController.formatPluralString("BoostingSelectUpToWarningChannelsGroupsPlural", (int) BoostRepository.giveawayAddPeersMax(), new Object[0]));
                        break;
                    case 91:
                        this.infoTextView.setText(LocaleController.getString(R.string.BoostingSelectUpToWarningUsers));
                        break;
                    case 92:
                        this.infoTextView.setText(LocaleController.formatPluralString("BoostingSelectUpToWarningCountriesPlural", (int) BoostRepository.giveawayCountriesMax(), new Object[0]));
                        break;
                    case 93:
                        this.infoTextView.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingWaitWarningPlural", BoostRepository.boostsPerSentGift(), new Object[0])));
                        break;
                    case 94:
                        this.infoTextView.setText(LocaleController.getString(R.string.BoostingOnlyRecipientCode));
                        break;
                }
                layoutParams.leftMargin = AndroidUtilities.dp(58.0f);
                layoutParams.rightMargin = AndroidUtilities.dp(8.0f);
                this.infoTextView.setTextSize(1, 15.0f);
                this.undoButton.setVisibility(8);
                this.infoTextView.setTypeface(Typeface.DEFAULT);
                this.subinfoTextView.setVisibility(8);
                this.leftImageView.setVisibility(0);
                this.leftImageView.setAnimation(R.raw.chats_infotip, 36, 36);
                this.leftImageView.setProgress(0.0f);
                this.leftImageView.playAnimation();
            } else if (i11 == 2 || i11 == 4) {
                if (i == 2) {
                    this.infoTextView.setText(LocaleController.getString(R.string.ChatArchived));
                } else {
                    this.infoTextView.setText(LocaleController.getString(R.string.ChatsArchived));
                }
                layoutParams.leftMargin = AndroidUtilities.dp(58.0f);
                layoutParams.topMargin = AndroidUtilities.dp(13.0f);
                layoutParams.rightMargin = 0;
                this.infoTextView.setTextSize(1, 15.0f);
                this.undoButton.setVisibility(0);
                this.infoTextView.setTypeface(Typeface.DEFAULT);
                this.subinfoTextView.setVisibility(8);
                this.leftImageView.setVisibility(0);
                this.leftImageView.setAnimation(R.raw.chats_archived, 36, 36);
                this.leftImageView.setProgress(0.0f);
                this.leftImageView.playAnimation();
            } else if (i == 82) {
                layoutParams.leftMargin = AndroidUtilities.dp(58.0f);
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                this.infoTextView.setText(LocaleController.getString(photoEntry.isVideo ? R.string.AttachMediaVideoDeselected : R.string.AttachMediaPhotoDeselected));
                this.undoButton.setVisibility(0);
                this.infoTextView.setTextSize(1, 15.0f);
                this.infoTextView.setTypeface(Typeface.DEFAULT);
                this.subinfoTextView.setVisibility(8);
                this.avatarImageView.setVisibility(0);
                this.avatarImageView.setRoundRadius(AndroidUtilities.dp(2.0f));
                String str8 = photoEntry.thumbPath;
                if (str8 != null) {
                    this.avatarImageView.setImage(str8, null, Theme.chat_attachEmptyDrawable);
                } else if (photoEntry.path != null) {
                    this.avatarImageView.setOrientation(photoEntry.orientation, photoEntry.invert, true);
                    if (photoEntry.isVideo) {
                        this.avatarImageView.setImage("vthumb://" + photoEntry.imageId + ":" + photoEntry.path, null, Theme.chat_attachEmptyDrawable);
                    } else {
                        this.avatarImageView.setImage("thumb://" + photoEntry.imageId + ":" + photoEntry.path, null, Theme.chat_attachEmptyDrawable);
                    }
                } else {
                    this.avatarImageView.setImageDrawable(Theme.chat_attachEmptyDrawable);
                }
            } else {
                layoutParams.leftMargin = AndroidUtilities.dp(45.0f);
                layoutParams.topMargin = AndroidUtilities.dp(13.0f);
                layoutParams.rightMargin = 0;
                this.infoTextView.setTextSize(1, 15.0f);
                this.undoButton.setVisibility(0);
                LinkSpanDrawable.LinksTextView linksTextView4 = this.infoTextView;
                Typeface typeface = Typeface.DEFAULT;
                linksTextView4.setTypeface(typeface);
                this.subinfoTextView.setVisibility(8);
                this.leftImageView.setVisibility(8);
                int i21 = this.currentAction;
                if (i21 == 88) {
                    String str9 = (String) obj;
                    int intValue5 = ((Integer) obj2).intValue();
                    if (intValue5 > 0) {
                        int ceil2 = ((int) Math.ceil(this.undoTextView.getPaint().measureText(this.undoTextView.getText().toString()))) + AndroidUtilities.dp(26.0f);
                        layoutParams.leftMargin = AndroidUtilities.dp(48.0f);
                        layoutParams.rightMargin = ceil2;
                        layoutParams.topMargin = AndroidUtilities.dp(6.0f);
                        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.subinfoTextView.getLayoutParams();
                        layoutParams3.leftMargin = AndroidUtilities.dp(48.0f);
                        layoutParams3.rightMargin = ceil2;
                        this.infoTextView.setText(LocaleController.formatString("FolderLinkDeletedTitle", R.string.FolderLinkDeletedTitle, str9));
                        this.infoTextView.setTypeface(AndroidUtilities.bold());
                        this.subinfoTextView.setVisibility(0);
                        this.subinfoTextView.setText(LocaleController.formatPluralString("FolderLinkDeletedSubtitle", intValue5, new Object[0]));
                    } else {
                        this.infoTextView.setTypeface(typeface);
                        LinkSpanDrawable.LinksTextView linksTextView5 = this.infoTextView;
                        int i22 = R.string.FolderLinkDeleted;
                        if (str9 == null) {
                            str9 = "";
                        }
                        linksTextView5.setText(AndroidUtilities.replaceTags(LocaleController.formatString("FolderLinkDeleted", i22, str9.replace('*', (char) 10033))));
                    }
                } else if (i21 == 81 || i21 == 0 || i21 == 26) {
                    this.infoTextView.setText(LocaleController.getString(R.string.HistoryClearedUndo));
                } else if (i21 == 27) {
                    this.infoTextView.setText(LocaleController.getString(R.string.ChatsDeletedUndo));
                } else if (i21 == 95) {
                    if (DialogObject.isChatDialog(longValue)) {
                        TLRPC.Chat chat7 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-longValue));
                        if (ChatObject.isMonoForum(chat7)) {
                            this.infoTextView.setText(LocaleController.getString(R.string.MonoforumDeletedUndo));
                        } else if (ChatObject.isChannel(chat7) && !chat7.megagroup) {
                            this.infoTextView.setText(LocaleController.getString(R.string.ChannelLeftUndo));
                        } else {
                            this.infoTextView.setText(LocaleController.getString(R.string.GroupLeftUndo));
                        }
                    } else {
                        this.infoTextView.setText(LocaleController.getString(R.string.ChatDeletedUndo));
                    }
                } else if (DialogObject.isChatDialog(longValue)) {
                    TLRPC.Chat chat8 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-longValue));
                    if (ChatObject.isMonoForum(chat8)) {
                        this.infoTextView.setText(LocaleController.getString(R.string.MonoforumDeletedUndo));
                    } else if (ChatObject.isChannel(chat8) && !chat8.megagroup) {
                        this.infoTextView.setText(LocaleController.getString(R.string.ChannelDeletedUndo));
                    } else {
                        this.infoTextView.setText(LocaleController.getString(R.string.GroupDeletedUndo));
                    }
                } else {
                    this.infoTextView.setText(LocaleController.getString(R.string.ChatDeletedUndo));
                }
                if (this.currentAction != 81) {
                    for (int i23 = 0; i23 < arrayList.size(); i23++) {
                        MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
                        long longValue2 = ((Long) arrayList.get(i23)).longValue();
                        int i24 = this.currentAction;
                        messagesController.addDialogAction(longValue2, i24 == 0 || i24 == 26);
                    }
                }
            }
        }
        z = false;
        StringBuilder sb22 = new StringBuilder();
        sb22.append((Object) this.infoTextView.getText());
        if (this.subinfoTextView.getVisibility() == 0) {
        }
        sb22.append(this.subinfoTextView.getVisibility() == 0 ? ". " + ((Object) this.subinfoTextView.getText()) : "");
        AndroidUtilities.makeAccessibilityAnnouncement(sb22.toString());
        if (isMultilineSubInfo()) {
        }
        if (getVisibility() != 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showWithAction$2(View view) {
        hide(false, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showWithAction$6(TLRPC.Message message, View view) {
        hide(true, 1);
        TLRPC.TL_payments_getPaymentReceipt tL_payments_getPaymentReceipt = new TLRPC.TL_payments_getPaymentReceipt();
        tL_payments_getPaymentReceipt.msg_id = message.id;
        tL_payments_getPaymentReceipt.peer = this.parentFragment.getMessagesController().getInputPeer(message.peer_id);
        this.parentFragment.getConnectionsManager().sendRequest(tL_payments_getPaymentReceipt, new RequestDelegate() { // from class: org.telegram.ui.Components.UndoView$$ExternalSyntheticLambda6
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                UndoView.this.lambda$showWithAction$5(tLObject, tL_error);
            }
        }, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showWithAction$5(final TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Components.UndoView$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                UndoView.this.lambda$showWithAction$4(tLObject);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showWithAction$4(TLObject tLObject) {
        if (tLObject instanceof TLRPC.PaymentReceipt) {
            this.parentFragment.presentFragment(new PaymentFormActivity((TLRPC.PaymentReceipt) tLObject));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showWithAction$7() {
        try {
            this.leftImageView.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }

    public void setEnterOffsetMargin(int i) {
        this.enterOffsetMargin = i;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(this.undoViewHeight, TLObject.FLAG_30));
        this.backgroundDrawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        if (this.additionalTranslationY != 0.0f) {
            canvas.save();
            float measuredHeight = (getMeasuredHeight() - this.enterOffset) + AndroidUtilities.dp(9.0f);
            if (measuredHeight > 0.0f) {
                canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), measuredHeight);
                super.dispatchDraw(canvas);
            }
            canvas.restore();
            return;
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.additionalTranslationY != 0.0f) {
            canvas.save();
            float measuredHeight = (getMeasuredHeight() - this.enterOffset) + this.enterOffsetMargin + AndroidUtilities.dp(1.0f);
            if (measuredHeight > 0.0f) {
                canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), measuredHeight);
                super.dispatchDraw(canvas);
            }
            this.backgroundDrawable.draw(canvas);
            canvas.restore();
        } else {
            this.backgroundDrawable.draw(canvas);
        }
        int i = this.currentAction;
        if (i == 1 || i == 95 || i == 0 || i == 27 || i == 26 || i == 81 || i == 88) {
            int ceil = this.timeLeft > 0 ? (int) Math.ceil(r10 / 1000.0f) : 0;
            if (this.prevSeconds != ceil) {
                this.prevSeconds = ceil;
                this.timeLeftString = String.format("%d", Integer.valueOf(Math.max(1, ceil)));
                StaticLayout staticLayout = this.timeLayout;
                if (staticLayout != null) {
                    this.timeLayoutOut = staticLayout;
                    this.timeReplaceProgress = 0.0f;
                    this.textWidthOut = this.textWidth;
                }
                this.textWidth = (int) Math.ceil(this.textPaint.measureText(r2));
                this.timeLayout = new StaticLayout(this.timeLeftString, this.textPaint, ConnectionsManager.DEFAULT_DATACENTER_ID, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            }
            float f = this.timeReplaceProgress;
            if (f < 1.0f) {
                float f2 = f + 0.10666667f;
                this.timeReplaceProgress = f2;
                if (f2 > 1.0f) {
                    this.timeReplaceProgress = 1.0f;
                } else {
                    invalidate();
                }
            }
            int alpha = this.textPaint.getAlpha();
            if (this.timeLayoutOut != null) {
                float f3 = this.timeReplaceProgress;
                if (f3 < 1.0f) {
                    this.textPaint.setAlpha((int) (alpha * (1.0f - f3)));
                    canvas.save();
                    canvas.translate(this.rect.centerX() - (this.textWidth / 2), AndroidUtilities.dp(17.2f) + (AndroidUtilities.dp(10.0f) * this.timeReplaceProgress));
                    this.timeLayoutOut.draw(canvas);
                    this.textPaint.setAlpha(alpha);
                    canvas.restore();
                }
            }
            if (this.timeLayout != null) {
                float f4 = this.timeReplaceProgress;
                if (f4 != 1.0f) {
                    this.textPaint.setAlpha((int) (alpha * f4));
                }
                canvas.save();
                canvas.translate(this.rect.centerX() - (this.textWidth / 2), AndroidUtilities.dp(17.2f) - (AndroidUtilities.dp(10.0f) * (1.0f - this.timeReplaceProgress)));
                this.timeLayout.draw(canvas);
                if (this.timeReplaceProgress != 1.0f) {
                    this.textPaint.setAlpha(alpha);
                }
                canvas.restore();
            }
            canvas.drawArc(this.rect, -90.0f, (-360.0f) * (this.timeLeft / 5000.0f), false, this.progressPaint);
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.timeLeft - (elapsedRealtime - this.lastUpdateTime);
        this.timeLeft = j;
        this.lastUpdateTime = elapsedRealtime;
        if (j <= 0) {
            hide(true, this.hideAnimationType);
        }
        if (this.currentAction != 82) {
            invalidate();
        }
    }

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        this.infoTextView.invalidate();
        this.leftImageView.invalidate();
    }

    public void setInfoText(CharSequence charSequence) {
        this.infoText = charSequence;
    }

    public void setHideAnimationType(int i) {
        this.hideAnimationType = i;
    }

    public float getEnterOffset() {
        return this.enterOffset;
    }

    public void setEnterOffset(float f) {
        if (this.enterOffset != f) {
            this.enterOffset = f;
            updatePosition();
        }
    }

    private void updatePosition() {
        setTranslationY(((this.enterOffset - this.enterOffsetMargin) + AndroidUtilities.dp(8.0f)) - this.additionalTranslationY);
        invalidate();
    }

    @Override // android.view.View
    public Drawable getBackground() {
        return this.backgroundDrawable;
    }

    private int getThemedColor(int i) {
        return Theme.getColor(i, this.resourcesProvider);
    }
}
