package gf;

import org.telegram.messenger.o7;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public class e {
    public Runnable a;
    public Runnable b;
    public Runnable c;

    public e(Runnable runnable, Runnable runnable2) {
        this.a = runnable;
        this.c = runnable2;
    }

    public final void a(boolean z10) {
        Runnable runnable = this.b;
        if (runnable != null) {
            runnable.run();
        }
        c(z10);
    }

    public void b() {
        c(false);
    }

    public void c(boolean z10) {
        Runnable runnable = this.c;
        if (runnable != null) {
            runnable.run();
        }
    }

    public void d() {
        Runnable runnable = this.a;
        if (runnable != null) {
            runnable.run();
            this.a = null;
        }
    }

    public final void e(o7 o7Var) {
        this.b = o7Var;
    }
}
