package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final class f0 extends a0 {
    public final e0 e;
    public Drawable f;
    public ColorStateList g;
    public PorterDuff.Mode h;
    public boolean i;
    public boolean j;

    public f0(e0 e0Var) {
        super(e0Var);
        this.g = null;
        this.h = null;
        this.i = false;
        this.j = false;
        this.e = e0Var;
    }

    @Override // m.a0
    public final void b(AttributeSet attributeSet, int i10) {
        super.b(attributeSet, i10);
        e0 e0Var = this.e;
        Context context = e0Var.getContext();
        int[] iArr = f.a.g;
        h3 P = h3.P(context, attributeSet, iArr, i10);
        TypedArray typedArray = (TypedArray) P.c;
        r0.i0.i(e0Var, e0Var.getContext(), iArr, attributeSet, (TypedArray) P.c, i10);
        Drawable G = P.G(0);
        if (G != null) {
            e0Var.setThumb(G);
        }
        Drawable F = P.F(1);
        Drawable drawable = this.f;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f = F;
        if (F != null) {
            F.setCallback(e0Var);
            F.setLayoutDirection(e0Var.getLayoutDirection());
            if (F.isStateful()) {
                F.setState(e0Var.getDrawableState());
            }
            f();
        }
        e0Var.invalidate();
        if (typedArray.hasValue(3)) {
            this.h = n1.b(typedArray.getInt(3, -1), this.h);
            this.j = true;
        }
        if (typedArray.hasValue(2)) {
            this.g = P.E(2);
            this.i = true;
        }
        P.Q();
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
