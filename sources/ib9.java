// default package

import android.content.Context;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
