package bi;

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
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.wv;
import org.telegram.ui.m20;
import org.telegram.ui.tt;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class z extends vl0 {
    public final /* synthetic */ int X2 = 0;
    public final Object Y2;
    public final /* synthetic */ KeyEvent.Callback Z2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(c0 c0Var, Context context) {
        super(context, null);
        this.Z2 = c0Var;
        this.Y2 = new m20();
    }

    @Override // org.telegram.ui.Components.vl0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int i10 = this.X2;
        KeyEvent.Callback callback = this.Z2;
        Object obj = this.Y2;
        switch (i10) {
            case 0:
                c0 c0Var = (c0) callback;
                canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (c0Var.d * 255.0f), 31);
                canvas.save();
                float paddingLeft = getPaddingLeft();
                float width = getWidth() - getPaddingRight();
                canvas.clipRect(paddingLeft, 0.0f, width, getHeight());
                canvas.translate((1.0f - c0Var.d) * width, 0.0f);
                super.dispatchDraw(canvas);
                canvas.restore();
                canvas.save();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(paddingLeft, 0.0f, AndroidUtilities.dp(12.0f) + paddingLeft, getHeight());
                m20 m20Var = (m20) obj;
                m20Var.b(canvas, rectF, 0, c0Var.d);
                rectF.set(width - AndroidUtilities.dp(12.0f), 0.0f, width, getHeight());
                m20Var.b(canvas, rectF, 2, c0Var.d);
                canvas.restore();
                canvas.restore();
                break;
            case 1:
                HashSet hashSet = org.telegram.ui.j4.b1;
                ((org.telegram.ui.j4) obj).n();
                super.dispatchDraw(canvas);
                break;
            default:
                Paint paint = (Paint) obj;
                wv wvVar = (wv) callback;
                org.telegram.ui.Components.d6 d6Var = wvVar.M;
                if (d6Var != null && wvVar.K >= 0 && wvVar.L >= 0 && wvVar.n != null && this.G) {
                    float d = d6Var.d(0.0f, false);
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
                            paint.setColor(org.telegram.ui.ActionBar.j6.l1(d, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Ld, this.p2)));
                            canvas.drawRect(0.0f, i11, getMeasuredWidth(), i12, paint);
                        }
                        invalidate();
                    }
                }
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // org.telegram.ui.Components.vl0, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.X2) {
            case 0:
                if (motionEvent.getX() > getPaddingLeft() && motionEvent.getX() < getWidth() - getPaddingRight()) {
                    break;
                }
                break;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.vl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j3) {
        switch (this.X2) {
            case 2:
                return false;
            default:
                return super.drawChild(canvas, view, j3);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void k0(int i10, int i11) {
        org.telegram.ui.v3 v3Var;
        ViewGroup viewGroup;
        switch (this.X2) {
            case 1:
                org.telegram.ui.w3 w3Var = ((org.telegram.ui.j4) this.Y2).K;
                if (w3Var != null && (v3Var = w3Var.c) != null) {
                    v3Var.invalidate();
                    break;
                }
                break;
            case 2:
                wv wvVar = (wv) this.Z2;
                wvVar.f.a();
                viewGroup = ((org.telegram.ui.ActionBar.h3) wvVar).containerView;
                viewGroup.invalidate();
                break;
        }
    }

    @Override // org.telegram.ui.Components.vl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        ViewGroup viewGroup;
        switch (this.X2) {
            case 2:
                super.onDetachedFromWindow();
                wv wvVar = (wv) this.Z2;
                viewGroup = ((org.telegram.ui.ActionBar.h3) wvVar).containerView;
                org.telegram.ui.Components.y5.release(viewGroup, (LongSparseArray<org.telegram.ui.Components.p5>) wvVar.b);
                break;
            default:
                super.onDetachedFromWindow();
                break;
        }
    }

    @Override // org.telegram.ui.Components.vl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        org.telegram.ui.ActionBar.p1 p1Var;
        switch (this.X2) {
            case 0:
                if (motionEvent.getX() <= getPaddingLeft() || motionEvent.getX() >= getWidth() - getPaddingRight()) {
                    return false;
                }
                getParent().requestDisallowInterceptTouchEvent(true);
                return super.onInterceptTouchEvent(motionEvent);
            case 1:
                org.telegram.ui.j4 j4Var = (org.telegram.ui.j4) this.Y2;
                if (j4Var.d != null && j4Var.b == null && (((p1Var = j4Var.H) == null || !p1Var.isShowing()) && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3))) {
                    j4Var.b = null;
                    j4Var.d = null;
                    j4Var.f = null;
                } else if (j4Var.d != null && j4Var.b != null && motionEvent.getAction() == 1 && (getAdapter() instanceof org.telegram.ui.h4)) {
                    motionEvent2 = motionEvent;
                    org.telegram.ui.j4.l(j4Var, (org.telegram.ui.h4) getAdapter(), motionEvent2, j4Var.f, j4Var.d, 0, 0);
                    return super.onInterceptTouchEvent(motionEvent2);
                }
                motionEvent2 = motionEvent;
                return super.onInterceptTouchEvent(motionEvent2);
            default:
                tt q6 = tt.q();
                wv wvVar = (wv) this.Z2;
                return super.onInterceptTouchEvent(motionEvent) || q6.r(motionEvent, wvVar.h, wvVar.N, this.p2);
        }
    }

    @Override // org.telegram.ui.Components.vl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.X2) {
            case 1:
                v1(z10, i10, i11, i12, i13);
                ((org.telegram.ui.n3) this.Z2).I = -1.0f;
                break;
            case 2:
                super.onLayout(z10, i10, i11, i12, i13);
                ((wv) this.Z2).f.a();
                break;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                break;
        }
    }

    @Override // org.telegram.ui.Components.vl0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onMeasure(int i10, int i11) {
        switch (this.X2) {
            case 2:
                View.MeasureSpec.getSize(i10);
                ((wv) this.Z2).y.y1(40);
                super.onMeasure(i10, i11);
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }

    @Override // org.telegram.ui.Components.vl0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.p1 p1Var;
        switch (this.X2) {
            case 1:
                org.telegram.ui.j4 j4Var = (org.telegram.ui.j4) this.Y2;
                if (j4Var.d != null && j4Var.b == null && (((p1Var = j4Var.H) == null || !p1Var.isShowing()) && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3))) {
                    j4Var.b = null;
                    j4Var.d = null;
                    j4Var.f = null;
                }
                break;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void v1(boolean z10, int i10, int i11, int i12, int i13) {
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
    public z(wv wvVar, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        this.Z2 = wvVar;
        this.Y2 = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(org.telegram.ui.n3 n3Var, Context context) {
        super(context, null);
        this.Z2 = n3Var;
        this.Y2 = n3Var.K;
    }
}
