package org.telegram.messenger;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final /* synthetic */ class u6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaController b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ u6(MediaController mediaController, boolean z10, int i10) {
        this.a = i10;
        this.b = mediaController;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$toggleRecordingPause$30(this.c);
                break;
            default:
                this.b.lambda$toggleRecordingPause$34(this.c);
                break;
        }
    }
}
