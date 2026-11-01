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

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public class lu0 extends FrameLayout implements r0.l {
    public static final /* synthetic */ int l0 = 0;
    public final vk0 D;
    public RecyclerView E;
    public RecyclerView F;
    public RecyclerView G;
    public x71 H;
    public View I;
    public View J;
    public View K;
    public View L;
    public iu0 M;
    public hu0 N;
    public ju0 O;
    public View P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public float U;
    public float V;
    public float W;
    public boolean a;
    public float a0;
    public int b;
    public float b0;
    public int c;
    public boolean c0;
    public long d;
    public boolean d0;
    public long e;
    public boolean e0;
    public long f;
    public boolean f0;
    public boolean g0;
    public long h;
    public boolean h0;
    public final m2.t i0;
    public final cu0 j0;
    public final dt k0;
    public int n;
    public int r;
    public final RectF s;
    public final jg.l0 w;
    public final ac.g x;
    public final int[] y;

    public lu0(Context context) {
        super(context);
        this.s = new RectF();
        this.x = new ac.g();
        this.y = new int[2];
        this.D = new vk0();
        this.i0 = new m2.t(this, 14);
        this.j0 = new cu0(this, 1);
        this.k0 = new dt(2, this);
        setClipChildren(false);
        setClipToPadding(false);
        jg.l0 l0Var = new jg.l0(this, context);
        this.w = l0Var;
        addView(l0Var, new FrameLayout.LayoutParams(-1, -1));
    }

    public static String h(View view) {
        if (view == null) {
            return "null";
        }
        String str = view.getClass().getSimpleName() + "@" + Integer.toHexString(System.identityHashCode(view)) + "(x=" + view.getTranslationX() + ",y=" + view.getTranslationY() + ",w=" + view.getWidth() + ",visibility=" + view.getVisibility() + ",attached=" + view.isAttachedToWindow() + ",top=" + view.getTop() + ",height=" + view.getHeight() + ",layoutRequested=" + view.isLayoutRequested();
        if (view instanceof RecyclerView) {
            RecyclerView recyclerView = (RecyclerView) view;
            StringBuilder i10 = sc.e.i(str, ",scrollState=");
            i10.append(recyclerView.getScrollState());
            i10.append(",up=");
            i10.append(recyclerView.canScrollVertically(-1));
            i10.append(",down=");
            i10.append(recyclerView.canScrollVertically(1));
            i10.append(",layout=");
            i10.append(recyclerView.c0());
            i10.append(",pendingUpdates=");
            i10.append(recyclerView.Z());
            i10.append(",animating=");
            i10.append(recyclerView.b0());
            i10.append(",paddingTop=");
            i10.append(recyclerView.getPaddingTop());
            i10.append(",count=");
            i10.append(recyclerView.getAdapter() == null ? 0 : recyclerView.getAdapter().b());
            str = i10.toString();
        }
        return sc.e.A(str, ")");
    }

    private void setBleed(RecyclerView recyclerView) {
        ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            int i10 = marginLayoutParams.topMargin;
            int i11 = this.S;
            if (i10 == (-i11) && marginLayoutParams.bottomMargin == (-this.T)) {
                return;
            }
            marginLayoutParams.topMargin = -i11;
            marginLayoutParams.bottomMargin = -this.T;
            recyclerView.setLayoutParams(marginLayoutParams);
        }
    }

    private void setTabsPinned(boolean z10) {
        if (this.e0 == z10) {
            return;
        }
        this.e0 = z10;
        f(z10 ? "TABS_PINNED" : "TABS_UNPINNED", this.E, 0, 0, true);
        this.M.F(z10);
    }

    public static void v(RecyclerView recyclerView, int i10, int i11) {
        int b10;
        if (recyclerView.getPaddingTop() == i10 && recyclerView.getPaddingBottom() == i11) {
            return;
        }
        s4.n0 layoutManager = recyclerView.getLayoutManager();
        int i12 = 0;
        View q6 = (layoutManager == null || layoutManager.r() == 0) ? null : layoutManager.q(0);
        if (q6 == null) {
            b10 = -1;
        } else {
            layoutManager.getClass();
            b10 = ((s4.o0) q6.getLayoutParams()).b();
        }
        if (q6 != null) {
            layoutManager.getClass();
            i12 = (s4.n0.z(q6) - recyclerView.getPaddingTop()) - ((ViewGroup.MarginLayoutParams) ((s4.o0) q6.getLayoutParams())).topMargin;
        }
        recyclerView.setPadding(recyclerView.getPaddingLeft(), i10, recyclerView.getPaddingRight(), i11);
        if (b10 == -1 || !(layoutManager instanceof s4.a0)) {
            return;
        }
        ((s4.a0) layoutManager).h1(b10, i12);
    }

    public final void A() {
        f("STOP_SCROLLING", null, 0, 0, true);
        RecyclerView recyclerView = this.E;
        if (recyclerView != null) {
            recyclerView.C0();
        }
        x71 x71Var = this.H;
        if (x71Var == null || this.O == null) {
            return;
        }
        for (View view : x71Var.getViewPages()) {
            if (view != null) {
                this.O.j(view).C0();
            }
        }
    }

    public final void B() {
        vk0 vk0Var = this.D;
        if (this.c0 || this.M == null) {
            return;
        }
        boolean z10 = true;
        this.c0 = true;
        try {
            float f7 = this.a0;
            C();
            RecyclerView recyclerView = this.E;
            if (recyclerView != null && !this.h0) {
                setBleed(recyclerView);
                RecyclerView recyclerView2 = this.E;
                int i10 = this.S;
                this.M.getClass();
                v(recyclerView2, i10, this.T);
            }
            x71 x71Var = this.H;
            if (x71Var != null && this.O != null && this.J != null) {
                for (View view : x71Var.getViewPages()) {
                    if (view != null && view.getParent() == this.H) {
                        b(this.O.j(view));
                    }
                }
                r();
                float o10 = o();
                boolean isInfinite = Float.isInfinite(o10);
                jg.l0 l0Var = this.w;
                float f10 = 0.0f;
                if (isInfinite) {
                    this.a0 = Float.POSITIVE_INFINITY;
                    this.I.setVisibility(4);
                    this.J.setVisibility(4);
                    RecyclerView recyclerView3 = this.E;
                    if (recyclerView3 != null) {
                        recyclerView3.setTranslationY(0.0f);
                    }
                    setTabsPinned(false);
                    if (f7 != this.a0) {
                        l0Var.invalidate();
                    }
                    this.c0 = false;
                    return;
                }
                float f11 = this.U;
                if (o10 > f11 + 0.5f) {
                    f11 = o10;
                }
                this.W = f11;
                this.I.setVisibility(0);
                this.J.setVisibility(0);
                if (this.d0) {
                    this.a0 = vk0Var.b();
                    this.b0 = Math.max(vk0Var.d, vk0Var.b());
                    View view2 = this.K;
                    float max = Math.max(0.0f, vk0Var.a - vk0Var.d);
                    if (!vk0Var.f) {
                        f10 = vk0Var.b() - vk0Var.b;
                    }
                    w(view2, max + f10);
                    w(this.L, Math.max(vk0Var.d, vk0Var.b()) - vk0Var.d);
                } else {
                    RecyclerView recyclerView4 = this.F;
                    float max2 = this.W - Math.max(0.0f, Math.min(recyclerView4 == null ? 0.0f : this.O.f(recyclerView4), Math.max(0.0f, this.U - this.V)));
                    this.a0 = max2;
                    this.b0 = Math.max(this.U, max2);
                    w(this.H.getCurrentView(), Math.max(0.0f, this.W - this.U));
                }
                this.E.setTranslationY(this.a0 - o10);
                this.J.setTranslationY(this.b0 - r0.getTop());
                if (this.b0 > this.U + 0.5f) {
                    z10 = false;
                }
                setTabsPinned(z10);
                this.M.getClass();
                if (f7 != this.a0) {
                    l0Var.invalidate();
                }
                this.c0 = false;
            }
        } finally {
            this.c0 = false;
        }
    }

    public final void C() {
        iu0 iu0Var = this.M;
        if (iu0Var == null) {
            return;
        }
        float a12 = iu0Var.a1();
        this.M.getClass();
        if (Float.isNaN(a12) || Float.isInfinite(a12) || Float.isNaN(0.0f) || Float.isInfinite(0.0f) || a12 < 0.0f) {
            throw new IllegalArgumentException("Require finite 0 <= commonHiddenTop <= tabsPinnedTop");
        }
        if (this.f0 && (a12 != this.U || 0.0f != this.V)) {
            float o10 = o();
            if (!Float.isInfinite(o10)) {
                float f7 = this.U;
                boolean z10 = o10 <= 0.5f + f7 || o10 < a12;
                if (z10 && a12 != f7) {
                    this.g0 = true;
                }
                if (this.d0) {
                    vk0 vk0Var = this.D;
                    float f10 = vk0Var.e;
                    if (z10) {
                        o10 = a12;
                    }
                    ju0 ju0Var = this.O;
                    vk0Var.a(o10, ju0Var.f(ju0Var.j(this.K)), a12, 0.0f);
                    vk0Var.e = Math.max(0.0f, Math.min(1.0f, f10));
                    this.w.invalidate();
                }
            }
        }
        this.U = a12;
        this.V = 0.0f;
        this.f0 = true;
    }

    public final void a() {
        hu0 hu0Var;
        f("ALIGN_BOUNDARY", this.E, 0, 0, true);
        if (this.E == null || (hu0Var = this.N) == null || this.M == null) {
            return;
        }
        int c10 = hu0Var.c();
        s4.n0 layoutManager = this.E.getLayoutManager();
        if (c10 == -1 || !(layoutManager instanceof s4.a0)) {
            return;
        }
        C();
        ((s4.a0) layoutManager).h1(c10, (Math.round(this.U) - this.E.getTop()) - this.E.getPaddingTop());
        this.g0 = true;
        requestLayout();
    }

    public final void b(RecyclerView recyclerView) {
        if (this.M == null || recyclerView == null) {
            return;
        }
        C();
        View view = this.J;
        int height = view == null ? 0 : view.getHeight() > 0 ? this.J.getHeight() : this.J.getLayoutParams().height;
        setBleed(recyclerView);
        v(recyclerView, Math.max(0, height) + Math.round(this.U) + this.S, this.M.g1() + this.T);
        if (recyclerView.isNestedScrollingEnabled()) {
            return;
        }
        recyclerView.setNestedScrollingEnabled(true);
    }

    public final boolean c() {
        x71 x71Var = this.H;
        return (x71Var == null || x71Var.getCurrentView() == null || Float.isInfinite(o()) || this.b0 >= ((float) getHeight())) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x005a, code lost:
    
        if (r5.D.f != false) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(Canvas canvas, RectF rectF, ku0 ku0Var) {
        if (this.H != null && this.O != null && this.I.getVisibility() == 0 && this.H.getVisibility() == 0) {
            for (View view : this.H.getViewPages()) {
                if (view != null && view.getParent() == this.H && view.getVisibility() == 0) {
                    ku0Var.a(canvas, rectF, this.O.j(view));
                }
            }
        }
        RecyclerView recyclerView = this.E;
        if (recyclerView == null || recyclerView.getVisibility() != 0) {
            return;
        }
        float x10 = this.d0 ? this.L.getX() : 0.0f;
        if (x10 == 0.0f) {
            ku0Var.a(canvas, rectF, this.E);
            return;
        }
        RectF rectF2 = this.s;
        rectF2.set(rectF);
        rectF2.offset(-x10, 0.0f);
        int save = canvas.save();
        try {
            canvas.translate(x10, 0.0f);
            ku0Var.a(canvas, rectF2, this.E);
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

    public final void e(String str, View view, int i10, int i11) {
        if (this.a) {
            long uptimeMillis = SystemClock.uptimeMillis();
            if (uptimeMillis - this.e < 250) {
                return;
            }
            this.e = uptimeMillis;
            f(str.concat(i11 == 0 ? "_TOUCH" : "_NON_TOUCH"), view, i10, i10, true);
        }
    }

    public final void f(String str, View view, int i10, int i11, boolean z10) {
        ju0 ju0Var;
        if (this.a) {
            long uptimeMillis = SystemClock.uptimeMillis();
            if (!z10) {
                if (uptimeMillis - this.d < 250) {
                    return;
                } else {
                    this.d = uptimeMillis;
                }
            }
            x71 x71Var = this.H;
            int i12 = 0;
            View view2 = null;
            View view3 = x71Var == null ? null : x71Var.getViewPages()[0];
            x71 x71Var2 = this.H;
            View view4 = x71Var2 == null ? null : x71Var2.getViewPages()[1];
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
            sb2.append(i10);
            sb2.append(" used=");
            sb2.append(i11);
            sb2.append(" transitioning=");
            sb2.append(this.d0);
            sb2.append(" progress=");
            sb2.append(this.D.e);
            sb2.append(" ageMs=");
            sb2.append(this.d0 ? uptimeMillis - this.f : 0L);
            sb2.append(" unchangedMs=");
            sb2.append(this.d0 ? uptimeMillis - this.h : 0L);
            sb2.append(" depth=");
            sb2.append(this.Q);
            sb2.append(" updating=");
            sb2.append(this.c0);
            sb2.append(" callback=");
            sb2.append(h(this.P));
            sb2.append(" common=");
            sb2.append(h(this.E));
            sb2.append(" active=");
            sb2.append(h(this.F));
            sb2.append(" current=");
            sb2.append(h(view3));
            sb2.append(" other=");
            sb2.append(h(view4));
            sb2.append(" source=");
            sb2.append(h(this.K));
            sb2.append(" incoming=");
            sb2.append(h(this.L));
            sb2.append(" boundary=");
            sb2.append(o());
            sb2.append(" pin=");
            sb2.append(this.U);
            sb2.append(" tail=");
            sb2.append(this.a0);
            sb2.append(" alignPending=");
            sb2.append(this.g0);
            hu0 hu0Var = this.N;
            int i13 = -1;
            int c10 = hu0Var == null ? -1 : hu0Var.c();
            RecyclerView recyclerView = this.E;
            s4.n0 layoutManager = recyclerView == null ? null : recyclerView.getLayoutManager();
            if (layoutManager != null && c10 != -1) {
                view2 = layoutManager.m(c10);
            }
            StringBuilder l4 = i0.a.l(c10, " row=", " anchor=");
            l4.append(h(view2));
            l4.append(" anchorTop=");
            l4.append(view2 == null ? 0 : view2.getTop());
            l4.append(" anchorHeight=");
            l4.append(view2 == null ? 0 : view2.getHeight());
            l4.append(" decoratedTop=");
            if (view2 != null) {
                layoutManager.getClass();
                i12 = s4.n0.z(view2);
            }
            l4.append(i12);
            l4.append(" adapterPosition=");
            if (view2 != null) {
                this.E.getClass();
                i13 = RecyclerView.R(view2);
            }
            l4.append(i13);
            l4.append(" pageOffset=");
            RecyclerView recyclerView2 = this.F;
            l4.append((recyclerView2 == null || (ju0Var = this.O) == null) ? 0.0f : ju0Var.f(recyclerView2));
            l4.append(" tabsTop=");
            l4.append(this.b0);
            l4.append(" draw=");
            l4.append(this.c);
            sb2.append(l4.toString());
            Log.d("SiblingScroll", sb2.toString());
        }
    }

    public final void g(String str) {
        f(str, this.H, 0, 0, true);
    }

    public int getBottomBleed() {
        return this.T;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.x.b();
    }

    public float getTabsTop() {
        return this.b0;
    }

    public int getTopBleed() {
        return this.S;
    }

    public final void i(String str) {
        lu0 lu0Var;
        if (this.a) {
            lu0Var = this;
            lu0Var.f("TRANSITION_END_".concat(str), null, 0, 0, true);
        } else {
            lu0Var = this;
        }
        lu0Var.d0 = false;
        lu0Var.L = null;
        lu0Var.K = null;
        lu0Var.w.invalidate();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000f, code lost:
    
        if (r3.D.f != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean j(float f7, float f10) {
        float f11;
        if (this.d0) {
            f11 = this.L.getX();
        }
        f11 = 0.0f;
        return f10 >= 0.0f && f10 < this.a0 && f7 >= Math.max(0.0f, f11) && f7 < Math.min((float) getWidth(), f11 + ((float) getWidth()));
    }

    @Override // r0.k
    public final void k(int i10, View view) {
        f(i10 == 0 ? "NESTED_STOP_TOUCH" : "NESTED_STOP_NON_TOUCH", view, 0, 0, true);
        ac.g gVar = this.x;
        if (i10 == 1) {
            gVar.b = 0;
        } else {
            gVar.a = 0;
        }
    }

    @Override // r0.l
    public final void l(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        RecyclerView recyclerView;
        if (this.Q != 0 || (view != (recyclerView = this.E) && view != this.F)) {
            f("POST_IGNORED", view, i13, 0, false);
            return;
        }
        if (this.d0) {
            e("POST_BLOCKED", view, i13, i14);
            iArr[1] = iArr[1] + i13;
            return;
        }
        this.P = view;
        try {
            m2.t tVar = this.i0;
            int i15 = 0;
            boolean z10 = view == recyclerView;
            if (z10 && i11 > 0 && i13 > 0) {
                lu0 lu0Var = (lu0) tVar.b;
                hu0 hu0Var = lu0Var.N;
                if (hu0Var != null && hu0Var.c() != -1) {
                    i15 = lu0Var.t(lu0Var.F, i13);
                }
            } else if (!z10 && i13 < 0) {
                lu0 lu0Var2 = (lu0) tVar.b;
                i15 = lu0Var2.t(lu0Var2.E, i13);
            }
            iArr[1] = iArr[1] + i15;
            f("POST", view, i13, i15, false);
        } finally {
            this.P = null;
            B();
        }
    }

    @Override // r0.k
    public final void m(View view, int i10, int i11, int i12, int i13, int i14) {
        int[] iArr = this.y;
        iArr[1] = 0;
        iArr[0] = 0;
        l(view, i10, i11, i12, i13, i14, iArr);
    }

    @Override // r0.k
    public final boolean n(View view, View view2, int i10, int i11) {
        boolean z10 = false;
        boolean z11 = (i10 & 2) != 0;
        if (this.Q == 0 && z11 && (view2 == this.E || view2 == this.F)) {
            z10 = true;
        }
        if (this.a) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(z10 ? "NESTED_START" : "NESTED_REJECT");
            sb2.append("_axes=");
            sb2.append(i10);
            sb2.append("_type=");
            sb2.append(i11);
            f(sb2.toString(), view2, 0, 0, true);
        }
        return z10;
    }

    public final float o() {
        View m10;
        RecyclerView recyclerView = this.E;
        if (recyclerView == null || this.N == null || recyclerView.getLayoutManager() == null) {
            return Float.POSITIVE_INFINITY;
        }
        s4.n0 layoutManager = this.E.getLayoutManager();
        int c10 = this.N.c();
        if (c10 == -1 || (m10 = layoutManager.m(c10)) == null) {
            return Float.POSITIVE_INFINITY;
        }
        return (s4.n0.z(m10) + this.E.getTop()) - ((ViewGroup.MarginLayoutParams) ((s4.o0) m10.getLayoutParams())).topMargin;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnPreDrawListener(this.k0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        A();
        getViewTreeObserver().removeOnPreDrawListener(this.k0);
        super.onDetachedFromWindow();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f7, float f10, boolean z10) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f7, float f10) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        s(view, i10, i11, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        m(view, i10, i11, i12, i13, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i10) {
        q(view, view2, i10, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        return n(view, view2, i10, 0);
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
        x71 x71Var;
        lu0 lu0Var;
        View view;
        if (this.c0 || (x71Var = this.H) == null || this.O == null || this.M == null) {
            return;
        }
        View[] viewPages = x71Var.getViewPages();
        boolean z10 = false;
        View view2 = viewPages[0];
        View view3 = viewPages[1];
        x71 x71Var2 = this.H;
        if (x71Var2 instanceof wk0) {
            wk0 wk0Var = (wk0) x71Var2;
            if (view2 != null && view3 != null && view2 == wk0Var.a0 && view3 == wk0Var.b0 && !wk0Var.H && view2.getTranslationX() == 0.0f && view2.getMeasuredWidth() > 0 && Math.abs(view3.getTranslationX()) >= view2.getMeasuredWidth()) {
                z10 = true;
            }
        }
        if (this.d0 && z10) {
            i("drag_aborted");
        }
        if (this.d0 && (view3 == null || ((view2 != (view = this.K) && view2 != this.L) || (view3 != view && view3 != this.L)))) {
            i("page_slots_changed");
        }
        r();
        boolean z11 = this.d0;
        jg.l0 l0Var = this.w;
        vk0 vk0Var = this.D;
        if (!z11 && !z10 && view2 != null && view3 != null) {
            float o10 = o();
            if (!Float.isInfinite(o10)) {
                C();
                A();
                this.K = view2;
                this.L = view3;
                float f7 = this.U;
                if (o10 <= 0.5f + f7) {
                    o10 = f7;
                }
                ju0 ju0Var = this.O;
                vk0Var.a(o10, ju0Var.f(ju0Var.j(view2)), this.U, this.V);
                this.d0 = true;
                if (this.a) {
                    this.r++;
                    long uptimeMillis = SystemClock.uptimeMillis();
                    this.f = uptimeMillis;
                    this.h = uptimeMillis;
                    this.e = 0L;
                    lu0Var = this;
                    lu0Var.f("TRANSITION_BEGIN", view2, 0, 0, true);
                } else {
                    lu0Var = this;
                }
                l0Var.invalidate();
                if (lu0Var.d0) {
                    float max = Math.max(1, lu0Var.K.getWidth());
                    float f10 = vk0Var.e;
                    float max2 = Math.max(0.0f, Math.min(1.0f, Math.abs(lu0Var.K.getTranslationX()) / max));
                    vk0Var.e = max2;
                    if (f10 != max2) {
                        l0Var.invalidate();
                        if (lu0Var.a) {
                            lu0Var.h = SystemClock.uptimeMillis();
                        }
                    }
                }
                B();
            }
        }
        lu0Var = this;
        if (lu0Var.d0) {
        }
        B();
    }

    @Override // r0.k
    public final void q(View view, View view2, int i10, int i11) {
        ac.g gVar = this.x;
        if (i11 == 1) {
            gVar.b = i10;
        } else {
            gVar.a = i10;
        }
    }

    public final void r() {
        x71 x71Var = this.H;
        RecyclerView j10 = (x71Var == null || this.O == null || x71Var.getCurrentView() == null) ? null : this.O.j(this.H.getCurrentView());
        if (j10 == this.F) {
            return;
        }
        f("ACTIVE_CHANGE", j10, 0, 0, true);
        RecyclerView recyclerView = this.F;
        cu0 cu0Var = this.j0;
        if (recyclerView != null) {
            recyclerView.C0();
            ArrayList arrayList = this.F.w0;
            if (arrayList != null) {
                arrayList.remove(cu0Var);
            }
        }
        this.F = j10;
        if (j10 != null) {
            j10.j(cu0Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0043, code lost:
    
        if (r9 <= 0.5f) goto L22;
     */
    @Override // r0.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s(View view, int i10, int i11, int[] iArr, int i12) {
        RecyclerView recyclerView;
        if (this.Q != 0 || (view != (recyclerView = this.E) && view != this.F)) {
            f("PRE_IGNORED", view, i11, 0, false);
            return;
        }
        if (this.d0) {
            e("PRE_BLOCKED", view, i11, i12);
            iArr[1] = iArr[1] + i11;
            return;
        }
        this.P = view;
        try {
            m2.t tVar = this.i0;
            int i13 = 0;
            if (view == recyclerView) {
                if (i11 >= 0) {
                    lu0 lu0Var = (lu0) tVar.b;
                    float o10 = lu0Var.o();
                    if (!Float.isInfinite(o10)) {
                        o10 = Math.max(0.0f, o10 - lu0Var.U);
                    }
                }
                lu0 lu0Var2 = (lu0) tVar.b;
                hu0 hu0Var = lu0Var2.N;
                if (hu0Var != null && hu0Var.c() != -1) {
                    i13 = lu0Var2.t(lu0Var2.F, i11);
                }
            } else if (i11 > 0) {
                lu0 lu0Var3 = (lu0) tVar.b;
                float o11 = lu0Var3.o();
                if (!Float.isInfinite(o11)) {
                    o11 = Math.max(0.0f, o11 - lu0Var3.U);
                }
                int min = Float.isInfinite(o11) ? i11 : Math.min(i11, Math.max(0, Math.round(o11)));
                lu0 lu0Var4 = (lu0) tVar.b;
                i13 = lu0Var4.t(lu0Var4.E, min);
            }
            iArr[1] = iArr[1] + i13;
            f("PRE", view, i11, i13, false);
        } finally {
            this.P = null;
            B();
        }
    }

    public void setCommonInsetsManagedExternally(boolean z10) {
        if (this.h0 == z10) {
            return;
        }
        this.h0 = z10;
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

    public void setGeometry(iu0 iu0Var) {
        this.M = iu0Var;
        requestLayout();
        B();
    }

    public final int t(RecyclerView recyclerView, int i10) {
        if (recyclerView == null || i10 == 0) {
            if (i10 != 0) {
                f("TRANSFER_NO_TARGET", recyclerView, i10, 0, false);
            }
            return 0;
        }
        if (recyclerView == this.P) {
            f("TRANSFER_REENTRY", recyclerView, i10, 0, true);
            throw new IllegalStateException("Reentrant scrollBy on nested source");
        }
        RecyclerView recyclerView2 = this.G;
        int i11 = this.R;
        this.G = recyclerView;
        this.R = 0;
        this.Q++;
        try {
            recyclerView.scrollBy(0, i10);
            int i12 = this.R;
            int max = i10 > 0 ? Math.max(0, Math.min(i10, i12)) : Math.min(0, Math.max(i10, i12));
            f(i12 == 0 ? "TRANSFER_ZERO" : "TRANSFER", recyclerView, i10, max, false);
            return max;
        } finally {
            this.Q--;
            this.G = recyclerView2;
            this.R = i11;
        }
    }

    public final void u(uk0 uk0Var, hu0 hu0Var) {
        RecyclerView recyclerView = this.E;
        jg.l0 l0Var = this.w;
        cu0 cu0Var = this.j0;
        if (recyclerView != null) {
            recyclerView.C0();
            ArrayList arrayList = this.E.w0;
            if (arrayList != null) {
                arrayList.remove(cu0Var);
            }
            l0Var.removeView(this.E);
        }
        this.E = uk0Var;
        this.N = hu0Var;
        l0Var.addView(uk0Var, new FrameLayout.LayoutParams(-1, -1));
        uk0Var.j(cu0Var);
        uk0Var.setNestedScrollingEnabled(true);
        B();
    }

    public final void w(View view, float f7) {
        if (view == null) {
            return;
        }
        this.O.j(view).setTranslationY((f7 + this.U) - Math.round(r0));
    }

    public final void x(View view, x71 x71Var, ju0 ju0Var) {
        View view2 = this.I;
        if (view2 != null) {
            removeView(view2);
        }
        this.I = view;
        this.H = x71Var;
        this.O = ju0Var;
        addView(view, 0, new FrameLayout.LayoutParams(-1, -1));
        B();
    }

    public final void y(View view) {
        View view2 = this.J;
        if (view2 != null) {
            removeView(view2);
        }
        this.J = view;
        addView(view, new FrameLayout.LayoutParams(-1, -2, 48));
        B();
    }

    public final void z(int i10, int i11) {
        this.S = Math.max(0, i10);
        this.T = Math.max(0, i11);
        requestLayout();
        B();
    }
}
