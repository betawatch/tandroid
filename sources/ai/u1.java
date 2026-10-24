package ai;

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
import org.telegram.ui.Components.an;
import org.telegram.ui.Components.bn;
import org.telegram.ui.Components.bw0;
import org.telegram.ui.Components.d80;
import org.telegram.ui.Components.el0;
import org.telegram.ui.Components.gl0;
import org.telegram.ui.Components.i91;
import org.telegram.ui.Components.ij;
import org.telegram.ui.Components.jo0;
import org.telegram.ui.Components.k91;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.nf;
import org.telegram.ui.Components.q00;
import org.telegram.ui.Components.rl;
import org.telegram.ui.Components.rz;
import org.telegram.ui.Components.s00;
import org.telegram.ui.Components.s71;
import org.telegram.ui.Components.so0;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.ty0;
import org.telegram.ui.Components.tz;
import org.telegram.ui.Components.v00;
import org.telegram.ui.Components.xj;
import org.telegram.ui.Components.xn0;
import org.telegram.ui.DataSettingsActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.dq;
import org.telegram.ui.dw;
import org.telegram.ui.h00;
import org.telegram.ui.ht;
import org.telegram.ui.i10;
import org.telegram.ui.jr;
import org.telegram.ui.nx;
import org.telegram.ui.sn;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final class u1 extends mm0 {
    public final /* synthetic */ int Y2;
    public final /* synthetic */ Object Z2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u1(Object obj, Context context, int i10) {
        super(context, null);
        this.Y2 = i10;
        this.Z2 = obj;
    }

    @Override // org.telegram.ui.Components.mm0
    public boolean E0(float f7) {
        switch (this.Y2) {
            case 4:
                ti tiVar = ((ig.h0) this.Z2).b;
                return f7 >= ((float) ((AndroidUtilities.dp(30.0f) + tiVar.e2[0]) + (!tiVar.g0 ? AndroidUtilities.statusBarHeight : 0)));
            case 13:
                ti tiVar2 = ((xj) this.Z2).b;
                return f7 >= ((float) ((AndroidUtilities.dp(30.0f) + tiVar2.e2[0]) + (!tiVar2.g0 ? AndroidUtilities.statusBarHeight : 0)));
            default:
                return super.E0(f7);
        }
    }

    @Override // org.telegram.ui.Components.mm0
    public boolean F0(View view) {
        switch (this.Y2) {
            case 6:
                return view != ((org.telegram.ui.c7) this.Z2).Q;
            case 17:
                s00 s00Var = (s00) this.Z2;
                return s00Var.isEnabled() && !((dw) s00Var.J).b.j2;
            default:
                return super.F0(view);
        }
    }

    @Override // org.telegram.ui.Components.mm0
    public boolean H0(View view, float f7, float f10) {
        switch (this.Y2) {
            case 0:
                ((a2) this.Z2).getClass();
                return true;
            case 11:
                return ((org.telegram.ui.Components.bb) this.Z2).u(view, f7, f10);
            case 17:
                if (((s00) this.Z2).n) {
                    int dp = AndroidUtilities.dp(6.0f);
                    RectF rectF = ((q00) view).f;
                    float f11 = dp;
                    if (rectF.left - f11 < f7 && rectF.right + f11 > f7) {
                        return false;
                    }
                }
                return true;
            case 26:
                if (((k91) this.Z2).n) {
                    int dp2 = AndroidUtilities.dp(6.0f);
                    RectF rectF2 = ((i91) view).c;
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

    @Override // org.telegram.ui.Components.mm0
    public boolean T0() {
        switch (this.Y2) {
            case 25:
                return getAdapter() != null && ((s71) this.Z2).H && getAdapter().h() <= 2;
            default:
                return super.T0();
        }
    }

    @Override // org.telegram.ui.Components.mm0
    public Integer X0(int i10) {
        int i11;
        switch (this.Y2) {
            case 1:
                return 0;
            case 21:
                return 0;
            case 27:
                i11 = ((DataSettingsActivity) this.Z2).resetDownloadRow;
                org.telegram.ui.ActionBar.g6 g6Var = this.n2;
                return i10 == i11 ? Integer.valueOf(org.telegram.ui.ActionBar.k6.o1(0.1f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.p7, g6Var))) : Integer.valueOf(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.i6, g6Var));
            case 28:
                ArrayList arrayList = ((org.telegram.ui.q00) this.Z2).P;
                h00 h00Var = (i10 < 0 || i10 >= arrayList.size()) ? null : (h00) arrayList.get(i10);
                org.telegram.ui.ActionBar.g6 g6Var2 = this.n2;
                return (h00Var == null || !h00Var.l) ? Integer.valueOf(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.i6, g6Var2)) : Integer.valueOf(org.telegram.ui.ActionBar.k6.o1(0.12f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.p7, g6Var2)));
            default:
                return super.X0(i10);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        switch (this.Y2) {
            case 26:
                super.addView(view, i10, layoutParams);
                if (!((k91) this.Z2).V) {
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

    @Override // org.telegram.ui.Components.mm0, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        ci.v0 v0Var;
        switch (this.Y2) {
            case 1:
                ci.m2 m2Var = (ci.m2) this.Z2;
                int i10 = -1;
                if (!m2Var.f0) {
                    int i11 = 0;
                    while (true) {
                        if (i11 < getChildCount()) {
                            View childAt = getChildAt(i11);
                            if (!(childAt instanceof ci.q0) || (v0Var = ((ci.q0) childAt).K) == null) {
                                i11++;
                            } else {
                                i10 = v0Var.a;
                            }
                        }
                    }
                }
                if (i10 > m2Var.F) {
                    m2Var.F = i10;
                    ci.a aVar = m2Var.i0.X1;
                    if (aVar != null) {
                        aVar.setCount(m2Var.getUnreadMessagesCount());
                    }
                }
                super.dispatchDraw(canvas);
                break;
            case 3:
                nf nfVar = (nf) this.Z2;
                u1 u1Var = nfVar.c;
                if (u1Var.getLayoutManager() != null && u1Var.getAdapter() != null && u1Var.getAdapter().h() != 0) {
                    float dp = nfVar.h - AndroidUtilities.dp(8.0f);
                    nfVar.e = dp - AndroidUtilities.dp(16.0f);
                    dh.d dVar = nfVar.r;
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
                ((org.telegram.ui.k8) this.Z2).F = false;
                break;
            case 22:
                nx nxVar = (nx) this.Z2;
                s4.b0 b0Var = nxVar.c0;
                s4.k kVar = nxVar.a0;
                so0 so0Var = nxVar.b0;
                if (so0Var != null && kVar != null && b0Var != null && so0Var.m0) {
                    canvas.save();
                    invalidate();
                    int h = so0Var.h() - 1;
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
                if (so0Var != null && kVar != null && b0Var != null && so0Var.m0) {
                    canvas.restore();
                }
                if (so0Var != null && so0Var.o0 != null) {
                    canvas.save();
                    canvas.translate(so0Var.o0.getLeft(), so0Var.o0.getTranslationY() + so0Var.o0.getTop());
                    so0Var.o0.draw(canvas);
                    canvas.restore();
                    break;
                }
                break;
            case 29:
                if (getAdapter() == ((i10) this.Z2).U) {
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

    @Override // org.telegram.ui.Components.mm0, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i10 = this.Y2;
        Object obj = this.Z2;
        switch (i10) {
            case 1:
                if (!((ci.m2) obj).f0) {
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
                        ofFloat.addUpdateListener(new d80(gl0Var, 7));
                        gl0Var.y0.setDuration(150L);
                        gl0Var.y0.start();
                    }
                }
                break;
            case 21:
                LinearLayout linearLayout = ((jo0) obj).f;
                if (linearLayout == null || linearLayout.getAlpha() <= 0.5f) {
                    break;
                }
                break;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        switch (this.Y2) {
            case 19:
                ah.i1 i1Var = ((gl0) this.Z2).l0;
                if (i1Var == null || !(view instanceof el0) || !((el0) view).e.equals(i1Var)) {
                    break;
                }
                break;
            case 24:
                ty0 ty0Var = (ty0) this.Z2;
                com.google.firebase.messaging.l lVar = ty0Var.l0;
                if (!(view instanceof org.telegram.ui.Cells.e8) || !ty0Var.R) {
                    break;
                } else {
                    int b10 = ty0Var.c.T(view).b();
                    canvas.save();
                    ArrayList arrayList = (ArrayList) lVar.d;
                    canvas.rotate(arrayList.isEmpty() ? 0.0f : ((Float) arrayList.get(b10 - ((b10 / 6) * 6))).floatValue(), (view.getMeasuredWidth() / 2.0f) + view.getLeft(), (view.getMeasuredHeight() / 2.0f) + view.getTop());
                    ArrayList arrayList2 = (ArrayList) lVar.e;
                    float floatValue = arrayList2.isEmpty() ? 0.0f : ((Float) arrayList2.get(b10 - ((b10 / 6) * 6))).floatValue();
                    ArrayList arrayList3 = (ArrayList) lVar.f;
                    canvas.translate(floatValue, arrayList3.isEmpty() ? 0.0f : ((Float) arrayList3.get(b10 - ((b10 / 6) * 6))).floatValue());
                    boolean drawChild = super.drawChild(canvas, view, j10);
                    canvas.restore();
                    invalidate();
                    break;
                }
                break;
            case 29:
                if (getAdapter() != ((i10) this.Z2).U || T(view).f != 1) {
                    break;
                }
                break;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override // android.view.View
    public void invalidate() {
        switch (this.Y2) {
            case 1:
                super.invalidate();
                ((ci.m2) this.Z2).invalidate();
                break;
            case 10:
                super.invalidate();
                View view = ((jr) this.Z2).fragmentView;
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
    public void k0(int i10, int i11) {
        switch (this.Y2) {
            case 4:
                break;
            case 15:
                bn bnVar = (bn) this.Z2;
                bnVar.invalidate();
                bnVar.b.f2(bnVar, i11);
                an anVar = bnVar.v;
                boolean z10 = true;
                int i12 = 0;
                boolean z11 = anVar.x == null;
                if (z11) {
                    anVar.x = anVar.d();
                } else {
                    boolean[] d = anVar.d();
                    if (d.length == anVar.x.length) {
                        while (true) {
                            if (i12 >= d.length) {
                                z10 = z11;
                            } else if (d[i12] == anVar.x[i12]) {
                                i12++;
                            }
                        }
                    }
                    z11 = z10;
                }
                if (z11) {
                    anVar.invalidate();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        switch (this.Y2) {
            case 8:
                super.onAttachedToWindow();
                hg.n1 n1Var = ((sn) this.Z2).Y3;
                if (n1Var != null) {
                    NotificationCenter.getInstance(n1Var.r).addObserver(n1Var, NotificationCenter.storiesListUpdated);
                    break;
                }
                break;
            default:
                super.onAttachedToWindow();
                break;
        }
    }

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        switch (this.Y2) {
            case 8:
                super.onDetachedFromWindow();
                hg.n1 n1Var = ((sn) this.Z2).Y3;
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

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.Y2) {
            case 2:
                ht o10 = ht.o();
                ei.v1 v1Var = (ei.v1) this.Z2;
                boolean p5 = o10.p(motionEvent, v1Var.b, v1Var.f, this.n2);
                if (super.onInterceptTouchEvent(motionEvent) || p5) {
                }
                break;
            case 9:
                if (!((dq) this.Z2).I) {
                    break;
                }
                break;
            case 12:
                if (motionEvent.getAction() != 0 || motionEvent.getY() >= ((ij) this.Z2).b.e2[0] - AndroidUtilities.dp(80.0f)) {
                    break;
                }
                break;
            case 15:
                if (((bn) this.Z2).J == null) {
                    break;
                }
                break;
            case 16:
                if (getParent() != null && getParent().getParent() != null) {
                    getParent().getParent().requestDisallowInterceptTouchEvent(canScrollHorizontally(-1) || canScrollHorizontally(1));
                    ((tz) this.Z2).h.requestDisallowInterceptTouchEvent(true);
                }
                break;
            case 23:
                boolean p9 = ht.o().p(motionEvent, ((bw0) this.Z2).b, null, this.n2);
                if (super.onInterceptTouchEvent(motionEvent) || p9) {
                }
                break;
            case 24:
                ty0 ty0Var = (ty0) this.Z2;
                if (ty0Var.R) {
                    break;
                } else {
                    boolean p10 = ht.o().p(motionEvent, ty0Var.c, ty0Var.m0, this.n2);
                    if (super.onInterceptTouchEvent(motionEvent) || p10) {
                    }
                }
                break;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.Y2) {
            case 0:
                a2 a2Var = (a2) this.Z2;
                a2Var.t();
                super.onLayout(z10, i10, i11, i12, i13);
                a2Var.R(2);
                break;
            case 11:
                ((org.telegram.ui.Components.bb) this.Z2).t();
                super.onLayout(z10, i10, i11, i12, i13);
                break;
            case 12:
                super.onLayout(z10, i10, i11, i12, i13);
                PhotoViewer.u1().z0();
                break;
            case 14:
                super.onLayout(z10, i10, i11, i12, i13);
                ((rl) this.Z2).i0();
                break;
            case 20:
                super.onLayout(z10, i10, i11, i12, i13);
                ((xn0) this.Z2).a();
                break;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                break;
        }
    }

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onMeasure(int i10, int i11) {
        switch (this.Y2) {
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

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.Y2) {
            case 9:
                if (!((dq) this.Z2).I) {
                    break;
                }
                break;
            case 12:
                if (motionEvent.getAction() != 0 || motionEvent.getY() >= ((ij) this.Z2).b.e2[0] - AndroidUtilities.dp(80.0f)) {
                    break;
                }
                break;
            case 15:
                if (((bn) this.Z2).J == null) {
                    break;
                }
                break;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i10, Rect rect) {
        switch (this.Y2) {
            case 28:
                return false;
            default:
                return super.requestFocus(i10, rect);
        }
    }

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public void requestLayout() {
        switch (this.Y2) {
            case 5:
                if (!((org.telegram.ui.l1) this.Z2).r) {
                    super.requestLayout();
                    break;
                }
                break;
            case 18:
                if (!((v00) this.Z2).r) {
                    super.requestLayout();
                    break;
                }
                break;
            case 23:
                if (!((bw0) this.Z2).h) {
                    super.requestLayout();
                    break;
                }
                break;
            case 24:
                if (!((ty0) this.Z2).g0) {
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
        switch (this.Y2) {
            case 17:
                super.setAlpha(f7);
                ((s00) this.Z2).invalidate();
                break;
            case 26:
                super.setAlpha(f7);
                ((k91) this.Z2).invalidate();
                break;
            default:
                super.setAlpha(f7);
                break;
        }
    }

    @Override // org.telegram.ui.Components.mm0, android.view.View
    public void setTranslationY(float f7) {
        switch (this.Y2) {
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
    public /* synthetic */ u1(Object obj, Context context, org.telegram.ui.ActionBar.g6 g6Var, int i10) {
        super(context, g6Var);
        this.Y2 = i10;
        this.Z2 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(tz tzVar, Context context, rz rzVar) {
        super(context, null);
        this.Y2 = 16;
        this.Z2 = tzVar;
        setNestedScrollingEnabled(true);
        setSelectorRadius(AndroidUtilities.dp(4.0f));
        org.telegram.ui.ActionBar.r6.m(this, 20, org.telegram.ui.ActionBar.k6.i6, this.n2);
        setTag(9);
        setItemAnimator(null);
        setLayoutAnimation(null);
        hg.a0 a0Var = new hg.a0(8);
        a0Var.j1(0);
        setLayoutManager(a0Var);
        setAdapter(rzVar);
    }

    private final void C1(int i10, int i11) {
    }
}
