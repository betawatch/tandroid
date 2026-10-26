package org.telegram.ui.Components.voip;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class s0 implements a5.i {
    public int a = 0;
    public int b;
    public final /* synthetic */ v0 c;

    public s0(v0 v0Var) {
        this.c = v0Var;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v2, types: [boolean] */
    @Override // a5.i
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

    @Override // a5.i
    public final void b(float f7, int i10, int i11) {
        v0 v0Var = this.c;
        v0Var.x = i10;
        v0Var.w = f7;
        v0Var.d();
    }

    @Override // a5.i
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
