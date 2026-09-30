package org.telegram.messenger;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes.dex */
public final /* synthetic */ class z5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaController b;
    public final /* synthetic */ int c;

    public /* synthetic */ z5(MediaController mediaController, int i10, int i11) {
        this.a = i11;
        this.b = mediaController;
        this.c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$onAudioFocusChange$5(this.c);
                break;
            default:
                this.b.lambda$stopRecording$42(this.c);
                break;
        }
    }
}
