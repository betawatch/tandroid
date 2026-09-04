package org.telegram.messenger;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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
