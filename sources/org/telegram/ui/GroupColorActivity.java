package org.telegram.ui;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.util.Consumer;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC$ChatFull;
import org.telegram.tgnet.tl.TL_stories$TL_premium_boostsStatus;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ChannelColorActivity;
import org.telegram.ui.Components.CombinedDrawable;
import org.telegram.ui.Components.Premium.LimitReachedBottomSheet;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.GroupColorActivity;
/* loaded from: classes4.dex */
public class GroupColorActivity extends ChannelColorActivity {
    private boolean isLoading;
    private ChannelColorActivity.ProfilePreview profilePreview;
    private float profilePreviewPercent;

    @Override // org.telegram.ui.ChannelColorActivity
    protected int getMessagePreviewType() {
        return 4;
    }

    @Override // org.telegram.ui.ChannelColorActivity
    protected boolean needBoostInfoSection() {
        return true;
    }

    public GroupColorActivity(long j) {
        super(j);
        this.isGroup = true;
    }

    @Override // org.telegram.ui.ChannelColorActivity
    protected int getProfileIconLevelMin() {
        return getMessagesController().groupProfileBgIconLevelMin;
    }

    @Override // org.telegram.ui.ChannelColorActivity
    protected int getCustomWallpaperLevelMin() {
        return getMessagesController().groupCustomWallpaperLevelMin;
    }

    @Override // org.telegram.ui.ChannelColorActivity
    protected int getWallpaperLevelMin() {
        return getMessagesController().groupWallpaperLevelMin;
    }

    @Override // org.telegram.ui.ChannelColorActivity
    protected int getEmojiStatusLevelMin() {
        return getMessagesController().groupEmojiStatusLevelMin;
    }

    @Override // org.telegram.ui.ChannelColorActivity
    protected int getEmojiStickersLevelMin() {
        return getMessagesController().groupEmojiStickersLevelMin;
    }

    @Override // org.telegram.ui.ChannelColorActivity
    protected void updateRows() {
        ChannelColorActivity.Adapter adapter;
        ChannelColorActivity.Adapter adapter2;
        this.rowsCount = 0;
        int i = 0 + 1;
        this.rowsCount = i;
        this.profilePreviewRow = 0;
        int i2 = i + 1;
        this.rowsCount = i2;
        this.profileColorGridRow = i;
        int i3 = i2 + 1;
        this.rowsCount = i3;
        this.profileEmojiRow = i2;
        if (this.selectedProfileEmoji != 0 || this.selectedProfileColor >= 0) {
            boolean z = this.removeProfileColorRow >= 0;
            this.rowsCount = i3 + 1;
            this.removeProfileColorRow = i3;
            if (!z && (adapter = this.adapter) != null) {
                adapter.notifyItemInserted(i3);
                this.adapter.notifyItemChanged(this.profileEmojiRow);
                this.listView.scrollToPosition(0);
            }
        } else {
            int i4 = this.removeProfileColorRow;
            this.removeProfileColorRow = -1;
            if (i4 >= 0 && (adapter2 = this.adapter) != null) {
                adapter2.notifyItemRemoved(i4);
                this.adapter.notifyItemChanged(this.profileEmojiRow);
            }
        }
        int i5 = this.rowsCount;
        int i6 = i5 + 1;
        this.rowsCount = i6;
        this.profileHintRow = i5;
        int i7 = i6 + 1;
        this.rowsCount = i7;
        this.packEmojiRow = i6;
        int i8 = i7 + 1;
        this.rowsCount = i8;
        this.packEmojiHintRow = i7;
        int i9 = i8 + 1;
        this.rowsCount = i9;
        this.statusEmojiRow = i8;
        this.rowsCount = i9 + 1;
        this.statusHintRow = i9;
        TLRPC$ChatFull chatFull = getMessagesController().getChatFull(-this.dialogId);
        if (chatFull != null && chatFull.can_set_stickers) {
            int i10 = this.rowsCount;
            int i11 = i10 + 1;
            this.rowsCount = i11;
            this.packStickerRow = i10;
            this.rowsCount = i11 + 1;
            this.packStickerHintRow = i11;
        } else {
            this.packStickerRow = -1;
            this.packStickerHintRow = -1;
        }
        int i12 = this.rowsCount;
        int i13 = i12 + 1;
        this.rowsCount = i13;
        this.messagesPreviewRow = i12;
        int i14 = i13 + 1;
        this.rowsCount = i14;
        this.wallpaperThemesRow = i13;
        int i15 = i14 + 1;
        this.rowsCount = i15;
        this.wallpaperRow = i14;
        this.rowsCount = i15 + 1;
        this.wallpaperHintRow = i15;
    }

    @Override // org.telegram.ui.ChannelColorActivity
    public void updateButton(boolean z) {
        super.updateButton(z);
        ChannelColorActivity.ProfilePreview profilePreview = this.profilePreview;
        if (profilePreview != null) {
            TextView textView = profilePreview.textInfo1;
            TL_stories$TL_premium_boostsStatus tL_stories$TL_premium_boostsStatus = this.boostsStatus;
            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingGroupBoostCount", tL_stories$TL_premium_boostsStatus != null ? tL_stories$TL_premium_boostsStatus.boosts : 0, new Object[0])));
        }
    }

