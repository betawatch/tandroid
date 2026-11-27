// default package

import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Wallet.c;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class gt7 implements icc {
    public final /* synthetic */ vra a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ int e;
    public final /* synthetic */ vnb f;
    public final /* synthetic */ TL_stars.TL_starGiftUnique g;
    public final /* synthetic */ long h;
    public final /* synthetic */ TLRPC.TL_textWithEntities i;
    public final /* synthetic */ boolean j;
    public final /* synthetic */ d31 k;
    public final /* synthetic */ wra l;
    public final /* synthetic */ xra m;

    public /* synthetic */ gt7(vra vraVar, long j, long j2, Context context, int i, vnb vnbVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, TLRPC.TL_textWithEntities tL_textWithEntities, boolean z, d31 d31Var, wra wraVar, xra xraVar) {
        this.a = vraVar;
        this.b = j;
        this.c = j2;
        this.d = context;
        this.e = i;
        this.f = vnbVar;
        this.g = tL_starGiftUnique;
        this.h = j3;
        this.i = tL_textWithEntities;
        this.j = z;
        this.k = d31Var;
        this.l = wraVar;
        this.m = xraVar;
    }

    @Override // icc
    public final void a(Object obj, Object obj2) {
        Long l = (Long) obj;
        Boolean bool = Boolean.FALSE;
        vra vraVar = this.a;
        vraVar.a(bool);
        long longValue = l.longValue();
        long j = this.c;
        Context context = this.d;
        int i = this.e;
        vnb vnbVar = this.f;
        if (longValue <= 0 || l.longValue() + this.b < 100000000 + j) {
            ms7.Z0(context, i, vnbVar, j, 2131749575);
            return;
        }
        long longValue2 = l.longValue();
        v06 v06Var = new v06(context, i, this.g, this.h, this.i, this.j, vnbVar, vraVar, this.k, this.l, this.m);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, vnbVar, context);
        String M0 = ob6.M0(2131749277, null);
        id idVar = alertDialog$Builder.a;
        idVar.S = M0;
        idVar.U = hl.S2(ob6.a0(null, null, 2131749278, ob6.a0(null, null, 2131749580, c.s(longValue2, false))));
        alertDialog$Builder.g(ob6.M0(2131752570, null), null);
        alertDialog$Builder.j(ob6.M0(2131746472, null), new tt0(longValue2, vraVar, i, j, v06Var));
        alertDialog$Builder.o();
    }
}
