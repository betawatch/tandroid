package nh;

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
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.jv;
import org.telegram.ui.ht;
import org.telegram.ui.u10;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class v extends jl0 {
    public final /* synthetic */ int T2 = 0;
    public final Object U2;
    public final /* synthetic */ KeyEvent.Callback V2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(y yVar, Context context) {
        super(context, null);
        this.V2 = yVar;
        this.U2 = new u10();
    }

    @Override // org.telegram.ui.Components.jl0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int i10 = this.T2;
        KeyEvent.Callback callback = this.V2;
        Object obj = this.U2;
        switch (i10) {
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
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(paddingLeft, 0.0f, AndroidUtilities.dp(12.0f) + paddingLeft, getHeight());
                u10 u10Var = (u10) obj;
                u10Var.b(canvas, rectF, 0, yVar.d);
                rectF.set(width - AndroidUtilities.dp(12.0f), 0.0f, width, getHeight());
                u10Var.b(canvas, rectF, 2, yVar.d);
                canvas.restore();
                canvas.restore();
                break;
            case 1:
                HashSet hashSet = org.telegram.ui.m4.X0;
                ((org.telegram.ui.m4) obj).n();
                super.dispatchDraw(canvas);
                break;
            default:
                Paint paint = (Paint) obj;
                jv jvVar = (jv) callback;
                org.telegram.ui.Components.d6 d6Var = jvVar.I;
                if (d6Var != null && jvVar.G >= 0 && jvVar.H >= 0 && jvVar.n != null && this.C) {
                    float d = d6Var.d(0.0f, false);
                    if (d > 0.0f) {
                        int i11 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                        int i12 = TLObject.FLAG_31;
                        for (int i13 = 0; i13 < getChildCount(); i13++) {
                            View childAt = getChildAt(i13);
                            int R = RecyclerView.R(childAt);
                            if (R != -1 && R >= jvVar.G && R <= jvVar.H) {
                                i11 = Math.min(i11, childAt.getTop() + ((int) childAt.getTranslationY()));
                                i12 = Math.max(i12, childAt.getBottom() + ((int) childAt.getTranslationY()));
                            }
                        }
                        if (i11 < i12) {
                            paint.setColor(org.telegram.ui.ActionBar.g6.l1(d, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Ld, this.l2)));
                            canvas.drawRect(0.0f, i11, getMeasuredWidth(), i12, paint);
                        }
                        invalidate();
                    }
                }
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // org.telegram.ui.Components.jl0, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.T2) {
            case 0:
                if (motionEvent.getX() > getPaddingLeft() && motionEvent.getX() < getWidth() - getPaddingRight()) {
                    break;
                }
                break;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.jl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        switch (this.T2) {
            case 2:
                return false;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void k0(int i10, int i11) {
        org.telegram.ui.y3 y3Var;
        ViewGroup viewGroup;
        switch (this.T2) {
            case 1:
                org.telegram.ui.z3 z3Var = ((org.telegram.ui.m4) this.U2).G;
                if (z3Var != null && (y3Var = z3Var.c) != null) {
                    y3Var.invalidate();
                    break;
                }
                break;
            case 2:
                jv jvVar = (jv) this.V2;
                jvVar.f.a();
                viewGroup = ((org.telegram.ui.ActionBar.f3) jvVar).containerView;
                viewGroup.invalidate();
                break;
        }
    }

    @Override // org.telegram.ui.Components.jl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        ViewGroup viewGroup;
        switch (this.T2) {
            case 2:
                super.onDetachedFromWindow();
                jv jvVar = (jv) this.V2;
                viewGroup = ((org.telegram.ui.ActionBar.f3) jvVar).containerView;
                org.telegram.ui.Components.y5.release(viewGroup, (LongSparseArray<org.telegram.ui.Components.p5>) jvVar.b);
                break;
            default:
                super.onDetachedFromWindow();
                break;
        }
    }

    @Override // org.telegram.ui.Components.jl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        org.telegram.ui.ActionBar.o1 o1Var;
        switch (this.T2) {
            case 0:
                if (motionEvent.getX() <= getPaddingLeft() || motionEvent.getX() >= getWidth() - getPaddingRight()) {
                    return false;
                }
                getParent().requestDisallowInterceptTouchEvent(true);
                return super.onInterceptTouchEvent(motionEvent);
            case 1:
                org.telegram.ui.m4 m4Var = (org.telegram.ui.m4) this.U2;
                if (m4Var.d != null && m4Var.b == null && (((o1Var = m4Var.D) == null || !o1Var.isShowing()) && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3))) {
                    m4Var.b = null;
                    m4Var.d = null;
                    m4Var.f = null;
                } else if (m4Var.d != null && m4Var.b != null && motionEvent.getAction() == 1 && (getAdapter() instanceof org.telegram.ui.k4)) {
                    motionEvent2 = motionEvent;
                    org.telegram.ui.m4.l(m4Var, (org.telegram.ui.k4) getAdapter(), motionEvent2, m4Var.f, m4Var.d, 0, 0);
                    return super.onInterceptTouchEvent(motionEvent2);
                }
                motionEvent2 = motionEvent;
                return super.onInterceptTouchEvent(motionEvent2);
            default:
                ht q6 = ht.q();
                jv jvVar = (jv) this.V2;
                return super.onInterceptTouchEvent(motionEvent) || q6.r(motionEvent, jvVar.h, jvVar.J, this.l2);
        }
    }

    @Override // org.telegram.ui.Components.jl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.T2) {
            case 1:
                w1(z10, i10, i11, i12, i13);
                ((org.telegram.ui.q3) this.V2).E = -1.0f;
                break;
            case 2:
                super.onLayout(z10, i10, i11, i12, i13);
                ((jv) this.V2).f.a();
                break;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                break;
        }
    }

    @Override // org.telegram.ui.Components.jl0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onMeasure(int i10, int i11) {
        switch (this.T2) {
            case 2:
                View.MeasureSpec.getSize(i10);
                ((jv) this.V2).y.y1(40);
                super.onMeasure(i10, i11);
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }

    @Override // org.telegram.ui.Components.jl0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.o1 o1Var;
        switch (this.T2) {
            case 1:
                org.telegram.ui.m4 m4Var = (org.telegram.ui.m4) this.U2;
                if (m4Var.d != null && m4Var.b == null && (((o1Var = m4Var.D) == null || !o1Var.isShowing()) && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3))) {
                    m4Var.b = null;
                    m4Var.d = null;
                    m4Var.f = null;
                }
                break;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void w1(boolean z10, int i10, int i11, int i12, int i13) {
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
    public v(jv jvVar, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var);
        this.V2 = jvVar;
        this.U2 = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(org.telegram.ui.q3 q3Var, Context context) {
        super(context, null);
        this.V2 = q3Var;
        this.U2 = q3Var.G;
    }
}
