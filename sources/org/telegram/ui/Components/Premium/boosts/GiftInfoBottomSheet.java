package org.telegram.ui.Components.Premium.boosts;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.FrameLayout;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.BottomSheetWithRecyclerListView;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.Premium.PremiumPreviewBottomSheet;
import org.telegram.ui.Components.Premium.boosts.GiftInfoBottomSheet;
import org.telegram.ui.Components.Premium.boosts.adapters.GiftInfoAdapter;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.LaunchActivity;

/* loaded from: classes3.dex */
public class GiftInfoBottomSheet extends BottomSheetWithRecyclerListView {
    private GiftInfoAdapter adapter;
    private final TLRPC.TL_payments_checkedGiftCode giftCode;
    private final boolean isUnused;
    private String slug;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class 2 extends GiftInfoAdapter {
        2(Theme.ResourcesProvider resourcesProvider) {
            super(resourcesProvider);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$afterCodeApplied$0() {
            GiftInfoBottomSheet.this.getBaseFragment().showDialog(new PremiumPreviewBottomSheet(GiftInfoBottomSheet.this.getBaseFragment(), ((BottomSheet) GiftInfoBottomSheet.this).currentAccount, null, null, ((BottomSheet) GiftInfoBottomSheet.this).resourcesProvider).setAnimateConfetti(true).setOutboundGift(true));
        }

        @Override // org.telegram.ui.Components.Premium.boosts.adapters.GiftInfoAdapter
        protected void afterCodeApplied() {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Components.Premium.boosts.GiftInfoBottomSheet$2$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    GiftInfoBottomSheet.2.this.lambda$afterCodeApplied$0();
                }
            }, 200L);
        }

        @Override // org.telegram.ui.Components.Premium.boosts.adapters.GiftInfoAdapter
        protected void dismiss() {
            GiftInfoBottomSheet.this.dismiss();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.telegram.ui.Components.Premium.boosts.adapters.GiftInfoAdapter
        public void onHiddenLinkClicked() {
            String string = LocaleController.getString(((GiftInfoBottomSheet.this.slug == null || GiftInfoBottomSheet.this.slug.isEmpty()) && GiftInfoBottomSheet.this.giftCode.to_id == -1) ? R.string.BoostingOnlyGiveawayCreatorSeeLink : R.string.BoostingOnlyRecipientCode);
            GiftInfoBottomSheet giftInfoBottomSheet = GiftInfoBottomSheet.this;
            BulletinFactory.of(giftInfoBottomSheet.container, ((BottomSheet) giftInfoBottomSheet).resourcesProvider).createSimpleBulletin(R.raw.chats_infotip, string).show(true);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.telegram.ui.Components.Premium.boosts.adapters.GiftInfoAdapter
        public void onObjectClicked(TLObject tLObject) {
            BaseFragment baseFragment;
            long j;
            dismiss();
            if (tLObject instanceof TLRPC.Chat) {
                baseFragment = GiftInfoBottomSheet.this.getBaseFragment();
                j = -((TLRPC.Chat) tLObject).id;
            } else {
                if (!(tLObject instanceof TLRPC.User)) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", -DialogObject.getPeerDialogId(GiftInfoBottomSheet.this.giftCode.from_id));
                    bundle.putInt("message_id", GiftInfoBottomSheet.this.giftCode.giveaway_msg_id);
                    GiftInfoBottomSheet.this.getBaseFragment().presentFragment(new ChatActivity(bundle));
                    return;
                }
                baseFragment = GiftInfoBottomSheet.this.getBaseFragment();
                j = ((TLRPC.User) tLObject).id;
            }
            baseFragment.presentFragment(ChatActivity.of(j));
        }
    }

    public GiftInfoBottomSheet(BaseFragment baseFragment, boolean z, boolean z2, TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode, String str) {
        super(baseFragment, z, z2);
        this.isUnused = tL_payments_checkedGiftCode.used_date == 0;
        this.giftCode = tL_payments_checkedGiftCode;
        this.slug = str;
        setApplyTopPadding(false);
        setApplyBottomPadding(false);
        fixNavigationBar();
        updateTitle();
        this.adapter.init(baseFragment, tL_payments_checkedGiftCode, str, this.container);
    }

    public static boolean handleIntent(Intent intent, Browser.Progress progress) {
        String scheme;
        String path;
        String lastPathSegment;
        Uri data = intent.getData();
        if (data == null || (scheme = data.getScheme()) == null) {
            return false;
        }
        if (scheme.equals("http") || scheme.equals("https")) {
            String lowerCase = data.getHost().toLowerCase();
            if ((!lowerCase.equals("telegram.me") && !lowerCase.equals("t.me") && !lowerCase.equals("telegram.dog")) || (path = data.getPath()) == null) {
                return false;
            }
            lastPathSegment = data.getLastPathSegment();
            if (!path.startsWith("/giftcode") || lastPathSegment == null) {
                return false;
            }
        } else {
            if (!scheme.equals("tg")) {
                return false;
            }
            String uri = data.toString();
            lastPathSegment = data.getLastPathSegment();
            if ((!uri.startsWith("tg:giftcode") && !uri.startsWith("tg://giftcode")) || lastPathSegment == null) {
                return false;
            }
        }
        show(LaunchActivity.getLastFragment(), lastPathSegment, progress);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$show$1(AtomicBoolean atomicBoolean, BaseFragment baseFragment, String str, Browser.Progress progress, TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode) {
        if (atomicBoolean.get() || baseFragment.getParentActivity() == null) {
            return;
        }
        if (tL_payments_checkedGiftCode.from_id == null) {
            TLRPC.TL_premiumGiftOption tL_premiumGiftOption = new TLRPC.TL_premiumGiftOption();
            tL_premiumGiftOption.months = tL_payments_checkedGiftCode.months;
            TLRPC.User currentUser = baseFragment instanceof ChatActivity ? ((ChatActivity) baseFragment).getCurrentUser() : null;
            if (currentUser == null || currentUser.self) {
                currentUser = new TLRPC.TL_user();
            }
            PremiumPreviewGiftLinkBottomSheet.show(str, tL_premiumGiftOption, currentUser, tL_payments_checkedGiftCode.used_date != 0);
        } else {
            baseFragment.showDialog(new GiftInfoBottomSheet(baseFragment, false, true, tL_payments_checkedGiftCode, str));
        }
        if (progress != null) {
            progress.end();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$show$2(AtomicBoolean atomicBoolean, Browser.Progress progress, TLRPC.TL_error tL_error) {
        if (atomicBoolean.get() || progress == null) {
            return;
        }
        progress.end();
    }

    public static void show(BaseFragment baseFragment, String str) {
        show(baseFragment, str, null);
    }

    public static void show(final BaseFragment baseFragment, final String str, final Browser.Progress progress) {
        if (baseFragment == null) {
            return;
        }
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        if (progress != null) {
            progress.init();
            progress.onCancel(new Runnable() { // from class: org.telegram.ui.Components.Premium.boosts.GiftInfoBottomSheet$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    atomicBoolean.set(true);
                }
            });
        }
        BoostRepository.checkGiftCode(str, new Utilities.Callback() { // from class: org.telegram.ui.Components.Premium.boosts.GiftInfoBottomSheet$$ExternalSyntheticLambda1
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                GiftInfoBottomSheet.lambda$show$1(atomicBoolean, baseFragment, str, progress, (TLRPC.TL_payments_checkedGiftCode) obj);
            }
        }, new Utilities.Callback() { // from class: org.telegram.ui.Components.Premium.boosts.GiftInfoBottomSheet$$ExternalSyntheticLambda2
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                GiftInfoBottomSheet.lambda$show$2(atomicBoolean, progress, (TLRPC.TL_error) obj);
            }
        });
    }

    @Override // org.telegram.ui.Components.BottomSheetWithRecyclerListView
    protected RecyclerListView.SelectionAdapter createAdapter(RecyclerListView recyclerListView) {
        2 r2 = new 2(this.resourcesProvider);
        this.adapter = r2;
        return r2;
    }

    @Override // org.telegram.ui.Components.BottomSheetWithRecyclerListView
    protected CharSequence getTitle() {
        return LocaleController.getString(this.isUnused ? R.string.BoostingGiftLink : R.string.BoostingUsedGiftLink);
    }

    @Override // org.telegram.ui.Components.BottomSheetWithRecyclerListView
    public void onViewCreated(FrameLayout frameLayout) {
        super.onViewCreated(frameLayout);
        Bulletin.addDelegate(this.container, new Bulletin.Delegate() { // from class: org.telegram.ui.Components.Premium.boosts.GiftInfoBottomSheet.1
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
            public /* synthetic */ int getBottomOffset(int i) {
                return Bulletin.Delegate.-CC.$default$getBottomOffset(this, i);
            }

            @Override // org.telegram.ui.Components.Bulletin.Delegate
            public int getTopOffset(int i) {
                return AndroidUtilities.statusBarHeight;
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
        });
    }
}
