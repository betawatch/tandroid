package com.google.android.gms.internal.play_billing;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public final class i4 {
    public Object a;
    public k4 b;
    public l4 c;
    public boolean d;

    public final void a(Object obj) {
        this.d = true;
        k4 k4Var = this.b;
        if (k4Var != null) {
            j4 j4Var = k4Var.b;
            j4Var.getClass();
            if (obj == null) {
                obj = h4.h;
            }
            if (h4.f.d(j4Var, null, obj)) {
                h4.d(j4Var);
                this.a = null;
                this.b = null;
                this.c = null;
            }
        }
    }

    public final void finalize() {
        l4 l4Var;
        k4 k4Var = this.b;
        if (k4Var != null) {
            j4 j4Var = k4Var.b;
            if (!j4Var.isDone()) {
                if (h4.f.d(j4Var, null, new g2(new c0.b("The completer object was garbage collected - this future would otherwise never complete. The tag was: ".concat(String.valueOf(this.a)), 4)))) {
                    h4.d(j4Var);
                }
            }
        }
        if (this.d || (l4Var = this.c) == null) {
            return;
        }
        l4Var.i(null);
    }
}
