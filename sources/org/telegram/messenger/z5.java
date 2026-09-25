package org.telegram.messenger;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
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
