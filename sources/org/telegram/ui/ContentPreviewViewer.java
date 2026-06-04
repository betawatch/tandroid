package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import me.vkryl.core.reference.ReferenceList;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.messenger.WebFile;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.ContextLinkCell;
import org.telegram.ui.Cells.StickerCell;
import org.telegram.ui.Cells.StickerEmojiCell;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.EmojiPacksAlert;
import org.telegram.ui.Components.EmojiView;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.PaintingOverlay;
import org.telegram.ui.Components.Reactions.CustomEmojiReactionsWindow;
import org.telegram.ui.Components.Reactions.ReactionsLayoutInBubble;
import org.telegram.ui.Components.ReactionsContainerLayout;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.ScrimOptions;
import org.telegram.ui.Components.StickersDialogs;
import org.telegram.ui.Components.SuggestEmojiView;
import org.telegram.ui.Components.blur3.BlurredBackgroundDrawableViewFactory;
import org.telegram.ui.Components.blur3.drawable.color.impl.BlurredBackgroundProviderImpl;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceBitmap;
import org.telegram.ui.Components.blur3.utils.Blur3Utils;
import org.telegram.ui.Components.chat.ViewPositionWatcher;
import org.telegram.ui.Components.poll.RecentVotersCell;
import org.telegram.ui.ContentPreviewViewer;
import org.telegram.ui.Stories.DarkThemeResourceProvider;

/* loaded from: classes4.dex */
public class ContentPreviewViewer {
    private static volatile ContentPreviewViewer Instance;
    private static TextPaint textPaint;
    private ColorDrawable backgroundDrawable;
    private float blurProgress;
    private Bitmap blurrBitmap;
    public ImageReceiver centerImage;
    private boolean clearsInputField;
    private boolean closeOnDismiss;
    private FrameLayoutDrawer containerView;
    private int currentAccount;
    private int currentContentType;
    private TLRPC.Document currentDocument;
    private float currentMoveY;
    private float currentMoveYProgress;
    private View currentPreviewCell;
    private String currentQuery;
    private TLRPC.InputStickerSet currentStickerSet;
    private ContentPreviewViewerDelegate delegate;
    private boolean drawEffect;
    private ImageReceiver effectImage;
    private float finalMoveY;
    private SendMessagesHelper.ImportingSticker importingSticker;
    private TLRPC.BotInlineResult inlineResult;
    private boolean isPhotoEditor;
    private boolean isRecentSticker;
    private boolean isStickerEditor;
    private boolean isVisible;
    private int keyboardHeight;
    private WindowInsetsCompat lastInsets;
    private float lastTouchY;
    private long lastUpdateTime;
    private boolean menuVisible;
    private float moveY = 0.0f;
    private Runnable openPreviewRunnable;
    private final Paint paint;
    public PaintingOverlay paintingOverlay;
    private Path paintingOverlayClipPath;
    private Activity parentActivity;
    private Object parentObject;
    private View popupLayout;
    ActionBarPopupWindow popupWindow;
    private boolean preparingBitmap;
    private ReactionsContainerLayout reactionsLayout;
    private FrameLayout reactionsLayoutContainer;
    private Theme.ResourcesProvider resourcesProvider;
    private final BlurredBackgroundDrawableViewFactory scrimBlur3Factory;
    private final BlurredBackgroundSourceBitmap scrimBlur3SourceBitmap;
    private ArrayList selectedEmojis;
    private float showProgress;
    private final Runnable showSheetRunnable;
    private Drawable slideUpDrawable;
    private float startMoveY;
    private int startX;
    private int startY;
    private StaticLayout stickerEmojiLayout;
    private TLRPC.TL_messages_stickerSet stickerSetForCustomSticker;
    private UnlockPremiumView unlockPremiumView;
    VibrationEffect vibrationEffect;
    private WindowManager.LayoutParams windowLayoutParams;
    private FrameLayout windowView;

    public interface ContentPreviewViewerDelegate {

        public abstract /* synthetic */ class -CC {
            public static void $default$addCaptionToGif(ContentPreviewViewerDelegate contentPreviewViewerDelegate, Object obj, Object obj2, boolean z, int i, int i2) {
            }

            public static void $default$addToFavoriteSelected(ContentPreviewViewerDelegate contentPreviewViewerDelegate, String str) {
            }

            public static boolean $default$can(ContentPreviewViewerDelegate contentPreviewViewerDelegate) {
                return true;
            }

            public static boolean $default$canAddCaption(ContentPreviewViewerDelegate contentPreviewViewerDelegate, TLRPC.Document document) {
                return false;
            }

            public static boolean $default$canDeleteSticker(ContentPreviewViewerDelegate contentPreviewViewerDelegate, TLRPC.Document document) {
                return false;
            }

            public static boolean $default$canEditSticker(ContentPreviewViewerDelegate contentPreviewViewerDelegate) {
                return false;
            }

            public static boolean $default$canSchedule(ContentPreviewViewerDelegate contentPreviewViewerDelegate) {
                return false;
            }

            public static boolean $default$canSendSticker(ContentPreviewViewerDelegate contentPreviewViewerDelegate) {
                return true;
            }

            public static Boolean $default$canSetAsStatus(ContentPreviewViewerDelegate contentPreviewViewerDelegate, TLRPC.Document document) {
                return null;
            }

            public static void $default$copyEmoji(ContentPreviewViewerDelegate contentPreviewViewerDelegate, TLRPC.Document document) {
            }

            public static void $default$deleteSticker(ContentPreviewViewerDelegate contentPreviewViewerDelegate, TLRPC.Document document) {
            }

            public static void $default$editSticker(ContentPreviewViewerDelegate contentPreviewViewerDelegate, TLRPC.Document document) {
            }

            public static ItemOptions $default$getCustomItemOptions(ContentPreviewViewerDelegate contentPreviewViewerDelegate, ViewGroup viewGroup, View view) {
                return null;
            }

            public static TLRPC.TL_messageMediaPoll $default$getPoll(ContentPreviewViewerDelegate contentPreviewViewerDelegate) {
                return null;
            }

            public static TLRPC.PollAnswer $default$getPollAnswer(ContentPreviewViewerDelegate contentPreviewViewerDelegate) {
                return null;
            }

            public static MessageObject $default$getPollMessageObject(ContentPreviewViewerDelegate contentPreviewViewerDelegate) {
                return null;
            }

            public static String $default$getQuery(ContentPreviewViewerDelegate contentPreviewViewerDelegate, boolean z) {
                return null;
            }

            public static void $default$gifAddedOrDeleted(ContentPreviewViewerDelegate contentPreviewViewerDelegate) {
            }

            public static boolean $default$isInScheduleMode(ContentPreviewViewerDelegate contentPreviewViewerDelegate) {
                return false;
            }

            public static boolean $default$isPhotoEditor(ContentPreviewViewerDelegate contentPreviewViewerDelegate) {
                return false;
            }

            public static boolean $default$isReplacedSticker(ContentPreviewViewerDelegate contentPreviewViewerDelegate) {
                return false;
            }

            public static boolean $default$isSettingIntroSticker(ContentPreviewViewerDelegate contentPreviewViewerDelegate) {
                return false;
            }

            public static boolean $default$isStickerEditor(ContentPreviewViewerDelegate contentPreviewViewerDelegate) {
                return false;
            }

            public static boolean $default$needCopy(ContentPreviewViewerDelegate contentPreviewViewerDelegate, TLRPC.Document document) {
                return false;
            }

            public static boolean $default$needMenu(ContentPreviewViewerDelegate contentPreviewViewerDelegate) {
                return true;
            }

            public static boolean $default$needOpen(ContentPreviewViewerDelegate contentPreviewViewerDelegate) {
                return true;
            }

            public static boolean $default$needRemove(ContentPreviewViewerDelegate contentPreviewViewerDelegate) {
                return false;
            }

            public static boolean $default$needRemoveFromRecent(ContentPreviewViewerDelegate contentPreviewViewerDelegate, TLRPC.Document document) {
                return false;
            }

            public static boolean $default$needSend(ContentPreviewViewerDelegate contentPreviewViewerDelegate, int i) {
                return false;
            }

            public static void $default$newStickerPackSelected(ContentPreviewViewerDelegate contentPreviewViewerDelegate, CharSequence charSequence, String str, Utilities.Callback callback) {
            }

            public static void $default$openSet(ContentPreviewViewerDelegate contentPreviewViewerDelegate, TLRPC.InputStickerSet inputStickerSet, boolean z) {
            }

            public static void $default$remove(ContentPreviewViewerDelegate contentPreviewViewerDelegate, SendMessagesHelper.ImportingSticker importingSticker) {
            }

            public static void $default$removeFromRecent(ContentPreviewViewerDelegate contentPreviewViewerDelegate, TLRPC.Document document) {
            }

            public static void $default$resetTouch(ContentPreviewViewerDelegate contentPreviewViewerDelegate) {
            }

            public static void $default$retractVote(ContentPreviewViewerDelegate contentPreviewViewerDelegate) {
            }

            public static void $default$sendEmoji(ContentPreviewViewerDelegate contentPreviewViewerDelegate, TLRPC.Document document) {
            }

            public static void $default$sendGif(ContentPreviewViewerDelegate contentPreviewViewerDelegate, Object obj, Object obj2, boolean z, int i, int i2) {
            }

            public static void $default$sendSticker(ContentPreviewViewerDelegate contentPreviewViewerDelegate, String str) {
            }

            public static void $default$sendSticker(ContentPreviewViewerDelegate contentPreviewViewerDelegate, TLRPC.Document document, String str, Object obj, boolean z, int i, int i2) {
            }

            public static void $default$sendVote(ContentPreviewViewerDelegate contentPreviewViewerDelegate) {
            }

            public static void $default$setAsEmojiStatus(ContentPreviewViewerDelegate contentPreviewViewerDelegate, TLRPC.Document document, Integer num) {
            }

            public static void $default$setIntroSticker(ContentPreviewViewerDelegate contentPreviewViewerDelegate, String str) {
            }

            public static void $default$stickerSetSelected(ContentPreviewViewerDelegate contentPreviewViewerDelegate, TLRPC.StickerSet stickerSet, String str) {
            }
        }

        void addCaptionToGif(Object obj, Object obj2, boolean z, int i, int i2);

        void addToFavoriteSelected(String str);

        boolean can();

        boolean canAddCaption(TLRPC.Document document);

        boolean canDeleteSticker(TLRPC.Document document);

        boolean canEditSticker();

        boolean canSchedule();

        boolean canSendSticker();

        Boolean canSetAsStatus(TLRPC.Document document);

        void copyEmoji(TLRPC.Document document);

        void deleteSticker(TLRPC.Document document);

        void editSticker(TLRPC.Document document);

        ItemOptions getCustomItemOptions(ViewGroup viewGroup, View view);

        long getDialogId();

        TLRPC.TL_messageMediaPoll getPoll();

        TLRPC.PollAnswer getPollAnswer();

        MessageObject getPollMessageObject();

        String getQuery(boolean z);

        void gifAddedOrDeleted();

        boolean isInScheduleMode();

        boolean isPhotoEditor();

        boolean isReplacedSticker();

        boolean isSettingIntroSticker();

        boolean isStickerEditor();

        boolean needCopy(TLRPC.Document document);

        boolean needMenu();

        boolean needOpen();

        boolean needRemove();

        boolean needRemoveFromRecent(TLRPC.Document document);

        boolean needSend(int i);

        void newStickerPackSelected(CharSequence charSequence, String str, Utilities.Callback callback);

        void openSet(TLRPC.InputStickerSet inputStickerSet, boolean z);

        void remove(SendMessagesHelper.ImportingSticker importingSticker);

        void removeFromRecent(TLRPC.Document document);

        void resetTouch();

        void retractVote();

        void sendEmoji(TLRPC.Document document);

        void sendGif(Object obj, Object obj2, boolean z, int i, int i2);

        void sendSticker(String str);

        void sendSticker(TLRPC.Document document, String str, Object obj, boolean z, int i, int i2);

        void sendVote();

        void setAsEmojiStatus(TLRPC.Document document, Integer num);

        void setIntroSticker(String str);

        void stickerSetSelected(TLRPC.StickerSet stickerSet, String str);
    }

    public ContentPreviewViewer() {
        BlurredBackgroundSourceBitmap blurredBackgroundSourceBitmap = new BlurredBackgroundSourceBitmap();
        this.scrimBlur3SourceBitmap = blurredBackgroundSourceBitmap;
        this.scrimBlur3Factory = new BlurredBackgroundDrawableViewFactory(blurredBackgroundSourceBitmap);
        this.backgroundDrawable = new ColorDrawable(1895825408);
        this.centerImage = new ImageReceiver();
        this.effectImage = new ImageReceiver();
        this.isVisible = false;
        this.keyboardHeight = AndroidUtilities.dp(200.0f);
        this.paint = new Paint(1);
        this.showSheetRunnable = new 1();
    }

    private class FrameLayoutDrawer extends FrameLayout {
        public FrameLayoutDrawer(Context context) {
            super(context);
            setWillNotDraw(false);
        }

        @Override // android.view.View
        protected void onDraw(Canvas canvas) {
            ContentPreviewViewer.this.onDraw(canvas);
        }

