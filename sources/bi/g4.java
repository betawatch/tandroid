package bi;

import android.content.Context;
import android.text.SpannableStringBuilder;
import java.util.HashSet;
import org.telegram.messenger.hd;
import org.telegram.messenger.y10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.p31;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g4 implements y10 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Context b;
    public final /* synthetic */ int c;
    public final /* synthetic */ org.telegram.ui.ActionBar.h6 d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ TLObject f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ g4(Context context, int i7, TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer, TL_stars.TL_payments_starGiftOnchainOfferTx tL_payments_starGiftOnchainOfferTx, org.telegram.ui.Wallet.p0 p0Var, org.telegram.ui.ActionBar.h6 h6Var, lc lcVar) {
        this.b = context;
        this.c = i7;
        this.e = tL_messageActionStarGiftOnchainOffer;
        this.f = tL_payments_starGiftOnchainOfferTx;
        this.g = p0Var;
        this.d = h6Var;
        this.h = lcVar;
    }

    @Override // org.telegram.messenger.y10
    public final void a(Object obj) {
        long j3;
        String a02;
        int i7 = this.a;
        Object obj2 = this.h;
        Object obj3 = this.g;
        TLObject tLObject = this.f;
        Object obj4 = this.e;
        int i10 = 1;
        switch (i7) {
            case 0:
                final TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer = (TLRPC.TL_messageActionStarGiftOnchainOffer) obj4;
                TL_stars.TL_payments_starGiftOnchainOfferTx tL_payments_starGiftOnchainOfferTx = (TL_stars.TL_payments_starGiftOnchainOfferTx) tLObject;
                final org.telegram.ui.Wallet.p0 p0Var = (org.telegram.ui.Wallet.p0) obj3;
                final lc lcVar = (lc) obj2;
                final long longValue = ((Long) obj).longValue();
                long j10 = tL_payments_starGiftOnchainOfferTx.fine;
                if (j10 <= 0) {
                    j10 = 0;
                }
                long max = Math.max(0L, tL_messageActionStarGiftOnchainOffer.amount - j10);
                if (j10 > 0) {
                    j3 = 0;
                    a02 = hd.a0(null, null, 2131749549, x4.k(j10), x4.k(max));
                } else {
                    j3 = 0;
                    a02 = hd.a0(null, null, 2131749547, x4.k(max));
                }
                SpannableStringBuilder W2 = org.telegram.messenger.g0.W2(a02);
                String a03 = j10 > 0 ? hd.a0(null, null, 2131749548, x4.k(j10)) : hd.N0(2131749551, null);
                TL_wallet.walletOnchainGiftActionOfferCancel walletonchaingiftactionoffercancel = new TL_wallet.walletOnchainGiftActionOfferCancel();
                walletonchaingiftactionoffercancel.offer_address = tL_messageActionStarGiftOnchainOffer.offer_address;
                int i11 = walletonchaingiftactionoffercancel.flags;
                walletonchaingiftactionoffercancel.flags = i11 | 2;
                walletonchaingiftactionoffercancel.price = tL_messageActionStarGiftOnchainOffer.amount;
                walletonchaingiftactionoffercancel.refund_amount = max;
                long j11 = tL_payments_starGiftOnchainOfferTx.fine;
                if (j11 > j3) {
                    walletonchaingiftactionoffercancel.flags = i11 | 6;
                    walletonchaingiftactionoffercancel.fine = j11;
                }
                TL_stars.StarGift starGift = tL_messageActionStarGiftOnchainOffer.gift;
                p0Var.h = walletonchaingiftactionoffercancel;
                p0Var.i = starGift;
                final long j12 = tL_messageActionStarGiftOnchainOffer.offer_id;
                final boolean[] zArr = new boolean[1];
                i4.j(j12, Long.MAX_VALUE);
                final Context context = this.b;
                final org.telegram.ui.ActionBar.h6 h6Var = this.d;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, h6Var);
                y3 y3Var = new y3(zArr, j12, 0);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                t1Var.setOnDismissListener(y3Var);
                t1Var.S = hd.N0(2131749545, null);
                t1Var.U = W2;
                alertDialog$Builder.h(hd.N0(2131752577, null), null);
                final int i12 = this.c;
                alertDialog$Builder.k(a03, new org.telegram.ui.ActionBar.q1() { // from class: bi.z3
                    @Override // org.telegram.ui.ActionBar.q1
                    public final void h(org.telegram.ui.ActionBar.t1 t1Var2, int i13) {
                        org.telegram.ui.Wallet.p0 p0Var2 = p0Var;
                        long j13 = p0Var2.b + longValue;
                        Context context2 = context;
                        int i14 = i12;
                        org.telegram.ui.ActionBar.h6 h6Var2 = h6Var;
                        if (s3.e1(context2, i14, h6Var2, j13, 2131749614)) {
                            vf.b h = t1Var2.h(i13, true, true);
                            h.d();
                            aa.r rVar = new aa.r(new boolean[1], h, t1Var2, 10);
                            zArr[0] = true;
                            HashSet hashSet = i4.b;
                            long j14 = j12;
                            hashSet.add(Long.valueOf(j14));
                            i4.j(j14, 300000L);
                            org.telegram.ui.Wallet.u0.D(i14).o0(p0Var2, new a4(j14, rVar, context2, i14, h6Var2, lcVar), new b4(rVar, j14, tL_messageActionStarGiftOnchainOffer), new c4(j14, rVar));
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
                ConnectionsManager.getInstance(this.c).sendRequestTyped(tL_messages_checkUrlAuthMatchCode, new d3.b(i10), new di.e2(t1Var2, (p31) obj3, (String) obj2, this.d, 2));
                break;
        }
    }

    public /* synthetic */ g4(Context context, String[] strArr, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, int i7, p31 p31Var, String str, org.telegram.ui.ActionBar.h6 h6Var) {
        this.b = context;
        this.e = strArr;
        this.f = tL_messages_requestUrlAuth;
        this.c = i7;
        this.g = p31Var;
        this.h = str;
        this.d = h6Var;
    }
}
