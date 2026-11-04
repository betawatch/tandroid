package bi;

import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Paint;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a1 b;
    public final /* synthetic */ int c;

    public /* synthetic */ p0(a1 a1Var, int i3, int i10) {
        this.a = i10;
        this.b = a1Var;
        this.c = i3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte[] bArr;
        switch (this.a) {
            case 0:
                a1 a1Var = this.b;
                int i3 = this.c;
                synchronized (a1.class) {
                    if (a1.O9 != null) {
                        bArr = a1.O9;
                    } else {
                        float x10 = com.google.android.recaptcha.internal.a.x(org.telegram.messenger.g0.L(24.0f), 0.57735f, 0.5f, 4.0f);
                        float L = org.telegram.messenger.g0.L(30.0f) / 4.0f;
                        int ceil = (int) Math.ceil(3.0f * x10);
                        int ceil2 = ((int) Math.ceil(L)) + ceil + 1;
                        int i10 = (ceil2 * 2) + 2;
                        Bitmap createBitmap = Bitmap.createBitmap(i10, i10, Bitmap.Config.ARGB_8888);
                        Paint paint = new Paint(1);
                        paint.setMaskFilter(new BlurMaskFilter(Math.max(0.1f, (x10 - 0.5f) / 0.57735f), BlurMaskFilter.Blur.NORMAL));
                        float f10 = ceil;
                        float f11 = i10 - ceil;
                        new Canvas(createBitmap).drawRoundRect(f10, f10, f11, f11, L, L, paint);
                        Bitmap extractAlpha = createBitmap.extractAlpha();
                        createBitmap.recycle();
                        int rowBytes = extractAlpha.getRowBytes();
                        byte[] bArr2 = new byte[rowBytes * i10];
                        byte[] bArr3 = new byte[i10 * i10];
                        extractAlpha.copyPixelsToBuffer(ByteBuffer.wrap(bArr2));
                        extractAlpha.recycle();
                        for (int i11 = 0; i11 < i10; i11++) {
                            System.arraycopy(bArr2, i11 * rowBytes, bArr3, i11 * i10, i10);
                        }
                        a1.P9 = i10;
                        a1.Q9 = ceil;
                        a1.R9 = ceil2;
                        a1.O9 = bArr3;
                        bArr = bArr3;
                    }
                }
                int i12 = a1.P9;
                Bitmap createBitmap2 = Bitmap.createBitmap(i12, i12, Bitmap.Config.ARGB_8888);
                int[] iArr = new int[i12 * i12];
                a1.s(iArr, bArr, i3);
                createBitmap2.setPixels(iArr, 0, i12, 0, 0, i12, i12);
                createBitmap2.prepareToDraw();
                org.telegram.messenger.g0.h3(new q0(a1Var, createBitmap2, iArr, i3, 1));
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
