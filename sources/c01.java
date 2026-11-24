// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public class c01 {
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
