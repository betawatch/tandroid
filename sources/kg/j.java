package kg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.fs;
import org.telegram.messenger.ks;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.c6;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.si;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class j extends FrameLayout {
    public final /* synthetic */ int a = 0;
    public int b;
    public final Object c;
    public final Object d;
    public final /* synthetic */ fs e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(n nVar, Context context) {
        super(context);
        this.e = nVar;
        this.b = -1;
        this.c = new Rect();
        this.d = new c6(this, 220L, lr.h);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 1:
                h6.m mVar = (h6.m) this.d;
                Path path = (Path) this.c;
                si siVar = (si) this.e;
                fh.g gVar = siVar.z2;
                if (gVar != null) {
                    gVar.setBounds(0, (int) siVar.T3, getMeasuredWidth(), getMeasuredHeight());
                    siVar.z2.draw(canvas);
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
                canvas.saveLayerAlpha(rectF, ks.e4, 31);
                super.dispatchDraw(canvas);
                rectF.set(getPaddingLeft(), f10, getWidth() - getPaddingRight(), org.telegram.messenger.g0.L(6.0f) + L2);
                mVar.n(canvas, rectF, 1, 1.0f);
                rectF.set(getPaddingLeft(), (getHeight() - L3) - org.telegram.messenger.g0.L(6.0f), getWidth() - getPaddingRight(), getHeight() - L3);
                mVar.n(canvas, rectF, 3, 1.0f);
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
                c6 c6Var = (c6) this.d;
                n nVar = (n) this.e;
                float e10 = c6Var.e(false, nVar.n.getWidth());
                Rect rect = (Rect) this.c;
                float f10 = e10 / 2.0f;
                rect.set((int) (width - (nVar.n.getScaleX() * f10)), (int) (((1.0f - nVar.n.getScaleY()) * nVar.n.getHeight()) + nVar.n.getY()), (int) ((nVar.n.getScaleX() * f10) + width), (int) (nVar.n.getY() + nVar.n.getHeight()));
                nVar.r.setBounds(rect);
                nVar.r.draw(canvas);
                return super.drawChild(canvas, view, j3);
            default:
                return super.drawChild(canvas, view, j3);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        switch (this.a) {
            case 1:
                int i13 = this.b;
                si siVar = (si) this.e;
                int top = i13 - siVar.w1.getTop();
                super.onLayout(z10, i7, i10, i11, i12);
                this.b = getHeight();
                if (siVar.w1.getVisibility() == 0 && getHeight() - siVar.w1.getTop() != top) {
                    siVar.w1.setTranslationY(siVar.w1.getTranslationY() + ((getHeight() - siVar.w1.getTop()) - top));
                    siVar.w1.animate().translationY(0.0f).setDuration(320L).setInterpolator(lr.h).start();
                    break;
                }
                break;
            default:
                super.onLayout(z10, i7, i10, i11, i12);
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i7, int i10) {
        switch (this.a) {
            case 0:
                n nVar = (n) this.e;
                nVar.n.measure(i7, i10);
                invalidate();
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(Math.max(this.b, org.telegram.messenger.g0.L(36.0f) + nVar.n.getMeasuredHeight()), TLObject.FLAG_30));
                if (this.b < 0) {
                    this.b = getMeasuredHeight();
                    break;
                }
                break;
            default:
                super.onMeasure(i7, i10);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(si siVar, Context context) {
        super(context);
        this.e = siVar;
        this.c = new Path();
        this.d = new h6.m(29);
    }
}
