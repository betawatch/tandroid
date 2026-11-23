package di;

import android.text.TextUtils;
import org.telegram.messenger.gd;
import org.telegram.messenger.i10;
import org.telegram.messenger.mp;
import org.telegram.messenger.w10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.a31;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class w2 implements w10 {
    public final /* synthetic */ f6 a;
    public final /* synthetic */ long b;
    public final /* synthetic */ vf.b c;
    public final /* synthetic */ long d;
    public final /* synthetic */ TL_stars.TL_starGiftUnique e;
    public final /* synthetic */ TL_wallet.nftItem f;
    public final /* synthetic */ bi.f2 g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ String i;

    public /* synthetic */ w2(f6 f6Var, long j3, vf.b bVar, long j10, TL_stars.TL_starGiftUnique tL_starGiftUnique, TL_wallet.nftItem nftitem, bi.f2 f2Var, boolean z10, String str) {
        this.a = f6Var;
        this.b = j3;
        this.c = bVar;
        this.d = j10;
        this.e = tL_starGiftUnique;
        this.f = nftitem;
        this.g = f2Var;
        this.h = z10;
        this.i = str;
    }

    @Override // org.telegram.messenger.w10
    public final void a(Object obj) {
        bi.j jVar;
        w10 w10Var;
        TL_stars.starGiftDepositPayload stargiftdepositpayload = (TL_stars.starGiftDepositPayload) obj;
        long max = Math.max(0L, this.b) + stargiftdepositpayload.amount;
        f6 f6Var = this.a;
        long A = org.telegram.ui.Wallet.v0.D(f6Var.a).A();
        int i7 = 1;
        vf.b bVar = this.c;
        if (A < max) {
            bVar.b();
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, f6Var.getContext(), f6Var.J0);
            String N0 = gd.N0(2131742814, null);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
            t1Var.S = N0;
            t1Var.U = gd.V(null, null, 2131742813, org.telegram.ui.Wallet.v0.s(max, false));
            alertDialog$Builder.h(gd.N0(2131742812, null), null);
            alertDialog$Builder.k(gd.N0(2131742719, null), new g2(f6Var, i7));
            alertDialog$Builder.p();
            return;
        }
        final long j3 = this.d;
        TLRPC.User c22 = j3 > 0 ? mp.u1(f6Var.a).c2(Long.valueOf(j3)) : null;
        final long e10 = i10.i(f6Var.a).e();
        final TL_stars.TL_starGiftUnique tL_starGiftUnique = this.e;
        final TLRPC.Document document = tL_starGiftUnique.getDocument();
        final int i10 = f6Var.a;
        org.telegram.ui.Wallet.v0 D = org.telegram.ui.Wallet.v0.D(i10);
        bi.j jVar2 = new bi.j(f6Var, bVar, this.g, 4);
        final boolean z10 = this.h;
        final String str = this.i;
        if (j3 != e10) {
            jVar = jVar2;
            w10Var = z10 ? null : new w10() { // from class: di.y2
                @Override // org.telegram.messenger.w10
                public final void a(Object obj2) {
                    Boolean bool = (Boolean) obj2;
                    if (bool.booleanValue()) {
                        y8.y(i10, false).O(e10);
                    }
                    boolean booleanValue = bool.booleanValue();
                    String str2 = str;
                    org.telegram.messenger.g0.g3(new aa.r((Object) null, document, booleanValue ? org.telegram.messenger.g0.W2(gd.a0(null, null, 2131749881, str2, org.telegram.messenger.n5.t(j3))) : gd.a0(null, null, 2131749619, str2), 24));
                }
            };
        } else {
            jVar = jVar2;
            w10Var = new w10() { // from class: di.z2
                @Override // org.telegram.messenger.w10
                public final void a(Object obj2) {
                    boolean booleanValue = ((Boolean) obj2).booleanValue();
                    TLRPC.Document document2 = document;
                    int i11 = 0;
                    if (!booleanValue) {
                        if (z10) {
                            return;
                        }
                        org.telegram.messenger.g0.g3(new aa.r((Object) null, (Object) document2, (Object) gd.a0(null, null, 2131749619, str), 24));
                        return;
                    }
                    int i12 = i10;
                    y8 y10 = y8.y(i12, false);
                    long j10 = e10;
                    y10.O(j10);
                    String str2 = tL_starGiftUnique.slug;
                    if (!TextUtils.isEmpty(str2)) {
                        org.telegram.messenger.g0.h3(new bi.u4(i12, 0, str2, false), bi.a5.b[0]);
                    }
                    org.telegram.messenger.g0.g3(new aa.r((Object) new g3(j10, i11), (Object) document2, (Object) gd.N0(2131750085, null), 24));
                }
            };
        }
        try {
            D.n0(c22, stargiftdepositpayload.nft_address.indexOf(58) >= 0 ? org.telegram.ui.Wallet.v0.e0(stargiftdepositpayload.nft_address, true) : stargiftdepositpayload.nft_address, 0L, null, null, this.f, null, jVar, w10Var != null ? new a31(5, D, w10Var) : null, org.telegram.ui.Wallet.v0.j(stargiftdepositpayload), null, null);
        } catch (Exception e11) {
            bi.j jVar3 = jVar;
            org.telegram.ui.Wallet.v0.o("depositNFT: invalid payload", e11);
            jVar3.a(e11.getMessage() == null ? "NULL_ERROR" : e11.getMessage());
        }
    }
}
