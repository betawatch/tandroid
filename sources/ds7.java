// default package

import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Wallet.c;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class ds7 implements jac {
    public final /* synthetic */ ts9 a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ int e;
    public final /* synthetic */ ylb f;
    public final /* synthetic */ TL_stars.TL_starGiftUnique g;
    public final /* synthetic */ long h;
    public final /* synthetic */ TLRPC.TL_textWithEntities i;
    public final /* synthetic */ boolean j;
    public final /* synthetic */ c41 k;
    public final /* synthetic */ e6a l;
    public final /* synthetic */ e6a m;

    public /* synthetic */ ds7(ts9 ts9Var, long j, long j2, Context context, int i, ylb ylbVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, TLRPC.TL_textWithEntities tL_textWithEntities, boolean z, c41 c41Var, e6a e6aVar, e6a e6aVar2) {
        this.a = ts9Var;
        this.b = j;
        this.c = j2;
        this.d = context;
        this.e = i;
        this.f = ylbVar;
        this.g = tL_starGiftUnique;
        this.h = j3;
        this.i = tL_textWithEntities;
        this.j = z;
        this.k = c41Var;
        this.l = e6aVar;
        this.m = e6aVar2;
    }

    @Override // jac
    public final void a(Object obj, Object obj2) {
        Long l = (Long) obj;
        Boolean bool = Boolean.FALSE;
        ts9 ts9Var = this.a;
        ts9Var.a(bool);
        long longValue = l.longValue();
        long j = this.c;
        Context context = this.d;
        int i = this.e;
        ylb ylbVar = this.f;
        if (longValue <= 0 || l.longValue() + this.b < 100000000 + j) {
            pr7.Y0(context, i, ylbVar, j, 2131749563);
            return;
        }
        long longValue2 = l.longValue();
        u06 u06Var = new u06(context, i, this.g, this.h, this.i, this.j, ylbVar, ts9Var, this.k, this.l, this.m);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ylbVar, context);
        String M0 = jb6.M0(2131749280, null);
        he heVar = alertDialog$Builder.a;
        heVar.S = M0;
        heVar.U = gm.S2(jb6.a0(null, null, 2131749281, jb6.a0(null, null, 2131749568, c.s(longValue2, false))));
        alertDialog$Builder.g(jb6.M0(2131752542, null), null);
        alertDialog$Builder.j(jb6.M0(2131746478, null), new tu0(longValue2, ts9Var, i, j, u06Var));
        alertDialog$Builder.o();
    }
}
