package gi;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import java.io.Serializable;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.qr;
import org.telegram.messenger.u10;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ t5(int i3, int i10, int i11, Serializable serializable, Object obj, int i12) {
        this.a = i12;
        this.b = i3;
        this.c = i10;
        this.d = i11;
        this.e = serializable;
        this.f = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                Bitmap[] bitmapArr = (Bitmap[]) this.e;
                u10 u10Var = (u10) this.f;
                Bitmap createBitmap = Bitmap.createBitmap(this.b, this.c, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                Path path = new Path();
                RectF rectF = new RectF();
                rectF.set(0.0f, 0.0f, createBitmap.getWidth(), createBitmap.getHeight());
                float f10 = this.d;
                path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
                canvas.clipPath(path);
                for (int i3 = 0; i3 < bitmapArr.length; i3++) {
                    if (bitmapArr[i3] != null) {
                        canvas.save();
                        canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
                        float max = Math.max(createBitmap.getWidth() / bitmapArr[i3].getWidth(), createBitmap.getHeight() / bitmapArr[i3].getHeight());
                        canvas.scale(max, max);
                        canvas.translate((-bitmapArr[i3].getWidth()) / 2.0f, (-bitmapArr[i3].getHeight()) / 2.0f);
                        canvas.drawBitmap(bitmapArr[i3], 0.0f, 0.0f, (Paint) null);
                        canvas.restore();
                        org.telegram.messenger.g0.z2(bitmapArr[i3]);
                    }
                }
                Utilities.stackBlurBitmap(createBitmap, 1);
                org.telegram.messenger.g0.h3(new g2.c(13, u10Var, createBitmap));
                break;
            case 1:
                ((qr) this.e).B0(this.b, this.c, this.d, (long[]) this.f);
                break;
            default:
                ConnectionsManager.lambda$onCaptchaCheck$28(this.b, this.c, this.d, (String) this.e, (String) this.f);
                break;
        }
    }

    public /* synthetic */ t5(qr qrVar, int i3, int i10, int i11, long[] jArr) {
        this.a = 1;
        this.e = qrVar;
        this.b = i3;
        this.c = i10;
        this.d = i11;
        this.f = jArr;
    }
}
