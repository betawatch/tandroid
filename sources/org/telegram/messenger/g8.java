package org.telegram.messenger;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes.dex */
public final /* synthetic */ class g8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ BaseController b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;

    public /* synthetic */ g8(BaseController baseController, long j10, long j11, int i10, int i11, int i12) {
        this.a = i12;
        this.b = baseController;
        this.c = j10;
        this.d = j11;
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
