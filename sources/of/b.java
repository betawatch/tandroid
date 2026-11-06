package of;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class b implements Runnable {
    public final int a;
    public final Runnable b;

    public b(int i7, Runnable runnable) {
        this.a = i7;
        this.b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.run();
    }
}
