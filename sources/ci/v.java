package ci;

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
import org.telegram.ui.Components.wv;
import org.telegram.ui.Components.zl0;
import org.telegram.ui.k20;
import org.telegram.ui.rt;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes4.dex */
public final class v extends zl0 {
    public final /* synthetic */ int e3 = 0;
    public final Object f3;
    public final /* synthetic */ KeyEvent.Callback g3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(y yVar, Context context) {
        super(context, null);
        this.g3 = yVar;
        this.f3 = new k20();
    }

    @Override // org.telegram.ui.Components.zl0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int i10 = this.e3;
        KeyEvent.Callback callback = this.g3;
        Object obj = this.f3;
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
                k20 k20Var = (k20) obj;
                k20Var.b(canvas, rectF, 0, yVar.d);
                rectF.set(width - AndroidUtilities.dp(12.0f), 0.0f, width, getHeight());
                k20Var.b(canvas, rectF, 2, yVar.d);
                canvas.restore();
                canvas.restore();
                break;
            case 1:
                HashSet hashSet = org.telegram.ui.i4.b1;
                ((org.telegram.ui.i4) obj).n();
                super.dispatchDraw(canvas);
                break;
            default:
                Paint paint = (Paint) obj;
                wv wvVar = (wv) callback;
                org.telegram.ui.Components.e6 e6Var = wvVar.M;
                if (e6Var != null && wvVar.K >= 0 && wvVar.L >= 0 && wvVar.n != null && this.G) {
                    float d = e6Var.d(0.0f, false);
                    if (d > 0.0f) {
                        int i11 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                        int i12 = TLObject.FLAG_31;
                        for (int i13 = 0; i13 < getChildCount(); i13++) {
                            View childAt = getChildAt(i13);
                            int R = RecyclerView.R(childAt);
                            if (R != -1 && R >= wvVar.K && R <= wvVar.L) {
                                i11 = Math.min(i11, childAt.getTop() + ((int) childAt.getTranslationY()));
                                i12 = Math.max(i12, childAt.getBottom() + ((int) childAt.getTranslationY()));
                            }
                        }
                        if (i11 < i12) {
                            paint.setColor(org.telegram.ui.ActionBar.i6.l1(d, org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Ld, this.p2)));
                            canvas.drawRect(0.0f, i11, getMeasuredWidth(), i12, paint);
                        }
                        invalidate();
                    }
                }
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // org.telegram.ui.Components.zl0, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.e3) {
            case 0:
                if (motionEvent.getX() > getPaddingLeft() && motionEvent.getX() < getWidth() - getPaddingRight()) {
                    break;
                }
                break;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.zl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j3) {
        switch (this.e3) {
            case 2:
                return false;
            default:
                return super.drawChild(canvas, view, j3);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void l0(int i10) {
        org.telegram.ui.u3 u3Var;
        ViewGroup viewGroup;
        switch (this.e3) {
            case 1:
                org.telegram.ui.v3 v3Var = ((org.telegram.ui.i4) this.f3).K;
                if (v3Var != null && (u3Var = v3Var.c) != null) {
                    u3Var.invalidate();
                    break;
                }
                break;
            case 2:
                wv wvVar = (wv) this.g3;
                wvVar.f.a();
                viewGroup = ((org.telegram.ui.ActionBar.f3) wvVar).containerView;
                viewGroup.invalidate();
                break;
        }
    }

    @Override // org.telegram.ui.Components.zl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        ViewGroup viewGroup;
        switch (this.e3) {
            case 2:
                super.onDetachedFromWindow();
                wv wvVar = (wv) this.g3;
                viewGroup = ((org.telegram.ui.ActionBar.f3) wvVar).containerView;
                org.telegram.ui.Components.z5.release(viewGroup, (LongSparseArray<org.telegram.ui.Components.q5>) wvVar.b);
                break;
            default:
                super.onDetachedFromWindow();
                break;
        }
    }

    @Override // org.telegram.ui.Components.zl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        org.telegram.ui.ActionBar.n1 n1Var;
        switch (this.e3) {
            case 0:
                if (motionEvent.getX() <= getPaddingLeft() || motionEvent.getX() >= getWidth() - getPaddingRight()) {
                    return false;
                }
                getParent().requestDisallowInterceptTouchEvent(true);
                return super.onInterceptTouchEvent(motionEvent);
            case 1:
                org.telegram.ui.i4 i4Var = (org.telegram.ui.i4) this.f3;
                if (i4Var.d != null && i4Var.b == null && (((n1Var = i4Var.H) == null || !n1Var.isShowing()) && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3))) {
                    i4Var.b = null;
                    i4Var.d = null;
                    i4Var.f = null;
                } else if (i4Var.d != null && i4Var.b != null && motionEvent.getAction() == 1 && (getAdapter() instanceof org.telegram.ui.g4)) {
                    motionEvent2 = motionEvent;
                    org.telegram.ui.i4.l(i4Var, (org.telegram.ui.g4) getAdapter(), motionEvent2, i4Var.f, i4Var.d, 0, 0);
                    return super.onInterceptTouchEvent(motionEvent2);
                }
                motionEvent2 = motionEvent;
                return super.onInterceptTouchEvent(motionEvent2);
            default:
                rt q6 = rt.q();
                wv wvVar = (wv) this.g3;
                return super.onInterceptTouchEvent(motionEvent) || q6.r(motionEvent, wvVar.h, wvVar.N, this.p2);
        }
    }

    @Override // org.telegram.ui.Components.zl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.e3) {
            case 1:
                x1(z10, i10, i11, i12, i13);
                ((org.telegram.ui.m3) this.g3).I = -1.0f;
                break;
            case 2:
                super.onLayout(z10, i10, i11, i12, i13);
                ((wv) this.g3).f.a();
                break;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                break;
        }
    }

    @Override // org.telegram.ui.Components.zl0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onMeasure(int i10, int i11) {
        switch (this.e3) {
            case 2:
                View.MeasureSpec.getSize(i10);
                ((wv) this.g3).y.y1(40);
                super.onMeasure(i10, i11);
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }

    @Override // org.telegram.ui.Components.zl0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.n1 n1Var;
        switch (this.e3) {
            case 1:
                org.telegram.ui.i4 i4Var = (org.telegram.ui.i4) this.f3;
                if (i4Var.d != null && i4Var.b == null && (((n1Var = i4Var.H) == null || !n1Var.isShowing()) && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3))) {
                    i4Var.b = null;
                    i4Var.d = null;
                    i4Var.f = null;
                }
                break;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void x1(boolean z10, int i10, int i11, int i12, int i13) {
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
    public v(wv wvVar, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var);
        this.g3 = wvVar;
        this.f3 = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(org.telegram.ui.m3 m3Var, Context context) {
        super(context, null);
        this.g3 = m3Var;
        this.f3 = m3Var.K;
    }
}
