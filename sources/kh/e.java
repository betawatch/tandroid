package kh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import lh.ja;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.jj0;
import org.telegram.ui.Components.k6;
import org.telegram.ui.Components.mq;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class e extends FrameLayout {
    public final ph.d a;
    public final k6 b;
    public final k6 c;
    public final GiftAuctionController.Auction d;
    public final Paint e;
    public final lf.p f;
    public final mq h;
    public final mq[] n;

    public e(Context context, GiftAuctionController.Auction auction) {
        super(context);
        Paint paint = new Paint(1);
        this.e = paint;
        this.f = new lf.p(new gg.f(this, 19));
        this.h = new mq(R.drawable.filled_gift_sell_24, 0);
        this.n = new mq[1];
        this.d = auction;
        setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(9.0f));
        paint.setShadowLayer(AndroidUtilities.dp(1.0f), 0.0f, 0.0f, TLObject.FLAG_29);
        paint.setColor(j6.w0(null, j6.d6, false));
        ph.d dVar = new ph.d(context, null, true);
        this.a = dVar;
        dVar.d.o(false, true, true);
        jj0 jj0Var = new jj0(context);
        k6 k6Var = new k6(context, false, false, false);
        this.b = k6Var;
        k6Var.setTextSize(AndroidUtilities.dp(14.0f));
        k6Var.setTypeface(AndroidUtilities.bold());
        k6Var.setTextColor(j6.w0(null, j6.G6, false));
        k6 k6Var2 = new k6(context, false, false, false);
        this.c = k6Var2;
        k6Var2.setTextSize(AndroidUtilities.dp(12.0f));
        TLRPC.Document document = auction.gift.sticker;
        if (document != null) {
            jj0Var.g(44, 44, document);
        }
        addView(k6Var, k7.b6.d(-1, 18.0f, 51, 64.0f, 15.0f, 15.0f, 0.0f));
        addView(k6Var2, k7.b6.d(-1, 17.0f, 51, 64.0f, 34.0f, 15.0f, 0.0f));
        addView(jj0Var, k7.b6.d(44, 44.0f, 51, 14.0f, 11.0f, 0.0f, 0.0f));
        addView(dVar, k7.b6.d(-1, 44.0f, 80, 15.0f, 0.0f, 15.0f, 15.0f));
        b(false);
    }

    public final void a(long j10, boolean z4) {
        String formatDurationNoHours = AndroidUtilities.formatDurationNoHours((int) j10, false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("*");
        spannableStringBuilder.setSpan(this.h, 0, spannableStringBuilder.length(), 33);
        spannableStringBuilder.append((CharSequence) "  ");
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.Gift2ActiveAuctionsActiveRaiseBid));
        spannableStringBuilder.append((CharSequence) "  ");
        spannableStringBuilder.append((CharSequence) formatDurationNoHours);
        this.a.g(spannableStringBuilder, z4, true);
    }

    public final void b(boolean z4) {
        GiftAuctionController.Auction auction = this.d;
        if (auction.auctionStateActive != null) {
            this.b.c(LocaleController.formatString(R.string.Gift2ActiveAuctionsActiveRound, LocaleController.formatNumber(r1.current_round, ','), LocaleController.formatNumber(auction.auctionStateActive.total_rounds, ',')), z4, true);
        }
        String l10 = a2.l(auction.auctionUserState.bid_amount, ',', new StringBuilder("⭐️"));
        boolean isOutbid = auction.getBidStatus().isOutbid();
        mq[] mqVarArr = this.n;
        k6 k6Var = this.c;
        if (isOutbid) {
            k6Var.c(ja.X0(false, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActiveAuctionsActiveBidOutbid, l10)), 0.66f, mqVarArr), z4, true);
            k6Var.setTextColor(j6.w0(null, j6.q7, false));
        } else {
            k6Var.c(ja.X0(false, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActiveAuctionsActiveBidActive, l10, Integer.valueOf(auction.getApproximatedMyPlace()))), 0.66f, mqVarArr), z4, true);
            k6Var.setTextColor(j6.w0(null, j6.G6, false));
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
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(146), TLObject.FLAG_30));
    }
}
