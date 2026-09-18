package ig;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class f {
    public Bitmap a;
    public Canvas b;
    public final RectF c = new RectF();
    public final Paint d;
    public final e6 e;
    public int f;
    public boolean g;

    public f(e6 e6Var) {
        Paint paint = new Paint(1);
        this.d = paint;
        this.f = 0;
        this.g = true;
        paint.setColor(0);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.e = e6Var;
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
            this.b.drawColor(j6.v0(j6.d6, this.e));
            this.b.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), this.d);
        }
        return this.a;
    }
}
