package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class hg extends v5 {
    public vg.f s;
    public final Path w;
    public final RectF x;
    public FragmentContextView y;

    public hg(Context context) {
        super(context);
        this.w = new Path();
        this.x = new RectF();
        setOrientation(1);
        vg.f fVar = this.s;
        if (fVar != null) {
            fVar.updateColors();
        }
        Color.alpha(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.d6, false));
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        FragmentContextView fragmentContextView;
        int currentStyle;
        FragmentContextView fragmentContextView2;
        Canvas canvas2 = canvas;
        if (getMetadata().c.a == 0.0f) {
            return;
        }
        vg.f fVar = this.s;
        if (fVar != null) {
            fVar.draw(canvas2);
        }
        FragmentContextView fragmentContextView3 = this.y;
        fe.k kVar = this.c;
        if (fragmentContextView3 == null || !((currentStyle = fragmentContextView3.getCurrentStyle()) == 3 || currentStyle == 1)) {
            z10 = false;
        } else {
            int entriesCount = getEntriesCount();
            boolean z11 = false;
            for (int i10 = 0; i10 < entriesCount; i10++) {
                fe.h m10 = kVar.m(i10);
                float paddingTop = getPaddingTop() + m10.b().top;
                View view = ((u5) m10.a).a;
                float c10 = m10.c();
                if (c10 > 0.0f && ((fragmentContextView2 = this.y) == view || fragmentContextView2.getParent() == view)) {
                    lc capsuleBlobDrawable = this.y.getCapsuleBlobDrawable();
                    int L = org.telegram.messenger.i0.L(1.0f) + ((int) capsuleBlobDrawable.d());
                    int i11 = -L;
                    capsuleBlobDrawable.setBounds(getPaddingLeft() - L, i11, (getMeasuredWidth() - getPaddingRight()) + L, (L * 2) + org.telegram.messenger.i0.L(36.0f) + i11);
                    capsuleBlobDrawable.setAlpha((int) (c10 * 255.0f));
                    canvas2.save();
                    canvas2.translate(0.0f, paddingTop);
                    capsuleBlobDrawable.draw(canvas2);
                    canvas2.restore();
                    z11 = true;
                }
            }
            z10 = z11;
        }
        canvas2.save();
        canvas2.clipPath(this.w);
        int entriesCount2 = getEntriesCount();
        int i12 = 0;
        while (i12 < entriesCount2) {
            fe.h m11 = kVar.m(i12);
            float paddingTop2 = getPaddingTop() + m11.b().top;
            View view2 = ((u5) m11.a).a;
            float min = Math.min(1.0f, m11.c.a) * m11.c();
            if (min > 0.0f && (!z10 || (fragmentContextView = this.y) == null || (fragmentContextView != view2 && fragmentContextView.getParent() != view2))) {
                int alpha = org.telegram.ui.ActionBar.t6.k0.getAlpha();
                org.telegram.ui.ActionBar.t6.k0.setAlpha((int) (alpha * min));
                float f7 = 1.0f - min;
                canvas2.drawLine(getPaddingLeft() + (org.telegram.messenger.i0.L(16.0f) * f7), paddingTop2, getWidth() - ((org.telegram.messenger.i0.L(16.0f) * f7) + getPaddingRight()), paddingTop2, org.telegram.ui.ActionBar.t6.k0);
                org.telegram.ui.ActionBar.t6.k0.setAlpha(alpha);
            }
            i12++;
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        vg.f fVar;
        if (super.dispatchTouchEvent(motionEvent)) {
            return true;
        }
        return motionEvent.getAction() == 0 && (fVar = this.s) != null && fVar.getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY());
    }

    @Override // org.telegram.ui.Components.v5
    public final void e() {
        j();
        invalidate();
    }

    public final void j() {
        float f7 = getMetadata().g.a;
        float f10 = getMetadata().c.a;
        RectF rectF = this.x;
        rectF.set(getPaddingLeft(), getPaddingTop(), getMeasuredWidth() - getPaddingRight(), getPaddingTop() + f7);
        float min = Math.min(org.telegram.messenger.i0.L(18.0f), Math.min(rectF.width(), rectF.height()) / 2.0f);
        Path path = this.w;
        path.rewind();
        path.addRoundRect(rectF, min, min, Path.Direction.CW);
        vg.f fVar = this.s;
        if (fVar != null) {
            fVar.setAlpha((int) (f10 * 255.0f));
            this.s.setBounds(getPaddingLeft() - org.telegram.messenger.i0.L(7.0f), 0, org.telegram.messenger.i0.L(7.0f) + (getMeasuredWidth() - getPaddingRight()), getPaddingBottom() + getPaddingTop() + ((int) f7));
            this.s.q(Math.min(org.telegram.messenger.i0.L(18.0f), f7 / 2.0f));
        }
    }

    @Override // org.telegram.ui.Components.v5, android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        j();
    }

    public void setBlurredBackground(vg.f fVar) {
        this.s = fVar;
    }

    public void setCallFragmentContextView(FragmentContextView fragmentContextView) {
        this.y = fragmentContextView;
        fragmentContextView.getCapsuleBlobDrawable().setCallback(this);
    }

    @Override // android.view.View
    public final void setPadding(int i10, int i11, int i12, int i13) {
        super.setPadding(i10, i11, i12, i13);
        j();
        invalidate();
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable)) {
            return true;
        }
        FragmentContextView fragmentContextView = this.y;
        return fragmentContextView != null && fragmentContextView.getCapsuleBlobDrawable() == drawable;
    }
}
