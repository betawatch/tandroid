package jg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class f {
    public Bitmap a;
    public Canvas b;
    public final RectF c = new RectF();
    public final Paint d;
    public final g6 e;
    public int f;
    public boolean g;
    public int h;

    public f(g6 g6Var) {
        Paint paint = new Paint(1);
        this.d = paint;
        this.f = 0;
        this.g = true;
        paint.setColor(0);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.e = g6Var;
    }

    public final Bitmap a(int i10, int i11) {
        Canvas canvas;
        int w02 = k6.w0(k6.d6, this.e);
        int i12 = (i10 + i11) << 10;
        int i13 = this.f;
        Paint paint = this.d;
        RectF rectF = this.c;
        if (i12 != i13 || this.g) {
            this.g = false;
            this.f = i12;
            this.a = Bitmap.createBitmap(i11, i10, Bitmap.Config.ARGB_8888);
            this.b = new Canvas(this.a);
            rectF.set(0.0f, 0.0f, i11, i10);
            Canvas canvas2 = this.b;
            this.h = w02;
            canvas2.drawColor(w02);
            this.b.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint);
        } else if (w02 != this.h && (canvas = this.b) != null && this.a != null) {
            this.h = w02;
            canvas.drawColor(w02, PorterDuff.Mode.SRC);
            this.b.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint);
        }
        return this.a;
    }
}
