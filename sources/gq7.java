// default package

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.KeyEvent;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class gq7 implements p8c {
    public final /* synthetic */ byte a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ KeyEvent.Callback d;

    public /* synthetic */ gq7(KeyEvent.Callback callback, long j, int i, byte b) {
        this.a = b;
        this.d = callback;
        this.b = j;
        this.c = i;
    }

    @Override // p8c
    public final void a(Object obj) {
        byte b = this.a;
        int i = this.c;
        KeyEvent.Callback callback = this.d;
        switch (b) {
            case 0:
                iq7 iq7Var = (iq7) callback;
                Long l = (Long) obj;
                if (!iq7Var.J) {
                    final Context context = iq7Var.getContext();
                    final int i2 = iq7Var.a;
                    final TL_stars.TL_starGiftUnique tL_starGiftUnique = iq7Var.l1;
                    final long j = iq7Var.m1;
                    long longValue = l.longValue();
                    final wjb wjbVar = iq7Var.J0;
                    u41 u41Var = iq7Var.v1;
                    Objects.requireNonNull(u41Var);
                    final zf7 zf7Var = new zf7(u41Var, (byte) 6);
                    final u21 u21Var = new u21(iq7Var.c, iq7Var.J0);
                    final fq7 fq7Var = new fq7(iq7Var, (byte) 1);
                    final fq7 fq7Var2 = new fq7(iq7Var, (byte) 2);
                    HashMap hashMap = vp7.a;
                    TL_stars.sendStarGiftOnchainOffer sendstargiftonchainoffer = new TL_stars.sendStarGiftOnchainOffer();
                    sendstargiftonchainoffer.slug = tL_starGiftUnique.slug;
                    final long j2 = this.b;
                    sendstargiftonchainoffer.amount = j2;
                    sendstargiftonchainoffer.duration = i;
                    sendstargiftonchainoffer.random_id = longValue;
                    cq7.h(tL_starGiftUnique);
                    zf7Var.a(Boolean.TRUE);
                    ConnectionsManager.getInstance(i2).sendRequestTyped(sendstargiftonchainoffer, new hc((byte) 0), new i8c() { // from class: rp7
                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Type inference failed for: r13v0 */
                        /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.String, lfb[], q41[]] */
                        /* JADX WARN: Type inference failed for: r13v5 */
                        @Override // i8c
                        public final void a(Object obj2, Object obj3) {
                            mp7 mp7Var;
                            TL_stars.TL_payments_starGiftOnchainOfferTx tL_payments_starGiftOnchainOfferTx = (TL_stars.TL_payments_starGiftOnchainOfferTx) obj2;
                            TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                            zf7.this.a(Boolean.FALSE);
                            int i3 = i2;
                            TL_stars.TL_starGiftUnique tL_starGiftUnique2 = tL_starGiftUnique;
                            Context context2 = context;
                            wjb wjbVar2 = wjbVar;
                            u21 u21Var2 = u21Var;
                            if (tL_payments_starGiftOnchainOfferTx == null || tL_payments_starGiftOnchainOfferTx.message == null) {
                                if (tL_error != null && "STARGIFT_ONCHAIN_OFFER_INTENT_CONFLICT".equals(tL_error.text)) {
                                    String str = tL_starGiftUnique2.slug;
                                    ad7 Y = ad7.Y(i3);
                                    Y.a.c(new t67(Y, str, (byte) 24));
                                }
                                cq7.r(context2, i3, wjbVar2, u21Var2, tL_error, null);
                                return;
                            }
                            w05 p = vp7.p(context2, wjbVar2, u21Var2, i3, tL_payments_starGiftOnchainOfferTx);
                            if (p == null) {
                                return;
                            }
                            String h = cq7.h(tL_starGiftUnique2);
                            mp7 mp7Var2 = new mp7(context2, i3, tL_starGiftUnique2, wjbVar2);
                            long j3 = j;
                            String r = j3 != 0 ? cf3.r(i3, j3) : null;
                            mp7Var2.e1(gl.T2(!TextUtils.isEmpty(r) ? k96.a0(null, null, 2131749607, r, h) : k96.a0(null, null, 2131749608, h)), k96.M0(2131749606, null));
                            int f = cq7.f(tL_starGiftUnique2);
                            long j4 = j2;
                            long n = cq7.n(f, j4);
                            long j5 = p.b;
                            long j6 = ((j5 + 99999) / 100000) * 100000;
                            long max = Math.max(0L, j6 - j4);
                            ?? r13 = 0;
                            String M0 = k96.M0(2131749573, null);
                            SpannableStringBuilder i4 = cq7.i(j4 - n);
                            mfb mfbVar = mp7Var2.Y1;
                            mfbVar.f(M0, i4, null, null);
                            if (n > 0) {
                                r13 = 0;
                                mfbVar.f(k96.M0(2131749575, null), TextUtils.concat(cq7.i(n), " ", r41.b(cq7.g(f), null, wjbVar2, null)), null, null);
                            }
                            if (j5 > j4) {
                                mfbVar.f(k96.M0(2131749540, r13), cq7.i(max), r13, r13);
                            }
                            mfbVar.f(k96.M0(2131749574, r13), cq7.i(j6), r13, r13);
                            mfbVar.f(k96.M0(2131749532, r13), h, r13, r13);
                            int i5 = tL_payments_starGiftOnchainOfferTx.expires_at;
                            if (i5 > 0) {
                                mp7Var = mp7Var2;
                                mfbVar.f(k96.M0(2131749576, r13), k96.x(i5, true), r13, r13);
                            } else {
                                mp7Var = mp7Var2;
                            }
                            TL_wallet.walletOnchainGiftActionOfferCreate walletonchaingiftactionoffercreate = new TL_wallet.walletOnchainGiftActionOfferCreate();
                            walletonchaingiftactionoffercreate.offer_address = tL_payments_starGiftOnchainOfferTx.offer_address;
                            if (!TextUtils.isEmpty(tL_starGiftUnique2.owner_address)) {
                                walletonchaingiftactionoffercreate.flags |= 1;
                                walletonchaingiftactionoffercreate.counterparty_address = tL_starGiftUnique2.owner_address;
                            }
                            walletonchaingiftactionoffercreate.price = j4;
                            walletonchaingiftactionoffercreate.amount = j5;
                            walletonchaingiftactionoffercreate.service_fee = n;
                            if (i5 > 0) {
                                walletonchaingiftactionoffercreate.flags |= 2;
                                walletonchaingiftactionoffercreate.expires_at = i5;
                            }
                            p.h = walletonchaingiftactionoffercreate;
                            p.i = tL_starGiftUnique2;
                            SpannableStringBuilder T2 = gl.T2(k96.M0(2131749579, null));
                            mp7 mp7Var3 = mp7Var;
                            l46 l46Var = mp7Var3.Z1;
                            l46Var.setText(T2);
                            l46Var.setVisibility(TextUtils.isEmpty(T2) ? 8 : 0);
                            mp7Var3.p2 = 2131749614;
                            mp7Var3.d1(p);
                            mp7Var3.s2 = new j45(fq7Var2, p, i5, (byte) 18);
                            mp7Var3.c1(new vl6(fq7Var, (byte) 28), new zf7(tL_starGiftUnique2, (byte) 5), new np7(context2, i3, wjbVar2, mp7Var3, (byte) 1));
                            mp7Var3.show();
                        }
                    });
                    break;
                }
                break;
            default:
                ((nfa) callback).D0(i, this.b, (ArrayList) obj);
                break;
        }
    }
}
