package fh;

import android.content.Context;
import android.util.LongSparseArray;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.vk0;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.z41;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class f extends sa implements GiftAuctionController.OnActiveAuctionsUpdateListeners {
    public final l41 T;
    public final LongSparseArray U;
    public ArrayList V;
    public boolean W;
    public z41 X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Context context) {
        super(context, null, false, false, false, false, false, 2, null);
        int i9 = 0;
        this.U = new LongSparseArray();
        this.V = new ArrayList();
        setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.a7, false));
        GiftAuctionController.getInstance(this.currentAccount).subscribeToActiveAuctionsUpdates(this);
        this.H = false;
        this.G = AndroidUtilities.dp(12.0f);
        fixNavigationBar();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setClickable(true);
        this.T = l41.j(-1, linearLayout);
        this.d.setPadding(this.backgroundPaddingLeft, AndroidUtilities.dp(9.0f), this.backgroundPaddingLeft, AndroidUtilities.dp(9.0f));
        this.d.setOverScrollMode(2);
        this.X.N(false);
        ArrayList<GiftAuctionController.Auction> activeAuctions = GiftAuctionController.getInstance(this.currentAccount).getActiveAuctions();
        int size = activeAuctions.size();
        while (i9 < size) {
            GiftAuctionController.Auction auction = activeAuctions.get(i9);
            i9++;
            GiftAuctionController.Auction auction2 = auction;
            e eVar = new e(context, auction2);
            eVar.a.setOnClickListener(new fg.f(this, context, auction2, 1));
            linearLayout.addView(eVar, g7.e6.n(-1, -2));
            this.U.put(auction2.giftId, eVar);
        }
        onActiveAuctionsUpdate(activeAuctions);
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.k2
    public final void dismiss() {
        GiftAuctionController.getInstance(this.currentAccount).unsubscribeFromActiveAuctionsUpdates(this);
        super.dismiss();
    }

    @Override // org.telegram.messenger.GiftAuctionController.OnActiveAuctionsUpdateListeners
    public final void onActiveAuctionsUpdate(List list) {
        this.V = new ArrayList(list);
        this.e.setTitle(y());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            GiftAuctionController.Auction auction = (GiftAuctionController.Auction) it.next();
            TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = auction.auctionStateActive;
            int i9 = tL_starGiftAuctionState != null ? tL_starGiftAuctionState.next_round_at : 0;
            e eVar = (e) this.U.get(auction.giftId);
            if (eVar != null) {
                eVar.b(this.W);
                long max = Math.max(0, i9 - ConnectionsManager.getInstance(this.currentAccount).getCurrentTime());
                eVar.a(max, this.W);
                eVar.f.a(max);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final void onOpenAnimationEnd() {
        super.onOpenAnimationEnd();
        this.W = true;
    }

    @Override // org.telegram.ui.Components.sa
    public final vk0 v(wk0 wk0Var) {
        z41 z41Var = new z41(this.d, getContext(), this.currentAccount, 0, true, new bh.c(this, 4), this.resourcesProvider);
        this.X = z41Var;
        z41Var.r = false;
        return z41Var;
    }

    @Override // org.telegram.ui.Components.sa
    public final CharSequence y() {
        ArrayList arrayList = this.V;
        if (arrayList == null) {
            return null;
        }
        return LocaleController.formatString(R.string.Gift2ActiveAuctionsActiveAuctionsTitle, Integer.valueOf(arrayList.size()));
    }
}
