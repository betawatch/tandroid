package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class sh extends FrameLayout {
    public final /* synthetic */ int a = 0;
    public int b;
    public final Object c;
    public final Object d;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sh(sf.l lVar, Context context) {
        super(context);
        this.e = lVar;
        this.b = -1;
        this.c = new Rect();
        this.d = new d6(this, 220L, jr.h);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                org.telegram.ui.u10 u10Var = (org.telegram.ui.u10) this.d;
                Path path = (Path) this.c;
                ni niVar = (ni) this.e;
                ng.d dVar = niVar.x0;
                if (dVar != null) {
                    dVar.setBounds(0, (int) niVar.R1, getMeasuredWidth(), getMeasuredHeight());
                    niVar.x0.draw(canvas);
                }
                float dp = AndroidUtilities.dp(20.0f);
                int dp2 = AndroidUtilities.dp(7.0f);
                int dp3 = AndroidUtilities.dp(7.0f);
                RectF rectF = AndroidUtilities.rectTmp;
                float f9 = dp2;
                rectF.set(getPaddingLeft(), f9, getWidth() - getPaddingRight(), getHeight() - dp3);
                path.rewind();
                path.addRoundRect(rectF, dp, dp, Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
                canvas.saveLayerAlpha(rectF, 255, 31);
                super.dispatchDraw(canvas);
                rectF.set(getPaddingLeft(), f9, getWidth() - getPaddingRight(), AndroidUtilities.dp(6.0f) + dp2);
                u10Var.b(canvas, rectF, 1, 1.0f);
                rectF.set(getPaddingLeft(), (getHeight() - dp3) - AndroidUtilities.dp(6.0f), getWidth() - getPaddingRight(), getHeight() - dp3);
                u10Var.b(canvas, rectF, 3, 1.0f);
                canvas.restore();
                canvas.restore();
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        switch (this.a) {
            case 1:
                float width = getWidth() / 2.0f;
                d6 d6Var = (d6) this.d;
                sf.l lVar = (sf.l) this.e;
                float d = d6Var.d(lVar.n.getWidth(), false);
                Rect rect = (Rect) this.c;
                float f9 = d / 2.0f;
                rect.set((int) (width - (lVar.n.getScaleX() * f9)), (int) (((1.0f - lVar.n.getScaleY()) * lVar.n.getHeight()) + lVar.n.getY()), (int) ((lVar.n.getScaleX() * f9) + width), (int) (lVar.n.getY() + lVar.n.getHeight()));
                lVar.r.setBounds(rect);
                lVar.r.draw(canvas);
                return super.drawChild(canvas, view, j10);
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.a) {
            case 0:
                int i14 = this.b;
                ni niVar = (ni) this.e;
                int top = i14 - niVar.w.getTop();
                super.onLayout(z10, i10, i11, i12, i13);
                this.b = getHeight();
                if (niVar.w.getVisibility() == 0 && getHeight() - niVar.w.getTop() != top) {
                    niVar.w.setTranslationY(niVar.w.getTranslationY() + ((getHeight() - niVar.w.getTop()) - top));
                    niVar.w.animate().translationY(0.0f).setDuration(320L).setInterpolator(jr.h).start();
                    break;
                }
                break;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        switch (this.a) {
            case 1:
                sf.l lVar = (sf.l) this.e;
                lVar.n.measure(i10, i11);
                invalidate();
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.max(this.b, AndroidUtilities.dp(36.0f) + lVar.n.getMeasuredHeight()), TLObject.FLAG_30));
                if (this.b < 0) {
                    this.b = getMeasuredHeight();
                    break;
                }
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sh(ni niVar, Context context) {
        super(context);
        this.e = niVar;
        this.c = new Path();
        this.d = new org.telegram.ui.u10();
    }
}
