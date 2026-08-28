package org.telegram.ui.Components.voip;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class r0 implements m2.e {
    public int a = 0;
    public int b;
    public final /* synthetic */ u0 c;

    public r0(u0 u0Var) {
        this.c = u0Var;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v2, types: [boolean] */
    @Override // m2.e
    public final void b(int i9) {
        int i10 = this.a;
        u0 u0Var = this.c;
        if (i10 == 0) {
            if (i9 <= u0Var.y) {
                u0Var.n = 1;
            } else {
                u0Var.n = 2;
            }
            u0.a(u0Var);
            return;
        }
        if (i9 <= u0Var.y) {
            this.b = 1;
        } else {
            this.b = 2;
        }
    }

    @Override // m2.e
    public final void c(float f10, int i9, int i10) {
        u0 u0Var = this.c;
        u0Var.x = i9;
        u0Var.w = f10;
        u0Var.d();
    }

    @Override // m2.e
    public final void d(int i9) {
        this.a = i9;
        if (i9 == 0) {
            int i10 = this.b;
            u0 u0Var = this.c;
            u0Var.n = i10;
            u0.a(u0Var);
        }
    }
}
