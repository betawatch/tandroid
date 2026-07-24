package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.util.Base64;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.BaseCell;
import org.telegram.ui.Cells.ChatActionCell;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Cells.TextSelectionHelper;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.MessagePreviewView;
import org.telegram.ui.Components.MessagePrivateSeenView;
import org.telegram.ui.Components.Reactions.ReactionsLayoutInBubble;
import org.telegram.ui.Components.ReactionsContainerLayout;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.ScrimOptions;
import org.telegram.ui.Components.ViewPagerFixed;
import org.telegram.ui.Components.blur3.BlurredBackgroundDrawableViewFactory;
import org.telegram.ui.Components.blur3.drawable.color.impl.BlurredBackgroundProviderImpl;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceBitmap;
import org.telegram.ui.Components.blur3.utils.Blur3Utils;
import org.telegram.ui.Components.chat.ChatActivityDraftMessageMeasureController;
import org.telegram.ui.Components.chat.ViewPositionWatcher;
import org.telegram.ui.Components.poll.PollUtils;
import org.telegram.ui.Components.poll.RecentVotersCell;
import org.telegram.ui.PollItemMenu;

/* loaded from: classes4.dex */
public class PollItemMenu extends Dialog {
    private Bitmap blurBitmap;
    private Paint blurBitmapPaint;
    private BitmapShader blurBitmapShader;
    private Matrix blurMatrix;
    private ChatMessageCell cell;
    private float clipBottom;
    private float clipTop;
    private FrameLayout containerView;
    public final Context context;
    private Runnable dismissListener;
    private boolean dismissing;
    private boolean dismissingWithAlpha;
    private float dtx1;
    private float dtx2;
    private float dty1;
    private float dty2;
    private boolean hasDestTranslation;
    private boolean hasTranslation;
    private float heightdiff;
    private TextView hintTextView;
    private final BlurredBackgroundDrawableViewFactory iBlur3Factory;
    private final BlurredBackgroundSourceBitmap iBlur3SourceBitmap;
    private Insets insets;
    private boolean isOut;
    private FrameLayout menuContainer;
    private MessageObject messageObject;
    private View messageOptionsView;
    private float messageOptionsViewMaxWidth;
    private ChatMessageCell myCell;
    private ChatMessageCell myTaskCell;
    private boolean open;
    private ValueAnimator open2Animator;
    private ValueAnimator openAnimator;
    private float openProgress;
    private float openProgress2;
    private boolean pollVoted;
    private ReactionsContainerLayout reactionsView;
    public final Theme.ResourcesProvider resourcesProvider;
    private boolean setCellInvisible;
    private boolean setTaskInvisible;
    private MessagePreviewView.TabsView tabsView;
    private byte[] taskId;
    private View taskOptionsView;
    private float taskOptionsViewMaxWidth;
    private float tx;
    private float ty;
    private ViewPagerFixed viewPager;
    private FrameLayout windowView;

