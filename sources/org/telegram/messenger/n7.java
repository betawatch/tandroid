package org.telegram.messenger;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes.dex */
public final /* synthetic */ class n7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaDataController b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ int[] e;

    public /* synthetic */ n7(MediaDataController mediaDataController, long j10, long j11, int[] iArr, int i10) {
        this.a = i10;
        this.b = mediaDataController;
        this.c = j10;
        this.d = j11;
        this.e = iArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$getMediaCounts$128(this.c, this.d, this.e);
                break;
            case 1:
                this.b.lambda$getMediaCounts$127(this.c, this.d, this.e);
                break;
            default:
                this.b.lambda$getMediaCounts$130(this.c, this.d, this.e);
                break;
        }
    }
}
