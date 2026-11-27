// default package

import android.content.Context;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class ib9 implements jb9 {
    public final /* synthetic */ vn1 a;
    public final /* synthetic */ d31 b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ w53 d;
    public final /* synthetic */ dec e;

    public ib9(vn1 vn1Var, d31 d31Var, Context context, w53 w53Var, dec decVar) {
        this.a = vn1Var;
        this.b = d31Var;
        this.c = context;
        this.d = w53Var;
        this.e = decVar;
    }

    @Override // jb9
    public final void d() {
        hl.d3(new gb9(this.a, this.b, this.c, this.d, (byte) 2), 200L);
    }

    @Override // jb9
    public final void f() {
        hl.d3(new z09(this.a, this.b, (byte) 11), 200L);
    }

    @Override // jb9
    public final void i() {
        this.e.run();
    }
}
