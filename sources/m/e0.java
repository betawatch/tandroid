package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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
    public final void b(AttributeSet attributeSet, int i7) {
        super.b(attributeSet, i7);
        d0 d0Var = this.e;
        Context context = d0Var.getContext();
        int[] iArr = f.a.g;
        h6.m x10 = h6.m.x(context, attributeSet, iArr, i7);
        TypedArray typedArray = (TypedArray) x10.c;
        r0.i0.i(d0Var, d0Var.getContext(), iArr, attributeSet, (TypedArray) x10.c, i7);
        Drawable q10 = x10.q(0);
        if (q10 != null) {
            d0Var.setThumb(q10);
        }
        Drawable p10 = x10.p(1);
        Drawable drawable = this.f;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f = p10;
        if (p10 != null) {
            p10.setCallback(d0Var);
            p10.setLayoutDirection(d0Var.getLayoutDirection());
            if (p10.isStateful()) {
                p10.setState(d0Var.getDrawableState());
            }
            f();
        }
        d0Var.invalidate();
        if (typedArray.hasValue(3)) {
            this.h = m1.b(typedArray.getInt(3, -1), this.h);
            this.j = true;
        }
        if (typedArray.hasValue(2)) {
            this.g = x10.o(2);
            this.i = true;
        }
        x10.C();
        f();
    }

    public final void f() {
        Drawable drawable = this.f;
        if (drawable != null) {
            if (this.i || this.j) {
                Drawable mutate = drawable.mutate();
                this.f = mutate;
                if (this.i) {
                    mutate.setTintList(this.g);
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
                int i7 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i10 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f.setBounds(-i7, -i10, i7, i10);
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
