package gi;

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
import org.telegram.ui.Components.pu;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.is;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class v extends tj0 {
    public final /* synthetic */ int f3 = 0;
    public final Object g3;
    public final /* synthetic */ KeyEvent.Callback h3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(y yVar, Context context) {
        super(context, null);
        this.h3 = yVar;
        this.g3 = new k4.j(24);
    }

    @Override // org.telegram.ui.Components.tj0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int i3 = this.f3;
        KeyEvent.Callback callback = this.h3;
        Object obj = this.g3;
        switch (i3) {
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
                k4.j jVar = (k4.j) obj;
                jVar.w(canvas, rectF, 0, yVar.d);
                rectF.set(width - org.telegram.messenger.g0.L(12.0f), 0.0f, width, getHeight());
                jVar.w(canvas, rectF, 2, yVar.d);
                canvas.restore();
                canvas.restore();
                break;
            case 1:
                HashSet hashSet = org.telegram.ui.i4.d1;
                ((org.telegram.ui.i4) obj).l();
                super.dispatchDraw(canvas);
                break;
            default:
                Paint paint = (Paint) obj;
                pu puVar = (pu) callback;
                org.telegram.ui.Components.u5 u5Var = puVar.E1;
                if (u5Var != null && puVar.C1 >= 0 && puVar.D1 >= 0 && puVar.p1 != null && this.H) {
                    float e10 = u5Var.e(false, 0.0f);
                    if (e10 > 0.0f) {
                        int i10 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                        int i11 = TLObject.FLAG_31;
                        for (int i12 = 0; i12 < getChildCount(); i12++) {
                            View childAt = getChildAt(i12);
                            int R = RecyclerView.R(childAt);
                            if (R != -1 && R >= puVar.C1 && R <= puVar.D1) {
                                i10 = Math.min(i10, childAt.getTop() + ((int) childAt.getTranslationY()));
                                i11 = Math.max(i11, childAt.getBottom() + ((int) childAt.getTranslationY()));
                            }
                        }
                        if (i10 < i11) {
                            paint.setColor(org.telegram.ui.ActionBar.k6.r1(e10, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.ze, this.o2)));
                            canvas.drawRect(0.0f, i10, getMeasuredWidth(), i11, paint);
                        }
                        invalidate();
                    }
                }
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // org.telegram.ui.Components.tj0, android.view.ViewGroup, android.view.View
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

    @Override // org.telegram.ui.Components.tj0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        switch (this.f3) {
            case 2:
                return false;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void l0(int i3) {
        org.telegram.ui.t3 t3Var;
        switch (this.f3) {
            case 1:
                org.telegram.ui.u3 u3Var = ((org.telegram.ui.i4) this.g3).L;
                if (u3Var != null && (t3Var = u3Var.c) != null) {
                    t3Var.invalidate();
                    break;
                }
                break;
            case 2:
                pu puVar = (pu) this.h3;
                puVar.n1.a();
                puVar.b.invalidate();
                break;
        }
    }

    @Override // org.telegram.ui.Components.tj0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        switch (this.f3) {
            case 2:
                super.onDetachedFromWindow();
                pu puVar = (pu) this.h3;
                org.telegram.ui.Components.p5.release(puVar.b, (LongSparseArray<org.telegram.ui.Components.g5>) puVar.j1);
                break;
            default:
                super.onDetachedFromWindow();
                break;
        }
    }

    @Override // org.telegram.ui.Components.tj0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        org.telegram.ui.ActionBar.f1 f1Var;
        switch (this.f3) {
            case 0:
                if (motionEvent.getX() <= getPaddingLeft() || motionEvent.getX() >= getWidth() - getPaddingRight()) {
                    return false;
                }
                getParent().requestDisallowInterceptTouchEvent(true);
                return super.onInterceptTouchEvent(motionEvent);
            case 1:
                org.telegram.ui.i4 i4Var = (org.telegram.ui.i4) this.g3;
                if (i4Var.d != null && i4Var.b == null && (((f1Var = i4Var.I) == null || !f1Var.isShowing()) && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3))) {
                    i4Var.b = null;
                    i4Var.d = null;
                    i4Var.f = null;
                } else if (i4Var.d != null && i4Var.b != null && motionEvent.getAction() == 1 && (getAdapter() instanceof org.telegram.ui.g4)) {
                    motionEvent2 = motionEvent;
                    org.telegram.ui.i4.j(i4Var, (org.telegram.ui.g4) getAdapter(), motionEvent2, i4Var.f, i4Var.d, 0, 0);
                    return super.onInterceptTouchEvent(motionEvent2);
                }
                motionEvent2 = motionEvent;
                return super.onInterceptTouchEvent(motionEvent2);
            default:
                is p10 = is.p();
                pu puVar = (pu) this.h3;
                return super.onInterceptTouchEvent(motionEvent) || p10.q(motionEvent, puVar.o1, puVar.F1, this.o2);
        }
    }

    @Override // org.telegram.ui.Components.tj0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        switch (this.f3) {
            case 1:
                z1(z10, i3, i10, i11, i12);
                ((org.telegram.ui.l3) this.h3).K = -1.0f;
                break;
            case 2:
                super.onLayout(z10, i3, i10, i11, i12);
                ((pu) this.h3).n1.a();
                break;
            default:
                super.onLayout(z10, i3, i10, i11, i12);
                break;
        }
    }

    @Override // org.telegram.ui.Components.tj0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onMeasure(int i3, int i10) {
        switch (this.f3) {
            case 2:
                View.MeasureSpec.getSize(i3);
                ((pu) this.h3).v1.y1(40);
                super.onMeasure(i3, i10);
                break;
            default:
                super.onMeasure(i3, i10);
                break;
        }
    }

    @Override // org.telegram.ui.Components.tj0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.f1 f1Var;
        switch (this.f3) {
            case 1:
                org.telegram.ui.i4 i4Var = (org.telegram.ui.i4) this.g3;
                if (i4Var.d != null && i4Var.b == null && (((f1Var = i4Var.I) == null || !f1Var.isShowing()) && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3))) {
                    i4Var.b = null;
                    i4Var.d = null;
                    i4Var.f = null;
                }
                break;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void z1(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
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
    public v(pu puVar, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        this.h3 = puVar;
        this.g3 = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(org.telegram.ui.l3 l3Var, Context context) {
        super(context, null);
        this.h3 = l3Var;
        this.g3 = l3Var.M;
    }
}
