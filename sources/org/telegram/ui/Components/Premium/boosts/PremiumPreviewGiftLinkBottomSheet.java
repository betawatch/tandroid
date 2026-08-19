package org.telegram.ui.Components.Premium.boosts;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Premium.GiftPremiumBottomSheet$GiftTier;
import org.telegram.ui.Components.Premium.PremiumPreviewBottomSheet;
import org.telegram.ui.Components.Premium.boosts.cells.ActionBtnCell;
import org.telegram.ui.Components.Premium.boosts.cells.LinkCell;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.DialogsActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TopicsFragment;

/* loaded from: classes5.dex */
public class PremiumPreviewGiftLinkBottomSheet extends PremiumPreviewBottomSheet {
    private static PremiumPreviewGiftLinkBottomSheet instance;
    private ActionBtnCell actionBtn;
    private final boolean isUsed;
    private final String slug;

    @Override // org.telegram.ui.Components.Premium.PremiumPreviewBottomSheet
    protected int getAdditionItemViewType(int i) {
        return 6;
    }

    public static void show(String str, Browser.Progress progress) {
        GiftInfoBottomSheet.show(LaunchActivity.getLastFragment(), str, progress);
    }

    public static void show(String str, TLRPC.TL_premiumGiftOption tL_premiumGiftOption, TLRPC.User user, boolean z) {
        BaseFragment lastFragment = LaunchActivity.getLastFragment();
        if (lastFragment == null || instance != null) {
            return;
        }
        PremiumPreviewGiftLinkBottomSheet premiumPreviewGiftLinkBottomSheet = new PremiumPreviewGiftLinkBottomSheet(lastFragment, UserConfig.selectedAccount, user, new GiftPremiumBottomSheet$GiftTier(tL_premiumGiftOption, (Object) null), str, z, lastFragment.getResourceProvider());
        premiumPreviewGiftLinkBottomSheet.show();
        instance = premiumPreviewGiftLinkBottomSheet;
    }

    public PremiumPreviewGiftLinkBottomSheet(BaseFragment baseFragment, int i, TLRPC.User user, GiftPremiumBottomSheet$GiftTier giftPremiumBottomSheet$GiftTier, String str, boolean z, Theme.ResourcesProvider resourcesProvider) {
        super(baseFragment, i, user, giftPremiumBottomSheet$GiftTier, null, resourcesProvider);
        this.slug = str;
        this.isUsed = z;
        init();
    }

    @Override // org.telegram.ui.Components.Premium.PremiumPreviewBottomSheet
    protected void updateRows() {
        int i = this.rowCount;
        this.paddingRow = i;
        this.additionStartRow = i + 1;
        int i2 = i + 2;
        this.rowCount = i2;
        this.additionEndRow = i2;
        this.featuresStartRow = i2;
        int size = i2 + this.premiumFeatures.size();
        this.featuresEndRow = size;
        this.rowCount = size + 1;
        this.sectionRow = size;
    }

