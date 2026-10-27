package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public class ws extends j6 implements org.telegram.ui.ActionBar.p6 {
    public boolean E;
    public boolean F;
    public eh.d s;
    public final Path v;
    public final RectF w;
    public int x;
    public FragmentContextView y;

    public ws(Context context) {
        super(context);
        this.v = new Path();
        this.w = new RectF();
        this.x = 24;
        setOrientation(1);
        updateColors();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        int currentStyle;
        FragmentContextView fragmentContextView;
        Canvas canvas2 = canvas;
        if (getMetadata().c.a == 0.0f) {
            return;
        }
        eh.d dVar = this.s;
        if (dVar != null) {
            dVar.draw(canvas2);
        }
        FragmentContextView fragmentContextView2 = this.y;
        oe.j jVar = this.c;
        View view = null;
        if (fragmentContextView2 != null && ((currentStyle = fragmentContextView2.getCurrentStyle()) == 3 || currentStyle == 1)) {
            int entriesCount = getEntriesCount();
            for (int i10 = 0; i10 < entriesCount; i10++) {
                oe.g m10 = jVar.m(i10);
                float paddingTop = getPaddingTop() + m10.b().top;
                View view2 = ((i6) m10.a).a;
                float c10 = m10.c();
                if (c10 > 0.0f && (fragmentContextView = this.y) != null && (fragmentContextView == view2 || fragmentContextView.getParent() == view2)) {
                    hd capsuleBlobDrawable = this.y.getCapsuleBlobDrawable();
                    int dp = AndroidUtilities.dp(1.0f) + ((int) capsuleBlobDrawable.d());
                    int i11 = -dp;
                    capsuleBlobDrawable.setBounds(getPaddingLeft() - dp, i11, (getMeasuredWidth() - getPaddingRight()) + dp, (dp * 2) + AndroidUtilities.dp(36.0f) + i11);
                    capsuleBlobDrawable.setAlpha((int) (c10 * 255.0f));
                    canvas2.save();
                    canvas2.translate(0.0f, paddingTop);
                    capsuleBlobDrawable.draw(canvas2);
                    canvas2.restore();
                    view = view2;
                }
            }
        }
        View view3 = view;
        canvas2.save();
        canvas2.clipPath(this.v);
        int entriesCount2 = getEntriesCount();
        int i12 = 0;
        while (i12 < entriesCount2) {
            oe.g m11 = jVar.m(i12);
            float paddingTop2 = getPaddingTop() + m11.b().top;
            View view4 = ((i6) m11.a).a;
            float min = Math.min(1.0f, m11.c.a) * m11.c();
            if (min > 0.0f && view3 != view4) {
                int alpha = org.telegram.ui.ActionBar.y6.k0.getAlpha();
                org.telegram.ui.ActionBar.y6.k0.setAlpha((int) (alpha * min));
                float f7 = 1.0f - min;
                canvas2.drawLine(getPaddingLeft() + (AndroidUtilities.dp(16.0f) * f7), paddingTop2, getWidth() - ((AndroidUtilities.dp(16.0f) * f7) + getPaddingRight()), paddingTop2, org.telegram.ui.ActionBar.y6.k0);
                org.telegram.ui.ActionBar.y6.k0.setAlpha(alpha);
            }
            i12++;
            canvas2 = canvas;
        }
        this.E = view3 != null;
        this.F = false;
        super.dispatchDraw(canvas);
        canvas.restore();
        if (view3 != null) {
            this.F = true;
            this.E = false;
            super.dispatchDraw(canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        eh.d dVar;
        if (super.dispatchTouchEvent(motionEvent)) {
            return true;
        }
        return motionEvent.getAction() == 0 && (dVar = this.s) != null && dVar.getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY());
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        FragmentContextView fragmentContextView = this.y;
        boolean z10 = fragmentContextView != null && (fragmentContextView == view || fragmentContextView.getParent() == view);
        if (!(z10 && this.E) && (z10 || !this.F)) {
            return super.drawChild(canvas, view, j10);
        }
        return false;
    }

    @Override // org.telegram.ui.Components.j6
    public final void e() {
        j();
        invalidate();
    }

    public final void j() {
        float f7 = getMetadata().g.a;
        float f10 = getMetadata().c.a;
        RectF rectF = this.w;
        rectF.set(getPaddingLeft(), getPaddingTop(), getMeasuredWidth() - getPaddingRight(), getPaddingTop() + f7);
        float min = Math.min(AndroidUtilities.dp(this.x), Math.min(rectF.width(), rectF.height()) / 2.0f);
        Path path = this.v;
        path.rewind();
        path.addRoundRect(rectF, min, min, Path.Direction.CW);
        eh.d dVar = this.s;
        if (dVar != null) {
            dVar.setAlpha((int) (f10 * 255.0f));
            this.s.setBounds(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(14.0f), getMeasuredWidth() - AndroidUtilities.dp(4.0f), ((getPaddingBottom() + getPaddingTop()) + ((int) f7)) - AndroidUtilities.dp(14.0f));
            this.s.x(Math.min(AndroidUtilities.dp(this.x), f7 / 2.0f));
        }
    }

    @Override // org.telegram.ui.Components.j6, android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        j();
    }

    public void setBlurredBackground(eh.d dVar) {
        this.s = dVar;
    }

    public void setCallFragmentContextView(FragmentContextView fragmentContextView) {
        this.y = fragmentContextView;
        fragmentContextView.getCapsuleBlobDrawable().setCallback(this);
    }

    public void setDefaultRadiusDp(int i10) {
        this.x = i10;
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void updateColors() {
        eh.d dVar = this.s;
        if (dVar != null) {
            dVar.updateColors();
        }
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

    @Override // org.telegram.ui.ActionBar.p6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
