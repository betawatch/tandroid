package ag;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.us;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.t5;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class q extends FrameLayout {
    public final /* synthetic */ int a = 0;
    public int b;
    public final Object c;
    public final Object d;
    public final /* synthetic */ us e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(w wVar, Context context) {
        super(context);
        this.e = wVar;
        this.b = -1;
        this.c = new Rect();
        this.d = new t5(this, 220L, gr.h);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 1:
                li.k kVar = (li.k) this.d;
                Path path = (Path) this.c;
                bi biVar = (bi) this.e;
                vg.f fVar = biVar.v2;
                if (fVar != null) {
                    fVar.setBounds(0, (int) biVar.P3, getMeasuredWidth(), getMeasuredHeight());
                    biVar.v2.draw(canvas);
                }
                float L = org.telegram.messenger.i0.L(20.0f);
                int L2 = org.telegram.messenger.i0.L(7.0f);
                int L3 = org.telegram.messenger.i0.L(7.0f);
                RectF rectF = org.telegram.messenger.i0.P;
                float f7 = L2;
                rectF.set(getPaddingLeft(), f7, getWidth() - getPaddingRight(), getHeight() - L3);
                path.rewind();
                path.addRoundRect(rectF, L, L, Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
                canvas.saveLayerAlpha(rectF, zs.e4, 31);
                super.dispatchDraw(canvas);
                rectF.set(getPaddingLeft(), f7, getWidth() - getPaddingRight(), org.telegram.messenger.i0.L(6.0f) + L2);
                kVar.o(canvas, rectF, 1, 1.0f);
                rectF.set(getPaddingLeft(), (getHeight() - L3) - org.telegram.messenger.i0.L(6.0f), getWidth() - getPaddingRight(), getHeight() - L3);
                kVar.o(canvas, rectF, 3, 1.0f);
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
                t5 t5Var = (t5) this.d;
                w wVar = (w) this.e;
                float e = t5Var.e(false, wVar.n.getWidth());
                Rect rect = (Rect) this.c;
                float f7 = e / 2.0f;
                rect.set((int) (width - (wVar.n.getScaleX() * f7)), (int) (((1.0f - wVar.n.getScaleY()) * wVar.n.getHeight()) + wVar.n.getY()), (int) ((wVar.n.getScaleX() * f7) + width), (int) (wVar.n.getY() + wVar.n.getHeight()));
                wVar.r.setBounds(rect);
                wVar.r.draw(canvas);
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
                bi biVar = (bi) this.e;
                int top = i14 - biVar.s1.getTop();
                super.onLayout(z10, i10, i11, i12, i13);
                this.b = getHeight();
                if (biVar.s1.getVisibility() == 0 && getHeight() - biVar.s1.getTop() != top) {
                    biVar.s1.setTranslationY(biVar.s1.getTranslationY() + ((getHeight() - biVar.s1.getTop()) - top));
                    biVar.s1.animate().translationY(0.0f).setDuration(320L).setInterpolator(gr.h).start();
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
                w wVar = (w) this.e;
                wVar.n.measure(i10, i11);
                invalidate();
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.max(this.b, org.telegram.messenger.i0.L(36.0f) + wVar.n.getMeasuredHeight()), TLObject.FLAG_30));
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
    public q(bi biVar, Context context) {
        super(context);
        this.e = biVar;
        this.c = new Path();
        this.d = new li.k(23);
    }
}
