package com.google.android.gms.internal.play_billing;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes.dex */
public final class h4 {
    public Object a;
    public j4 b;
    public k4 c;
    public boolean d;

    public final void a(Object obj) {
        this.d = true;
        j4 j4Var = this.b;
        if (j4Var != null) {
            i4 i4Var = j4Var.b;
            i4Var.getClass();
            if (obj == null) {
                obj = g4.h;
            }
            if (g4.f.d(i4Var, null, obj)) {
                g4.d(i4Var);
                this.a = null;
                this.b = null;
                this.c = null;
            }
        }
    }

    public final void finalize() {
        k4 k4Var;
        j4 j4Var = this.b;
        if (j4Var != null) {
            i4 i4Var = j4Var.b;
            if (!i4Var.isDone()) {
                if (g4.f.d(i4Var, null, new g2(new c0.b("The completer object was garbage collected - this future would otherwise never complete. The tag was: ".concat(String.valueOf(this.a)), 4)))) {
                    g4.d(i4Var);
                }
            }
        }
        if (this.d || (k4Var = this.c) == null) {
            return;
        }
        k4Var.i(null);
    }
}
