package ig;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.i6;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class f {
    public Bitmap a;
    public Canvas b;
    public final RectF c = new RectF();
    public final Paint d;
    public final d6 e;
    public int f;
    public boolean g;

    public f(d6 d6Var) {
        Paint paint = new Paint(1);
        this.d = paint;
        this.f = 0;
        this.g = true;
        paint.setColor(0);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.e = d6Var;
    }

    public final Bitmap a(int i10, int i11) {
        int i12 = (i10 + i11) << 10;
        if (i12 != this.f || this.g) {
            this.g = false;
            this.f = i12;
            this.a = Bitmap.createBitmap(i11, i10, Bitmap.Config.ARGB_8888);
            this.b = new Canvas(this.a);
            RectF rectF = this.c;
            rectF.set(0.0f, 0.0f, i11, i10);
            this.b.drawColor(i6.v0(i6.d6, this.e));
            this.b.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), this.d);
        }
        return this.a;
    }
}
