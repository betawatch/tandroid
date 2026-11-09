package org.telegram.ui.Components.voip;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class r0 implements c5.g {
    public int a = 0;
    public int b;
    public final /* synthetic */ t0 c;

    public r0(t0 t0Var) {
        this.c = t0Var;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v2, types: [boolean] */
    @Override // c5.g
    public final void a(int i7) {
        int i10 = this.a;
        t0 t0Var = this.c;
        if (i10 == 0) {
            if (i7 <= t0Var.D) {
                t0Var.n = 1;
            } else {
                t0Var.n = 2;
            }
            t0.a(t0Var);
            return;
        }
        if (i7 <= t0Var.D) {
            this.b = 1;
        } else {
            this.b = 2;
        }
    }

    @Override // c5.g
    public final void b(float f10, int i7, int i10) {
        t0 t0Var = this.c;
        t0Var.y = i7;
        t0Var.x = f10;
        t0Var.d();
    }

    @Override // c5.g
    public final void c(int i7) {
        this.a = i7;
        if (i7 == 0) {
            int i10 = this.b;
            t0 t0Var = this.c;
            t0Var.n = i10;
            t0.a(t0Var);
        }
    }
}
