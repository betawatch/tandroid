// default package

import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ct7 implements pcc {
    public final /* synthetic */ int a;
    public final /* synthetic */ TL_stars.TL_starGiftUnique b;
    public final /* synthetic */ TLRPC.InputPeer c;
    public final /* synthetic */ TLRPC.TL_textWithEntities d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ long f;
    public final /* synthetic */ ms7 g;
    public final /* synthetic */ Context h;
    public final /* synthetic */ long i;
    public final /* synthetic */ vnb j;
    public final /* synthetic */ vra k;
    public final /* synthetic */ d31 l;
    public final /* synthetic */ wra m;
    public final /* synthetic */ xra n;
    public final /* synthetic */ long o;

    public /* synthetic */ ct7(int i, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.InputPeer inputPeer, TLRPC.TL_textWithEntities tL_textWithEntities, boolean z, long j, ms7 ms7Var, Context context, long j2, vnb vnbVar, vra vraVar, d31 d31Var, wra wraVar, xra xraVar, long j3) {
        this.a = i;
        this.b = tL_starGiftUnique;
        this.c = inputPeer;
        this.d = tL_textWithEntities;
        this.e = z;
        this.f = j;
        this.g = ms7Var;
        this.h = context;
        this.i = j2;
        this.j = vnbVar;
        this.k = vraVar;
        this.l = d31Var;
        this.m = wraVar;
        this.n = xraVar;
        this.o = j3;
    }

    @Override // pcc
    public final void a(Object obj) {
        final pcc pccVar = (pcc) obj;
        final long j = this.f;
        final ms7 ms7Var = this.g;
        final TL_stars.TL_starGiftUnique tL_starGiftUnique = this.b;
        final Context context = this.h;
        final int i = this.a;
        final long j2 = this.i;
        final TLRPC.TL_textWithEntities tL_textWithEntities = this.d;
        final boolean z = this.e;
        final vnb vnbVar = this.j;
        final vra vraVar = this.k;
        final d31 d31Var = this.l;
        final wra wraVar = this.m;
        final xra xraVar = this.n;
        final long j3 = this.o;
        it7.r(i, tL_starGiftUnique, this.c, tL_textWithEntities, z, j, null, new icc() { // from class: ft7
            @Override // icc
            public final void a(Object obj2, Object obj3) {
                a35 a35Var = (a35) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                pcc pccVar2 = pccVar;
                if (a35Var != null && a35Var.b == j) {
                    pccVar2.a(a35Var);
                    return;
                }
                pccVar2.a(null);
                ms7 ms7Var2 = ms7Var;
                Context context2 = context;
                int i2 = i;
                vnb vnbVar2 = vnbVar;
                if (a35Var == null && (tL_error == null || !"STARGIFT_ONCHAIN_PRICE_CHANGED".equals(tL_error.text))) {
                    it7.w(context2, i2, vnbVar2, ms7Var2.j(), tL_error, j3);
                    return;
                }
                ms7Var2.dismiss();
                String M0 = ob6.M0(2131749387, null);
                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = tL_starGiftUnique;
                it7.v(tL_starGiftUnique2, M0);
                it7.e(context2, i2, tL_starGiftUnique2, j2, tL_textWithEntities, z, vnbVar2, vraVar, d31Var, wraVar, xraVar);
            }
        });
    }
}
