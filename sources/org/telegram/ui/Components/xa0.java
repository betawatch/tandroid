package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class xa0 extends Drawable {
    public final /* synthetic */ int a;
    public boolean b;
    public Object c;
    public Object d;
    public Object e;

    public xa0(int i9) {
        this.a = i9;
        switch (i9) {
            case 1:
                this.c = new Paint(1);
                Paint paint = new Paint(1);
                this.d = paint;
                this.e = new Matrix();
                paint.setStyle(Paint.Style.STROKE);
                paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(28.0f), new int[]{1308622847, 0, 452984831}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
                break;
        }
    }

    public void b(int i9, int i10) {
        ((Paint) this.c).setShader(new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(28.0f), new int[]{i9, i10}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        switch (this.a) {
            case 0:
                mi0 mi0Var = (mi0) this.d;
                mi0 mi0Var2 = (mi0) this.c;
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set(getBounds().centerX() - AndroidUtilities.dp(12.0f), getBounds().centerY() - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + getBounds().centerX(), AndroidUtilities.dp(12.0f) + getBounds().centerY());
                if (((mi0) this.e).y()) {
                    mi0 mi0Var3 = (mi0) this.e;
                    boolean z10 = this.b;
                    if (mi0Var3 != (z10 ? mi0Var2 : mi0Var)) {
                        if (z10) {
                            mi0Var = mi0Var2;
                        }
                        this.e = mi0Var;
                        mi0Var.K(mi0Var.e[0] - 1);
                    }
                }
                ((mi0) this.e).setBounds(rect);
                ((mi0) this.e).draw(canvas);
                break;
            default:
                Paint paint = (Paint) this.d;
                float dp = AndroidUtilities.dp(10.0f);
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(getBounds());
                Matrix matrix = (Matrix) this.e;
                matrix.reset();
                matrix.postTranslate(rectF.left, rectF.top);
                canvas.drawRoundRect(rectF, dp, dp, (Paint) this.c);
                if (this.b) {
                    float dp2 = AndroidUtilities.dp(1.0f);
                    paint.setStrokeWidth(dp2);
                    matrix.reset();
                    matrix.postTranslate(rectF.left, rectF.top);
                    float f10 = dp2 / 2.0f;
                    rectF.inset(f10, f10);
                    canvas.drawRoundRect(rectF, dp, dp, paint);
                    break;
                }
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        switch (this.a) {
            case 0:
                return AndroidUtilities.dp(24.0f);
            default:
                return super.getIntrinsicHeight();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        switch (this.a) {
            case 0:
                return AndroidUtilities.dp(24.0f);
            default:
                return super.getIntrinsicWidth();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        switch (this.a) {
        }
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i9) {
        switch (this.a) {
            case 0:
                ((mi0) this.c).setAlpha(i9);
                ((mi0) this.d).setAlpha(i9);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        switch (this.a) {
            case 0:
                ((mi0) this.c).setColorFilter(colorFilter);
                ((mi0) this.d).setColorFilter(colorFilter);
                break;
        }
    }

    private final void a(int i9) {
    }

    private final void c(ColorFilter colorFilter) {
    }
}
