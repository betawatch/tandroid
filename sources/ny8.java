// default package

import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Paint;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class ny8 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wy8 b;
    public final /* synthetic */ int c;

    public /* synthetic */ ny8(wy8 wy8Var, int i, byte b) {
        this.a = b;
        this.b = wy8Var;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte[] bArr;
        switch (this.a) {
            case 0:
                wy8 wy8Var = this.b;
                int i = this.c;
                synchronized (wy8.class) {
                    if (wy8.M9 != null) {
                        bArr = wy8.M9;
                    } else {
                        float L = gm.L(30.0f) / 4.0f;
                        int ceil = (int) Math.ceil(3.0f * r0);
                        int ceil2 = ((int) Math.ceil(L)) + ceil + 1;
                        int i2 = (ceil2 << 1) + 2;
                        Bitmap createBitmap = Bitmap.createBitmap(i2, i2, Bitmap.Config.ARGB_8888);
                        Paint paint = new Paint(1);
                        paint.setMaskFilter(new BlurMaskFilter(aq1.f(((gm.L(24.0f) * 0.57735f) + 0.5f) / 4.0f, 0.5f, 0.57735f, 0.1f), BlurMaskFilter.Blur.NORMAL));
                        float f = ceil;
                        float f2 = i2 - ceil;
                        new Canvas(createBitmap).drawRoundRect(f, f, f2, f2, L, L, paint);
                        Bitmap extractAlpha = createBitmap.extractAlpha();
                        createBitmap.recycle();
                        int rowBytes = extractAlpha.getRowBytes();
                        byte[] bArr2 = new byte[rowBytes * i2];
                        byte[] bArr3 = new byte[i2 * i2];
                        extractAlpha.copyPixelsToBuffer(ByteBuffer.wrap(bArr2));
                        extractAlpha.recycle();
                        for (int i3 = 0; i3 < i2; i3++) {
                            System.arraycopy(bArr2, i3 * rowBytes, bArr3, i3 * i2, i2);
                        }
                        wy8.N9 = i2;
                        wy8.O9 = ceil;
                        wy8.P9 = ceil2;
                        wy8.M9 = bArr3;
                        bArr = bArr3;
                    }
                }
                int i4 = wy8.N9;
                Bitmap createBitmap2 = Bitmap.createBitmap(i4, i4, Bitmap.Config.ARGB_8888);
                int[] iArr = new int[i4 * i4];
                wy8.s(iArr, bArr, i);
                createBitmap2.setPixels(iArr, 0, i4, 0, 0, i4, i4);
                createBitmap2.prepareToDraw();
                gm.c3(new v36((Object) wy8Var, (Object) createBitmap2, (Object) iArr, i, (byte) 22));
                return;
            case 1:
                this.b.F0(this.c);
                return;
            default:
                this.b.F0(this.c);
                return;
        }
    }
}
