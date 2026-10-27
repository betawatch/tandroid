package org.telegram.ui.Components;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class ac1 {
    public final db1 a;
    public final bc1[] b;
    public final double c;
    public final int d;
    public final int e;
    public final ic1 f;
    public final boolean g;
    public final boolean h;

    public ac1(db1 db1Var, bc1[] bc1VarArr, double d, int i10, int i11, float f7, float f10, int i12, int i13, int i14, ic1 ic1Var, boolean z10, boolean z11) {
        this.f = ic1Var;
        this.g = z10;
        this.h = z11;
        this.a = db1Var;
        this.b = bc1VarArr;
        this.c = d;
        this.d = i10;
        this.e = i11;
    }

    public final boolean a() {
        if (!this.a.f()) {
            return false;
        }
        for (bc1 bc1Var : this.b) {
            if (!bc1Var.a.f()) {
                return false;
            }
        }
        return true;
    }
}
