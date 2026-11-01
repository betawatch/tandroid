package org.telegram.ui.Components.voip;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class d0 implements z4.e {
    public int a = 0;
    public int b;
    public final /* synthetic */ f0 c;

    public d0(f0 f0Var) {
        this.c = f0Var;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v2, types: [boolean] */
    @Override // z4.e
    public final void a(int i10) {
        int i11 = this.a;
        f0 f0Var = this.c;
        if (i11 == 0) {
            if (i10 <= f0Var.D) {
                f0Var.n = 1;
            } else {
                f0Var.n = 2;
            }
            f0.a(f0Var);
            return;
        }
        if (i10 <= f0Var.D) {
            this.b = 1;
        } else {
            this.b = 2;
        }
    }

    @Override // z4.e
    public final void b(float f7, int i10, int i11) {
        f0 f0Var = this.c;
        f0Var.y = i10;
        f0Var.x = f7;
        f0Var.d();
    }

    @Override // z4.e
    public final void c(int i10) {
        this.a = i10;
        if (i10 == 0) {
            int i11 = this.b;
            f0 f0Var = this.c;
            f0Var.n = i11;
            f0.a(f0Var);
        }
    }
}
