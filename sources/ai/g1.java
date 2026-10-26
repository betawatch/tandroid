package ai;

import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Paint;
import java.nio.ByteBuffer;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class g1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ t1 b;
    public final /* synthetic */ int c;

    public /* synthetic */ g1(t1 t1Var, int i10, int i11) {
        this.a = i11;
        this.b = t1Var;
        this.c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte[] bArr;
        switch (this.a) {
            case 0:
                t1 t1Var = this.b;
                int i10 = this.c;
                synchronized (t1.class) {
                    if (t1.O9 != null) {
                        bArr = t1.O9;
                    } else {
                        float x9 = c3.h0.x(AndroidUtilities.dp(24.0f), 0.57735f, 0.5f, 4.0f);
                        float dp = AndroidUtilities.dp(30.0f) / 4.0f;
                        int ceil = (int) Math.ceil(3.0f * x9);
                        int ceil2 = ((int) Math.ceil(dp)) + ceil + 1;
                        int i11 = (ceil2 * 2) + 2;
                        Bitmap createBitmap = Bitmap.createBitmap(i11, i11, Bitmap.Config.ARGB_8888);
                        Paint paint = new Paint(1);
                        paint.setMaskFilter(new BlurMaskFilter(Math.max(0.1f, (x9 - 0.5f) / 0.57735f), BlurMaskFilter.Blur.NORMAL));
                        float f7 = ceil;
                        float f10 = i11 - ceil;
                        new Canvas(createBitmap).drawRoundRect(f7, f7, f10, f10, dp, dp, paint);
                        Bitmap extractAlpha = createBitmap.extractAlpha();
                        createBitmap.recycle();
                        int rowBytes = extractAlpha.getRowBytes();
                        byte[] bArr2 = new byte[rowBytes * i11];
                        byte[] bArr3 = new byte[i11 * i11];
                        extractAlpha.copyPixelsToBuffer(ByteBuffer.wrap(bArr2));
                        extractAlpha.recycle();
                        for (int i12 = 0; i12 < i11; i12++) {
                            System.arraycopy(bArr2, i12 * rowBytes, bArr3, i12 * i11, i11);
                        }
                        t1.P9 = i11;
                        t1.Q9 = ceil;
                        t1.R9 = ceil2;
                        t1.O9 = bArr3;
                        bArr = bArr3;
                    }
                }
                int i13 = t1.P9;
                Bitmap createBitmap2 = Bitmap.createBitmap(i13, i13, Bitmap.Config.ARGB_8888);
                int[] iArr = new int[i13 * i13];
                t1.s(iArr, bArr, i10);
                createBitmap2.setPixels(iArr, 0, i13, 0, 0, i13, i13);
                createBitmap2.prepareToDraw();
                AndroidUtilities.runOnUIThread(new h1(t1Var, createBitmap2, iArr, i10, 1));
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
