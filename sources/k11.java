// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public class k11 {
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
