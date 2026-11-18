package org.telegram.ui.Components.voip;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class u0 implements c5.h {
    public int a = 0;
    public int b;
    public final /* synthetic */ w0 c;

    public u0(w0 w0Var) {
        this.c = w0Var;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v2, types: [boolean] */
    @Override // c5.h
    public final void a(int i7) {
        int i10 = this.a;
        w0 w0Var = this.c;
        if (i10 == 0) {
            if (i7 <= w0Var.E) {
                w0Var.n = 1;
            } else {
                w0Var.n = 2;
            }
            w0.a(w0Var);
            return;
        }
        if (i7 <= w0Var.E) {
            this.b = 1;
        } else {
            this.b = 2;
        }
    }

    @Override // c5.h
    public final void b(float f10, int i7, int i10) {
        w0 w0Var = this.c;
        w0Var.y = i7;
        w0Var.x = f10;
        w0Var.d();
    }

    @Override // c5.h
    public final void c(int i7) {
        this.a = i7;
        if (i7 == 0) {
            int i10 = this.b;
            w0 w0Var = this.c;
            w0Var.n = i10;
            w0.a(w0Var);
        }
    }
}
