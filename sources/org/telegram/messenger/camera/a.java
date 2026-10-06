package org.telegram.messenger.camera;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Camera2Session b;

    public /* synthetic */ a(Camera2Session camera2Session, int i10) {
        this.a = i10;
        this.b = camera2Session;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$new$0();
                break;
            default:
                this.b.lambda$checkOpen$2();
                break;
        }
    }
}
