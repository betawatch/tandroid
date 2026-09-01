package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.LongSparseArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class k3 extends org.telegram.ui.Components.tl0 {
    public final /* synthetic */ int U2 = 1;
    public final Object V2;
    public final /* synthetic */ KeyEvent.Callback W2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k3(qh.u uVar, Context context) {
        super(context, null);
        this.W2 = uVar;
        this.V2 = new h20();
    }

    @Override // org.telegram.ui.Components.tl0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int i10 = this.U2;
        KeyEvent.Callback callback = this.W2;
        Object obj = this.V2;
        switch (i10) {
            case 0:
                HashSet hashSet = l4.Y0;
                ((l4) obj).n();
                super.dispatchDraw(canvas);
                break;
            case 1:
                Paint paint = (Paint) obj;
                org.telegram.ui.Components.ov ovVar = (org.telegram.ui.Components.ov) callback;
                org.telegram.ui.Components.z5 z5Var = ovVar.J;
                if (z5Var != null && ovVar.H >= 0 && ovVar.I >= 0 && ovVar.n != null && this.D) {
                    float d = z5Var.d(0.0f, false);
                    if (d > 0.0f) {
                        int i11 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                        int i12 = TLObject.FLAG_31;
                        for (int i13 = 0; i13 < getChildCount(); i13++) {
                            View childAt = getChildAt(i13);
                            int R = RecyclerView.R(childAt);
                            if (R != -1 && R >= ovVar.H && R <= ovVar.I) {
                                i11 = Math.min(i11, childAt.getTop() + ((int) childAt.getTranslationY()));
                                i12 = Math.max(i12, childAt.getBottom() + ((int) childAt.getTranslationY()));
                            }
                        }
                        if (i11 < i12) {
                            paint.setColor(org.telegram.ui.ActionBar.k6.l1(d, org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Ld, this.m2)));
                            canvas.drawRect(0.0f, i11, getMeasuredWidth(), i12, paint);
                        }
                        invalidate();
                    }
                }
                super.dispatchDraw(canvas);
                break;
            default:
                qh.u uVar = (qh.u) callback;
                canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (uVar.d * 255.0f), 31);
                canvas.save();
                float paddingLeft = getPaddingLeft();
                float width = getWidth() - getPaddingRight();
                canvas.clipRect(paddingLeft, 0.0f, width, getHeight());
                canvas.translate((1.0f - uVar.d) * width, 0.0f);
                super.dispatchDraw(canvas);
                canvas.restore();
                canvas.save();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(paddingLeft, 0.0f, AndroidUtilities.dp(12.0f) + paddingLeft, getHeight());
                h20 h20Var = (h20) obj;
                h20Var.b(canvas, rectF, 0, uVar.d);
                rectF.set(width - AndroidUtilities.dp(12.0f), 0.0f, width, getHeight());
                h20Var.b(canvas, rectF, 2, uVar.d);
                canvas.restore();
                canvas.restore();
                break;
        }
    }

    @Override // org.telegram.ui.Components.tl0, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.U2) {
            case 2:
                if (motionEvent.getX() > getPaddingLeft() && motionEvent.getX() < getWidth() - getPaddingRight()) {
                    break;
                }
                break;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.tl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        switch (this.U2) {
            case 1:
                return false;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void k0(int i10, int i11) {
        x3 x3Var;
        ViewGroup viewGroup;
        switch (this.U2) {
            case 0:
                y3 y3Var = ((l4) this.V2).H;
                if (y3Var != null && (x3Var = y3Var.c) != null) {
                    x3Var.invalidate();
                    break;
                }
                break;
            case 1:
                org.telegram.ui.Components.ov ovVar = (org.telegram.ui.Components.ov) this.W2;
                ovVar.f.a();
                viewGroup = ((org.telegram.ui.ActionBar.h3) ovVar).containerView;
                viewGroup.invalidate();
                break;
        }
    }

    @Override // org.telegram.ui.Components.tl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        ViewGroup viewGroup;
        switch (this.U2) {
            case 1:
                super.onDetachedFromWindow();
                org.telegram.ui.Components.ov ovVar = (org.telegram.ui.Components.ov) this.W2;
                viewGroup = ((org.telegram.ui.ActionBar.h3) ovVar).containerView;
                org.telegram.ui.Components.u5.release(viewGroup, (LongSparseArray<org.telegram.ui.Components.l5>) ovVar.b);
                break;
            default:
                super.onDetachedFromWindow();
                break;
        }
    }

    @Override // org.telegram.ui.Components.tl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        org.telegram.ui.ActionBar.p1 p1Var;
        switch (this.U2) {
            case 0:
                l4 l4Var = (l4) this.V2;
                if (l4Var.d != null && l4Var.b == null && (((p1Var = l4Var.E) == null || !p1Var.isShowing()) && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3))) {
                    l4Var.b = null;
                    l4Var.d = null;
                    l4Var.f = null;
                } else if (l4Var.d != null && l4Var.b != null && motionEvent.getAction() == 1 && (getAdapter() instanceof j4)) {
                    motionEvent2 = motionEvent;
                    l4.l(l4Var, (j4) getAdapter(), motionEvent2, l4Var.f, l4Var.d, 0, 0);
                    return super.onInterceptTouchEvent(motionEvent2);
                }
                motionEvent2 = motionEvent;
                return super.onInterceptTouchEvent(motionEvent2);
            case 1:
                qt q10 = qt.q();
                org.telegram.ui.Components.ov ovVar = (org.telegram.ui.Components.ov) this.W2;
                return super.onInterceptTouchEvent(motionEvent) || q10.r(motionEvent, ovVar.h, ovVar.K, this.m2);
            default:
                if (motionEvent.getX() <= getPaddingLeft() || motionEvent.getX() >= getWidth() - getPaddingRight()) {
                    return false;
                }
                getParent().requestDisallowInterceptTouchEvent(true);
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override // org.telegram.ui.Components.tl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        switch (this.U2) {
            case 0:
                w1(z4, i10, i11, i12, i13);
                ((p3) this.W2).F = -1.0f;
                break;
            case 1:
                super.onLayout(z4, i10, i11, i12, i13);
                ((org.telegram.ui.Components.ov) this.W2).f.a();
                break;
            default:
                super.onLayout(z4, i10, i11, i12, i13);
                break;
        }
    }

    @Override // org.telegram.ui.Components.tl0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onMeasure(int i10, int i11) {
        switch (this.U2) {
            case 1:
                View.MeasureSpec.getSize(i10);
                ((org.telegram.ui.Components.ov) this.W2).y.y1(40);
                super.onMeasure(i10, i11);
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }

    @Override // org.telegram.ui.Components.tl0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.p1 p1Var;
        switch (this.U2) {
            case 0:
                l4 l4Var = (l4) this.V2;
                if (l4Var.d != null && l4Var.b == null && (((p1Var = l4Var.E) == null || !p1Var.isShowing()) && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3))) {
                    l4Var.b = null;
                    l4Var.d = null;
                    l4Var.f = null;
                }
                break;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void w1(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
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
    public k3(org.telegram.ui.Components.ov ovVar, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var);
        this.W2 = ovVar;
        this.V2 = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k3(p3 p3Var, Context context) {
        super(context, null);
        this.W2 = p3Var;
        this.V2 = p3Var.H;
    }
}
