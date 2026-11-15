package hi;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import java.io.Serializable;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.vr;
import org.telegram.messenger.z10;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class u5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ u5(int i7, int i10, int i11, Serializable serializable, Object obj, int i12) {
        this.a = i12;
        this.b = i7;
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
                z10 z10Var = (z10) this.f;
                Bitmap createBitmap = Bitmap.createBitmap(this.b, this.c, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                Path path = new Path();
                RectF rectF = new RectF();
                rectF.set(0.0f, 0.0f, createBitmap.getWidth(), createBitmap.getHeight());
                float f10 = this.d;
                path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
                canvas.clipPath(path);
                for (int i7 = 0; i7 < bitmapArr.length; i7++) {
                    if (bitmapArr[i7] != null) {
                        canvas.save();
                        canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
                        float max = Math.max(createBitmap.getWidth() / bitmapArr[i7].getWidth(), createBitmap.getHeight() / bitmapArr[i7].getHeight());
                        canvas.scale(max, max);
                        canvas.translate((-bitmapArr[i7].getWidth()) / 2.0f, (-bitmapArr[i7].getHeight()) / 2.0f);
                        canvas.drawBitmap(bitmapArr[i7], 0.0f, 0.0f, (Paint) null);
                        canvas.restore();
                        org.telegram.messenger.g0.z2(bitmapArr[i7]);
                    }
                }
                Utilities.stackBlurBitmap(createBitmap, 1);
                org.telegram.messenger.g0.h3(new h4(2, z10Var, createBitmap));
                break;
            case 1:
                ((vr) this.e).B0(this.b, this.c, this.d, (long[]) this.f);
                break;
            default:
                ConnectionsManager.lambda$onCaptchaCheck$28(this.b, this.c, this.d, (String) this.e, (String) this.f);
                break;
        }
    }

    public /* synthetic */ u5(vr vrVar, int i7, int i10, int i11, long[] jArr) {
        this.a = 1;
        this.e = vrVar;
        this.b = i7;
        this.c = i10;
        this.d = i11;
        this.f = jArr;
    }
}
