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
import org.telegram.messenger.BuildConfig;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public class lw0 extends FrameLayout implements r0.m {
    public static final /* synthetic */ int l0 = 0;
    public RecyclerView E;
    public RecyclerView F;
    public RecyclerView G;
    public u91 H;
    public View I;
    public View J;
    public View K;
    public View L;
    public iw0 M;
    public hw0 N;
    public jw0 O;
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
    public final li.e3 i0;
    public final ml j0;
    public final bu k0;
    public int n;
    public int r;
    public final RectF s;
    public final bh.r v;
    public final b2.v0 w;
    public final int[] x;
    public final nm0 y;

    public lw0(Context context) {
        super(context);
        this.s = new RectF();
        this.w = new b2.v0();
        this.x = new int[2];
        this.y = new nm0();
        this.i0 = new li.e3(this, 12);
        this.j0 = new ml(this, 14);
        this.k0 = new bu(2, this);
        setClipChildren(false);
        setClipToPadding(false);
        bh.r rVar = new bh.r(this, context);
        this.v = rVar;
        addView(rVar, new FrameLayout.LayoutParams(-1, -1));
    }

    public static String h(View view) {
        if (view == null) {
            return BuildConfig.BETA_URL;
        }
        String str = view.getClass().getSimpleName() + "@" + Integer.toHexString(System.identityHashCode(view)) + "(x=" + view.getTranslationX() + ",y=" + view.getTranslationY() + ",w=" + view.getWidth() + ",visibility=" + view.getVisibility() + ",attached=" + view.isAttachedToWindow() + ",top=" + view.getTop() + ",height=" + view.getHeight() + ",layoutRequested=" + view.isLayoutRequested();
        if (view instanceof RecyclerView) {
            RecyclerView recyclerView = (RecyclerView) view;
            StringBuilder l4 = b10.l(str, ",scrollState=");
            l4.append(recyclerView.getScrollState());
            l4.append(",up=");
            l4.append(recyclerView.canScrollVertically(-1));
            l4.append(",down=");
            l4.append(recyclerView.canScrollVertically(1));
            l4.append(",layout=");
            l4.append(recyclerView.c0());
            l4.append(",pendingUpdates=");
            l4.append(recyclerView.Z());
            l4.append(",animating=");
            l4.append(recyclerView.b0());
            l4.append(",paddingTop=");
            l4.append(recyclerView.getPaddingTop());
            l4.append(",count=");
            l4.append(recyclerView.getAdapter() == null ? 0 : recyclerView.getAdapter().h());
            str = l4.toString();
        }
        return b10.u(str, ")");
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
        this.M.B(z10);
    }

    public static void v(RecyclerView recyclerView, int i10, int i11) {
        int b10;
        if (recyclerView.getPaddingTop() == i10 && recyclerView.getPaddingBottom() == i11) {
            return;
        }
        s4.p0 layoutManager = recyclerView.getLayoutManager();
        int i12 = 0;
        View q5 = (layoutManager == null || layoutManager.r() == 0) ? null : layoutManager.q(0);
        if (q5 == null) {
            b10 = -1;
        } else {
            layoutManager.getClass();
            b10 = ((s4.q0) q5.getLayoutParams()).b();
        }
        if (q5 != null) {
            layoutManager.getClass();
            i12 = (s4.p0.z(q5) - recyclerView.getPaddingTop()) - ((ViewGroup.MarginLayoutParams) ((s4.q0) q5.getLayoutParams())).topMargin;
        }
        recyclerView.setPadding(recyclerView.getPaddingLeft(), i10, recyclerView.getPaddingRight(), i11);
        if (b10 == -1 || !(layoutManager instanceof s4.c0)) {
            return;
        }
        ((s4.c0) layoutManager).h1(b10, i12);
    }

    public final void A() {
        f("STOP_SCROLLING", null, 0, 0, true);
        RecyclerView recyclerView = this.E;
        if (recyclerView != null) {
            recyclerView.C0();
        }
        u91 u91Var = this.H;
        if (u91Var == null || this.O == null) {
            return;
        }
        for (View view : u91Var.getViewPages()) {
            if (view != null) {
                this.O.i(view).C0();
            }
        }
    }

    public final void B() {
        nm0 nm0Var = this.y;
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
            u91 u91Var = this.H;
            if (u91Var != null && this.O != null && this.J != null) {
                for (View view : u91Var.getViewPages()) {
                    if (view != null && view.getParent() == this.H) {
                        b(this.O.i(view));
                    }
                }
                q();
                float k10 = k();
                boolean isInfinite = Float.isInfinite(k10);
                bh.r rVar = this.v;
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
                        rVar.invalidate();
                    }
                    this.c0 = false;
                    return;
                }
                float f11 = this.U;
                if (k10 > f11 + 0.5f) {
                    f11 = k10;
                }
                this.W = f11;
                this.I.setVisibility(0);
                this.J.setVisibility(0);
                if (this.d0) {
                    this.a0 = nm0Var.b();
                    this.b0 = Math.max(nm0Var.d, nm0Var.b());
                    View view2 = this.K;
                    float max = Math.max(0.0f, nm0Var.a - nm0Var.d);
                    if (!nm0Var.f) {
                        f10 = nm0Var.b() - nm0Var.b;
                    }
                    w(view2, max + f10);
                    w(this.L, Math.max(nm0Var.d, nm0Var.b()) - nm0Var.d);
                } else {
                    RecyclerView recyclerView4 = this.F;
                    float max2 = this.W - Math.max(0.0f, Math.min(recyclerView4 == null ? 0.0f : this.O.b(recyclerView4), Math.max(0.0f, this.U - this.V)));
                    this.a0 = max2;
                    this.b0 = Math.max(this.U, max2);
                    w(this.H.getCurrentView(), Math.max(0.0f, this.W - this.U));
                }
                this.E.setTranslationY(this.a0 - k10);
                this.J.setTranslationY(this.b0 - r0.getTop());
                if (this.b0 > this.U + 0.5f) {
                    z10 = false;
                }
                setTabsPinned(z10);
                this.M.getClass();
                if (f7 != this.a0) {
                    rVar.invalidate();
                }
                this.c0 = false;
            }
        } finally {
            this.c0 = false;
        }
    }

    public final void C() {
        iw0 iw0Var = this.M;
        if (iw0Var == null) {
            return;
        }
        float V0 = iw0Var.V0();
        this.M.getClass();
        if (Float.isNaN(V0) || Float.isInfinite(V0) || Float.isNaN(0.0f) || Float.isInfinite(0.0f) || V0 < 0.0f) {
            throw new IllegalArgumentException("Require finite 0 <= commonHiddenTop <= tabsPinnedTop");
        }
        if (this.f0 && (V0 != this.U || 0.0f != this.V)) {
            float k10 = k();
            if (!Float.isInfinite(k10)) {
                float f7 = this.U;
                boolean z10 = k10 <= 0.5f + f7 || k10 < V0;
                if (z10 && V0 != f7) {
                    this.g0 = true;
                }
                if (this.d0) {
                    nm0 nm0Var = this.y;
                    float f10 = nm0Var.e;
                    if (z10) {
                        k10 = V0;
                    }
                    jw0 jw0Var = this.O;
                    nm0Var.a(k10, jw0Var.b(jw0Var.i(this.K)), V0, 0.0f);
                    nm0Var.e = Math.max(0.0f, Math.min(1.0f, f10));
                    this.v.invalidate();
                }
            }
        }
        this.U = V0;
        this.V = 0.0f;
        this.f0 = true;
    }

    public final void a() {
        hw0 hw0Var;
        f("ALIGN_BOUNDARY", this.E, 0, 0, true);
        if (this.E == null || (hw0Var = this.N) == null || this.M == null) {
            return;
        }
        int c10 = hw0Var.c();
        s4.p0 layoutManager = this.E.getLayoutManager();
        if (c10 == -1 || !(layoutManager instanceof s4.c0)) {
            return;
        }
        C();
        ((s4.c0) layoutManager).h1(c10, (Math.round(this.U) - this.E.getTop()) - this.E.getPaddingTop());
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
        v(recyclerView, Math.max(0, height) + Math.round(this.U) + this.S, this.M.b1() + this.T);
        if (recyclerView.isNestedScrollingEnabled()) {
            return;
        }
        recyclerView.setNestedScrollingEnabled(true);
    }

    public final boolean c() {
        u91 u91Var = this.H;
        return (u91Var == null || u91Var.getCurrentView() == null || Float.isInfinite(k()) || this.b0 >= ((float) getHeight())) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x005a, code lost:
    
        if (r5.y.f != false) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(Canvas canvas, RectF rectF, kw0 kw0Var) {
        if (this.H != null && this.O != null && this.I.getVisibility() == 0 && this.H.getVisibility() == 0) {
            for (View view : this.H.getViewPages()) {
                if (view != null && view.getParent() == this.H && view.getVisibility() == 0) {
                    kw0Var.a(canvas, rectF, this.O.i(view));
                }
            }
        }
        RecyclerView recyclerView = this.E;
        if (recyclerView == null || recyclerView.getVisibility() != 0) {
            return;
        }
        float x9 = this.d0 ? this.L.getX() : 0.0f;
        if (x9 == 0.0f) {
            kw0Var.a(canvas, rectF, this.E);
            return;
        }
        RectF rectF2 = this.s;
        rectF2.set(rectF);
        rectF2.offset(-x9, 0.0f);
        int save = canvas.save();
        try {
            canvas.translate(x9, 0.0f);
            kw0Var.a(canvas, rectF2, this.E);
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
        jw0 jw0Var;
        if (this.a) {
            long uptimeMillis = SystemClock.uptimeMillis();
            if (!z10) {
                if (uptimeMillis - this.d < 250) {
                    return;
                } else {
                    this.d = uptimeMillis;
                }
            }
            u91 u91Var = this.H;
            int i12 = 0;
            View view2 = null;
            View view3 = u91Var == null ? null : u91Var.getViewPages()[0];
            u91 u91Var2 = this.H;
            View view4 = u91Var2 == null ? null : u91Var2.getViewPages()[1];
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
            sb2.append(this.y.e);
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
            sb2.append(k());
            sb2.append(" pin=");
            sb2.append(this.U);
            sb2.append(" tail=");
            sb2.append(this.a0);
            sb2.append(" alignPending=");
            sb2.append(this.g0);
            hw0 hw0Var = this.N;
            int i13 = -1;
            int c10 = hw0Var == null ? -1 : hw0Var.c();
            RecyclerView recyclerView = this.E;
            s4.p0 layoutManager = recyclerView == null ? null : recyclerView.getLayoutManager();
            if (layoutManager != null && c10 != -1) {
                view2 = layoutManager.m(c10);
            }
            StringBuilder k10 = ic.a.k(c10, " row=", " anchor=");
            k10.append(h(view2));
            k10.append(" anchorTop=");
            k10.append(view2 == null ? 0 : view2.getTop());
            k10.append(" anchorHeight=");
            k10.append(view2 == null ? 0 : view2.getHeight());
            k10.append(" decoratedTop=");
            if (view2 != null) {
                layoutManager.getClass();
                i12 = s4.p0.z(view2);
            }
            k10.append(i12);
            k10.append(" adapterPosition=");
            if (view2 != null) {
                this.E.getClass();
                i13 = RecyclerView.R(view2);
            }
            k10.append(i13);
            k10.append(" pageOffset=");
            RecyclerView recyclerView2 = this.F;
            k10.append((recyclerView2 == null || (jw0Var = this.O) == null) ? 0.0f : jw0Var.b(recyclerView2));
            k10.append(" tabsTop=");
            k10.append(this.b0);
            k10.append(" draw=");
            k10.append(this.c);
            sb2.append(k10.toString());
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
        return this.w.b();
    }

    public float getTabsTop() {
        return this.b0;
    }

    public int getTopBleed() {
        return this.S;
    }

    public final void i(String str) {
        lw0 lw0Var;
        if (this.a) {
            lw0Var = this;
            lw0Var.f("TRANSITION_END_".concat(str), null, 0, 0, true);
        } else {
            lw0Var = this;
        }
        lw0Var.d0 = false;
        lw0Var.L = null;
        lw0Var.K = null;
        lw0Var.v.invalidate();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000f, code lost:
    
        if (r3.y.f != false) goto L8;
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

    public final float k() {
        View m10;
        RecyclerView recyclerView = this.E;
        if (recyclerView == null || this.N == null || recyclerView.getLayoutManager() == null) {
            return Float.POSITIVE_INFINITY;
        }
        s4.p0 layoutManager = this.E.getLayoutManager();
        int c10 = this.N.c();
        if (c10 == -1 || (m10 = layoutManager.m(c10)) == null) {
            return Float.POSITIVE_INFINITY;
        }
        return (s4.p0.z(m10) + this.E.getTop()) - ((ViewGroup.MarginLayoutParams) ((s4.q0) m10.getLayoutParams())).topMargin;
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x00e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l() {
        u91 u91Var;
        lw0 lw0Var;
        View view;
        if (this.c0 || (u91Var = this.H) == null || this.O == null || this.M == null) {
            return;
        }
        View[] viewPages = u91Var.getViewPages();
        boolean z10 = false;
        View view2 = viewPages[0];
        View view3 = viewPages[1];
        u91 u91Var2 = this.H;
        if (u91Var2 instanceof om0) {
            om0 om0Var = (om0) u91Var2;
            if (view2 != null && view3 != null && view2 == om0Var.a0 && view3 == om0Var.b0 && !om0Var.H && view2.getTranslationX() == 0.0f && view2.getMeasuredWidth() > 0 && Math.abs(view3.getTranslationX()) >= view2.getMeasuredWidth()) {
                z10 = true;
            }
        }
        if (this.d0 && z10) {
            i("drag_aborted");
        }
        if (this.d0 && (view3 == null || ((view2 != (view = this.K) && view2 != this.L) || (view3 != view && view3 != this.L)))) {
            i("page_slots_changed");
        }
        q();
        boolean z11 = this.d0;
        bh.r rVar = this.v;
        nm0 nm0Var = this.y;
        if (!z11 && !z10 && view2 != null && view3 != null) {
            float k10 = k();
            if (!Float.isInfinite(k10)) {
                C();
                A();
                this.K = view2;
                this.L = view3;
                float f7 = this.U;
                if (k10 <= 0.5f + f7) {
                    k10 = f7;
                }
                jw0 jw0Var = this.O;
                nm0Var.a(k10, jw0Var.b(jw0Var.i(view2)), this.U, this.V);
                this.d0 = true;
                if (this.a) {
                    this.r++;
                    long uptimeMillis = SystemClock.uptimeMillis();
                    this.f = uptimeMillis;
                    this.h = uptimeMillis;
                    this.e = 0L;
                    lw0Var = this;
                    lw0Var.f("TRANSITION_BEGIN", view2, 0, 0, true);
                } else {
                    lw0Var = this;
                }
                rVar.invalidate();
                if (lw0Var.d0) {
                    float max = Math.max(1, lw0Var.K.getWidth());
                    float f10 = nm0Var.e;
                    float max2 = Math.max(0.0f, Math.min(1.0f, Math.abs(lw0Var.K.getTranslationX()) / max));
                    nm0Var.e = max2;
                    if (f10 != max2) {
                        rVar.invalidate();
                        if (lw0Var.a) {
                            lw0Var.h = SystemClock.uptimeMillis();
                        }
                    }
                }
                B();
            }
        }
        lw0Var = this;
        if (lw0Var.d0) {
        }
        B();
    }

    @Override // r0.l
    public final void m(int i10, View view) {
        f(i10 == 0 ? "NESTED_STOP_TOUCH" : "NESTED_STOP_NON_TOUCH", view, 0, 0, true);
        b2.v0 v0Var = this.w;
        if (i10 == 1) {
            v0Var.b = 0;
        } else {
            v0Var.a = 0;
        }
    }

    @Override // r0.m
    public final void n(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
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
            li.e3 e3Var = this.i0;
            int i15 = 0;
            boolean z10 = view == recyclerView;
            if (z10 && i11 > 0 && i13 > 0) {
                lw0 lw0Var = (lw0) e3Var.b;
                hw0 hw0Var = lw0Var.N;
                if (hw0Var != null && hw0Var.c() != -1) {
                    i15 = lw0Var.r(lw0Var.F, i13);
                }
            } else if (!z10 && i13 < 0) {
                lw0 lw0Var2 = (lw0) e3Var.b;
                i15 = lw0Var2.r(lw0Var2.E, i13);
            }
            iArr[1] = iArr[1] + i15;
            f("POST", view, i13, i15, false);
        } finally {
            this.P = null;
            B();
        }
    }

    @Override // r0.l
    public final void o(View view, int i10, int i11, int i12, int i13, int i14) {
        int[] iArr = this.x;
        iArr[1] = 0;
        iArr[0] = 0;
        n(view, i10, i11, i12, i13, i14, iArr);
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
        t(view, i10, i11, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        o(view, i10, i11, i12, i13, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i10) {
        s(view, view2, i10, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        return p(view, view2, i10, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        m(0, view);
    }

    @Override // r0.l
    public final boolean p(View view, View view2, int i10, int i11) {
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

    public final void q() {
        u91 u91Var = this.H;
        RecyclerView i10 = (u91Var == null || this.O == null || u91Var.getCurrentView() == null) ? null : this.O.i(this.H.getCurrentView());
        if (i10 == this.F) {
            return;
        }
        f("ACTIVE_CHANGE", i10, 0, 0, true);
        RecyclerView recyclerView = this.F;
        ml mlVar = this.j0;
        if (recyclerView != null) {
            recyclerView.C0();
            ArrayList arrayList = this.F.w0;
            if (arrayList != null) {
                arrayList.remove(mlVar);
            }
        }
        this.F = i10;
        if (i10 != null) {
            i10.j(mlVar);
        }
    }

    public final int r(RecyclerView recyclerView, int i10) {
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

    @Override // r0.l
    public final void s(View view, View view2, int i10, int i11) {
        b2.v0 v0Var = this.w;
        if (i11 == 1) {
            v0Var.b = i10;
        } else {
            v0Var.a = i10;
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

    public void setGeometry(iw0 iw0Var) {
        this.M = iw0Var;
        requestLayout();
        B();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0043, code lost:
    
        if (r9 <= 0.5f) goto L22;
     */
    @Override // r0.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(View view, int i10, int i11, int[] iArr, int i12) {
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
            li.e3 e3Var = this.i0;
            int i13 = 0;
            if (view == recyclerView) {
                if (i11 >= 0) {
                    lw0 lw0Var = (lw0) e3Var.b;
                    float k10 = lw0Var.k();
                    if (!Float.isInfinite(k10)) {
                        k10 = Math.max(0.0f, k10 - lw0Var.U);
                    }
                }
                lw0 lw0Var2 = (lw0) e3Var.b;
                hw0 hw0Var = lw0Var2.N;
                if (hw0Var != null && hw0Var.c() != -1) {
                    i13 = lw0Var2.r(lw0Var2.F, i11);
                }
            } else if (i11 > 0) {
                lw0 lw0Var3 = (lw0) e3Var.b;
                float k11 = lw0Var3.k();
                if (!Float.isInfinite(k11)) {
                    k11 = Math.max(0.0f, k11 - lw0Var3.U);
                }
                int min = Float.isInfinite(k11) ? i11 : Math.min(i11, Math.max(0, Math.round(k11)));
                lw0 lw0Var4 = (lw0) e3Var.b;
                i13 = lw0Var4.r(lw0Var4.E, min);
            }
            iArr[1] = iArr[1] + i13;
            f("PRE", view, i11, i13, false);
        } finally {
            this.P = null;
            B();
        }
    }

    public final void u(mm0 mm0Var, hw0 hw0Var) {
        RecyclerView recyclerView = this.E;
        bh.r rVar = this.v;
        ml mlVar = this.j0;
        if (recyclerView != null) {
            recyclerView.C0();
            ArrayList arrayList = this.E.w0;
            if (arrayList != null) {
                arrayList.remove(mlVar);
            }
            rVar.removeView(this.E);
        }
        this.E = mm0Var;
        this.N = hw0Var;
        rVar.addView(mm0Var, new FrameLayout.LayoutParams(-1, -1));
        mm0Var.j(mlVar);
        mm0Var.setNestedScrollingEnabled(true);
        B();
    }

    public final void w(View view, float f7) {
        if (view == null) {
            return;
        }
        this.O.i(view).setTranslationY((f7 + this.U) - Math.round(r0));
    }

    public final void x(View view, u91 u91Var, jw0 jw0Var) {
        View view2 = this.I;
        if (view2 != null) {
            removeView(view2);
        }
        this.I = view;
        this.H = u91Var;
        this.O = jw0Var;
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
