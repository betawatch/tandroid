package hi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.LongSparseArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.wu;
import org.telegram.ui.ns;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class v extends uj0 {
    public final /* synthetic */ int f3 = 0;
    public final Object g3;
    public final /* synthetic */ KeyEvent.Callback h3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(y yVar, Context context) {
        super(context, null);
        this.h3 = yVar;
        this.g3 = new h6.m(29);
    }

    @Override // org.telegram.ui.Components.uj0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int i7 = this.f3;
        KeyEvent.Callback callback = this.h3;
        Object obj = this.g3;
        switch (i7) {
            case 0:
                y yVar = (y) callback;
                canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (yVar.d * 255.0f), 31);
                canvas.save();
                float paddingLeft = getPaddingLeft();
                float width = getWidth() - getPaddingRight();
                canvas.clipRect(paddingLeft, 0.0f, width, getHeight());
                canvas.translate((1.0f - yVar.d) * width, 0.0f);
                super.dispatchDraw(canvas);
                canvas.restore();
                canvas.save();
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(paddingLeft, 0.0f, org.telegram.messenger.g0.L(12.0f) + paddingLeft, getHeight());
                h6.m mVar = (h6.m) obj;
                mVar.m(canvas, rectF, 0, yVar.d);
                rectF.set(width - org.telegram.messenger.g0.L(12.0f), 0.0f, width, getHeight());
                mVar.m(canvas, rectF, 2, yVar.d);
                canvas.restore();
                canvas.restore();
                break;
            case 1:
                HashSet hashSet = org.telegram.ui.g4.d1;
                ((org.telegram.ui.g4) obj).l();
                super.dispatchDraw(canvas);
                break;
            default:
                Paint paint = (Paint) obj;
                wu wuVar = (wu) callback;
                org.telegram.ui.Components.u5 u5Var = wuVar.H1;
                if (u5Var != null && wuVar.F1 >= 0 && wuVar.G1 >= 0 && wuVar.s1 != null && this.H) {
                    float e10 = u5Var.e(false, 0.0f);
                    if (e10 > 0.0f) {
                        int i10 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                        int i11 = TLObject.FLAG_31;
                        for (int i12 = 0; i12 < getChildCount(); i12++) {
                            View childAt = getChildAt(i12);
                            int R = RecyclerView.R(childAt);
                            if (R != -1 && R >= wuVar.F1 && R <= wuVar.G1) {
                                i10 = Math.min(i10, childAt.getTop() + ((int) childAt.getTranslationY()));
                                i11 = Math.max(i11, childAt.getBottom() + ((int) childAt.getTranslationY()));
                            }
                        }
                        if (i10 < i11) {
                            paint.setColor(org.telegram.ui.ActionBar.j6.r1(e10, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Ce, this.o2)));
                            canvas.drawRect(0.0f, i10, getMeasuredWidth(), i11, paint);
                        }
                        invalidate();
                    }
                }
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // org.telegram.ui.Components.uj0, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f3) {
            case 0:
                if (motionEvent.getX() > getPaddingLeft() && motionEvent.getX() < getWidth() - getPaddingRight()) {
                    break;
                }
                break;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.uj0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j3) {
        switch (this.f3) {
            case 2:
                return false;
            default:
                return super.drawChild(canvas, view, j3);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void l0(int i7) {
        org.telegram.ui.s3 s3Var;
        switch (this.f3) {
            case 1:
                org.telegram.ui.t3 t3Var = ((org.telegram.ui.g4) this.g3).L;
                if (t3Var != null && (s3Var = t3Var.c) != null) {
                    s3Var.invalidate();
                    break;
                }
                break;
            case 2:
                wu wuVar = (wu) this.h3;
                wuVar.q1.a();
                wuVar.b.invalidate();
                break;
        }
    }

    @Override // org.telegram.ui.Components.uj0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        switch (this.f3) {
            case 2:
                super.onDetachedFromWindow();
                wu wuVar = (wu) this.h3;
                org.telegram.ui.Components.p5.release(wuVar.b, (LongSparseArray<org.telegram.ui.Components.g5>) wuVar.m1);
                break;
            default:
                super.onDetachedFromWindow();
                break;
        }
    }

    @Override // org.telegram.ui.Components.uj0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        org.telegram.ui.ActionBar.g1 g1Var;
        switch (this.f3) {
            case 0:
                if (motionEvent.getX() <= getPaddingLeft() || motionEvent.getX() >= getWidth() - getPaddingRight()) {
                    return false;
                }
                getParent().requestDisallowInterceptTouchEvent(true);
                return super.onInterceptTouchEvent(motionEvent);
            case 1:
                org.telegram.ui.g4 g4Var = (org.telegram.ui.g4) this.g3;
                if (g4Var.d != null && g4Var.b == null && (((g1Var = g4Var.I) == null || !g1Var.isShowing()) && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3))) {
                    g4Var.b = null;
                    g4Var.d = null;
                    g4Var.f = null;
                } else if (g4Var.d != null && g4Var.b != null && motionEvent.getAction() == 1 && (getAdapter() instanceof org.telegram.ui.e4)) {
                    motionEvent2 = motionEvent;
                    org.telegram.ui.g4.j(g4Var, (org.telegram.ui.e4) getAdapter(), motionEvent2, g4Var.f, g4Var.d, 0, 0);
                    return super.onInterceptTouchEvent(motionEvent2);
                }
                motionEvent2 = motionEvent;
                return super.onInterceptTouchEvent(motionEvent2);
            default:
                ns p10 = ns.p();
                wu wuVar = (wu) this.h3;
                return super.onInterceptTouchEvent(motionEvent) || p10.q(motionEvent, wuVar.r1, wuVar.I1, this.o2);
        }
    }

    @Override // org.telegram.ui.Components.uj0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        switch (this.f3) {
            case 1:
                z1(z10, i7, i10, i11, i12);
                ((org.telegram.ui.k3) this.h3).K = -1.0f;
                break;
            case 2:
                super.onLayout(z10, i7, i10, i11, i12);
                ((wu) this.h3).q1.a();
                break;
            default:
                super.onLayout(z10, i7, i10, i11, i12);
                break;
        }
    }

    @Override // org.telegram.ui.Components.uj0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onMeasure(int i7, int i10) {
        switch (this.f3) {
            case 2:
                View.MeasureSpec.getSize(i7);
                ((wu) this.h3).y1.y1(40);
                super.onMeasure(i7, i10);
                break;
            default:
                super.onMeasure(i7, i10);
                break;
        }
    }

    @Override // org.telegram.ui.Components.uj0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.g1 g1Var;
        switch (this.f3) {
            case 1:
                org.telegram.ui.g4 g4Var = (org.telegram.ui.g4) this.g3;
                if (g4Var.d != null && g4Var.b == null && (((g1Var = g4Var.I) == null || !g1Var.isShowing()) && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3))) {
                    g4Var.b = null;
                    g4Var.d = null;
                    g4Var.f = null;
                }
                break;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void z1(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if ((childAt.getTag() instanceof Integer) && ((Integer) childAt.getTag()).intValue() == 90 && childAt.getBottom() < getMeasuredHeight()) {
                int measuredHeight = getMeasuredHeight();
                childAt.layout(0, measuredHeight - childAt.getMeasuredHeight(), childAt.getMeasuredWidth(), measuredHeight);
                return;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(wu wuVar, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        this.h3 = wuVar;
        this.g3 = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(org.telegram.ui.k3 k3Var, Context context) {
        super(context, null);
        this.h3 = k3Var;
        this.g3 = k3Var.M;
    }
}
