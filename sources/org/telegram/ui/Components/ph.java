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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class ph extends FrameLayout {
    public final /* synthetic */ int a = 0;
    public int b;
    public final Object c;
    public final Object d;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ph(vf.k kVar, Context context) {
        super(context);
        this.e = kVar;
        this.b = -1;
        this.c = new Rect();
        this.d = new z5(this, 220L, pr.h);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                org.telegram.ui.h20 h20Var = (org.telegram.ui.h20) this.d;
                Path path = (Path) this.c;
                mi miVar = (mi) this.e;
                qg.b bVar = miVar.y0;
                if (bVar != null) {
                    bVar.setBounds(0, (int) miVar.S1, getMeasuredWidth(), getMeasuredHeight());
                    miVar.y0.draw(canvas);
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
                h20Var.b(canvas, rectF, 1, 1.0f);
                rectF.set(getPaddingLeft(), (getHeight() - dp3) - AndroidUtilities.dp(6.0f), getWidth() - getPaddingRight(), getHeight() - dp3);
                h20Var.b(canvas, rectF, 3, 1.0f);
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
                z5 z5Var = (z5) this.d;
                vf.k kVar = (vf.k) this.e;
                float d = z5Var.d(kVar.n.getWidth(), false);
                Rect rect = (Rect) this.c;
                float f10 = d / 2.0f;
                rect.set((int) (width - (kVar.n.getScaleX() * f10)), (int) (((1.0f - kVar.n.getScaleY()) * kVar.n.getHeight()) + kVar.n.getY()), (int) ((kVar.n.getScaleX() * f10) + width), (int) (kVar.n.getY() + kVar.n.getHeight()));
                kVar.r.setBounds(rect);
                kVar.r.draw(canvas);
                return super.drawChild(canvas, view, j10);
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        switch (this.a) {
            case 0:
                int i14 = this.b;
                mi miVar = (mi) this.e;
                int top = i14 - miVar.w.getTop();
                super.onLayout(z4, i10, i11, i12, i13);
                this.b = getHeight();
                if (miVar.w.getVisibility() == 0 && getHeight() - miVar.w.getTop() != top) {
                    miVar.w.setTranslationY(miVar.w.getTranslationY() + ((getHeight() - miVar.w.getTop()) - top));
                    miVar.w.animate().translationY(0.0f).setDuration(320L).setInterpolator(pr.h).start();
                    break;
                }
                break;
            default:
                super.onLayout(z4, i10, i11, i12, i13);
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        switch (this.a) {
            case 1:
                vf.k kVar = (vf.k) this.e;
                kVar.n.measure(i10, i11);
                invalidate();
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.max(this.b, AndroidUtilities.dp(36.0f) + kVar.n.getMeasuredHeight()), TLObject.FLAG_30));
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
    public ph(mi miVar, Context context) {
        super(context);
        this.e = miVar;
        this.c = new Path();
        this.d = new org.telegram.ui.h20();
    }
}
