package org.telegram.ui;

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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class g3 extends org.telegram.ui.Components.tk0 {
    public final /* synthetic */ int e3 = 1;
    public final Object f3;
    public final /* synthetic */ KeyEvent.Callback g3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g3(vh.t tVar, Context context) {
        super(context, null);
        this.g3 = tVar;
        this.f3 = new li.k(23);
    }

    @Override // org.telegram.ui.Components.tk0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int i10 = this.e3;
        KeyEvent.Callback callback = this.g3;
        Object obj = this.f3;
        switch (i10) {
            case 0:
                HashSet hashSet = h4.c1;
                ((h4) obj).l();
                super.dispatchDraw(canvas);
                break;
            case 1:
                Paint paint = (Paint) obj;
                org.telegram.ui.Components.cv cvVar = (org.telegram.ui.Components.cv) callback;
                org.telegram.ui.Components.t5 t5Var = cvVar.D1;
                if (t5Var != null && cvVar.B1 >= 0 && cvVar.C1 >= 0 && cvVar.o1 != null && this.G) {
                    float e = t5Var.e(false, 0.0f);
                    if (e > 0.0f) {
                        int i11 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                        int i12 = TLObject.FLAG_31;
                        for (int i13 = 0; i13 < getChildCount(); i13++) {
                            View childAt = getChildAt(i13);
                            int R = RecyclerView.R(childAt);
                            if (R != -1 && R >= cvVar.B1 && R <= cvVar.C1) {
                                i11 = Math.min(i11, childAt.getTop() + ((int) childAt.getTranslationY()));
                                i12 = Math.max(i12, childAt.getBottom() + ((int) childAt.getTranslationY()));
                            }
                        }
                        if (i11 < i12) {
                            paint.setColor(org.telegram.ui.ActionBar.t6.r1(e, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.ze, this.n2)));
                            canvas.drawRect(0.0f, i11, getMeasuredWidth(), i12, paint);
                        }
                        invalidate();
                    }
                }
                super.dispatchDraw(canvas);
                break;
            default:
                vh.t tVar = (vh.t) callback;
                canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (tVar.d * 255.0f), 31);
                canvas.save();
                float paddingLeft = getPaddingLeft();
                float width = getWidth() - getPaddingRight();
                canvas.clipRect(paddingLeft, 0.0f, width, getHeight());
                canvas.translate((1.0f - tVar.d) * width, 0.0f);
                super.dispatchDraw(canvas);
                canvas.restore();
                canvas.save();
                RectF rectF = org.telegram.messenger.i0.P;
                rectF.set(paddingLeft, 0.0f, org.telegram.messenger.i0.L(12.0f) + paddingLeft, getHeight());
                li.k kVar = (li.k) obj;
                kVar.o(canvas, rectF, 0, tVar.d);
                rectF.set(width - org.telegram.messenger.i0.L(12.0f), 0.0f, width, getHeight());
                kVar.o(canvas, rectF, 2, tVar.d);
                canvas.restore();
                canvas.restore();
                break;
        }
    }

    @Override // org.telegram.ui.Components.tk0, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.e3) {
            case 2:
                if (motionEvent.getX() > getPaddingLeft() && motionEvent.getX() < getWidth() - getPaddingRight()) {
                    break;
                }
                break;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.tk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        switch (this.e3) {
            case 1:
                return false;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void l0(int i10) {
        t3 t3Var;
        switch (this.e3) {
            case 0:
                u3 u3Var = ((h4) this.f3).K;
                if (u3Var != null && (t3Var = u3Var.c) != null) {
                    t3Var.invalidate();
                    break;
                }
                break;
            case 1:
                org.telegram.ui.Components.cv cvVar = (org.telegram.ui.Components.cv) this.g3;
                cvVar.m1.a();
                cvVar.b.invalidate();
                break;
        }
    }

    @Override // org.telegram.ui.Components.tk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        switch (this.e3) {
            case 1:
                super.onDetachedFromWindow();
                org.telegram.ui.Components.cv cvVar = (org.telegram.ui.Components.cv) this.g3;
                org.telegram.ui.Components.o5.release(cvVar.b, (LongSparseArray<org.telegram.ui.Components.f5>) cvVar.i1);
                break;
            default:
                super.onDetachedFromWindow();
                break;
        }
    }

    @Override // org.telegram.ui.Components.tk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        org.telegram.ui.ActionBar.k1 k1Var;
        switch (this.e3) {
            case 0:
                h4 h4Var = (h4) this.f3;
                if (h4Var.d != null && h4Var.b == null && (((k1Var = h4Var.H) == null || !k1Var.isShowing()) && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3))) {
                    h4Var.b = null;
                    h4Var.d = null;
                    h4Var.f = null;
                } else if (h4Var.d != null && h4Var.b != null && motionEvent.getAction() == 1 && (getAdapter() instanceof f4)) {
                    motionEvent2 = motionEvent;
                    h4.j(h4Var, (f4) getAdapter(), motionEvent2, h4Var.f, h4Var.d, 0, 0);
                    return super.onInterceptTouchEvent(motionEvent2);
                }
                motionEvent2 = motionEvent;
                return super.onInterceptTouchEvent(motionEvent2);
            case 1:
                lt p5 = lt.p();
                org.telegram.ui.Components.cv cvVar = (org.telegram.ui.Components.cv) this.g3;
                return super.onInterceptTouchEvent(motionEvent) || p5.q(motionEvent, cvVar.n1, cvVar.E1, this.n2);
            default:
                if (motionEvent.getX() <= getPaddingLeft() || motionEvent.getX() >= getWidth() - getPaddingRight()) {
                    return false;
                }
                getParent().requestDisallowInterceptTouchEvent(true);
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override // org.telegram.ui.Components.tk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.e3) {
            case 0:
                z1(z10, i10, i11, i12, i13);
                ((l3) this.g3).J = -1.0f;
                break;
            case 1:
                super.onLayout(z10, i10, i11, i12, i13);
                ((org.telegram.ui.Components.cv) this.g3).m1.a();
                break;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                break;
        }
    }

    @Override // org.telegram.ui.Components.tk0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onMeasure(int i10, int i11) {
        switch (this.e3) {
            case 1:
                View.MeasureSpec.getSize(i10);
                ((org.telegram.ui.Components.cv) this.g3).u1.y1(40);
                super.onMeasure(i10, i11);
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }

    @Override // org.telegram.ui.Components.tk0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k1 k1Var;
        switch (this.e3) {
            case 0:
                h4 h4Var = (h4) this.f3;
                if (h4Var.d != null && h4Var.b == null && (((k1Var = h4Var.H) == null || !k1Var.isShowing()) && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3))) {
                    h4Var.b = null;
                    h4Var.d = null;
                    h4Var.f = null;
                }
                break;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void z1(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if ((childAt.getTag() instanceof Integer) && ((Integer) childAt.getTag()).intValue() == 90 && childAt.getBottom() < getMeasuredHeight()) {
                int measuredHeight = getMeasuredHeight();
                childAt.layout(0, measuredHeight - childAt.getMeasuredHeight(), childAt.getMeasuredWidth(), measuredHeight);
                return;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g3(org.telegram.ui.Components.cv cvVar, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, p6Var);
        this.g3 = cvVar;
        this.f3 = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g3(l3 l3Var, Context context) {
        super(context, null);
        this.g3 = l3Var;
        this.f3 = l3Var.L;
    }
}
