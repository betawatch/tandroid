package org.telegram.messenger;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final /* synthetic */ class s7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaDataController b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ int[] e;

    public /* synthetic */ s7(MediaDataController mediaDataController, long j3, long j10, int[] iArr, int i10) {
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
