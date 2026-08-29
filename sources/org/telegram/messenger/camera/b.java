package org.telegram.messenger.camera;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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
