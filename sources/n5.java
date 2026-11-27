// default package

import android.text.SpannableStringBuilder;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class n5 extends a8c {
    public static final /* synthetic */ int b = 0;

    static {
        a8c.h(new n5());
    }

    @Override // a8c
    public final void b(View view, b8c b8cVar, boolean z, l9c l9cVar, q9c q9cVar) {
        o5 o5Var = (o5) view;
        kv4 kv4Var = (kv4) b8cVar.I;
        TL_stars.TL_StarGiftAuctionAcquiredGift tL_StarGiftAuctionAcquiredGift = (TL_stars.TL_StarGiftAuctionAcquiredGift) b8cVar.H;
        View.OnClickListener onClickListener = b8cVar.E;
        int i = o5.c;
        o5Var.removeAllViews();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("*");
        spannableStringBuilder.setSpan(new hm(kv4Var.c, aob.s2.getFontMetricsInt()), 0, spannableStringBuilder.length(), 33);
        spannableStringBuilder.append(' ');
        spannableStringBuilder.append((CharSequence) ob6.a0(null, null, 2131750270, kv4Var.d.title, Integer.valueOf(tL_StarGiftAuctionAcquiredGift.gift_num), Integer.valueOf(tL_StarGiftAuctionAcquiredGift.round)));
        spannableStringBuilder.setSpan(new y7c(hl.o()), 0, spannableStringBuilder.length(), 33);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        spannableStringBuilder2.append((CharSequence) nza.b1(false, "⭐️".concat(ob6.E(tL_StarGiftAuctionAcquiredGift.bid_amount, ',')), 0.75f, null));
        String a0 = ob6.a0(null, null, 2131750269, Integer.valueOf(tL_StarGiftAuctionAcquiredGift.pos));
        hjb hjbVar = new hjb(o5Var.getContext(), o5Var.a);
        hjbVar.a(spannableStringBuilder).setFilled(true);
        hjbVar.n(ob6.M0(2131750272, null), o5Var.b, wf3.n(tL_StarGiftAuctionAcquiredGift.peer), new ve2(o5Var, onClickListener, (byte) 17));
        hjbVar.g(tL_StarGiftAuctionAcquiredGift.date, ob6.M0(2131750276, null));
        hjbVar.e(ob6.M0(2131750277, null), spannableStringBuilder2, a0, null, null);
        o5Var.addView(hjbVar, tre.c(-2.0f, -1));
    }

    @Override // a8c
    public final boolean f() {
        return false;
    }
}
