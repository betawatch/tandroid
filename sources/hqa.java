// default package

import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Wallet.c;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class hqa implements qac {
    public final /* synthetic */ wsa a;
    public final /* synthetic */ long b;
    public final /* synthetic */ k11 c;
    public final /* synthetic */ long d;
    public final /* synthetic */ TL_stars.TL_starGiftUnique e;
    public final /* synthetic */ TL_wallet.nftItem f;
    public final /* synthetic */ yw4 g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ String i;

    public /* synthetic */ hqa(wsa wsaVar, long j, k11 k11Var, long j2, TL_stars.TL_starGiftUnique tL_starGiftUnique, TL_wallet.nftItem nftitem, yw4 yw4Var, boolean z, String str) {
        this.a = wsaVar;
        this.b = j;
        this.c = k11Var;
        this.d = j2;
        this.e = tL_starGiftUnique;
        this.f = nftitem;
        this.g = yw4Var;
        this.h = z;
        this.i = str;
    }

    @Override // qac
    public final void a(Object obj) {
        TL_stars.starGiftDepositPayload stargiftdepositpayload = (TL_stars.starGiftDepositPayload) obj;
        long max = Math.max(0L, this.b) + stargiftdepositpayload.amount;
        wsa wsaVar = this.a;
        long z = c.C(wsaVar.a).z();
        byte b = 1;
        k11 k11Var = this.c;
        if (z < max) {
            k11Var.b();
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, wsaVar.J0, wsaVar.getContext());
            String M0 = jb6.M0(2131742748, null);
            he heVar = alertDialog$Builder.a;
            heVar.S = M0;
            heVar.U = jb6.V(null, null, 2131742747, c.r(max, false));
            alertDialog$Builder.g(jb6.M0(2131742746, null), null);
            alertDialog$Builder.j(jb6.M0(2131742653, null), new ypa(wsaVar, b));
            alertDialog$Builder.o();
            return;
        }
        final long j = this.d;
        TLRPC.User W1 = j > 0 ? oc7.r1(wsaVar.a).W1(Long.valueOf(j)) : null;
        final long e = z8c.h(wsaVar.a).e();
        final TL_stars.TL_starGiftUnique tL_starGiftUnique = this.e;
        final TLRPC.Document document = tL_starGiftUnique.getDocument();
        final int i = wsaVar.a;
        c C = c.C(i);
        i48 i48Var = new i48((Object) wsaVar, (Object) k11Var, (Object) this.g, (byte) 8);
        final boolean z2 = this.h;
        final String str = this.i;
        qac qacVar = j != e ? z2 ? null : new qac() { // from class: iqa
            @Override // qac
            public final void a(Object obj2) {
                Boolean bool = (Boolean) obj2;
                if (bool.booleanValue()) {
                    jva.v(i, false).M(e);
                }
                boolean booleanValue = bool.booleanValue();
                String str2 = str;
                gm.c3(new hw9((Object) null, document, booleanValue ? gm.S2(jb6.a0(null, null, 2131749831, str2, pg3.s(j))) : jb6.a0(null, null, 2131749569, str2), (byte) 19));
            }
        } : new qac() { // from class: jqa
            @Override // qac
            public final void a(Object obj2) {
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                TLRPC.Document document2 = document;
                if (!booleanValue) {
                    if (z2) {
                        return;
                    }
                    gm.c3(new hw9((Object) null, document2, jb6.a0(null, null, 2131749569, str), (byte) 19));
                    return;
                }
                int i2 = i;
                jva v = jva.v(i2, false);
                long j2 = e;
                v.M(j2);
                String str2 = tL_starGiftUnique.slug;
                if (!TextUtils.isEmpty(str2)) {
                    gm.d3(new ep1(i2, 0, str2, false), fs7.b[0]);
                }
                gm.c3(new hw9(new pz6((byte) 4, j2), document2, jb6.M0(2131750035, null), (byte) 19));
            }
        };
        try {
            int indexOf = stargiftdepositpayload.nft_address.indexOf(58);
            String str2 = stargiftdepositpayload.nft_address;
            if (indexOf >= 0) {
                str2 = c.d0(str2, true);
            }
            C.m0(W1, str2, 0L, null, null, this.f, null, i48Var, qacVar != null ? new qy1(C, qacVar, (byte) 27) : null, c.i(stargiftdepositpayload), null, null);
        } catch (Exception e2) {
            c.n("depositNFT: invalid payload", e2);
            i48Var.a(e2.getMessage() == null ? "NULL_ERROR" : e2.getMessage());
        }
    }
}
