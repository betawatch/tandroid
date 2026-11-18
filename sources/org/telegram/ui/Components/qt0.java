package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.SystemClock;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public class qt0 extends FrameLayout implements r0.l {
    public static final /* synthetic */ int m0 = 0;
    public final dk0 E;
    public RecyclerView F;
    public RecyclerView G;
    public RecyclerView H;
    public g71 I;
    public View J;
    public View K;
    public View L;
    public View M;
    public nt0 N;
    public mt0 O;
    public ot0 P;
    public View Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public float V;
    public float W;
    public boolean a;
    public float a0;
    public int b;
    public float b0;
    public int c;
    public float c0;
    public long d;
    public boolean d0;
    public long e;
    public boolean e0;
    public long f;
    public boolean f0;
    public boolean g0;
    public long h;
    public boolean h0;
    public boolean i0;
    public final hn j0;
    public final oa k0;
    public final fl l0;
    public int n;
    public int r;
    public final RectF s;
    public final bi.a3 w;
    public final e2.r0 x;
    public final int[] y;

    public qt0(Context context) {
        super(context);
        this.s = new RectF();
        this.x = new e2.r0();
        this.y = new int[2];
        this.E = new dk0();
        this.j0 = new hn(this, 6);
        this.k0 = new oa(this, 19);
        this.l0 = new fl(3, this);
        setClipChildren(false);
        setClipToPadding(false);
        bi.a3 a3Var = new bi.a3(this, context);
        this.w = a3Var;
        addView(a3Var, new FrameLayout.LayoutParams(-1, -1));
    }

    public static String h(View view) {
        if (view == null) {
            return "null";
        }
        String str = view.getClass().getSimpleName() + "@" + Integer.toHexString(System.identityHashCode(view)) + "(x=" + view.getTranslationX() + ",y=" + view.getTranslationY() + ",w=" + view.getWidth() + ",visibility=" + view.getVisibility() + ",attached=" + view.isAttachedToWindow() + ",top=" + view.getTop() + ",height=" + view.getHeight() + ",layoutRequested=" + view.isLayoutRequested();
        if (view instanceof RecyclerView) {
            RecyclerView recyclerView = (RecyclerView) view;
            StringBuilder n10 = p5.c.n(str, ",scrollState=");
            n10.append(recyclerView.getScrollState());
            n10.append(",up=");
            n10.append(recyclerView.canScrollVertically(-1));
            n10.append(",down=");
            n10.append(recyclerView.canScrollVertically(1));
            n10.append(",layout=");
            n10.append(recyclerView.c0());
            n10.append(",pendingUpdates=");
            n10.append(recyclerView.Z());
            n10.append(",animating=");
            n10.append(recyclerView.b0());
            n10.append(",paddingTop=");
            n10.append(recyclerView.getPaddingTop());
            n10.append(",count=");
            n10.append(recyclerView.getAdapter() == null ? 0 : recyclerView.getAdapter().b());
            str = n10.toString();
        }
        return p5.c.v(str, ")");
    }

    private void setBleed(RecyclerView recyclerView) {
        ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            int i7 = marginLayoutParams.topMargin;
            int i10 = this.T;
            if (i7 == (-i10) && marginLayoutParams.bottomMargin == (-this.U)) {
                return;
            }
            marginLayoutParams.topMargin = -i10;
            marginLayoutParams.bottomMargin = -this.U;
            recyclerView.setLayoutParams(marginLayoutParams);
        }
    }

    private void setTabsPinned(boolean z10) {
        if (this.f0 == z10) {
            return;
        }
        this.f0 = z10;
        f(z10 ? "TABS_PINNED" : "TABS_UNPINNED", this.F, 0, 0, true);
        this.N.G(z10);
    }

    public static void v(RecyclerView recyclerView, int i7, int i10) {
        int b10;
        if (recyclerView.getPaddingTop() == i7 && recyclerView.getPaddingBottom() == i10) {
            return;
        }
        v4.p0 layoutManager = recyclerView.getLayoutManager();
        int i11 = 0;
        View q10 = (layoutManager == null || layoutManager.r() == 0) ? null : layoutManager.q(0);
        if (q10 == null) {
            b10 = -1;
        } else {
            layoutManager.getClass();
            b10 = ((v4.q0) q10.getLayoutParams()).b();
        }
        if (q10 != null) {
            layoutManager.getClass();
            i11 = (v4.p0.z(q10) - recyclerView.getPaddingTop()) - ((ViewGroup.MarginLayoutParams) ((v4.q0) q10.getLayoutParams())).topMargin;
        }
        recyclerView.setPadding(recyclerView.getPaddingLeft(), i7, recyclerView.getPaddingRight(), i10);
        if (b10 == -1 || !(layoutManager instanceof v4.c0)) {
            return;
        }
        ((v4.c0) layoutManager).h1(b10, i11);
    }

    public final void A() {
        f("STOP_SCROLLING", null, 0, 0, true);
        RecyclerView recyclerView = this.F;
        if (recyclerView != null) {
            recyclerView.C0();
        }
        g71 g71Var = this.I;
        if (g71Var == null || this.P == null) {
            return;
        }
        for (View view : g71Var.getViewPages()) {
            if (view != null) {
                this.P.n(view).C0();
            }
        }
    }

    public final void B() {
        dk0 dk0Var = this.E;
        if (this.d0 || this.N == null) {
            return;
        }
        boolean z10 = true;
        this.d0 = true;
        try {
            float f10 = this.b0;
            C();
            RecyclerView recyclerView = this.F;
            if (recyclerView != null && !this.i0) {
                setBleed(recyclerView);
                RecyclerView recyclerView2 = this.F;
                int i7 = this.T;
                this.N.getClass();
                v(recyclerView2, i7, this.U);
            }
            g71 g71Var = this.I;
            if (g71Var != null && this.P != null && this.K != null) {
                for (View view : g71Var.getViewPages()) {
                    if (view != null && view.getParent() == this.I) {
                        b(this.P.n(view));
                    }
                }
                q();
                float n10 = n();
                boolean isInfinite = Float.isInfinite(n10);
                bi.a3 a3Var = this.w;
                float f11 = 0.0f;
                if (isInfinite) {
                    this.b0 = Float.POSITIVE_INFINITY;
                    this.J.setVisibility(4);
                    this.K.setVisibility(4);
                    RecyclerView recyclerView3 = this.F;
                    if (recyclerView3 != null) {
                        recyclerView3.setTranslationY(0.0f);
                    }
                    setTabsPinned(false);
                    if (f10 != this.b0) {
                        a3Var.invalidate();
                    }
                    this.d0 = false;
                    return;
                }
                float f12 = this.V;
                if (n10 > f12 + 0.5f) {
                    f12 = n10;
                }
                this.a0 = f12;
                this.J.setVisibility(0);
                this.K.setVisibility(0);
                if (this.e0) {
                    this.b0 = dk0Var.b();
                    this.c0 = Math.max(dk0Var.d, dk0Var.b());
                    View view2 = this.L;
                    float max = Math.max(0.0f, dk0Var.a - dk0Var.d);
                    if (!dk0Var.f) {
                        f11 = dk0Var.b() - dk0Var.b;
                    }
                    w(view2, max + f11);
                    w(this.M, Math.max(dk0Var.d, dk0Var.b()) - dk0Var.d);
                } else {
                    RecyclerView recyclerView4 = this.G;
                    float max2 = this.a0 - Math.max(0.0f, Math.min(recyclerView4 == null ? 0.0f : this.P.j(recyclerView4), Math.max(0.0f, this.V - this.W)));
                    this.b0 = max2;
                    this.c0 = Math.max(this.V, max2);
                    w(this.I.getCurrentView(), Math.max(0.0f, this.a0 - this.V));
                }
                this.F.setTranslationY(this.b0 - n10);
                this.K.setTranslationY(this.c0 - r0.getTop());
                if (this.c0 > this.V + 0.5f) {
                    z10 = false;
                }
                setTabsPinned(z10);
                this.N.getClass();
                if (f10 != this.b0) {
                    a3Var.invalidate();
                }
                this.d0 = false;
            }
        } finally {
            this.d0 = false;
        }
    }

    public final void C() {
        nt0 nt0Var = this.N;
        if (nt0Var == null) {
            return;
        }
        float U0 = nt0Var.U0();
        this.N.getClass();
        if (Float.isNaN(U0) || Float.isInfinite(U0) || Float.isNaN(0.0f) || Float.isInfinite(0.0f) || U0 < 0.0f) {
            throw new IllegalArgumentException("Require finite 0 <= commonHiddenTop <= tabsPinnedTop");
        }
        if (this.g0 && (U0 != this.V || 0.0f != this.W)) {
            float n10 = n();
            if (!Float.isInfinite(n10)) {
                float f10 = this.V;
                boolean z10 = n10 <= 0.5f + f10 || n10 < U0;
                if (z10 && U0 != f10) {
                    this.h0 = true;
                }
                if (this.e0) {
                    dk0 dk0Var = this.E;
                    float f11 = dk0Var.e;
                    if (z10) {
                        n10 = U0;
                    }
                    ot0 ot0Var = this.P;
                    dk0Var.a(n10, ot0Var.j(ot0Var.n(this.L)), U0, 0.0f);
                    dk0Var.e = Math.max(0.0f, Math.min(1.0f, f11));
                    this.w.invalidate();
                }
            }
        }
        this.V = U0;
        this.W = 0.0f;
        this.g0 = true;
    }

    public final void a() {
        mt0 mt0Var;
        f("ALIGN_BOUNDARY", this.F, 0, 0, true);
        if (this.F == null || (mt0Var = this.O) == null || this.N == null) {
            return;
        }
        int b10 = mt0Var.b();
        v4.p0 layoutManager = this.F.getLayoutManager();
        if (b10 == -1 || !(layoutManager instanceof v4.c0)) {
            return;
        }
        C();
        ((v4.c0) layoutManager).h1(b10, (Math.round(this.V) - this.F.getTop()) - this.F.getPaddingTop());
        this.h0 = true;
        requestLayout();
    }

    public final void b(RecyclerView recyclerView) {
        if (this.N == null || recyclerView == null) {
            return;
        }
        C();
        View view = this.K;
        int height = view == null ? 0 : view.getHeight() > 0 ? this.K.getHeight() : this.K.getLayoutParams().height;
        setBleed(recyclerView);
        v(recyclerView, Math.max(0, height) + Math.round(this.V) + this.T, this.N.j1() + this.U);
        if (recyclerView.isNestedScrollingEnabled()) {
            return;
        }
        recyclerView.setNestedScrollingEnabled(true);
    }

    public final boolean c() {
        g71 g71Var = this.I;
        return (g71Var == null || g71Var.getCurrentView() == null || Float.isInfinite(n()) || this.c0 >= ((float) getHeight())) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x005a, code lost:
    
        if (r5.E.f != false) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(Canvas canvas, RectF rectF, pt0 pt0Var) {
        if (this.I != null && this.P != null && this.J.getVisibility() == 0 && this.I.getVisibility() == 0) {
            for (View view : this.I.getViewPages()) {
                if (view != null && view.getParent() == this.I && view.getVisibility() == 0) {
                    pt0Var.a(canvas, rectF, this.P.n(view));
                }
            }
        }
        RecyclerView recyclerView = this.F;
        if (recyclerView == null || recyclerView.getVisibility() != 0) {
            return;
        }
        float x10 = this.e0 ? this.M.getX() : 0.0f;
        if (x10 == 0.0f) {
            pt0Var.a(canvas, rectF, this.F);
            return;
        }
        RectF rectF2 = this.s;
        rectF2.set(rectF);
        rectF2.offset(-x10, 0.0f);
        int save = canvas.save();
        try {
            canvas.translate(x10, 0.0f);
            pt0Var.a(canvas, rectF2, this.F);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            if (this.a) {
                this.n++;
                this.e = 0L;
                f("TOUCH_DOWN", null, 0, 0, true);
            }
            A();
        } else if (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) {
            f(motionEvent.getActionMasked() == 1 ? "TOUCH_UP" : "TOUCH_CANCEL", null, 0, 0, true);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void e(String str, View view, int i7, int i10) {
        if (this.a) {
            long uptimeMillis = SystemClock.uptimeMillis();
            if (uptimeMillis - this.e < 250) {
                return;
            }
            this.e = uptimeMillis;
            f(str.concat(i10 == 0 ? "_TOUCH" : "_NON_TOUCH"), view, i7, i7, true);
        }
    }

    public final void f(String str, View view, int i7, int i10, boolean z10) {
        ot0 ot0Var;
        if (this.a) {
            long uptimeMillis = SystemClock.uptimeMillis();
            if (!z10) {
                if (uptimeMillis - this.d < 250) {
                    return;
                } else {
                    this.d = uptimeMillis;
                }
            }
            g71 g71Var = this.I;
            int i11 = 0;
            View view2 = null;
            View view3 = g71Var == null ? null : g71Var.getViewPages()[0];
            g71 g71Var2 = this.I;
            View view4 = g71Var2 == null ? null : g71Var2.getViewPages()[1];
            StringBuilder sb2 = new StringBuilder("root=");
            sb2.append(Integer.toHexString(System.identityHashCode(this)));
            sb2.append(" gesture=");
            sb2.append(this.n);
            sb2.append(" transition=");
            sb2.append(this.r);
            sb2.append(" event=");
            sb2.append(str);
            sb2.append(" target=");
            sb2.append(h(view));
            sb2.append(" dy=");
            sb2.append(i7);
            sb2.append(" used=");
            sb2.append(i10);
            sb2.append(" transitioning=");
            sb2.append(this.e0);
            sb2.append(" progress=");
            sb2.append(this.E.e);
            sb2.append(" ageMs=");
            sb2.append(this.e0 ? uptimeMillis - this.f : 0L);
            sb2.append(" unchangedMs=");
            sb2.append(this.e0 ? uptimeMillis - this.h : 0L);
            sb2.append(" depth=");
            sb2.append(this.R);
            sb2.append(" updating=");
            sb2.append(this.d0);
            sb2.append(" callback=");
            sb2.append(h(this.Q));
            sb2.append(" common=");
            sb2.append(h(this.F));
            sb2.append(" active=");
            sb2.append(h(this.G));
            sb2.append(" current=");
            sb2.append(h(view3));
            sb2.append(" other=");
            sb2.append(h(view4));
            sb2.append(" source=");
            sb2.append(h(this.L));
            sb2.append(" incoming=");
            sb2.append(h(this.M));
            sb2.append(" boundary=");
            sb2.append(n());
            sb2.append(" pin=");
            sb2.append(this.V);
            sb2.append(" tail=");
            sb2.append(this.b0);
            sb2.append(" alignPending=");
            sb2.append(this.h0);
            mt0 mt0Var = this.O;
            int i12 = -1;
            int b10 = mt0Var == null ? -1 : mt0Var.b();
            RecyclerView recyclerView = this.F;
            v4.p0 layoutManager = recyclerView == null ? null : recyclerView.getLayoutManager();
            if (layoutManager != null && b10 != -1) {
                view2 = layoutManager.m(b10);
            }
            StringBuilder m10 = i5.c.m(b10, " row=", " anchor=");
            m10.append(h(view2));
            m10.append(" anchorTop=");
            m10.append(view2 == null ? 0 : view2.getTop());
            m10.append(" anchorHeight=");
            m10.append(view2 == null ? 0 : view2.getHeight());
            m10.append(" decoratedTop=");
            if (view2 != null) {
                layoutManager.getClass();
                i11 = v4.p0.z(view2);
            }
            m10.append(i11);
            m10.append(" adapterPosition=");
            if (view2 != null) {
                this.F.getClass();
                i12 = RecyclerView.R(view2);
            }
            m10.append(i12);
            m10.append(" pageOffset=");
            RecyclerView recyclerView2 = this.G;
            m10.append((recyclerView2 == null || (ot0Var = this.P) == null) ? 0.0f : ot0Var.j(recyclerView2));
            m10.append(" tabsTop=");
            m10.append(this.c0);
            m10.append(" draw=");
            m10.append(this.c);
            sb2.append(m10.toString());
            Log.d("SiblingScroll", sb2.toString());
        }
    }

    public final void g(String str) {
        f(str, this.I, 0, 0, true);
    }

    public int getBottomBleed() {
        return this.U;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.x.b();
    }

    public float getTabsTop() {
        return this.c0;
    }

    public int getTopBleed() {
        return this.T;
    }

    public final void i(String str) {
        qt0 qt0Var;
        if (this.a) {
            qt0Var = this;
            qt0Var.f("TRANSITION_END_".concat(str), null, 0, 0, true);
        } else {
            qt0Var = this;
        }
        qt0Var.e0 = false;
        qt0Var.M = null;
        qt0Var.L = null;
        qt0Var.w.invalidate();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000f, code lost:
    
        if (r3.E.f != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean j(float f10, float f11) {
        float f12;
        if (this.e0) {
            f12 = this.M.getX();
        }
        f12 = 0.0f;
        return f11 >= 0.0f && f11 < this.b0 && f10 >= Math.max(0.0f, f12) && f10 < Math.min((float) getWidth(), f12 + ((float) getWidth()));
    }

    @Override // r0.k
    public final void k(int i7, View view) {
        f(i7 == 0 ? "NESTED_STOP_TOUCH" : "NESTED_STOP_NON_TOUCH", view, 0, 0, true);
        e2.r0 r0Var = this.x;
        if (i7 == 1) {
            r0Var.b = 0;
        } else {
            r0Var.a = 0;
        }
    }

    @Override // r0.l
    public final void l(View view, int i7, int i10, int i11, int i12, int i13, int[] iArr) {
        RecyclerView recyclerView;
        if (this.R != 0 || (view != (recyclerView = this.F) && view != this.G)) {
            f("POST_IGNORED", view, i12, 0, false);
            return;
        }
        if (this.e0) {
            e("POST_BLOCKED", view, i12, i13);
            iArr[1] = iArr[1] + i12;
            return;
        }
        this.Q = view;
        try {
            hn hnVar = this.j0;
            int i14 = 0;
            boolean z10 = view == recyclerView;
            if (z10 && i10 > 0 && i12 > 0) {
                qt0 qt0Var = (qt0) hnVar.b;
                mt0 mt0Var = qt0Var.O;
                if (mt0Var != null && mt0Var.b() != -1) {
                    i14 = qt0Var.t(qt0Var.G, i12);
                }
            } else if (!z10 && i12 < 0) {
                qt0 qt0Var2 = (qt0) hnVar.b;
                i14 = qt0Var2.t(qt0Var2.F, i12);
            }
            iArr[1] = iArr[1] + i14;
            f("POST", view, i12, i14, false);
        } finally {
            this.Q = null;
            B();
        }
    }

    @Override // r0.k
    public final void m(View view, int i7, int i10, int i11, int i12, int i13) {
        int[] iArr = this.y;
        iArr[1] = 0;
        iArr[0] = 0;
        l(view, i7, i10, i11, i12, i13, iArr);
    }

    public final float n() {
        View m10;
        RecyclerView recyclerView = this.F;
        if (recyclerView == null || this.O == null || recyclerView.getLayoutManager() == null) {
            return Float.POSITIVE_INFINITY;
        }
        v4.p0 layoutManager = this.F.getLayoutManager();
        int b10 = this.O.b();
        if (b10 == -1 || (m10 = layoutManager.m(b10)) == null) {
            return Float.POSITIVE_INFINITY;
        }
        return (v4.p0.z(m10) + this.F.getTop()) - ((ViewGroup.MarginLayoutParams) ((v4.q0) m10.getLayoutParams())).topMargin;
    }

    @Override // r0.k
    public final boolean o(View view, View view2, int i7, int i10) {
        boolean z10 = false;
        boolean z11 = (i7 & 2) != 0;
        if (this.R == 0 && z11 && (view2 == this.F || view2 == this.G)) {
            z10 = true;
        }
        if (this.a) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(z10 ? "NESTED_START" : "NESTED_REJECT");
            sb2.append("_axes=");
            sb2.append(i7);
            sb2.append("_type=");
            sb2.append(i10);
            f(sb2.toString(), view2, 0, 0, true);
        }
        return z10;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnPreDrawListener(this.l0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        A();
        getViewTreeObserver().removeOnPreDrawListener(this.l0);
        super.onDetachedFromWindow();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f10, float f11) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i7, int i10, int[] iArr) {
        s(view, i7, i10, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i7, int i10, int i11, int i12) {
        m(view, i7, i10, i11, i12, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i7) {
        r(view, view2, i7, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i7) {
        return o(view, view2, i7, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        k(0, view);
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x00e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void p() {
        g71 g71Var;
        qt0 qt0Var;
        View view;
        if (this.d0 || (g71Var = this.I) == null || this.P == null || this.N == null) {
            return;
        }
        View[] viewPages = g71Var.getViewPages();
        boolean z10 = false;
        View view2 = viewPages[0];
        View view3 = viewPages[1];
        g71 g71Var2 = this.I;
        if (g71Var2 instanceof ek0) {
            ek0 ek0Var = (ek0) g71Var2;
            if (view2 != null && view3 != null && view2 == ek0Var.b0 && view3 == ek0Var.c0 && !ek0Var.I && view2.getTranslationX() == 0.0f && view2.getMeasuredWidth() > 0 && Math.abs(view3.getTranslationX()) >= view2.getMeasuredWidth()) {
                z10 = true;
            }
        }
        if (this.e0 && z10) {
            i("drag_aborted");
        }
        if (this.e0 && (view3 == null || ((view2 != (view = this.L) && view2 != this.M) || (view3 != view && view3 != this.M)))) {
            i("page_slots_changed");
        }
        q();
        boolean z11 = this.e0;
        bi.a3 a3Var = this.w;
        dk0 dk0Var = this.E;
        if (!z11 && !z10 && view2 != null && view3 != null) {
            float n10 = n();
            if (!Float.isInfinite(n10)) {
                C();
                A();
                this.L = view2;
                this.M = view3;
                float f10 = this.V;
                if (n10 <= 0.5f + f10) {
                    n10 = f10;
                }
                ot0 ot0Var = this.P;
                dk0Var.a(n10, ot0Var.j(ot0Var.n(view2)), this.V, this.W);
                this.e0 = true;
                if (this.a) {
                    this.r++;
                    long uptimeMillis = SystemClock.uptimeMillis();
                    this.f = uptimeMillis;
                    this.h = uptimeMillis;
                    this.e = 0L;
                    qt0Var = this;
                    qt0Var.f("TRANSITION_BEGIN", view2, 0, 0, true);
                } else {
                    qt0Var = this;
                }
                a3Var.invalidate();
                if (qt0Var.e0) {
                    float max = Math.max(1, qt0Var.L.getWidth());
                    float f11 = dk0Var.e;
                    float max2 = Math.max(0.0f, Math.min(1.0f, Math.abs(qt0Var.L.getTranslationX()) / max));
                    dk0Var.e = max2;
                    if (f11 != max2) {
                        a3Var.invalidate();
                        if (qt0Var.a) {
                            qt0Var.h = SystemClock.uptimeMillis();
                        }
                    }
                }
                B();
            }
        }
        qt0Var = this;
        if (qt0Var.e0) {
        }
        B();
    }

    public final void q() {
        g71 g71Var = this.I;
        RecyclerView n10 = (g71Var == null || this.P == null || g71Var.getCurrentView() == null) ? null : this.P.n(this.I.getCurrentView());
        if (n10 == this.G) {
            return;
        }
        f("ACTIVE_CHANGE", n10, 0, 0, true);
        RecyclerView recyclerView = this.G;
        oa oaVar = this.k0;
        if (recyclerView != null) {
            recyclerView.C0();
            ArrayList arrayList = this.G.x0;
            if (arrayList != null) {
                arrayList.remove(oaVar);
            }
        }
        this.G = n10;
        if (n10 != null) {
            n10.j(oaVar);
        }
    }

    @Override // r0.k
    public final void r(View view, View view2, int i7, int i10) {
        e2.r0 r0Var = this.x;
        if (i10 == 1) {
            r0Var.b = i7;
        } else {
            r0Var.a = i7;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0043, code lost:
    
        if (r9 <= 0.5f) goto L22;
     */
    @Override // r0.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s(View view, int i7, int i10, int[] iArr, int i11) {
        RecyclerView recyclerView;
        if (this.R != 0 || (view != (recyclerView = this.F) && view != this.G)) {
            f("PRE_IGNORED", view, i10, 0, false);
            return;
        }
        if (this.e0) {
            e("PRE_BLOCKED", view, i10, i11);
            iArr[1] = iArr[1] + i10;
            return;
        }
        this.Q = view;
        try {
            hn hnVar = this.j0;
            int i12 = 0;
            if (view == recyclerView) {
                if (i10 >= 0) {
                    qt0 qt0Var = (qt0) hnVar.b;
                    float n10 = qt0Var.n();
                    if (!Float.isInfinite(n10)) {
                        n10 = Math.max(0.0f, n10 - qt0Var.V);
                    }
                }
                qt0 qt0Var2 = (qt0) hnVar.b;
                mt0 mt0Var = qt0Var2.O;
                if (mt0Var != null && mt0Var.b() != -1) {
                    i12 = qt0Var2.t(qt0Var2.G, i10);
                }
            } else if (i10 > 0) {
                qt0 qt0Var3 = (qt0) hnVar.b;
                float n11 = qt0Var3.n();
                if (!Float.isInfinite(n11)) {
                    n11 = Math.max(0.0f, n11 - qt0Var3.V);
                }
                int min = Float.isInfinite(n11) ? i10 : Math.min(i10, Math.max(0, Math.round(n11)));
                qt0 qt0Var4 = (qt0) hnVar.b;
                i12 = qt0Var4.t(qt0Var4.F, min);
            }
            iArr[1] = iArr[1] + i12;
            f("PRE", view, i10, i12, false);
        } finally {
            this.Q = null;
            B();
        }
    }

    public void setCommonInsetsManagedExternally(boolean z10) {
        if (this.i0 == z10) {
            return;
        }
        this.i0 = z10;
        B();
        requestLayout();
    }

    public void setDebugLoggingEnabled(boolean z10) {
        this.a = z10;
        if (z10) {
            this.d = 0L;
            this.e = 0L;
            long uptimeMillis = SystemClock.uptimeMillis();
            this.f = uptimeMillis;
            this.h = uptimeMillis;
            f("DEBUG_ENABLED", null, 0, 0, true);
        }
    }

    public void setGeometry(nt0 nt0Var) {
        this.N = nt0Var;
        requestLayout();
        B();
    }

    public final int t(RecyclerView recyclerView, int i7) {
        if (recyclerView == null || i7 == 0) {
            if (i7 != 0) {
                f("TRANSFER_NO_TARGET", recyclerView, i7, 0, false);
            }
            return 0;
        }
        if (recyclerView == this.Q) {
            f("TRANSFER_REENTRY", recyclerView, i7, 0, true);
            throw new IllegalStateException("Reentrant scrollBy on nested source");
        }
        RecyclerView recyclerView2 = this.H;
        int i10 = this.S;
        this.H = recyclerView;
        this.S = 0;
        this.R++;
        try {
            recyclerView.scrollBy(0, i7);
            int i11 = this.S;
            int max = i7 > 0 ? Math.max(0, Math.min(i7, i11)) : Math.min(0, Math.max(i7, i11));
            f(i11 == 0 ? "TRANSFER_ZERO" : "TRANSFER", recyclerView, i7, max, false);
            return max;
        } finally {
            this.R--;
            this.H = recyclerView2;
            this.S = i10;
        }
    }

    public final void u(ck0 ck0Var, mt0 mt0Var) {
        RecyclerView recyclerView = this.F;
        bi.a3 a3Var = this.w;
        oa oaVar = this.k0;
        if (recyclerView != null) {
            recyclerView.C0();
            ArrayList arrayList = this.F.x0;
            if (arrayList != null) {
                arrayList.remove(oaVar);
            }
            a3Var.removeView(this.F);
        }
        this.F = ck0Var;
        this.O = mt0Var;
        a3Var.addView(ck0Var, new FrameLayout.LayoutParams(-1, -1));
        ck0Var.j(oaVar);
        ck0Var.setNestedScrollingEnabled(true);
        B();
    }

    public final void w(View view, float f10) {
        if (view == null) {
            return;
        }
        this.P.n(view).setTranslationY((f10 + this.V) - Math.round(r0));
    }

    public final void x(View view, g71 g71Var, ot0 ot0Var) {
        View view2 = this.J;
        if (view2 != null) {
            removeView(view2);
        }
        this.J = view;
        this.I = g71Var;
        this.P = ot0Var;
        addView(view, 0, new FrameLayout.LayoutParams(-1, -1));
        B();
    }

    public final void y(View view) {
        View view2 = this.K;
        if (view2 != null) {
            removeView(view2);
        }
        this.K = view;
        addView(view, new FrameLayout.LayoutParams(-1, -2, 48));
        B();
    }

    public final void z(int i7, int i10) {
        this.T = Math.max(0, i7);
        this.U = Math.max(0, i10);
        requestLayout();
        B();
    }
}
