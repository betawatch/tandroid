package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import f7.q8;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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
    public final void b(AttributeSet attributeSet, int i9) {
        super.b(attributeSet, i9);
        d0 d0Var = this.e;
        Context context = d0Var.getContext();
        int[] iArr = f.a.g;
        j4.c E = j4.c.E(context, attributeSet, iArr, i9);
        TypedArray typedArray = (TypedArray) E.c;
        r0.j0.j(d0Var, d0Var.getContext(), iArr, attributeSet, (TypedArray) E.c, i9);
        Drawable x10 = E.x(0);
        if (x10 != null) {
            d0Var.setThumb(x10);
        }
        Drawable w8 = E.w(1);
        Drawable drawable = this.f;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f = w8;
        if (w8 != null) {
            w8.setCallback(d0Var);
            q8.b(d0Var.getLayoutDirection(), w8);
            if (w8.isStateful()) {
                w8.setState(d0Var.getDrawableState());
            }
            f();
        }
        d0Var.invalidate();
        if (typedArray.hasValue(3)) {
            this.h = m1.b(typedArray.getInt(3, -1), this.h);
            this.j = true;
        }
        if (typedArray.hasValue(2)) {
            this.g = E.v(2);
            this.i = true;
        }
        E.G();
        f();
    }

    public final void f() {
        Drawable drawable = this.f;
        if (drawable != null) {
            if (this.i || this.j) {
                Drawable d = q8.d(drawable.mutate());
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
                int i9 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i10 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f.setBounds(-i9, -i10, i9, i10);
                float width = ((r0.getWidth() - r0.getPaddingLeft()) - r0.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(r0.getPaddingLeft(), r0.getHeight() / 2);
                for (int i11 = 0; i11 <= max; i11++) {
                    this.f.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}
