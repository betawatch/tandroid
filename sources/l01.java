// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public class l01 {
    public Runnable a;
    public Runnable b;
    public Runnable c;

    public final void a(boolean z) {
        Runnable runnable = this.b;
        if (runnable != null) {
            runnable.run();
        }
        c(z);
    }

    public void b() {
        c(false);
    }

    public void c(boolean z) {
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
}
