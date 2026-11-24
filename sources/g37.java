// default package

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class g37 extends Drawable {
    public final /* synthetic */ byte a;
    public boolean b;
    public Object c;
    public Object d;
    public Object e;

    public g37(byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.c = new Paint(1);
                Paint paint = new Paint(1);
                this.d = paint;
                this.e = new Matrix();
                paint.setStyle(Paint.Style.STROKE);
                paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, gl.L(28.0f), new int[]{1308622847, 0, 452984831}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
                break;
        }
    }

    public final void b(int i, int i2) {
        ((Paint) this.c).setShader(new LinearGradient(0.0f, 0.0f, 0.0f, gl.L(28.0f), new int[]{i, i2}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        switch (this.a) {
            case 0:
                oy8 oy8Var = (oy8) this.d;
                oy8 oy8Var2 = (oy8) this.c;
                Rect rect = gl.Q;
                rect.set(getBounds().centerX() - gl.L(12.0f), getBounds().centerY() - gl.L(12.0f), gl.L(12.0f) + getBounds().centerX(), gl.L(12.0f) + getBounds().centerY());
                if (((oy8) this.e).v()) {
                    oy8 oy8Var3 = (oy8) this.e;
                    boolean z = this.b;
                    if (oy8Var3 != (z ? oy8Var2 : oy8Var)) {
                        if (z) {
                            oy8Var = oy8Var2;
                        }
                        this.e = oy8Var;
                        oy8Var.H(oy8Var.e[0] - 1);
                    }
                }
                ((oy8) this.e).setBounds(rect);
                ((oy8) this.e).draw(canvas);
                break;
            default:
                Paint paint = (Paint) this.d;
                float L = gl.L(10.0f);
                RectF rectF = gl.P;
                rectF.set(getBounds());
                Matrix matrix = (Matrix) this.e;
                matrix.reset();
                matrix.postTranslate(rectF.left, rectF.top);
                canvas.drawRoundRect(rectF, L, L, (Paint) this.c);
                if (this.b) {
                    float L2 = gl.L(1.0f);
                    paint.setStrokeWidth(L2);
                    matrix.reset();
                    matrix.postTranslate(rectF.left, rectF.top);
                    float f = L2 / 2.0f;
                    rectF.inset(f, f);
                    canvas.drawRoundRect(rectF, L, L, paint);
                    break;
                }
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        switch (this.a) {
            case 0:
                return gl.L(24.0f);
            default:
                return super.getIntrinsicHeight();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        switch (this.a) {
            case 0:
                return gl.L(24.0f);
            default:
                return super.getIntrinsicWidth();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        byte b = this.a;
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        switch (this.a) {
            case 0:
                ((oy8) this.c).setAlpha(i);
                ((oy8) this.d).setAlpha(i);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        switch (this.a) {
            case 0:
                ((oy8) this.c).setColorFilter(colorFilter);
                ((oy8) this.d).setColorFilter(colorFilter);
                break;
        }
    }

    private final void a(int i) {
    }

    private final void c(ColorFilter colorFilter) {
    }
}
