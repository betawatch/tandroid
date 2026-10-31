package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class d0 extends y {
    public final c0 e;
    public Drawable f;
    public ColorStateList g;
    public PorterDuff.Mode h;
    public boolean i;
    public boolean j;

    public d0(c0 c0Var) {
        super(c0Var);
        this.g = null;
        this.h = null;
        this.i = false;
        this.j = false;
        this.e = c0Var;
    }

    @Override // m.y
    public final void b(AttributeSet attributeSet, int i10) {
        super.b(attributeSet, i10);
        c0 c0Var = this.e;
        Context context = c0Var.getContext();
        int[] iArr = f.a.g;
        li.k G = li.k.G(context, attributeSet, iArr, i10);
        TypedArray typedArray = (TypedArray) G.c;
        r0.h0.i(c0Var, c0Var.getContext(), iArr, attributeSet, (TypedArray) G.c, i10);
        Drawable z10 = G.z(0);
        if (z10 != null) {
            c0Var.setThumb(z10);
        }
        Drawable w9 = G.w(1);
        Drawable drawable = this.f;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f = w9;
        if (w9 != null) {
            w9.setCallback(c0Var);
            w9.setLayoutDirection(c0Var.getLayoutDirection());
            if (w9.isStateful()) {
                w9.setState(c0Var.getDrawableState());
            }
            f();
        }
        c0Var.invalidate();
        if (typedArray.hasValue(3)) {
            this.h = l1.b(typedArray.getInt(3, -1), this.h);
            this.j = true;
        }
        if (typedArray.hasValue(2)) {
            this.g = G.v(2);
            this.i = true;
        }
        G.I();
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
