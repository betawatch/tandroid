package com.google.android.gms.internal.play_billing;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
