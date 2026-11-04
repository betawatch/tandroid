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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class gt0 extends FrameLayout implements r0.l {
    public static final /* synthetic */ int m0 = 0;
    public final uj0 E;
    public RecyclerView F;
    public RecyclerView G;
    public RecyclerView H;
    public n61 I;
    public View J;
    public View K;
    public View L;
    public View M;
    public dt0 N;
    public ct0 O;
    public et0 P;
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
    public final nh j0;
    public final ji k0;
    public final pk l0;
    public int n;
    public int r;
    public final RectF s;
    public final ai.o2 w;
    public final d2.t0 x;
    public final int[] y;

    public gt0(Context context) {
        super(context);
        this.s = new RectF();
        this.x = new d2.t0();
        this.y = new int[2];
        this.E = new uj0();
        this.j0 = new nh(this, 6);
        this.k0 = new ji(this, 18);
        this.l0 = new pk(3, this);
        setClipChildren(false);
        setClipToPadding(false);
        ai.o2 o2Var = new ai.o2(this, context);
        this.w = o2Var;
        addView(o2Var, new FrameLayout.LayoutParams(-1, -1));
    }

    public static String h(View view) {
        if (view == null) {
            return "null";
        }
        String str = view.getClass().getSimpleName() + "@" + Integer.toHexString(System.identityHashCode(view)) + "(x=" + view.getTranslationX() + ",y=" + view.getTranslationY() + ",w=" + view.getWidth() + ",visibility=" + view.getVisibility() + ",attached=" + view.isAttachedToWindow() + ",top=" + view.getTop() + ",height=" + view.getHeight() + ",layoutRequested=" + view.isLayoutRequested();
        if (view instanceof RecyclerView) {
            RecyclerView recyclerView = (RecyclerView) view;
            StringBuilder h = t4.c.h(str, ",scrollState=");
            h.append(recyclerView.getScrollState());
            h.append(",up=");
            h.append(recyclerView.canScrollVertically(-1));
            h.append(",down=");
            h.append(recyclerView.canScrollVertically(1));
            h.append(",layout=");
            h.append(recyclerView.c0());
            h.append(",pendingUpdates=");
            h.append(recyclerView.Z());
            h.append(",animating=");
            h.append(recyclerView.b0());
            h.append(",paddingTop=");
            h.append(recyclerView.getPaddingTop());
            h.append(",count=");
            h.append(recyclerView.getAdapter() == null ? 0 : recyclerView.getAdapter().b());
            str = h.toString();
        }
        return t4.c.q(str, ")");
    }

    private void setBleed(RecyclerView recyclerView) {
        ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            int i3 = marginLayoutParams.topMargin;
            int i10 = this.T;
            if (i3 == (-i10) && marginLayoutParams.bottomMargin == (-this.U)) {
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
        this.N.F(z10);
    }

    public static void v(RecyclerView recyclerView, int i3, int i10) {
        int b10;
        if (recyclerView.getPaddingTop() == i3 && recyclerView.getPaddingBottom() == i10) {
            return;
        }
        u4.o0 layoutManager = recyclerView.getLayoutManager();
        int i11 = 0;
        View q10 = (layoutManager == null || layoutManager.r() == 0) ? null : layoutManager.q(0);
        if (q10 == null) {
            b10 = -1;
        } else {
            layoutManager.getClass();
            b10 = ((u4.p0) q10.getLayoutParams()).b();
        }
        if (q10 != null) {
            layoutManager.getClass();
            i11 = (u4.o0.z(q10) - recyclerView.getPaddingTop()) - ((ViewGroup.MarginLayoutParams) ((u4.p0) q10.getLayoutParams())).topMargin;
        }
        recyclerView.setPadding(recyclerView.getPaddingLeft(), i3, recyclerView.getPaddingRight(), i10);
        if (b10 == -1 || !(layoutManager instanceof u4.b0)) {
            return;
        }
        ((u4.b0) layoutManager).h1(b10, i11);
    }

    public final void A() {
        f("STOP_SCROLLING", null, 0, 0, true);
        RecyclerView recyclerView = this.F;
        if (recyclerView != null) {
            recyclerView.C0();
        }
        n61 n61Var = this.I;
        if (n61Var == null || this.P == null) {
            return;
        }
        for (View view : n61Var.getViewPages()) {
            if (view != null) {
                this.P.m(view).C0();
            }
        }
    }

    public final void B() {
        uj0 uj0Var = this.E;
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
                int i3 = this.T;
                this.N.getClass();
                v(recyclerView2, i3, this.U);
            }
            n61 n61Var = this.I;
            if (n61Var != null && this.P != null && this.K != null) {
                for (View view : n61Var.getViewPages()) {
                    if (view != null && view.getParent() == this.I) {
                        b(this.P.m(view));
                    }
                }
                q();
                float k10 = k();
                boolean isInfinite = Float.isInfinite(k10);
                ai.o2 o2Var = this.w;
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
                        o2Var.invalidate();
                    }
                    this.d0 = false;
                    return;
                }
                float f12 = this.V;
                if (k10 > f12 + 0.5f) {
                    f12 = k10;
                }
                this.a0 = f12;
                this.J.setVisibility(0);
                this.K.setVisibility(0);
                if (this.e0) {
                    this.b0 = uj0Var.b();
                    this.c0 = Math.max(uj0Var.d, uj0Var.b());
                    View view2 = this.L;
                    float max = Math.max(0.0f, uj0Var.a - uj0Var.d);
                    if (!uj0Var.f) {
                        f11 = uj0Var.b() - uj0Var.b;
                    }
                    w(view2, max + f11);
                    w(this.M, Math.max(uj0Var.d, uj0Var.b()) - uj0Var.d);
                } else {
                    RecyclerView recyclerView4 = this.G;
                    float max2 = this.a0 - Math.max(0.0f, Math.min(recyclerView4 == null ? 0.0f : this.P.i(recyclerView4), Math.max(0.0f, this.V - this.W)));
                    this.b0 = max2;
                    this.c0 = Math.max(this.V, max2);
                    w(this.I.getCurrentView(), Math.max(0.0f, this.a0 - this.V));
                }
                this.F.setTranslationY(this.b0 - k10);
                this.K.setTranslationY(this.c0 - r0.getTop());
                if (this.c0 > this.V + 0.5f) {
                    z10 = false;
                }
                setTabsPinned(z10);
                this.N.getClass();
                if (f10 != this.b0) {
                    o2Var.invalidate();
                }
                this.d0 = false;
            }
        } finally {
            this.d0 = false;
        }
    }

    public final void C() {
        dt0 dt0Var = this.N;
        if (dt0Var == null) {
            return;
        }
        float h12 = dt0Var.h1();
        this.N.getClass();
        if (Float.isNaN(h12) || Float.isInfinite(h12) || Float.isNaN(0.0f) || Float.isInfinite(0.0f) || h12 < 0.0f) {
            throw new IllegalArgumentException("Require finite 0 <= commonHiddenTop <= tabsPinnedTop");
        }
        if (this.g0 && (h12 != this.V || 0.0f != this.W)) {
            float k10 = k();
            if (!Float.isInfinite(k10)) {
                float f10 = this.V;
                boolean z10 = k10 <= 0.5f + f10 || k10 < h12;
                if (z10 && h12 != f10) {
                    this.h0 = true;
                }
                if (this.e0) {
                    uj0 uj0Var = this.E;
                    float f11 = uj0Var.e;
                    if (z10) {
                        k10 = h12;
                    }
                    et0 et0Var = this.P;
                    uj0Var.a(k10, et0Var.i(et0Var.m(this.L)), h12, 0.0f);
                    uj0Var.e = Math.max(0.0f, Math.min(1.0f, f11));
                    this.w.invalidate();
                }
            }
        }
        this.V = h12;
        this.W = 0.0f;
        this.g0 = true;
    }

    public final void a() {
        ct0 ct0Var;
        f("ALIGN_BOUNDARY", this.F, 0, 0, true);
        if (this.F == null || (ct0Var = this.O) == null || this.N == null) {
            return;
        }
        int c2 = ct0Var.c();
        u4.o0 layoutManager = this.F.getLayoutManager();
        if (c2 == -1 || !(layoutManager instanceof u4.b0)) {
            return;
        }
        C();
        ((u4.b0) layoutManager).h1(c2, (Math.round(this.V) - this.F.getTop()) - this.F.getPaddingTop());
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
        v(recyclerView, Math.max(0, height) + Math.round(this.V) + this.T, this.N.m1() + this.U);
        if (recyclerView.isNestedScrollingEnabled()) {
            return;
        }
        recyclerView.setNestedScrollingEnabled(true);
    }

    public final boolean c() {
        n61 n61Var = this.I;
        return (n61Var == null || n61Var.getCurrentView() == null || Float.isInfinite(k()) || this.c0 >= ((float) getHeight())) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x005a, code lost:
    
        if (r5.E.f != false) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(Canvas canvas, RectF rectF, ft0 ft0Var) {
        if (this.I != null && this.P != null && this.J.getVisibility() == 0 && this.I.getVisibility() == 0) {
            for (View view : this.I.getViewPages()) {
                if (view != null && view.getParent() == this.I && view.getVisibility() == 0) {
                    ft0Var.a(canvas, rectF, this.P.m(view));
                }
            }
        }
        RecyclerView recyclerView = this.F;
        if (recyclerView == null || recyclerView.getVisibility() != 0) {
            return;
        }
        float x10 = this.e0 ? this.M.getX() : 0.0f;
        if (x10 == 0.0f) {
            ft0Var.a(canvas, rectF, this.F);
            return;
        }
        RectF rectF2 = this.s;
        rectF2.set(rectF);
        rectF2.offset(-x10, 0.0f);
        int save = canvas.save();
        try {
            canvas.translate(x10, 0.0f);
            ft0Var.a(canvas, rectF2, this.F);
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

    public final void e(String str, View view, int i3, int i10) {
        if (this.a) {
            long uptimeMillis = SystemClock.uptimeMillis();
            if (uptimeMillis - this.e < 250) {
                return;
            }
            this.e = uptimeMillis;
            f(str.concat(i10 == 0 ? "_TOUCH" : "_NON_TOUCH"), view, i3, i3, true);
        }
    }

    public final void f(String str, View view, int i3, int i10, boolean z10) {
        et0 et0Var;
        if (this.a) {
            long uptimeMillis = SystemClock.uptimeMillis();
            if (!z10) {
                if (uptimeMillis - this.d < 250) {
                    return;
                } else {
                    this.d = uptimeMillis;
                }
            }
            n61 n61Var = this.I;
            int i11 = 0;
            View view2 = null;
            View view3 = n61Var == null ? null : n61Var.getViewPages()[0];
            n61 n61Var2 = this.I;
            View view4 = n61Var2 == null ? null : n61Var2.getViewPages()[1];
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
            sb2.append(i3);
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
            sb2.append(k());
            sb2.append(" pin=");
            sb2.append(this.V);
            sb2.append(" tail=");
            sb2.append(this.b0);
            sb2.append(" alignPending=");
            sb2.append(this.h0);
            ct0 ct0Var = this.O;
            int i12 = -1;
            int c2 = ct0Var == null ? -1 : ct0Var.c();
            RecyclerView recyclerView = this.F;
            u4.o0 layoutManager = recyclerView == null ? null : recyclerView.getLayoutManager();
            if (layoutManager != null && c2 != -1) {
                view2 = layoutManager.m(c2);
            }
            StringBuilder m10 = k2.p1.m(c2, " row=", " anchor=");
            m10.append(h(view2));
            m10.append(" anchorTop=");
            m10.append(view2 == null ? 0 : view2.getTop());
            m10.append(" anchorHeight=");
            m10.append(view2 == null ? 0 : view2.getHeight());
            m10.append(" decoratedTop=");
            if (view2 != null) {
                layoutManager.getClass();
                i11 = u4.o0.z(view2);
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
            m10.append((recyclerView2 == null || (et0Var = this.P) == null) ? 0.0f : et0Var.i(recyclerView2));
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
        gt0 gt0Var;
        if (this.a) {
            gt0Var = this;
            gt0Var.f("TRANSITION_END_".concat(str), null, 0, 0, true);
        } else {
            gt0Var = this;
        }
        gt0Var.e0 = false;
        gt0Var.M = null;
        gt0Var.L = null;
        gt0Var.w.invalidate();
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

    public final float k() {
        View m10;
        RecyclerView recyclerView = this.F;
        if (recyclerView == null || this.O == null || recyclerView.getLayoutManager() == null) {
            return Float.POSITIVE_INFINITY;
        }
        u4.o0 layoutManager = this.F.getLayoutManager();
        int c2 = this.O.c();
        if (c2 == -1 || (m10 = layoutManager.m(c2)) == null) {
            return Float.POSITIVE_INFINITY;
        }
        return (u4.o0.z(m10) + this.F.getTop()) - ((ViewGroup.MarginLayoutParams) ((u4.p0) m10.getLayoutParams())).topMargin;
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x00e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l() {
        n61 n61Var;
        gt0 gt0Var;
        View view;
        if (this.d0 || (n61Var = this.I) == null || this.P == null || this.N == null) {
            return;
        }
        View[] viewPages = n61Var.getViewPages();
        boolean z10 = false;
        View view2 = viewPages[0];
        View view3 = viewPages[1];
        n61 n61Var2 = this.I;
        if (n61Var2 instanceof vj0) {
            vj0 vj0Var = (vj0) n61Var2;
            if (view2 != null && view3 != null && view2 == vj0Var.b0 && view3 == vj0Var.c0 && !vj0Var.I && view2.getTranslationX() == 0.0f && view2.getMeasuredWidth() > 0 && Math.abs(view3.getTranslationX()) >= view2.getMeasuredWidth()) {
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
        ai.o2 o2Var = this.w;
        uj0 uj0Var = this.E;
        if (!z11 && !z10 && view2 != null && view3 != null) {
            float k10 = k();
            if (!Float.isInfinite(k10)) {
                C();
                A();
                this.L = view2;
                this.M = view3;
                float f10 = this.V;
                if (k10 <= 0.5f + f10) {
                    k10 = f10;
                }
                et0 et0Var = this.P;
                uj0Var.a(k10, et0Var.i(et0Var.m(view2)), this.V, this.W);
                this.e0 = true;
                if (this.a) {
                    this.r++;
                    long uptimeMillis = SystemClock.uptimeMillis();
                    this.f = uptimeMillis;
                    this.h = uptimeMillis;
                    this.e = 0L;
                    gt0Var = this;
                    gt0Var.f("TRANSITION_BEGIN", view2, 0, 0, true);
                } else {
                    gt0Var = this;
                }
                o2Var.invalidate();
                if (gt0Var.e0) {
                    float max = Math.max(1, gt0Var.L.getWidth());
                    float f11 = uj0Var.e;
                    float max2 = Math.max(0.0f, Math.min(1.0f, Math.abs(gt0Var.L.getTranslationX()) / max));
                    uj0Var.e = max2;
                    if (f11 != max2) {
                        o2Var.invalidate();
                        if (gt0Var.a) {
                            gt0Var.h = SystemClock.uptimeMillis();
                        }
                    }
                }
                B();
            }
        }
        gt0Var = this;
        if (gt0Var.e0) {
        }
        B();
    }

    @Override // r0.k
    public final void m(int i3, View view) {
        f(i3 == 0 ? "NESTED_STOP_TOUCH" : "NESTED_STOP_NON_TOUCH", view, 0, 0, true);
        d2.t0 t0Var = this.x;
        if (i3 == 1) {
            t0Var.b = 0;
        } else {
            t0Var.a = 0;
        }
    }

    @Override // r0.l
    public final void n(View view, int i3, int i10, int i11, int i12, int i13, int[] iArr) {
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
            nh nhVar = this.j0;
            int i14 = 0;
            boolean z10 = view == recyclerView;
            if (z10 && i10 > 0 && i12 > 0) {
                gt0 gt0Var = (gt0) nhVar.b;
                ct0 ct0Var = gt0Var.O;
                if (ct0Var != null && ct0Var.c() != -1) {
                    i14 = gt0Var.r(gt0Var.G, i12);
                }
            } else if (!z10 && i12 < 0) {
                gt0 gt0Var2 = (gt0) nhVar.b;
                i14 = gt0Var2.r(gt0Var2.F, i12);
            }
            iArr[1] = iArr[1] + i14;
            f("POST", view, i12, i14, false);
        } finally {
            this.Q = null;
            B();
        }
    }

    @Override // r0.k
    public final void o(View view, int i3, int i10, int i11, int i12, int i13) {
        int[] iArr = this.y;
        iArr[1] = 0;
        iArr[0] = 0;
        n(view, i3, i10, i11, i12, i13, iArr);
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
    public final void onNestedPreScroll(View view, int i3, int i10, int[] iArr) {
        t(view, i3, i10, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i3, int i10, int i11, int i12) {
        o(view, i3, i10, i11, i12, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i3) {
        s(view, view2, i3, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i3) {
        return p(view, view2, i3, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        m(0, view);
    }

    @Override // r0.k
    public final boolean p(View view, View view2, int i3, int i10) {
        boolean z10 = false;
        boolean z11 = (i3 & 2) != 0;
        if (this.R == 0 && z11 && (view2 == this.F || view2 == this.G)) {
            z10 = true;
        }
        if (this.a) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(z10 ? "NESTED_START" : "NESTED_REJECT");
            sb2.append("_axes=");
            sb2.append(i3);
            sb2.append("_type=");
            sb2.append(i10);
            f(sb2.toString(), view2, 0, 0, true);
        }
        return z10;
    }

    public final void q() {
        n61 n61Var = this.I;
        RecyclerView m10 = (n61Var == null || this.P == null || n61Var.getCurrentView() == null) ? null : this.P.m(this.I.getCurrentView());
        if (m10 == this.G) {
            return;
        }
        f("ACTIVE_CHANGE", m10, 0, 0, true);
        RecyclerView recyclerView = this.G;
        ji jiVar = this.k0;
        if (recyclerView != null) {
            recyclerView.C0();
            ArrayList arrayList = this.G.x0;
            if (arrayList != null) {
                arrayList.remove(jiVar);
            }
        }
        this.G = m10;
        if (m10 != null) {
            m10.j(jiVar);
        }
    }

    public final int r(RecyclerView recyclerView, int i3) {
        if (recyclerView == null || i3 == 0) {
            if (i3 != 0) {
                f("TRANSFER_NO_TARGET", recyclerView, i3, 0, false);
            }
            return 0;
        }
        if (recyclerView == this.Q) {
            f("TRANSFER_REENTRY", recyclerView, i3, 0, true);
            throw new IllegalStateException("Reentrant scrollBy on nested source");
        }
        RecyclerView recyclerView2 = this.H;
        int i10 = this.S;
        this.H = recyclerView;
        this.S = 0;
        this.R++;
        try {
            recyclerView.scrollBy(0, i3);
            int i11 = this.S;
            int max = i3 > 0 ? Math.max(0, Math.min(i3, i11)) : Math.min(0, Math.max(i3, i11));
            f(i11 == 0 ? "TRANSFER_ZERO" : "TRANSFER", recyclerView, i3, max, false);
            return max;
        } finally {
            this.R--;
            this.H = recyclerView2;
            this.S = i10;
        }
    }

    @Override // r0.k
    public final void s(View view, View view2, int i3, int i10) {
        d2.t0 t0Var = this.x;
        if (i10 == 1) {
            t0Var.b = i3;
        } else {
            t0Var.a = i3;
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

    public void setGeometry(dt0 dt0Var) {
        this.N = dt0Var;
        requestLayout();
        B();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0043, code lost:
    
        if (r9 <= 0.5f) goto L22;
     */
    @Override // r0.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(View view, int i3, int i10, int[] iArr, int i11) {
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
            nh nhVar = this.j0;
            int i12 = 0;
            if (view == recyclerView) {
                if (i10 >= 0) {
                    gt0 gt0Var = (gt0) nhVar.b;
                    float k10 = gt0Var.k();
                    if (!Float.isInfinite(k10)) {
                        k10 = Math.max(0.0f, k10 - gt0Var.V);
                    }
                }
                gt0 gt0Var2 = (gt0) nhVar.b;
                ct0 ct0Var = gt0Var2.O;
                if (ct0Var != null && ct0Var.c() != -1) {
                    i12 = gt0Var2.r(gt0Var2.G, i10);
                }
            } else if (i10 > 0) {
                gt0 gt0Var3 = (gt0) nhVar.b;
                float k11 = gt0Var3.k();
                if (!Float.isInfinite(k11)) {
                    k11 = Math.max(0.0f, k11 - gt0Var3.V);
                }
                int min = Float.isInfinite(k11) ? i10 : Math.min(i10, Math.max(0, Math.round(k11)));
                gt0 gt0Var4 = (gt0) nhVar.b;
                i12 = gt0Var4.r(gt0Var4.F, min);
            }
            iArr[1] = iArr[1] + i12;
            f("PRE", view, i10, i12, false);
        } finally {
            this.Q = null;
            B();
        }
    }

    public final void u(tj0 tj0Var, ct0 ct0Var) {
        RecyclerView recyclerView = this.F;
        ai.o2 o2Var = this.w;
        ji jiVar = this.k0;
        if (recyclerView != null) {
            recyclerView.C0();
            ArrayList arrayList = this.F.x0;
            if (arrayList != null) {
                arrayList.remove(jiVar);
            }
            o2Var.removeView(this.F);
        }
        this.F = tj0Var;
        this.O = ct0Var;
        o2Var.addView(tj0Var, new FrameLayout.LayoutParams(-1, -1));
        tj0Var.j(jiVar);
        tj0Var.setNestedScrollingEnabled(true);
        B();
    }

    public final void w(View view, float f10) {
        if (view == null) {
            return;
        }
        this.P.m(view).setTranslationY((f10 + this.V) - Math.round(r0));
    }

    public final void x(View view, n61 n61Var, et0 et0Var) {
        View view2 = this.J;
        if (view2 != null) {
            removeView(view2);
        }
        this.J = view;
        this.I = n61Var;
        this.P = et0Var;
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

    public final void z(int i3, int i10) {
        this.T = Math.max(0, i3);
        this.U = Math.max(0, i10);
        requestLayout();
        B();
    }
}
