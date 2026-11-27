// default package

import android.view.View;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class bl4 {
    public final lm4 a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e = true;
    public boolean f;
    public long g;

    public bl4(lm4 lm4Var) {
        this.a = lm4Var;
    }

    public final void a() {
        if (this.f) {
            boolean z = this.b;
            lm4 lm4Var = this.a;
            if (z || this.c || this.d || !this.e) {
                jm4 jm4Var = lm4Var.b;
                if (jm4Var.e()) {
                    jm4Var.G = true;
                    jm4Var.x.start();
                    jm4Var.D.setEmpty();
                    return;
                }
                return;
            }
            View view = lm4Var.a;
            xk0 xk0Var = lm4Var.l;
            view.removeOnLayoutChangeListener(xk0Var);
            lm4Var.a.addOnLayoutChangeListener(xk0Var);
            lm4Var.c();
            this.g = System.currentTimeMillis();
        }
    }
}
