package org.telegram.ui.Components.voip;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class u0 implements z4.e {
    public int a = 0;
    public int b;
    public final /* synthetic */ x0 c;

    public u0(x0 x0Var) {
        this.c = x0Var;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v2, types: [boolean] */
    @Override // z4.e
    public final void a(int i10) {
        int i11 = this.a;
        x0 x0Var = this.c;
        if (i11 == 0) {
            if (i10 <= x0Var.y) {
                x0Var.n = 1;
            } else {
                x0Var.n = 2;
            }
            x0.a(x0Var);
            return;
        }
        if (i10 <= x0Var.y) {
            this.b = 1;
        } else {
            this.b = 2;
        }
    }

    @Override // z4.e
    public final void b(float f7, int i10, int i11) {
        x0 x0Var = this.c;
        x0Var.x = i10;
        x0Var.w = f7;
        x0Var.d();
    }

    @Override // z4.e
    public final void c(int i10) {
        this.a = i10;
        if (i10 == 0) {
            int i11 = this.b;
            x0 x0Var = this.c;
            x0Var.n = i11;
            x0.a(x0Var);
        }
    }
}