        @Override // android.view.ViewGroup
        protected boolean drawChild(Canvas canvas, View view, long j) {
            if (view instanceof PaintingOverlay) {
                return false;
            }
            return super.drawChild(canvas, view, j);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean canShowFullVotersList() {
        ContentPreviewViewerDelegate contentPreviewViewerDelegate = this.delegate;
        if (contentPreviewViewerDelegate == null) {
            return false;
        }
        TLRPC.TL_messageMediaPoll poll = contentPreviewViewerDelegate.getPoll();
        TLRPC.PollAnswer pollAnswer = this.delegate.getPollAnswer();
        if (poll == null || poll.poll == null || pollAnswer == null) {
            return false;
        }
        TLRPC.PollAnswerVoters pollResult = MessageObject.getPollResult(poll, pollAnswer.option);
        if (pollResult == null || pollResult.voters <= 0) {
            return true;
        }
        MessageObject.canShowVotersList(poll);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean addVoteOptions(final ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout) {
        boolean z;
        int i;
        int i2;
        RecentVotersCell recentVotersCell;
        ContentPreviewViewerDelegate contentPreviewViewerDelegate = this.delegate;
        if (contentPreviewViewerDelegate == null) {
            return false;
        }
        TLRPC.TL_messageMediaPoll poll = contentPreviewViewerDelegate.getPoll();
        TLRPC.PollAnswer pollAnswer = this.delegate.getPollAnswer();
        if (poll == null || poll.poll == null || pollAnswer == null) {
            return false;
        }
        TLRPC.PollAnswerVoters pollResult = MessageObject.getPollResult(poll, pollAnswer.option);
        boolean z2 = pollResult != null && pollResult.voters > 0 && MessageObject.canShowVotersList(poll);
        boolean z3 = (MessageObject.isVoted(poll) || poll.poll.closed || this.delegate.isInScheduleMode()) ? false : true;
        boolean z4 = !z3 && MessageObject.canUnvote(poll);
        if (z2) {
            RecentVotersCell recentVotersCell2 = new RecentVotersCell(actionBarPopupWindowLayout.getContext(), this.currentAccount, this.resourcesProvider);
            ItemOptions swipeback = ItemOptions.swipeback(actionBarPopupWindowLayout, this.resourcesProvider);
            int addViewToSwipeBack = actionBarPopupWindowLayout.addViewToSwipeBack(swipeback.getLinearLayout());
            int i3 = Theme.key_actionBarDefaultSubmenuItem;
            swipeback.setGapBackgroundColor(Theme.multAlpha(Theme.getColor(i3, this.resourcesProvider), 0.06f));
            swipeback.setBlurBackgroundForSwipeback(this.scrimBlur3Factory, BlurredBackgroundProviderImpl.scrimMenuBackground(this.resourcesProvider), true);
            swipeback.add(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new Runnable() { // from class: org.telegram.ui.ContentPreviewViewer$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    ContentPreviewViewer.lambda$addVoteOptions$0(ActionBarPopupWindow.ActionBarPopupWindowLayout.this);
                }
            });
            swipeback.addGap();
            MessageObject pollMessageObject = this.delegate.getPollMessageObject();
            Activity activity = this.parentActivity;
            if ((activity instanceof LaunchActivity) && pollMessageObject != null) {
                LaunchActivity launchActivity = (LaunchActivity) activity;
                final BaseFragment lastFragment = (launchActivity.getActionBarLayout() == null || launchActivity.getActionBarLayout().getLastFragment() == null) ? null : launchActivity.getActionBarLayout().getLastFragment();
                if (lastFragment != null) {
                    long dialogId = pollMessageObject.getDialogId();
                    int id = pollMessageObject.getId();
                    byte[] bArr = pollAnswer.option;
                    int i4 = pollResult.voters;
                    Utilities.Callback callback = new Utilities.Callback() { // from class: org.telegram.ui.ContentPreviewViewer$$ExternalSyntheticLambda6
                        @Override // org.telegram.messenger.Utilities.Callback
                        public final void run(Object obj) {
                            ContentPreviewViewer.this.lambda$addVoteOptions$1(lastFragment, (Long) obj);
                        }
                    };
                    i = i3;
                    i2 = addViewToSwipeBack;
                    BaseFragment baseFragment = lastFragment;
                    recentVotersCell = recentVotersCell2;
                    swipeback.addView(recentVotersCell2.createListView(baseFragment, dialogId, id, bArr, i4, callback));
                    recentVotersCell.setText(LocaleController.formatPluralString("PollVotesCount", pollResult.voters, new Object[0]));
                    recentVotersCell.setRecentVoters(pollResult.recent_voters, false);
                    recentVotersCell.setLayoutParams(LayoutHelper.createLinear(-1, 48));
                    recentVotersCell.setBackground(Theme.createRadSelectorDrawable(getThemedColor(Theme.key_dialogButtonSelector), 12, 0));
                    final int i5 = i2;
                    recentVotersCell.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.ContentPreviewViewer$$ExternalSyntheticLambda7
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            ContentPreviewViewer.lambda$addVoteOptions$2(ActionBarPopupWindow.ActionBarPopupWindowLayout.this, i5, view);
                        }
                    });
                    actionBarPopupWindowLayout.addView(recentVotersCell);
                    ActionBarPopupWindow.GapView gapView = new ActionBarPopupWindow.GapView(actionBarPopupWindowLayout.getContext(), this.resourcesProvider);
                    gapView.setTag(R.id.fit_width_tag, 1);
                    gapView.setColor(Theme.multAlpha(Theme.getColor(i, this.resourcesProvider), 0.06f));
                    gapView.setLayoutParams(LayoutHelper.createLinear(-1, 8));
                    actionBarPopupWindowLayout.addView(gapView);
                }
            }
            i = i3;
            i2 = addViewToSwipeBack;
            recentVotersCell = recentVotersCell2;
            recentVotersCell.setText(LocaleController.formatPluralString("PollVotesCount", pollResult.voters, new Object[0]));
            recentVotersCell.setRecentVoters(pollResult.recent_voters, false);
            recentVotersCell.setLayoutParams(LayoutHelper.createLinear(-1, 48));
            recentVotersCell.setBackground(Theme.createRadSelectorDrawable(getThemedColor(Theme.key_dialogButtonSelector), 12, 0));
            final int i52 = i2;
            recentVotersCell.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.ContentPreviewViewer$$ExternalSyntheticLambda7
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ContentPreviewViewer.lambda$addVoteOptions$2(ActionBarPopupWindow.ActionBarPopupWindowLayout.this, i52, view);
                }
            });
            actionBarPopupWindowLayout.addView(recentVotersCell);
            ActionBarPopupWindow.GapView gapView2 = new ActionBarPopupWindow.GapView(actionBarPopupWindowLayout.getContext(), this.resourcesProvider);
            gapView2.setTag(R.id.fit_width_tag, 1);
            gapView2.setColor(Theme.multAlpha(Theme.getColor(i, this.resourcesProvider), 0.06f));
            gapView2.setLayoutParams(LayoutHelper.createLinear(-1, 8));
            actionBarPopupWindowLayout.addView(gapView2);
        }
        if (z3) {
            z = false;
            ActionBarMenuItem.addItem(actionBarPopupWindowLayout, R.drawable.msg_select, LocaleController.getString(R.string.PollSubmitVotesNoCaps), false, this.resourcesProvider).setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.ContentPreviewViewer$$ExternalSyntheticLambda8
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ContentPreviewViewer.this.lambda$addVoteOptions$3(view);
                }
            });
        } else {
            z = false;
        }
        if (z4) {
            ActionBarMenuItem.addItem(actionBarPopupWindowLayout, R.drawable.msg_unvote, LocaleController.getString(R.string.Unvote), z, this.resourcesProvider).setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.ContentPreviewViewer$$ExternalSyntheticLambda9
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ContentPreviewViewer.this.lambda$addVoteOptions$4(view);
                }
            });
        }
        if (!z2 && (z3 || z4)) {
            ActionBarPopupWindow.GapView gapView3 = new ActionBarPopupWindow.GapView(actionBarPopupWindowLayout.getContext(), this.resourcesProvider);
            gapView3.setTag(R.id.fit_width_tag, 1);
            gapView3.setColor(Theme.multAlpha(Theme.getColor(Theme.key_actionBarDefaultSubmenuItem, this.resourcesProvider), 0.06f));
            gapView3.setLayoutParams(LayoutHelper.createLinear(-1, 8));
            actionBarPopupWindowLayout.addView(gapView3);
        }
        return z2 || z3 || z4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$addVoteOptions$0(ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout) {
        actionBarPopupWindowLayout.getSwipeBack().closeForeground();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$addVoteOptions$1(BaseFragment baseFragment, Long l) {
        Bundle bundle = new Bundle();
        if (l.longValue() >= 0) {
            bundle.putLong("user_id", l.longValue());
        } else {
            bundle.putLong("chat_id", -l.longValue());
        }
        baseFragment.presentFragment(new ProfileActivity(bundle));
        dismissPopupWindow();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$addVoteOptions$2(ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout, int i, View view) {
        actionBarPopupWindowLayout.getSwipeBack().openForeground(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$addVoteOptions$3(View view) {
        ContentPreviewViewerDelegate contentPreviewViewerDelegate = this.delegate;
        if (contentPreviewViewerDelegate != null) {
            contentPreviewViewerDelegate.sendVote();
        }
        dismissPopupWindow();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$addVoteOptions$4(View view) {
        ContentPreviewViewerDelegate contentPreviewViewerDelegate = this.delegate;
        if (contentPreviewViewerDelegate != null) {
            contentPreviewViewerDelegate.retractVote();
        }
        dismissPopupWindow();
    }

    class 1 implements Runnable {
        1() {
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z;
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            ItemOptions customItemOptions;
            int i9;
            int i10;
            if (ContentPreviewViewer.this.parentActivity == null || ContentPreviewViewer.this.isPhotoEditor) {
                return;
            }
            ContentPreviewViewer.this.closeOnDismiss = true;
            int i11 = -2;
            if (ContentPreviewViewer.this.delegate != null && (customItemOptions = ContentPreviewViewer.this.delegate.getCustomItemOptions(ContentPreviewViewer.this.containerView, ContentPreviewViewer.this.containerView)) != null) {
                customItemOptions.setBlurBackground(ContentPreviewViewer.this.scrimBlur3Factory, BlurredBackgroundProviderImpl.scrimMenuBackground(ContentPreviewViewer.this.resourcesProvider), true);
                customItemOptions.setDrawScrim(false);
                customItemOptions.setupSelectors();
                customItemOptions.setOnDismiss(new Runnable() { // from class: org.telegram.ui.ContentPreviewViewer$1$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        ContentPreviewViewer.1.this.lambda$run$0();
                    }
                });
                ViewGroup layout = customItemOptions.getLayout();
                ContentPreviewViewer.this.popupWindow = new ActionBarPopupWindow(layout, i11, i11) { // from class: org.telegram.ui.ContentPreviewViewer.1.1
                    @Override // org.telegram.ui.ActionBar.ActionBarPopupWindow, android.widget.PopupWindow
                    public void dismiss() {
                        super.dismiss();
                        ContentPreviewViewer contentPreviewViewer = ContentPreviewViewer.this;
                        contentPreviewViewer.popupWindow = null;
                        contentPreviewViewer.menuVisible = false;
                        if (ContentPreviewViewer.this.closeOnDismiss) {
                            ContentPreviewViewer.this.close();
                        }
                    }
                };
                ContentPreviewViewer.this.popupWindow.setPauseNotifications(true);
                ContentPreviewViewer.this.popupWindow.setDismissAnimationDuration(150);
                ContentPreviewViewer.this.popupWindow.setScaleOut(true);
                ContentPreviewViewer.this.popupWindow.setOutsideTouchable(true);
                ContentPreviewViewer.this.popupWindow.setClippingEnabled(true);
                ContentPreviewViewer.this.popupWindow.setAnimationStyle(R.style.PopupContextAnimation);
                ContentPreviewViewer.this.popupWindow.setFocusable(true);
                layout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
                ContentPreviewViewer.this.popupWindow.setInputMethodMode(2);
                ContentPreviewViewer.this.popupWindow.getContentView().setFocusableInTouchMode(true);
                if (ContentPreviewViewer.this.lastInsets != null) {
                    i10 = ContentPreviewViewer.this.lastInsets.getStableInsetBottom() + ContentPreviewViewer.this.lastInsets.getStableInsetTop();
                    i9 = ContentPreviewViewer.this.lastInsets.getStableInsetTop();
                } else {
                    i9 = AndroidUtilities.statusBarHeight;
                    i10 = 0;
                }
                int min = (Math.min(ContentPreviewViewer.this.containerView.getWidth(), ContentPreviewViewer.this.containerView.getHeight() - i10) - AndroidUtilities.dp(40.0f)) / 2;
                int max = (int) (((int) (ContentPreviewViewer.this.moveY + Math.max(i9 + min + (ContentPreviewViewer.this.stickerEmojiLayout != null ? AndroidUtilities.dp(40.0f) : 0), ((ContentPreviewViewer.this.containerView.getHeight() - i10) - ContentPreviewViewer.this.keyboardHeight) / 2) + min)) + (AndroidUtilities.dp(24.0f) - ContentPreviewViewer.this.moveY));
                ContentPreviewViewer contentPreviewViewer = ContentPreviewViewer.this;
                contentPreviewViewer.popupWindow.showAtLocation(contentPreviewViewer.containerView, 0, (int) ((ContentPreviewViewer.this.containerView.getMeasuredWidth() - layout.getMeasuredWidth()) / 2.0f), max);
                try {
                    ContentPreviewViewer.this.containerView.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                if (ContentPreviewViewer.this.moveY != 0.0f) {
                    if (ContentPreviewViewer.this.finalMoveY == 0.0f) {
                        ContentPreviewViewer.this.finalMoveY = 0.0f;
                        ContentPreviewViewer contentPreviewViewer2 = ContentPreviewViewer.this;
                        contentPreviewViewer2.startMoveY = contentPreviewViewer2.moveY;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.ContentPreviewViewer$1$$ExternalSyntheticLambda1
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            ContentPreviewViewer.1.this.lambda$run$1(valueAnimator);
                        }
                    });
                    ofFloat.setDuration(350L);
                    ofFloat.setInterpolator(CubicBezierInterpolator.DEFAULT);
                    ofFloat.start();
                }
                ContentPreviewViewer.this.menuVisible = true;
                return;
            }
            final ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = new ActionBarPopupWindow.ActionBarPopupWindowLayout(ContentPreviewViewer.this.containerView.getContext(), R.drawable.popup_fixed_alert4, ContentPreviewViewer.this.resourcesProvider, (ContentPreviewViewer.this.currentContentType == 3 || ContentPreviewViewer.this.canShowFullVotersList()) ? 1 : 0);
            actionBarPopupWindowLayout.setBackground(ContentPreviewViewer.this.scrimBlur3Factory.create((View) actionBarPopupWindowLayout, true).setColorProvider(BlurredBackgroundProviderImpl.scrimMenuBackground(ContentPreviewViewer.this.resourcesProvider)).setRadius(AndroidUtilities.dp(12.0f)).setPadding(AndroidUtilities.dp(8.0f)).setHasPadding(true));
            if (ContentPreviewViewer.this.currentContentType != 3) {
                if (ContentPreviewViewer.this.currentContentType == 0) {
                    if (!MessageObject.isPremiumSticker(ContentPreviewViewer.this.currentDocument) || AccountInstance.getInstance(ContentPreviewViewer.this.currentAccount).getUserConfig().isPremium()) {
                        boolean isStickerInFavorites = MediaDataController.getInstance(ContentPreviewViewer.this.currentAccount).isStickerInFavorites(ContentPreviewViewer.this.currentDocument);
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        ArrayList arrayList3 = new ArrayList();
                        if (ContentPreviewViewer.this.delegate != null) {
                            if (ContentPreviewViewer.this.delegate.needSend(ContentPreviewViewer.this.currentContentType) && !ContentPreviewViewer.this.delegate.isInScheduleMode()) {
                                arrayList.add(LocaleController.getString(R.string.SendStickerPreview));
                                arrayList3.add(Integer.valueOf(R.drawable.msg_send));
                                arrayList2.add(0);
                            }
                            if (ContentPreviewViewer.this.delegate.needSend(ContentPreviewViewer.this.currentContentType) && !ContentPreviewViewer.this.delegate.isInScheduleMode()) {
                                arrayList.add(LocaleController.getString(R.string.SendWithoutSound));
                                arrayList3.add(Integer.valueOf(R.drawable.input_notify_off));
                                arrayList2.add(6);
                            }
                            if (ContentPreviewViewer.this.delegate.canSchedule()) {
                                arrayList.add(LocaleController.getString(R.string.Schedule));
                                arrayList3.add(Integer.valueOf(R.drawable.msg_autodelete));
                                arrayList2.add(3);
                            }
                            if (ContentPreviewViewer.this.delegate.needRemove()) {
                                arrayList.add(LocaleController.getString(R.string.ImportStickersRemoveMenu));
                                arrayList3.add(Integer.valueOf(R.drawable.msg_delete));
                                arrayList2.add(5);
                            }
                        }
                        if (!MessageObject.isMaskDocument(ContentPreviewViewer.this.currentDocument) && (isStickerInFavorites || (MediaDataController.getInstance(ContentPreviewViewer.this.currentAccount).canAddStickerToFavorites() && MessageObject.isStickerHasSet(ContentPreviewViewer.this.currentDocument)))) {
                            arrayList.add(LocaleController.getString(isStickerInFavorites ? R.string.DeleteFromFavorites : R.string.AddToFavorites));
                            arrayList3.add(Integer.valueOf(isStickerInFavorites ? R.drawable.msg_unfave : R.drawable.msg_fave));
                            arrayList2.add(2);
                        }
                        if (ContentPreviewViewer.this.delegate != null && ContentPreviewViewer.this.currentStickerSet != null && !(ContentPreviewViewer.this.currentStickerSet instanceof TLRPC.TL_inputStickerSetEmpty) && ContentPreviewViewer.this.delegate.needOpen()) {
                            arrayList.add(LocaleController.formatString(R.string.ViewPackPreview, new Object[0]));
                            arrayList3.add(Integer.valueOf(R.drawable.msg_media));
                            arrayList2.add(1);
                        }
                        if (ContentPreviewViewer.this.isRecentSticker) {
                            arrayList.add(LocaleController.getString(R.string.DeleteFromRecent));
                            arrayList3.add(Integer.valueOf(R.drawable.msg_delete));
                            arrayList2.add(4);
                        }
                        if (ContentPreviewViewer.this.currentStickerSet != null && ContentPreviewViewer.this.currentDocument != null) {
                            TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(ContentPreviewViewer.this.currentAccount).getStickerSet(ContentPreviewViewer.this.currentStickerSet, true);
                            if (stickerSet != null && ContentPreviewViewer.this.delegate != null && ContentPreviewViewer.this.delegate.canEditSticker()) {
                                TLRPC.StickerSet stickerSet2 = stickerSet.set;
                                if (!stickerSet2.emojis && !stickerSet2.masks) {
                                    arrayList.add(LocaleController.getString(R.string.EditSticker));
                                    arrayList3.add(Integer.valueOf(R.drawable.msg_edit));
                                    arrayList2.add(7);
                                }
                            }
                            if (stickerSet != null && stickerSet.set.creator && ContentPreviewViewer.this.delegate != null && ContentPreviewViewer.this.delegate.canDeleteSticker(ContentPreviewViewer.this.currentDocument)) {
                                arrayList.add(LocaleController.getString(R.string.DeleteSticker));
                                arrayList3.add(Integer.valueOf(R.drawable.msg_delete));
                                arrayList2.add(8);
                            }
                        }
                        if (arrayList.isEmpty()) {
                            return;
                        }
                        ContentPreviewViewer.this.menuVisible = true;
                        ContentPreviewViewer.this.containerView.invalidate();
                        2 r1 = new 2(arrayList2, isStickerInFavorites);
                        ContentPreviewViewer.this.addVoteOptions(actionBarPopupWindowLayout);
                        for (int i12 = 0; i12 < arrayList.size(); i12++) {
                            ActionBarMenuSubItem addItem = ActionBarMenuItem.addItem(actionBarPopupWindowLayout, ((Integer) arrayList3.get(i12)).intValue(), (CharSequence) arrayList.get(i12), false, ContentPreviewViewer.this.resourcesProvider);
                            addItem.setTag(Integer.valueOf(i12));
                            addItem.setOnClickListener(r1);
                            if (((Integer) arrayList2.get(i12)).intValue() == 8) {
                                int themedColor = ContentPreviewViewer.this.getThemedColor(Theme.key_text_RedBold);
                                addItem.setColors(themedColor, themedColor);
                                addItem.setSelectorColor(Theme.multAlpha(themedColor, 0.1f));
                            }
                        }
                        ContentPreviewViewer.this.popupWindow = new ActionBarPopupWindow(actionBarPopupWindowLayout, i11, i11) { // from class: org.telegram.ui.ContentPreviewViewer.1.3
                            @Override // org.telegram.ui.ActionBar.ActionBarPopupWindow, android.widget.PopupWindow
                            public void dismiss() {
                                super.dismiss();
                                ContentPreviewViewer contentPreviewViewer3 = ContentPreviewViewer.this;
                                contentPreviewViewer3.popupWindow = null;
                                contentPreviewViewer3.menuVisible = false;
                                if (ContentPreviewViewer.this.closeOnDismiss) {
                                    ContentPreviewViewer.this.close();
                                }
                                if (ContentPreviewViewer.this.currentPreviewCell != null) {
                                    if (ContentPreviewViewer.this.currentPreviewCell instanceof StickerEmojiCell) {
                                        ((StickerEmojiCell) ContentPreviewViewer.this.currentPreviewCell).setScaled(false);
                                    } else if (ContentPreviewViewer.this.currentPreviewCell instanceof StickerCell) {
                                        ((StickerCell) ContentPreviewViewer.this.currentPreviewCell).setScaled(false);
                                    } else if (ContentPreviewViewer.this.currentPreviewCell instanceof ContextLinkCell) {
                                        ((ContextLinkCell) ContentPreviewViewer.this.currentPreviewCell).setScaled(false);
                                    }
                                    ContentPreviewViewer.this.currentPreviewCell = null;
                                }
                            }
                        };
                        ContentPreviewViewer.this.popupWindow.setPauseNotifications(true);
                        ContentPreviewViewer.this.popupWindow.setDismissAnimationDuration(100);
                        ContentPreviewViewer.this.popupWindow.setScaleOut(true);
                        ContentPreviewViewer.this.popupWindow.setOutsideTouchable(true);
                        ContentPreviewViewer.this.popupWindow.setClippingEnabled(true);
                        ContentPreviewViewer.this.popupWindow.setAnimationStyle(R.style.PopupContextAnimation);
                        ContentPreviewViewer.this.popupWindow.setFocusable(true);
                        actionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
                        ContentPreviewViewer.this.popupWindow.setInputMethodMode(2);
                        ContentPreviewViewer.this.popupWindow.getContentView().setFocusableInTouchMode(true);
                        if (ContentPreviewViewer.this.lastInsets != null) {
                            i6 = ContentPreviewViewer.this.lastInsets.getStableInsetBottom() + ContentPreviewViewer.this.lastInsets.getStableInsetTop();
                            i5 = ContentPreviewViewer.this.lastInsets.getStableInsetTop();
                        } else {
                            i5 = AndroidUtilities.statusBarHeight;
                            i6 = 0;
                        }
                        int max2 = ((int) (ContentPreviewViewer.this.moveY + Math.max(i5 + r2 + (ContentPreviewViewer.this.stickerEmojiLayout != null ? AndroidUtilities.dp(40.0f) : 0), ((ContentPreviewViewer.this.containerView.getHeight() - i6) - ContentPreviewViewer.this.keyboardHeight) / 2) + ((ContentPreviewViewer.this.currentContentType == 1 ? Math.min(ContentPreviewViewer.this.containerView.getWidth(), ContentPreviewViewer.this.containerView.getHeight() - i6) - AndroidUtilities.dp(40.0f) : (int) (ContentPreviewViewer.this.drawEffect ? Math.min(ContentPreviewViewer.this.containerView.getWidth(), ContentPreviewViewer.this.containerView.getHeight() - i6) - AndroidUtilities.dpf2(40.0f) : Math.min(ContentPreviewViewer.this.containerView.getWidth(), ContentPreviewViewer.this.containerView.getHeight() - i6) / 1.8f)) / 2))) + AndroidUtilities.dp(24.0f);
                        if (ContentPreviewViewer.this.drawEffect) {
                            max2 += AndroidUtilities.dp(24.0f);
                        }
                        ContentPreviewViewer contentPreviewViewer3 = ContentPreviewViewer.this;
                        contentPreviewViewer3.popupWindow.showAtLocation(contentPreviewViewer3.containerView, 0, (int) ((ContentPreviewViewer.this.containerView.getMeasuredWidth() - actionBarPopupWindowLayout.getMeasuredWidth()) / 2.0f), max2);
                        try {
                            ContentPreviewViewer.this.containerView.performHapticFeedback(0);
                        } catch (Exception unused2) {
                        }
                    } else {
                        ContentPreviewViewer.this.showUnlockPremiumView();
                        ContentPreviewViewer.this.menuVisible = true;
                        ContentPreviewViewer.this.containerView.invalidate();
                        try {
                            ContentPreviewViewer.this.containerView.performHapticFeedback(0);
                            return;
                        } catch (Exception unused3) {
                            return;
                        }
                    }
                } else if (ContentPreviewViewer.this.currentContentType != 2 || ContentPreviewViewer.this.delegate == null) {
                    if (ContentPreviewViewer.this.delegate != null) {
                        ArrayList arrayList4 = new ArrayList();
                        final ArrayList arrayList5 = new ArrayList();
                        ArrayList arrayList6 = new ArrayList();
                        if (ContentPreviewViewer.this.delegate.needSend(ContentPreviewViewer.this.currentContentType) && !ContentPreviewViewer.this.delegate.isInScheduleMode()) {
                            arrayList4.add(LocaleController.getString(R.string.SendGifPreview));
                            arrayList6.add(Integer.valueOf(R.drawable.msg_send));
                            arrayList5.add(0);
                        }
                        if (ContentPreviewViewer.this.delegate.needSend(ContentPreviewViewer.this.currentContentType) && !ContentPreviewViewer.this.delegate.isInScheduleMode()) {
                            arrayList4.add(LocaleController.getString(R.string.SendWithoutSound));
                            arrayList6.add(Integer.valueOf(R.drawable.input_notify_off));
                            arrayList5.add(4);
                        }
                        if (ContentPreviewViewer.this.delegate.canSchedule()) {
                            arrayList4.add(LocaleController.getString(R.string.Schedule));
                            arrayList6.add(Integer.valueOf(R.drawable.msg_autodelete));
                            arrayList5.add(3);
                        }
                        if (ContentPreviewViewer.this.currentDocument != null && ContentPreviewViewer.this.delegate.canAddCaption(ContentPreviewViewer.this.currentDocument)) {
                            arrayList4.add(LocaleController.getString(R.string.AddACaption));
                            arrayList6.add(Integer.valueOf(R.drawable.outline_caption_24));
                            arrayList5.add(11);
                        }
                        if (ContentPreviewViewer.this.currentDocument != null) {
                            z = MediaDataController.getInstance(ContentPreviewViewer.this.currentAccount).hasRecentGif(ContentPreviewViewer.this.currentDocument);
                            if (z) {
                                arrayList4.add(LocaleController.formatString("Delete", R.string.Delete, new Object[0]));
                                arrayList6.add(Integer.valueOf(R.drawable.msg_delete));
                                arrayList5.add(1);
                            } else {
                                arrayList4.add(LocaleController.formatString("SaveToGIFs", R.string.SaveToGIFs, new Object[0]));
                                arrayList6.add(Integer.valueOf(R.drawable.msg_gif_add));
                                arrayList5.add(2);
                            }
                        } else {
                            z = false;
                        }
                        if (arrayList4.isEmpty()) {
                            return;
                        }
                        ContentPreviewViewer.this.menuVisible = true;
                        ContentPreviewViewer.this.containerView.invalidate();
                        int[] iArr = new int[arrayList6.size()];
                        for (int i13 = 0; i13 < arrayList6.size(); i13++) {
                            iArr[i13] = ((Integer) arrayList6.get(i13)).intValue();
                        }
                        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: org.telegram.ui.ContentPreviewViewer$1$$ExternalSyntheticLambda7
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                ContentPreviewViewer.1.this.lambda$run$10(arrayList5, view);
                            }
                        };
                        for (int i14 = 0; i14 < arrayList4.size(); i14++) {
                            ActionBarMenuSubItem addItem2 = ActionBarMenuItem.addItem(actionBarPopupWindowLayout, ((Integer) arrayList6.get(i14)).intValue(), (CharSequence) arrayList4.get(i14), false, ContentPreviewViewer.this.resourcesProvider);
                            addItem2.setTag(Integer.valueOf(i14));
                            addItem2.setOnClickListener(onClickListener);
                            if (z && i14 == arrayList4.size() - 1) {
                                addItem2.setColors(ContentPreviewViewer.this.getThemedColor(Theme.key_text_RedBold), ContentPreviewViewer.this.getThemedColor(Theme.key_text_RedRegular));
                            }
                        }
                        ContentPreviewViewer.this.popupWindow = new ActionBarPopupWindow(actionBarPopupWindowLayout, i11, i11) { // from class: org.telegram.ui.ContentPreviewViewer.1.5
                            @Override // org.telegram.ui.ActionBar.ActionBarPopupWindow, android.widget.PopupWindow
                            public void dismiss() {
                                super.dismiss();
                                ContentPreviewViewer contentPreviewViewer4 = ContentPreviewViewer.this;
                                contentPreviewViewer4.popupWindow = null;
                                contentPreviewViewer4.menuVisible = false;
                                if (ContentPreviewViewer.this.closeOnDismiss) {
                                    ContentPreviewViewer.this.close();
                                }
                            }
                        };
                        ContentPreviewViewer.this.popupWindow.setPauseNotifications(true);
                        ContentPreviewViewer.this.popupWindow.setDismissAnimationDuration(150);
                        ContentPreviewViewer.this.popupWindow.setScaleOut(true);
                        ContentPreviewViewer.this.popupWindow.setOutsideTouchable(true);
                        ContentPreviewViewer.this.popupWindow.setClippingEnabled(true);
                        ContentPreviewViewer.this.popupWindow.setAnimationStyle(R.style.PopupContextAnimation);
                        ContentPreviewViewer.this.popupWindow.setFocusable(true);
                        actionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
                        ContentPreviewViewer.this.popupWindow.setInputMethodMode(2);
                        ContentPreviewViewer.this.popupWindow.getContentView().setFocusableInTouchMode(true);
                        if (ContentPreviewViewer.this.lastInsets != null) {
                            i2 = ContentPreviewViewer.this.lastInsets.getStableInsetBottom() + ContentPreviewViewer.this.lastInsets.getStableInsetTop();
                            i = ContentPreviewViewer.this.lastInsets.getStableInsetTop();
                        } else {
                            i = AndroidUtilities.statusBarHeight;
                            i2 = 0;
                        }
                        int min2 = (Math.min(ContentPreviewViewer.this.containerView.getWidth(), ContentPreviewViewer.this.containerView.getHeight() - i2) - AndroidUtilities.dp(40.0f)) / 2;
                        int max3 = (int) (((int) (ContentPreviewViewer.this.moveY + Math.max(i + min2 + (ContentPreviewViewer.this.stickerEmojiLayout != null ? AndroidUtilities.dp(40.0f) : 0), ((ContentPreviewViewer.this.containerView.getHeight() - i2) - ContentPreviewViewer.this.keyboardHeight) / 2) + min2)) + (AndroidUtilities.dp(24.0f) - ContentPreviewViewer.this.moveY));
                        ContentPreviewViewer contentPreviewViewer4 = ContentPreviewViewer.this;
                        contentPreviewViewer4.popupWindow.showAtLocation(contentPreviewViewer4.containerView, 0, (int) ((ContentPreviewViewer.this.containerView.getMeasuredWidth() - actionBarPopupWindowLayout.getMeasuredWidth()) / 2.0f), max3);
                        try {
                            ContentPreviewViewer.this.containerView.performHapticFeedback(0);
                        } catch (Exception unused4) {
                        }
                        if (ContentPreviewViewer.this.moveY != 0.0f) {
                            if (ContentPreviewViewer.this.finalMoveY == 0.0f) {
                                ContentPreviewViewer.this.finalMoveY = 0.0f;
                                ContentPreviewViewer contentPreviewViewer5 = ContentPreviewViewer.this;
                                contentPreviewViewer5.startMoveY = contentPreviewViewer5.moveY;
                            }
                            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                            ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.ContentPreviewViewer$1$$ExternalSyntheticLambda8
                                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    ContentPreviewViewer.1.this.lambda$run$11(valueAnimator);
                                }
                            });
                            ofFloat2.setDuration(350L);
                            ofFloat2.setInterpolator(CubicBezierInterpolator.DEFAULT);
                            ofFloat2.start();
                        }
                    }
                } else {
                    ArrayList arrayList7 = new ArrayList();
                    final ArrayList arrayList8 = new ArrayList();
                    ArrayList arrayList9 = new ArrayList();
                    if (ContentPreviewViewer.this.delegate.needSend(ContentPreviewViewer.this.currentContentType)) {
                        arrayList7.add(LocaleController.getString(R.string.SendEmojiPreview));
                        arrayList9.add(Integer.valueOf(R.drawable.msg_send));
                        arrayList8.add(0);
                    }
                    Boolean canSetAsStatus = ContentPreviewViewer.this.delegate.canSetAsStatus(ContentPreviewViewer.this.currentDocument);
                    if (canSetAsStatus != null) {
                        if (canSetAsStatus.booleanValue()) {
                            arrayList7.add(LocaleController.getString(R.string.SetAsEmojiStatus));
                            arrayList9.add(Integer.valueOf(R.drawable.msg_smile_status));
                            arrayList8.add(1);
                        } else {
                            arrayList7.add(LocaleController.getString(R.string.RemoveStatus));
                            arrayList9.add(Integer.valueOf(R.drawable.msg_smile_status));
                            arrayList8.add(2);
                        }
                    }
                    if (ContentPreviewViewer.this.delegate.needCopy(ContentPreviewViewer.this.currentDocument)) {
                        arrayList7.add(LocaleController.getString(R.string.CopyEmojiPreview));
                        arrayList9.add(Integer.valueOf(R.drawable.msg_copy));
                        arrayList8.add(3);
                    }
                    if (ContentPreviewViewer.this.delegate.needRemoveFromRecent(ContentPreviewViewer.this.currentDocument)) {
                        arrayList7.add(LocaleController.getString(R.string.RemoveFromRecent));
                        arrayList9.add(Integer.valueOf(R.drawable.msg_delete));
                        arrayList8.add(4);
                    }
                    final boolean isStickerInFavorites2 = MediaDataController.getInstance(ContentPreviewViewer.this.currentAccount).isStickerInFavorites(ContentPreviewViewer.this.currentDocument);
                    if (!MessageObject.isAnimatedEmoji(ContentPreviewViewer.this.currentDocument) && !MessageObject.isMaskDocument(ContentPreviewViewer.this.currentDocument) && (isStickerInFavorites2 || (MediaDataController.getInstance(ContentPreviewViewer.this.currentAccount).canAddStickerToFavorites() && MessageObject.isStickerHasSet(ContentPreviewViewer.this.currentDocument)))) {
                        arrayList7.add(LocaleController.getString(isStickerInFavorites2 ? R.string.DeleteFromFavorites : R.string.AddToFavorites));
                        arrayList9.add(Integer.valueOf(isStickerInFavorites2 ? R.drawable.msg_unfave : R.drawable.msg_fave));
                        arrayList8.add(5);
                    }
                    if (arrayList7.isEmpty()) {
                        return;
                    }
                    ContentPreviewViewer.this.menuVisible = true;
                    ContentPreviewViewer.this.containerView.invalidate();
                    int[] iArr2 = new int[arrayList9.size()];
                    for (int i15 = 0; i15 < arrayList9.size(); i15++) {
                        iArr2[i15] = ((Integer) arrayList9.get(i15)).intValue();
                    }
                    View.OnClickListener onClickListener2 = new View.OnClickListener() { // from class: org.telegram.ui.ContentPreviewViewer$1$$ExternalSyntheticLambda5
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            ContentPreviewViewer.1.this.lambda$run$7(arrayList8, isStickerInFavorites2, view);
                        }
                    };
                    boolean addVoteOptions = ContentPreviewViewer.this.addVoteOptions(actionBarPopupWindowLayout);
                    int i16 = 0;
                    while (i16 < arrayList7.size()) {
                        ActionBarMenuSubItem addItem3 = ActionBarMenuItem.addItem(!addVoteOptions && i16 == 0, i16 == arrayList7.size() - 1, actionBarPopupWindowLayout, ((Integer) arrayList9.get(i16)).intValue(), (CharSequence) arrayList7.get(i16), false, ContentPreviewViewer.this.resourcesProvider);
                        if (((Integer) arrayList8.get(i16)).intValue() == 4) {
                            addItem3.setIconColor(ContentPreviewViewer.this.getThemedColor(Theme.key_text_RedRegular));
                            addItem3.setTextColor(ContentPreviewViewer.this.getThemedColor(Theme.key_text_RedBold));
                        }
                        addItem3.setTag(Integer.valueOf(i16));
                        addItem3.setOnClickListener(onClickListener2);
                        i16++;
                    }
                    ContentPreviewViewer.this.popupWindow = new ActionBarPopupWindow(actionBarPopupWindowLayout, i11, i11) { // from class: org.telegram.ui.ContentPreviewViewer.1.4
                        @Override // org.telegram.ui.ActionBar.ActionBarPopupWindow, android.widget.PopupWindow
                        public void dismiss() {
                            super.dismiss();
                            ContentPreviewViewer contentPreviewViewer6 = ContentPreviewViewer.this;
                            contentPreviewViewer6.popupWindow = null;
                            contentPreviewViewer6.menuVisible = false;
                            if (ContentPreviewViewer.this.closeOnDismiss) {
                                ContentPreviewViewer.this.close();
                            }
                        }
                    };
                    ContentPreviewViewer.this.popupWindow.setPauseNotifications(true);
                    ContentPreviewViewer.this.popupWindow.setDismissAnimationDuration(150);
                    ContentPreviewViewer.this.popupWindow.setScaleOut(true);
                    ContentPreviewViewer.this.popupWindow.setOutsideTouchable(true);
                    ContentPreviewViewer.this.popupWindow.setClippingEnabled(true);
                    ContentPreviewViewer.this.popupWindow.setAnimationStyle(R.style.PopupContextAnimation);
                    ContentPreviewViewer.this.popupWindow.setFocusable(true);
                    actionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
                    ContentPreviewViewer.this.popupWindow.setInputMethodMode(2);
                    ContentPreviewViewer.this.popupWindow.getContentView().setFocusableInTouchMode(true);
                    if (ContentPreviewViewer.this.lastInsets != null) {
                        i4 = ContentPreviewViewer.this.lastInsets.getStableInsetBottom() + ContentPreviewViewer.this.lastInsets.getStableInsetTop();
                        i3 = ContentPreviewViewer.this.lastInsets.getStableInsetTop();
                    } else {
                        i3 = AndroidUtilities.statusBarHeight;
                        i4 = 0;
                    }
                    int min3 = (Math.min(ContentPreviewViewer.this.containerView.getWidth(), ContentPreviewViewer.this.containerView.getHeight() - i4) - AndroidUtilities.dp(40.0f)) / 2;
                    int max4 = (int) (((int) (ContentPreviewViewer.this.moveY + Math.max(i3 + min3 + (ContentPreviewViewer.this.stickerEmojiLayout != null ? AndroidUtilities.dp(40.0f) : 0), ((ContentPreviewViewer.this.containerView.getHeight() - i4) - ContentPreviewViewer.this.keyboardHeight) / 2) + min3)) + (AndroidUtilities.dp(24.0f) - ContentPreviewViewer.this.moveY));
                    ContentPreviewViewer contentPreviewViewer6 = ContentPreviewViewer.this;
                    contentPreviewViewer6.popupWindow.showAtLocation(contentPreviewViewer6.containerView, 0, (int) ((ContentPreviewViewer.this.containerView.getMeasuredWidth() - actionBarPopupWindowLayout.getMeasuredWidth()) / 2.0f), max4);
                    ActionBarPopupWindow.startAnimation(actionBarPopupWindowLayout);
                    try {
                        ContentPreviewViewer.this.containerView.performHapticFeedback(0);
                    } catch (Exception unused5) {
                    }
                    if (ContentPreviewViewer.this.moveY != 0.0f) {
                        if (ContentPreviewViewer.this.finalMoveY == 0.0f) {
                            ContentPreviewViewer.this.finalMoveY = 0.0f;
                            ContentPreviewViewer contentPreviewViewer7 = ContentPreviewViewer.this;
                            contentPreviewViewer7.startMoveY = contentPreviewViewer7.moveY;
                        }
                        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
                        ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.ContentPreviewViewer$1$$ExternalSyntheticLambda6
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                ContentPreviewViewer.1.this.lambda$run$8(valueAnimator);
                            }
                        });
                        ofFloat3.setDuration(350L);
                        ofFloat3.setInterpolator(CubicBezierInterpolator.DEFAULT);
                        ofFloat3.start();
                    }
                }
            } else {
                ArrayList arrayList10 = new ArrayList();
                final ArrayList arrayList11 = new ArrayList();
                ArrayList arrayList12 = new ArrayList();
                if (ContentPreviewViewer.this.stickerSetForCustomSticker == null) {
                    if (ContentPreviewViewer.this.delegate == null || !ContentPreviewViewer.this.delegate.isSettingIntroSticker()) {
                        if (ContentPreviewViewer.this.delegate.canSendSticker()) {
                            arrayList10.add(LocaleController.getString(R.string.SendStickerPreview));
                            arrayList12.add(Integer.valueOf(R.drawable.msg_send));
                            arrayList11.add(0);
                        }
                        arrayList10.add(LocaleController.getString(R.string.AddToFavorites));
                        arrayList12.add(Integer.valueOf(R.drawable.msg_fave));
                        arrayList11.add(1);
                    } else {
                        arrayList10.add(LocaleController.getString(R.string.SetIntroSticker));
                        arrayList12.add(Integer.valueOf(R.drawable.menu_sticker_add));
                        arrayList11.add(0);
                    }
                }
                if (ContentPreviewViewer.this.delegate == null || !ContentPreviewViewer.this.delegate.isSettingIntroSticker()) {
                    arrayList10.add(LocaleController.getString((ContentPreviewViewer.this.delegate == null || !ContentPreviewViewer.this.delegate.isReplacedSticker()) ? R.string.AddToStickerPack : R.string.StickersReplaceSticker));
                    arrayList12.add(Integer.valueOf((ContentPreviewViewer.this.delegate == null || !ContentPreviewViewer.this.delegate.isReplacedSticker()) ? R.drawable.menu_sticker_add : R.drawable.msg_replace));
                    arrayList11.add(2);
                }
                ActionBarMenuSubItem actionBarMenuSubItem = new ActionBarMenuSubItem((Context) ContentPreviewViewer.this.parentActivity, true, false, ContentPreviewViewer.this.resourcesProvider);
                actionBarMenuSubItem.setItemHeight(44);
                actionBarMenuSubItem.setTextAndIcon(LocaleController.getString(R.string.Back), R.drawable.msg_arrow_back);
                actionBarMenuSubItem.getTextView().setPadding(LocaleController.isRTL ? 0 : AndroidUtilities.dp(40.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(40.0f) : 0, 0);
                FrameLayout frameLayout = new FrameLayout(ContentPreviewViewer.this.containerView.getContext());
                final LinearLayout linearLayout = new LinearLayout(ContentPreviewViewer.this.containerView.getContext());
                linearLayout.setBackgroundColor(ContentPreviewViewer.this.getThemedColor(Theme.key_actionBarDefaultSubmenuBackground));
                linearLayout.setOrientation(1);
                final RecyclerListView createMyStickerPacksListView = ContentPreviewViewer.this.createMyStickerPacksListView();
                createMyStickerPacksListView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() { // from class: org.telegram.ui.ContentPreviewViewer$1$$ExternalSyntheticLambda2
                    @Override // org.telegram.ui.Components.RecyclerListView.OnItemClickListener
                    public final void onItemClick(View view, int i17) {
                        ContentPreviewViewer.1.this.lambda$run$4(view, i17);
                    }
                });
                frameLayout.addView(actionBarMenuSubItem);
                linearLayout.addView(frameLayout);
                linearLayout.addView(new ActionBarPopupWindow.GapView(ContentPreviewViewer.this.containerView.getContext(), ContentPreviewViewer.this.resourcesProvider), LayoutHelper.createLinear(-1, 8));
                View.OnClickListener onClickListener3 = new View.OnClickListener() { // from class: org.telegram.ui.ContentPreviewViewer$1$$ExternalSyntheticLambda3
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        ContentPreviewViewer.1.this.lambda$run$5(arrayList11, createMyStickerPacksListView, linearLayout, actionBarPopupWindowLayout, view);
                    }
                };
                for (int i17 = 0; i17 < arrayList10.size(); i17++) {
                    ActionBarMenuSubItem addItem4 = ActionBarMenuItem.addItem(actionBarPopupWindowLayout, ((Integer) arrayList12.get(i17)).intValue(), (CharSequence) arrayList10.get(i17), false, ContentPreviewViewer.this.resourcesProvider);
                    addItem4.setTag(Integer.valueOf(i17));
                    addItem4.setOnClickListener(onClickListener3);
                }
                actionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
                linearLayout.addView(createMyStickerPacksListView, new LinearLayout.LayoutParams(actionBarPopupWindowLayout.getMeasuredWidth() - AndroidUtilities.dp(16.0f), (int) (actionBarPopupWindowLayout.getMeasuredHeight() * 1.5f)));
                actionBarPopupWindowLayout.addViewToSwipeBack(linearLayout);
                frameLayout.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.ContentPreviewViewer$1$$ExternalSyntheticLambda4
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        ContentPreviewViewer.1.lambda$run$6(ActionBarPopupWindow.ActionBarPopupWindowLayout.this, view);
                    }
                });
                if (ContentPreviewViewer.this.lastInsets != null) {
                    i8 = ContentPreviewViewer.this.lastInsets.getStableInsetBottom() + ContentPreviewViewer.this.lastInsets.getStableInsetTop();
                    i7 = ContentPreviewViewer.this.lastInsets.getStableInsetTop();
                } else {
                    i7 = AndroidUtilities.statusBarHeight;
                    i8 = 0;
                }
                int min4 = ((int) (Math.min(ContentPreviewViewer.this.containerView.getWidth(), ContentPreviewViewer.this.containerView.getHeight() - i8) / 1.8f)) / 2;
                ContentPreviewViewer.this.containerView.addView(actionBarPopupWindowLayout, LayoutHelper.createFrame(-2, -2.0f, 49, 0.0f, (((int) ((ContentPreviewViewer.this.moveY + Math.max(i7 + min4, ((ContentPreviewViewer.this.containerView.getHeight() - i8) - ContentPreviewViewer.this.keyboardHeight) / 2)) + min4)) + AndroidUtilities.dp(84.0f)) / AndroidUtilities.density, 0.0f, 0.0f));
                ContentPreviewViewer.this.popupLayout = actionBarPopupWindowLayout;
                ContentPreviewViewer.this.popupLayout.setTranslationY(-AndroidUtilities.dp(12.0f));
                ContentPreviewViewer.this.popupLayout.setAlpha(0.0f);
                ContentPreviewViewer.this.popupLayout.setScaleX(0.8f);
                ContentPreviewViewer.this.popupLayout.setScaleY(0.8f);
                ContentPreviewViewer.this.popupLayout.setPivotY(0.0f);
                ContentPreviewViewer.this.popupLayout.setPivotX(ContentPreviewViewer.this.popupLayout.getMeasuredWidth() / 2.0f);
                ContentPreviewViewer.this.popupLayout.animate().translationY(0.0f).alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).start();
                ContentPreviewViewer.this.showEmojiSelectorForStickers();
                ContentPreviewViewer.this.menuVisible = true;
                ContentPreviewViewer.this.containerView.invalidate();
            }
            int i18 = 0;
            while (i18 < actionBarPopupWindowLayout.getItemsCount()) {
                View itemAt = actionBarPopupWindowLayout.getItemAt(i18);
                if (itemAt instanceof ActionBarMenuSubItem) {
                    ((ActionBarMenuSubItem) itemAt).updateSelectorBackground(i18 == 0, i18 == actionBarPopupWindowLayout.getItemsCount() - 1, 12);
                }
                i18++;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$run$0() {
            ContentPreviewViewer.this.dismissPopupWindow();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$run$1(ValueAnimator valueAnimator) {
            ContentPreviewViewer.this.currentMoveYProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            ContentPreviewViewer contentPreviewViewer = ContentPreviewViewer.this;
            contentPreviewViewer.moveY = contentPreviewViewer.startMoveY + ((ContentPreviewViewer.this.finalMoveY - ContentPreviewViewer.this.startMoveY) * ContentPreviewViewer.this.currentMoveYProgress);
            ContentPreviewViewer.this.containerView.invalidate();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$run$4(View view, int i) {
            TLRPC.StickerSetCovered cover = ((StickerPackNameView) view).getCover();
            CustomEmojiReactionsWindow reactionsWindow = ContentPreviewViewer.this.reactionsLayout.getReactionsWindow();
            if (reactionsWindow != null && reactionsWindow.isShowing()) {
                reactionsWindow.dismiss();
            }
            if (cover instanceof TLRPC.TL_stickerSetNoCovered) {
                StickersDialogs.showNameEditorDialog(null, ContentPreviewViewer.this.resourcesProvider, ContentPreviewViewer.this.containerView.getContext(), new Utilities.Callback2() { // from class: org.telegram.ui.ContentPreviewViewer$1$$ExternalSyntheticLambda9
                    @Override // org.telegram.messenger.Utilities.Callback2
                    public final void run(Object obj, Object obj2) {
                        ContentPreviewViewer.1.this.lambda$run$3((CharSequence) obj, (Utilities.Callback) obj2);
                    }
                });
                return;
            }
            if (ContentPreviewViewer.this.delegate != null) {
                ContentPreviewViewer.this.delegate.stickerSetSelected(cover.set, TextUtils.join("", ContentPreviewViewer.this.selectedEmojis));
            }
            ContentPreviewViewer.this.dismissPopupWindow();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$run$3(CharSequence charSequence, final Utilities.Callback callback) {
            if (ContentPreviewViewer.this.delegate != null) {
                ContentPreviewViewer.this.delegate.newStickerPackSelected(charSequence, TextUtils.join("", ContentPreviewViewer.this.selectedEmojis), callback != null ? new Utilities.Callback() { // from class: org.telegram.ui.ContentPreviewViewer$1$$ExternalSyntheticLambda11
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        ContentPreviewViewer.1.this.lambda$run$2(callback, (Boolean) obj);
                    }
                } : null);
                if (callback == null) {
                    ContentPreviewViewer.this.dismissPopupWindow();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$run$2(Utilities.Callback callback, Boolean bool) {
            callback.run(bool);
            if (bool.booleanValue()) {
                ContentPreviewViewer.this.dismissPopupWindow();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$run$5(ArrayList arrayList, RecyclerListView recyclerListView, LinearLayout linearLayout, ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout, View view) {
            if (ContentPreviewViewer.this.parentActivity == null) {
                return;
            }
            int intValue = ((Integer) view.getTag()).intValue();
            if (((Integer) arrayList.get(intValue)).intValue() == 2) {
                if (ContentPreviewViewer.this.stickerSetForCustomSticker != null) {
                    if (ContentPreviewViewer.this.delegate != null) {
                        ContentPreviewViewer.this.delegate.stickerSetSelected(ContentPreviewViewer.this.stickerSetForCustomSticker.set, TextUtils.join("", ContentPreviewViewer.this.selectedEmojis));
                    }
                    ContentPreviewViewer.this.dismissPopupWindow();
                    return;
                } else {
                    recyclerListView.requestLayout();
                    linearLayout.requestLayout();
                    recyclerListView.getAdapter().notifyDataSetChanged();
                    actionBarPopupWindowLayout.getSwipeBack().openForeground(1);
                    return;
                }
            }
            if (ContentPreviewViewer.this.delegate != null) {
                if (((Integer) arrayList.get(intValue)).intValue() == 1) {
                    ContentPreviewViewer.this.delegate.addToFavoriteSelected(TextUtils.join("", ContentPreviewViewer.this.selectedEmojis));
                } else if (((Integer) arrayList.get(intValue)).intValue() == 0) {
                    if (ContentPreviewViewer.this.delegate.isSettingIntroSticker()) {
                        ContentPreviewViewer.this.delegate.setIntroSticker(TextUtils.join("", ContentPreviewViewer.this.selectedEmojis));
                    } else {
                        ContentPreviewViewer.this.delegate.sendSticker(TextUtils.join("", ContentPreviewViewer.this.selectedEmojis));
                    }
                }
            }
            ContentPreviewViewer.this.dismissPopupWindow();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$run$6(ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout, View view) {
            actionBarPopupWindowLayout.getSwipeBack().closeForeground();
        }

        class 2 implements View.OnClickListener {
            final /* synthetic */ ArrayList val$actions;
            final /* synthetic */ boolean val$inFavs;

            2(ArrayList arrayList, boolean z) {
                this.val$actions = arrayList;
                this.val$inFavs = z;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (ContentPreviewViewer.this.parentActivity == null) {
                    return;
                }
                int intValue = ((Integer) view.getTag()).intValue();
                if (((Integer) this.val$actions.get(intValue)).intValue() == 0 || ((Integer) this.val$actions.get(intValue)).intValue() == 6) {
                    if (ContentPreviewViewer.this.delegate != null) {
                        ContentPreviewViewer.this.delegate.sendSticker(ContentPreviewViewer.this.currentDocument, ContentPreviewViewer.this.currentQuery, ContentPreviewViewer.this.parentObject, ((Integer) this.val$actions.get(intValue)).intValue() == 0, 0, 0);
                    }
                } else if (((Integer) this.val$actions.get(intValue)).intValue() == 1) {
                    if (ContentPreviewViewer.this.delegate != null) {
                        ContentPreviewViewer.this.delegate.openSet(ContentPreviewViewer.this.currentStickerSet, ContentPreviewViewer.this.clearsInputField);
                    }
                } else if (((Integer) this.val$actions.get(intValue)).intValue() == 2) {
                    MediaDataController.getInstance(ContentPreviewViewer.this.currentAccount).addRecentSticker(2, ContentPreviewViewer.this.parentObject, ContentPreviewViewer.this.currentDocument, (int) (System.currentTimeMillis() / 1000), this.val$inFavs);
                } else if (((Integer) this.val$actions.get(intValue)).intValue() == 3) {
                    final TLRPC.Document document = ContentPreviewViewer.this.currentDocument;
                    final Object obj = ContentPreviewViewer.this.parentObject;
                    final String str = ContentPreviewViewer.this.currentQuery;
                    final ContentPreviewViewerDelegate contentPreviewViewerDelegate = ContentPreviewViewer.this.delegate;
                    if (contentPreviewViewerDelegate == null) {
                        return;
                    } else {
                        AlertsCreator.createScheduleDatePickerDialog(ContentPreviewViewer.this.parentActivity, contentPreviewViewerDelegate.getDialogId(), new AlertsCreator.ScheduleDatePickerDelegate() { // from class: org.telegram.ui.ContentPreviewViewer$1$2$$ExternalSyntheticLambda0
                            @Override // org.telegram.ui.Components.AlertsCreator.ScheduleDatePickerDelegate
                            public final void didSelectDate(boolean z, int i, int i2) {
                                ContentPreviewViewer.ContentPreviewViewerDelegate.this.sendSticker(document, str, obj, z, i, i2);
                            }
                        });
                    }
                } else if (((Integer) this.val$actions.get(intValue)).intValue() == 4) {
                    MediaDataController.getInstance(ContentPreviewViewer.this.currentAccount).addRecentSticker(0, ContentPreviewViewer.this.parentObject, ContentPreviewViewer.this.currentDocument, (int) (System.currentTimeMillis() / 1000), true);
                } else if (((Integer) this.val$actions.get(intValue)).intValue() == 5) {
                    ContentPreviewViewer.this.delegate.remove(ContentPreviewViewer.this.importingSticker);
                } else if (((Integer) this.val$actions.get(intValue)).intValue() == 7) {
                    ContentPreviewViewer.this.delegate.editSticker(ContentPreviewViewer.this.currentDocument);
                } else if (((Integer) this.val$actions.get(intValue)).intValue() == 8) {
                    ContentPreviewViewer.this.delegate.deleteSticker(ContentPreviewViewer.this.currentDocument);
                }
                ContentPreviewViewer.this.dismissPopupWindow();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$run$7(ArrayList arrayList, boolean z, View view) {
            if (ContentPreviewViewer.this.parentActivity == null || ContentPreviewViewer.this.delegate == null) {
                return;
            }
            int intValue = ((Integer) arrayList.get(((Integer) view.getTag()).intValue())).intValue();
            if (intValue == 0) {
                ContentPreviewViewer.this.delegate.sendEmoji(ContentPreviewViewer.this.currentDocument);
            } else if (intValue == 1) {
                ContentPreviewViewer.this.delegate.setAsEmojiStatus(ContentPreviewViewer.this.currentDocument, null);
            } else if (intValue == 2) {
                ContentPreviewViewer.this.delegate.setAsEmojiStatus(null, null);
            } else if (intValue == 3) {
                ContentPreviewViewer.this.delegate.copyEmoji(ContentPreviewViewer.this.currentDocument);
            } else if (intValue == 4) {
                ContentPreviewViewer.this.delegate.removeFromRecent(ContentPreviewViewer.this.currentDocument);
            } else if (intValue == 5) {
                MediaDataController.getInstance(ContentPreviewViewer.this.currentAccount).addRecentSticker(2, ContentPreviewViewer.this.parentObject, ContentPreviewViewer.this.currentDocument, (int) (System.currentTimeMillis() / 1000), z);
            }
            ContentPreviewViewer.this.dismissPopupWindow();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$run$8(ValueAnimator valueAnimator) {
            ContentPreviewViewer.this.currentMoveYProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            ContentPreviewViewer contentPreviewViewer = ContentPreviewViewer.this;
            contentPreviewViewer.moveY = contentPreviewViewer.startMoveY + ((ContentPreviewViewer.this.finalMoveY - ContentPreviewViewer.this.startMoveY) * ContentPreviewViewer.this.currentMoveYProgress);
            ContentPreviewViewer.this.containerView.invalidate();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$run$10(ArrayList arrayList, View view) {
            if (ContentPreviewViewer.this.parentActivity == null) {
                return;
            }
            int intValue = ((Integer) view.getTag()).intValue();
            if (((Integer) arrayList.get(intValue)).intValue() == 0) {
                ContentPreviewViewer.this.delegate.sendGif(ContentPreviewViewer.this.currentDocument != null ? ContentPreviewViewer.this.currentDocument : ContentPreviewViewer.this.inlineResult, ContentPreviewViewer.this.parentObject, true, 0, 0);
            } else if (((Integer) arrayList.get(intValue)).intValue() == 4) {
                ContentPreviewViewer.this.delegate.sendGif(ContentPreviewViewer.this.currentDocument != null ? ContentPreviewViewer.this.currentDocument : ContentPreviewViewer.this.inlineResult, ContentPreviewViewer.this.parentObject, false, 0, 0);
            } else if (((Integer) arrayList.get(intValue)).intValue() == 1) {
                MediaDataController.getInstance(ContentPreviewViewer.this.currentAccount).removeRecentGif(ContentPreviewViewer.this.currentDocument);
                ContentPreviewViewer.this.delegate.gifAddedOrDeleted();
            } else if (((Integer) arrayList.get(intValue)).intValue() == 2) {
                MediaDataController.getInstance(ContentPreviewViewer.this.currentAccount).addRecentGif(ContentPreviewViewer.this.currentDocument, (int) (System.currentTimeMillis() / 1000), true);
                MessagesController.getInstance(ContentPreviewViewer.this.currentAccount).saveGif("gif", ContentPreviewViewer.this.currentDocument);
                ContentPreviewViewer.this.delegate.gifAddedOrDeleted();
            } else if (((Integer) arrayList.get(intValue)).intValue() == 3) {
                final TLRPC.Document document = ContentPreviewViewer.this.currentDocument;
                final TLRPC.BotInlineResult botInlineResult = ContentPreviewViewer.this.inlineResult;
                final Object obj = ContentPreviewViewer.this.parentObject;
                final ContentPreviewViewerDelegate contentPreviewViewerDelegate = ContentPreviewViewer.this.delegate;
                AlertsCreator.createScheduleDatePickerDialog(ContentPreviewViewer.this.parentActivity, contentPreviewViewerDelegate.getDialogId(), new AlertsCreator.ScheduleDatePickerDelegate() { // from class: org.telegram.ui.ContentPreviewViewer$1$$ExternalSyntheticLambda10
                    @Override // org.telegram.ui.Components.AlertsCreator.ScheduleDatePickerDelegate
                    public final void didSelectDate(boolean z, int i, int i2) {
                        ContentPreviewViewer.1.lambda$run$9(ContentPreviewViewer.ContentPreviewViewerDelegate.this, document, botInlineResult, obj, z, i, i2);
                    }
                }, ContentPreviewViewer.this.resourcesProvider);
            } else if (((Integer) arrayList.get(intValue)).intValue() == 11) {
                ContentPreviewViewer.this.delegate.addCaptionToGif(ContentPreviewViewer.this.currentDocument != null ? ContentPreviewViewer.this.currentDocument : ContentPreviewViewer.this.inlineResult, ContentPreviewViewer.this.parentObject, true, 0, 0);
            }
            ContentPreviewViewer.this.dismissPopupWindow();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void lambda$run$9(ContentPreviewViewerDelegate contentPreviewViewerDelegate, TLRPC.Document document, TLRPC.BotInlineResult botInlineResult, Object obj, boolean z, int i, int i2) {
            contentPreviewViewerDelegate.sendGif(document != null ? document : botInlineResult, obj, z, i, i2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$run$11(ValueAnimator valueAnimator) {
            ContentPreviewViewer.this.currentMoveYProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            ContentPreviewViewer contentPreviewViewer = ContentPreviewViewer.this;
            contentPreviewViewer.moveY = contentPreviewViewer.startMoveY + ((ContentPreviewViewer.this.finalMoveY - ContentPreviewViewer.this.startMoveY) * ContentPreviewViewer.this.currentMoveYProgress);
            ContentPreviewViewer.this.containerView.invalidate();
        }
    }

    public void setStickerSetForCustomSticker(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        this.stickerSetForCustomSticker = tL_messages_stickerSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showEmojiSelectorForStickers() {
        if (this.reactionsLayout == null) {
            ReactionsContainerLayout reactionsContainerLayout = new ReactionsContainerLayout(4, null, this.containerView.getContext(), UserConfig.selectedAccount, this.resourcesProvider) { // from class: org.telegram.ui.ContentPreviewViewer.2
                @Override // org.telegram.ui.Components.ReactionsContainerLayout
                public void invalidateLoopViews() {
                    super.invalidateLoopViews();
                    ContentPreviewViewer.this.setFocusable(getReactionsWindow() != null);
                }
            };
            this.reactionsLayout = reactionsContainerLayout;
            reactionsContainerLayout.skipEnterAnimation = true;
            reactionsContainerLayout.setPadding(0, AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f));
            this.reactionsLayout.setClipChildren(false);
            this.reactionsLayout.setClipToPadding(false);
            this.reactionsLayout.setVisibility(0);
            this.reactionsLayout.setHint(LocaleController.getString(R.string.StickersSetEmojiForSticker));
            this.reactionsLayout.setBubbleOffset(-AndroidUtilities.dp(105.0f));
            this.reactionsLayout.setMiniBubblesOffset(-AndroidUtilities.dp(14.0f));
            FrameLayout frameLayout = new FrameLayout(this.containerView.getContext());
            this.reactionsLayoutContainer = frameLayout;
            frameLayout.addView(this.reactionsLayout, LayoutHelper.createFrame(-2, 116.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
            this.containerView.addView(this.reactionsLayoutContainer, LayoutHelper.createFrame(-2, -2.0f, 1, 0.0f, 100.0f, 0.0f, 0.0f));
        }
        this.reactionsLayout.setSelectedEmojis(this.selectedEmojis);
        this.reactionsLayout.setDelegate(new ReactionsContainerLayout.ReactionsContainerDelegate() { // from class: org.telegram.ui.ContentPreviewViewer$$ExternalSyntheticLambda1
            @Override // org.telegram.ui.Components.ReactionsContainerLayout.ReactionsContainerDelegate
            public /* synthetic */ boolean allowLongPress() {
                return ReactionsContainerLayout.ReactionsContainerDelegate.-CC.$default$allowLongPress(this);
            }

            @Override // org.telegram.ui.Components.ReactionsContainerLayout.ReactionsContainerDelegate
            public /* synthetic */ boolean drawBackground() {
                return ReactionsContainerLayout.ReactionsContainerDelegate.-CC.$default$drawBackground(this);
            }

            @Override // org.telegram.ui.Components.ReactionsContainerLayout.ReactionsContainerDelegate
            public /* synthetic */ void drawRoundRect(Canvas canvas, RectF rectF, float f, float f2, float f3, int i, boolean z) {
                ReactionsContainerLayout.ReactionsContainerDelegate.-CC.$default$drawRoundRect(this, canvas, rectF, f, f2, f3, i, z);
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
            public final void onReactionClicked(View view, ReactionsLayoutInBubble.VisibleReaction visibleReaction, boolean z, boolean z2) {
                ContentPreviewViewer.this.lambda$showEmojiSelectorForStickers$5(view, visibleReaction, z, z2);
            }
        });
        this.reactionsLayout.setMessage(null, null, false);
        this.reactionsLayoutContainer.setScaleY(0.6f);
        this.reactionsLayoutContainer.setScaleX(0.6f);
        this.reactionsLayoutContainer.setAlpha(0.0f);
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ContentPreviewViewer$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                ContentPreviewViewer.this.lambda$showEmojiSelectorForStickers$6();
            }
        }, 10L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showEmojiSelectorForStickers$5(View view, ReactionsLayoutInBubble.VisibleReaction visibleReaction, boolean z, boolean z2) {
        if (visibleReaction == null) {
            return;
        }
        CustomEmojiReactionsWindow reactionsWindow = this.reactionsLayout.getReactionsWindow();
        if (this.selectedEmojis.contains(visibleReaction.emojicon)) {
            if (this.selectedEmojis.size() <= 1) {
                return;
            } else {
                this.selectedEmojis.remove(visibleReaction.emojicon);
            }
        } else {
            this.selectedEmojis.add(visibleReaction.emojicon);
            if (this.selectedEmojis.size() > 7) {
                this.selectedEmojis.remove(0);
            }
        }
        this.reactionsLayout.setSelectedEmojis(this.selectedEmojis);
        if (reactionsWindow != null) {
            this.reactionsLayout.setMessage(null, null, false);
            if (reactionsWindow.getSelectAnimatedEmojiDialog() != null) {
                reactionsWindow.getSelectAnimatedEmojiDialog().setSelectedReactions(this.selectedEmojis);
                reactionsWindow.getSelectAnimatedEmojiDialog().setRecentReactions(this.reactionsLayout.allReactionsList);
            }
            reactionsWindow.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showEmojiSelectorForStickers$6() {
        this.reactionsLayoutContainer.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(420L).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showUnlockPremiumView() {
        if (this.unlockPremiumView == null) {
            UnlockPremiumView unlockPremiumView = new UnlockPremiumView(this.containerView.getContext(), 0, this.resourcesProvider);
            this.unlockPremiumView = unlockPremiumView;
            this.containerView.addView(unlockPremiumView, LayoutHelper.createFrame(-1, -1.0f));
            this.unlockPremiumView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.ContentPreviewViewer$$ExternalSyntheticLambda3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ContentPreviewViewer.this.lambda$showUnlockPremiumView$7(view);
                }
            });
            this.unlockPremiumView.premiumButtonView.buttonLayout.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.ContentPreviewViewer$$ExternalSyntheticLambda4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ContentPreviewViewer.this.lambda$showUnlockPremiumView$8(view);
                }
            });
        }
        AndroidUtilities.updateViewVisibilityAnimated(this.unlockPremiumView, false, 1.0f, false);
        AndroidUtilities.updateViewVisibilityAnimated(this.unlockPremiumView, true);
        this.unlockPremiumView.setTranslationY(0.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showUnlockPremiumView$7(View view) {
        this.menuVisible = false;
        this.containerView.invalidate();
        close();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showUnlockPremiumView$8(View view) {
        Activity activity = this.parentActivity;
        if (activity instanceof LaunchActivity) {
            LaunchActivity launchActivity = (LaunchActivity) activity;
            if (launchActivity.getActionBarLayout() != null && launchActivity.getActionBarLayout().getLastFragment() != null) {
                launchActivity.getActionBarLayout().getLastFragment().dismissCurrentDialog();
            }
            launchActivity.lambda$runLinkRequest$100(new PremiumPreviewFragment(PremiumPreviewFragment.featureTypeToServerString(5)));
        }
        this.menuVisible = false;
        this.containerView.invalidate();
        close();
    }

    public static ContentPreviewViewer getInstance() {
        ContentPreviewViewer contentPreviewViewer = Instance;
        if (contentPreviewViewer == null) {
            synchronized (PhotoViewer.class) {
                try {
                    contentPreviewViewer = Instance;
                    if (contentPreviewViewer == null) {
                        contentPreviewViewer = new ContentPreviewViewer();
                        Instance = contentPreviewViewer;
                    }
                } finally {
                }
            }
        }
        return contentPreviewViewer;
    }

    public static boolean hasInstance() {
        return Instance != null;
    }

    public void reset() {
        Runnable runnable = this.openPreviewRunnable;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.openPreviewRunnable = null;
        }
        View view = this.currentPreviewCell;
        if (view != null) {
            if (view instanceof StickerEmojiCell) {
                ((StickerEmojiCell) view).setScaled(false);
            } else if (view instanceof StickerCell) {
                ((StickerCell) view).setScaled(false);
            } else if (view instanceof ContextLinkCell) {
                ((ContextLinkCell) view).setScaled(false);
            }
            this.currentPreviewCell = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouch(MotionEvent motionEvent, final RecyclerListView recyclerListView, int i, final Object obj, ContentPreviewViewerDelegate contentPreviewViewerDelegate, Theme.ResourcesProvider resourcesProvider) {
        int i2;
        ContentPreviewViewerDelegate contentPreviewViewerDelegate2;
        View view;
        View view2;
        TLRPC.Document document;
        this.delegate = contentPreviewViewerDelegate;
        if (contentPreviewViewerDelegate != null) {
            this.isPhotoEditor = contentPreviewViewerDelegate.isPhotoEditor();
            this.isStickerEditor = this.delegate.isStickerEditor();
        }
        ContentPreviewViewerDelegate contentPreviewViewerDelegate3 = this.delegate;
        if (contentPreviewViewerDelegate3 != null && !contentPreviewViewerDelegate3.can()) {
            return false;
        }
        if (this.openPreviewRunnable != null || isVisible()) {
            if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3 || motionEvent.getAction() == 6) {
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ContentPreviewViewer$$ExternalSyntheticLambda11
                    @Override // java.lang.Runnable
                    public final void run() {
                        ContentPreviewViewer.lambda$onTouch$9(RecyclerListView.this, obj);
                    }
                }, 150L);
                Runnable runnable = this.openPreviewRunnable;
                if (runnable != null) {
                    AndroidUtilities.cancelRunOnUIThread(runnable);
                    this.openPreviewRunnable = null;
                } else if (isVisible()) {
                    close();
                    View view3 = this.currentPreviewCell;
                    if (view3 != null) {
                        if (view3 instanceof StickerEmojiCell) {
                            ((StickerEmojiCell) view3).setScaled(false);
                        } else if (view3 instanceof StickerCell) {
                            ((StickerCell) view3).setScaled(false);
                        } else if (view3 instanceof ContextLinkCell) {
                            ((ContextLinkCell) view3).setScaled(false);
                        }
                        this.currentPreviewCell = null;
                    }
                }
            } else if (motionEvent.getAction() != 0) {
                if (this.isVisible) {
                    if (motionEvent.getAction() == 2) {
                        if (this.currentContentType == 1 && !this.isPhotoEditor) {
                            if (!this.menuVisible && this.showProgress == 1.0f) {
                                if (this.lastTouchY == -10000.0f) {
                                    this.lastTouchY = motionEvent.getY();
                                    this.currentMoveY = 0.0f;
                                    this.moveY = 0.0f;
                                } else {
                                    float y = motionEvent.getY();
                                    float f = this.currentMoveY + (y - this.lastTouchY);
                                    this.currentMoveY = f;
                                    this.lastTouchY = y;
                                    if (f > 0.0f) {
                                        this.currentMoveY = 0.0f;
                                    } else if (f < (-AndroidUtilities.dp(60.0f))) {
                                        this.currentMoveY = -AndroidUtilities.dp(60.0f);
                                    }
                                    this.moveY = rubberYPoisition(this.currentMoveY, AndroidUtilities.dp(200.0f));
                                    this.containerView.invalidate();
                                    if (this.currentMoveY <= (-AndroidUtilities.dp(55.0f))) {
                                        AndroidUtilities.cancelRunOnUIThread(this.showSheetRunnable);
                                        this.showSheetRunnable.run();
                                    }
                                }
                            }
                            return true;
                        }
                        int x = (int) motionEvent.getX();
                        int y2 = (int) motionEvent.getY();
                        int childCount = recyclerListView.getChildCount();
                        int i3 = 0;
                        while (true) {
                            if (i3 >= childCount) {
                                break;
                            }
                            View childAt = recyclerListView.getChildAt(i3);
                            if (childAt == null) {
                                return false;
                            }
                            int top = childAt.getTop();
                            int bottom = childAt.getBottom();
                            int left = childAt.getLeft();
                            int right = childAt.getRight();
                            if (top > y2 || bottom < y2 || left > x || right < x) {
                                i3++;
                            } else {
                                if (childAt instanceof StickerEmojiCell) {
                                    this.centerImage.setRoundRadius(0);
                                } else if (childAt instanceof StickerCell) {
                                    this.centerImage.setRoundRadius(0);
                                } else if (childAt instanceof ContextLinkCell) {
                                    ContextLinkCell contextLinkCell = (ContextLinkCell) childAt;
                                    if (contextLinkCell.isSticker()) {
                                        this.centerImage.setRoundRadius(0);
                                    } else {
                                        if (contextLinkCell.isGif()) {
                                            this.centerImage.setRoundRadius(AndroidUtilities.dp(6.0f));
                                            i2 = 1;
                                            if (i2 != -1 && childAt != this.currentPreviewCell) {
                                                contentPreviewViewerDelegate2 = this.delegate;
                                                if (contentPreviewViewerDelegate2 != null) {
                                                    contentPreviewViewerDelegate2.resetTouch();
                                                }
                                                view = this.currentPreviewCell;
                                                if (!(view instanceof StickerEmojiCell)) {
                                                    ((StickerEmojiCell) view).setScaled(false);
                                                } else if (view instanceof StickerCell) {
                                                    ((StickerCell) view).setScaled(false);
                                                } else if (view instanceof ContextLinkCell) {
                                                    ((ContextLinkCell) view).setScaled(false);
                                                }
                                                this.currentPreviewCell = childAt;
                                                this.clearsInputField = false;
                                                this.menuVisible = false;
                                                this.closeOnDismiss = false;
                                                dismissPopupWindow();
                                                AndroidUtilities.updateViewVisibilityAnimated(this.unlockPremiumView, false);
                                                view2 = this.currentPreviewCell;
                                                if (!(view2 instanceof StickerEmojiCell)) {
                                                    StickerEmojiCell stickerEmojiCell = (StickerEmojiCell) view2;
                                                    TLRPC.Document sticker = stickerEmojiCell.getSticker();
                                                    SendMessagesHelper.ImportingSticker stickerPath = stickerEmojiCell.getStickerPath();
                                                    String findAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(stickerEmojiCell.getSticker(), null, Integer.valueOf(this.currentAccount));
                                                    ContentPreviewViewerDelegate contentPreviewViewerDelegate4 = this.delegate;
                                                    open(sticker, stickerPath, findAnimatedEmojiEmoticon, contentPreviewViewerDelegate4 != null ? contentPreviewViewerDelegate4.getQuery(false) : null, null, i2, stickerEmojiCell.isRecent(), stickerEmojiCell.getParentObject(), resourcesProvider);
                                                    stickerEmojiCell.setScaled(true);
                                                } else if (view2 instanceof StickerCell) {
                                                    StickerCell stickerCell = (StickerCell) view2;
                                                    TLRPC.Document sticker2 = stickerCell.getSticker();
                                                    String findAnimatedEmojiEmoticon2 = MessageObject.findAnimatedEmojiEmoticon(stickerCell.getSticker(), null, Integer.valueOf(this.currentAccount));
                                                    ContentPreviewViewerDelegate contentPreviewViewerDelegate5 = this.delegate;
                                                    open(sticker2, null, findAnimatedEmojiEmoticon2, contentPreviewViewerDelegate5 != null ? contentPreviewViewerDelegate5.getQuery(false) : null, null, i2, false, stickerCell.getParentObject(), resourcesProvider);
                                                    stickerCell.setScaled(true);
                                                    this.clearsInputField = stickerCell.isClearsInputField();
                                                } else if (view2 instanceof ContextLinkCell) {
                                                    ContextLinkCell contextLinkCell2 = (ContextLinkCell) view2;
                                                    TLRPC.Document document2 = contextLinkCell2.getDocument();
                                                    ContentPreviewViewerDelegate contentPreviewViewerDelegate6 = this.delegate;
                                                    open(document2, null, null, contentPreviewViewerDelegate6 != null ? contentPreviewViewerDelegate6.getQuery(true) : null, contextLinkCell2.getBotInlineResult(), i2, false, contextLinkCell2.getBotInlineResult() != null ? contextLinkCell2.getInlineBot() : contextLinkCell2.getParentObject(), resourcesProvider);
                                                    if (i2 != 1 || this.isPhotoEditor) {
                                                        contextLinkCell2.setScaled(true);
                                                    }
                                                } else if (view2 instanceof EmojiPacksAlert.EmojiImageView) {
                                                    TLRPC.Document document3 = ((EmojiPacksAlert.EmojiImageView) view2).getDocument();
                                                    if (document3 != null) {
                                                        open(document3, null, MessageObject.findAnimatedEmojiEmoticon(document3, null, Integer.valueOf(this.currentAccount)), null, null, i2, false, null, resourcesProvider);
                                                    }
                                                } else if (view2 instanceof EmojiView.ImageViewEmoji) {
                                                    AnimatedEmojiSpan span = ((EmojiView.ImageViewEmoji) view2).getSpan();
                                                    if (span != null) {
                                                        document = span.document;
                                                        if (document == null) {
                                                            document = AnimatedEmojiDrawable.findDocument(this.currentAccount, span.getDocumentId());
                                                        }
                                                    } else {
                                                        document = null;
                                                    }
                                                    if (document == null) {
                                                        return false;
                                                    }
                                                    open(document, null, MessageObject.findAnimatedEmojiEmoticon(document, null, Integer.valueOf(this.currentAccount)), null, null, i2, false, null, resourcesProvider);
                                                } else if (view2 instanceof SuggestEmojiView.EmojiImageView) {
                                                    Drawable drawable = ((SuggestEmojiView.EmojiImageView) view2).drawable;
                                                    TLRPC.Document document4 = drawable instanceof AnimatedEmojiDrawable ? ((AnimatedEmojiDrawable) drawable).getDocument() : null;
                                                    if (document4 == null) {
                                                        return false;
                                                    }
                                                    open(document4, null, MessageObject.findAnimatedEmojiEmoticon(document4, null, Integer.valueOf(this.currentAccount)), null, null, i2, false, null, resourcesProvider);
                                                }
                                                runSmoothHaptic();
                                                return true;
                                            }
                                        }
                                        i2 = -1;
                                        if (i2 != -1) {
                                            contentPreviewViewerDelegate2 = this.delegate;
                                            if (contentPreviewViewerDelegate2 != null) {
                                            }
                                            view = this.currentPreviewCell;
                                            if (!(view instanceof StickerEmojiCell)) {
                                            }
                                            this.currentPreviewCell = childAt;
                                            this.clearsInputField = false;
                                            this.menuVisible = false;
                                            this.closeOnDismiss = false;
                                            dismissPopupWindow();
                                            AndroidUtilities.updateViewVisibilityAnimated(this.unlockPremiumView, false);
                                            view2 = this.currentPreviewCell;
                                            if (!(view2 instanceof StickerEmojiCell)) {
                                            }
                                            runSmoothHaptic();
                                            return true;
                                        }
                                    }
                                } else {
                                    if (childAt instanceof EmojiPacksAlert.EmojiImageView) {
                                        this.centerImage.setRoundRadius(0);
                                    } else {
                                        if ((childAt instanceof EmojiView.ImageViewEmoji) && ((EmojiView.ImageViewEmoji) childAt).getSpan() != null) {
                                            this.centerImage.setRoundRadius(0);
                                        }
                                        i2 = -1;
                                        if (i2 != -1) {
                                        }
                                    }
                                    i2 = 2;
                                    if (i2 != -1) {
                                    }
                                }
                                i2 = 0;
                                if (i2 != -1) {
                                }
                            }
                        }
                    }
                    return true;
                }
                if (this.openPreviewRunnable != null) {
                    if (motionEvent.getAction() != 2) {
                        AndroidUtilities.cancelRunOnUIThread(this.openPreviewRunnable);
                        this.openPreviewRunnable = null;
                    } else if (Math.hypot(this.startX - motionEvent.getX(), this.startY - motionEvent.getY()) > AndroidUtilities.dp(10.0f)) {
                        AndroidUtilities.cancelRunOnUIThread(this.openPreviewRunnable);
                        this.openPreviewRunnable = null;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onTouch$9(RecyclerListView recyclerListView, Object obj) {
        if (recyclerListView instanceof RecyclerListView) {
            recyclerListView.setOnItemClickListener((RecyclerListView.OnItemClickListener) obj);
        }
    }

    protected void runSmoothHaptic() {
        VibrationEffect createWaveform;
        if (Build.VERSION.SDK_INT >= 26) {
            Vibrator vibrator = (Vibrator) this.containerView.getContext().getSystemService("vibrator");
            if (this.vibrationEffect == null) {
                createWaveform = VibrationEffect.createWaveform(new long[]{0, 2}, -1);
                this.vibrationEffect = createWaveform;
            }
            vibrator.cancel();
            vibrator.vibrate(this.vibrationEffect);
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent, final RecyclerListView recyclerListView, int i, ContentPreviewViewerDelegate contentPreviewViewerDelegate, final Theme.ResourcesProvider resourcesProvider) {
        final int i2;
        this.delegate = contentPreviewViewerDelegate;
        if (contentPreviewViewerDelegate != null) {
            this.isPhotoEditor = contentPreviewViewerDelegate.isPhotoEditor();
            this.isStickerEditor = this.delegate.isStickerEditor();
        }
        ContentPreviewViewerDelegate contentPreviewViewerDelegate2 = this.delegate;
        if ((contentPreviewViewerDelegate2 == null || contentPreviewViewerDelegate2.can()) && motionEvent.getAction() == 0) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            int childCount = recyclerListView.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = recyclerListView.getChildAt(i3);
                if (childAt == null) {
                    return false;
                }
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                int left = childAt.getLeft();
                int right = childAt.getRight();
                if (top <= y && bottom >= y && left <= x && right >= x) {
                    if (childAt instanceof StickerEmojiCell) {
                        if (((StickerEmojiCell) childAt).showingBitmap()) {
                            this.centerImage.setRoundRadius(0);
                            i2 = 0;
                        }
                        i2 = -1;
                    } else if (childAt instanceof StickerCell) {
                        if (((StickerCell) childAt).showingBitmap()) {
                            this.centerImage.setRoundRadius(0);
                            i2 = 0;
                        }
                        i2 = -1;
                    } else if (childAt instanceof ContextLinkCell) {
                        ContextLinkCell contextLinkCell = (ContextLinkCell) childAt;
                        if (contextLinkCell.showingBitmap()) {
                            if (contextLinkCell.isSticker()) {
                                this.centerImage.setRoundRadius(0);
                                i2 = 0;
                            } else if (contextLinkCell.isGif()) {
                                this.centerImage.setRoundRadius(AndroidUtilities.dp(6.0f));
                                i2 = 1;
                            }
                        }
                        i2 = -1;
                    } else {
                        i2 = 2;
                        if (childAt instanceof EmojiPacksAlert.EmojiImageView) {
                            this.centerImage.setRoundRadius(0);
                        } else if ((childAt instanceof EmojiView.ImageViewEmoji) && ((EmojiView.ImageViewEmoji) childAt).getSpan() != null) {
                            this.centerImage.setRoundRadius(0);
                        } else {
                            if ((childAt instanceof SuggestEmojiView.EmojiImageView) && (((SuggestEmojiView.EmojiImageView) childAt).drawable instanceof AnimatedEmojiDrawable)) {
                                this.centerImage.setRoundRadius(0);
                            }
                            i2 = -1;
                        }
                    }
                    if (i2 == -1) {
                        return false;
                    }
                    this.startX = x;
                    this.startY = y;
                    this.currentPreviewCell = childAt;
                    Runnable runnable = new Runnable() { // from class: org.telegram.ui.ContentPreviewViewer$$ExternalSyntheticLambda15
                        @Override // java.lang.Runnable
                        public final void run() {
                            ContentPreviewViewer.this.lambda$onInterceptTouchEvent$10(recyclerListView, i2, resourcesProvider);
                        }
                    };
                    this.openPreviewRunnable = runnable;
                    AndroidUtilities.runOnUIThread(runnable, 200L);
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onInterceptTouchEvent$10(RecyclerListView recyclerListView, int i, Theme.ResourcesProvider resourcesProvider) {
        TLRPC.Document document;
        if (this.openPreviewRunnable == null) {
            return;
        }
        recyclerListView.setOnItemClickListener((RecyclerListView.OnItemClickListener) null);
        recyclerListView.requestDisallowInterceptTouchEvent(true);
        this.openPreviewRunnable = null;
        setParentActivity(AndroidUtilities.findActivity(recyclerListView.getContext()));
        this.clearsInputField = false;
        View view = this.currentPreviewCell;
        if (view instanceof StickerEmojiCell) {
            StickerEmojiCell stickerEmojiCell = (StickerEmojiCell) view;
            TLRPC.Document sticker = stickerEmojiCell.getSticker();
            SendMessagesHelper.ImportingSticker stickerPath = stickerEmojiCell.getStickerPath();
            String findAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(stickerEmojiCell.getSticker(), null, Integer.valueOf(this.currentAccount));
            ContentPreviewViewerDelegate contentPreviewViewerDelegate = this.delegate;
            open(sticker, stickerPath, findAnimatedEmojiEmoticon, contentPreviewViewerDelegate != null ? contentPreviewViewerDelegate.getQuery(false) : null, null, i, stickerEmojiCell.isRecent(), stickerEmojiCell.getParentObject(), this.resourcesProvider);
            stickerEmojiCell.setScaled(true);
        } else if (view instanceof StickerCell) {
            StickerCell stickerCell = (StickerCell) view;
            TLRPC.Document sticker2 = stickerCell.getSticker();
            ContentPreviewViewerDelegate contentPreviewViewerDelegate2 = this.delegate;
            open(sticker2, null, null, contentPreviewViewerDelegate2 != null ? contentPreviewViewerDelegate2.getQuery(false) : null, null, i, false, stickerCell.getParentObject(), resourcesProvider);
            stickerCell.setScaled(true);
            this.clearsInputField = stickerCell.isClearsInputField();
        } else if (view instanceof ContextLinkCell) {
            ContextLinkCell contextLinkCell = (ContextLinkCell) view;
            TLRPC.Document document2 = contextLinkCell.getDocument();
            ContentPreviewViewerDelegate contentPreviewViewerDelegate3 = this.delegate;
            open(document2, null, null, contentPreviewViewerDelegate3 != null ? contentPreviewViewerDelegate3.getQuery(true) : null, contextLinkCell.getBotInlineResult(), i, false, contextLinkCell.getBotInlineResult() != null ? contextLinkCell.getInlineBot() : contextLinkCell.getParentObject(), resourcesProvider);
            if (i != 1 || this.isPhotoEditor) {
                contextLinkCell.setScaled(true);
            }
        } else if (view instanceof EmojiPacksAlert.EmojiImageView) {
            TLRPC.Document document3 = ((EmojiPacksAlert.EmojiImageView) view).getDocument();
            if (document3 == null) {
                return;
            } else {
                open(document3, null, MessageObject.findAnimatedEmojiEmoticon(document3, null, Integer.valueOf(this.currentAccount)), null, null, i, false, null, resourcesProvider);
            }
        } else if (view instanceof EmojiView.ImageViewEmoji) {
            AnimatedEmojiSpan span = ((EmojiView.ImageViewEmoji) view).getSpan();
            if (span != null) {
                document = span.document;
                if (document == null) {
                    document = AnimatedEmojiDrawable.findDocument(this.currentAccount, span.getDocumentId());
                }
            } else {
                document = null;
            }
            if (document == null) {
                return;
            } else {
                open(document, null, MessageObject.findAnimatedEmojiEmoticon(document, null, Integer.valueOf(this.currentAccount)), null, null, i, false, null, resourcesProvider);
            }
        } else {
            if (!(view instanceof SuggestEmojiView.EmojiImageView)) {
                return;
            }
            Drawable drawable = ((SuggestEmojiView.EmojiImageView) view).drawable;
            TLRPC.Document document4 = drawable instanceof AnimatedEmojiDrawable ? ((AnimatedEmojiDrawable) drawable).getDocument() : null;
            if (document4 == null) {
                return;
            } else {
                open(document4, null, MessageObject.findAnimatedEmojiEmoticon(document4, null, Integer.valueOf(this.currentAccount)), null, null, i, false, null, resourcesProvider);
            }
        }
        try {
            this.currentPreviewCell.performHapticFeedback(0, 2);
        } catch (Exception unused) {
        }
        ContentPreviewViewerDelegate contentPreviewViewerDelegate4 = this.delegate;
        if (contentPreviewViewerDelegate4 != null) {
            contentPreviewViewerDelegate4.resetTouch();
        }
    }

    public void setDelegate(ContentPreviewViewerDelegate contentPreviewViewerDelegate) {
        this.delegate = contentPreviewViewerDelegate;
        if (contentPreviewViewerDelegate != null) {
            this.isPhotoEditor = contentPreviewViewerDelegate.isPhotoEditor();
            this.isStickerEditor = this.delegate.isStickerEditor();
        }
    }

    public void setParentActivity(Activity activity) {
        int i = UserConfig.selectedAccount;
        this.currentAccount = i;
        this.centerImage.setCurrentAccount(i);
        this.centerImage.setLayerNum(ConnectionsManager.DEFAULT_DATACENTER_ID);
        this.effectImage.setCurrentAccount(this.currentAccount);
        this.effectImage.setLayerNum(ConnectionsManager.DEFAULT_DATACENTER_ID);
        if (this.parentActivity == activity) {
            return;
        }
        this.parentActivity = activity;
        this.slideUpDrawable = activity.getResources().getDrawable(R.drawable.preview_arrow);
        this.windowView = new FrameLayout(activity) { // from class: org.telegram.ui.ContentPreviewViewer.3
            @Override // android.view.ViewGroup, android.view.View
            public boolean dispatchKeyEvent(KeyEvent keyEvent) {
                if (keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    if (ContentPreviewViewer.this.isStickerEditor || ContentPreviewViewer.this.menuVisible) {
                        ContentPreviewViewer.this.closeWithMenu();
                    } else {
                        ContentPreviewViewer.this.close();
                    }
                    return true;
                }
                return super.dispatchKeyEvent(keyEvent);
            }

            @Override // android.view.View
            protected void onSizeChanged(int i2, int i3, int i4, int i5) {
                super.onSizeChanged(i2, i3, i4, i5);
                Blur3Utils.checkBitmapSourceMatrixScale(ContentPreviewViewer.this.scrimBlur3SourceBitmap, ContentPreviewViewer.this.windowView);
                ContentPreviewViewer.this.scrimBlur3Factory.invalidateAllLinkedViews();
            }
        };
        this.scrimBlur3Factory.setSourceRootView(new ViewPositionWatcher(this.windowView), this.windowView);
        this.scrimBlur3Factory.setLinkedViewsRef(new ReferenceList());
        this.windowView.setFocusable(true);
        this.windowView.setFocusableInTouchMode(true);
        this.windowView.setSystemUiVisibility(1792);
        ViewCompat.setOnApplyWindowInsetsListener(this.windowView, new OnApplyWindowInsetsListener() { // from class: org.telegram.ui.ContentPreviewViewer$$ExternalSyntheticLambda13
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                WindowInsetsCompat lambda$setParentActivity$11;
                lambda$setParentActivity$11 = ContentPreviewViewer.this.lambda$setParentActivity$11(view, windowInsetsCompat);
                return lambda$setParentActivity$11;
            }
        });
        FrameLayoutDrawer frameLayoutDrawer = new FrameLayoutDrawer(activity) { // from class: org.telegram.ui.ContentPreviewViewer.4
            @Override // android.view.ViewGroup, android.view.View
            protected void onAttachedToWindow() {
                super.onAttachedToWindow();
                ContentPreviewViewer.this.centerImage.onAttachedToWindow();
                ContentPreviewViewer.this.effectImage.onAttachedToWindow();
            }

            @Override // android.view.ViewGroup, android.view.View
            protected void onDetachedFromWindow() {
                super.onDetachedFromWindow();
                ContentPreviewViewer.this.centerImage.onDetachedFromWindow();
                ContentPreviewViewer.this.effectImage.onDetachedFromWindow();
            }
        };
        this.containerView = frameLayoutDrawer;
        frameLayoutDrawer.setFocusable(false);
        this.windowView.addView(this.containerView, LayoutHelper.createFrame(-1, -1, 51));
        this.containerView.setOnTouchListener(new View.OnTouchListener() { // from class: org.telegram.ui.ContentPreviewViewer$$ExternalSyntheticLambda14
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean lambda$setParentActivity$12;
                lambda$setParentActivity$12 = ContentPreviewViewer.this.lambda$setParentActivity$12(view, motionEvent);
                return lambda$setParentActivity$12;
            }
        });
        MessagesController.getInstance(this.currentAccount);
        this.keyboardHeight = MessagesController.getGlobalEmojiSettings().getInt("kbd_height", AndroidUtilities.dp(200.0f));
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.windowLayoutParams = layoutParams;
        layoutParams.height = -1;
        layoutParams.format = -3;
        layoutParams.width = -1;
        layoutParams.gravity = 48;
        layoutParams.type = 99;
        layoutParams.flags = -2147286784;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            layoutParams.layoutInDisplayCutoutMode = i2 >= 30 ? 3 : 1;
        }
        this.centerImage.setAspectFit(true);
        this.centerImage.setInvalidateAll(true);
        this.centerImage.setParentView(this.containerView);
        this.effectImage.setAspectFit(true);
        this.effectImage.setInvalidateAll(true);
        this.effectImage.setParentView(this.containerView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ WindowInsetsCompat lambda$setParentActivity$11(View view, WindowInsetsCompat windowInsetsCompat) {
        this.lastInsets = windowInsetsCompat;
        return windowInsetsCompat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$setParentActivity$12(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 6 || motionEvent.getAction() == 3) {
            if (this.isStickerEditor) {
                closeWithMenu();
            } else {
                close();
            }
        }
        return true;
    }

    public void setFocusable(boolean z) {
        if (z) {
            WindowManager.LayoutParams layoutParams = this.windowLayoutParams;
            layoutParams.flags &= -131073;
            layoutParams.softInputMode = 16;
        } else {
            this.windowLayoutParams.flags |= 131072;
        }
        try {
            ((WindowManager) this.parentActivity.getSystemService("window")).updateViewLayout(this.windowView, this.windowLayoutParams);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void open(TLRPC.Document document, SendMessagesHelper.ImportingSticker importingSticker, String str, String str2, TLRPC.BotInlineResult botInlineResult, int i, boolean z, Object obj, Theme.ResourcesProvider resourcesProvider) {
        open(document, importingSticker, str, str2, botInlineResult, i, z, obj, resourcesProvider, 0);
    }

    public void open(TLRPC.Document document, SendMessagesHelper.ImportingSticker importingSticker, String str, String str2, TLRPC.BotInlineResult botInlineResult, int i, boolean z, Object obj, Theme.ResourcesProvider resourcesProvider, int i2) {
        boolean z2;
        TLRPC.InputStickerSet inputStickerSet;
        ContentPreviewViewerDelegate contentPreviewViewerDelegate;
        int i3;
        if (this.parentActivity == null || this.windowView == null) {
            return;
        }
        this.resourcesProvider = resourcesProvider;
        this.isRecentSticker = z;
        this.stickerEmojiLayout = null;
        this.backgroundDrawable.setColor(AndroidUtilities.isDarkColor(Theme.getColor(Theme.key_windowBackgroundWhite, resourcesProvider)) ? 1895825408 : 1692853990);
        this.drawEffect = false;
        this.centerImage.setColorFilter(null);
        if (i != 0 && i != 2 && i != 3) {
            if (document != null) {
                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
                TLRPC.VideoSize documentVideoThumb = MessageObject.getDocumentVideoThumb(document);
                ImageLocation forDocument = ImageLocation.getForDocument(document);
                forDocument.imageType = 2;
                if (documentVideoThumb != null) {
                    this.centerImage.setImage(forDocument, null, ImageLocation.getForDocument(documentVideoThumb, document), null, ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "90_90_b", null, document.size, null, "gif" + document, 0);
                } else {
                    this.centerImage.setImage(forDocument, null, ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "90_90_b", document.size, null, "gif" + document, 0);
                }
            } else {
                if (botInlineResult == null || botInlineResult.content == null) {
                    return;
                }
                TLRPC.WebDocument webDocument = botInlineResult.thumb;
                if ((webDocument instanceof TLRPC.TL_webDocument) && "video/mp4".equals(webDocument.mime_type)) {
                    this.centerImage.setImage(ImageLocation.getForWebFile(WebFile.createWithWebDocument(botInlineResult.content)), null, ImageLocation.getForWebFile(WebFile.createWithWebDocument(botInlineResult.thumb)), null, ImageLocation.getForWebFile(WebFile.createWithWebDocument(botInlineResult.thumb)), "90_90_b", null, botInlineResult.content.size, null, "gif" + botInlineResult, 1);
                } else {
                    this.centerImage.setImage(ImageLocation.getForWebFile(WebFile.createWithWebDocument(botInlineResult.content)), null, ImageLocation.getForWebFile(WebFile.createWithWebDocument(botInlineResult.thumb)), "90_90_b", botInlineResult.content.size, null, "gif" + botInlineResult, 1);
                }
            }
            AndroidUtilities.cancelRunOnUIThread(this.showSheetRunnable);
            AndroidUtilities.runOnUIThread(this.showSheetRunnable, 2000L);
        } else {
            if (document == null && importingSticker == null) {
                return;
            }
            if (textPaint == null) {
                TextPaint textPaint2 = new TextPaint(1);
                textPaint = textPaint2;
                textPaint2.setTextSize(AndroidUtilities.dp(24.0f));
            }
            this.effectImage.clearImage();
            this.drawEffect = false;
            if (document != null) {
                int i4 = 0;
                while (true) {
                    if (i4 >= document.attributes.size()) {
                        inputStickerSet = null;
                        break;
                    }
                    TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i4);
                    if ((documentAttribute instanceof TLRPC.TL_documentAttributeSticker) && (inputStickerSet = documentAttribute.stickerset) != null) {
                        break;
                    } else {
                        i4++;
                    }
                }
                if (str != null) {
                    this.stickerEmojiLayout = new StaticLayout(AndroidUtilities.replaceCharSequence("…", TextUtils.ellipsize(Emoji.replaceEmoji(str, textPaint.getFontMetricsInt(), false), textPaint, AndroidUtilities.dp(200.0f), TextUtils.TruncateAt.END), ""), textPaint, AndroidUtilities.dp(200.0f), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                }
                if ((inputStickerSet != null || i == 2) && ((contentPreviewViewerDelegate = this.delegate) == null || contentPreviewViewerDelegate.needMenu())) {
                    AndroidUtilities.cancelRunOnUIThread(this.showSheetRunnable);
                    AndroidUtilities.runOnUIThread(this.showSheetRunnable, i2 > 0 ? i2 : 1300L);
                }
                TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(this.currentAccount).getStickerSet(inputStickerSet, true);
                this.currentStickerSet = (stickerSet == null || !stickerSet.documents.isEmpty()) ? inputStickerSet : null;
                TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
                if (MessageObject.isVideoStickerDocument(document)) {
                    this.centerImage.setImage(ImageLocation.getForDocument(document), null, ImageLocation.getForDocument(closestPhotoSizeWithSize2, document), null, null, 0L, "webp", this.currentStickerSet, 1);
                } else {
                    this.centerImage.setImage(ImageLocation.getForDocument(document), (String) null, ImageLocation.getForDocument(closestPhotoSizeWithSize2, document), (String) null, "webp", this.currentStickerSet, 1);
                    if (MessageObject.isPremiumSticker(document)) {
                        this.drawEffect = true;
                        this.effectImage.setImage(ImageLocation.getForDocument(MessageObject.getPremiumStickerAnimation(document), document), (String) null, (ImageLocation) null, (String) null, "tgs", this.currentStickerSet, 1);
                    }
                }
                if (MessageObject.isTextColorEmoji(document)) {
                    this.centerImage.setColorFilter(Theme.getAnimatedEmojiColorFilter(resourcesProvider));
                }
                if (this.stickerEmojiLayout == null) {
                    int i5 = 0;
                    while (true) {
                        if (i5 >= document.attributes.size()) {
                            break;
                        }
                        TLRPC.DocumentAttribute documentAttribute2 = document.attributes.get(i5);
                        if ((documentAttribute2 instanceof TLRPC.TL_documentAttributeSticker) && !TextUtils.isEmpty(documentAttribute2.alt)) {
                            this.stickerEmojiLayout = new StaticLayout(AndroidUtilities.replaceCharSequence("…", TextUtils.ellipsize(Emoji.replaceEmoji(documentAttribute2.alt, textPaint.getFontMetricsInt(), false), textPaint, AndroidUtilities.dp(200.0f), TextUtils.TruncateAt.END), ""), textPaint, AndroidUtilities.dp(200.0f), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                            break;
                        }
                        i5++;
                    }
                }
            } else if (importingSticker != null) {
                this.centerImage.setImage(importingSticker.path, null, null, importingSticker.animated ? "tgs" : null, 0L);
                if (importingSticker.videoEditedInfo != null) {
                    if (this.paintingOverlay == null) {
                        PaintingOverlay paintingOverlay = new PaintingOverlay(this.containerView.getContext());
                        this.paintingOverlay = paintingOverlay;
                        this.containerView.addView(paintingOverlay, new FrameLayout.LayoutParams(512, 512));
                    }
                    z2 = false;
                    this.paintingOverlay.setEntities(importingSticker.videoEditedInfo.mediaEntities, true, true, false);
                } else {
                    z2 = false;
                }
                if (str != null) {
                    this.stickerEmojiLayout = new StaticLayout(AndroidUtilities.replaceCharSequence("…", TextUtils.ellipsize(Emoji.replaceEmoji(str, textPaint.getFontMetricsInt(), z2), textPaint, AndroidUtilities.dp(200.0f), TextUtils.TruncateAt.END), ""), textPaint, AndroidUtilities.dp(200.0f), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                }
                if (this.delegate.needMenu()) {
                    AndroidUtilities.cancelRunOnUIThread(this.showSheetRunnable);
                    AndroidUtilities.runOnUIThread(this.showSheetRunnable, i2 > 0 ? i2 : 1300L);
                }
            }
        }
        if (this.centerImage.getLottieAnimation() != null) {
            i3 = 0;
            this.centerImage.getLottieAnimation().setCurrentFrame(0);
        } else {
            i3 = 0;
        }
        if (this.drawEffect && this.effectImage.getLottieAnimation() != null) {
            this.effectImage.getLottieAnimation().setCurrentFrame(i3);
        }
        this.currentContentType = i;
        this.currentDocument = document;
        this.importingSticker = importingSticker;
        this.currentQuery = str2;
        this.inlineResult = botInlineResult;
        this.parentObject = obj;
        this.resourcesProvider = resourcesProvider;
        this.containerView.invalidate();
        if (this.isVisible) {
            return;
        }
        AndroidUtilities.lockOrientation(this.parentActivity);
        try {
            if (this.windowView.getParent() != null) {
                ((WindowManager) this.parentActivity.getSystemService("window")).removeView(this.windowView);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        ((WindowManager) this.parentActivity.getSystemService("window")).addView(this.windowView, this.windowLayoutParams);
        this.isVisible = true;
        this.showProgress = 0.0f;
        this.lastTouchY = -10000.0f;
        this.currentMoveYProgress = 0.0f;
        this.finalMoveY = 0.0f;
        this.currentMoveY = 0.0f;
        this.moveY = 0.0f;
        this.lastUpdateTime = System.currentTimeMillis();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 8);
    }

    public boolean isVisible() {
        return this.isVisible;
    }

    public void closeWithMenu() {
        CustomEmojiReactionsWindow reactionsWindow;
        ReactionsContainerLayout reactionsContainerLayout = this.reactionsLayout;
        if (reactionsContainerLayout != null && (reactionsWindow = reactionsContainerLayout.getReactionsWindow()) != null && reactionsWindow.isShowing()) {
            reactionsWindow.dismiss();
            return;
        }
        this.menuVisible = false;
        dismissPopupWindow();
        close();
    }

    public void close() {
        if (this.parentActivity == null || this.menuVisible) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(this.showSheetRunnable);
        this.showProgress = 1.0f;
        this.lastUpdateTime = System.currentTimeMillis();
        this.containerView.invalidate();
        this.currentDocument = null;
        this.currentStickerSet = null;
        this.currentQuery = null;
        this.delegate = null;
        this.isVisible = false;
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ContentPreviewViewer$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                ContentPreviewViewer.this.lambda$close$13();
            }
        }, 200L);
        UnlockPremiumView unlockPremiumView = this.unlockPremiumView;
        if (unlockPremiumView != null) {
            unlockPremiumView.animate().alpha(0.0f).translationY(AndroidUtilities.dp(56.0f)).setDuration(150L).setInterpolator(CubicBezierInterpolator.DEFAULT).start();
        }
        FrameLayout frameLayout = this.reactionsLayoutContainer;
        if (frameLayout != null) {
            frameLayout.animate().alpha(0.0f).setDuration(150L).scaleX(0.6f).scaleY(0.6f).setInterpolator(CubicBezierInterpolator.DEFAULT).start();
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$close$13() {
        this.resourcesProvider = null;
    }

    public void clearDelegate(ContentPreviewViewerDelegate contentPreviewViewerDelegate) {
        if (this.delegate == contentPreviewViewerDelegate) {
            this.currentDocument = null;
            this.currentStickerSet = null;
            this.currentQuery = null;
            this.delegate = null;
            this.resourcesProvider = null;
            reset();
        }
    }

    public void destroy() {
        this.isVisible = false;
        this.delegate = null;
        this.currentDocument = null;
        this.currentQuery = null;
        this.currentStickerSet = null;
        if (this.parentActivity == null || this.windowView == null) {
            return;
        }
        Bitmap bitmap = this.blurrBitmap;
        if (bitmap != null) {
            bitmap.recycle();
            this.blurrBitmap = null;
        }
        this.blurProgress = 0.0f;
        this.menuVisible = false;
        try {
            if (this.windowView.getParent() != null) {
                ((WindowManager) this.parentActivity.getSystemService("window")).removeViewImmediate(this.windowView);
            }
            this.windowView = null;
        } catch (Exception e) {
            FileLog.e(e);
        }
        Instance = null;
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 8);
    }

    private float rubberYPoisition(float f, float f2) {
        return (-((1.0f - (1.0f / (((Math.abs(f) * 0.55f) / f2) + 1.0f))) * f2)) * (f >= 0.0f ? -1.0f : 1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onDraw(Canvas canvas) {
        int i;
        int i2;
        float min;
        int i3;
        Drawable drawable;
        float f;
        if (this.containerView == null || this.backgroundDrawable == null) {
            return;
        }
        if (this.menuVisible && this.blurrBitmap == null) {
            prepareBlurBitmap();
        }
        if (this.blurrBitmap != null) {
            boolean z = this.menuVisible;
            if (z) {
                float f2 = this.blurProgress;
                if (f2 != 1.0f) {
                    float f3 = f2 + 0.13333334f;
                    this.blurProgress = f3;
                    if (f3 > 1.0f) {
                        this.blurProgress = 1.0f;
                    }
                    this.containerView.invalidate();
                    f = this.blurProgress;
                    if (f != 0.0f && this.blurrBitmap != null) {
                        this.paint.setAlpha((int) (f * 255.0f));
                        if (this.paint.getAlpha() != 255) {
                            canvas.drawColor(Theme.multAlpha(Theme.getColor(Theme.key_windowBackgroundGray, this.resourcesProvider), this.blurProgress));
                        }
                        canvas.drawPaint(this.paint);
                    }
                }
            }
            if (!z) {
                float f4 = this.blurProgress;
                if (f4 != 0.0f) {
                    float f5 = f4 - 0.13333334f;
                    this.blurProgress = f5;
                    if (f5 < 0.0f) {
                        this.blurProgress = 0.0f;
                    }
                    this.containerView.invalidate();
                }
            }
            f = this.blurProgress;
            if (f != 0.0f) {
                this.paint.setAlpha((int) (f * 255.0f));
                if (this.paint.getAlpha() != 255) {
                }
                canvas.drawPaint(this.paint);
            }
        }
        this.backgroundDrawable.setAlpha((int) (this.showProgress * 180.0f));
        this.backgroundDrawable.setBounds(0, 0, this.containerView.getWidth(), this.containerView.getHeight());
        this.backgroundDrawable.draw(canvas);
        canvas.save();
        WindowInsetsCompat windowInsetsCompat = this.lastInsets;
        if (windowInsetsCompat != null) {
            i2 = windowInsetsCompat.getStableInsetBottom() + this.lastInsets.getStableInsetTop();
            i = this.lastInsets.getStableInsetTop();
        } else {
            i = AndroidUtilities.statusBarHeight;
            i2 = 0;
        }
        if (this.currentContentType == 1) {
            i3 = Math.min(this.containerView.getWidth(), this.containerView.getHeight() - i2) - AndroidUtilities.dp(40.0f);
        } else {
            if (this.drawEffect) {
                min = Math.min(this.containerView.getWidth(), this.containerView.getHeight() - i2) - AndroidUtilities.dpf2(40.0f);
            } else {
                min = Math.min(this.containerView.getWidth(), this.containerView.getHeight() - i2) / 1.8f;
            }
            i3 = (int) min;
        }
        float max = Math.max((i3 / 2) + i + (this.stickerEmojiLayout != null ? AndroidUtilities.dp(40.0f) : 0), ((this.containerView.getHeight() - i2) - this.keyboardHeight) / 2);
        if (this.drawEffect) {
            max += AndroidUtilities.dp(40.0f);
        }
        canvas.translate(this.containerView.getWidth() / 2, this.moveY + max);
        int i4 = (int) (i3 * ((this.showProgress * 0.8f) / 0.8f));
        if (this.currentContentType == 3) {
            canvas.translate(0.0f, AndroidUtilities.dp(70.0f));
        }
        if (this.drawEffect) {
            float f6 = i4;
            float f7 = 0.6669f * f6;
            this.centerImage.setAlpha(this.showProgress);
            float f8 = f6 - f7;
            float f9 = f6 / 2.0f;
            this.centerImage.setImageCoords((f8 - f9) - (0.0546875f * f6), (f8 / 2.0f) - f9, f7, f7);
            this.centerImage.draw(canvas);
            this.effectImage.setAlpha(this.showProgress);
            float f10 = (-i4) / 2.0f;
            this.effectImage.setImageCoords(f10, f10, f6, f6);
            this.effectImage.draw(canvas);
        } else {
            this.centerImage.setAlpha(this.showProgress);
            float f11 = (-i4) / 2.0f;
            float f12 = i4;
            this.centerImage.setImageCoords(f11, f11, f12, f12);
            this.centerImage.draw(canvas);
        }
        if (this.paintingOverlay != null) {
            canvas.save();
            float f13 = (-i4) / 2.0f;
            canvas.translate(f13, f13);
            float f14 = i4;
            canvas.scale(f14 / this.paintingOverlay.getWidth(), f14 / this.paintingOverlay.getHeight());
            this.paintingOverlay.setAlpha(this.showProgress);
            if (this.paintingOverlayClipPath == null) {
                this.paintingOverlayClipPath = new Path();
            }
            this.paintingOverlayClipPath.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, 0.0f, this.paintingOverlay.getWidth(), this.paintingOverlay.getHeight());
            float f15 = f14 / 8.0f;
            this.paintingOverlayClipPath.addRoundRect(rectF, f15, f15, Path.Direction.CW);
            canvas.clipPath(this.paintingOverlayClipPath);
            this.paintingOverlay.draw(canvas);
            canvas.restore();
        }
        if (this.currentContentType == 1 && !this.isPhotoEditor && (drawable = this.slideUpDrawable) != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = this.slideUpDrawable.getIntrinsicHeight();
            int dp = (int) (this.centerImage.getDrawRegion().top - AndroidUtilities.dp(((this.currentMoveY / AndroidUtilities.dp(60.0f)) * 6.0f) + 17.0f));
            this.slideUpDrawable.setAlpha((int) ((1.0f - this.currentMoveYProgress) * 255.0f));
            this.slideUpDrawable.setBounds((-intrinsicWidth) / 2, (-intrinsicHeight) + dp, intrinsicWidth / 2, dp);
            this.slideUpDrawable.draw(canvas);
        }
        if (this.stickerEmojiLayout != null) {
            if (this.drawEffect) {
                canvas.translate((-r0.getWidth()) / 2.0f, ((-this.effectImage.getImageHeight()) / 2.0f) - AndroidUtilities.dp(30.0f));
            } else {
                canvas.translate((-r0.getWidth()) / 2.0f, ((-this.centerImage.getImageHeight()) / 2.0f) - AndroidUtilities.dp(30.0f));
            }
            textPaint.setAlpha((int) (this.showProgress * 255.0f));
            this.stickerEmojiLayout.draw(canvas);
        }
        canvas.restore();
        if (this.isVisible) {
            if (this.showProgress != 1.0f) {
                long currentTimeMillis = System.currentTimeMillis();
                long j = currentTimeMillis - this.lastUpdateTime;
                this.lastUpdateTime = currentTimeMillis;
                this.showProgress += j / 120.0f;
                this.containerView.invalidate();
                if (this.showProgress > 1.0f) {
                    this.showProgress = 1.0f;
                    return;
                }
                return;
            }
            return;
        }
        if (this.showProgress != 0.0f) {
            long currentTimeMillis2 = System.currentTimeMillis();
            long j2 = currentTimeMillis2 - this.lastUpdateTime;
            this.lastUpdateTime = currentTimeMillis2;
            this.showProgress -= j2 / 120.0f;
            this.containerView.invalidate();
            if (this.showProgress < 0.0f) {
                this.showProgress = 0.0f;
            }
            if (this.showProgress == 0.0f) {
                this.centerImage.setImageBitmap((Drawable) null);
                AndroidUtilities.unlockOrientation(this.parentActivity);
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ContentPreviewViewer$$ExternalSyntheticLambda16
                    @Override // java.lang.Runnable
                    public final void run() {
                        ContentPreviewViewer.this.lambda$onDraw$14();
                    }
                });
                Bitmap bitmap = this.blurrBitmap;
                if (bitmap != null) {
                    bitmap.recycle();
                    this.blurrBitmap = null;
                }
                AndroidUtilities.updateViewVisibilityAnimated(this.unlockPremiumView, false, 1.0f, false);
                this.blurProgress = 0.0f;
                try {
                    if (this.windowView.getParent() != null) {
                        ((WindowManager) this.parentActivity.getSystemService("window")).removeView(this.windowView);
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onDraw$14() {
        this.centerImage.setImageBitmap((Bitmap) null);
        PaintingOverlay paintingOverlay = this.paintingOverlay;
        if (paintingOverlay != null) {
            paintingOverlay.reset();
            this.containerView.removeView(this.paintingOverlay);
            this.paintingOverlay = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getThemedColor(int i) {
        return Theme.getColor(i, this.resourcesProvider);
    }

    private void prepareBlurBitmap() {
        if (this.parentActivity == null || this.preparingBitmap) {
            return;
        }
        this.preparingBitmap = true;
        this.centerImage.setVisible(false, false);
        ScrimOptions.makeGlobalBlurBitmaps(new Utilities.Callback2() { // from class: org.telegram.ui.ContentPreviewViewer$$ExternalSyntheticLambda17
            @Override // org.telegram.messenger.Utilities.Callback2
            public final void run(Object obj, Object obj2) {
                ContentPreviewViewer.this.lambda$prepareBlurBitmap$15((Bitmap) obj, (Bitmap) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$prepareBlurBitmap$15(Bitmap bitmap, Bitmap bitmap2) {
        this.centerImage.setVisible(true, false);
        this.blurrBitmap = bitmap;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setScale(15.0f, 15.0f);
        bitmapShader.setLocalMatrix(matrix);
        if (Build.VERSION.SDK_INT >= 33) {
            bitmapShader.setFilterMode(2);
        }
        this.paint.setFilterBitmap(true);
        this.paint.setShader(bitmapShader);
        this.scrimBlur3SourceBitmap.setBitmap(bitmap2);
        Blur3Utils.checkBitmapSourceMatrixScale(this.scrimBlur3SourceBitmap, this.windowView);
        this.scrimBlur3Factory.invalidateAllLinkedViews();
        this.preparingBitmap = false;
        FrameLayoutDrawer frameLayoutDrawer = this.containerView;
        if (frameLayoutDrawer != null) {
            frameLayoutDrawer.invalidate();
        }
    }

    public boolean showMenuFor(View view) {
        if (!(view instanceof StickerEmojiCell)) {
            return false;
        }
        Activity findActivity = AndroidUtilities.findActivity(view.getContext());
        if (findActivity == null) {
            return true;
        }
        setParentActivity(findActivity);
        StickerEmojiCell stickerEmojiCell = (StickerEmojiCell) view;
        View view2 = this.currentPreviewCell;
        if (view2 instanceof StickerEmojiCell) {
            ((StickerEmojiCell) view2).setScaled(false);
        } else if (view2 instanceof StickerCell) {
            ((StickerCell) view2).setScaled(false);
        } else if (view2 instanceof ContextLinkCell) {
            ((ContextLinkCell) view2).setScaled(false);
        }
        this.currentPreviewCell = stickerEmojiCell;
        TLRPC.Document sticker = stickerEmojiCell.getSticker();
        SendMessagesHelper.ImportingSticker stickerPath = stickerEmojiCell.getStickerPath();
        String findAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(stickerEmojiCell.getSticker(), null, Integer.valueOf(this.currentAccount));
        ContentPreviewViewerDelegate contentPreviewViewerDelegate = this.delegate;
        open(sticker, stickerPath, findAnimatedEmojiEmoticon, contentPreviewViewerDelegate != null ? contentPreviewViewerDelegate.getQuery(false) : null, null, 0, stickerEmojiCell.isRecent(), stickerEmojiCell.getParentObject(), this.resourcesProvider);
        AndroidUtilities.cancelRunOnUIThread(this.showSheetRunnable);
        AndroidUtilities.runOnUIThread(this.showSheetRunnable, 16L);
        stickerEmojiCell.setScaled(true);
        return true;
    }

    public void showCustomStickerActions(String str, VideoEditedInfo videoEditedInfo, View view, ArrayList arrayList, ContentPreviewViewerDelegate contentPreviewViewerDelegate) {
        Activity findActivity = AndroidUtilities.findActivity(view.getContext());
        if (findActivity == null) {
            return;
        }
        setParentActivity(findActivity);
        setDelegate(contentPreviewViewerDelegate);
        SendMessagesHelper.ImportingSticker importingSticker = new SendMessagesHelper.ImportingSticker();
        importingSticker.path = str;
        importingSticker.videoEditedInfo = videoEditedInfo;
        this.selectedEmojis = arrayList;
        open(null, importingSticker, null, null, null, 3, false, null, new DarkThemeResourceProvider());
        AndroidUtilities.cancelRunOnUIThread(this.showSheetRunnable);
        AndroidUtilities.runOnUIThread(this.showSheetRunnable, 16L);
    }

    private void getMyStickersRemote(final TLRPC.TL_messages_getMyStickers tL_messages_getMyStickers, final List list) {
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getMyStickers, new RequestDelegate() { // from class: org.telegram.ui.ContentPreviewViewer$$ExternalSyntheticLambda10
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                ContentPreviewViewer.this.lambda$getMyStickersRemote$17(list, tL_messages_getMyStickers, tLObject, tL_error);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getMyStickersRemote$17(final List list, final TLRPC.TL_messages_getMyStickers tL_messages_getMyStickers, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ContentPreviewViewer$$ExternalSyntheticLambda12
            @Override // java.lang.Runnable
            public final void run() {
                ContentPreviewViewer.this.lambda$getMyStickersRemote$16(tL_error, tLObject, list, tL_messages_getMyStickers);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getMyStickersRemote$16(TLRPC.TL_error tL_error, TLObject tLObject, List list, TLRPC.TL_messages_getMyStickers tL_messages_getMyStickers) {
        if (tL_error == null && (tLObject instanceof TLRPC.TL_messages_myStickers)) {
            TLRPC.TL_messages_myStickers tL_messages_myStickers = (TLRPC.TL_messages_myStickers) tLObject;
            Iterator<TLRPC.StickerSetCovered> it = tL_messages_myStickers.sets.iterator();
            while (it.hasNext()) {
                TLRPC.StickerSetCovered next = it.next();
                TLRPC.StickerSet stickerSet = next.set;
                if (!stickerSet.emojis && !stickerSet.masks) {
                    TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                    tL_inputStickerSetID.id = next.set.id;
                    TLRPC.TL_messages_stickerSet stickerSet2 = MediaDataController.getInstance(this.currentAccount).getStickerSet((TLRPC.InputStickerSet) tL_inputStickerSetID, true);
                    if (stickerSet2 == null || stickerSet2.documents.size() < 120) {
                        list.add(next);
                    }
                }
            }
            if (tL_messages_myStickers.sets.size() == tL_messages_getMyStickers.limit) {
                ArrayList<TLRPC.StickerSetCovered> arrayList = tL_messages_myStickers.sets;
                tL_messages_getMyStickers.offset_id = arrayList.get(arrayList.size() - 1).set.id;
                getMyStickersRemote(tL_messages_getMyStickers, list);
            }
        }
    }

    public RecyclerListView createMyStickerPacksListView() {
        if (this.parentActivity == null) {
            return null;
        }
        final ArrayList arrayList = new ArrayList();
        arrayList.add(new TLRPC.TL_stickerSetNoCovered());
        TLRPC.TL_messages_getMyStickers tL_messages_getMyStickers = new TLRPC.TL_messages_getMyStickers();
        tL_messages_getMyStickers.limit = 100;
        getMyStickersRemote(tL_messages_getMyStickers, arrayList);
        RecyclerListView recyclerListView = new RecyclerListView(this.parentActivity) { // from class: org.telegram.ui.ContentPreviewViewer.5
            @Override // org.telegram.ui.Components.RecyclerListView, androidx.recyclerview.widget.RecyclerView, android.view.View
            protected void onMeasure(int i, int i2) {
                int size = View.MeasureSpec.getSize(i2);
                int dp = AndroidUtilities.dp(4.0f) + (AndroidUtilities.dp(50.0f) * getAdapter().getItemCount());
                if (dp <= size) {
                    size = dp;
                }
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30));
            }
        };
        recyclerListView.setLayoutManager(new LinearLayoutManager(this.parentActivity));
        recyclerListView.addItemDecoration(new RecyclerView.ItemDecoration() { // from class: org.telegram.ui.ContentPreviewViewer.6
            @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
            public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
                if (recyclerView.getChildAdapterPosition(view) == arrayList.size() - 1) {
                    rect.bottom = AndroidUtilities.dp(4.0f);
                }
            }
        });
        recyclerListView.setAdapter(new RecyclerListView.SelectionAdapter() { // from class: org.telegram.ui.ContentPreviewViewer.7
            @Override // org.telegram.ui.Components.RecyclerListView.SelectionAdapter
            public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
                return true;
            }

            @Override // androidx.recyclerview.widget.RecyclerView.Adapter
            public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
                StickerPackNameView stickerPackNameView = new StickerPackNameView(viewGroup.getContext(), ContentPreviewViewer.this.resourcesProvider);
                stickerPackNameView.setLayoutParams(new RecyclerView.LayoutParams(-2, AndroidUtilities.dp(48.0f)));
                return new RecyclerListView.Holder(stickerPackNameView);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.Adapter
            public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
                ((StickerPackNameView) viewHolder.itemView).bind((TLRPC.StickerSetCovered) arrayList.get(i));
            }

            @Override // androidx.recyclerview.widget.RecyclerView.Adapter
            public int getItemCount() {
                return arrayList.size();
            }
        });
        return recyclerListView;
    }

    private static class StickerPackNameView extends LinearLayout {
        private TLRPC.StickerSetCovered cover;
        private final BackupImageView imageView;
        private final Theme.ResourcesProvider resourcesProvider;
        private final SimpleTextView textView;

        public StickerPackNameView(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.resourcesProvider = resourcesProvider;
            BackupImageView backupImageView = new BackupImageView(context);
            this.imageView = backupImageView;
            SimpleTextView simpleTextView = new SimpleTextView(context);
            this.textView = simpleTextView;
            simpleTextView.setTextSize(16);
            simpleTextView.setTextColor(-1);
            setOrientation(0);
            addView(backupImageView, LayoutHelper.createLinear(24, 24, 17, 17, 0, 17, 0));
            addView(simpleTextView, LayoutHelper.createLinear(-2, -2, 17, 0, 0, 12, 0));
        }

        public TLRPC.StickerSetCovered getCover() {
            return this.cover;
        }

        public void bind(TLRPC.StickerSetCovered stickerSetCovered) {
            this.cover = stickerSetCovered;
            if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                this.textView.setText(LocaleController.getString(R.string.NewStickerPack));
                this.imageView.setImageResource(R.drawable.msg_addbot);
                return;
            }
            this.textView.setText(stickerSetCovered.set.title);
            TLRPC.Document document = stickerSetCovered.cover;
            if (document != null) {
                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(stickerSetCovered.cover, Theme.key_windowBackgroundGray, 1.0f, 1.0f, this.resourcesProvider);
                if (svgThumb == null) {
                    this.imageView.setImage(ImageLocation.getForDocument(closestPhotoSizeWithSize, stickerSetCovered.cover), (String) null, "webp", (Drawable) null, stickerSetCovered);
                    return;
                } else if (closestPhotoSizeWithSize != null) {
                    this.imageView.setImage(ImageLocation.getForDocument(closestPhotoSizeWithSize, stickerSetCovered.cover), (String) null, "webp", svgThumb, stickerSetCovered);
                    return;
                } else {
                    this.imageView.setImage(ImageLocation.getForDocument(stickerSetCovered.cover), (String) null, "webp", svgThumb, stickerSetCovered);
                    return;
                }
            }
            this.imageView.setImage((ImageLocation) null, (String) null, (ImageLocation) null, (String) null, (Drawable) null, (Object) 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dismissPopupWindow() {
        ActionBarPopupWindow actionBarPopupWindow = this.popupWindow;
        if (actionBarPopupWindow != null) {
            actionBarPopupWindow.dismiss();
            this.popupWindow = null;
            return;
        }
        View view = this.popupLayout;
        if (view != null) {
            view.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).translationY(AndroidUtilities.dp(-12.0f)).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).setDuration(320L).start();
            this.popupLayout = null;
            this.menuVisible = false;
            if (this.closeOnDismiss) {
                close();
            }
        }
    }
}
