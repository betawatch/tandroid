// default package

import android.text.TextUtils;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Wallet.c;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class hsa implements pcc {
    public final /* synthetic */ wua a;
    public final /* synthetic */ long b;
    public final /* synthetic */ l01 c;
    public final /* synthetic */ long d;
    public final /* synthetic */ TL_stars.TL_starGiftUnique e;
    public final /* synthetic */ TL_wallet.nftItem f;
    public final /* synthetic */ bx4 g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ String i;

    public /* synthetic */ hsa(wua wuaVar, long j, l01 l01Var, long j2, TL_stars.TL_starGiftUnique tL_starGiftUnique, TL_wallet.nftItem nftitem, bx4 bx4Var, boolean z, String str) {
        this.a = wuaVar;
        this.b = j;
        this.c = l01Var;
        this.d = j2;
        this.e = tL_starGiftUnique;
        this.f = nftitem;
        this.g = bx4Var;
        this.h = z;
        this.i = str;
    }

    @Override // pcc
    public final void a(Object obj) {
        TL_stars.starGiftDepositPayload stargiftdepositpayload = (TL_stars.starGiftDepositPayload) obj;
        long max = Math.max(0L, this.b) + stargiftdepositpayload.amount;
        wua wuaVar = this.a;
        long z = c.C(wuaVar.a).z();
        byte b = 1;
        l01 l01Var = this.c;
        if (z < max) {
            l01Var.b();
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, wuaVar.J0, wuaVar.getContext());
            String M0 = ob6.M0(2131742716, null);
            id idVar = alertDialog$Builder.a;
            idVar.S = M0;
            idVar.U = ob6.V(null, null, 2131742715, c.r(max, false));
            alertDialog$Builder.g(ob6.M0(2131742714, null), null);
            alertDialog$Builder.j(ob6.M0(2131742621, null), new yra(wuaVar, b));
            alertDialog$Builder.o();
            return;
        }
        final long j = this.d;
        TLRPC.User X1 = j > 0 ? uc7.s1(wuaVar.a).X1(Long.valueOf(j)) : null;
        final long e = yac.h(wuaVar.a).e();
        final TL_stars.TL_starGiftUnique tL_starGiftUnique = this.e;
        final TLRPC.Document document = tL_starGiftUnique.getDocument();
        final int i = wuaVar.a;
        c C = c.C(i);
        v58 v58Var = new v58((Object) wuaVar, (Object) l01Var, (Object) this.g, (byte) 8);
        final boolean z2 = this.h;
        final String str = this.i;
        pcc pccVar = j != e ? z2 ? null : new pcc() { // from class: jsa
            @Override // pcc
            public final void a(Object obj2) {
                Boolean bool = (Boolean) obj2;
                if (bool.booleanValue()) {
                    jxa.v(i, false).M(e);
                }
                boolean booleanValue = bool.booleanValue();
                String str2 = str;
                hl.c3(new jr9(null, document, booleanValue ? hl.S2(ob6.a0(null, null, 2131749844, str2, wf3.s(j))) : ob6.a0(null, null, 2131749581, str2)));
            }
        } : new pcc() { // from class: ksa
            @Override // pcc
            public final void a(Object obj2) {
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                TLRPC.Document document2 = document;
                if (!booleanValue) {
                    if (z2) {
                        return;
                    }
                    hl.c3(new jr9(null, document2, ob6.a0(null, null, 2131749581, str)));
                    return;
                }
                int i2 = i;
                jxa v = jxa.v(i2, false);
                long j2 = e;
                v.M(j2);
                String str2 = tL_starGiftUnique.slug;
                HashMap hashMap = it7.a;
                if (!TextUtils.isEmpty(str2)) {
                    hl.d3(new no1(i2, 0, str2, false), it7.c[0]);
                }
                hl.c3(new jr9(new tz6((byte) 4, j2), document2, ob6.M0(2131750061, null)));
            }
        };
        try {
            int indexOf = stargiftdepositpayload.nft_address.indexOf(58);
            String str2 = stargiftdepositpayload.nft_address;
            if (indexOf >= 0) {
                str2 = c.f0(str2, true);
            }
            C.o0(X1, str2, 0L, null, null, this.f, null, v58Var, pccVar != null ? new rx1(C, pccVar, (byte) 27) : null, c.i(stargiftdepositpayload), null, null);
        } catch (Exception e2) {
            c.n("depositNFT: invalid payload", e2);
            v58Var.a(e2.getMessage() == null ? "NULL_ERROR" : e2.getMessage());
        }
    }
}
