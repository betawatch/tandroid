// default package

import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Wallet.c;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class aq7 implements i8c {
    public final /* synthetic */ nu9 a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ int e;
    public final /* synthetic */ wjb f;
    public final /* synthetic */ TL_stars.TL_starGiftUnique g;
    public final /* synthetic */ long h;
    public final /* synthetic */ TLRPC.TL_textWithEntities i;
    public final /* synthetic */ boolean j;
    public final /* synthetic */ u21 k;
    public final /* synthetic */ t7a l;
    public final /* synthetic */ t7a m;

    public /* synthetic */ aq7(nu9 nu9Var, long j, long j2, Context context, int i, wjb wjbVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, TLRPC.TL_textWithEntities tL_textWithEntities, boolean z, u21 u21Var, t7a t7aVar, t7a t7aVar2) {
        this.a = nu9Var;
        this.b = j;
        this.c = j2;
        this.d = context;
        this.e = i;
        this.f = wjbVar;
        this.g = tL_starGiftUnique;
        this.h = j3;
        this.i = tL_textWithEntities;
        this.j = z;
        this.k = u21Var;
        this.l = t7aVar;
        this.m = t7aVar2;
    }

    @Override // i8c
    public final void a(Object obj, Object obj2) {
        Long l = (Long) obj;
        Boolean bool = Boolean.FALSE;
        nu9 nu9Var = this.a;
        nu9Var.a(bool);
        long longValue = l.longValue();
        long j = this.c;
        Context context = this.d;
        int i = this.e;
        wjb wjbVar = this.f;
        if (longValue <= 0 || l.longValue() + this.b < 100000000 + j) {
            mp7.Y0(context, i, wjbVar, j, 2131749614);
            return;
        }
        long longValue2 = l.longValue();
        uy5 uy5Var = new uy5(context, i, this.g, this.h, this.i, this.j, wjbVar, nu9Var, this.k, this.l, this.m);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, wjbVar, context);
        String M0 = k96.M0(2131749331, null);
        hd hdVar = alertDialog$Builder.a;
        hdVar.S = M0;
        hdVar.U = gl.T2(k96.a0(null, null, 2131749332, k96.a0(null, null, 2131749619, c.s(longValue2, false))));
        alertDialog$Builder.g(k96.M0(2131752577, null), null);
        alertDialog$Builder.j(k96.M0(2131746552, null), new lt0(longValue2, nu9Var, i, j, uy5Var));
        alertDialog$Builder.o();
    }
}
