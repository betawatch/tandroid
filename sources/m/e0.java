package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import g7.k8;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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
        super.b(attributeSet, R.attr.seekBarStyle);
        d0 d0Var = this.e;
        Context context = d0Var.getContext();
        int[] iArr = f.a.g;
        j9.a G = j9.a.G(context, attributeSet, iArr, R.attr.seekBarStyle);
        TypedArray typedArray = (TypedArray) G.c;
        r0.j0.j(d0Var, d0Var.getContext(), iArr, attributeSet, (TypedArray) G.c, R.attr.seekBarStyle);
        Drawable z10 = G.z(0);
        if (z10 != null) {
            d0Var.setThumb(z10);
        }
        Drawable y10 = G.y(1);
        Drawable drawable = this.f;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f = y10;
        if (y10 != null) {
            y10.setCallback(d0Var);
            k8.b(d0Var.getLayoutDirection(), y10);
            if (y10.isStateful()) {
                y10.setState(d0Var.getDrawableState());
            }
            f();
        }
        d0Var.invalidate();
        if (typedArray.hasValue(3)) {
            this.h = m1.b(typedArray.getInt(3, -1), this.h);
            this.j = true;
        }
        if (typedArray.hasValue(2)) {
            this.g = G.x(2);
            this.i = true;
        }
        G.I();
        f();
    }

    public final void f() {
        Drawable drawable = this.f;
        if (drawable != null) {
            if (this.i || this.j) {
                Drawable d = k8.d(drawable.mutate());
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
