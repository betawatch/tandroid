package fh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import gh.oa;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.pi0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class e extends FrameLayout {
    public final kh.d a;
    public final org.telegram.ui.Components.j6 b;
    public final org.telegram.ui.Components.j6 c;
    public final GiftAuctionController.Auction d;
    public final Paint e;
    public final ff.q f;
    public final eq h;
    public final eq[] n;

    public e(Context context, GiftAuctionController.Auction auction) {
        super(context);
        Paint paint = new Paint(1);
        this.e = paint;
        this.f = new ff.q(new a1.c(this, 25));
        this.h = new eq(R.drawable.filled_gift_sell_24, 0);
        this.n = new eq[1];
        this.d = auction;
        setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(9.0f));
        paint.setShadowLayer(AndroidUtilities.dp(1.0f), 0.0f, 0.0f, TLObject.FLAG_29);
        paint.setColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.d6, false));
        kh.d dVar = new kh.d(context, null, true);
        this.a = dVar;
        dVar.d.o(false, true, true);
        pi0 pi0Var = new pi0(context);
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(context, false, false, false);
        this.b = j6Var;
        j6Var.setTextSize(AndroidUtilities.dp(14.0f));
        j6Var.setTypeface(AndroidUtilities.bold());
        j6Var.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.G6, false));
        org.telegram.ui.Components.j6 j6Var2 = new org.telegram.ui.Components.j6(context, false, false, false);
        this.c = j6Var2;
        j6Var2.setTextSize(AndroidUtilities.dp(12.0f));
        TLRPC.Document document = auction.gift.sticker;
        if (document != null) {
            pi0Var.g(44, 44, document);
        }
        addView(j6Var, g7.e6.d(-1, 18.0f, 51, 64.0f, 15.0f, 15.0f, 0.0f));
        addView(j6Var2, g7.e6.d(-1, 17.0f, 51, 64.0f, 34.0f, 15.0f, 0.0f));
        addView(pi0Var, g7.e6.d(44, 44.0f, 51, 14.0f, 11.0f, 0.0f, 0.0f));
        addView(dVar, g7.e6.d(-1, 44.0f, 80, 15.0f, 0.0f, 15.0f, 15.0f));
        b(false);
    }

    public final void a(long j10, boolean z10) {
        String formatDurationNoHours = AndroidUtilities.formatDurationNoHours((int) j10, false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("*");
        spannableStringBuilder.setSpan(this.h, 0, spannableStringBuilder.length(), 33);
        spannableStringBuilder.append((CharSequence) "  ");
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.Gift2ActiveAuctionsActiveRaiseBid));
        spannableStringBuilder.append((CharSequence) "  ");
        spannableStringBuilder.append((CharSequence) formatDurationNoHours);
        this.a.g(spannableStringBuilder, z10, true);
    }

    public final void b(boolean z10) {
        GiftAuctionController.Auction auction = this.d;
        if (auction.auctionStateActive != null) {
            this.b.c(LocaleController.formatString(R.string.Gift2ActiveAuctionsActiveRound, LocaleController.formatNumber(r1.current_round, ','), LocaleController.formatNumber(auction.auctionStateActive.total_rounds, ',')), z10, true);
        }
        String n10 = j3.r0.n(auction.auctionUserState.bid_amount, ',', new StringBuilder("⭐️"));
        boolean isOutbid = auction.getBidStatus().isOutbid();
        eq[] eqVarArr = this.n;
        org.telegram.ui.Components.j6 j6Var = this.c;
        if (isOutbid) {
            j6Var.c(oa.X0(false, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActiveAuctionsActiveBidOutbid, n10)), 0.66f, eqVarArr), z10, true);
            j6Var.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.q7, false));
        } else {
            j6Var.c(oa.X0(false, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActiveAuctionsActiveBidActive, n10, Integer.valueOf(auction.getApproximatedMyPlace()))), 0.66f, eqVarArr), z10, true);
            j6Var.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.G6, false));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.drawRoundRect(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(9.0f), getMeasuredWidth() - AndroidUtilities.dp(14.0f), getMeasuredHeight() - AndroidUtilities.dp(9.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), this.e);
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f.b();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(146), TLObject.FLAG_30));
    }
}