    @Override // org.telegram.ui.ChannelColorActivity
    protected int getEmojiPackStrRes() {
        return R.string.GroupEmojiPack;
    }

    @Override // org.telegram.ui.ChannelColorActivity
    protected int getEmojiPackInfoStrRes() {
        return R.string.GroupEmojiPackInfo;
    }

    @Override // org.telegram.ui.ChannelColorActivity
    protected int getStickerPackStrRes() {
        return R.string.GroupStickerPack;
    }

    @Override // org.telegram.ui.ChannelColorActivity
    protected int getStickerPackInfoStrRes() {
        return R.string.GroupStickerPackInfo;
    }

    @Override // org.telegram.ui.ChannelColorActivity
    protected int getProfileInfoStrRes() {
        return R.string.GroupProfileInfo;
    }

    @Override // org.telegram.ui.ChannelColorActivity
    protected int getEmojiStatusStrRes() {
        return R.string.GroupEmojiStatus;
    }

    @Override // org.telegram.ui.ChannelColorActivity
    protected int getEmojiStatusInfoStrRes() {
        return R.string.GroupEmojiStatusInfo;
    }

    @Override // org.telegram.ui.ChannelColorActivity
    protected int getWallpaperStrRes() {
        return R.string.GroupWallpaper;
    }

    @Override // org.telegram.ui.ChannelColorActivity
    protected int getWallpaper2InfoStrRes() {
        return R.string.GroupWallpaper2Info;
    }