    public PollItemMenu(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context, R.style.TransparentDialog);
        this.insets = Insets.NONE;
        this.clipTop = 0.0f;
        this.clipBottom = 0.0f;
        this.taskOptionsViewMaxWidth = -1.0f;
        this.messageOptionsViewMaxWidth = -1.0f;
        this.dismissing = false;
        this.context = context;
        this.resourcesProvider = resourcesProvider;
        FrameLayout frameLayout = new FrameLayout(context) { // from class: org.telegram.ui.PollItemMenu.1
            @Override // android.view.ViewGroup, android.view.View
            protected void dispatchDraw(Canvas canvas) {
                if (PollItemMenu.this.openProgress > 0.0f && PollItemMenu.this.blurBitmapPaint != null) {
                    PollItemMenu.this.blurMatrix.reset();
                    float width = getWidth() / PollItemMenu.this.blurBitmap.getWidth();
                    PollItemMenu.this.blurMatrix.postScale(width, width);
                    PollItemMenu.this.blurBitmapShader.setLocalMatrix(PollItemMenu.this.blurMatrix);
                    PollItemMenu.this.blurBitmapPaint.setAlpha((int) (PollItemMenu.this.openProgress * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), PollItemMenu.this.blurBitmapPaint);
                }
                if (PollItemMenu.this.setCellInvisible && PollItemMenu.this.cell != null) {
                    PollItemMenu.this.cell.setVisibility(4);
                    PollItemMenu.this.setCellInvisible = false;
                }
                if (PollItemMenu.this.setTaskInvisible && PollItemMenu.this.cell != null) {
                    PollItemMenu.this.cell.doNotDrawPollId = PollItemMenu.this.taskId;
                    PollItemMenu.this.cell.invalidate();
                    PollItemMenu.this.setTaskInvisible = false;
                }
                super.dispatchDraw(canvas);
            }

            @Override // android.view.ViewGroup, android.view.View
            public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    PollItemMenu.this.dismiss();
                    return true;
                }
                return super.dispatchKeyEventPreIme(keyEvent);
            }

            @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
            protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
                super.onLayout(z, i, i2, i3, i4);
                PollItemMenu.this.setupTranslation();
            }

            @Override // android.view.View
            protected void onSizeChanged(int i, int i2, int i3, int i4) {
                super.onSizeChanged(i, i2, i3, i4);
                PollItemMenu.this.checkBitmapMatrix();
            }
        };
        this.windowView = frameLayout;
        frameLayout.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.PollItemMenu$$ExternalSyntheticLambda13
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PollItemMenu.this.lambda$new$0(view);
            }
        });
        BlurredBackgroundSourceBitmap blurredBackgroundSourceBitmap = new BlurredBackgroundSourceBitmap();
        this.iBlur3SourceBitmap = blurredBackgroundSourceBitmap;
        BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory = new BlurredBackgroundDrawableViewFactory(blurredBackgroundSourceBitmap);
        this.iBlur3Factory = blurredBackgroundDrawableViewFactory;
        blurredBackgroundDrawableViewFactory.setSourceRootView(new ViewPositionWatcher(this.windowView), this.windowView);
        FrameLayout frameLayout2 = new FrameLayout(context) { // from class: org.telegram.ui.PollItemMenu.2
            @Override // android.view.ViewGroup
            protected boolean drawChild(Canvas canvas, View view, long j) {
                if (view == PollItemMenu.this.myCell || view == PollItemMenu.this.myTaskCell) {
                    canvas.save();
                    canvas.clipRect(0.0f, AndroidUtilities.lerp(PollItemMenu.this.clipTop, 0.0f, PollItemMenu.this.openProgress), getWidth(), AndroidUtilities.lerp(PollItemMenu.this.clipBottom, getHeight(), PollItemMenu.this.openProgress));
                    boolean drawChild = super.drawChild(canvas, view, j);
                    canvas.restore();
                    return drawChild;
                }
                return super.drawChild(canvas, view, j);
            }
        };
        this.containerView = frameLayout2;
        frameLayout2.setClipToPadding(false);
        this.windowView.addView(this.containerView, LayoutHelper.createFrame(-1, -1, 119));
        ViewPagerFixed viewPagerFixed = new ViewPagerFixed(context) { // from class: org.telegram.ui.PollItemMenu.3
            @Override // org.telegram.ui.Components.ViewPagerFixed
            public void onTabAnimationUpdate(boolean z) {
                PollItemMenu.this.updateTranslation();
            }
        };
        this.viewPager = viewPagerFixed;
        viewPagerFixed.setAdapter(new 4(context));
        this.containerView.addView(this.viewPager, LayoutHelper.createFrame(-1, -1, 119));
        FrameLayout frameLayout3 = new FrameLayout(context) { // from class: org.telegram.ui.PollItemMenu.5
            @Override // android.widget.FrameLayout, android.view.View
            protected void onMeasure(int i, int i2) {
                int size = View.MeasureSpec.getSize(i);
                int size2 = View.MeasureSpec.getSize(i2);
                PollItemMenu.this.updateTranslation();
                for (int i3 = 0; i3 < getChildCount(); i3++) {
                    View childAt = getChildAt(i3);
                    if (childAt != PollItemMenu.this.messageOptionsView || PollItemMenu.this.messageOptionsViewMaxWidth <= 0.0f) {
                        if (childAt != PollItemMenu.this.taskOptionsView || PollItemMenu.this.taskOptionsViewMaxWidth <= 0.0f) {
                            if (childAt == PollItemMenu.this.reactionsView) {
                                childAt.measure(View.MeasureSpec.makeMeasureSpec(PollItemMenu.this.reactionsView.getTotalWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_31));
                            } else {
                                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_31));
                            }
                        } else {
                            PollItemMenu.this.taskOptionsView.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) PollItemMenu.this.taskOptionsViewMaxWidth), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_31));
                        }
                    } else {
                        PollItemMenu.this.messageOptionsView.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) PollItemMenu.this.messageOptionsViewMaxWidth), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_31));
                    }
                }
                setMeasuredDimension(size, size2);
            }
        };
        this.menuContainer = frameLayout3;
        this.containerView.addView(frameLayout3, LayoutHelper.createFrame(-1, -1, 119));
        MessagePreviewView.TabsView tabsView = new MessagePreviewView.TabsView(context, resourcesProvider);
        this.tabsView = tabsView;
        tabsView.addTab(0, LocaleController.getString(R.string.PollMenuTabOption));
        this.tabsView.addTab(1, LocaleController.getString(R.string.PollMenuTabPoll));
        this.containerView.addView(this.tabsView, LayoutHelper.createFrame(-1, 66, 80));
        MessagePreviewView.TabsView tabsView2 = this.tabsView;
        ViewPagerFixed viewPagerFixed2 = this.viewPager;
        Objects.requireNonNull(viewPagerFixed2);
        tabsView2.setOnTabClick(new PollItemMenu$$ExternalSyntheticLambda14(viewPagerFixed2));
        MessagePreviewView.TabsView tabsView3 = this.tabsView;
        tabsView3.setBackground(blurredBackgroundDrawableViewFactory.create(tabsView3).setColorProvider(BlurredBackgroundProviderImpl.scrimMenuBackground(resourcesProvider)).setHasPadding(true).setPadding(AndroidUtilities.dp(8.0f)).setRadius(AndroidUtilities.dp(16.0f)));
        TextView textView = new TextView(context);
        this.hintTextView = textView;
        textView.setTextSize(1, 13.0f);
        this.hintTextView.setTextColor(this.tabsView.getColor());
        this.hintTextView.setText(LocaleController.getString(R.string.PollMenuHint));
        this.hintTextView.setGravity(17);
        this.containerView.addView(this.hintTextView, LayoutHelper.createFrame(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 66.0f));
        ViewCompat.setOnApplyWindowInsetsListener(this.windowView, new OnApplyWindowInsetsListener() { // from class: org.telegram.ui.PollItemMenu.6
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                PollItemMenu.this.insets = windowInsetsCompat.getInsetsIgnoringVisibility(WindowInsetsCompat.Type.systemBars());
                PollItemMenu.this.containerView.setPadding(PollItemMenu.this.insets.left, PollItemMenu.this.insets.top, PollItemMenu.this.insets.right, PollItemMenu.this.insets.bottom);
                PollItemMenu.this.windowView.requestLayout();
                return WindowInsetsCompat.CONSUMED;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(View view) {
        dismiss();
    }

    class 4 extends ViewPagerFixed.Adapter {
        final /* synthetic */ Context val$context;

        @Override // org.telegram.ui.Components.ViewPagerFixed.Adapter
        public void bindView(View view, int i, int i2) {
        }

        @Override // org.telegram.ui.Components.ViewPagerFixed.Adapter
        public int getItemCount() {
            return 2;
        }

        4(Context context) {
            this.val$context = context;
        }

        @Override // org.telegram.ui.Components.ViewPagerFixed.Adapter
        public View createView(int i) {
            FrameLayout frameLayout = new FrameLayout(this.val$context);
            frameLayout.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.PollItemMenu$4$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PollItemMenu.4.this.lambda$createView$0(view);
                }
            });
            return frameLayout;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$createView$0(View view) {
            PollItemMenu.this.dismiss(true);
        }
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(R.style.DialogNoAnimation);
        setContentView(this.windowView, new ViewGroup.LayoutParams(-1, -1));
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        int i = attributes.flags & (-3);
        attributes.softInputMode = 48;
        attributes.flags = i | (-1945959040);
        AndroidUtilities.applyEdgeToEdgeLayoutParams(attributes);
        window.setAttributes(attributes);
        this.windowView.setSystemUiVisibility(1284);
        AndroidUtilities.setLightNavigationBar(this.windowView, !Theme.isCurrentThemeDark());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkBitmapMatrix() {
        Blur3Utils.checkBitmapSourceMatrixScale(this.iBlur3SourceBitmap, this.windowView);
        this.iBlur3Factory.invalidateAllLinkedViews();
    }

    public void setCell(final BaseFragment baseFragment, ChatMessageCell chatMessageCell, final byte[] bArr) {
        ChatActivity chatActivity;
        final TLRPC.PollAnswer pollAnswer;
        boolean z;
        TLRPC.PollAnswerVoters pollAnswerVoters;
        ArrayList arrayList;
        boolean z2;
        ArrayList<TLRPC.PollAnswerVoters> arrayList2;
        this.cell = chatMessageCell;
        this.taskId = bArr;
        ChatActivity chatActivity2 = baseFragment instanceof ChatActivity ? (ChatActivity) baseFragment : null;
        MessageObject messageObject = chatMessageCell != null ? chatMessageCell.getMessageObject() : null;
        this.messageObject = messageObject;
        this.isOut = messageObject != null && messageObject.isOutOwner();
        if (this.cell != null) {
            this.clipTop = chatActivity2 == null ? 0.0f : chatActivity2.getChatListViewPadding() - AndroidUtilities.dp(4.0f);
            this.clipBottom = chatMessageCell.parentBoundsBottom;
            if (chatMessageCell.getParent() instanceof View) {
                View view = (View) chatMessageCell.getParent();
                this.clipTop += view.getY();
                this.clipBottom += view.getY();
            }
            final int width = this.cell.getWidth();
            final int height = this.cell.getHeight();
            this.heightdiff = height - this.cell.getHeight();
            chatActivity = chatActivity2;
            ChatMessageCell chatMessageCell2 = new ChatMessageCell(getContext(), UserConfig.selectedAccount, false, null, this.cell.getResourcesProvider()) { // from class: org.telegram.ui.PollItemMenu.7
                private final Path clipPath = new Path();
                private final Paint shadowPaint = new Paint(1);

                @Override // org.telegram.ui.Cells.ChatMessageCell, android.view.View
                public void setPressed(boolean z3) {
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell, android.view.View
                protected void onDraw(Canvas canvas) {
                    canvas.save();
                    int pollIndex = getPollIndex(bArr);
                    float pollButtonTop = getPollButtonTop(pollIndex);
                    float pollButtonBottom = getPollButtonBottom(pollIndex);
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(getPollButtonsLeft(), pollButtonTop, getPollButtonsRight(), pollButtonBottom);
                    rectF.top += AndroidUtilities.lerp(AndroidUtilities.dp(3.0f), PollItemMenu.this.pollVoted ? -AndroidUtilities.dp(3.0f) : 0.0f, PollItemMenu.this.openProgress);
                    float f = rectF.bottom;
                    boolean z3 = PollItemMenu.this.pollVoted;
                    float dp = AndroidUtilities.dp(3.0f);
                    if (!z3) {
                        dp = AndroidUtilities.lerp(dp, 0.0f, PollItemMenu.this.openProgress);
                    }
                    rectF.bottom = f + dp;
                    this.clipPath.rewind();
                    this.clipPath.addRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), Path.Direction.CW);
                    this.shadowPaint.setColor(0);
                    this.shadowPaint.setShadowLayer(AndroidUtilities.dp(2.0f), 0.0f, AndroidUtilities.dp(0.66f), Theme.multAlpha(-16777216, PollItemMenu.this.openProgress * 0.2f));
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), this.shadowPaint);
                    canvas.clipPath(this.clipPath);
                    super.onDraw(canvas);
                    canvas.restore();
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell, android.view.View
                protected void onMeasure(int i, int i2) {
                    setMeasuredDimension(width, height);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell
                public void drawOverlays(Canvas canvas) {
                    this.firstVisiblePollButton = 0;
                    this.lastVisiblePollButton = this.pollButtons.size() - 1;
                    this.resultsPollButtonOffset = (-AndroidUtilities.dp(7.0f)) * PollItemMenu.this.openProgress;
                    super.drawOverlays(canvas);
                }
            };
            this.myTaskCell = chatMessageCell2;
            this.cell.copyParamsTo(chatMessageCell2);
            this.myTaskCell.copySpoilerEffect2AttachIndexFrom(this.cell);
            this.myTaskCell.setDelegate(new ChatMessageCell.ChatMessageCellDelegate() { // from class: org.telegram.ui.PollItemMenu.8
                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ boolean allowAddPollOptions() {
                    return ChatMessageCell.ChatMessageCellDelegate.-CC.$default$allowAddPollOptions(this);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ boolean canDrawOutboundsContent() {
                    return ChatMessageCell.ChatMessageCellDelegate.-CC.$default$canDrawOutboundsContent(this);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public boolean canPerformActions() {
                    return false;
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ boolean canPerformReply() {
                    boolean canPerformActions;
                    canPerformActions = canPerformActions();
                    return canPerformActions;
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ boolean canToggleRichMessageCheckbox(ChatMessageCell chatMessageCell3) {
                    return ChatMessageCell.ChatMessageCellDelegate.-CC.$default$canToggleRichMessageCheckbox(this, chatMessageCell3);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didLongPress(ChatMessageCell chatMessageCell3, float f, float f2) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didLongPress(this, chatMessageCell3, f, f2);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didLongPressBotButton(ChatMessageCell chatMessageCell3, TLRPC.KeyboardButton keyboardButton) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didLongPressBotButton(this, chatMessageCell3, keyboardButton);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ boolean didLongPressChannelAvatar(ChatMessageCell chatMessageCell3, TLRPC.Chat chat, int i, float f, float f2) {
                    return ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didLongPressChannelAvatar(this, chatMessageCell3, chat, i, f, f2);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didLongPressCustomBotButton(ChatMessageCell chatMessageCell3, BotInlineKeyboard.ButtonCustom buttonCustom) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didLongPressCustomBotButton(this, chatMessageCell3, buttonCustom);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ boolean didLongPressPollOption(ChatMessageCell chatMessageCell3, TLRPC.PollAnswer pollAnswer2) {
                    return ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didLongPressPollOption(this, chatMessageCell3, pollAnswer2);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ boolean didLongPressToDoButton(ChatMessageCell chatMessageCell3, TLRPC.TodoItem todoItem) {
                    return ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didLongPressToDoButton(this, chatMessageCell3, todoItem);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ boolean didLongPressUserAvatar(ChatMessageCell chatMessageCell3, TLRPC.User user, float f, float f2) {
                    return ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didLongPressUserAvatar(this, chatMessageCell3, user, f, f2);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressAboutRevenueSharingAds() {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressAboutRevenueSharingAds(this);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressAddPollOptionButton(ChatMessageCell chatMessageCell3) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressAddPollOptionButton(this, chatMessageCell3);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressAdmin(ChatMessageCell chatMessageCell3) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressAdmin(this, chatMessageCell3);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ boolean didPressAnimatedEmoji(ChatMessageCell chatMessageCell3, AnimatedEmojiSpan animatedEmojiSpan) {
                    return ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressAnimatedEmoji(this, chatMessageCell3, animatedEmojiSpan);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressBoostCounter(ChatMessageCell chatMessageCell3) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressBoostCounter(this, chatMessageCell3);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressBotButton(ChatMessageCell chatMessageCell3, TLRPC.KeyboardButton keyboardButton) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressBotButton(this, chatMessageCell3, keyboardButton);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressCancelSendButton(ChatMessageCell chatMessageCell3) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressCancelSendButton(this, chatMessageCell3);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressChannelAvatar(ChatMessageCell chatMessageCell3, TLRPC.Chat chat, int i, float f, float f2, boolean z3) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressChannelAvatar(this, chatMessageCell3, chat, i, f, f2, z3);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressChannelRecommendation(ChatMessageCell chatMessageCell3, TLObject tLObject, boolean z3) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressChannelRecommendation(this, chatMessageCell3, tLObject, z3);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressChannelRecommendationsClose(ChatMessageCell chatMessageCell3) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressChannelRecommendationsClose(this, chatMessageCell3);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressCodeCopy(ChatMessageCell chatMessageCell3, MessageObject.TextLayoutBlock textLayoutBlock) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressCodeCopy(this, chatMessageCell3, textLayoutBlock);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressCommentButton(ChatMessageCell chatMessageCell3) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressCommentButton(this, chatMessageCell3);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressCustomBotButton(ChatMessageCell chatMessageCell3, BotInlineKeyboard.ButtonCustom buttonCustom) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressCustomBotButton(this, chatMessageCell3, buttonCustom);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressEffect(ChatMessageCell chatMessageCell3) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressEffect(this, chatMessageCell3);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressExtendedMediaPreview(ChatMessageCell chatMessageCell3, TLRPC.KeyboardButton keyboardButton) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressExtendedMediaPreview(this, chatMessageCell3, keyboardButton);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressFactCheck(ChatMessageCell chatMessageCell3) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressFactCheck(this, chatMessageCell3);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressFactCheckWhat(ChatMessageCell chatMessageCell3, int i, int i2) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressFactCheckWhat(this, chatMessageCell3, i, i2);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressGiveawayChatButton(ChatMessageCell chatMessageCell3, int i) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressGiveawayChatButton(this, chatMessageCell3, i);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressGroupImage(ChatMessageCell chatMessageCell3, ImageReceiver imageReceiver, TLRPC.MessageExtendedMedia messageExtendedMedia, float f, float f2) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressGroupImage(this, chatMessageCell3, imageReceiver, messageExtendedMedia, f, f2);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressHiddenForward(ChatMessageCell chatMessageCell3) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressHiddenForward(this, chatMessageCell3);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressHint(ChatMessageCell chatMessageCell3, int i) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressHint(this, chatMessageCell3, i);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressImage(ChatMessageCell chatMessageCell3, float f, float f2, boolean z3) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressImage(this, chatMessageCell3, f, f2, z3);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressInstantButton(ChatMessageCell chatMessageCell3, int i) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressInstantButton(this, chatMessageCell3, i);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressMoreChannelRecommendations(ChatMessageCell chatMessageCell3) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressMoreChannelRecommendations(this, chatMessageCell3);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressOther(ChatMessageCell chatMessageCell3, float f, float f2) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressOther(this, chatMessageCell3, f, f2);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressPollMedia(ChatMessageCell chatMessageCell3, ImageReceiver imageReceiver, TLRPC.PollAnswer pollAnswer2, TLRPC.MessageMedia messageMedia, float f, float f2, int i) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressPollMedia(this, chatMessageCell3, imageReceiver, pollAnswer2, messageMedia, f, f2, i);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressReaction(ChatMessageCell chatMessageCell3, TLRPC.ReactionCount reactionCount, boolean z3, float f, float f2) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressReaction(this, chatMessageCell3, reactionCount, z3, f, f2);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressReplyMessage(ChatMessageCell chatMessageCell3, int i, float f, float f2, boolean z3) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressReplyMessage(this, chatMessageCell3, i, f, f2, z3);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressRevealSensitiveContent(ChatMessageCell chatMessageCell3) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressRevealSensitiveContent(this, chatMessageCell3);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressShowMore(ChatMessageCell chatMessageCell3) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressShowMore(this, chatMessageCell3);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressSideButton(ChatMessageCell chatMessageCell3) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressSideButton(this, chatMessageCell3);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressSponsoredClose(ChatMessageCell chatMessageCell3) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressSponsoredClose(this, chatMessageCell3);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressSponsoredInfo(ChatMessageCell chatMessageCell3, float f, float f2) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressSponsoredInfo(this, chatMessageCell3, f, f2);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressSummarize(ChatMessageCell chatMessageCell3, boolean z3) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressSummarize(this, chatMessageCell3, z3);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressTime(ChatMessageCell chatMessageCell3) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressTime(this, chatMessageCell3);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ boolean didPressToDoButton(ChatMessageCell chatMessageCell3, TLRPC.TodoItem todoItem, boolean z3) {
                    return ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressToDoButton(this, chatMessageCell3, todoItem, z3);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressUrl(ChatMessageCell chatMessageCell3, CharacterStyle characterStyle, boolean z3) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressUrl(this, chatMessageCell3, characterStyle, z3);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressUserAvatar(ChatMessageCell chatMessageCell3, TLRPC.User user, float f, float f2, boolean z3) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressUserAvatar(this, chatMessageCell3, user, f, f2, z3);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressUserStatus(ChatMessageCell chatMessageCell3, TLRPC.User user, TLRPC.Document document, String str) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressUserStatus(this, chatMessageCell3, user, document, str);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressViaBot(ChatMessageCell chatMessageCell3, String str) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressViaBot(this, chatMessageCell3, str);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressViaBotNotInline(ChatMessageCell chatMessageCell3, long j) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressViaBotNotInline(this, chatMessageCell3, j);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressVoteButtons(ChatMessageCell chatMessageCell3, ArrayList arrayList3, int i, int i2, int i3) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressVoteButtons(this, chatMessageCell3, arrayList3, i, i2, i3);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressWebPage(ChatMessageCell chatMessageCell3, TLRPC.WebPage webPage, String str, boolean z3) {
                    Browser.openUrl(chatMessageCell3.getContext(), str);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didQuickShareEnd(ChatMessageCell chatMessageCell3, float f, float f2) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didQuickShareEnd(this, chatMessageCell3, f, f2);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didQuickShareMove(ChatMessageCell chatMessageCell3, float f, float f2) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didQuickShareMove(this, chatMessageCell3, f, f2);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didQuickShareStart(ChatMessageCell chatMessageCell3, float f, float f2) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didQuickShareStart(this, chatMessageCell3, f, f2);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didStartVideoStream(MessageObject messageObject2) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didStartVideoStream(this, messageObject2);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didTogglePollPreview(ChatMessageCell chatMessageCell3) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didTogglePollPreview(this, chatMessageCell3);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didToggleRichMessageCheckbox(ChatMessageCell chatMessageCell3, boolean z3, Runnable runnable) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didToggleRichMessageCheckbox(this, chatMessageCell3, z3, runnable);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ boolean doNotShowLoadingReply(MessageObject messageObject2) {
                    return ChatMessageCell.ChatMessageCellDelegate.-CC.$default$doNotShowLoadingReply(this, messageObject2);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void drawPollMode(Canvas canvas, ChatMessageCell chatMessageCell3) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$drawPollMode(this, canvas, chatMessageCell3);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void forceUpdate(ChatMessageCell chatMessageCell3, boolean z3) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$forceUpdate(this, chatMessageCell3, z3);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void forceUpdate(ChatMessageCell chatMessageCell3, boolean z3, boolean z4) {
                    forceUpdate(chatMessageCell3, z3);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void forceUpdateNoAnimation(ChatMessageCell chatMessageCell3, boolean z3) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$forceUpdateNoAnimation(this, chatMessageCell3, z3);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ int getAddPollOptionInputFieldHeight(ChatMessageCell chatMessageCell3) {
                    return ChatMessageCell.ChatMessageCellDelegate.-CC.$default$getAddPollOptionInputFieldHeight(this, chatMessageCell3);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ String getAdminRank(long j) {
                    return ChatMessageCell.ChatMessageCellDelegate.-CC.$default$getAdminRank(this, j);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ ChatActivityDraftMessageMeasureController getDraftMessageMeasureController() {
                    return ChatMessageCell.ChatMessageCellDelegate.-CC.$default$getDraftMessageMeasureController(this);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ PinchToZoomHelper getPinchToZoomHelper() {
                    return ChatMessageCell.ChatMessageCellDelegate.-CC.$default$getPinchToZoomHelper(this);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ String getProgressLoadingBotButtonUrl(ChatMessageCell chatMessageCell3) {
                    return ChatMessageCell.ChatMessageCellDelegate.-CC.$default$getProgressLoadingBotButtonUrl(this, chatMessageCell3);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ CharacterStyle getProgressLoadingLink(ChatMessageCell chatMessageCell3) {
                    return ChatMessageCell.ChatMessageCellDelegate.-CC.$default$getProgressLoadingLink(this, chatMessageCell3);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ TextSelectionHelper.ChatListTextSelectionHelper getTextSelectionHelper() {
                    return ChatMessageCell.ChatMessageCellDelegate.-CC.$default$getTextSelectionHelper(this);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ boolean hasSelectedMessages() {
                    return ChatMessageCell.ChatMessageCellDelegate.-CC.$default$hasSelectedMessages(this);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void invalidateBlur() {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$invalidateBlur(this);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ boolean isAdmin(long j) {
                    return ChatMessageCell.ChatMessageCellDelegate.-CC.$default$isAdmin(this, j);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ boolean isLandscape() {
                    return ChatMessageCell.ChatMessageCellDelegate.-CC.$default$isLandscape(this);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ boolean isOwner(long j) {
                    return ChatMessageCell.ChatMessageCellDelegate.-CC.$default$isOwner(this, j);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ boolean isProgressLoading(ChatMessageCell chatMessageCell3, int i) {
                    return ChatMessageCell.ChatMessageCellDelegate.-CC.$default$isProgressLoading(this, chatMessageCell3, i);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ boolean isReplyOrSelf() {
                    return ChatMessageCell.ChatMessageCellDelegate.-CC.$default$isReplyOrSelf(this);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ boolean keyboardIsOpened() {
                    return ChatMessageCell.ChatMessageCellDelegate.-CC.$default$keyboardIsOpened(this);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void needOpenWebView(MessageObject messageObject2, String str, String str2, String str3, String str4, int i, int i2) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$needOpenWebView(this, messageObject2, str, str2, str3, str4, i, i2);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ boolean needPlayMessage(ChatMessageCell chatMessageCell3, MessageObject messageObject2, boolean z3) {
                    return ChatMessageCell.ChatMessageCellDelegate.-CC.$default$needPlayMessage(this, chatMessageCell3, messageObject2, z3);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void needReloadPolls() {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$needReloadPolls(this);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void needShowPremiumBulletin(int i) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$needShowPremiumBulletin(this, i);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ boolean onAccessibilityAction(int i, Bundle bundle) {
                    return ChatMessageCell.ChatMessageCellDelegate.-CC.$default$onAccessibilityAction(this, i, bundle);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void onDiceFinished() {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$onDiceFinished(this);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ boolean openArticlePhoto(ChatMessageCell chatMessageCell3, TL_iv.PageBlock pageBlock) {
                    return ChatMessageCell.ChatMessageCellDelegate.-CC.$default$openArticlePhoto(this, chatMessageCell3, pageBlock);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void setShouldNotRepeatSticker(MessageObject messageObject2) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$setShouldNotRepeatSticker(this, messageObject2);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ boolean shouldDrawThreadProgress(ChatMessageCell chatMessageCell3, boolean z3) {
                    return ChatMessageCell.ChatMessageCellDelegate.-CC.$default$shouldDrawThreadProgress(this, chatMessageCell3, z3);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ boolean shouldRepeatSticker(MessageObject messageObject2) {
                    return ChatMessageCell.ChatMessageCellDelegate.-CC.$default$shouldRepeatSticker(this, messageObject2);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void videoTimerReached() {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$videoTimerReached(this);
                }
            });
            ChatMessageCell chatMessageCell3 = this.myTaskCell;
            MessageObject messageObject2 = this.messageObject;
            MessageObject.GroupedMessages currentMessagesGroup = this.cell.getCurrentMessagesGroup();
            ChatMessageCell chatMessageCell4 = this.cell;
            chatMessageCell3.setMessageObject(messageObject2, currentMessagesGroup, chatMessageCell4.pinnedBottom, chatMessageCell4.pinnedTop, chatMessageCell4.firstInChat);
            ChatMessageCell chatMessageCell5 = this.myTaskCell;
            chatMessageCell5.drawOnlyPollId = bArr;
            this.containerView.addView(chatMessageCell5, new FrameLayout.LayoutParams(this.cell.getWidth(), height, 51));
            ChatMessageCell chatMessageCell6 = new ChatMessageCell(getContext(), UserConfig.selectedAccount, false, null, this.cell.getResourcesProvider()) { // from class: org.telegram.ui.PollItemMenu.9
                @Override // org.telegram.ui.Cells.ChatMessageCell, android.view.View
                public void setPressed(boolean z3) {
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell, android.view.View
                protected void onMeasure(int i, int i2) {
                    setMeasuredDimension(width, height);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell
                public void drawOverlays(Canvas canvas) {
                    this.firstVisiblePollButton = 0;
                    this.lastVisiblePollButton = this.pollButtons.size() - 1;
                    super.drawOverlays(canvas);
                }
            };
            this.myCell = chatMessageCell6;
            this.cell.copyVisiblePartTo(chatMessageCell6);
            this.cell.copyParamsTo(this.myCell);
            this.myCell.copySpoilerEffect2AttachIndexFrom(this.cell);
            this.myCell.setDelegate(new ChatMessageCell.ChatMessageCellDelegate() { // from class: org.telegram.ui.PollItemMenu.10
                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ boolean allowAddPollOptions() {
                    return ChatMessageCell.ChatMessageCellDelegate.-CC.$default$allowAddPollOptions(this);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ boolean canDrawOutboundsContent() {
                    return ChatMessageCell.ChatMessageCellDelegate.-CC.$default$canDrawOutboundsContent(this);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public boolean canPerformActions() {
                    return false;
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ boolean canPerformReply() {
                    boolean canPerformActions;
                    canPerformActions = canPerformActions();
                    return canPerformActions;
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ boolean canToggleRichMessageCheckbox(ChatMessageCell chatMessageCell7) {
                    return ChatMessageCell.ChatMessageCellDelegate.-CC.$default$canToggleRichMessageCheckbox(this, chatMessageCell7);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didLongPress(ChatMessageCell chatMessageCell7, float f, float f2) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didLongPress(this, chatMessageCell7, f, f2);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didLongPressBotButton(ChatMessageCell chatMessageCell7, TLRPC.KeyboardButton keyboardButton) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didLongPressBotButton(this, chatMessageCell7, keyboardButton);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ boolean didLongPressChannelAvatar(ChatMessageCell chatMessageCell7, TLRPC.Chat chat, int i, float f, float f2) {
                    return ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didLongPressChannelAvatar(this, chatMessageCell7, chat, i, f, f2);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didLongPressCustomBotButton(ChatMessageCell chatMessageCell7, BotInlineKeyboard.ButtonCustom buttonCustom) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didLongPressCustomBotButton(this, chatMessageCell7, buttonCustom);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ boolean didLongPressPollOption(ChatMessageCell chatMessageCell7, TLRPC.PollAnswer pollAnswer2) {
                    return ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didLongPressPollOption(this, chatMessageCell7, pollAnswer2);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ boolean didLongPressToDoButton(ChatMessageCell chatMessageCell7, TLRPC.TodoItem todoItem) {
                    return ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didLongPressToDoButton(this, chatMessageCell7, todoItem);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ boolean didLongPressUserAvatar(ChatMessageCell chatMessageCell7, TLRPC.User user, float f, float f2) {
                    return ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didLongPressUserAvatar(this, chatMessageCell7, user, f, f2);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressAboutRevenueSharingAds() {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressAboutRevenueSharingAds(this);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressAddPollOptionButton(ChatMessageCell chatMessageCell7) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressAddPollOptionButton(this, chatMessageCell7);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressAdmin(ChatMessageCell chatMessageCell7) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressAdmin(this, chatMessageCell7);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ boolean didPressAnimatedEmoji(ChatMessageCell chatMessageCell7, AnimatedEmojiSpan animatedEmojiSpan) {
                    return ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressAnimatedEmoji(this, chatMessageCell7, animatedEmojiSpan);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressBoostCounter(ChatMessageCell chatMessageCell7) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressBoostCounter(this, chatMessageCell7);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressBotButton(ChatMessageCell chatMessageCell7, TLRPC.KeyboardButton keyboardButton) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressBotButton(this, chatMessageCell7, keyboardButton);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressCancelSendButton(ChatMessageCell chatMessageCell7) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressCancelSendButton(this, chatMessageCell7);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressChannelAvatar(ChatMessageCell chatMessageCell7, TLRPC.Chat chat, int i, float f, float f2, boolean z3) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressChannelAvatar(this, chatMessageCell7, chat, i, f, f2, z3);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressChannelRecommendation(ChatMessageCell chatMessageCell7, TLObject tLObject, boolean z3) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressChannelRecommendation(this, chatMessageCell7, tLObject, z3);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressChannelRecommendationsClose(ChatMessageCell chatMessageCell7) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressChannelRecommendationsClose(this, chatMessageCell7);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressCodeCopy(ChatMessageCell chatMessageCell7, MessageObject.TextLayoutBlock textLayoutBlock) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressCodeCopy(this, chatMessageCell7, textLayoutBlock);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressCommentButton(ChatMessageCell chatMessageCell7) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressCommentButton(this, chatMessageCell7);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressCustomBotButton(ChatMessageCell chatMessageCell7, BotInlineKeyboard.ButtonCustom buttonCustom) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressCustomBotButton(this, chatMessageCell7, buttonCustom);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressEffect(ChatMessageCell chatMessageCell7) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressEffect(this, chatMessageCell7);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressExtendedMediaPreview(ChatMessageCell chatMessageCell7, TLRPC.KeyboardButton keyboardButton) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressExtendedMediaPreview(this, chatMessageCell7, keyboardButton);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressFactCheck(ChatMessageCell chatMessageCell7) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressFactCheck(this, chatMessageCell7);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressFactCheckWhat(ChatMessageCell chatMessageCell7, int i, int i2) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressFactCheckWhat(this, chatMessageCell7, i, i2);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressGiveawayChatButton(ChatMessageCell chatMessageCell7, int i) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressGiveawayChatButton(this, chatMessageCell7, i);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressGroupImage(ChatMessageCell chatMessageCell7, ImageReceiver imageReceiver, TLRPC.MessageExtendedMedia messageExtendedMedia, float f, float f2) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressGroupImage(this, chatMessageCell7, imageReceiver, messageExtendedMedia, f, f2);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressHiddenForward(ChatMessageCell chatMessageCell7) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressHiddenForward(this, chatMessageCell7);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressHint(ChatMessageCell chatMessageCell7, int i) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressHint(this, chatMessageCell7, i);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressImage(ChatMessageCell chatMessageCell7, float f, float f2, boolean z3) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressImage(this, chatMessageCell7, f, f2, z3);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressInstantButton(ChatMessageCell chatMessageCell7, int i) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressInstantButton(this, chatMessageCell7, i);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressMoreChannelRecommendations(ChatMessageCell chatMessageCell7) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressMoreChannelRecommendations(this, chatMessageCell7);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressOther(ChatMessageCell chatMessageCell7, float f, float f2) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressOther(this, chatMessageCell7, f, f2);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressPollMedia(ChatMessageCell chatMessageCell7, ImageReceiver imageReceiver, TLRPC.PollAnswer pollAnswer2, TLRPC.MessageMedia messageMedia, float f, float f2, int i) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressPollMedia(this, chatMessageCell7, imageReceiver, pollAnswer2, messageMedia, f, f2, i);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressReaction(ChatMessageCell chatMessageCell7, TLRPC.ReactionCount reactionCount, boolean z3, float f, float f2) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressReaction(this, chatMessageCell7, reactionCount, z3, f, f2);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressReplyMessage(ChatMessageCell chatMessageCell7, int i, float f, float f2, boolean z3) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressReplyMessage(this, chatMessageCell7, i, f, f2, z3);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressRevealSensitiveContent(ChatMessageCell chatMessageCell7) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressRevealSensitiveContent(this, chatMessageCell7);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressShowMore(ChatMessageCell chatMessageCell7) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressShowMore(this, chatMessageCell7);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressSideButton(ChatMessageCell chatMessageCell7) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressSideButton(this, chatMessageCell7);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressSponsoredClose(ChatMessageCell chatMessageCell7) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressSponsoredClose(this, chatMessageCell7);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressSponsoredInfo(ChatMessageCell chatMessageCell7, float f, float f2) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressSponsoredInfo(this, chatMessageCell7, f, f2);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressSummarize(ChatMessageCell chatMessageCell7, boolean z3) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressSummarize(this, chatMessageCell7, z3);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressTime(ChatMessageCell chatMessageCell7) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressTime(this, chatMessageCell7);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ boolean didPressToDoButton(ChatMessageCell chatMessageCell7, TLRPC.TodoItem todoItem, boolean z3) {
                    return ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressToDoButton(this, chatMessageCell7, todoItem, z3);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressUrl(ChatMessageCell chatMessageCell7, CharacterStyle characterStyle, boolean z3) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressUrl(this, chatMessageCell7, characterStyle, z3);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressUserAvatar(ChatMessageCell chatMessageCell7, TLRPC.User user, float f, float f2, boolean z3) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressUserAvatar(this, chatMessageCell7, user, f, f2, z3);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressUserStatus(ChatMessageCell chatMessageCell7, TLRPC.User user, TLRPC.Document document, String str) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressUserStatus(this, chatMessageCell7, user, document, str);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressViaBot(ChatMessageCell chatMessageCell7, String str) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressViaBot(this, chatMessageCell7, str);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressViaBotNotInline(ChatMessageCell chatMessageCell7, long j) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressViaBotNotInline(this, chatMessageCell7, j);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressVoteButtons(ChatMessageCell chatMessageCell7, ArrayList arrayList3, int i, int i2, int i3) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressVoteButtons(this, chatMessageCell7, arrayList3, i, i2, i3);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressWebPage(ChatMessageCell chatMessageCell7, TLRPC.WebPage webPage, String str, boolean z3) {
                    Browser.openUrl(chatMessageCell7.getContext(), str);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didQuickShareEnd(ChatMessageCell chatMessageCell7, float f, float f2) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didQuickShareEnd(this, chatMessageCell7, f, f2);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didQuickShareMove(ChatMessageCell chatMessageCell7, float f, float f2) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didQuickShareMove(this, chatMessageCell7, f, f2);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didQuickShareStart(ChatMessageCell chatMessageCell7, float f, float f2) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didQuickShareStart(this, chatMessageCell7, f, f2);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didStartVideoStream(MessageObject messageObject3) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didStartVideoStream(this, messageObject3);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didTogglePollPreview(ChatMessageCell chatMessageCell7) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didTogglePollPreview(this, chatMessageCell7);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didToggleRichMessageCheckbox(ChatMessageCell chatMessageCell7, boolean z3, Runnable runnable) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didToggleRichMessageCheckbox(this, chatMessageCell7, z3, runnable);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ boolean doNotShowLoadingReply(MessageObject messageObject3) {
                    return ChatMessageCell.ChatMessageCellDelegate.-CC.$default$doNotShowLoadingReply(this, messageObject3);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void drawPollMode(Canvas canvas, ChatMessageCell chatMessageCell7) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$drawPollMode(this, canvas, chatMessageCell7);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void forceUpdate(ChatMessageCell chatMessageCell7, boolean z3) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$forceUpdate(this, chatMessageCell7, z3);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void forceUpdate(ChatMessageCell chatMessageCell7, boolean z3, boolean z4) {
                    forceUpdate(chatMessageCell7, z3);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void forceUpdateNoAnimation(ChatMessageCell chatMessageCell7, boolean z3) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$forceUpdateNoAnimation(this, chatMessageCell7, z3);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ int getAddPollOptionInputFieldHeight(ChatMessageCell chatMessageCell7) {
                    return ChatMessageCell.ChatMessageCellDelegate.-CC.$default$getAddPollOptionInputFieldHeight(this, chatMessageCell7);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ String getAdminRank(long j) {
                    return ChatMessageCell.ChatMessageCellDelegate.-CC.$default$getAdminRank(this, j);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ ChatActivityDraftMessageMeasureController getDraftMessageMeasureController() {
                    return ChatMessageCell.ChatMessageCellDelegate.-CC.$default$getDraftMessageMeasureController(this);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ PinchToZoomHelper getPinchToZoomHelper() {
                    return ChatMessageCell.ChatMessageCellDelegate.-CC.$default$getPinchToZoomHelper(this);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ String getProgressLoadingBotButtonUrl(ChatMessageCell chatMessageCell7) {
                    return ChatMessageCell.ChatMessageCellDelegate.-CC.$default$getProgressLoadingBotButtonUrl(this, chatMessageCell7);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ CharacterStyle getProgressLoadingLink(ChatMessageCell chatMessageCell7) {
                    return ChatMessageCell.ChatMessageCellDelegate.-CC.$default$getProgressLoadingLink(this, chatMessageCell7);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ TextSelectionHelper.ChatListTextSelectionHelper getTextSelectionHelper() {
                    return ChatMessageCell.ChatMessageCellDelegate.-CC.$default$getTextSelectionHelper(this);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ boolean hasSelectedMessages() {
                    return ChatMessageCell.ChatMessageCellDelegate.-CC.$default$hasSelectedMessages(this);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void invalidateBlur() {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$invalidateBlur(this);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ boolean isAdmin(long j) {
                    return ChatMessageCell.ChatMessageCellDelegate.-CC.$default$isAdmin(this, j);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ boolean isLandscape() {
                    return ChatMessageCell.ChatMessageCellDelegate.-CC.$default$isLandscape(this);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ boolean isOwner(long j) {
                    return ChatMessageCell.ChatMessageCellDelegate.-CC.$default$isOwner(this, j);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ boolean isProgressLoading(ChatMessageCell chatMessageCell7, int i) {
                    return ChatMessageCell.ChatMessageCellDelegate.-CC.$default$isProgressLoading(this, chatMessageCell7, i);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ boolean isReplyOrSelf() {
                    return ChatMessageCell.ChatMessageCellDelegate.-CC.$default$isReplyOrSelf(this);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ boolean keyboardIsOpened() {
                    return ChatMessageCell.ChatMessageCellDelegate.-CC.$default$keyboardIsOpened(this);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void needOpenWebView(MessageObject messageObject3, String str, String str2, String str3, String str4, int i, int i2) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$needOpenWebView(this, messageObject3, str, str2, str3, str4, i, i2);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ boolean needPlayMessage(ChatMessageCell chatMessageCell7, MessageObject messageObject3, boolean z3) {
                    return ChatMessageCell.ChatMessageCellDelegate.-CC.$default$needPlayMessage(this, chatMessageCell7, messageObject3, z3);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void needReloadPolls() {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$needReloadPolls(this);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void needShowPremiumBulletin(int i) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$needShowPremiumBulletin(this, i);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ boolean onAccessibilityAction(int i, Bundle bundle) {
                    return ChatMessageCell.ChatMessageCellDelegate.-CC.$default$onAccessibilityAction(this, i, bundle);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void onDiceFinished() {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$onDiceFinished(this);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ boolean openArticlePhoto(ChatMessageCell chatMessageCell7, TL_iv.PageBlock pageBlock) {
                    return ChatMessageCell.ChatMessageCellDelegate.-CC.$default$openArticlePhoto(this, chatMessageCell7, pageBlock);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void setShouldNotRepeatSticker(MessageObject messageObject3) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$setShouldNotRepeatSticker(this, messageObject3);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ boolean shouldDrawThreadProgress(ChatMessageCell chatMessageCell7, boolean z3) {
                    return ChatMessageCell.ChatMessageCellDelegate.-CC.$default$shouldDrawThreadProgress(this, chatMessageCell7, z3);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ boolean shouldRepeatSticker(MessageObject messageObject3) {
                    return ChatMessageCell.ChatMessageCellDelegate.-CC.$default$shouldRepeatSticker(this, messageObject3);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void videoTimerReached() {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$videoTimerReached(this);
                }
            });
            ChatMessageCell chatMessageCell7 = this.myCell;
            MessageObject messageObject3 = this.messageObject;
            MessageObject.GroupedMessages currentMessagesGroup2 = this.cell.getCurrentMessagesGroup();
            ChatMessageCell chatMessageCell8 = this.cell;
            chatMessageCell7.setMessageObject(messageObject3, currentMessagesGroup2, chatMessageCell8.pinnedBottom, chatMessageCell8.pinnedTop, chatMessageCell8.firstInChat);
            this.containerView.addView(this.myCell, new FrameLayout.LayoutParams(this.cell.getWidth(), height, 51));
        } else {
            chatActivity = chatActivity2;
        }
        this.viewPager.bringToFront();
        this.menuContainer.bringToFront();
        this.tabsView.bringToFront();
        this.viewPager.onTabAnimationUpdate(false);
        final ItemOptions makeOptions = ItemOptions.makeOptions((ViewGroup) this.containerView, this.resourcesProvider, new View(this.context), true);
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) MessageObject.getMedia(this.messageObject);
        this.pollVoted = MessageObject.isVoted(tL_messageMediaPoll);
        int i = 0;
        while (true) {
            if (i >= tL_messageMediaPoll.poll.answers.size()) {
                pollAnswer = null;
                break;
            } else {
                if (Arrays.equals(tL_messageMediaPoll.poll.answers.get(i).option, bArr)) {
                    pollAnswer = tL_messageMediaPoll.poll.answers.get(i);
                    break;
                }
                i++;
            }
        }
        if (pollAnswer != null) {
            TLRPC.Poll poll = tL_messageMediaPoll.poll;
            boolean z3 = (poll.closed || poll.revoting_disabled) ? false : true;
            boolean z4 = poll.multiple_choice;
            ArrayList arrayList3 = new ArrayList();
            TLRPC.PollResults pollResults = tL_messageMediaPoll.results;
            if (pollResults == null || (arrayList2 = pollResults.results) == null) {
                z = false;
                pollAnswerVoters = null;
            } else {
                Iterator<TLRPC.PollAnswerVoters> it = arrayList2.iterator();
                boolean z5 = false;
                TLRPC.PollAnswerVoters pollAnswerVoters2 = null;
                while (it.hasNext()) {
                    TLRPC.PollAnswerVoters next = it.next();
                    boolean equals = Arrays.equals(next.option, bArr);
                    if (equals) {
                        pollAnswerVoters2 = next;
                    }
                    if (next.chosen) {
                        if (equals) {
                            z5 = true;
                        }
                        Iterator<TLRPC.PollAnswer> it2 = tL_messageMediaPoll.poll.answers.iterator();
                        while (it2.hasNext()) {
                            TLRPC.PollAnswer next2 = it2.next();
                            if (Arrays.equals(next2.option, next.option)) {
                                arrayList3.add(next2);
                            }
                        }
                    }
                }
                z = z5;
                pollAnswerVoters = pollAnswerVoters2;
            }
            if (pollAnswerVoters == null || pollAnswerVoters.voters <= 0 || !MessageObject.canShowVotersList(tL_messageMediaPoll)) {
                arrayList = arrayList3;
                z2 = z4;
            } else {
                RecentVotersCell recentVotersCell = new RecentVotersCell(this.context, baseFragment.getCurrentAccount(), this.resourcesProvider);
                final ItemOptions makeSwipeback = makeOptions.makeSwipeback();
                makeSwipeback.setGapBackgroundColor(Theme.multAlpha(Theme.getColor(Theme.key_actionBarDefaultSubmenuItem, this.resourcesProvider), 0.06f));
                makeSwipeback.setBlurBackgroundForSwipeback(this.iBlur3Factory, BlurredBackgroundProviderImpl.scrimMenuBackground(this.resourcesProvider), false);
                makeSwipeback.add(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new ChatActivity$$ExternalSyntheticLambda392(makeOptions));
                makeSwipeback.addGap();
                arrayList = arrayList3;
                z2 = z4;
                makeSwipeback.addView(recentVotersCell.createListView(baseFragment, this.messageObject.getDialogId(), this.messageObject.getId(), bArr, pollAnswerVoters.voters, new Utilities.Callback() { // from class: org.telegram.ui.PollItemMenu$$ExternalSyntheticLambda2
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        PollItemMenu.this.lambda$setCell$1(baseFragment, (Long) obj);
                    }
                }));
                recentVotersCell.setMinimumHeight(AndroidUtilities.dp(48.0f));
                recentVotersCell.setText(LocaleController.formatPluralString("PollVotesCount", pollAnswerVoters.voters, new Object[0]));
                recentVotersCell.setRecentVoters(pollAnswerVoters.recent_voters, false);
                recentVotersCell.setLayoutParams(LayoutHelper.createLinear(-1, 48));
                recentVotersCell.setBackground(Theme.createRadSelectorDrawable(Theme.getColor(Theme.key_dialogButtonSelector), 12, 0));
                recentVotersCell.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.PollItemMenu$$ExternalSyntheticLambda3
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        ItemOptions.this.openSwipeback(makeSwipeback);
                    }
                });
                makeOptions.addView(recentVotersCell);
                makeOptions.addGap();
            }
            if (z3) {
                if (z) {
                    final boolean z6 = z2;
                    final ArrayList arrayList4 = arrayList;
                    final TLRPC.PollAnswer pollAnswer2 = pollAnswer;
                    makeOptions.add(R.drawable.msg_unvote, LocaleController.getString(R.string.Unvote), new Runnable() { // from class: org.telegram.ui.PollItemMenu$$ExternalSyntheticLambda4
                        @Override // java.lang.Runnable
                        public final void run() {
                            PollItemMenu.this.lambda$setCell$3(z6, baseFragment, arrayList4, pollAnswer2);
                        }
                    });
                } else if (PollUtils.getVoteRestrictedFlags(this.messageObject) == 0) {
                    final boolean z7 = z2;
                    final TLRPC.PollAnswer pollAnswer3 = pollAnswer;
                    final ArrayList arrayList5 = arrayList;
                    makeOptions.add(R.drawable.msg_select, LocaleController.getString(R.string.PollSubmitVotesNoCaps), new Runnable() { // from class: org.telegram.ui.PollItemMenu$$ExternalSyntheticLambda5
                        @Override // java.lang.Runnable
                        public final void run() {
                            PollItemMenu.this.lambda$setCell$4(z7, pollAnswer3, baseFragment, arrayList5);
                        }
                    });
                }
            }
            final ChatActivity chatActivity3 = chatActivity;
            if (chatActivity3 != null && chatActivity3.canSendMessage()) {
                makeOptions.add(R.drawable.menu_reply, LocaleController.getString(R.string.PollItemQuote), new Runnable() { // from class: org.telegram.ui.PollItemMenu$$ExternalSyntheticLambda6
                    @Override // java.lang.Runnable
                    public final void run() {
                        PollItemMenu.this.lambda$setCell$5(chatActivity3, pollAnswer);
                    }
                });
            }
            if (this.messageObject.getDialogId() < 0 && pollAnswer.option != null) {
                MessagesController messagesController = MessagesController.getInstance(this.messageObject.currentAccount);
                String publicUsername = DialogObject.getPublicUsername(messagesController.getUserOrChat(this.messageObject.getDialogId()));
                StringBuilder sb = new StringBuilder();
                sb.append("https://");
                sb.append(messagesController.linkPrefix);
                sb.append("/");
                if (TextUtils.isEmpty(publicUsername)) {
                    publicUsername = "c/" + (-this.messageObject.getDialogId());
                }
                sb.append(publicUsername);
                sb.append("/");
                sb.append(this.messageObject.getId());
                sb.append("?option=");
                sb.append(new String(Base64.encode(pollAnswer.option, 9)));
                final String sb2 = sb.toString();
                makeOptions.add(R.drawable.msg_link, LocaleController.getString(R.string.CopyLink), new Runnable() { // from class: org.telegram.ui.PollItemMenu$$ExternalSyntheticLambda7
                    @Override // java.lang.Runnable
                    public final void run() {
                        PollItemMenu.this.lambda$setCell$6(sb2);
                    }
                });
            }
            makeOptions.add(R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new Runnable() { // from class: org.telegram.ui.PollItemMenu$$ExternalSyntheticLambda8
                @Override // java.lang.Runnable
                public final void run() {
                    PollItemMenu.this.lambda$setCell$7(pollAnswer);
                }
            });
            TLRPC.Peer peer = pollAnswer.added_by;
            if (peer != null) {
                final long peerDialogId = DialogObject.getPeerDialogId(peer);
                long clientUserId = UserConfig.getInstance(this.messageObject.currentAccount).getClientUserId();
                long currentTime = ConnectionsManager.getInstance(this.messageObject.currentAccount).getCurrentTime();
                long j = pollAnswer.date + MessagesController.getInstance(this.messageObject.currentAccount).config.pollAnswerDeletePeriod.get(TimeUnit.SECONDS);
                if (!this.messageObject.isForwarded()) {
                    TLRPC.Poll poll2 = tL_messageMediaPoll.poll;
                    if (!poll2.closed && (poll2.creator || (peerDialogId == clientUserId && currentTime < j))) {
                        makeOptions.add(R.drawable.msg_delete, (CharSequence) LocaleController.getString(R.string.Delete), true, new Runnable() { // from class: org.telegram.ui.PollItemMenu$$ExternalSyntheticLambda9
                            @Override // java.lang.Runnable
                            public final void run() {
                                PollItemMenu.this.lambda$setCell$8(bArr);
                            }
                        });
                    }
                }
                makeOptions.addGap();
                TLObject userOrChat = MessagesController.getInstance(this.messageObject.currentAccount).getUserOrChat(peerDialogId);
                makeOptions.addProfileCustom(userOrChat, AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.PollAddedByAtTime, DialogObject.getShortName(userOrChat), LocaleController.formatDateTime(pollAnswer.date, true))), new Runnable() { // from class: org.telegram.ui.PollItemMenu$$ExternalSyntheticLambda10
                    @Override // java.lang.Runnable
                    public final void run() {
                        PollItemMenu.this.lambda$setCell$9(peerDialogId, baseFragment);
                    }
                });
            }
        }
        makeOptions.setGapBackgroundColor(Theme.multAlpha(Theme.getColor(Theme.key_actionBarDefaultSubmenuItem, this.resourcesProvider), 0.06f));
        makeOptions.setBlurBackground(this.iBlur3Factory, BlurredBackgroundProviderImpl.scrimMenuBackground(this.resourcesProvider), false);
        makeOptions.setupSelectors();
        ViewGroup layout = makeOptions.getLayout();
        this.taskOptionsView = layout;
        layout.setPivotX(0.0f);
        this.taskOptionsView.setPivotY(0.0f);
        this.menuContainer.addView(this.taskOptionsView, LayoutHelper.createFrame(-2, -2, 51));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setCell$1(BaseFragment baseFragment, Long l) {
        Bundle bundle = new Bundle();
        if (l.longValue() >= 0) {
            bundle.putLong("user_id", l.longValue());
        } else {
            bundle.putLong("chat_id", -l.longValue());
        }
        baseFragment.presentFragment(new ProfileActivity(bundle));
        dismiss(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setCell$3(boolean z, BaseFragment baseFragment, ArrayList arrayList, TLRPC.PollAnswer pollAnswer) {
        if (!z) {
            baseFragment.getSendMessagesHelper().sendVote(this.messageObject, null, null);
        } else {
            arrayList.remove(pollAnswer);
            baseFragment.getSendMessagesHelper().sendVote(this.messageObject, arrayList, null);
        }
        dismiss(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setCell$4(boolean z, TLRPC.PollAnswer pollAnswer, BaseFragment baseFragment, ArrayList arrayList) {
        if (!z) {
            ArrayList<TLRPC.PollAnswer> arrayList2 = new ArrayList<>(1);
            arrayList2.add(pollAnswer);
            baseFragment.getSendMessagesHelper().sendVote(this.messageObject, arrayList2, null);
        } else {
            arrayList.add(pollAnswer);
            baseFragment.getSendMessagesHelper().sendVote(this.messageObject, arrayList, null);
        }
        dismiss(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setCell$5(ChatActivity chatActivity, TLRPC.PollAnswer pollAnswer) {
        MessageObject messageObject = this.messageObject;
        chatActivity.showFieldPanelForReplyQuote(messageObject, ChatActivity.ReplyQuote.fromPollOption(messageObject, pollAnswer.option));
        dismiss(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setCell$6(String str) {
        AndroidUtilities.addToClipboard(str);
        dismiss(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setCell$7(TLRPC.PollAnswer pollAnswer) {
        AndroidUtilities.addToClipboard(MessageObject.formatTextWithEntities(pollAnswer.text, false));
        dismiss(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setCell$8(byte[] bArr) {
        SendMessagesHelper.getInstance(this.messageObject.currentAccount).deletePollOption(this.messageObject, bArr);
        dismiss(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setCell$9(long j, BaseFragment baseFragment) {
        Bundle bundle = new Bundle();
        if (j > 0) {
            bundle.putLong("user_id", j);
        } else {
            bundle.putLong("chat_id", -j);
        }
        baseFragment.presentFragment(new ProfileActivity(bundle));
        dismiss(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:144:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0383 A[LOOP:0: B:152:0x0381->B:153:0x0383, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0333  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setupMessageOptions(final ChatActivity chatActivity, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, final Utilities.Callback callback) {
        TLRPC.ChatFull chatFull;
        boolean z;
        MessageObject messageObject;
        boolean z2;
        int i;
        int size;
        int i2;
        View view;
        TLRPC.User user;
        TLRPC.UserFull userFull;
        TLRPC.ChatFull chatFull2;
        TLRPC.ChatFull chatFull3;
        MessageObject messageObject2 = this.messageObject;
        List<TLRPC.TL_availableReaction> enabledReactionsList = chatActivity.getMediaDataController().getEnabledReactionsList();
        boolean z3 = (chatActivity.isSecretChat() || chatActivity.isInScheduleMode() || chatActivity.currentUser != null || !messageObject2.hasReactions() || (ChatObject.isChannel(chatActivity.currentChat) && !chatActivity.currentChat.megagroup) || ChatObject.isMonoForum(chatActivity.currentChat) || enabledReactionsList.isEmpty() || !messageObject2.messageOwner.reactions.can_see_list || messageObject2.isSecretMedia()) ? false : true;
        boolean z4 = !messageObject2.isForwardedChannelPost() ? messageObject2.isSecretMedia() || chatActivity.getChatMode() == 5 || chatActivity.isSecretChat() || chatActivity.isInScheduleMode() || !messageObject2.isReactionsAvailable() || ((((chatFull = chatActivity.chatInfo) == null || ((chatFull.available_reactions instanceof TLRPC.TL_chatReactionsNone) && !chatFull.paid_reactions_available)) && ((chatFull != null || ChatObject.isChannel(chatActivity.currentChat)) && chatActivity.currentUser == null && !ChatObject.isMonoForum(chatActivity.currentChat))) || enabledReactionsList.isEmpty()) : (chatFull3 = chatActivity.getMessagesController().getChatFull(-messageObject2.getFromChatId())) != null && (chatActivity.isSecretChat() || chatActivity.getChatMode() == 5 || chatActivity.isInScheduleMode() || !messageObject2.isReactionsAvailable() || (((chatFull3.available_reactions instanceof TLRPC.TL_chatReactionsNone) && !chatFull3.paid_reactions_available) || enabledReactionsList.isEmpty()));
        boolean z5 = (z3 || chatActivity.isInScheduleMode() || chatActivity.currentChat == null || !messageObject2.isOutOwner() || !messageObject2.isSent() || messageObject2.isEditing() || messageObject2.isSending() || messageObject2.isSendError() || messageObject2.isContentUnread() || messageObject2.isUnread() || ConnectionsManager.getInstance(chatActivity.getCurrentAccount()).getCurrentTime() - messageObject2.messageOwner.date >= chatActivity.getMessagesController().chatReadMarkExpirePeriod || (!ChatObject.isMegagroup(chatActivity.currentChat) && ChatObject.isChannel(chatActivity.currentChat)) || (chatFull2 = chatActivity.chatInfo) == null || chatFull2.participants_count > chatActivity.getMessagesController().chatReadMarkSizeThreshold || (messageObject2.messageOwner.action instanceof TLRPC.TL_messageActionChatJoinedByRequest) || chatActivity.getChatMode() == 3 || !messageObject2.canSetReaction() || ChatObject.isMonoForum(chatActivity.currentChat)) ? false : true;
        if (chatActivity.currentChat != null && !messageObject2.isOut() && ChatObject.isMonoForum(chatActivity.currentChat) && ChatObject.canManageMonoForum(chatActivity.getCurrentAccount(), chatActivity.currentChat)) {
            long j = chatActivity.currentChat.linked_monoforum_id;
            messageObject2.getFromChatId();
        }
        if (!z3 && chatActivity.currentChat == null && chatActivity.currentEncryptedChat == null && (user = chatActivity.currentUser) != null && !UserObject.isUserSelf(user) && !UserObject.isReplyUser(chatActivity.currentUser) && !UserObject.isAnonymous(chatActivity.currentUser)) {
            TLRPC.User user2 = chatActivity.currentUser;
            if (!user2.bot && !UserObject.isService(user2.id) && (((userFull = chatActivity.userInfo) == null || !userFull.read_dates_private) && !chatActivity.isInScheduleMode() && messageObject2.isOutOwner() && messageObject2.isSent() && !messageObject2.isEditing() && !messageObject2.isSending() && !messageObject2.isSendError() && !messageObject2.isContentUnread() && !messageObject2.isUnread() && chatActivity.getConnectionsManager().getCurrentTime() - messageObject2.messageOwner.date < chatActivity.getMessagesController().pmReadDateExpirePeriod && !(messageObject2.messageOwner.action instanceof TLRPC.TL_messageActionChatJoinedByRequest))) {
                z = true;
                TLRPC.User user3 = chatActivity.currentUser;
                boolean z6 = ((user3 == null && (UserObject.isReplyUser(user3) || UserObject.isAnonymous(chatActivity.currentUser))) || chatActivity.isInScheduleMode() || !messageObject2.isEdited() || (messageObject2.messageOwner.action instanceof TLRPC.TL_messageActionChatJoinedByRequest)) ? false : true;
                final ItemOptions makeOptions = ItemOptions.makeOptions(this.containerView, chatActivity.getResourceProvider(), (View) null, !z3 || z5);
                if (z5) {
                    messageObject = messageObject2;
                    z2 = z4;
                    i = -2;
                    if (z) {
                        makeOptions.addView(new MessagePrivateSeenView(getContext(), 0, messageObject, new Runnable() { // from class: org.telegram.ui.PollItemMenu$$ExternalSyntheticLambda15
                            @Override // java.lang.Runnable
                            public final void run() {
                                PollItemMenu.this.lambda$setupMessageOptions$10();
                            }
                        }, this.resourcesProvider), LayoutHelper.createLinear(-1, 36));
                        makeOptions.addGap();
                    } else if (z6) {
                        makeOptions.addView(new MessagePrivateSeenView(getContext(), 1, messageObject, new Runnable() { // from class: org.telegram.ui.PollItemMenu$$ExternalSyntheticLambda16
                            @Override // java.lang.Runnable
                            public final void run() {
                                PollItemMenu.this.lambda$setupMessageOptions$11();
                            }
                        }, this.resourcesProvider), LayoutHelper.createLinear(-1, 36));
                        makeOptions.addGap();
                    }
                } else {
                    final MessageSeenView messageSeenView = new MessageSeenView(getContext(), chatActivity.getCurrentAccount(), messageObject2, chatActivity.currentChat);
                    FrameLayout frameLayout = new FrameLayout(getContext());
                    frameLayout.addView(messageSeenView, LayoutHelper.createFrame(-1, 36.0f));
                    final ItemOptions makeSwipeback = makeOptions.makeSwipeback();
                    ActionBarMenuSubItem actionBarMenuSubItem = new ActionBarMenuSubItem(getContext(), true, false, this.resourcesProvider);
                    actionBarMenuSubItem.setItemHeight(44);
                    actionBarMenuSubItem.setTextAndIcon(LocaleController.getString(R.string.Back), R.drawable.msg_arrow_back);
                    actionBarMenuSubItem.getTextView().setPadding(LocaleController.isRTL ? 0 : AndroidUtilities.dp(40.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(40.0f) : 0, 0);
                    FrameLayout frameLayout2 = new FrameLayout(getContext());
                    final LinearLayout linearLayout = new LinearLayout(getContext());
                    linearLayout.setBackgroundColor(Theme.getColor(Theme.key_actionBarDefaultSubmenuBackground, this.resourcesProvider));
                    linearLayout.setOrientation(1);
                    final RecyclerListView createListView = messageSeenView.createListView();
                    frameLayout2.addView(actionBarMenuSubItem);
                    linearLayout.addView(frameLayout2);
                    linearLayout.addView(new ActionBarPopupWindow.GapView(getContext(), this.resourcesProvider), LayoutHelper.createLinear(-1, 8));
                    frameLayout2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.PollItemMenu.11
                        @Override // android.view.View.OnClickListener
                        public void onClick(View view2) {
                            Bulletin.hideVisible();
                            makeOptions.closeSwipeback();
                        }
                    });
                    z2 = z4;
                    messageObject = messageObject2;
                    i = -2;
                    messageSeenView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.PollItemMenu.12
                        @Override // android.view.View.OnClickListener
                        public void onClick(View view2) {
                            if (messageSeenView.users.isEmpty()) {
                                return;
                            }
                            if (messageSeenView.users.size() == 1 && (messageSeenView.dates.size() <= 0 || ((Integer) messageSeenView.dates.get(0)).intValue() <= 0)) {
                                TLObject tLObject = (TLObject) messageSeenView.users.get(0);
                                if (tLObject == null) {
                                    return;
                                }
                                Bundle bundle = new Bundle();
                                if (tLObject instanceof TLRPC.User) {
                                    bundle.putLong("user_id", ((TLRPC.User) tLObject).id);
                                } else if (tLObject instanceof TLRPC.Chat) {
                                    bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).id);
                                }
                                chatActivity.presentFragment(new ProfileActivity(bundle));
                                PollItemMenu.this.dismiss(false);
                                return;
                            }
                            if (SharedConfig.messageSeenHintCount > 0 && chatActivity.contentView.getKeyboardHeight() < AndroidUtilities.dp(20.0f)) {
                                chatActivity.messageSeenPrivacyBulletin = BulletinFactory.of(Bulletin.BulletinWindow.make(PollItemMenu.this.getContext()), PollItemMenu.this.resourcesProvider).createErrorBulletin(AndroidUtilities.replaceTags(LocaleController.getString(R.string.MessageSeenTooltipMessage)));
                                chatActivity.messageSeenPrivacyBulletin.setDuration(4000);
                                chatActivity.messageSeenPrivacyBulletin.show();
                                SharedConfig.updateMessageSeenHintCount(SharedConfig.messageSeenHintCount - 1);
                            }
                            createListView.requestLayout();
                            linearLayout.requestLayout();
                            createListView.getAdapter().notifyDataSetChanged();
                            makeOptions.openSwipeback(makeSwipeback);
                        }
                    });
                    linearLayout.addView(createListView, LayoutHelper.createLinear(-1, -2));
                    makeSwipeback.addView(linearLayout);
                    makeOptions.addView(frameLayout);
                    makeOptions.addGap();
                }
                size = arrayList.size();
                for (i2 = 0; i2 < size; i2++) {
                    final int intValue = ((Integer) arrayList3.get(i2)).intValue();
                    makeOptions.add(((Integer) arrayList.get(i2)).intValue(), (CharSequence) arrayList2.get(i2), new Runnable() { // from class: org.telegram.ui.PollItemMenu$$ExternalSyntheticLambda17
                        @Override // java.lang.Runnable
                        public final void run() {
                            PollItemMenu.this.lambda$setupMessageOptions$12(callback, intValue);
                        }
                    });
                }
                makeOptions.setGapBackgroundColor(Theme.multAlpha(Theme.getColor(Theme.key_actionBarDefaultSubmenuItem, this.resourcesProvider), 0.06f));
                makeOptions.setBlurBackground(this.iBlur3Factory, BlurredBackgroundProviderImpl.scrimMenuBackground(this.resourcesProvider), false);
                makeOptions.setupSelectors();
                ViewGroup layout = makeOptions.getLayout();
                this.messageOptionsView = layout;
                layout.setPivotX(0.0f);
                this.messageOptionsView.setPivotY(0.0f);
                this.menuContainer.addView(this.messageOptionsView, LayoutHelper.createFrame(i, i, 51));
                view = this.messageOptionsView;
                if (view instanceof ActionBarPopupWindow.ActionBarPopupWindowLayout) {
                    ((ActionBarPopupWindow.ActionBarPopupWindowLayout) view).setOnSizeChangedListener(new ActionBarPopupWindow.onSizeChangedListener() { // from class: org.telegram.ui.PollItemMenu$$ExternalSyntheticLambda18
                        @Override // org.telegram.ui.ActionBar.ActionBarPopupWindow.onSizeChangedListener
                        public final void onSizeChanged() {
                            PollItemMenu.this.updateTranslation();
                        }
                    });
                    this.messageOptionsView.setOnTouchListener(new View.OnTouchListener() { // from class: org.telegram.ui.PollItemMenu$$ExternalSyntheticLambda19
                        @Override // android.view.View.OnTouchListener
                        public final boolean onTouch(View view2, MotionEvent motionEvent) {
                            boolean lambda$setupMessageOptions$13;
                            lambda$setupMessageOptions$13 = PollItemMenu.this.lambda$setupMessageOptions$13(view2, motionEvent);
                            return lambda$setupMessageOptions$13;
                        }
                    });
                }
                if (z2) {
                    final ReactionsContainerLayout reactionsContainerLayout = new ReactionsContainerLayout((chatActivity.getUserConfig().getClientUserId() > chatActivity.getDialogId() ? 1 : (chatActivity.getUserConfig().getClientUserId() == chatActivity.getDialogId() ? 0 : -1)) == 0 ? 3 : 0, chatActivity, getContext(), chatActivity.getCurrentAccount(), this.resourcesProvider);
                    reactionsContainerLayout.forceAttachToParent = true;
                    float f = 22;
                    reactionsContainerLayout.setPadding(AndroidUtilities.dp(4.0f) + (LocaleController.isRTL ? 0 : 24), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f) + (LocaleController.isRTL ? 24 : 0), AndroidUtilities.dp(f));
                    final MessageObject messageObject3 = messageObject;
                    reactionsContainerLayout.setDelegate(new ReactionsContainerLayout.ReactionsContainerDelegate() { // from class: org.telegram.ui.PollItemMenu.13
                        @Override // org.telegram.ui.Components.ReactionsContainerLayout.ReactionsContainerDelegate
                        public /* synthetic */ boolean allowLongPress() {
                            return ReactionsContainerLayout.ReactionsContainerDelegate.-CC.$default$allowLongPress(this);
                        }

                        @Override // org.telegram.ui.Components.ReactionsContainerLayout.ReactionsContainerDelegate
                        public /* synthetic */ boolean drawBackground() {
                            return ReactionsContainerLayout.ReactionsContainerDelegate.-CC.$default$drawBackground(this);
                        }

                        @Override // org.telegram.ui.Components.ReactionsContainerLayout.ReactionsContainerDelegate
                        public /* synthetic */ void drawRoundRect(Canvas canvas, RectF rectF, float f2, float f3, float f4, int i3, boolean z7) {
                            ReactionsContainerLayout.ReactionsContainerDelegate.-CC.$default$drawRoundRect(this, canvas, rectF, f2, f3, f4, i3, z7);
                        }

                        @Override // org.telegram.ui.Components.ReactionsContainerLayout.ReactionsContainerDelegate
                        public /* synthetic */ boolean needEnterText() {
                            return ReactionsContainerLayout.ReactionsContainerDelegate.-CC.$default$needEnterText(this);
                        }

                        @Override // org.telegram.ui.Components.ReactionsContainerLayout.ReactionsContainerDelegate
                        public /* synthetic */ void onEmojiWindowDismissed() {
                            ReactionsContainerLayout.ReactionsContainerDelegate.-CC.$default$onEmojiWindowDismissed(this);
                        }

                        @Override // org.telegram.ui.Components.ReactionsContainerLayout.ReactionsContainerDelegate
                        public void onReactionClicked(View view2, ReactionsLayoutInBubble.VisibleReaction visibleReaction, boolean z7, boolean z8) {
                            float f2;
                            float f3;
                            int i3;
                            float f4;
                            BaseCell findMessageCell = chatActivity.findMessageCell(messageObject3.getId(), true);
                            if (findMessageCell instanceof ChatMessageCell) {
                                ChatMessageCell chatMessageCell = (ChatMessageCell) findMessageCell;
                                ReactionsLayoutInBubble.ReactionButton reactionButton = chatMessageCell.reactionsLayoutInBubble.getReactionButton(visibleReaction);
                                if (reactionButton != null) {
                                    f2 = r1.x + reactionButton.x + (reactionButton.width / 2.0f);
                                    f3 = chatMessageCell.reactionsLayoutInBubble.y + reactionButton.y;
                                    i3 = reactionButton.height;
                                    f4 = f3 + (i3 / 2.0f);
                                }
                                f2 = 0.0f;
                                f4 = 0.0f;
                            } else {
                                if (findMessageCell instanceof ChatActionCell) {
                                    ChatActionCell chatActionCell = (ChatActionCell) findMessageCell;
                                    ReactionsLayoutInBubble.ReactionButton reactionButton2 = chatActionCell.reactionsLayoutInBubble.getReactionButton(visibleReaction);
                                    if (reactionButton2 != null) {
                                        f2 = r1.x + reactionButton2.x + (reactionButton2.width / 2.0f);
                                        f3 = chatActionCell.reactionsLayoutInBubble.y + reactionButton2.y;
                                        i3 = reactionButton2.height;
                                        f4 = f3 + (i3 / 2.0f);
                                    }
                                }
                                f2 = 0.0f;
                                f4 = 0.0f;
                            }
                            chatActivity.selectReaction(findMessageCell, messageObject3, reactionsContainerLayout, view2, f2, f4, visibleReaction, false, (visibleReaction == null || !visibleReaction.isStar) ? z7 : true, z8, false);
                            PollItemMenu.this.dismiss(false);
                        }
                    });
                    FrameLayout frameLayout3 = this.menuContainer;
                    this.reactionsView = reactionsContainerLayout;
                    frameLayout3.addView(reactionsContainerLayout, LayoutHelper.createFrame(i, (int) ((reactionsContainerLayout.getTopOffset() / AndroidUtilities.density) + 52.0f + f), 51));
                    reactionsContainerLayout.setMessage(messageObject3, chatActivity.chatInfo, true);
                    this.reactionsView.setTransitionProgress(1.0f);
                }
                updateTranslation();
            }
        }
        z = false;
        TLRPC.User user32 = chatActivity.currentUser;
        if (user32 == null) {
        }
        final ItemOptions makeOptions2 = ItemOptions.makeOptions(this.containerView, chatActivity.getResourceProvider(), (View) null, !z3 || z5);
        if (z5) {
        }
        size = arrayList.size();
        while (i2 < size) {
        }
        makeOptions2.setGapBackgroundColor(Theme.multAlpha(Theme.getColor(Theme.key_actionBarDefaultSubmenuItem, this.resourcesProvider), 0.06f));
        makeOptions2.setBlurBackground(this.iBlur3Factory, BlurredBackgroundProviderImpl.scrimMenuBackground(this.resourcesProvider), false);
        makeOptions2.setupSelectors();
        ViewGroup layout2 = makeOptions2.getLayout();
        this.messageOptionsView = layout2;
        layout2.setPivotX(0.0f);
        this.messageOptionsView.setPivotY(0.0f);
        this.menuContainer.addView(this.messageOptionsView, LayoutHelper.createFrame(i, i, 51));
        view = this.messageOptionsView;
        if (view instanceof ActionBarPopupWindow.ActionBarPopupWindowLayout) {
        }
        if (z2) {
        }
        updateTranslation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setupMessageOptions$10() {
        dismiss(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setupMessageOptions$11() {
        dismiss(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setupMessageOptions$12(Utilities.Callback callback, int i) {
        callback.run(Integer.valueOf(i));
        boolean z = true;
        if (i != 1 && i != 13) {
            z = false;
        }
        dismiss(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$setupMessageOptions$13(View view, MotionEvent motionEvent) {
        if (this.messageOptionsView == null || motionEvent.getAction() != 0) {
            return false;
        }
        Drawable backgroundDrawable = ((ActionBarPopupWindow.ActionBarPopupWindowLayout) this.messageOptionsView).getBackgroundDrawable();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(backgroundDrawable.getBounds());
        rectF.offset(this.messageOptionsView.getX(), this.messageOptionsView.getY());
        if (rectF.contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        dismiss(true);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setupTranslation() {
        if (this.hasTranslation || this.windowView.getWidth() <= 0) {
            return;
        }
        ChatMessageCell chatMessageCell = this.cell;
        if (chatMessageCell != null) {
            int[] iArr = new int[2];
            chatMessageCell.getLocationOnScreen(iArr);
            int i = iArr[0];
            Insets insets = this.insets;
            this.tx = i - insets.left;
            float f = iArr[1] - insets.top;
            this.ty = f;
            if (!this.hasDestTranslation) {
                this.hasDestTranslation = true;
                this.dtx1 = 0.0f;
                this.dty1 = f;
                if (this.messageOptionsView != null) {
                    float height = f + this.cell.getHeight() + this.messageOptionsView.getHeight();
                    int height2 = this.windowView.getHeight();
                    Insets insets2 = this.insets;
                    if (height > ((height2 - insets2.top) - insets2.bottom) - AndroidUtilities.dp(66.0f)) {
                        int height3 = this.windowView.getHeight();
                        Insets insets3 = this.insets;
                        this.dty1 = ((((height3 - insets3.top) - insets3.bottom) - AndroidUtilities.dp(66.0f)) - this.cell.getHeight()) - this.messageOptionsView.getHeight();
                    }
                }
                int pollIndex = this.myTaskCell.getPollIndex(this.taskId);
                this.myTaskCell.getPollButtonTop(pollIndex);
                float pollButtonBottom = this.myTaskCell.getPollButtonBottom(pollIndex);
                this.dtx2 = 0.0f;
                float f2 = this.ty;
                this.dty2 = f2;
                float f3 = (int) pollButtonBottom;
                float f4 = f2 + f3;
                int height4 = this.windowView.getHeight();
                Insets insets4 = this.insets;
                if (f4 > (((height4 - insets4.top) - insets4.bottom) - AndroidUtilities.dp(78.0f)) - this.hintTextView.getHeight()) {
                    int height5 = this.windowView.getHeight();
                    Insets insets5 = this.insets;
                    this.dty2 = ((((height5 - insets5.top) - insets5.bottom) - AndroidUtilities.dp(78.0f)) - this.hintTextView.getHeight()) - r0;
                }
                if (this.taskOptionsView != null) {
                    float height6 = this.dty2 + f3 + r2.getHeight();
                    int height7 = this.windowView.getHeight();
                    Insets insets6 = this.insets;
                    if (height6 > (((height7 - insets6.top) - insets6.bottom) - AndroidUtilities.dp(78.0f)) - this.hintTextView.getHeight()) {
                        int height8 = this.windowView.getHeight();
                        Insets insets7 = this.insets;
                        this.dty2 = (((((height8 - insets7.top) - insets7.bottom) - AndroidUtilities.dp(78.0f)) - this.hintTextView.getHeight()) - r0) - this.taskOptionsView.getHeight();
                    }
                }
            }
            updateTranslation();
        } else {
            this.ty = 0.0f;
            this.tx = 0.0f;
        }
        this.hasTranslation = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateTranslation() {
        float positionAnimated = this.viewPager.getPositionAnimated();
        float lerp = AndroidUtilities.lerp(0, -this.viewPager.getWidth(), positionAnimated);
        float lerp2 = AndroidUtilities.lerp(this.viewPager.getWidth(), 0, positionAnimated);
        if (this.hasTranslation) {
            View view = this.messageOptionsView;
            if (view instanceof ActionBarPopupWindow.ActionBarPopupWindowLayout) {
                ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = (ActionBarPopupWindow.ActionBarPopupWindowLayout) view;
                this.dtx1 = 0.0f;
                float f = this.ty;
                this.dty1 = f;
                if (view != null) {
                    float height = f + this.cell.getHeight() + actionBarPopupWindowLayout.getVisibleHeight();
                    int height2 = this.windowView.getHeight();
                    Insets insets = this.insets;
                    if (height > ((height2 - insets.top) - insets.bottom) - AndroidUtilities.dp(66.0f)) {
                        int height3 = this.windowView.getHeight();
                        Insets insets2 = this.insets;
                        this.dty1 = ((((height3 - insets2.top) - insets2.bottom) - AndroidUtilities.dp(66.0f)) - this.cell.getHeight()) - actionBarPopupWindowLayout.getVisibleHeight();
                    }
                }
            }
        }
        this.myCell.setTranslationX(AndroidUtilities.lerp(this.tx, this.dtx1, this.dismissingWithAlpha ? 1.0f : this.openProgress) + lerp2);
        this.myCell.setTranslationY(AndroidUtilities.lerp(this.ty, this.dty1, this.dismissingWithAlpha ? 1.0f : this.openProgress));
        View view2 = this.messageOptionsView;
        if (view2 != null) {
            if (this.isOut) {
                view2.setTranslationX(((((this.dtx1 + lerp2) + this.myCell.getLeft()) + this.myCell.getPollButtonsLeft()) - AndroidUtilities.dp(8.0f)) - this.messageOptionsView.getLeft());
            } else {
                view2.setTranslationX((((this.dtx1 + lerp2) + (this.myCell.needDrawAvatar() ? AndroidUtilities.dp(48.0f) : 0)) + this.myCell.getLeft()) - this.messageOptionsView.getLeft());
            }
            this.messageOptionsViewMaxWidth = this.menuContainer.getMeasuredWidth() - (this.messageOptionsView.getX() - lerp2);
            this.messageOptionsView.setTranslationY(((this.myCell.getY() + this.myCell.getHeight()) - this.messageOptionsView.getTop()) - this.menuContainer.getTop());
            this.messageOptionsView.setAlpha(this.openProgress);
            float lerp3 = AndroidUtilities.lerp(0.75f, 1.0f, this.openProgress);
            this.messageOptionsView.setScaleX(lerp3);
            this.messageOptionsView.setScaleY(lerp3);
        }
        this.myTaskCell.setTranslationX(AndroidUtilities.lerp(this.tx, this.dtx2, this.dismissingWithAlpha ? 1.0f : this.openProgress) + lerp);
        this.myTaskCell.setTranslationY(AndroidUtilities.lerp(this.ty, this.dty2, this.dismissingWithAlpha ? 1.0f : this.openProgress));
        if (this.taskOptionsView != null) {
            int pollIndex = this.myTaskCell.getPollIndex(this.taskId);
            this.myTaskCell.getPollButtonTop(pollIndex);
            float pollButtonBottom = this.myTaskCell.getPollButtonBottom(pollIndex);
            if (this.isOut) {
                this.taskOptionsView.setTranslationX(((((this.dtx2 + lerp) + this.myTaskCell.getLeft()) + this.myTaskCell.getPollButtonsLeft()) - AndroidUtilities.dp(8.0f)) - this.taskOptionsView.getLeft());
            } else {
                this.taskOptionsView.setTranslationX((((this.dtx2 + lerp) + (this.myTaskCell.needDrawAvatar() ? AndroidUtilities.dp(48.0f) : 0)) + this.myTaskCell.getLeft()) - this.taskOptionsView.getLeft());
            }
            this.taskOptionsViewMaxWidth = this.menuContainer.getMeasuredWidth() - (this.taskOptionsView.getX() - lerp2);
            this.taskOptionsView.setTranslationY(((this.myTaskCell.getY() + ((int) pollButtonBottom)) - this.taskOptionsView.getTop()) - this.menuContainer.getTop());
            this.taskOptionsView.setAlpha(this.openProgress);
            float lerp4 = AndroidUtilities.lerp(0.75f, 1.0f, this.openProgress);
            this.taskOptionsView.setScaleX(lerp4);
            this.taskOptionsView.setScaleY(lerp4);
        }
        if (this.dismissingWithAlpha) {
            this.myCell.setAlpha(this.openProgress);
            this.myTaskCell.setAlpha(this.openProgress);
        }
        if (this.reactionsView != null) {
            float max = lerp2 + Math.max(0.0f, ((this.myCell.getBoundsRight() + this.myCell.getBoundsLeft()) / 2.0f) - (this.reactionsView.getWidth() * 0.8f));
            this.reactionsView.setTranslationX(max);
            this.reactionsView.setTranslationY(Math.max(0.0f, ((this.myCell.getY() - this.reactionsView.getHeight()) + AndroidUtilities.dp(22.0f)) - this.menuContainer.getTop()));
            this.reactionsView.setAlpha(this.openProgress);
            View windowView = this.reactionsView.getWindowView();
            if (windowView != null) {
                windowView.setTranslationX(max);
                windowView.setAlpha(this.openProgress);
            }
        }
        this.hintTextView.setTranslationX(lerp);
        this.hintTextView.setAlpha(this.openProgress);
        this.tabsView.setSelectedTab(positionAnimated);
        this.tabsView.setAlpha(this.openProgress);
    }

    private void prepareBlur(final View view) {
        if (view != null) {
            view.setVisibility(4);
        }
        ScrimOptions.makeGlobalBlurBitmaps(new Utilities.Callback2() { // from class: org.telegram.ui.PollItemMenu$$ExternalSyntheticLambda1
            @Override // org.telegram.messenger.Utilities.Callback2
            public final void run(Object obj, Object obj2) {
                PollItemMenu.this.lambda$prepareBlur$14(view, (Bitmap) obj, (Bitmap) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$prepareBlur$14(View view, Bitmap bitmap, Bitmap bitmap2) {
        if (view != null) {
            view.setVisibility(0);
        }
        this.blurBitmap = bitmap;
        Paint paint = new Paint(1);
        this.blurBitmapPaint = paint;
        Bitmap bitmap3 = this.blurBitmap;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
        this.blurBitmapShader = bitmapShader;
        paint.setShader(bitmapShader);
        ColorMatrix colorMatrix = new ColorMatrix();
        AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, Theme.isCurrentThemeDark() ? 0.05f : 0.25f);
        AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, Theme.isCurrentThemeDark() ? -0.02f : -0.04f);
        this.blurBitmapPaint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        this.blurMatrix = new Matrix();
        this.iBlur3SourceBitmap.setBitmap(bitmap2);
        checkBitmapMatrix();
    }

    @Override // android.app.Dialog
    public void show() {
        if (AndroidUtilities.isSafeToShow(getContext())) {
            super.show();
            prepareBlur(null);
            this.setTaskInvisible = true;
            this.open = true;
            animateOpenTo(true, null);
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        dismiss(true);
    }

    public void dismiss(boolean z) {
        ChatMessageCell chatMessageCell;
        ReactionsContainerLayout reactionsContainerLayout;
        if (z && (reactionsContainerLayout = this.reactionsView) != null && reactionsContainerLayout.getReactionsWindow() != null && this.reactionsView.getReactionsWindow().isShowing()) {
            this.reactionsView.dismissWindow();
            return;
        }
        if (this.dismissing) {
            return;
        }
        this.dismissing = true;
        this.hasTranslation = false;
        this.viewPager.cancelTouches();
        final boolean z2 = this.viewPager.getCurrentPosition() == 1;
        if (z && z2) {
            ChatMessageCell chatMessageCell2 = this.cell;
            if (chatMessageCell2 != null) {
                chatMessageCell2.setVisibility(4);
                this.cell.invalidate();
            }
        } else if (!z && (chatMessageCell = this.cell) != null) {
            chatMessageCell.setVisibility(0);
            ChatMessageCell chatMessageCell3 = this.cell;
            chatMessageCell3.doNotDrawPollId = null;
            chatMessageCell3.invalidate();
        }
        this.dismissingWithAlpha = !z;
        setupTranslation();
        this.open = false;
        animateOpenTo(false, new Runnable() { // from class: org.telegram.ui.PollItemMenu$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                PollItemMenu.this.lambda$dismiss$16(z2);
            }
        });
        this.windowView.invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$dismiss$15() {
        super.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$dismiss$16(boolean z) {
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.PollItemMenu$$ExternalSyntheticLambda20
            @Override // java.lang.Runnable
            public final void run() {
                PollItemMenu.this.lambda$dismiss$15();
            }
        });
        ChatMessageCell chatMessageCell = this.cell;
        if (chatMessageCell != null) {
            chatMessageCell.setVisibility(0);
            ChatMessageCell chatMessageCell2 = this.cell;
            chatMessageCell2.doNotDrawPollId = null;
            chatMessageCell2.invalidate();
        }
        Runnable runnable = this.dismissListener;
        if (runnable != null) {
            AndroidUtilities.runOnUIThread(runnable);
            this.dismissListener = null;
        }
    }

    public void setOnDismissListener(Runnable runnable) {
        this.dismissListener = runnable;
    }

    private void animateOpenTo(final boolean z, final Runnable runnable) {
        ValueAnimator valueAnimator = this.openAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.open2Animator;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        setupTranslation();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.openProgress, z ? 1.0f : 0.0f);
        this.openAnimator = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.PollItemMenu$$ExternalSyntheticLambda11
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                PollItemMenu.this.lambda$animateOpenTo$17(valueAnimator3);
            }
        });
        this.openAnimator.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.PollItemMenu.14
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                PollItemMenu.this.openProgress = z ? 1.0f : 0.0f;
                PollItemMenu.this.windowView.invalidate();
                PollItemMenu.this.containerView.invalidate();
                PollItemMenu.this.updateTranslation();
                Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                }
            }
        });
        long j = !z ? 330L : 520L;
        ValueAnimator valueAnimator3 = this.openAnimator;
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        valueAnimator3.setInterpolator(cubicBezierInterpolator);
        this.openAnimator.setDuration(j);
        this.openAnimator.start();
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.openProgress2, z ? 1.0f : 0.0f);
        this.open2Animator = ofFloat2;
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.PollItemMenu$$ExternalSyntheticLambda12
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator4) {
                PollItemMenu.this.lambda$animateOpenTo$18(valueAnimator4);
            }
        });
        this.open2Animator.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.PollItemMenu.15
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                PollItemMenu.this.openProgress2 = z ? 1.0f : 0.0f;
            }
        });
        this.open2Animator.setDuration((long) (j * 1.5f));
        this.open2Animator.setInterpolator(cubicBezierInterpolator);
        this.open2Animator.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$animateOpenTo$17(ValueAnimator valueAnimator) {
        this.openProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.windowView.invalidate();
        this.containerView.invalidate();
        ChatMessageCell chatMessageCell = this.myTaskCell;
        if (chatMessageCell != null) {
            chatMessageCell.invalidate();
        }
        updateTranslation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$animateOpenTo$18(ValueAnimator valueAnimator) {
        this.openProgress2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
    }
}
