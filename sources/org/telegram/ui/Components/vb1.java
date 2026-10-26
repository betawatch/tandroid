package org.telegram.ui.Components;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class vb1 {
    public final cb1 a;
    public final wb1[] b;
    public final double c;
    public final int d;
    public final int e;
    public final dc1 f;
    public final boolean g;
    public final boolean h;

    public vb1(cb1 cb1Var, wb1[] wb1VarArr, double d, int i10, int i11, float f7, float f10, int i12, int i13, int i14, dc1 dc1Var, boolean z10, boolean z11) {
        this.f = dc1Var;
        this.g = z10;
        this.h = z11;
        this.a = cb1Var;
        this.b = wb1VarArr;
        this.c = d;
        this.d = i10;
        this.e = i11;
    }

    public final boolean a() {
        if (!this.a.f()) {
            return false;
        }
        for (wb1 wb1Var : this.b) {
            if (!wb1Var.a.f()) {
                return false;
            }
        }
        return true;
    }
}
