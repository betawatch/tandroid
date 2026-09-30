package org.telegram.messenger;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes.dex */
public final /* synthetic */ class g8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ BaseController b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;

    public /* synthetic */ g8(BaseController baseController, long j3, long j10, int i10, int i11, int i12) {
        this.a = i12;
        this.b = baseController;
        this.c = j3;
        this.d = j10;
        this.e = i10;
        this.f = i11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((MediaDataController) this.b).lambda$getMediaCountDatabase$139(this.c, this.d, this.e, this.f);
                break;
            case 1:
                ((MediaDataController) this.b).lambda$putMediaCountDatabase$138(this.c, this.d, this.e, this.f);
                break;
            default:
                ((MessagesStorage) this.b).lambda$updateRepliesMaxReadId$193(this.c, this.d, this.e, this.f);
                break;
        }
    }
}
