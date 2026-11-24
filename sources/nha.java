// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class nha extends View implements x74 {
    public final /* synthetic */ byte a = 1;
    public Object b;
    public Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nha(Context context, wjb wjbVar) {
        super(context);
        this.h = wjbVar;
        this.b = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{-1135603, -404714}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.c = new Matrix();
        this.d = new Paint(1);
        this.e = new Paint(1);
        this.f = new tgb(k96.M0(2131744799, null), 14.16f, gl.o());
    }

    public static void a(Canvas canvas, Drawable drawable, float f, float f2, float f3, float f4) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            intrinsicWidth = gl.L(24.0f);
            intrinsicHeight = intrinsicWidth;
        }
        drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        drawable.setAlpha((int) (255.0f * f3));
        canvas.save();
        canvas.rotate(f4, f, f2);
        float R1 = gl.R1(0.6f, 1.0f, f3);
        canvas.scale(R1, R1, f, f2);
        de9.n(intrinsicHeight, 2.0f, f2, f - (intrinsicWidth / 2.0f), canvas);
        drawable.draw(canvas);
        canvas.restore();
    }

    @Override // x74
    public final void D(float f, int i) {
        if (i == 1 && f == 1.0f) {
            this.c = null;
        }
    }

    public final void b(boolean z, boolean z2) {
        fm0 fm0Var = (fm0) this.e;
        Drawable drawable = (Drawable) this.b;
        if (drawable == null) {
            if (z) {
                fm0Var.a(true, false);
            }
        } else if (drawable instanceof ed0) {
            ((ed0) drawable).c(z2, z ? 1.0f : 0.0f);
        } else {
            fm0Var.a(z, z2);
        }
    }

    public final void c(Drawable drawable) {
        y74 y74Var = (y74) this.f;
        y74Var.b();
        y74Var.c(1.0f);
        this.c = null;
        Drawable drawable2 = (Drawable) this.b;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.b = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (!((pha) this.h).H) {
                ((fm0) this.e).a(false, false);
            }
        }
        d();
        invalidate();
    }

    public final void d() {
        pha phaVar = (pha) this.h;
        setBackground(bkb.f0(phaVar.i0, 1, -1));
        Drawable drawable = (Drawable) this.b;
        if (drawable instanceof ed0) {
            ((ed0) drawable).a(phaVar.g0);
            ((ed0) ((Drawable) this.b)).b(phaVar.h0);
        } else if (drawable instanceof a07) {
            ((a07) drawable).j = phaVar.g0;
        } else if (drawable != null) {
            drawable.setColorFilter(new PorterDuffColorFilter(phaVar.g0, PorterDuff.Mode.SRC_IN));
        }
        ((Drawable) this.d).setColorFilter(new PorterDuffColorFilter(phaVar.h0, PorterDuff.Mode.SRC_IN));
        invalidate();
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 1:
                Matrix matrix = (Matrix) this.c;
                matrix.reset();
                matrix.postTranslate(gl.L(14.0f), 0.0f);
                matrix.postScale((getWidth() - gl.L(28.0f)) / 255.0f, 1.0f);
                LinearGradient linearGradient = (LinearGradient) this.b;
                linearGradient.setLocalMatrix(matrix);
                Paint paint = (Paint) this.d;
                paint.setShader(linearGradient);
                Object obj = this.f;
                tgb tgbVar = (tgb) obj;
                float L = tgbVar.c + gl.L(30.0f);
                Paint paint2 = (Paint) this.e;
                paint2.setColor(bkb.v0(bkb.c7, (wjb) this.h));
                canvas.drawRect(gl.L(24.0f), (getHeight() / 2.0f) - 1.0f, ((getWidth() - L) / 2.0f) - gl.L(8.0f), getHeight() / 2.0f, paint2);
                canvas.drawRect(gl.L(8.0f) + ((getWidth() + L) / 2.0f), (getHeight() / 2.0f) - 1.0f, getWidth() - gl.L(24.0f), getHeight() / 2.0f, paint2);
                RectF rectF = gl.P;
                rectF.set((getWidth() - L) / 2.0f, 0.0f, (getWidth() + L) / 2.0f, getHeight());
                canvas.drawRoundRect(rectF, getHeight() / 2.0f, getHeight() / 2.0f, paint);
                ((tgb) obj).c((getWidth() - tgbVar.c) / 2.0f, getHeight() / 2.0f, 1.0f, -1, canvas);
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        switch (this.a) {
            case 0:
                float width = getWidth() / 2.0f;
                float height = getHeight() / 2.0f;
                float f = ((fm0) this.e).e;
                float f2 = ((y74) this.f).f;
                Drawable drawable = (Drawable) this.c;
                if (drawable == null || f2 >= 0.5f) {
                    Drawable drawable2 = (Drawable) this.b;
                    if (drawable2 == null || f >= 1.0f) {
                        canvas2 = canvas;
                    } else {
                        float f3 = (f2 - 0.5f) * 2.0f;
                        canvas2 = canvas;
                        a(canvas2, drawable2, width, height, Math.min(1.0f, f3 + (drawable == null ? 1.0f : 0.0f)) * (1.0f - f), (-90.0f) * f);
                    }
                } else {
                    float B = yjb.B(f2, 2.0f, 1.0f, 1.0f - f);
                    canvas2 = canvas;
                    a(canvas2, drawable, width, height, B, 0.0f);
                }
                if (f > 0.0f) {
                    a(canvas2, (Drawable) this.d, width, height, f, (1.0f - f) * 90.0f);
                    break;
                }
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override // x74
    public final void p(int i, float f, float f2, y74 y74Var) {
        invalidate();
    }

    @Override // android.view.View
    public final void setAlpha(float f) {
        switch (this.a) {
            case 0:
                super.setAlpha(f);
                ((pha) this.h).invalidate();
                break;
            default:
                super.setAlpha(f);
                break;
        }
    }

    @Override // android.view.View
    public final void setTranslationX(float f) {
        switch (this.a) {
            case 0:
                super.setTranslationX(f);
                ((pha) this.h).invalidate();
                break;
            default:
                super.setTranslationX(f);
                break;
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        switch (this.a) {
            case 0:
                return drawable == ((Drawable) this.b) || drawable == ((Drawable) this.c) || super.verifyDrawable(drawable);
            default:
                return super.verifyDrawable(drawable);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nha(pha phaVar, Context context) {
        super(context);
        this.h = phaVar;
        s33 s33Var = s33.h;
        this.e = new fm0(0, this, s33Var, 380L, false);
        this.f = new y74(1, this, s33Var, 380L, 1.0f);
        this.d = context.getDrawable(R.drawable.ic_ab_close).mutate();
        d();
    }
}
