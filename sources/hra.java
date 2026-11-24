// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashSet;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class hra extends View implements tjb {
    public final de0 a;
    public final fra b;
    public final lm c;
    public boolean d;
    public gra e;
    public boolean f;
    public boolean h;

    public hra(Context context) {
        super(context);
        fra fraVar = new fra();
        fraVar.c = -16777216;
        fraVar.d = -1;
        this.b = fraVar;
        lm lmVar = new lm(new era(this, (byte) 0), 380L, s33.h);
        this.c = lmVar;
        de0 de0Var = new de0(context);
        this.a = de0Var;
        de0Var.setCallback(this);
        this.d = false;
        lmVar.e(false, 0.0f);
        a();
    }

    public final void a() {
        boolean z = this.h && this.f;
        this.d = z;
        this.c.d(z);
        setEnabled(this.d);
        setClickable(this.d);
        invalidate();
    }

    public float getVisibilityFactor() {
        return this.c.c;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a.getClass();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.a.getClass();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float d = this.c.d(this.d);
        int D = ug8.D(24.0f, getMeasuredWidth(), 2);
        int measuredHeight = (getMeasuredHeight() - gl.L(24.0f)) / 2;
        canvas.save();
        canvas.translate(D, measuredHeight);
        canvas.scale(d, d, 0.0f, gl.L(12.0f));
        int L = gl.L(24.0f);
        int L2 = gl.L(24.0f);
        de0 de0Var = this.a;
        de0Var.setBounds(0, 0, L, L2);
        fra fraVar = this.b;
        int i = fraVar.c;
        if (de0Var.f != i) {
            de0Var.f = i;
            if (de0Var.c != null) {
                de0Var.d.setColorFilter(i, PorterDuff.Mode.MULTIPLY);
                de0Var.invalidateSelf();
            }
        }
        int i2 = fraVar.d;
        if (de0Var.e != i2) {
            de0Var.e = i2;
            Drawable drawable = de0Var.c;
            if (drawable != null) {
                drawable.setColorFilter(i2, PorterDuff.Mode.MULTIPLY);
                de0Var.invalidateSelf();
            }
        }
        int i3 = fraVar.c | (-16777216);
        if (de0Var.h != i3) {
            de0Var.h = i3;
            de0Var.b.v(i3, false);
            de0Var.invalidateSelf();
        }
        de0Var.draw(canvas);
        canvas.restore();
    }

    public void set(TL_stars.Tl_starsRating tl_starsRating) {
        int b;
        this.f = tl_starsRating != null;
        a();
        if (tl_starsRating == null) {
            return;
        }
        int i = tl_starsRating.level;
        de0 de0Var = this.a;
        if (de0Var.r != i || de0Var.c == null || de0Var.d == null) {
            de0Var.b.t(i >= 0 ? Integer.toString(i) : "!", true, true);
            de0Var.r = i;
            if (i < 0) {
                b = 18;
            } else {
                b = moe.b(i <= 10 ? i - 1 : (i / 10) + 8, 0, 17);
            }
            Context context = de0Var.a;
            if (de0Var.n != b || de0Var.c == null || de0Var.d == null) {
                int i2 = b << 1;
                Drawable mutate = context.getResources().getDrawable(de0.s[i2]).mutate();
                de0Var.c = mutate;
                int i3 = de0Var.e;
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                mutate.setColorFilter(i3, mode);
                Drawable mutate2 = context.getResources().getDrawable(de0.s[i2 + 1]).mutate();
                de0Var.d = mutate2;
                mutate2.setColorFilter(de0Var.f, mode);
                de0Var.n = b;
                Drawable drawable = de0Var.c;
                if (drawable != null) {
                    drawable.setBounds(de0Var.getBounds());
                }
                Drawable drawable2 = de0Var.d;
                if (drawable2 != null) {
                    drawable2.setBounds(de0Var.getBounds());
                }
            }
            de0Var.invalidateSelf();
        }
        setContentDescription(k96.M0(2131754796, null) + " " + tl_starsRating.level);
        invalidate();
    }

    public void setDelegate(gra graVar) {
        this.e = graVar;
    }

    public void setParentExpanded(float f) {
        fra fraVar = this.b;
        fraVar.e = f;
        fraVar.a(fraVar.a);
        invalidate();
    }

    public void setResourcesProvider(wjb wjbVar) {
        this.b.b = wjbVar;
    }

    public void setVisibility(boolean z) {
        this.h = z;
        a();
    }

    @Override // tjb
    public final void updateColors() {
        try {
            fra fraVar = this.b;
            fraVar.a(fraVar.a);
            invalidate();
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.a;
    }

    @Override // tjb
    public final void addColorKeys(HashSet hashSet) {
    }
}
