package org.telegram.ui.Components.voip;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class t0 implements z4.e {
    public int a = 0;
    public int b;
    public final /* synthetic */ w0 c;

    public t0(w0 w0Var) {
        this.c = w0Var;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v2, types: [boolean] */
    @Override // z4.e
    public final void a(int i10) {
        int i11 = this.a;
        w0 w0Var = this.c;
        if (i11 == 0) {
            if (i10 <= w0Var.y) {
                w0Var.n = 1;
            } else {
                w0Var.n = 2;
            }
            w0.a(w0Var);
            return;
        }
        if (i10 <= w0Var.y) {
            this.b = 1;
        } else {
            this.b = 2;
        }
    }

    @Override // z4.e
    public final void b(float f7, int i10, int i11) {
        w0 w0Var = this.c;
        w0Var.x = i10;
        w0Var.w = f7;
        w0Var.d();
    }

    @Override // z4.e
    public final void c(int i10) {
        this.a = i10;
        if (i10 == 0) {
            int i11 = this.b;
            w0 w0Var = this.c;
            w0Var.n = i11;
            w0.a(w0Var);
        }
    }
}
