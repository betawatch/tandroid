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

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public class ht0 extends FrameLayout implements r0.l {
    public static final /* synthetic */ int l0 = 0;
    public final qj0 D;
    public RecyclerView E;
    public RecyclerView F;
    public RecyclerView G;
    public v61 H;
    public View I;
    public View J;
    public View K;
    public View L;
    public et0 M;
    public dt0 N;
    public ft0 O;
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
    public final vy i0;
    public final ui j0;
    public final rk k0;
    public int n;
    public int r;
    public final RectF s;
    public final bi.e5 w;
    public final e2.r0 x;
    public final int[] y;

    public ht0(Context context) {
        super(context);
        this.s = new RectF();
        this.x = new e2.r0();
        this.y = new int[2];
        this.D = new qj0();
        this.i0 = new vy(this, 5);
        this.j0 = new ui(this, 16);
        this.k0 = new rk(3, this);
        setClipChildren(false);
        setClipToPadding(false);
        bi.e5 e5Var = new bi.e5(this, context);
        this.w = e5Var;
        addView(e5Var, new FrameLayout.LayoutParams(-1, -1));
    }

    public static String h(View view) {
        if (view == null) {
            return "null";
        }
        String str = view.getClass().getSimpleName() + "@" + Integer.toHexString(System.identityHashCode(view)) + "(x=" + view.getTranslationX() + ",y=" + view.getTranslationY() + ",w=" + view.getWidth() + ",visibility=" + view.getVisibility() + ",attached=" + view.isAttachedToWindow() + ",top=" + view.getTop() + ",height=" + view.getHeight() + ",layoutRequested=" + view.isLayoutRequested();
        if (view instanceof RecyclerView) {
            RecyclerView recyclerView = (RecyclerView) view;
            StringBuilder j3 = rf.b.j(str, ",scrollState=");
            j3.append(recyclerView.getScrollState());
            j3.append(",up=");
            j3.append(recyclerView.canScrollVertically(-1));
            j3.append(",down=");
            j3.append(recyclerView.canScrollVertically(1));
            j3.append(",layout=");
            j3.append(recyclerView.c0());
            j3.append(",pendingUpdates=");
            j3.append(recyclerView.Z());
            j3.append(",animating=");
            j3.append(recyclerView.b0());
            j3.append(",paddingTop=");
            j3.append(recyclerView.getPaddingTop());
            j3.append(",count=");
            j3.append(recyclerView.getAdapter() == null ? 0 : recyclerView.getAdapter().b());
            str = j3.toString();
        }
        return rf.b.r(str, ")");
    }

    private void setBleed(RecyclerView recyclerView) {
        ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            int i7 = marginLayoutParams.topMargin;
            int i10 = this.S;
            if (i7 == (-i10) && marginLayoutParams.bottomMargin == (-this.T)) {
                return;
            }
            marginLayoutParams.topMargin = -i10;
            marginLayoutParams.bottomMargin = -this.T;
            recyclerView.setLayoutParams(marginLayoutParams);
        }
    }

    private void setTabsPinned(boolean z9) {
        if (this.e0 == z9) {
            return;
        }
        this.e0 = z9;
        f(z9 ? "TABS_PINNED" : "TABS_UNPINNED", this.E, 0, 0, true);
        this.M.F(z9);
    }

    public static void v(RecyclerView recyclerView, int i7, int i10) {
        int b10;
        if (recyclerView.getPaddingTop() == i7 && recyclerView.getPaddingBottom() == i10) {
            return;
        }
        v4.n0 layoutManager = recyclerView.getLayoutManager();
        int i11 = 0;
        View q10 = (layoutManager == null || layoutManager.r() == 0) ? null : layoutManager.q(0);
        if (q10 == null) {
            b10 = -1;
        } else {
            layoutManager.getClass();
            b10 = ((v4.o0) q10.getLayoutParams()).b();
        }
        if (q10 != null) {
            layoutManager.getClass();
            i11 = (v4.n0.z(q10) - recyclerView.getPaddingTop()) - ((ViewGroup.MarginLayoutParams) ((v4.o0) q10.getLayoutParams())).topMargin;
        }
        recyclerView.setPadding(recyclerView.getPaddingLeft(), i7, recyclerView.getPaddingRight(), i10);
        if (b10 == -1 || !(layoutManager instanceof v4.b0)) {
            return;
        }
        ((v4.b0) layoutManager).h1(b10, i11);
    }

    public final void A() {
        f("STOP_SCROLLING", null, 0, 0, true);
        RecyclerView recyclerView = this.E;
        if (recyclerView != null) {
            recyclerView.C0();
        }
        v61 v61Var = this.H;
        if (v61Var == null || this.O == null) {
            return;
        }
        for (View view : v61Var.getViewPages()) {
            if (view != null) {
                this.O.l(view).C0();
            }
        }
    }

    public final void B() {
        qj0 qj0Var = this.D;
        if (this.c0 || this.M == null) {
            return;
        }
        boolean z9 = true;
        this.c0 = true;
        try {
            float f10 = this.a0;
            C();
            RecyclerView recyclerView = this.E;
            if (recyclerView != null && !this.h0) {
                setBleed(recyclerView);
                RecyclerView recyclerView2 = this.E;
                int i7 = this.S;
                this.M.getClass();
                v(recyclerView2, i7, this.T);
            }
            v61 v61Var = this.H;
            if (v61Var != null && this.O != null && this.J != null) {
                for (View view : v61Var.getViewPages()) {
                    if (view != null && view.getParent() == this.H) {
                        b(this.O.l(view));
                    }
                }
                q();
                float n10 = n();
                boolean isInfinite = Float.isInfinite(n10);
                bi.e5 e5Var = this.w;
                float f11 = 0.0f;
                if (isInfinite) {
                    this.a0 = Float.POSITIVE_INFINITY;
                    this.I.setVisibility(4);
                    this.J.setVisibility(4);
                    RecyclerView recyclerView3 = this.E;
                    if (recyclerView3 != null) {
                        recyclerView3.setTranslationY(0.0f);
                    }
                    setTabsPinned(false);
                    if (f10 != this.a0) {
                        e5Var.invalidate();
                    }
                    this.c0 = false;
                    return;
                }
                float f12 = this.U;
                if (n10 > f12 + 0.5f) {
                    f12 = n10;
                }
                this.W = f12;
                this.I.setVisibility(0);
                this.J.setVisibility(0);
                if (this.d0) {
                    this.a0 = qj0Var.b();
                    this.b0 = Math.max(qj0Var.d, qj0Var.b());
                    View view2 = this.K;
                    float max = Math.max(0.0f, qj0Var.a - qj0Var.d);
                    if (!qj0Var.f) {
                        f11 = qj0Var.b() - qj0Var.b;
                    }
                    w(view2, max + f11);
                    w(this.L, Math.max(qj0Var.d, qj0Var.b()) - qj0Var.d);
                } else {
                    RecyclerView recyclerView4 = this.F;
                    float max2 = this.W - Math.max(0.0f, Math.min(recyclerView4 == null ? 0.0f : this.O.h(recyclerView4), Math.max(0.0f, this.U - this.V)));
                    this.a0 = max2;
                    this.b0 = Math.max(this.U, max2);
                    w(this.H.getCurrentView(), Math.max(0.0f, this.W - this.U));
                }
                this.E.setTranslationY(this.a0 - n10);
                this.J.setTranslationY(this.b0 - r0.getTop());
                if (this.b0 > this.U + 0.5f) {
                    z9 = false;
                }
                setTabsPinned(z9);
                this.M.getClass();
                if (f10 != this.a0) {
                    e5Var.invalidate();
                }
                this.c0 = false;
            }
        } finally {
            this.c0 = false;
        }
    }

    public final void C() {
        et0 et0Var = this.M;
        if (et0Var == null) {
            return;
        }
        float Y0 = et0Var.Y0();
        this.M.getClass();
        if (Float.isNaN(Y0) || Float.isInfinite(Y0) || Float.isNaN(0.0f) || Float.isInfinite(0.0f) || Y0 < 0.0f) {
            throw new IllegalArgumentException("Require finite 0 <= commonHiddenTop <= tabsPinnedTop");
        }
        if (this.f0 && (Y0 != this.U || 0.0f != this.V)) {
            float n10 = n();
            if (!Float.isInfinite(n10)) {
                float f10 = this.U;
                boolean z9 = n10 <= 0.5f + f10 || n10 < Y0;
                if (z9 && Y0 != f10) {
                    this.g0 = true;
                }
                if (this.d0) {
                    qj0 qj0Var = this.D;
                    float f11 = qj0Var.e;
                    if (z9) {
                        n10 = Y0;
                    }
                    ft0 ft0Var = this.O;
                    qj0Var.a(n10, ft0Var.h(ft0Var.l(this.K)), Y0, 0.0f);
                    qj0Var.e = Math.max(0.0f, Math.min(1.0f, f11));
                    this.w.invalidate();
                }
            }
        }
        this.U = Y0;
        this.V = 0.0f;
        this.f0 = true;
    }

    public final void a() {
        dt0 dt0Var;
        f("ALIGN_BOUNDARY", this.E, 0, 0, true);
        if (this.E == null || (dt0Var = this.N) == null || this.M == null) {
            return;
        }
        int b10 = dt0Var.b();
        v4.n0 layoutManager = this.E.getLayoutManager();
        if (b10 == -1 || !(layoutManager instanceof v4.b0)) {
            return;
        }
        C();
        ((v4.b0) layoutManager).h1(b10, (Math.round(this.U) - this.E.getTop()) - this.E.getPaddingTop());
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
        v(recyclerView, Math.max(0, height) + Math.round(this.U) + this.S, this.M.e1() + this.T);
        if (recyclerView.isNestedScrollingEnabled()) {
            return;
        }
        recyclerView.setNestedScrollingEnabled(true);
    }

    public final boolean c() {
        v61 v61Var = this.H;
        return (v61Var == null || v61Var.getCurrentView() == null || Float.isInfinite(n()) || this.b0 >= ((float) getHeight())) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x005a, code lost:
    
        if (r5.D.f != false) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(Canvas canvas, RectF rectF, gt0 gt0Var) {
        if (this.H != null && this.O != null && this.I.getVisibility() == 0 && this.H.getVisibility() == 0) {
            for (View view : this.H.getViewPages()) {
                if (view != null && view.getParent() == this.H && view.getVisibility() == 0) {
                    gt0Var.a(canvas, rectF, this.O.l(view));
                }
            }
        }
        RecyclerView recyclerView = this.E;
        if (recyclerView == null || recyclerView.getVisibility() != 0) {
            return;
        }
        float x10 = this.d0 ? this.L.getX() : 0.0f;
        if (x10 == 0.0f) {
            gt0Var.a(canvas, rectF, this.E);
            return;
        }
        RectF rectF2 = this.s;
        rectF2.set(rectF);
        rectF2.offset(-x10, 0.0f);
        int save = canvas.save();
        try {
            canvas.translate(x10, 0.0f);
            gt0Var.a(canvas, rectF2, this.E);
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

    public final void f(String str, View view, int i7, int i10, boolean z9) {
        ft0 ft0Var;
        if (this.a) {
            long uptimeMillis = SystemClock.uptimeMillis();
            if (!z9) {
                if (uptimeMillis - this.d < 250) {
                    return;
                } else {
                    this.d = uptimeMillis;
                }
            }
            v61 v61Var = this.H;
            int i11 = 0;
            View view2 = null;
            View view3 = v61Var == null ? null : v61Var.getViewPages()[0];
            v61 v61Var2 = this.H;
            View view4 = v61Var2 == null ? null : v61Var2.getViewPages()[1];
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
            sb2.append(n());
            sb2.append(" pin=");
            sb2.append(this.U);
            sb2.append(" tail=");
            sb2.append(this.a0);
            sb2.append(" alignPending=");
            sb2.append(this.g0);
            dt0 dt0Var = this.N;
            int i12 = -1;
            int b10 = dt0Var == null ? -1 : dt0Var.b();
            RecyclerView recyclerView = this.E;
            v4.n0 layoutManager = recyclerView == null ? null : recyclerView.getLayoutManager();
            if (layoutManager != null && b10 != -1) {
                view2 = layoutManager.m(b10);
            }
            StringBuilder n10 = jg.g.n(b10, " row=", " anchor=");
            n10.append(h(view2));
            n10.append(" anchorTop=");
            n10.append(view2 == null ? 0 : view2.getTop());
            n10.append(" anchorHeight=");
            n10.append(view2 == null ? 0 : view2.getHeight());
            n10.append(" decoratedTop=");
            if (view2 != null) {
                layoutManager.getClass();
                i11 = v4.n0.z(view2);
            }
            n10.append(i11);
            n10.append(" adapterPosition=");
            if (view2 != null) {
                this.E.getClass();
                i12 = RecyclerView.R(view2);
            }
            n10.append(i12);
            n10.append(" pageOffset=");
            RecyclerView recyclerView2 = this.F;
            n10.append((recyclerView2 == null || (ft0Var = this.O) == null) ? 0.0f : ft0Var.h(recyclerView2));
            n10.append(" tabsTop=");
            n10.append(this.b0);
            n10.append(" draw=");
            n10.append(this.c);
            sb2.append(n10.toString());
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
        ht0 ht0Var;
        if (this.a) {
            ht0Var = this;
            ht0Var.f("TRANSITION_END_".concat(str), null, 0, 0, true);
        } else {
            ht0Var = this;
        }
        ht0Var.d0 = false;
        ht0Var.L = null;
        ht0Var.K = null;
        ht0Var.w.invalidate();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000f, code lost:
    
        if (r3.D.f != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean j(float f10, float f11) {
        float f12;
        if (this.d0) {
            f12 = this.L.getX();
        }
        f12 = 0.0f;
        return f11 >= 0.0f && f11 < this.a0 && f10 >= Math.max(0.0f, f12) && f10 < Math.min((float) getWidth(), f12 + ((float) getWidth()));
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
        if (this.Q != 0 || (view != (recyclerView = this.E) && view != this.F)) {
            f("POST_IGNORED", view, i12, 0, false);
            return;
        }
        if (this.d0) {
            e("POST_BLOCKED", view, i12, i13);
            iArr[1] = iArr[1] + i12;
            return;
        }
        this.P = view;
        try {
            vy vyVar = this.i0;
            int i14 = 0;
            boolean z9 = view == recyclerView;
            if (z9 && i10 > 0 && i12 > 0) {
                ht0 ht0Var = (ht0) vyVar.b;
                dt0 dt0Var = ht0Var.N;
                if (dt0Var != null && dt0Var.b() != -1) {
                    i14 = ht0Var.t(ht0Var.F, i12);
                }
            } else if (!z9 && i12 < 0) {
                ht0 ht0Var2 = (ht0) vyVar.b;
                i14 = ht0Var2.t(ht0Var2.E, i12);
            }
            iArr[1] = iArr[1] + i14;
            f("POST", view, i12, i14, false);
        } finally {
            this.P = null;
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
        RecyclerView recyclerView = this.E;
        if (recyclerView == null || this.N == null || recyclerView.getLayoutManager() == null) {
            return Float.POSITIVE_INFINITY;
        }
        v4.n0 layoutManager = this.E.getLayoutManager();
        int b10 = this.N.b();
        if (b10 == -1 || (m10 = layoutManager.m(b10)) == null) {
            return Float.POSITIVE_INFINITY;
        }
        return (v4.n0.z(m10) + this.E.getTop()) - ((ViewGroup.MarginLayoutParams) ((v4.o0) m10.getLayoutParams())).topMargin;
    }

    @Override // r0.k
    public final boolean o(View view, View view2, int i7, int i10) {
        boolean z9 = false;
        boolean z10 = (i7 & 2) != 0;
        if (this.Q == 0 && z10 && (view2 == this.E || view2 == this.F)) {
            z9 = true;
        }
        if (this.a) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(z9 ? "NESTED_START" : "NESTED_REJECT");
            sb2.append("_axes=");
            sb2.append(i7);
            sb2.append("_type=");
            sb2.append(i10);
            f(sb2.toString(), view2, 0, 0, true);
        }
        return z9;
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
    public final boolean onNestedFling(View view, float f10, float f11, boolean z9) {
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
        v61 v61Var;
        ht0 ht0Var;
        View view;
        if (this.c0 || (v61Var = this.H) == null || this.O == null || this.M == null) {
            return;
        }
        View[] viewPages = v61Var.getViewPages();
        boolean z9 = false;
        View view2 = viewPages[0];
        View view3 = viewPages[1];
        v61 v61Var2 = this.H;
        if (v61Var2 instanceof rj0) {
            rj0 rj0Var = (rj0) v61Var2;
            if (view2 != null && view3 != null && view2 == rj0Var.a0 && view3 == rj0Var.b0 && !rj0Var.H && view2.getTranslationX() == 0.0f && view2.getMeasuredWidth() > 0 && Math.abs(view3.getTranslationX()) >= view2.getMeasuredWidth()) {
                z9 = true;
            }
        }
        if (this.d0 && z9) {
            i("drag_aborted");
        }
        if (this.d0 && (view3 == null || ((view2 != (view = this.K) && view2 != this.L) || (view3 != view && view3 != this.L)))) {
            i("page_slots_changed");
        }
        q();
        boolean z10 = this.d0;
        bi.e5 e5Var = this.w;
        qj0 qj0Var = this.D;
        if (!z10 && !z9 && view2 != null && view3 != null) {
            float n10 = n();
            if (!Float.isInfinite(n10)) {
                C();
                A();
                this.K = view2;
                this.L = view3;
                float f10 = this.U;
                if (n10 <= 0.5f + f10) {
                    n10 = f10;
                }
                ft0 ft0Var = this.O;
                qj0Var.a(n10, ft0Var.h(ft0Var.l(view2)), this.U, this.V);
                this.d0 = true;
                if (this.a) {
                    this.r++;
                    long uptimeMillis = SystemClock.uptimeMillis();
                    this.f = uptimeMillis;
                    this.h = uptimeMillis;
                    this.e = 0L;
                    ht0Var = this;
                    ht0Var.f("TRANSITION_BEGIN", view2, 0, 0, true);
                } else {
                    ht0Var = this;
                }
                e5Var.invalidate();
                if (ht0Var.d0) {
                    float max = Math.max(1, ht0Var.K.getWidth());
                    float f11 = qj0Var.e;
                    float max2 = Math.max(0.0f, Math.min(1.0f, Math.abs(ht0Var.K.getTranslationX()) / max));
                    qj0Var.e = max2;
                    if (f11 != max2) {
                        e5Var.invalidate();
                        if (ht0Var.a) {
                            ht0Var.h = SystemClock.uptimeMillis();
                        }
                    }
                }
                B();
            }
        }
        ht0Var = this;
        if (ht0Var.d0) {
        }
        B();
    }

    public final void q() {
        v61 v61Var = this.H;
        RecyclerView l10 = (v61Var == null || this.O == null || v61Var.getCurrentView() == null) ? null : this.O.l(this.H.getCurrentView());
        if (l10 == this.F) {
            return;
        }
        f("ACTIVE_CHANGE", l10, 0, 0, true);
        RecyclerView recyclerView = this.F;
        ui uiVar = this.j0;
        if (recyclerView != null) {
            recyclerView.C0();
            ArrayList arrayList = this.F.w0;
            if (arrayList != null) {
                arrayList.remove(uiVar);
            }
        }
        this.F = l10;
        if (l10 != null) {
            l10.j(uiVar);
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
        if (this.Q != 0 || (view != (recyclerView = this.E) && view != this.F)) {
            f("PRE_IGNORED", view, i10, 0, false);
            return;
        }
        if (this.d0) {
            e("PRE_BLOCKED", view, i10, i11);
            iArr[1] = iArr[1] + i10;
            return;
        }
        this.P = view;
        try {
            vy vyVar = this.i0;
            int i12 = 0;
            if (view == recyclerView) {
                if (i10 >= 0) {
                    ht0 ht0Var = (ht0) vyVar.b;
                    float n10 = ht0Var.n();
                    if (!Float.isInfinite(n10)) {
                        n10 = Math.max(0.0f, n10 - ht0Var.U);
                    }
                }
                ht0 ht0Var2 = (ht0) vyVar.b;
                dt0 dt0Var = ht0Var2.N;
                if (dt0Var != null && dt0Var.b() != -1) {
                    i12 = ht0Var2.t(ht0Var2.F, i10);
                }
            } else if (i10 > 0) {
                ht0 ht0Var3 = (ht0) vyVar.b;
                float n11 = ht0Var3.n();
                if (!Float.isInfinite(n11)) {
                    n11 = Math.max(0.0f, n11 - ht0Var3.U);
                }
                int min = Float.isInfinite(n11) ? i10 : Math.min(i10, Math.max(0, Math.round(n11)));
                ht0 ht0Var4 = (ht0) vyVar.b;
                i12 = ht0Var4.t(ht0Var4.E, min);
            }
            iArr[1] = iArr[1] + i12;
            f("PRE", view, i10, i12, false);
        } finally {
            this.P = null;
            B();
        }
    }

    public void setCommonInsetsManagedExternally(boolean z9) {
        if (this.h0 == z9) {
            return;
        }
        this.h0 = z9;
        B();
        requestLayout();
    }

    public void setDebugLoggingEnabled(boolean z9) {
        this.a = z9;
        if (z9) {
            this.d = 0L;
            this.e = 0L;
            long uptimeMillis = SystemClock.uptimeMillis();
            this.f = uptimeMillis;
            this.h = uptimeMillis;
            f("DEBUG_ENABLED", null, 0, 0, true);
        }
    }

    public void setGeometry(et0 et0Var) {
        this.M = et0Var;
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
        if (recyclerView == this.P) {
            f("TRANSFER_REENTRY", recyclerView, i7, 0, true);
            throw new IllegalStateException("Reentrant scrollBy on nested source");
        }
        RecyclerView recyclerView2 = this.G;
        int i10 = this.R;
        this.G = recyclerView;
        this.R = 0;
        this.Q++;
        try {
            recyclerView.scrollBy(0, i7);
            int i11 = this.R;
            int max = i7 > 0 ? Math.max(0, Math.min(i7, i11)) : Math.min(0, Math.max(i7, i11));
            f(i11 == 0 ? "TRANSFER_ZERO" : "TRANSFER", recyclerView, i7, max, false);
            return max;
        } finally {
            this.Q--;
            this.G = recyclerView2;
            this.R = i10;
        }
    }

    public final void u(pj0 pj0Var, dt0 dt0Var) {
        RecyclerView recyclerView = this.E;
        bi.e5 e5Var = this.w;
        ui uiVar = this.j0;
        if (recyclerView != null) {
            recyclerView.C0();
            ArrayList arrayList = this.E.w0;
            if (arrayList != null) {
                arrayList.remove(uiVar);
            }
            e5Var.removeView(this.E);
        }
        this.E = pj0Var;
        this.N = dt0Var;
        e5Var.addView(pj0Var, new FrameLayout.LayoutParams(-1, -1));
        pj0Var.j(uiVar);
        pj0Var.setNestedScrollingEnabled(true);
        B();
    }

    public final void w(View view, float f10) {
        if (view == null) {
            return;
        }
        this.O.l(view).setTranslationY((f10 + this.U) - Math.round(r0));
    }

    public final void x(View view, v61 v61Var, ft0 ft0Var) {
        View view2 = this.I;
        if (view2 != null) {
            removeView(view2);
        }
        this.I = view;
        this.H = v61Var;
        this.O = ft0Var;
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

    public final void z(int i7, int i10) {
        this.S = Math.max(0, i7);
        this.T = Math.max(0, i10);
        requestLayout();
        B();
    }
}
