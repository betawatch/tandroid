package kh;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class n6 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ n6(int i9, int i10, int i11, Bitmap[] bitmapArr, Utilities.Callback callback) {
        this.b = i9;
        this.c = i10;
        this.d = i11;
        this.e = bitmapArr;
        this.f = callback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                Bitmap[] bitmapArr = (Bitmap[]) this.e;
                Utilities.Callback callback = (Utilities.Callback) this.f;
                Bitmap createBitmap = Bitmap.createBitmap(this.b, this.c, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                Path path = new Path();
                RectF rectF = new RectF();
                rectF.set(0.0f, 0.0f, createBitmap.getWidth(), createBitmap.getHeight());
                float f10 = this.d;
                path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
                canvas.clipPath(path);
                for (int i9 = 0; i9 < bitmapArr.length; i9++) {
                    if (bitmapArr[i9] != null) {
                        canvas.save();
                        canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
                        float max = Math.max(createBitmap.getWidth() / bitmapArr[i9].getWidth(), createBitmap.getHeight() / bitmapArr[i9].getHeight());
                        canvas.scale(max, max);
                        canvas.translate((-bitmapArr[i9].getWidth()) / 2.0f, (-bitmapArr[i9].getHeight()) / 2.0f);
                        canvas.drawBitmap(bitmapArr[i9], 0.0f, 0.0f, (Paint) null);
                        canvas.restore();
                        AndroidUtilities.recycleBitmap(bitmapArr[i9]);
                    }
                }
                Utilities.stackBlurBitmap(createBitmap, 1);
                AndroidUtilities.runOnUIThread(new ih.j7(17, callback, createBitmap));
                break;
            default:
                ((MessagesStorage) this.e).lambda$getDialogs$240(this.b, this.c, this.d, (long[]) this.f);
                break;
        }
    }

    public /* synthetic */ n6(MessagesStorage messagesStorage, int i9, int i10, int i11, long[] jArr) {
        this.e = messagesStorage;
        this.b = i9;
        this.c = i10;
        this.d = i11;
        this.f = jArr;
    }
}
