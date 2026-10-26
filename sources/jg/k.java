package jg;

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
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.h6;
import org.telegram.ui.Components.ti;
import org.telegram.ui.w10;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class k extends FrameLayout {
    public final /* synthetic */ int a = 0;
    public int b;
    public final Object c;
    public final Object d;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(n nVar, Context context) {
        super(context);
        this.e = nVar;
        this.b = -1;
        this.c = new Rect();
        this.d = new h6(this, 220L, ds.h);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 1:
                w10 w10Var = (w10) this.d;
                Path path = (Path) this.c;
                ti tiVar = (ti) this.e;
                eh.d dVar = tiVar.E0;
                if (dVar != null) {
                    dVar.setBounds(0, (int) tiVar.Y1, getMeasuredWidth(), getMeasuredHeight());
                    tiVar.E0.draw(canvas);
                }
                float dp = AndroidUtilities.dp(20.0f);
                int dp2 = AndroidUtilities.dp(7.0f);
                int dp3 = AndroidUtilities.dp(7.0f);
                RectF rectF = AndroidUtilities.rectTmp;
                float f7 = dp2;
                rectF.set(getPaddingLeft(), f7, getWidth() - getPaddingRight(), getHeight() - dp3);
                path.rewind();
                path.addRoundRect(rectF, dp, dp, Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
                canvas.saveLayerAlpha(rectF, 255, 31);
                super.dispatchDraw(canvas);
                rectF.set(getPaddingLeft(), f7, getWidth() - getPaddingRight(), AndroidUtilities.dp(6.0f) + dp2);
                w10Var.b(canvas, rectF, 1, 1.0f);
                rectF.set(getPaddingLeft(), (getHeight() - dp3) - AndroidUtilities.dp(6.0f), getWidth() - getPaddingRight(), getHeight() - dp3);
                w10Var.b(canvas, rectF, 3, 1.0f);
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
            case 0:
                float width = getWidth() / 2.0f;
                h6 h6Var = (h6) this.d;
                n nVar = (n) this.e;
                float d = h6Var.d(nVar.n.getWidth(), false);
                Rect rect = (Rect) this.c;
                float f7 = d / 2.0f;
                rect.set((int) (width - (nVar.n.getScaleX() * f7)), (int) (((1.0f - nVar.n.getScaleY()) * nVar.n.getHeight()) + nVar.n.getY()), (int) ((nVar.n.getScaleX() * f7) + width), (int) (nVar.n.getY() + nVar.n.getHeight()));
                nVar.r.setBounds(rect);
                nVar.r.draw(canvas);
                return super.drawChild(canvas, view, j10);
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.a) {
            case 1:
                int i14 = this.b;
                ti tiVar = (ti) this.e;
                int top = i14 - tiVar.w.getTop();
                super.onLayout(z10, i10, i11, i12, i13);
                this.b = getHeight();
                if (tiVar.w.getVisibility() == 0 && getHeight() - tiVar.w.getTop() != top) {
                    tiVar.w.setTranslationY(tiVar.w.getTranslationY() + ((getHeight() - tiVar.w.getTop()) - top));
                    tiVar.w.animate().translationY(0.0f).setDuration(320L).setInterpolator(ds.h).start();
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
            case 0:
                n nVar = (n) this.e;
                nVar.n.measure(i10, i11);
                invalidate();
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.max(this.b, AndroidUtilities.dp(36.0f) + nVar.n.getMeasuredHeight()), TLObject.FLAG_30));
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
    public k(ti tiVar, Context context) {
        super(context);
        this.e = tiVar;
        this.c = new Path();
        this.d = new w10();
    }
}