    @Override // org.telegram.ui.ChannelColorActivity, org.telegram.ui.ActionBar.BaseFragment
    public View createView(Context context) {
        View createView = super.createView(context);
        updateColors();
        this.actionBar.setAddToContainer(false);
        this.actionBar.setTitle("");
        ((ViewGroup) createView).addView(this.actionBar);
        createView.getViewTreeObserver().addOnGlobalLayoutListener(new 1(createView));
        return createView;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class 1 implements ViewTreeObserver.OnGlobalLayoutListener {
        final /* synthetic */ View val$view;

        1(View view) {
            this.val$view = view;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            this.val$view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            GroupColorActivity.this.initProfilePreview();
            GroupColorActivity.this.profilePreview.infoLayout.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.GroupColorActivity$1$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    GroupColorActivity.1.this.lambda$onGlobalLayout$0(view);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onGlobalLayout$0(View view) {
            GroupColorActivity.this.openBoostDialog(19);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void initProfilePreview() {
        if (this.profilePreview == null) {
            this.profilePreview = (ChannelColorActivity.ProfilePreview) findChildAt(this.profilePreviewRow);
        }
    }

    @Override // org.telegram.ui.ChannelColorActivity
    protected void createListView() {
        RecyclerListView recyclerListView = new RecyclerListView(getContext(), this.resourceProvider) { // from class: org.telegram.ui.GroupColorActivity.2
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // org.telegram.ui.Components.RecyclerListView, android.view.ViewGroup, android.view.View
            public void dispatchDraw(Canvas canvas) {
                super.dispatchDraw(canvas);
                if (GroupColorActivity.this.profilePreview == null || GroupColorActivity.this.profilePreviewPercent < 1.0f) {
                    return;
                }
                canvas.save();
                canvas.translate(0.0f, -(GroupColorActivity.this.profilePreview.getMeasuredHeight() - ((BaseFragment) GroupColorActivity.this).actionBar.getMeasuredHeight()));
                GroupColorActivity.this.profilePreview.draw(canvas);
                canvas.restore();
            }
        };
        this.listView = recyclerListView;
        recyclerListView.setOnScrollListener(new RecyclerView.OnScrollListener() { // from class: org.telegram.ui.GroupColorActivity.3
            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                GroupColorActivity.this.initProfilePreview();
                int measuredHeight = GroupColorActivity.this.profilePreview.getMeasuredHeight() - ((BaseFragment) GroupColorActivity.this).actionBar.getMeasuredHeight();
                float top = GroupColorActivity.this.profilePreview.getTop() * (-1);
                float f = measuredHeight;
                GroupColorActivity.this.profilePreviewPercent = Math.max(Math.min(1.0f, top / f), 0.0f);
                float min = Math.min(GroupColorActivity.this.profilePreviewPercent * 2.0f, 1.0f);
                float min2 = Math.min(Math.max(GroupColorActivity.this.profilePreviewPercent - 0.45f, 0.0f) * 2.0f, 1.0f);
                GroupColorActivity.this.profilePreview.profileView.setAlpha(AndroidUtilities.lerp(1.0f, 0.0f, min));
                GroupColorActivity.this.profilePreview.infoLayout.setAlpha(AndroidUtilities.lerp(1.0f, 0.0f, min));
                GroupColorActivity.this.profilePreview.title.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, min2));
                if (GroupColorActivity.this.profilePreviewPercent >= 1.0f) {
                    GroupColorActivity.this.profilePreview.setTranslationY(top - f);
                } else {
                    GroupColorActivity.this.profilePreview.setTranslationY(0.0f);
                }
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                View findViewByPosition;
                super.onScrollStateChanged(recyclerView, i);
                if (i == 0) {
                    if (GroupColorActivity.this.profilePreviewPercent < 0.5f || GroupColorActivity.this.profilePreviewPercent >= 1.0f) {
                        if (GroupColorActivity.this.profilePreviewPercent < 0.5f) {
                            View findViewByPosition2 = GroupColorActivity.this.listView.getLayoutManager() != null ? GroupColorActivity.this.listView.getLayoutManager().findViewByPosition(0) : null;
                            if (findViewByPosition2 == null || findViewByPosition2.getTop() >= 0) {
                                return;
                            }
                            GroupColorActivity.this.listView.smoothScrollBy(0, findViewByPosition2.getTop());
                            return;
                        }
                        return;
                    }
                    int bottom = ((BaseFragment) GroupColorActivity.this).actionBar.getBottom();
                    RecyclerView.LayoutManager layoutManager = GroupColorActivity.this.listView.getLayoutManager();
                    if (layoutManager == null || (findViewByPosition = layoutManager.findViewByPosition(0)) == null) {
                        return;
                    }
                    GroupColorActivity.this.listView.smoothScrollBy(0, findViewByPosition.getBottom() - bottom);
                }
            }
        });
    }

    @Override // org.telegram.ui.ChannelColorActivity
    protected void openBoostDialog(final int i) {
        if (this.boostsStatus == null || this.isLoading) {
            return;
        }
        this.isLoading = true;
        MessagesController.getInstance(this.currentAccount).getBoostsController().userCanBoostChannel(this.dialogId, this.boostsStatus, new Consumer() { // from class: org.telegram.ui.GroupColorActivity$$ExternalSyntheticLambda0
            @Override // com.google.android.exoplayer2.util.Consumer
            public final void accept(Object obj) {
                GroupColorActivity.this.lambda$openBoostDialog$0(i, (ChannelBoostsController.CanApplyBoost) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$openBoostDialog$0(int i, ChannelBoostsController.CanApplyBoost canApplyBoost) {
        if (canApplyBoost == null || getContext() == null) {
            this.isLoading = false;
            return;
        }
        LimitReachedBottomSheet limitReachedBottomSheet = new LimitReachedBottomSheet(this, getContext(), i, this.currentAccount, this.resourceProvider) { // from class: org.telegram.ui.GroupColorActivity.4
            @Override // org.telegram.ui.ActionBar.BottomSheet
            public void onOpenAnimationEnd() {
                GroupColorActivity.this.isLoading = false;
            }

            @Override // org.telegram.ui.ActionBar.BottomSheet, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.BaseFragment.AttachedSheet
            public void dismiss() {
                super.dismiss();
                GroupColorActivity.this.isLoading = false;
            }
        };
        limitReachedBottomSheet.setCanApplyBoost(canApplyBoost);
        limitReachedBottomSheet.setBoostsStats(this.boostsStatus, true);
        limitReachedBottomSheet.setDialogId(this.dialogId);
        limitReachedBottomSheet.show();
    }

    @Override // org.telegram.ui.ChannelColorActivity
    public void updateColors() {
        super.updateColors();
        this.actionBar.setBackgroundColor(0);
        CombinedDrawable combinedDrawable = new CombinedDrawable(new ColorDrawable(Theme.getColor(Theme.key_windowBackgroundWhite, this.resourceProvider)), Theme.getThemedDrawableByKey(getContext(), R.drawable.greydivider_bottom, Theme.key_windowBackgroundGrayShadow), 0, 0);
        combinedDrawable.setFullsize(true);
        this.buttonContainer.setBackground(combinedDrawable);
        ChannelColorActivity.ProfilePreview profilePreview = this.profilePreview;
        if (profilePreview != null) {
            profilePreview.backgroundView.setColor(this.currentAccount, this.selectedProfileColor, false);
            this.profilePreview.profileView.setColor(this.selectedProfileColor, false);
        }
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ChannelColorActivity.ProfilePreview profilePreview = this.profilePreview;
        if (profilePreview != null) {
            profilePreview.setTitleSize();
        }
    }

    @Override // org.telegram.ui.ChannelColorActivity, org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        super.didReceivedNotification(i, i2, objArr);
        if (i == NotificationCenter.chatInfoDidLoad && ((TLRPC$ChatFull) objArr[0]).id == (-this.dialogId)) {
            updateProfilePreview(true);
        }
    }

    @Override // org.telegram.ui.ChannelColorActivity, org.telegram.ui.ActionBar.BaseFragment
    public boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatInfoDidLoad);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ChannelColorActivity, org.telegram.ui.ActionBar.BaseFragment
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatInfoDidLoad);
    }

    @Override // org.telegram.ui.ChannelColorActivity
    protected boolean isForum() {
        return ChatObject.isForum(getMessagesController().getChat(Long.valueOf(-this.dialogId)));
    }
}
