package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class ah extends e6 {
    public fh.g s;
    public final Path w;
    public final RectF x;
    public FragmentContextView y;

    public ah(Context context) {
        super(context);
        this.w = new Path();
        this.x = new RectF();
        setOrientation(1);
        fh.g gVar = this.s;
        if (gVar != null) {
            gVar.updateColors();
        }
        Color.alpha(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.d6, false));
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
        fh.g gVar = this.s;
        if (gVar != null) {
            gVar.draw(canvas2);
        }
        FragmentContextView fragmentContextView3 = this.y;
        te.h hVar = this.c;
        if (fragmentContextView3 == null || !((currentStyle = fragmentContextView3.getCurrentStyle()) == 3 || currentStyle == 1)) {
            z10 = false;
        } else {
            int entriesCount = getEntriesCount();
            boolean z11 = false;
            for (int i7 = 0; i7 < entriesCount; i7++) {
                te.e i10 = hVar.i(i7);
                float paddingTop = getPaddingTop() + i10.b().top;
                View view = ((d6) i10.a).a;
                float c10 = i10.c();
                if (c10 > 0.0f && ((fragmentContextView2 = this.y) == view || fragmentContextView2.getParent() == view)) {
                    wc capsuleBlobDrawable = this.y.getCapsuleBlobDrawable();
                    int L = org.telegram.messenger.g0.L(1.0f) + ((int) capsuleBlobDrawable.d());
                    int i11 = -L;
                    capsuleBlobDrawable.setBounds(getPaddingLeft() - L, i11, (getMeasuredWidth() - getPaddingRight()) + L, (L * 2) + org.telegram.messenger.g0.L(36.0f) + i11);
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
            te.e i13 = hVar.i(i12);
            float paddingTop2 = getPaddingTop() + i13.b().top;
            View view2 = ((d6) i13.a).a;
            float min = Math.min(1.0f, i13.c.a) * i13.c();
            if (min > 0.0f && (!z10 || (fragmentContextView = this.y) == null || (fragmentContextView != view2 && fragmentContextView.getParent() != view2))) {
                int alpha = org.telegram.ui.ActionBar.n6.k0.getAlpha();
                org.telegram.ui.ActionBar.n6.k0.setAlpha((int) (alpha * min));
                float f10 = 1.0f - min;
                canvas2.drawLine(getPaddingLeft() + (org.telegram.messenger.g0.L(16.0f) * f10), paddingTop2, getWidth() - ((org.telegram.messenger.g0.L(16.0f) * f10) + getPaddingRight()), paddingTop2, org.telegram.ui.ActionBar.n6.k0);
                org.telegram.ui.ActionBar.n6.k0.setAlpha(alpha);
            }
            i12++;
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        fh.g gVar;
        if (super.dispatchTouchEvent(motionEvent)) {
            return true;
        }
        return motionEvent.getAction() == 0 && (gVar = this.s) != null && gVar.getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY());
    }

    @Override // org.telegram.ui.Components.e6
    public final void f() {
        k();
        invalidate();
    }

    public final void k() {
        float f10 = getMetadata().g.a;
        float f11 = getMetadata().c.a;
        RectF rectF = this.x;
        rectF.set(getPaddingLeft(), getPaddingTop(), getMeasuredWidth() - getPaddingRight(), getPaddingTop() + f10);
        float min = Math.min(org.telegram.messenger.g0.L(18.0f), Math.min(rectF.width(), rectF.height()) / 2.0f);
        Path path = this.w;
        path.rewind();
        path.addRoundRect(rectF, min, min, Path.Direction.CW);
        fh.g gVar = this.s;
        if (gVar != null) {
            gVar.setAlpha((int) (f11 * 255.0f));
            this.s.setBounds(getPaddingLeft() - org.telegram.messenger.g0.L(7.0f), 0, org.telegram.messenger.g0.L(7.0f) + (getMeasuredWidth() - getPaddingRight()), getPaddingBottom() + getPaddingTop() + ((int) f10));
            this.s.r(Math.min(org.telegram.messenger.g0.L(18.0f), f10 / 2.0f));
        }
    }

    @Override // org.telegram.ui.Components.e6, android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        k();
    }

    public void setBlurredBackground(fh.g gVar) {
        this.s = gVar;
    }

    public void setCallFragmentContextView(FragmentContextView fragmentContextView) {
        this.y = fragmentContextView;
        fragmentContextView.getCapsuleBlobDrawable().setCallback(this);
    }

    @Override // android.view.View
    public final void setPadding(int i7, int i10, int i11, int i12) {
        super.setPadding(i7, i10, i11, i12);
        k();
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
