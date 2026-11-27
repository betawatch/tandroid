// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
