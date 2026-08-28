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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ph extends FrameLayout {
    public final /* synthetic */ int a = 0;
    public int b;
    public final Object c;
    public final Object d;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ph(pf.l lVar, Context context) {
        super(context);
        this.e = lVar;
        this.b = -1;
        this.c = new Rect();
        this.d = new y5(this, 220L, gr.h);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                org.telegram.ui.s10 s10Var = (org.telegram.ui.s10) this.d;
                Path path = (Path) this.c;
                ki kiVar = (ki) this.e;
                kg.d dVar = kiVar.x0;
                if (dVar != null) {
                    dVar.setBounds(0, (int) kiVar.R1, getMeasuredWidth(), getMeasuredHeight());
                    kiVar.x0.draw(canvas);
                }
                float dp = AndroidUtilities.dp(20.0f);
                int dp2 = AndroidUtilities.dp(7.0f);
                int dp3 = AndroidUtilities.dp(7.0f);
                RectF rectF = AndroidUtilities.rectTmp;
                float f10 = dp2;
                rectF.set(getPaddingLeft(), f10, getWidth() - getPaddingRight(), getHeight() - dp3);
                path.rewind();
                path.addRoundRect(rectF, dp, dp, Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
                canvas.saveLayerAlpha(rectF, 255, 31);
                super.dispatchDraw(canvas);
                rectF.set(getPaddingLeft(), f10, getWidth() - getPaddingRight(), AndroidUtilities.dp(6.0f) + dp2);
                s10Var.b(canvas, rectF, 1, 1.0f);
                rectF.set(getPaddingLeft(), (getHeight() - dp3) - AndroidUtilities.dp(6.0f), getWidth() - getPaddingRight(), getHeight() - dp3);
                s10Var.b(canvas, rectF, 3, 1.0f);
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
                y5 y5Var = (y5) this.d;
                pf.l lVar = (pf.l) this.e;
                float d = y5Var.d(lVar.n.getWidth(), false);
                Rect rect = (Rect) this.c;
                float f10 = d / 2.0f;
                rect.set((int) (width - (lVar.n.getScaleX() * f10)), (int) (((1.0f - lVar.n.getScaleY()) * lVar.n.getHeight()) + lVar.n.getY()), (int) ((lVar.n.getScaleX() * f10) + width), (int) (lVar.n.getY() + lVar.n.getHeight()));
                lVar.r.setBounds(rect);
                lVar.r.draw(canvas);
                return super.drawChild(canvas, view, j10);
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        switch (this.a) {
            case 0:
                int i13 = this.b;
                ki kiVar = (ki) this.e;
                int top = i13 - kiVar.w.getTop();
                super.onLayout(z10, i9, i10, i11, i12);
                this.b = getHeight();
                if (kiVar.w.getVisibility() == 0 && getHeight() - kiVar.w.getTop() != top) {
                    kiVar.w.setTranslationY(kiVar.w.getTranslationY() + ((getHeight() - kiVar.w.getTop()) - top));
                    kiVar.w.animate().translationY(0.0f).setDuration(320L).setInterpolator(gr.h).start();
                    break;
                }
                break;
            default:
                super.onLayout(z10, i9, i10, i11, i12);
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i9, int i10) {
        switch (this.a) {
            case 1:
                pf.l lVar = (pf.l) this.e;
                lVar.n.measure(i9, i10);
                invalidate();
                super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(Math.max(this.b, AndroidUtilities.dp(36.0f) + lVar.n.getMeasuredHeight()), TLObject.FLAG_30));
                if (this.b < 0) {
                    this.b = getMeasuredHeight();
                    break;
                }
                break;
            default:
                super.onMeasure(i9, i10);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ph(ki kiVar, Context context) {
        super(context);
        this.e = kiVar;
        this.c = new Path();
        this.d = new org.telegram.ui.s10();
    }
}
