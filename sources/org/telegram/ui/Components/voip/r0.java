package org.telegram.ui.Components.voip;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class r0 implements m2.f {
    public int a = 0;
    public int b;
    public final /* synthetic */ u0 c;

    public r0(u0 u0Var) {
        this.c = u0Var;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v2, types: [boolean] */
    @Override // m2.f
    public final void a(int i10) {
        int i11 = this.a;
        u0 u0Var = this.c;
        if (i11 == 0) {
            if (i10 <= u0Var.y) {
                u0Var.n = 1;
            } else {
                u0Var.n = 2;
            }
            u0.a(u0Var);
            return;
        }
        if (i10 <= u0Var.y) {
            this.b = 1;
        } else {
            this.b = 2;
        }
    }

    @Override // m2.f
    public final void b(float f10, int i10, int i11) {
        u0 u0Var = this.c;
        u0Var.x = i10;
        u0Var.w = f10;
        u0Var.d();
    }

    @Override // m2.f
    public final void c(int i10) {
        this.a = i10;
        if (i10 == 0) {
            int i11 = this.b;
            u0 u0Var = this.c;
            u0Var.n = i11;
            u0.a(u0Var);
        }
    }
}
