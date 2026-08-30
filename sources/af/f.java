package af;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public class f {
    public Runnable a;
    public Runnable b;
    public Runnable c;

    public f(Runnable runnable, Runnable runnable2) {
        this.a = runnable;
        this.c = runnable2;
    }

    public final void a(boolean z4) {
        Runnable runnable = this.b;
        if (runnable != null) {
            runnable.run();
        }
        c(z4);
    }

    public void b() {
        c(false);
    }

    public void c(boolean z4) {
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

    public final void e(Runnable runnable) {
        this.b = runnable;
    }
}
