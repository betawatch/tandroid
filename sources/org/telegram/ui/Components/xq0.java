package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class xq0 extends Drawable {
    public final /* synthetic */ int a;
    public final ShapeDrawable b;
    public final Rect c;

    public xq0(vq0 vq0Var) {
        this.a = 1;
        this.b = org.telegram.ui.ActionBar.t6.e0(org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f), 0);
        this.c = new Rect();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        switch (this.a) {
            case 0:
                Rect bounds = getBounds();
                Rect rect = this.c;
                rect.set(bounds);
                rect.inset(org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(8.0f));
                ShapeDrawable shapeDrawable = this.b;
                shapeDrawable.setBounds(rect);
                shapeDrawable.draw(canvas);
                break;
            default:
                Rect bounds2 = getBounds();
                Rect rect2 = this.c;
                rect2.set(bounds2);
                rect2.inset(org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(8.0f));
                ShapeDrawable shapeDrawable2 = this.b;
                shapeDrawable2.setBounds(rect2);
                shapeDrawable2.draw(canvas);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        switch (this.a) {
        }
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        switch (this.a) {
            case 0:
                this.b.setAlpha(i10);
                break;
            default:
                this.b.setAlpha(i10);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        int i10 = this.a;
    }

    public xq0(yq0 yq0Var) {
        this.a = 0;
        int L = org.telegram.messenger.i0.L(16.0f);
        int L2 = org.telegram.messenger.i0.L(16.0f);
        int i10 = org.telegram.ui.ActionBar.t6.d6;
        org.telegram.ui.ActionBar.p6 p6Var = yq0Var.c;
        this.b = org.telegram.ui.ActionBar.t6.e0(L, L2, org.telegram.ui.ActionBar.t6.w(org.telegram.ui.ActionBar.t6.w0(i10, p6Var), org.telegram.ui.ActionBar.t6.r1(0.04f, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.G6, p6Var))));
        this.c = new Rect();
    }

    private final void a(ColorFilter colorFilter) {
    }

    private final void b(ColorFilter colorFilter) {
    }
}
