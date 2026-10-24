package org.telegram.messenger.camera;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Camera2Session b;
    public final /* synthetic */ Runnable c;

    public /* synthetic */ b(Camera2Session camera2Session, Runnable runnable, int i10) {
        this.a = i10;
        this.b = camera2Session;
        this.c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$destroy$4(this.c);
                break;
            default:
                this.b.lambda$destroy$3(this.c);
                break;
        }
    }
}
