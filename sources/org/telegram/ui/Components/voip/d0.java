package org.telegram.ui.Components.voip;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class d0 implements b5.h {
    public int a = 0;
    public int b;
    public final /* synthetic */ f0 c;

    public d0(f0 f0Var) {
        this.c = f0Var;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v2, types: [boolean] */
    @Override // b5.h
    public final void a(int i3) {
        int i10 = this.a;
        f0 f0Var = this.c;
        if (i10 == 0) {
            if (i3 <= f0Var.E) {
                f0Var.n = 1;
            } else {
                f0Var.n = 2;
            }
            f0.a(f0Var);
            return;
        }
        if (i3 <= f0Var.E) {
            this.b = 1;
        } else {
            this.b = 2;
        }
    }

    @Override // b5.h
    public final void b(float f10, int i3, int i10) {
        f0 f0Var = this.c;
        f0Var.y = i3;
        f0Var.x = f10;
        f0Var.d();
    }

    @Override // b5.h
    public final void c(int i3) {
        this.a = i3;
        if (i3 == 0) {
            int i10 = this.b;
            f0 f0Var = this.c;
            f0Var.n = i10;
            f0.a(f0Var);
        }
    }
}
