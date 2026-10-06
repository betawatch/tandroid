package hg;

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
import org.telegram.ui.Components.e6;
import org.telegram.ui.Components.tr;
import org.telegram.ui.Components.xi;
import org.telegram.ui.k20;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
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
        this.d = new e6(this, 220L, tr.h);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 1:
                k20 k20Var = (k20) this.d;
                Path path = (Path) this.c;
                xi xiVar = (xi) this.e;
                ch.d dVar = xiVar.B0;
                if (dVar != null) {
                    dVar.setBounds(0, (int) xiVar.V1, getMeasuredWidth(), getMeasuredHeight());
                    xiVar.B0.draw(canvas);
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
                k20Var.b(canvas, rectF, 1, 1.0f);
                rectF.set(getPaddingLeft(), (getHeight() - dp3) - AndroidUtilities.dp(6.0f), getWidth() - getPaddingRight(), getHeight() - dp3);
                k20Var.b(canvas, rectF, 3, 1.0f);
                canvas.restore();
                canvas.restore();
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j3) {
        switch (this.a) {
            case 0:
                float width = getWidth() / 2.0f;
                e6 e6Var = (e6) this.d;
                n nVar = (n) this.e;
                float d = e6Var.d(nVar.r.getWidth(), false);
                Rect rect = (Rect) this.c;
                float f7 = d / 2.0f;
                rect.set((int) (width - (nVar.r.getScaleX() * f7)), (int) (((1.0f - nVar.r.getScaleY()) * nVar.r.getHeight()) + nVar.r.getY()), (int) ((nVar.r.getScaleX() * f7) + width), (int) (nVar.r.getY() + nVar.r.getHeight()));
                nVar.s.setBounds(rect);
                nVar.s.draw(canvas);
                return super.drawChild(canvas, view, j3);
            default:
                return super.drawChild(canvas, view, j3);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.a) {
            case 1:
                int i14 = this.b;
                xi xiVar = (xi) this.e;
                int top = i14 - xiVar.w.getTop();
                super.onLayout(z10, i10, i11, i12, i13);
                this.b = getHeight();
                if (xiVar.w.getVisibility() == 0 && getHeight() - xiVar.w.getTop() != top) {
                    xiVar.w.setTranslationY(xiVar.w.getTranslationY() + ((getHeight() - xiVar.w.getTop()) - top));
                    xiVar.w.animate().translationY(0.0f).setDuration(320L).setInterpolator(tr.h).start();
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
                nVar.r.measure(i10, i11);
                invalidate();
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.max(this.b, AndroidUtilities.dp(36.0f) + nVar.r.getMeasuredHeight()), TLObject.FLAG_30));
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
    public k(xi xiVar, Context context) {
        super(context);
        this.e = xiVar;
        this.c = new Path();
        this.d = new k20();
    }
}
