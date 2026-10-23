package org.telegram.ui.Components.voip;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes4.dex */
public final class s0 implements z4.f {
    public int a = 0;
    public int b;
    public final /* synthetic */ v0 c;

    public s0(v0 v0Var) {
        this.c = v0Var;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v2, types: [boolean] */
    @Override // z4.f
    public final void a(int i10) {
        int i11 = this.a;
        v0 v0Var = this.c;
        if (i11 == 0) {
            if (i10 <= v0Var.y) {
                v0Var.n = 1;
            } else {
                v0Var.n = 2;
            }
            v0.a(v0Var);
            return;
        }
        if (i10 <= v0Var.y) {
            this.b = 1;
        } else {
            this.b = 2;
        }
    }

    @Override // z4.f
    public final void b(float f7, int i10, int i11) {
        v0 v0Var = this.c;
        v0Var.x = i10;
        v0Var.w = f7;
        v0Var.d();
    }

    @Override // z4.f
    public final void c(int i10) {
        this.a = i10;
        if (i10 == 0) {
            int i11 = this.b;
            v0 v0Var = this.c;
            v0Var.n = i11;
            v0.a(v0Var);
        }
    }
}
