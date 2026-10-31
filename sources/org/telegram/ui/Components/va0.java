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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class va0 extends Drawable {
    public final /* synthetic */ int a;
    public boolean b;
    public Object c;
    public Object d;
    public Object e;

    public va0(int i10) {
        this.a = i10;
        switch (i10) {
            case 1:
                this.c = new Paint(1);
                Paint paint = new Paint(1);
                this.d = paint;
                this.e = new Matrix();
                paint.setStyle(Paint.Style.STROKE);
                paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, org.telegram.messenger.i0.L(28.0f), new int[]{1308622847, 0, 452984831}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
                break;
        }
    }

    public void b(int i10, int i11) {
        ((Paint) this.c).setShader(new LinearGradient(0.0f, 0.0f, 0.0f, org.telegram.messenger.i0.L(28.0f), new int[]{i10, i11}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        switch (this.a) {
            case 0:
                bi0 bi0Var = (bi0) this.d;
                bi0 bi0Var2 = (bi0) this.c;
                Rect rect = org.telegram.messenger.i0.Q;
                rect.set(getBounds().centerX() - org.telegram.messenger.i0.L(12.0f), getBounds().centerY() - org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(12.0f) + getBounds().centerX(), org.telegram.messenger.i0.L(12.0f) + getBounds().centerY());
                if (((bi0) this.e).A()) {
                    bi0 bi0Var3 = (bi0) this.e;
                    boolean z10 = this.b;
                    if (bi0Var3 != (z10 ? bi0Var2 : bi0Var)) {
                        if (z10) {
                            bi0Var = bi0Var2;
                        }
                        this.e = bi0Var;
                        bi0Var.M(bi0Var.e[0] - 1);
                    }
                }
                ((bi0) this.e).setBounds(rect);
                ((bi0) this.e).draw(canvas);
                break;
            default:
                Paint paint = (Paint) this.d;
                float L = org.telegram.messenger.i0.L(10.0f);
                RectF rectF = org.telegram.messenger.i0.P;
                rectF.set(getBounds());
                Matrix matrix = (Matrix) this.e;
                matrix.reset();
                matrix.postTranslate(rectF.left, rectF.top);
                canvas.drawRoundRect(rectF, L, L, (Paint) this.c);
                if (this.b) {
                    float L2 = org.telegram.messenger.i0.L(1.0f);
                    paint.setStrokeWidth(L2);
                    matrix.reset();
                    matrix.postTranslate(rectF.left, rectF.top);
                    float f7 = L2 / 2.0f;
                    rectF.inset(f7, f7);
                    canvas.drawRoundRect(rectF, L, L, paint);
                    break;
                }
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        switch (this.a) {
            case 0:
                return org.telegram.messenger.i0.L(24.0f);
            default:
                return super.getIntrinsicHeight();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        switch (this.a) {
            case 0:
                return org.telegram.messenger.i0.L(24.0f);
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
    public final void setAlpha(int i10) {
        switch (this.a) {
            case 0:
                ((bi0) this.c).setAlpha(i10);
                ((bi0) this.d).setAlpha(i10);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        switch (this.a) {
            case 0:
                ((bi0) this.c).setColorFilter(colorFilter);
                ((bi0) this.d).setColorFilter(colorFilter);
                break;
        }
    }

    private final void a(int i10) {
    }

    private final void c(ColorFilter colorFilter) {
    }
}
