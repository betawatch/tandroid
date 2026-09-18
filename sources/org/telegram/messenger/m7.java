package org.telegram.messenger;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes.dex */
public final /* synthetic */ class m7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaDataController b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ int[] e;

    public /* synthetic */ m7(MediaDataController mediaDataController, long j3, long j10, int[] iArr, int i10) {
        this.a = i10;
        this.b = mediaDataController;
        this.c = j3;
        this.d = j10;
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
