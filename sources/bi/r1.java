package bi;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.bn;
import org.telegram.ui.Components.c81;
import org.telegram.ui.Components.cn;
import org.telegram.ui.Components.do0;
import org.telegram.ui.Components.dz0;
import org.telegram.ui.Components.el0;
import org.telegram.ui.Components.f80;
import org.telegram.ui.Components.fw0;
import org.telegram.ui.Components.gl0;
import org.telegram.ui.Components.ij;
import org.telegram.ui.Components.nf;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.po0;
import org.telegram.ui.Components.q00;
import org.telegram.ui.Components.qz;
import org.telegram.ui.Components.s00;
import org.telegram.ui.Components.s91;
import org.telegram.ui.Components.sl;
import org.telegram.ui.Components.sz;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.u91;
import org.telegram.ui.Components.v00;
import org.telegram.ui.Components.xj;
import org.telegram.ui.Components.xo0;
import org.telegram.ui.DataSettingsActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.h00;
import org.telegram.ui.ht;
import org.telegram.ui.iq;
import org.telegram.ui.j10;
import org.telegram.ui.mr;
import org.telegram.ui.mx;
import org.telegram.ui.ux;
import org.telegram.ui.wn;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class r1 extends nm0 {
    public final /* synthetic */ int f3;
    public final /* synthetic */ Object g3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r1(Object obj, Context context, int i10) {
        super(context, null);
        this.f3 = i10;
        this.g3 = obj;
    }

    @Override // org.telegram.ui.Components.nm0
    public boolean E0(float f7) {
        switch (this.f3) {
            case 4:
                ti tiVar = ((jg.i0) this.g3).b;
                return f7 >= ((float) ((AndroidUtilities.dp(30.0f) + tiVar.e2[0]) + (!tiVar.g0 ? AndroidUtilities.statusBarHeight : 0)));
            case 13:
                ti tiVar2 = ((xj) this.g3).b;
                return f7 >= ((float) ((AndroidUtilities.dp(30.0f) + tiVar2.e2[0]) + (!tiVar2.g0 ? AndroidUtilities.statusBarHeight : 0)));
            default:
                return super.E0(f7);
        }
    }

    @Override // org.telegram.ui.Components.nm0
    public boolean F0(View view) {
        switch (this.f3) {
            case 6:
                return view != ((org.telegram.ui.c7) this.g3).W;
            case 17:
                s00 s00Var = (s00) this.g3;
                return s00Var.isEnabled() && !((ux) s00Var.J).b.j2;
            default:
                return super.F0(view);
        }
    }

    @Override // org.telegram.ui.Components.nm0
    public boolean H0(View view, float f7, float f10) {
        switch (this.f3) {
            case 0:
                ((x1) this.g3).getClass();
                return true;
            case 11:
                return ((org.telegram.ui.Components.bb) this.g3).t(view, f7, f10);
            case 17:
                if (((s00) this.g3).n) {
                    int dp = AndroidUtilities.dp(6.0f);
                    RectF rectF = ((q00) view).f;
                    float f11 = dp;
                    if (rectF.left - f11 < f7 && rectF.right + f11 > f7) {
                        return false;
                    }
                }
                return true;
            case 26:
                if (((u91) this.g3).n) {
                    int dp2 = AndroidUtilities.dp(6.0f);
                    RectF rectF2 = ((s91) view).c;
                    float f12 = dp2;
                    if (rectF2.left - f12 < f7 && rectF2.right + f12 > f7) {
                        return false;
                    }
                }
                return true;
            default:
                return super.H0(view, f7, f10);
        }
    }

    @Override // org.telegram.ui.Components.nm0
    public boolean S0() {
        switch (this.f3) {
            case 25:
                return getAdapter() != null && ((c81) this.g3).H && getAdapter().h() <= 2;
            default:
                return super.S0();
        }
    }

    @Override // org.telegram.ui.Components.nm0
    public Integer W0(int i10) {
        int i11;
        switch (this.f3) {
            case 1:
                return 0;
            case 21:
                return 0;
            case 27:
                i11 = ((DataSettingsActivity) this.g3).resetDownloadRow;
                org.telegram.ui.ActionBar.u6 u6Var = this.n2;
                return i10 == i11 ? Integer.valueOf(org.telegram.ui.ActionBar.y6.o1(0.1f, org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.p7, u6Var))) : Integer.valueOf(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.i6, u6Var));
            case 28:
                ArrayList arrayList = ((org.telegram.ui.q00) this.g3).P;
                h00 h00Var = (i10 < 0 || i10 >= arrayList.size()) ? null : (h00) arrayList.get(i10);
                org.telegram.ui.ActionBar.u6 u6Var2 = this.n2;
                return (h00Var == null || !h00Var.l) ? Integer.valueOf(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.i6, u6Var2)) : Integer.valueOf(org.telegram.ui.ActionBar.y6.o1(0.12f, org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.p7, u6Var2)));
            default:
                return super.W0(i10);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        switch (this.f3) {
            case 26:
                super.addView(view, i10, layoutParams);
                if (!((u91) this.g3).V) {
                    view.setScaleX(1.0f);
                    view.setScaleY(1.0f);
                    view.setAlpha(1.0f);
                    break;
                } else {
                    view.setScaleX(0.3f);
                    view.setScaleY(0.3f);
                    view.setAlpha(0.0f);
                    break;
                }
            default:
                super.addView(view, i10, layoutParams);
                break;
        }
    }

    @Override // org.telegram.ui.Components.nm0, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        di.v0 v0Var;
        switch (this.f3) {
            case 1:
                di.m2 m2Var = (di.m2) this.g3;
                int i10 = -1;
                if (!m2Var.f0) {
                    int i11 = 0;
                    while (true) {
                        if (i11 < getChildCount()) {
                            View childAt = getChildAt(i11);
                            if (!(childAt instanceof di.q0) || (v0Var = ((di.q0) childAt).K) == null) {
                                i11++;
                            } else {
                                i10 = v0Var.a;
                            }
                        }
                    }
                }
                if (i10 > m2Var.F) {
                    m2Var.F = i10;
                    di.a aVar = m2Var.i0.M1;
                    if (aVar != null) {
                        aVar.setCount(m2Var.getUnreadMessagesCount());
                    }
                }
                super.dispatchDraw(canvas);
                break;
            case 3:
                nf nfVar = (nf) this.g3;
                r1 r1Var = nfVar.c;
                if (r1Var.getLayoutManager() != null && r1Var.getAdapter() != null && r1Var.getAdapter().h() != 0) {
                    float dp = nfVar.h - AndroidUtilities.dp(8.0f);
                    nfVar.e = dp - AndroidUtilities.dp(16.0f);
                    eh.d dVar = nfVar.r;
                    if (dVar != null) {
                        dVar.draw(canvas);
                    }
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set((getMeasuredWidth() / 2.0f) - AndroidUtilities.dp(12.0f), dp - AndroidUtilities.dp(4.0f), (getMeasuredWidth() / 2.0f) + AndroidUtilities.dp(12.0f), dp);
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), nfVar.d);
                    super.dispatchDraw(canvas);
                    break;
                } else {
                    super.dispatchDraw(canvas);
                    break;
                }
            case 7:
                super.dispatchDraw(canvas);
                ((org.telegram.ui.n8) this.g3).F = false;
                break;
            case 22:
                mx mxVar = (mx) this.g3;
                s4.c0 c0Var = mxVar.e0;
                s4.l lVar = mxVar.c0;
                xo0 xo0Var = mxVar.d0;
                if (xo0Var != null && lVar != null && c0Var != null && xo0Var.m0) {
                    canvas.save();
                    invalidate();
                    int h = xo0Var.h() - 1;
                    int i12 = 0;
                    while (true) {
                        if (i12 < getChildCount()) {
                            View childAt2 = getChildAt(i12);
                            if (RecyclerView.R(childAt2) == h) {
                                canvas.clipRect(0.0f, 0.0f, getWidth(), childAt2.getTranslationY() + childAt2.getBottom());
                            } else {
                                i12++;
                            }
                        }
                    }
                }
                super.dispatchDraw(canvas);
                if (xo0Var != null && lVar != null && c0Var != null && xo0Var.m0) {
                    canvas.restore();
                }
                if (xo0Var != null && xo0Var.o0 != null) {
                    canvas.save();
                    canvas.translate(xo0Var.o0.getLeft(), xo0Var.o0.getTranslationY() + xo0Var.o0.getTop());
                    xo0Var.o0.draw(canvas);
                    canvas.restore();
                    break;
                }
                break;
            case 29:
                if (getAdapter() == ((j10) this.g3).U) {
                    for (int i13 = 0; i13 < getChildCount(); i13++) {
                        if (T(getChildAt(i13)).f == 1) {
                            canvas.save();
                            canvas.translate(getChildAt(i13).getX(), (getChildAt(i13).getY() - getChildAt(i13).getMeasuredHeight()) + AndroidUtilities.dp(2.0f));
                            getChildAt(i13).draw(canvas);
                            canvas.restore();
                            invalidate();
                        }
                    }
                }
                super.dispatchDraw(canvas);
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // org.telegram.ui.Components.nm0, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i10 = this.f3;
        Object obj = this.g3;
        switch (i10) {
            case 1:
                if (!((di.m2) obj).f0) {
                    break;
                }
                break;
            case 19:
                gl0 gl0Var = (gl0) obj;
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    if (motionEvent.getAction() == 1 && gl0Var.getPullingLeftProgress() > 0.95f) {
                        gl0.a(gl0Var);
                    } else if (gl0Var.B0 != 0.0f) {
                        ValueAnimator valueAnimator = gl0Var.y0;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(gl0Var.B0, 0.0f);
                        gl0Var.y0 = ofFloat;
                        ofFloat.addUpdateListener(new f80(gl0Var, 7));
                        gl0Var.y0.setDuration(150L);
                        gl0Var.y0.start();
                    }
                }
                break;
            case 21:
                LinearLayout linearLayout = ((po0) obj).f;
                if (linearLayout == null || linearLayout.getAlpha() <= 0.5f) {
                    break;
                }
                break;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.nm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        switch (this.f3) {
            case 19:
                bh.x0 x0Var = ((gl0) this.g3).l0;
                if (x0Var == null || !(view instanceof el0) || !((el0) view).e.equals(x0Var)) {
                    break;
                }
                break;
            case 24:
                dz0 dz0Var = (dz0) this.g3;
                aa.m0 m0Var = dz0Var.l0;
                if (!(view instanceof org.telegram.ui.Cells.i8) || !dz0Var.R) {
                    break;
                } else {
                    int b10 = dz0Var.c.T(view).b();
                    canvas.save();
                    ArrayList arrayList = (ArrayList) m0Var.d;
                    canvas.rotate(arrayList.isEmpty() ? 0.0f : ((Float) arrayList.get(b10 - ((b10 / 6) * 6))).floatValue(), (view.getMeasuredWidth() / 2.0f) + view.getLeft(), (view.getMeasuredHeight() / 2.0f) + view.getTop());
                    ArrayList arrayList2 = (ArrayList) m0Var.e;
                    float floatValue = arrayList2.isEmpty() ? 0.0f : ((Float) arrayList2.get(b10 - ((b10 / 6) * 6))).floatValue();
                    ArrayList arrayList3 = (ArrayList) m0Var.f;
                    canvas.translate(floatValue, arrayList3.isEmpty() ? 0.0f : ((Float) arrayList3.get(b10 - ((b10 / 6) * 6))).floatValue());
                    boolean drawChild = super.drawChild(canvas, view, j10);
                    canvas.restore();
                    invalidate();
                    break;
                }
                break;
            case 29:
                if (getAdapter() != ((j10) this.g3).U || T(view).f != 1) {
                    break;
                }
                break;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override // android.view.View
    public void invalidate() {
        switch (this.f3) {
            case 1:
                super.invalidate();
                ((di.m2) this.g3).invalidate();
                break;
            case 10:
                super.invalidate();
                View view = ((mr) this.g3).fragmentView;
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
            default:
                super.invalidate();
                break;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void l0(int i10) {
        switch (this.f3) {
            case 4:
                break;
            case 15:
                cn cnVar = (cn) this.g3;
                cnVar.invalidate();
                cnVar.b.f2(cnVar, i10);
                bn bnVar = cnVar.v;
                boolean z10 = true;
                int i11 = 0;
                boolean z11 = bnVar.x == null;
                if (z11) {
                    bnVar.x = bnVar.d();
                } else {
                    boolean[] d = bnVar.d();
                    if (d.length == bnVar.x.length) {
                        while (true) {
                            if (i11 >= d.length) {
                                z10 = z11;
                            } else if (d[i11] == bnVar.x[i11]) {
                                i11++;
                            }
                        }
                    }
                    z11 = z10;
                }
                if (z11) {
                    bnVar.invalidate();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.nm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        switch (this.f3) {
            case 8:
                super.onAttachedToWindow();
                ig.n1 n1Var = ((wn) this.g3).Y3;
                if (n1Var != null) {
                    NotificationCenter.getInstance(n1Var.r).addWeakObserver(n1Var, NotificationCenter.storiesListUpdated);
                    break;
                }
                break;
            default:
                super.onAttachedToWindow();
                break;
        }
    }

    @Override // org.telegram.ui.Components.nm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        switch (this.f3) {
            case 8:
                super.onDetachedFromWindow();
                ig.n1 n1Var = ((wn) this.g3).Y3;
                if (n1Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(n1Var.E);
                    NotificationCenter.getInstance(n1Var.r).removeObserver(n1Var, NotificationCenter.storiesListUpdated);
                    break;
                }
                break;
            default:
                super.onDetachedFromWindow();
                break;
        }
    }

    @Override // org.telegram.ui.Components.nm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.f3) {
            case 2:
                ht o10 = ht.o();
                fi.u1 u1Var = (fi.u1) this.g3;
                boolean p10 = o10.p(motionEvent, u1Var.b, u1Var.f, this.n2);
                if (super.onInterceptTouchEvent(motionEvent) || p10) {
                }
                break;
            case 9:
                if (!((iq) this.g3).H) {
                    break;
                }
                break;
            case 12:
                if (motionEvent.getAction() != 0 || motionEvent.getY() >= ((ij) this.g3).b.e2[0] - AndroidUtilities.dp(80.0f)) {
                    break;
                }
                break;
            case 15:
                if (((cn) this.g3).J == null) {
                    break;
                }
                break;
            case 16:
                if (getParent() != null && getParent().getParent() != null) {
                    getParent().getParent().requestDisallowInterceptTouchEvent(canScrollHorizontally(-1) || canScrollHorizontally(1));
                    ((sz) this.g3).h.requestDisallowInterceptTouchEvent(true);
                }
                break;
            case 23:
                boolean p11 = ht.o().p(motionEvent, ((fw0) this.g3).b, null, this.n2);
                if (super.onInterceptTouchEvent(motionEvent) || p11) {
                }
                break;
            case 24:
                dz0 dz0Var = (dz0) this.g3;
                if (dz0Var.R) {
                    break;
                } else {
                    boolean p12 = ht.o().p(motionEvent, dz0Var.c, dz0Var.m0, this.n2);
                    if (super.onInterceptTouchEvent(motionEvent) || p12) {
                    }
                }
                break;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.nm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f3) {
            case 0:
                ((x1) this.g3).s();
                super.onLayout(z10, i10, i11, i12, i13);
                break;
            case 11:
                ((org.telegram.ui.Components.bb) this.g3).s();
                super.onLayout(z10, i10, i11, i12, i13);
                break;
            case 12:
                super.onLayout(z10, i10, i11, i12, i13);
                PhotoViewer.v1().z0();
                break;
            case 14:
                super.onLayout(z10, i10, i11, i12, i13);
                ((sl) this.g3).h0();
                break;
            case 20:
                super.onLayout(z10, i10, i11, i12, i13);
                ((do0) this.g3).a();
                break;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                break;
        }
    }

    @Override // org.telegram.ui.Components.nm0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onMeasure(int i10, int i11) {
        switch (this.f3) {
            case 1:
                int size = View.MeasureSpec.getSize(i10);
                View.MeasureSpec.getSize(i11);
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size, View.MeasureSpec.getMode(i11)));
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }

    @Override // org.telegram.ui.Components.nm0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f3) {
            case 9:
                if (!((iq) this.g3).H) {
                    break;
                }
                break;
            case 12:
                if (motionEvent.getAction() != 0 || motionEvent.getY() >= ((ij) this.g3).b.e2[0] - AndroidUtilities.dp(80.0f)) {
                    break;
                }
                break;
            case 15:
                if (((cn) this.g3).J == null) {
                    break;
                }
                break;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i10, Rect rect) {
        switch (this.f3) {
            case 28:
                return false;
            default:
                return super.requestFocus(i10, rect);
        }
    }

    @Override // org.telegram.ui.Components.nm0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public void requestLayout() {
        switch (this.f3) {
            case 5:
                if (!((org.telegram.ui.j1) this.g3).r) {
                    super.requestLayout();
                    break;
                }
                break;
            case 18:
                if (!((v00) this.g3).r) {
                    super.requestLayout();
                    break;
                }
                break;
            case 23:
                if (!((fw0) this.g3).h) {
                    super.requestLayout();
                    break;
                }
                break;
            case 24:
                if (!((dz0) this.g3).g0) {
                    super.requestLayout();
                    break;
                }
                break;
            default:
                super.requestLayout();
                break;
        }
    }

    @Override // android.view.View
    public void setAlpha(float f7) {
        switch (this.f3) {
            case 17:
                super.setAlpha(f7);
                ((s00) this.g3).invalidate();
                break;
            case 26:
                super.setAlpha(f7);
                ((u91) this.g3).invalidate();
                break;
            default:
                super.setAlpha(f7);
                break;
        }
    }

    @Override // org.telegram.ui.Components.nm0, android.view.View
    public void setTranslationY(float f7) {
        switch (this.f3) {
            case 25:
                super.setTranslationY(f7);
                getLocationInWindow(new int[2]);
                break;
            default:
                super.setTranslationY(f7);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r1(Object obj, Context context, org.telegram.ui.ActionBar.u6 u6Var, int i10) {
        super(context, u6Var);
        this.f3 = i10;
        this.g3 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(sz szVar, Context context, qz qzVar) {
        super(context, null);
        this.f3 = 16;
        this.g3 = szVar;
        setNestedScrollingEnabled(true);
        setSelectorRadius(AndroidUtilities.dp(4.0f));
        org.telegram.ui.ActionBar.f7.m(this, 20, org.telegram.ui.ActionBar.y6.i6, this.n2);
        setTag(9);
        setItemAnimator(null);
        setLayoutAnimation(null);
        ig.a0 a0Var = new ig.a0(8);
        a0Var.k1(0);
        setLayoutManager(a0Var);
        setAdapter(qzVar);
    }

    private final void C1(int i10) {
    }
}
