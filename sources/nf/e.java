package nf;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
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

    public final void e(Runnable runnable) {
        this.b = runnable;
    }
}
