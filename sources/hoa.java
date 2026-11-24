// default package

import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Wallet.c;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class hoa implements p8c {
    public final /* synthetic */ vqa a;
    public final /* synthetic */ long b;
    public final /* synthetic */ c01 c;
    public final /* synthetic */ long d;
    public final /* synthetic */ TL_stars.TL_starGiftUnique e;
    public final /* synthetic */ TL_wallet.nftItem f;
    public final /* synthetic */ xu4 g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ String i;

    public /* synthetic */ hoa(vqa vqaVar, long j, c01 c01Var, long j2, TL_stars.TL_starGiftUnique tL_starGiftUnique, TL_wallet.nftItem nftitem, xu4 xu4Var, boolean z, String str) {
        this.a = vqaVar;
        this.b = j;
        this.c = c01Var;
        this.d = j2;
        this.e = tL_starGiftUnique;
        this.f = nftitem;
        this.g = xu4Var;
        this.h = z;
        this.i = str;
    }

    @Override // p8c
    public final void a(Object obj) {
        TL_stars.starGiftDepositPayload stargiftdepositpayload = (TL_stars.starGiftDepositPayload) obj;
        long max = Math.max(0L, this.b) + stargiftdepositpayload.amount;
        vqa vqaVar = this.a;
        long z = c.C(vqaVar.a).z();
        byte b = 1;
        c01 c01Var = this.c;
        if (z < max) {
            c01Var.b();
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, vqaVar.J0, vqaVar.getContext());
            String M0 = k96.M0(2131742822, null);
            hd hdVar = alertDialog$Builder.a;
            hdVar.S = M0;
            hdVar.U = k96.V(null, null, 2131742821, c.r(max, false));
            alertDialog$Builder.g(k96.M0(2131742820, null), null);
            alertDialog$Builder.j(k96.M0(2131742727, null), new yna(vqaVar, b));
            alertDialog$Builder.o();
            return;
        }
        final long j = this.d;
        TLRPC.User V1 = j > 0 ? na7.q1(vqaVar.a).V1(Long.valueOf(j)) : null;
        final long e = y6c.h(vqaVar.a).e();
        final TL_stars.TL_starGiftUnique tL_starGiftUnique = this.e;
        final TLRPC.Document document = tL_starGiftUnique.getDocument();
        final int i = vqaVar.a;
        c C = c.C(i);
        f28 f28Var = new f28((Object) vqaVar, (Object) c01Var, (Object) this.g, (byte) 8);
        final boolean z2 = this.h;
        final String str = this.i;
        p8c p8cVar = j != e ? z2 ? null : new p8c() { // from class: ioa
            @Override // p8c
            public final void a(Object obj2) {
                Boolean bool = (Boolean) obj2;
                if (bool.booleanValue()) {
                    gta.v(i, false).M(e);
                }
                boolean booleanValue = bool.booleanValue();
                String str2 = str;
                gl.d3(new q3a((Runnable) null, document, booleanValue ? gl.T2(k96.a0(null, null, 2131749882, str2, cf3.s(j))) : k96.a0(null, null, 2131749620, str2)));
            }
        } : new p8c() { // from class: joa
            @Override // p8c
            public final void a(Object obj2) {
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                TLRPC.Document document2 = document;
                if (!booleanValue) {
                    if (z2) {
                        return;
                    }
                    gl.d3(new q3a((Runnable) null, document2, k96.a0(null, null, 2131749620, str)));
                    return;
                }
                int i2 = i;
                gta v = gta.v(i2, false);
                long j2 = e;
                v.M(j2);
                String str2 = tL_starGiftUnique.slug;
                if (!TextUtils.isEmpty(str2)) {
                    gl.e3(new rn1(i2, 0, str2, false), cq7.b[0]);
                }
                gl.d3(new q3a(new px6((byte) 4, j2), document2, k96.M0(2131750086, null)));
            }
        };
        try {
            int indexOf = stargiftdepositpayload.nft_address.indexOf(58);
            String str2 = stargiftdepositpayload.nft_address;
            if (indexOf >= 0) {
                str2 = c.d0(str2, true);
            }
            C.m0(V1, str2, 0L, null, null, this.f, null, f28Var, p8cVar != null ? new pz1(C, p8cVar, (byte) 26) : null, c.i(stargiftdepositpayload), null, null);
        } catch (Exception e2) {
            c.n("depositNFT: invalid payload", e2);
            f28Var.a(e2.getMessage() == null ? "NULL_ERROR" : e2.getMessage());
        }
    }
}
