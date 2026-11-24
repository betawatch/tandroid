// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class o76 extends View {
    public final Drawable a;
    public final Paint b;
    public final Paint c;
    public final lm d;
    public boolean e;

    public o76(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.b = paint;
        Paint paint2 = new Paint(1);
        this.c = paint2;
        this.d = new lm(this, 0L, 320L, s33.h);
        ote.a(this);
        this.a = context.getResources().getDrawable(R.drawable.media_live_on).mutate();
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint2.setColor(-65536);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        paint.setStyle(style);
        paint.setColor(-1);
    }

    public final void a(boolean z, boolean z2) {
        if (this.e == z) {
            return;
        }
        this.e = z;
        if (!z2) {
            this.d.a(z);
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float d = this.d.d(!this.e);
        int width = getWidth();
        Drawable drawable = this.a;
        drawable.setBounds((width - drawable.getIntrinsicWidth()) / 2, (getHeight() - drawable.getIntrinsicHeight()) / 2, (drawable.getIntrinsicWidth() + getWidth()) / 2, (drawable.getIntrinsicHeight() + getHeight()) / 2);
        Rect bounds = drawable.getBounds();
        float width2 = (bounds.width() * 0.325f) + bounds.left;
        float height = (bounds.height() * 0.152f) + bounds.top;
        float height2 = bounds.bottom - (bounds.height() * 0.152f);
        float width3 = bounds.right - (bounds.width() * 0.101f);
        if (d > 0.0f) {
            float L = gl.L(4.0f);
            Paint paint = this.c;
            paint.setStrokeWidth(L);
            canvas.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, kk7.d4, 31);
            drawable.draw(canvas);
            if (this.e) {
                canvas.drawLine(width3 - gl.L(4.0f), height2 - gl.L(4.0f), gl.R1(width3 - gl.L(4.0f), gl.L(4.0f) + width2, d), gl.R1(height2 - gl.L(4.0f), gl.L(4.0f) + height, d), paint);
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
                canvas2.drawLine(width2 + gl.L(4.0f), height + gl.L(4.0f), gl.R1(gl.L(4.0f) + width2, width3 - gl.L(4.0f), d), gl.R1(gl.L(4.0f) + height, height2 - gl.L(4.0f), d), paint);
            }
            canvas2.restore();
        } else {
            canvas2 = canvas;
            drawable.draw(canvas2);
        }
        if (d > 0.0f) {
            float L2 = gl.L(2.0f);
            Paint paint2 = this.b;
            paint2.setStrokeWidth(L2);
            if (!this.e) {
                canvas.drawLine(width2, height, gl.R1(width2, width3, d), gl.R1(height, height2, d), paint2);
            } else {
                canvas2.drawLine(width3, height2, gl.R1(width3, width2, d), gl.R1(height2, height, d), paint2);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(gl.L(45.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gl.L(45.0f), TLObject.FLAG_30));
    }
}
