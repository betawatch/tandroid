package org.telegram.ui.Components.voip;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class v0 implements c5.h {
    public int a = 0;
    public int b;
    public final /* synthetic */ x0 c;

    public v0(x0 x0Var) {
        this.c = x0Var;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v2, types: [boolean] */
    @Override // c5.h
    public final void a(int i7) {
        int i10 = this.a;
        x0 x0Var = this.c;
        if (i10 == 0) {
            if (i7 <= x0Var.E) {
                x0Var.n = 1;
            } else {
                x0Var.n = 2;
            }
            x0.a(x0Var);
            return;
        }
        if (i7 <= x0Var.E) {
            this.b = 1;
        } else {
            this.b = 2;
        }
    }

    @Override // c5.h
    public final void b(float f10, int i7, int i10) {
        x0 x0Var = this.c;
        x0Var.y = i7;
        x0Var.x = f10;
        x0Var.d();
    }

    @Override // c5.h
    public final void c(int i7) {
        this.a = i7;
        if (i7 == 0) {
            int i10 = this.b;
            x0 x0Var = this.c;
            x0Var.n = i10;
            x0.a(x0Var);
        }
    }
}
