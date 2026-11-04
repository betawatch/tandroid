package lg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.cs;
import org.telegram.messenger.hs;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.u5;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class j extends FrameLayout {
    public final /* synthetic */ int a = 0;
    public int b;
    public final Object c;
    public final Object d;
    public final /* synthetic */ cs e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(m mVar, Context context) {
        super(context);
        this.e = mVar;
        this.b = -1;
        this.c = new Rect();
        this.d = new u5(this, 220L, xq.h);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 1:
                k4.j jVar = (k4.j) this.d;
                Path path = (Path) this.c;
                bi biVar = (bi) this.e;
                gh.g gVar = biVar.w2;
                if (gVar != null) {
                    gVar.setBounds(0, (int) biVar.Q3, getMeasuredWidth(), getMeasuredHeight());
                    biVar.w2.draw(canvas);
                }
                float L = org.telegram.messenger.g0.L(20.0f);
                int L2 = org.telegram.messenger.g0.L(7.0f);
                int L3 = org.telegram.messenger.g0.L(7.0f);
                RectF rectF = org.telegram.messenger.g0.P;
                float f10 = L2;
                rectF.set(getPaddingLeft(), f10, getWidth() - getPaddingRight(), getHeight() - L3);
                path.rewind();
                path.addRoundRect(rectF, L, L, Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
                canvas.saveLayerAlpha(rectF, hs.e4, 31);
                super.dispatchDraw(canvas);
                rectF.set(getPaddingLeft(), f10, getWidth() - getPaddingRight(), org.telegram.messenger.g0.L(6.0f) + L2);
                jVar.w(canvas, rectF, 1, 1.0f);
                rectF.set(getPaddingLeft(), (getHeight() - L3) - org.telegram.messenger.g0.L(6.0f), getWidth() - getPaddingRight(), getHeight() - L3);
                jVar.w(canvas, rectF, 3, 1.0f);
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
                u5 u5Var = (u5) this.d;
                m mVar = (m) this.e;
                float e10 = u5Var.e(false, mVar.n.getWidth());
                Rect rect = (Rect) this.c;
                float f10 = e10 / 2.0f;
                rect.set((int) (width - (mVar.n.getScaleX() * f10)), (int) (((1.0f - mVar.n.getScaleY()) * mVar.n.getHeight()) + mVar.n.getY()), (int) ((mVar.n.getScaleX() * f10) + width), (int) (mVar.n.getY() + mVar.n.getHeight()));
                mVar.r.setBounds(rect);
                mVar.r.draw(canvas);
                return super.drawChild(canvas, view, j10);
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        switch (this.a) {
            case 1:
                int i13 = this.b;
                bi biVar = (bi) this.e;
                int top = i13 - biVar.t1.getTop();
                super.onLayout(z10, i3, i10, i11, i12);
                this.b = getHeight();
                if (biVar.t1.getVisibility() == 0 && getHeight() - biVar.t1.getTop() != top) {
                    biVar.t1.setTranslationY(biVar.t1.getTranslationY() + ((getHeight() - biVar.t1.getTop()) - top));
                    biVar.t1.animate().translationY(0.0f).setDuration(320L).setInterpolator(xq.h).start();
                    break;
                }
                break;
            default:
                super.onLayout(z10, i3, i10, i11, i12);
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i3, int i10) {
        switch (this.a) {
            case 0:
                m mVar = (m) this.e;
                mVar.n.measure(i3, i10);
                invalidate();
                super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(Math.max(this.b, org.telegram.messenger.g0.L(36.0f) + mVar.n.getMeasuredHeight()), TLObject.FLAG_30));
                if (this.b < 0) {
                    this.b = getMeasuredHeight();
                    break;
                }
                break;
            default:
                super.onMeasure(i3, i10);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(bi biVar, Context context) {
        super(context);
        this.e = biVar;
        this.c = new Path();
        this.d = new k4.j(24);
    }
}
