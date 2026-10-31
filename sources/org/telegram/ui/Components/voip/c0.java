package org.telegram.ui.Components.voip;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class c0 implements z4.e {
    public int a = 0;
    public int b;
    public final /* synthetic */ e0 c;

    public c0(e0 e0Var) {
        this.c = e0Var;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v2, types: [boolean] */
    @Override // z4.e
    public final void a(int i10) {
        int i11 = this.a;
        e0 e0Var = this.c;
        if (i11 == 0) {
            if (i10 <= e0Var.D) {
                e0Var.n = 1;
            } else {
                e0Var.n = 2;
            }
            e0.a(e0Var);
            return;
        }
        if (i10 <= e0Var.D) {
            this.b = 1;
        } else {
            this.b = 2;
        }
    }

    @Override // z4.e
    public final void b(float f7, int i10, int i11) {
        e0 e0Var = this.c;
        e0Var.y = i10;
        e0Var.x = f7;
        e0Var.d();
    }

    @Override // z4.e
    public final void c(int i10) {
        this.a = i10;
        if (i10 == 0) {
            int i11 = this.b;
            e0 e0Var = this.c;
            e0Var.n = i11;
            e0.a(e0Var);
        }
    }
}
