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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class lh extends FrameLayout {
    public final /* synthetic */ int a = 0;
    public int b;
    public final Object c;
    public final Object d;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lh(qf.m mVar, Context context) {
        super(context);
        this.e = mVar;
        this.b = -1;
        this.c = new Rect();
        this.d = new y5(this, 220L, er.h);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                org.telegram.ui.v10 v10Var = (org.telegram.ui.v10) this.d;
                Path path = (Path) this.c;
                gi giVar = (gi) this.e;
                lg.d dVar = giVar.x0;
                if (dVar != null) {
                    dVar.setBounds(0, (int) giVar.R1, getMeasuredWidth(), getMeasuredHeight());
                    giVar.x0.draw(canvas);
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
                v10Var.b(canvas, rectF, 1, 1.0f);
                rectF.set(getPaddingLeft(), (getHeight() - dp3) - AndroidUtilities.dp(6.0f), getWidth() - getPaddingRight(), getHeight() - dp3);
                v10Var.b(canvas, rectF, 3, 1.0f);
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
                qf.m mVar = (qf.m) this.e;
                float d = y5Var.d(mVar.n.getWidth(), false);
                Rect rect = (Rect) this.c;
                float f10 = d / 2.0f;
                rect.set((int) (width - (mVar.n.getScaleX() * f10)), (int) (((1.0f - mVar.n.getScaleY()) * mVar.n.getHeight()) + mVar.n.getY()), (int) ((mVar.n.getScaleX() * f10) + width), (int) (mVar.n.getY() + mVar.n.getHeight()));
                mVar.r.setBounds(rect);
                mVar.r.draw(canvas);
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
                gi giVar = (gi) this.e;
                int top = i14 - giVar.w.getTop();
                super.onLayout(z10, i10, i11, i12, i13);
                this.b = getHeight();
                if (giVar.w.getVisibility() == 0 && getHeight() - giVar.w.getTop() != top) {
                    giVar.w.setTranslationY(giVar.w.getTranslationY() + ((getHeight() - giVar.w.getTop()) - top));
                    giVar.w.animate().translationY(0.0f).setDuration(320L).setInterpolator(er.h).start();
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
                qf.m mVar = (qf.m) this.e;
                mVar.n.measure(i10, i11);
                invalidate();
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.max(this.b, AndroidUtilities.dp(36.0f) + mVar.n.getMeasuredHeight()), TLObject.FLAG_30));
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
    public lh(gi giVar, Context context) {
        super(context);
        this.e = giVar;
        this.c = new Path();
        this.d = new org.telegram.ui.v10();
    }
}
