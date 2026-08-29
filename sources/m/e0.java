package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import h7.l8;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class e0 extends z {
    public final d0 e;
    public Drawable f;
    public ColorStateList g;
    public PorterDuff.Mode h;
    public boolean i;
    public boolean j;

    public e0(d0 d0Var) {
        super(d0Var);
        this.g = null;
        this.h = null;
        this.i = false;
        this.j = false;
        this.e = d0Var;
    }

    @Override // m.z
    public final void b(AttributeSet attributeSet, int i10) {
        super.b(attributeSet, i10);
        d0 d0Var = this.e;
        Context context = d0Var.getContext();
        int[] iArr = f.a.g;
        l3.g0 z10 = l3.g0.z(context, attributeSet, iArr, i10);
        TypedArray typedArray = (TypedArray) z10.c;
        r0.j0.j(d0Var, d0Var.getContext(), iArr, attributeSet, (TypedArray) z10.c, i10);
        Drawable r6 = z10.r(0);
        if (r6 != null) {
            d0Var.setThumb(r6);
        }
        Drawable q6 = z10.q(1);
        Drawable drawable = this.f;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f = q6;
        if (q6 != null) {
            q6.setCallback(d0Var);
            l8.b(d0Var.getLayoutDirection(), q6);
            if (q6.isStateful()) {
                q6.setState(d0Var.getDrawableState());
            }
            f();
        }
        d0Var.invalidate();
        if (typedArray.hasValue(3)) {
            this.h = m1.b(typedArray.getInt(3, -1), this.h);
            this.j = true;
        }
        if (typedArray.hasValue(2)) {
            this.g = z10.p(2);
            this.i = true;
        }
        z10.B();
        f();
    }

    public final void f() {
        Drawable drawable = this.f;
        if (drawable != null) {
            if (this.i || this.j) {
                Drawable d = l8.d(drawable.mutate());
                this.f = d;
                if (this.i) {
                    d.setTintList(this.g);
                }
                if (this.j) {
                    this.f.setTintMode(this.h);
                }
                if (this.f.isStateful()) {
                    this.f.setState(this.e.getDrawableState());
                }
            }
        }
    }

    public final void g(Canvas canvas) {
        if (this.f != null) {
            int max = this.e.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f.getIntrinsicWidth();
                int intrinsicHeight = this.f.getIntrinsicHeight();
                int i10 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i11 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f.setBounds(-i10, -i11, i10, i11);
                float width = ((r0.getWidth() - r0.getPaddingLeft()) - r0.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(r0.getPaddingLeft(), r0.getHeight() / 2);
                for (int i12 = 0; i12 <= max; i12++) {
                    this.f.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}
