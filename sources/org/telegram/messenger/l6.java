package org.telegram.messenger;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes.dex */
public final /* synthetic */ class l6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaController b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ l6(MediaController mediaController, boolean z10, int i10) {
        this.a = i10;
        this.b = mediaController;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$toggleRecordingPause$28(this.c);
                break;
            default:
                this.b.lambda$toggleRecordingPause$32(this.c);
                break;
        }
    }
}
