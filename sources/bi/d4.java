package bi;

import android.content.Context;
import android.text.SpannableStringBuilder;
import org.telegram.messenger.gd;
import org.telegram.messenger.x10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.lc;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class d4 implements x10 {
    public final /* synthetic */ org.telegram.ui.ActionBar.u1 a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ int c;
    public final /* synthetic */ TLRPC.TL_messageActionStarGiftOnchainOffer d;
    public final /* synthetic */ TL_stars.TL_payments_starGiftOnchainOfferTx e;
    public final /* synthetic */ org.telegram.ui.Wallet.p0 f;
    public final /* synthetic */ org.telegram.ui.ActionBar.i6 g;
    public final /* synthetic */ lc h;

    public /* synthetic */ d4(org.telegram.ui.ActionBar.u1 u1Var, Context context, int i7, TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer, TL_stars.TL_payments_starGiftOnchainOfferTx tL_payments_starGiftOnchainOfferTx, org.telegram.ui.Wallet.p0 p0Var, org.telegram.ui.ActionBar.i6 i6Var, lc lcVar) {
        this.a = u1Var;
        this.b = context;
        this.c = i7;
        this.d = tL_messageActionStarGiftOnchainOffer;
        this.e = tL_payments_starGiftOnchainOfferTx;
        this.f = p0Var;
        this.g = i6Var;
        this.h = lcVar;
    }

    @Override // org.telegram.messenger.x10
    public final void a(Object obj) {
        long j3;
        String a02;
        this.a.dismiss();
        final long longValue = ((Long) obj).longValue();
        TL_stars.TL_payments_starGiftOnchainOfferTx tL_payments_starGiftOnchainOfferTx = this.e;
        long j10 = tL_payments_starGiftOnchainOfferTx.fine;
        if (j10 <= 0) {
            j10 = 0;
        }
        final TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer = this.d;
        long max = Math.max(0L, tL_messageActionStarGiftOnchainOffer.amount - j10);
        if (j10 > 0) {
            j3 = 0;
            a02 = gd.a0(null, null, 2131749550, v4.k(j10), v4.k(max));
        } else {
            j3 = 0;
            a02 = gd.a0(null, null, 2131749548, v4.k(max));
        }
        SpannableStringBuilder W2 = org.telegram.messenger.g0.W2(a02);
        String a03 = j10 > 0 ? gd.a0(null, null, 2131749549, v4.k(j10)) : gd.M0(2131749552, null);
        TL_wallet.walletOnchainGiftActionOfferCancel walletonchaingiftactionoffercancel = new TL_wallet.walletOnchainGiftActionOfferCancel();
        walletonchaingiftactionoffercancel.offer_address = tL_messageActionStarGiftOnchainOffer.offer_address;
        int i7 = walletonchaingiftactionoffercancel.flags;
        walletonchaingiftactionoffercancel.flags = i7 | 2;
        walletonchaingiftactionoffercancel.price = tL_messageActionStarGiftOnchainOffer.amount;
        walletonchaingiftactionoffercancel.refund_amount = max;
        long j11 = tL_payments_starGiftOnchainOfferTx.fine;
        if (j11 > j3) {
            walletonchaingiftactionoffercancel.flags = i7 | 6;
            walletonchaingiftactionoffercancel.fine = j11;
        }
        TL_stars.StarGift starGift = tL_messageActionStarGiftOnchainOffer.gift;
        final org.telegram.ui.Wallet.p0 p0Var = this.f;
        p0Var.h = walletonchaingiftactionoffercancel;
        p0Var.i = starGift;
        final long j12 = tL_messageActionStarGiftOnchainOffer.offer_id;
        final boolean[] zArr = new boolean[1];
        f4.i(j12, Long.MAX_VALUE);
        final Context context = this.b;
        final org.telegram.ui.ActionBar.i6 i6Var = this.g;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, i6Var);
        u3 u3Var = new u3(zArr, j12, 0);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        u1Var.setOnDismissListener(u3Var);
        u1Var.S = gd.M0(2131749546, null);
        u1Var.U = W2;
        alertDialog$Builder.h(gd.M0(2131752578, null), null);
        final int i10 = this.c;
        final lc lcVar = this.h;
        alertDialog$Builder.k(a03, new org.telegram.ui.ActionBar.r1() { // from class: bi.v3
            @Override // org.telegram.ui.ActionBar.r1
            public final void h(org.telegram.ui.ActionBar.u1 u1Var2, int i11) {
                org.telegram.ui.Wallet.p0 p0Var2 = p0Var;
                long j13 = p0Var2.b + longValue;
                Context context2 = context;
                int i12 = i10;
                org.telegram.ui.ActionBar.i6 i6Var2 = i6Var;
                if (o3.e1(context2, i12, i6Var2, j13, 2131749615)) {
                    vf.b h = u1Var2.h(i11, true, true);
                    h.d();
                    aa.r rVar = new aa.r(new boolean[1], h, u1Var2, 9);
                    zArr[0] = true;
                    long j14 = j12;
                    f4.i(j14, 300000L);
                    org.telegram.ui.Wallet.u0.D(i12).o0(p0Var2, new w3(j14, rVar, context2, i12, i6Var2, lcVar), new x3(rVar, j14, tL_messageActionStarGiftOnchainOffer), new y3(j14, rVar));
                }
            }
        });
        alertDialog$Builder.p();
    }
}