    @Override // org.telegram.ui.Components.Premium.PremiumPreviewBottomSheet
    public void setTitle(boolean z) {
        super.setTitle(z);
        this.subtitleView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        ((ViewGroup.MarginLayoutParams) this.subtitleView.getLayoutParams()).bottomMargin = AndroidUtilities.dp(14.0f);
        ((ViewGroup.MarginLayoutParams) this.subtitleView.getLayoutParams()).topMargin = AndroidUtilities.dp(12.0f);
        this.subtitleView.setText(AndroidUtilities.replaceCharSequence("%1$s", AndroidUtilities.replaceSingleTag(LocaleController.getString("GiftPremiumAboutThisLink", R.string.GiftPremiumAboutThisLink), Theme.key_chat_messageLinkIn, 0, new PremiumPreviewGiftLinkBottomSheet$$ExternalSyntheticLambda1(this)), AndroidUtilities.replaceTags(LocaleController.getString("GiftPremiumAboutThisLinkEnd", R.string.GiftPremiumAboutThisLinkEnd))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void share() {
        final String str = "https://t.me/giftcode/" + this.slug;
        Bundle bundle = new Bundle();
        bundle.putBoolean("onlySelect", true);
        bundle.putInt("dialogsType", 3);
        DialogsActivity dialogsActivity = new DialogsActivity(bundle);
        dialogsActivity.setDelegate(new DialogsActivity.DialogsActivityDelegate() { // from class: org.telegram.ui.Components.Premium.boosts.PremiumPreviewGiftLinkBottomSheet$$ExternalSyntheticLambda2
            @Override // org.telegram.ui.DialogsActivity.DialogsActivityDelegate
            public /* synthetic */ boolean canSelectStories() {
                return DialogsActivity.DialogsActivityDelegate.-CC.$default$canSelectStories(this);
            }

            @Override // org.telegram.ui.DialogsActivity.DialogsActivityDelegate
            public final boolean didSelectDialogs(DialogsActivity dialogsActivity2, ArrayList arrayList, CharSequence charSequence, boolean z, boolean z2, int i, int i2, TopicsFragment topicsFragment) {
                return PremiumPreviewGiftLinkBottomSheet.$r8$lambda$UgaBuxxFI61SF-p4i0M18dgpa9U(PremiumPreviewGiftLinkBottomSheet.this, str, dialogsActivity2, arrayList, charSequence, z, z2, i, i2, topicsFragment);
            }

            @Override // org.telegram.ui.DialogsActivity.DialogsActivityDelegate
            public /* synthetic */ boolean didSelectStories(DialogsActivity dialogsActivity2) {
                return DialogsActivity.DialogsActivityDelegate.-CC.$default$didSelectStories(this, dialogsActivity2);
            }
        });
        getBaseFragment().presentFragment(dialogsActivity);
        dismiss();
    }

    public static /* synthetic */ boolean $r8$lambda$UgaBuxxFI61SF-p4i0M18dgpa9U(PremiumPreviewGiftLinkBottomSheet premiumPreviewGiftLinkBottomSheet, String str, DialogsActivity dialogsActivity, ArrayList arrayList, CharSequence charSequence, boolean z, boolean z2, int i, int i2, TopicsFragment topicsFragment) {
        premiumPreviewGiftLinkBottomSheet.getClass();
        long j = 0;
        int i3 = 0;
        while (i3 < arrayList.size()) {
            long j2 = ((MessagesStorage.TopicKey) arrayList.get(i3)).dialogId;
            premiumPreviewGiftLinkBottomSheet.getBaseFragment().getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of(str, j2, null, null, null, true, null, null, null, true, 0, 0, null, false));
            i3++;
            j = j2;
        }
        dialogsActivity.finishFragment();
        BoostDialogs.showGiftLinkForwardedBulletin(j);
        return true;
    }

    @Override // org.telegram.ui.Components.Premium.PremiumPreviewBottomSheet
    protected View onCreateAdditionCell(int i, Context context) {
        if (i != 6) {
            return null;
        }
        LinkCell linkCell = new LinkCell(context, getBaseFragment(), this.resourcesProvider);
        linkCell.setPadding(0, 0, 0, AndroidUtilities.dp(8.0f));
        return linkCell;
    }

    @Override // org.telegram.ui.Components.Premium.PremiumPreviewBottomSheet
    protected void onBindAdditionCell(View view, int i) {
        ((LinkCell) view).setSlug(this.slug);
    }

    private void init() {
        Bulletin.addDelegate((FrameLayout) this.containerView, new Bulletin.Delegate() { // from class: org.telegram.ui.Components.Premium.boosts.PremiumPreviewGiftLinkBottomSheet.1
            @Override // org.telegram.ui.Components.Bulletin.Delegate
            public /* synthetic */ boolean allowLayoutChanges() {
                return Bulletin.Delegate.-CC.$default$allowLayoutChanges(this);
            }

            @Override // org.telegram.ui.Components.Bulletin.Delegate
            public /* synthetic */ boolean bottomOffsetAnimated() {
                return Bulletin.Delegate.-CC.$default$bottomOffsetAnimated(this);
            }

            @Override // org.telegram.ui.Components.Bulletin.Delegate
            public /* synthetic */ boolean clipWithGradient(int i) {
                return Bulletin.Delegate.-CC.$default$clipWithGradient(this, i);
            }

            @Override // org.telegram.ui.Components.Bulletin.Delegate
            public /* synthetic */ int getTopOffset(int i) {
                return Bulletin.Delegate.-CC.$default$getTopOffset(this, i);
            }

            @Override // org.telegram.ui.Components.Bulletin.Delegate
            public /* synthetic */ void onBottomOffsetChange(float f) {
                Bulletin.Delegate.-CC.$default$onBottomOffsetChange(this, f);
            }

            @Override // org.telegram.ui.Components.Bulletin.Delegate
            public /* synthetic */ void onHide(Bulletin bulletin) {
                Bulletin.Delegate.-CC.$default$onHide(this, bulletin);
            }

            @Override // org.telegram.ui.Components.Bulletin.Delegate
            public /* synthetic */ void onShow(Bulletin bulletin) {
                Bulletin.Delegate.-CC.$default$onShow(this, bulletin);
            }

            @Override // org.telegram.ui.Components.Bulletin.Delegate
            public int getBottomOffset(int i) {
                return AndroidUtilities.dp(68.0f);
            }
        });
        if (!this.isUsed) {
            RecyclerListView recyclerListView = this.recyclerListView;
            int i = this.backgroundPaddingLeft;
            recyclerListView.setPadding(i, 0, i, AndroidUtilities.dp(68.0f));
            ActionBtnCell actionBtnCell = new ActionBtnCell(getContext(), this.resourcesProvider);
            this.actionBtn = actionBtnCell;
            actionBtnCell.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.Premium.boosts.PremiumPreviewGiftLinkBottomSheet$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PremiumPreviewGiftLinkBottomSheet.$r8$lambda$VSSJRo0515LG5qg5d14pBrjBw7M(PremiumPreviewGiftLinkBottomSheet.this, view);
                }
            });
            this.actionBtn.setActivateForFreeStyle();
            this.containerView.addView(this.actionBtn, LayoutHelper.createFrame(-1, 68.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        fixNavigationBar();
    }

    public static /* synthetic */ void $r8$lambda$VSSJRo0515LG5qg5d14pBrjBw7M(final PremiumPreviewGiftLinkBottomSheet premiumPreviewGiftLinkBottomSheet, View view) {
        if (premiumPreviewGiftLinkBottomSheet.actionBtn.isLoading()) {
            return;
        }
        premiumPreviewGiftLinkBottomSheet.actionBtn.updateLoading(true);
        BoostRepository.applyGiftCode(premiumPreviewGiftLinkBottomSheet.slug, new Utilities.Callback() { // from class: org.telegram.ui.Components.Premium.boosts.PremiumPreviewGiftLinkBottomSheet$$ExternalSyntheticLambda3
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                PremiumPreviewGiftLinkBottomSheet.$r8$lambda$0lHm0L-XGIfmCZ2Bq_tiwdKDl0M(PremiumPreviewGiftLinkBottomSheet.this, (Void) obj);
            }
        }, new Utilities.Callback() { // from class: org.telegram.ui.Components.Premium.boosts.PremiumPreviewGiftLinkBottomSheet$$ExternalSyntheticLambda4
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                PremiumPreviewGiftLinkBottomSheet.$r8$lambda$4wfg7nV2s96dYviKwKmtfKrXuuU(PremiumPreviewGiftLinkBottomSheet.this, (TLRPC.TL_error) obj);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$0lHm0L-XGIfmCZ2Bq_tiwdKDl0M(final PremiumPreviewGiftLinkBottomSheet premiumPreviewGiftLinkBottomSheet, Void r3) {
        premiumPreviewGiftLinkBottomSheet.actionBtn.updateLoading(false);
        premiumPreviewGiftLinkBottomSheet.dismiss();
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Components.Premium.boosts.PremiumPreviewGiftLinkBottomSheet$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                r0.getBaseFragment().showDialog(new PremiumPreviewBottomSheet(r0.getBaseFragment(), UserConfig.selectedAccount, null, null, null, PremiumPreviewGiftLinkBottomSheet.this.resourcesProvider).setAnimateConfetti(true).setAnimateConfettiWithStars(true).setOutboundGift(true));
            }
        }, 200L);
    }

    public static /* synthetic */ void $r8$lambda$4wfg7nV2s96dYviKwKmtfKrXuuU(PremiumPreviewGiftLinkBottomSheet premiumPreviewGiftLinkBottomSheet, TLRPC.TL_error tL_error) {
        premiumPreviewGiftLinkBottomSheet.actionBtn.updateLoading(false);
        BoostDialogs.processApplyGiftCodeError(tL_error, (FrameLayout) premiumPreviewGiftLinkBottomSheet.containerView, premiumPreviewGiftLinkBottomSheet.resourcesProvider, new PremiumPreviewGiftLinkBottomSheet$$ExternalSyntheticLambda1(premiumPreviewGiftLinkBottomSheet));
    }

    @Override // org.telegram.ui.ActionBar.BottomSheet
    public void dismissInternal() {
        super.dismissInternal();
        instance = null;
    }
}
