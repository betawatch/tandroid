// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashSet;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class jva extends View implements snb {
    public final fe0 a;
    public final hva b;
    public final mm c;
    public boolean d;
    public iva e;
    public boolean f;
    public boolean h;

    public jva(Context context) {
        super(context);
        hva hvaVar = new hva();
        hvaVar.c = -16777216;
        hvaVar.d = -1;
        this.b = hvaVar;
        mm mmVar = new mm(new gva(this, (byte) 0), 380L, k43.h);
        this.c = mmVar;
        fe0 fe0Var = new fe0(context);
        this.a = fe0Var;
        fe0Var.setCallback(this);
        this.d = false;
        mmVar.e(false, 0.0f);
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
        int D = ik8.D(24.0f, getMeasuredWidth(), 2);
        int measuredHeight = (getMeasuredHeight() - hl.L(24.0f)) / 2;
        canvas.save();
        canvas.translate(D, measuredHeight);
        canvas.scale(d, d, 0.0f, hl.L(12.0f));
        int L = hl.L(24.0f);
        int L2 = hl.L(24.0f);
        fe0 fe0Var = this.a;
        fe0Var.setBounds(0, 0, L, L2);
        hva hvaVar = this.b;
        int i = hvaVar.c;
        if (fe0Var.f != i) {
            fe0Var.f = i;
            if (fe0Var.c != null) {
                fe0Var.d.setColorFilter(i, PorterDuff.Mode.MULTIPLY);
                fe0Var.invalidateSelf();
            }
        }
        int i2 = hvaVar.d;
        if (fe0Var.e != i2) {
            fe0Var.e = i2;
            Drawable drawable = fe0Var.c;
            if (drawable != null) {
                drawable.setColorFilter(i2, PorterDuff.Mode.MULTIPLY);
                fe0Var.invalidateSelf();
            }
        }
        int i3 = hvaVar.c | (-16777216);
        if (fe0Var.h != i3) {
            fe0Var.h = i3;
            fe0Var.b.v(i3, false);
            fe0Var.invalidateSelf();
        }
        fe0Var.draw(canvas);
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
        fe0 fe0Var = this.a;
        if (fe0Var.r != i || fe0Var.c == null || fe0Var.d == null) {
            fe0Var.b.t(i >= 0 ? Integer.toString(i) : "!", true, true);
            fe0Var.r = i;
            if (i < 0) {
                b = 18;
            } else {
                b = ete.b(i <= 10 ? i - 1 : (i / 10) + 8, 0, 17);
            }
            Context context = fe0Var.a;
            if (fe0Var.n != b || fe0Var.c == null || fe0Var.d == null) {
                int i2 = b << 1;
                Drawable mutate = context.getResources().getDrawable(fe0.s[i2]).mutate();
                fe0Var.c = mutate;
                int i3 = fe0Var.e;
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                mutate.setColorFilter(i3, mode);
                Drawable mutate2 = context.getResources().getDrawable(fe0.s[i2 + 1]).mutate();
                fe0Var.d = mutate2;
                mutate2.setColorFilter(fe0Var.f, mode);
                fe0Var.n = b;
                Drawable drawable = fe0Var.c;
                if (drawable != null) {
                    drawable.setBounds(fe0Var.getBounds());
                }
                Drawable drawable2 = fe0Var.d;
                if (drawable2 != null) {
                    drawable2.setBounds(fe0Var.getBounds());
                }
            }
            fe0Var.invalidateSelf();
        }
        setContentDescription(ob6.M0(2131754792, null) + " " + tl_starsRating.level);
        invalidate();
    }

    public void setDelegate(iva ivaVar) {
        this.e = ivaVar;
    }

    public void setParentExpanded(float f) {
        hva hvaVar = this.b;
        hvaVar.e = f;
        hvaVar.a(hvaVar.a);
        invalidate();
    }

    public void setResourcesProvider(vnb vnbVar) {
        this.b.b = vnbVar;
    }

    public void setVisibility(boolean z) {
        this.h = z;
        a();
    }

    @Override // snb
    public final void updateColors() {
        try {
            hva hvaVar = this.b;
            hvaVar.a(hvaVar.a);
            invalidate();
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.a;
    }

    @Override // snb
    public final void addColorKeys(HashSet hashSet) {
    }
}
