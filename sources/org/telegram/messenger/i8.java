package org.telegram.messenger;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes.dex */
public final /* synthetic */ class i8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ BaseController b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;

    public /* synthetic */ i8(BaseController baseController, long j3, long j10, int i10, int i11, int i12) {
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
