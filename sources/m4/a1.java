package m4;

import hg.b2;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final /* synthetic */ class a1 implements h1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ h1 b;

    public /* synthetic */ a1(h1 h1Var, int i10) {
        this.a = i10;
        this.b = h1Var;
    }

    @Override // m4.h1
    public final Object c(f0 f0Var, w wVar, int i10) {
        switch (this.a) {
            case 0:
                if (f0Var != null) {
                    throw new ClassCastException();
                }
                j1.I0(null, wVar, i10, this.b, new i2.r(wVar, i10, 3));
                throw null;
            default:
                return j1.I0(f0Var, wVar, i10, this.b, new b2(f0Var, wVar, i10, 4));
        }
    }
}
