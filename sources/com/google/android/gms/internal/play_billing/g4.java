package com.google.android.gms.internal.play_billing;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class g4 {
    public Object a;
    public i4 b;
    public j4 c;
    public boolean d;

    public final void a(Object obj) {
        this.d = true;
        i4 i4Var = this.b;
        if (i4Var != null) {
            h4 h4Var = i4Var.b;
            h4Var.getClass();
            if (obj == null) {
                obj = f4.h;
            }
            if (f4.f.d(h4Var, null, obj)) {
                f4.c(h4Var);
                this.a = null;
                this.b = null;
                this.c = null;
            }
        }
    }

    public final void finalize() {
        j4 j4Var;
        i4 i4Var = this.b;
        if (i4Var != null) {
            h4 h4Var = i4Var.b;
            if (!h4Var.isDone()) {
                if (f4.f.d(h4Var, null, new f2(new c0.b("The completer object was garbage collected - this future would otherwise never complete. The tag was: ".concat(String.valueOf(this.a)), 4)))) {
                    f4.c(h4Var);
                }
            }
        }
        if (this.d || (j4Var = this.c) == null) {
            return;
        }
        j4Var.h(null);
    }
}
