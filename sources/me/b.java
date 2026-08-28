package me;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class b implements Runnable {
    public final int a;
    public final Runnable b;

    public b(int i9, Runnable runnable) {
        this.a = i9;
        this.b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.run();
    }
}
