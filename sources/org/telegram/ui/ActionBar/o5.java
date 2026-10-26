package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.ds;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class o5 extends View implements oe.d {
    public Drawable a;
    public Drawable b;
    public final Drawable c;
    public final oe.b d;
    public final oe.e e;
    public final /* synthetic */ r5 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o5(r5 r5Var, Context context) {
        super(context);
        this.f = r5Var;
        ds dsVar = ds.h;
        this.d = new oe.b(0, this, dsVar, 380L, false);
        this.e = new oe.e(1, this, dsVar, 380L, 1.0f);
        this.c = context.getDrawable(R.drawable.ic_ab_close).mutate();
        d();
    }

    public static void a(Canvas canvas, Drawable drawable, float f7, float f10, float f11, float f12) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            intrinsicWidth = AndroidUtilities.dp(24.0f);
            intrinsicHeight = intrinsicWidth;
        }
        drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        drawable.setAlpha((int) (255.0f * f11));
        canvas.save();
        canvas.rotate(f12, f7, f10);
        float lerp = AndroidUtilities.lerp(0.6f, 1.0f, f11);
        canvas.scale(lerp, lerp, f7, f10);
        canvas.translate(f7 - (intrinsicWidth / 2.0f), f10 - (intrinsicHeight / 2.0f));
        drawable.draw(canvas);
        canvas.restore();
    }

    @Override // oe.d
    public final void E(int i10, float f7, float f10, oe.e eVar) {
        invalidate();
    }

    public final void b(boolean z10, boolean z11) {
        Drawable drawable = this.a;
        oe.b bVar = this.d;
        if (drawable == null) {
            if (z10) {
                bVar.a(true, false);
            }
        } else if (drawable instanceof j2) {
            ((j2) drawable).c(z10 ? 1.0f : 0.0f, z11);
        } else {
            bVar.a(z10, z11);
        }
    }

    public final void c(Drawable drawable) {
        oe.e eVar = this.e;
        eVar.b();
        eVar.c(1.0f);
        this.b = null;
        Drawable drawable2 = this.a;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (!this.f.G) {
                this.d.a(false, false);
            }
        }
        d();
        invalidate();
    }

    public final void d() {
        r5 r5Var = this.f;
        setBackground(y6.g0(r5Var.f0, 1, -1));
        Drawable drawable = this.a;
        if (drawable instanceof j2) {
            ((j2) drawable).a(r5Var.d0);
            ((j2) this.a).b(r5Var.e0);
        } else if (drawable instanceof k5) {
            ((k5) drawable).j = r5Var.d0;
        } else if (drawable != null) {
            drawable.setColorFilter(new PorterDuffColorFilter(r5Var.d0, PorterDuff.Mode.SRC_IN));
        }
        this.c.setColorFilter(new PorterDuffColorFilter(r5Var.e0, PorterDuff.Mode.SRC_IN));
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        float f7 = this.d.e;
        float f10 = this.e.f;
        Drawable drawable = this.b;
        if (drawable == null || f10 >= 0.5f) {
            Drawable drawable2 = this.a;
            if (drawable2 == null || f7 >= 1.0f) {
                canvas2 = canvas;
            } else {
                float f11 = (f10 - 0.5f) * 2.0f;
                canvas2 = canvas;
                a(canvas2, drawable2, width, height, Math.min(1.0f, f11 + (drawable == null ? 1.0f : 0.0f)) * (1.0f - f7), f7 * (-90.0f));
            }
        } else {
            float D = c3.h0.D(f10, 2.0f, 1.0f, 1.0f - f7);
            canvas2 = canvas;
            a(canvas2, drawable, width, height, D, 0.0f);
        }
        if (f7 > 0.0f) {
            a(canvas2, this.c, width, height, f7, (1.0f - f7) * 90.0f);
        }
    }

    @Override // android.view.View
    public final void setAlpha(float f7) {
        super.setAlpha(f7);
        this.f.invalidate();
    }

    @Override // android.view.View
    public final void setTranslationX(float f7) {
        super.setTranslationX(f7);
        this.f.invalidate();
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.a || drawable == this.b || super.verifyDrawable(drawable);
    }

    @Override // oe.d
    public final void z(float f7, int i10) {
        if (i10 == 1 && f7 == 1.0f) {
            this.b = null;
        }
    }
}
