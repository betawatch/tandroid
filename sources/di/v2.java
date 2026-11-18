package di;

import android.text.TextUtils;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.mp;
import org.telegram.messenger.x10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.p51;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class v2 implements x10 {
    public final /* synthetic */ f6 a;
    public final /* synthetic */ long b;
    public final /* synthetic */ vf.b c;
    public final /* synthetic */ long d;
    public final /* synthetic */ TL_stars.TL_starGiftUnique e;
    public final /* synthetic */ TL_wallet.nftItem f;
    public final /* synthetic */ bi.a2 g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ String i;

    public /* synthetic */ v2(f6 f6Var, long j3, vf.b bVar, long j10, TL_stars.TL_starGiftUnique tL_starGiftUnique, TL_wallet.nftItem nftitem, bi.a2 a2Var, boolean z10, String str) {
        this.a = f6Var;
        this.b = j3;
        this.c = bVar;
        this.d = j10;
        this.e = tL_starGiftUnique;
        this.f = nftitem;
        this.g = a2Var;
        this.h = z10;
        this.i = str;
    }

    @Override // org.telegram.messenger.x10
    public final void a(Object obj) {
        bi.j jVar;
        int i7;
        x10 x10Var;
        TL_stars.starGiftDepositPayload stargiftdepositpayload = (TL_stars.starGiftDepositPayload) obj;
        long max = Math.max(0L, this.b) + stargiftdepositpayload.amount;
        f6 f6Var = this.a;
        long A = org.telegram.ui.Wallet.u0.D(f6Var.a).A();
        int i10 = 1;
        vf.b bVar = this.c;
        if (A < max) {
            bVar.b();
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, f6Var.getContext(), f6Var.J0);
            String M0 = gd.M0(2131742827, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
            u1Var.S = M0;
            u1Var.U = gd.V(null, null, 2131742826, org.telegram.ui.Wallet.u0.s(max, false));
            alertDialog$Builder.h(gd.M0(2131742825, null), null);
            alertDialog$Builder.k(gd.M0(2131742732, null), new f2(f6Var, i10));
            alertDialog$Builder.p();
            return;
        }
        final long j3 = this.d;
        TLRPC.User c22 = j3 > 0 ? mp.u1(f6Var.a).c2(Long.valueOf(j3)) : null;
        final long e10 = j10.i(f6Var.a).e();
        final TL_stars.TL_starGiftUnique tL_starGiftUnique = this.e;
        final TLRPC.Document document = tL_starGiftUnique.getDocument();
        final int i11 = f6Var.a;
        org.telegram.ui.Wallet.u0 D = org.telegram.ui.Wallet.u0.D(i11);
        bi.j jVar2 = new bi.j(f6Var, bVar, this.g, 4);
        final boolean z10 = this.h;
        final String str = this.i;
        if (j3 != e10) {
            jVar = jVar2;
            if (z10) {
                i7 = 4;
                x10Var = null;
            } else {
                i7 = 4;
                x10Var = new x10() { // from class: di.y2
                    @Override // org.telegram.messenger.x10
                    public final void a(Object obj2) {
                        Boolean bool = (Boolean) obj2;
                        if (bool.booleanValue()) {
                            x8.y(i11, false).O(e10);
                        }
                        boolean booleanValue = bool.booleanValue();
                        String str2 = str;
                        org.telegram.messenger.g0.g3(new aa.r((Object) null, document, booleanValue ? org.telegram.messenger.g0.W2(gd.a0(null, null, 2131749882, str2, org.telegram.messenger.n5.t(j3))) : gd.a0(null, null, 2131749620, str2), 23));
                    }
                };
            }
        } else {
            jVar = jVar2;
            i7 = 4;
            x10Var = new x10() { // from class: di.z2
                @Override // org.telegram.messenger.x10
                public final void a(Object obj2) {
                    boolean booleanValue = ((Boolean) obj2).booleanValue();
                    TLRPC.Document document2 = document;
                    int i12 = 0;
                    if (!booleanValue) {
                        if (z10) {
                            return;
                        }
                        org.telegram.messenger.g0.g3(new aa.r((Object) null, (Object) document2, (Object) gd.a0(null, null, 2131749620, str), 23));
                        return;
                    }
                    int i13 = i11;
                    x8 y10 = x8.y(i13, false);
                    long j10 = e10;
                    y10.O(j10);
                    String str2 = tL_starGiftUnique.slug;
                    if (!TextUtils.isEmpty(str2)) {
                        org.telegram.messenger.g0.h3(new bi.n4(i13, 0, str2, false), bi.u4.b[0]);
                    }
                    org.telegram.messenger.g0.g3(new aa.r((Object) new g3(j10, i12), (Object) document2, (Object) gd.M0(2131750086, null), 23));
                }
            };
        }
        try {
            D.n0(c22, stargiftdepositpayload.nft_address.indexOf(58) >= 0 ? org.telegram.ui.Wallet.u0.e0(stargiftdepositpayload.nft_address, true) : stargiftdepositpayload.nft_address, 0L, null, null, this.f, null, jVar, x10Var != null ? new p51(i7, D, x10Var) : null, org.telegram.ui.Wallet.u0.j(stargiftdepositpayload), null, null);
        } catch (Exception e11) {
            bi.j jVar3 = jVar;
            org.telegram.ui.Wallet.u0.o("depositNFT: invalid payload", e11);
            jVar3.a(e11.getMessage() == null ? "NULL_ERROR" : e11.getMessage());
        }
    }
}
