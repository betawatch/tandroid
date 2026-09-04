package org.telegram.ui.Cells;

import android.app.Activity;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class m extends FrameLayout implements GiftAuctionController.OnActiveAuctionsUpdateListeners {
    public final int a;
    public final org.telegram.ui.Components.q6 b;
    public final org.telegram.ui.Components.q6 c;
    public final l d;
    public ArrayList e;
    public boolean f;

    public m(Activity activity, int i10) {
        super(activity);
        this.e = new ArrayList();
        this.a = i10;
        LinearLayout f7 = org.telegram.messenger.w1.f(activity, 1);
        org.telegram.ui.Components.q6 q6Var = new org.telegram.ui.Components.q6(activity, false, false, false);
        this.b = q6Var;
        q6Var.setTextSize(AndroidUtilities.dp(14.0f));
        q6Var.setTypeface(AndroidUtilities.bold());
        q6Var.setTranslationY(-AndroidUtilities.dp(1.0f));
        f7.addView(q6Var, w7.x5.n(-1, 18));
        org.telegram.ui.Components.q6 q6Var2 = new org.telegram.ui.Components.q6(activity, false, false, false);
        this.c = q6Var2;
        q6Var2.setTextSize(AndroidUtilities.dp(13.0f));
        f7.addView(q6Var2, w7.x5.k(2.0f, 0.0f, 2.0f, 0.0f, -1, 17));
        l lVar = new l(activity, i10);
        this.d = lVar;
        lVar.b(299L);
        addView(f7, w7.x5.d(-1, -2.0f, 16, 14.0f, 0.0f, 90.0f, 0.0f));
        addView(lVar, w7.x5.d(-2, -2.0f, 21, 0.0f, 0.0f, 11.0f, 0.0f));
        a();
        setOnClickListener(new a(this, 1));
    }

    public final void a() {
        setBackground(org.telegram.ui.ActionBar.j6.K0(false));
        this.b.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false));
        this.c.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, this.f ? org.telegram.ui.ActionBar.j6.q7 : org.telegram.ui.ActionBar.j6.y6, false));
        invalidate();
    }

    @Override // org.telegram.messenger.GiftAuctionController.OnActiveAuctionsUpdateListeners
    public final void onActiveAuctionsUpdate(List list) {
        org.telegram.ui.Components.q6 q6Var;
        String formatString;
        ArrayList arrayList = new ArrayList(list);
        this.e = arrayList;
        int size = arrayList.size();
        l lVar = this.d;
        if (size == 1) {
            GiftAuctionController.Auction auction = (GiftAuctionController.Auction) this.e.get(0);
            if (auction.isUpcoming()) {
                lVar.a(auction.gift.auction_start_date);
            } else {
                TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = auction.auctionStateActive;
                lVar.a(tL_starGiftAuctionState != null ? Math.max(0, tL_starGiftAuctionState.next_round_at) : 0);
            }
        } else {
            lVar.f = 0;
            lVar.c.b();
            lVar.a.q(LocaleController.getString(R.string.Gift2AuctionPriceView), true, true);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int size2 = this.e.size();
        if (size2 == 0) {
            return;
        }
        int currentTime = ConnectionsManager.getInstance(this.a).getCurrentTime();
        int i10 = 0;
        boolean z10 = false;
        boolean z11 = false;
        while (true) {
            q6Var = this.b;
            if (i10 >= size2) {
                break;
            }
            GiftAuctionController.Auction auction2 = (GiftAuctionController.Auction) this.e.get(i10);
            z10 |= auction2.isUpcoming(currentTime);
            if (auction2.giftDocumentId != 0) {
                spannableStringBuilder.append((CharSequence) "*");
                spannableStringBuilder.setSpan(new org.telegram.ui.Components.z5(auction2.giftDocumentId, q6Var.getPaint().getFontMetricsInt()), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            }
            GiftAuctionController.Auction.BidStatus bidStatus = auction2.getBidStatus();
            z11 |= bidStatus == GiftAuctionController.Auction.BidStatus.OUTBID || bidStatus == GiftAuctionController.Auction.BidStatus.RETURNED;
            i10++;
        }
        spannableStringBuilder.append(' ');
        if (z10) {
            spannableStringBuilder.append((CharSequence) (size2 == 1 ? LocaleController.getString(R.string.Gift2ActiveAuctionsUpcomingAuctionTitle) : LocaleController.formatString(R.string.Gift2ActiveAuctionsUpcomingAuctionsTitle, Integer.valueOf(size2))));
        } else {
            spannableStringBuilder.append((CharSequence) (size2 == 1 ? LocaleController.getString(R.string.Gift2ActiveAuctionsActiveAuctionTitle) : LocaleController.formatString(R.string.Gift2ActiveAuctionsActiveAuctionsTitle, Integer.valueOf(size2))));
        }
        q6Var.c(spannableStringBuilder, true, true);
        this.f = false;
        org.telegram.ui.Components.q6 q6Var2 = this.c;
        if (z10) {
            q6Var2.setText(LocaleController.getString(R.string.Gift2ActiveAuctionsActiveStatusEarly));
        } else if (z11) {
            q6Var2.setText(LocaleController.getString(R.string.Gift2ActiveAuctionsActiveStatusOutbid));
            this.f = true;
        } else if (size2 > 1) {
            q6Var2.setText(LocaleController.getString(R.string.Gift2ActiveAuctionsActiveStatusWinningAll));
        } else {
            int approximatedMyPlace = ((GiftAuctionController.Auction) this.e.get(0)).getApproximatedMyPlace();
            if (approximatedMyPlace == 1) {
                formatString = LocaleController.getString(R.string.Gift2ActiveAuctionsActiveStatusWinning1Place);
            } else if (approximatedMyPlace == 2) {
                formatString = LocaleController.getString(R.string.Gift2ActiveAuctionsActiveStatusWinning2Place);
            } else if (approximatedMyPlace == 3) {
                formatString = LocaleController.getString(R.string.Gift2ActiveAuctionsActiveStatusWinning3Place);
            } else {
                int i11 = approximatedMyPlace % 100;
                if (i11 < 11 || i11 > 13) {
                    int i12 = approximatedMyPlace % 10;
                    formatString = i12 != 1 ? i12 != 2 ? i12 != 3 ? LocaleController.formatString(R.string.Gift2ActiveAuctionsActiveStatusWinningOtherTh, Integer.valueOf(approximatedMyPlace)) : LocaleController.formatString(R.string.Gift2ActiveAuctionsActiveStatusWinningOtherRd, Integer.valueOf(approximatedMyPlace)) : LocaleController.formatString(R.string.Gift2ActiveAuctionsActiveStatusWinningOtherNd, Integer.valueOf(approximatedMyPlace)) : LocaleController.formatString(R.string.Gift2ActiveAuctionsActiveStatusWinningOtherSt, Integer.valueOf(approximatedMyPlace));
                } else {
                    formatString = LocaleController.formatString(R.string.Gift2ActiveAuctionsActiveStatusWinningOtherTh, Integer.valueOf(approximatedMyPlace));
                }
            }
            q6Var2.setText(LocaleController.formatString(R.string.Gift2ActiveAuctionsActiveStatusWinningOne, formatString));
        }
        a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = this.a;
        GiftAuctionController.getInstance(i10).subscribeToActiveAuctionsUpdates(this);
        onActiveAuctionsUpdate(GiftAuctionController.getInstance(i10).getActiveAuctions());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        GiftAuctionController.getInstance(this.a).unsubscribeFromActiveAuctionsUpdates(this);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30));
    }
}
