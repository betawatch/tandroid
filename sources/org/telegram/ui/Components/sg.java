package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class sg extends a6 {
    public kg.d s;
    public final Path v;
    public final RectF w;
    public FragmentContextView x;

    public sg(Context context) {
        super(context);
        this.v = new Path();
        this.w = new RectF();
        setOrientation(1);
        kg.d dVar = this.s;
        if (dVar != null) {
            dVar.u();
        }
        Color.alpha(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.d6, false));
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
        kg.d dVar = this.s;
        if (dVar != null) {
            dVar.draw(canvas2);
        }
        FragmentContextView fragmentContextView3 = this.x;
        td.h hVar = this.c;
        if (fragmentContextView3 == null || !((currentStyle = fragmentContextView3.getCurrentStyle()) == 3 || currentStyle == 1)) {
            z10 = false;
        } else {
            int entriesCount = getEntriesCount();
            boolean z11 = false;
            for (int i9 = 0; i9 < entriesCount; i9++) {
                td.e n10 = hVar.n(i9);
                float paddingTop = getPaddingTop() + n10.b().top;
                View view = ((z5) n10.a).a;
                float c10 = n10.c();
                if (c10 > 0.0f && ((fragmentContextView2 = this.x) == view || fragmentContextView2.getParent() == view)) {
                    yc capsuleBlobDrawable = this.x.getCapsuleBlobDrawable();
                    int dp = AndroidUtilities.dp(1.0f) + ((int) capsuleBlobDrawable.c());
                    int i10 = -dp;
                    capsuleBlobDrawable.setBounds(getPaddingLeft() - dp, i10, (getMeasuredWidth() - getPaddingRight()) + dp, (dp * 2) + AndroidUtilities.dp(36.0f) + i10);
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
        canvas2.clipPath(this.v);
        int entriesCount2 = getEntriesCount();
        int i11 = 0;
        while (i11 < entriesCount2) {
            td.e n11 = hVar.n(i11);
            float paddingTop2 = getPaddingTop() + n11.b().top;
            View view2 = ((z5) n11.a).a;
            float min = Math.min(1.0f, n11.c.a) * n11.c();
            if (min > 0.0f && (!z10 || (fragmentContextView = this.x) == null || (fragmentContextView != view2 && fragmentContextView.getParent() != view2))) {
                int alpha = org.telegram.ui.ActionBar.f6.k0.getAlpha();
                org.telegram.ui.ActionBar.f6.k0.setAlpha((int) (alpha * min));
                float f10 = 1.0f - min;
                canvas2.drawLine(getPaddingLeft() + (AndroidUtilities.dp(16.0f) * f10), paddingTop2, getWidth() - ((AndroidUtilities.dp(16.0f) * f10) + getPaddingRight()), paddingTop2, org.telegram.ui.ActionBar.f6.k0);
                org.telegram.ui.ActionBar.f6.k0.setAlpha(alpha);
            }
            i11++;
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        kg.d dVar;
        if (super.dispatchTouchEvent(motionEvent)) {
            return true;
        }
        return motionEvent.getAction() == 0 && (dVar = this.s) != null && dVar.getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY());
    }

    @Override // org.telegram.ui.Components.a6
    public final void e() {
        j();
        invalidate();
    }

    public final void j() {
        float f10 = getMetadata().g.a;
        float f11 = getMetadata().c.a;
        RectF rectF = this.w;
        rectF.set(getPaddingLeft(), getPaddingTop(), getMeasuredWidth() - getPaddingRight(), getPaddingTop() + f10);
        float min = Math.min(AndroidUtilities.dp(18.0f), Math.min(rectF.width(), rectF.height()) / 2.0f);
        Path path = this.v;
        path.rewind();
        path.addRoundRect(rectF, min, min, Path.Direction.CW);
        kg.d dVar = this.s;
        if (dVar != null) {
            dVar.setAlpha((int) (f11 * 255.0f));
            this.s.setBounds(getPaddingLeft() - AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f) + (getMeasuredWidth() - getPaddingRight()), getPaddingBottom() + getPaddingTop() + ((int) f10));
            this.s.p(Math.min(AndroidUtilities.dp(18.0f), f10 / 2.0f));
        }
    }

    @Override // org.telegram.ui.Components.a6, android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        j();
    }

    public void setBlurredBackground(kg.d dVar) {
        this.s = dVar;
    }

    public void setCallFragmentContextView(FragmentContextView fragmentContextView) {
        this.x = fragmentContextView;
        fragmentContextView.getCapsuleBlobDrawable().setCallback(this);
    }

    @Override // android.view.View
    public final void setPadding(int i9, int i10, int i11, int i12) {
        super.setPadding(i9, i10, i11, i12);
        j();
        invalidate();
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable)) {
            return true;
        }
        FragmentContextView fragmentContextView = this.x;
        return fragmentContextView != null && fragmentContextView.getCapsuleBlobDrawable() == drawable;
    }
}
