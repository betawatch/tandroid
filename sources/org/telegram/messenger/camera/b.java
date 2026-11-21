package org.telegram.messenger.camera;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Camera2Session b;
    public final /* synthetic */ Runnable c;

    public /* synthetic */ b(Camera2Session camera2Session, Runnable runnable, int i7) {
        this.a = i7;
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
