package di;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final /* synthetic */ class x6 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ x6(int i10, int i11, int i12, Bitmap[] bitmapArr, Utilities.Callback callback) {
        this.b = i10;
        this.c = i11;
        this.d = i12;
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
                float f7 = this.d;
                path.addRoundRect(rectF, f7, f7, Path.Direction.CW);
                canvas.clipPath(path);
                for (int i10 = 0; i10 < bitmapArr.length; i10++) {
                    if (bitmapArr[i10] != null) {
                        canvas.save();
                        canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
                        float max = Math.max(createBitmap.getWidth() / bitmapArr[i10].getWidth(), createBitmap.getHeight() / bitmapArr[i10].getHeight());
                        canvas.scale(max, max);
                        canvas.translate((-bitmapArr[i10].getWidth()) / 2.0f, (-bitmapArr[i10].getHeight()) / 2.0f);
                        canvas.drawBitmap(bitmapArr[i10], 0.0f, 0.0f, (Paint) null);
                        canvas.restore();
                        AndroidUtilities.recycleBitmap(bitmapArr[i10]);
                    }
                }
                Utilities.stackBlurBitmap(createBitmap, 1);
                AndroidUtilities.runOnUIThread(new bi.s8(28, callback, createBitmap));
                break;
            default:
                ((MessagesStorage) this.e).lambda$getDialogs$240(this.b, this.c, this.d, (long[]) this.f);
                break;
        }
    }

    public /* synthetic */ x6(MessagesStorage messagesStorage, int i10, int i11, int i12, long[] jArr) {
        this.e = messagesStorage;
        this.b = i10;
        this.c = i11;
        this.d = i12;
        this.f = jArr;
    }
}
