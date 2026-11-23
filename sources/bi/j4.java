package bi;

import android.content.Context;
import android.text.SpannableStringBuilder;
import java.util.HashSet;
import org.telegram.messenger.gd;
import org.telegram.messenger.w10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.kc;
import org.telegram.ui.Components.o31;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class j4 implements w10 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Context b;
    public final /* synthetic */ int c;
    public final /* synthetic */ org.telegram.ui.ActionBar.i6 d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ TLObject f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ j4(Context context, int i7, TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer, TL_stars.TL_payments_starGiftOnchainOfferTx tL_payments_starGiftOnchainOfferTx, org.telegram.ui.Wallet.q0 q0Var, org.telegram.ui.ActionBar.i6 i6Var, kc kcVar) {
        this.b = context;
        this.c = i7;
        this.e = tL_messageActionStarGiftOnchainOffer;
        this.f = tL_payments_starGiftOnchainOfferTx;
        this.g = q0Var;
        this.d = i6Var;
        this.h = kcVar;
    }

    @Override // org.telegram.messenger.w10
    public final void a(Object obj) {
        long j3;
        String a02;
        int i7 = this.a;
        Object obj2 = this.h;
        Object obj3 = this.g;
        TLObject tLObject = this.f;
        Object obj4 = this.e;
        switch (i7) {
            case 0:
                final TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer = (TLRPC.TL_messageActionStarGiftOnchainOffer) obj4;
                TL_stars.TL_payments_starGiftOnchainOfferTx tL_payments_starGiftOnchainOfferTx = (TL_stars.TL_payments_starGiftOnchainOfferTx) tLObject;
                final org.telegram.ui.Wallet.q0 q0Var = (org.telegram.ui.Wallet.q0) obj3;
                final kc kcVar = (kc) obj2;
                final long longValue = ((Long) obj).longValue();
                long j10 = tL_payments_starGiftOnchainOfferTx.fine;
                if (j10 <= 0) {
                    j10 = 0;
                }
                long max = Math.max(0L, tL_messageActionStarGiftOnchainOffer.amount - j10);
                if (j10 > 0) {
                    j3 = 0;
                    a02 = gd.a0(null, null, 2131749549, a5.k(j10), a5.k(max));
                } else {
                    j3 = 0;
                    a02 = gd.a0(null, null, 2131749547, a5.k(max));
                }
                SpannableStringBuilder W2 = org.telegram.messenger.g0.W2(a02);
                String a03 = j10 > 0 ? gd.a0(null, null, 2131749548, a5.k(j10)) : gd.N0(2131749551, null);
                TL_wallet.walletOnchainGiftActionOfferCancel walletonchaingiftactionoffercancel = new TL_wallet.walletOnchainGiftActionOfferCancel();
                walletonchaingiftactionoffercancel.offer_address = tL_messageActionStarGiftOnchainOffer.offer_address;
                int i10 = walletonchaingiftactionoffercancel.flags;
                walletonchaingiftactionoffercancel.flags = i10 | 2;
                walletonchaingiftactionoffercancel.price = tL_messageActionStarGiftOnchainOffer.amount;
                walletonchaingiftactionoffercancel.refund_amount = max;
                long j11 = tL_payments_starGiftOnchainOfferTx.fine;
                if (j11 > j3) {
                    walletonchaingiftactionoffercancel.flags = i10 | 6;
                    walletonchaingiftactionoffercancel.fine = j11;
                }
                TL_stars.StarGift starGift = tL_messageActionStarGiftOnchainOffer.gift;
                q0Var.h = walletonchaingiftactionoffercancel;
                q0Var.i = starGift;
                final long j12 = tL_messageActionStarGiftOnchainOffer.offer_id;
                final boolean[] zArr = new boolean[1];
                l4.j(j12, Long.MAX_VALUE);
                final Context context = this.b;
                final org.telegram.ui.ActionBar.i6 i6Var = this.d;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, i6Var);
                a4 a4Var = new a4(zArr, j12, 0);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                t1Var.setOnDismissListener(a4Var);
                t1Var.S = gd.N0(2131749545, null);
                t1Var.U = W2;
                alertDialog$Builder.h(gd.N0(2131752577, null), null);
                final int i11 = this.c;
                alertDialog$Builder.k(a03, new org.telegram.ui.ActionBar.q1() { // from class: bi.b4
                    @Override // org.telegram.ui.ActionBar.q1
                    public final void i(org.telegram.ui.ActionBar.t1 t1Var2, int i12) {
                        org.telegram.ui.Wallet.q0 q0Var2 = q0Var;
                        long j13 = q0Var2.b + longValue;
                        Context context2 = context;
                        int i13 = i11;
                        org.telegram.ui.ActionBar.i6 i6Var2 = i6Var;
                        if (u3.e1(context2, i13, i6Var2, j13, 2131749614)) {
                            vf.b h = t1Var2.h(i12, true, true);
                            h.d();
                            aa.r rVar = new aa.r(new boolean[1], h, t1Var2, 10);
                            zArr[0] = true;
                            HashSet hashSet = l4.b;
                            long j14 = j12;
                            hashSet.add(Long.valueOf(j14));
                            l4.j(j14, 300000L);
                            org.telegram.ui.Wallet.v0.D(i13).o0(q0Var2, new c4(j14, rVar, context2, i13, i6Var2, kcVar), new d4(rVar, j14, tL_messageActionStarGiftOnchainOffer), new e4(j14, rVar));
                        }
                    }
                });
                alertDialog$Builder.p();
                break;
            default:
                String str = (String) obj;
                org.telegram.ui.ActionBar.t1 t1Var2 = new org.telegram.ui.ActionBar.t1(3, this.b, null);
                t1Var2.r(200L);
                TLRPC.TL_messages_checkUrlAuthMatchCode tL_messages_checkUrlAuthMatchCode = new TLRPC.TL_messages_checkUrlAuthMatchCode();
                ((String[]) obj4)[0] = str;
                tL_messages_checkUrlAuthMatchCode.match_code = str;
                tL_messages_checkUrlAuthMatchCode.url = ((TLRPC.TL_messages_requestUrlAuth) tLObject).url;
                ConnectionsManager.getInstance(this.c).sendRequestTyped(tL_messages_checkUrlAuthMatchCode, new d3.b(1), new di.e2(t1Var2, (o31) obj3, (String) obj2, this.d, 2));
                break;
        }
    }

    public /* synthetic */ j4(Context context, String[] strArr, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, int i7, o31 o31Var, String str, org.telegram.ui.ActionBar.i6 i6Var) {
        this.b = context;
        this.e = strArr;
        this.f = tL_messages_requestUrlAuth;
        this.c = i7;
        this.g = o31Var;
        this.h = str;
        this.d = i6Var;
    }
}
