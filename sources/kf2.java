// default package

import android.graphics.Bitmap;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class kf2 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Bitmap c;

    public /* synthetic */ kf2(long j, Bitmap bitmap, byte b) {
        this.a = b;
        this.b = j;
        this.c = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        Bitmap bitmap = this.c;
        long j = this.b;
        switch (b) {
            case 0:
                f0f.d(f0f.c(j), bitmap);
                break;
            default:
                f0f.d("thumb_" + j, bitmap);
                break;
        }
    }
}
