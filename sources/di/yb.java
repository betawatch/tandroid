package di;

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
import org.telegram.messenger.gd;
import org.telegram.messenger.m10;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.wy0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class yb extends View implements te.b {
    public final /* synthetic */ int a = 0;
    public Object b;
    public Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yb(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.h = i6Var;
        this.b = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{-1135603, -404714}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.c = new Matrix();
        this.d = new Paint(1);
        this.e = new Paint(1);
        this.f = new wy0(gd.N0(2131744795, null), 14.16f, org.telegram.messenger.g0.o());
    }

    public static void a(Canvas canvas, Drawable drawable, float f10, float f11, float f12, float f13) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            intrinsicWidth = org.telegram.messenger.g0.L(24.0f);
            intrinsicHeight = intrinsicWidth;
        }
        drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        drawable.setAlpha((int) (255.0f * f12));
        canvas.save();
        canvas.rotate(f13, f10, f11);
        float T1 = org.telegram.messenger.g0.T1(0.6f, 1.0f, f12);
        canvas.scale(T1, T1, f10, f11);
        m10.k(intrinsicHeight, 2.0f, f11, f10 - (intrinsicWidth / 2.0f), canvas);
        drawable.draw(canvas);
        canvas.restore();
    }

    @Override // te.b
    public void G(float f10, int i7) {
        if (i7 == 1 && f10 == 1.0f) {
            this.c = null;
        }
    }

    @Override // te.b
    public void K(int i7, float f10, float f11, te.c cVar) {
        invalidate();
    }

    public void b(boolean z10, boolean z11) {
        te.a aVar = (te.a) this.e;
        Drawable drawable = (Drawable) this.b;
        if (drawable == null) {
            if (z10) {
                aVar.a(true, false);
            }
        } else if (drawable instanceof org.telegram.ui.ActionBar.x1) {
            ((org.telegram.ui.ActionBar.x1) drawable).c(z11, z10 ? 1.0f : 0.0f);
        } else {
            aVar.a(z10, z11);
        }
    }

    public void c(Drawable drawable) {
        te.c cVar = (te.c) this.f;
        cVar.b();
        cVar.c(1.0f);
        this.c = null;
        Drawable drawable2 = (Drawable) this.b;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.b = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (!((org.telegram.ui.ActionBar.z4) this.h).H) {
                ((te.a) this.e).a(false, false);
            }
        }
        d();
        invalidate();
    }

    public void d() {
        org.telegram.ui.ActionBar.z4 z4Var = (org.telegram.ui.ActionBar.z4) this.h;
        setBackground(org.telegram.ui.ActionBar.n6.h0(z4Var.i0, 1, -1));
        Drawable drawable = (Drawable) this.b;
        if (drawable instanceof org.telegram.ui.ActionBar.x1) {
            ((org.telegram.ui.ActionBar.x1) drawable).a(z4Var.g0);
            ((org.telegram.ui.ActionBar.x1) ((Drawable) this.b)).b(z4Var.h0);
        } else if (drawable instanceof org.telegram.ui.ActionBar.s4) {
            ((org.telegram.ui.ActionBar.s4) drawable).j = z4Var.g0;
        } else if (drawable != null) {
            drawable.setColorFilter(new PorterDuffColorFilter(z4Var.g0, PorterDuff.Mode.SRC_IN));
        }
        ((Drawable) this.d).setColorFilter(new PorterDuffColorFilter(z4Var.h0, PorterDuff.Mode.SRC_IN));
        invalidate();
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                Matrix matrix = (Matrix) this.c;
                matrix.reset();
                matrix.postTranslate(org.telegram.messenger.g0.L(14.0f), 0.0f);
                matrix.postScale((getWidth() - org.telegram.messenger.g0.L(28.0f)) / 255.0f, 1.0f);
                LinearGradient linearGradient = (LinearGradient) this.b;
                linearGradient.setLocalMatrix(matrix);
                Paint paint = (Paint) this.d;
                paint.setShader(linearGradient);
                wy0 wy0Var = (wy0) this.f;
                float L = wy0Var.c + org.telegram.messenger.g0.L(30.0f);
                Paint paint2 = (Paint) this.e;
                paint2.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.d7, (org.telegram.ui.ActionBar.i6) this.h));
                canvas.drawRect(org.telegram.messenger.g0.L(24.0f), (getHeight() / 2.0f) - 1.0f, ((getWidth() - L) / 2.0f) - org.telegram.messenger.g0.L(8.0f), getHeight() / 2.0f, paint2);
                canvas.drawRect(org.telegram.messenger.g0.L(8.0f) + ((getWidth() + L) / 2.0f), (getHeight() / 2.0f) - 1.0f, getWidth() - org.telegram.messenger.g0.L(24.0f), getHeight() / 2.0f, paint2);
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set((getWidth() - L) / 2.0f, 0.0f, (getWidth() + L) / 2.0f, getHeight());
                canvas.drawRoundRect(rectF, getHeight() / 2.0f, getHeight() / 2.0f, paint);
                ((wy0) this.f).c((getWidth() - wy0Var.c) / 2.0f, getHeight() / 2.0f, 1.0f, -1, canvas);
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Canvas canvas2;
        switch (this.a) {
            case 1:
                float width = getWidth() / 2.0f;
                float height = getHeight() / 2.0f;
                float f10 = ((te.a) this.e).e;
                float f11 = ((te.c) this.f).f;
                Drawable drawable = (Drawable) this.c;
                if (drawable == null || f11 >= 0.5f) {
                    Drawable drawable2 = (Drawable) this.b;
                    if (drawable2 == null || f10 >= 1.0f) {
                        canvas2 = canvas;
                    } else {
                        float f12 = (f11 - 0.5f) * 2.0f;
                        canvas2 = canvas;
                        a(canvas2, drawable2, width, height, Math.min(1.0f, f12 + (drawable == null ? 1.0f : 0.0f)) * (1.0f - f10), (-90.0f) * f10);
                    }
                } else {
                    float C = com.google.android.gms.internal.vision.e2.C(f11, 2.0f, 1.0f, 1.0f - f10);
                    canvas2 = canvas;
                    a(canvas2, drawable, width, height, C, 0.0f);
                }
                if (f10 > 0.0f) {
                    a(canvas2, (Drawable) this.d, width, height, f10, (1.0f - f10) * 90.0f);
                    break;
                }
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override // android.view.View
    public void setAlpha(float f10) {
        switch (this.a) {
            case 1:
                super.setAlpha(f10);
                ((org.telegram.ui.ActionBar.z4) this.h).invalidate();
                break;
            default:
                super.setAlpha(f10);
                break;
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f10) {
        switch (this.a) {
            case 1:
                super.setTranslationX(f10);
                ((org.telegram.ui.ActionBar.z4) this.h).invalidate();
                break;
            default:
                super.setTranslationX(f10);
                break;
        }
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.a) {
            case 1:
                return drawable == ((Drawable) this.b) || drawable == ((Drawable) this.c) || super.verifyDrawable(drawable);
            default:
                return super.verifyDrawable(drawable);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yb(org.telegram.ui.ActionBar.z4 z4Var, Context context) {
        super(context);
        this.h = z4Var;
        kr krVar = kr.h;
        this.e = new te.a(0, this, krVar, 380L, false);
        this.f = new te.c(1, this, krVar, 380L, 1.0f);
        this.d = context.getDrawable(R.drawable.ic_ab_close).mutate();
        d();
    }
}
