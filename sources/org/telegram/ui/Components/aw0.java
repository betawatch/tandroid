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

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public class aw0 extends lw0 implements r0.m {
    public static final /* synthetic */ int o1 = 0;
    public long A0;
    public long B0;
    public long C0;
    public int D0;
    public int E0;
    public final RectF F0;
    public final ai.f0 G0;
    public final b2.q0 H0;
    public final int[] I0;
    public final am0 J0;
    public RecyclerView K0;
    public RecyclerView L0;
    public RecyclerView M0;
    public g91 N0;
    public View O0;
    public View P0;
    public View Q0;
    public View R0;
    public xv0 S0;
    public wv0 T0;
    public yv0 U0;
    public View V0;
    public int W0;
    public int X0;
    public int Y0;
    public int Z0;
    public float a1;
    public float b1;
    public float c1;
    public float d1;
    public float e1;
    public boolean f1;
    public boolean g1;
    public boolean h1;
    public boolean i1;
    public boolean j1;
    public boolean k1;
    public final k2.e l1;
    public final xb0 m1;
    public final ut n1;
    public boolean w0;
    public int x0;
    public int y0;
    public long z0;

    public aw0(Context context) {
        super(context, null);
        this.F0 = new RectF();
        this.H0 = new b2.q0();
        this.I0 = new int[2];
        this.J0 = new am0();
        this.l1 = new k2.e(this, 12);
        this.m1 = new xb0(this, 6);
        this.n1 = new ut(2, this);
        setClipChildren(false);
        setClipToPadding(false);
        ai.f0 f0Var = new ai.f0(this, context);
        this.G0 = f0Var;
        addView(f0Var, new FrameLayout.LayoutParams(-1, -1));
    }

    public static String g0(View view) {
        if (view == null) {
            return BuildConfig.BETA_URL;
        }
        String str = view.getClass().getSimpleName() + "@" + Integer.toHexString(System.identityHashCode(view)) + "(x=" + view.getTranslationX() + ",y=" + view.getTranslationY() + ",w=" + view.getWidth() + ",visibility=" + view.getVisibility() + ",attached=" + view.isAttachedToWindow() + ",top=" + view.getTop() + ",height=" + view.getHeight() + ",layoutRequested=" + view.isLayoutRequested();
        if (view instanceof RecyclerView) {
            RecyclerView recyclerView = (RecyclerView) view;
            StringBuilder j3 = t8.b.j(str, ",scrollState=");
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
            j3.append(recyclerView.getAdapter() == null ? 0 : recyclerView.getAdapter().h());
            str = j3.toString();
        }
        return t8.b.v(str, ")");
    }

    public static void o0(RecyclerView recyclerView, int i10, int i11) {
        int b10;
        if (recyclerView.getPaddingTop() == i10 && recyclerView.getPaddingBottom() == i11) {
            return;
        }
        s4.o0 layoutManager = recyclerView.getLayoutManager();
        int i12 = 0;
        View q6 = (layoutManager == null || layoutManager.r() == 0) ? null : layoutManager.q(0);
        if (q6 == null) {
            b10 = -1;
        } else {
            layoutManager.getClass();
            b10 = ((s4.p0) q6.getLayoutParams()).b();
        }
        if (q6 != null) {
            layoutManager.getClass();
            i12 = (s4.o0.z(q6) - recyclerView.getPaddingTop()) - ((ViewGroup.MarginLayoutParams) ((s4.p0) q6.getLayoutParams())).topMargin;
        }
        recyclerView.setPadding(recyclerView.getPaddingLeft(), i10, recyclerView.getPaddingRight(), i11);
        if (b10 == -1 || !(layoutManager instanceof s4.c0)) {
            return;
        }
        ((s4.c0) layoutManager).h1(b10, i12);
    }

    private void setBleed(RecyclerView recyclerView) {
        ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            int i10 = marginLayoutParams.topMargin;
            int i11 = this.Y0;
            if (i10 == (-i11) && marginLayoutParams.bottomMargin == (-this.Z0)) {
                return;
            }
            marginLayoutParams.topMargin = -i11;
            marginLayoutParams.bottomMargin = -this.Z0;
            recyclerView.setLayoutParams(marginLayoutParams);
        }
    }

    private void setTabsPinned(boolean z10) {
        if (this.h1 == z10) {
            return;
        }
        this.h1 = z10;
        e0(z10 ? "TABS_PINNED" : "TABS_UNPINNED", this.K0, 0, 0, true);
        this.S0.E(z10);
    }

    public final void Z() {
        wv0 wv0Var;
        e0("ALIGN_BOUNDARY", this.K0, 0, 0, true);
        if (this.K0 == null || (wv0Var = this.T0) == null || this.S0 == null) {
            return;
        }
        int b10 = wv0Var.b();
        s4.o0 layoutManager = this.K0.getLayoutManager();
        if (b10 == -1 || !(layoutManager instanceof s4.c0)) {
            return;
        }
        v0();
        ((s4.c0) layoutManager).h1(b10, (Math.round(this.a1) - this.K0.getTop()) - this.K0.getPaddingTop());
        this.j1 = true;
        requestLayout();
    }

    public final void a0(RecyclerView recyclerView) {
        if (this.S0 == null || recyclerView == null) {
            return;
        }
        v0();
        View view = this.P0;
        int height = view == null ? 0 : view.getHeight() > 0 ? this.P0.getHeight() : this.P0.getLayoutParams().height;
        setBleed(recyclerView);
        o0(recyclerView, Math.max(0, height) + Math.round(this.a1) + this.Y0, this.S0.e1() + this.Z0);
        if (recyclerView.isNestedScrollingEnabled()) {
            return;
        }
        recyclerView.setNestedScrollingEnabled(true);
    }

    public final boolean b0() {
        g91 g91Var = this.N0;
        return (g91Var == null || g91Var.getCurrentView() == null || Float.isInfinite(j0()) || this.e1 >= ((float) getHeight())) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x005a, code lost:
    
        if (r5.J0.f != false) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c0(Canvas canvas, RectF rectF, zv0 zv0Var) {
        if (this.N0 != null && this.U0 != null && this.O0.getVisibility() == 0 && this.N0.getVisibility() == 0) {
            for (View view : this.N0.getViewPages()) {
                if (view != null && view.getParent() == this.N0 && view.getVisibility() == 0) {
                    zv0Var.a(canvas, rectF, this.U0.i(view));
                }
            }
        }
        RecyclerView recyclerView = this.K0;
        if (recyclerView == null || recyclerView.getVisibility() != 0) {
            return;
        }
        float x10 = this.g1 ? this.R0.getX() : 0.0f;
        if (x10 == 0.0f) {
            zv0Var.a(canvas, rectF, this.K0);
            return;
        }
        RectF rectF2 = this.F0;
        rectF2.set(rectF);
        rectF2.offset(-x10, 0.0f);
        int save = canvas.save();
        try {
            canvas.translate(x10, 0.0f);
            zv0Var.a(canvas, rectF2, this.K0);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public final void d0(String str, View view, int i10, int i11) {
        if (this.w0) {
            long uptimeMillis = SystemClock.uptimeMillis();
            if (uptimeMillis - this.A0 < 250) {
                return;
            }
            this.A0 = uptimeMillis;
            e0(str.concat(i11 == 0 ? "_TOUCH" : "_NON_TOUCH"), view, i10, i10, true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            if (this.w0) {
                this.D0++;
                this.A0 = 0L;
                e0("TOUCH_DOWN", null, 0, 0, true);
            }
            t0();
        } else if (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) {
            e0(motionEvent.getActionMasked() == 1 ? "TOUCH_UP" : "TOUCH_CANCEL", null, 0, 0, true);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void e0(String str, View view, int i10, int i11, boolean z10) {
        yv0 yv0Var;
        if (this.w0) {
            long uptimeMillis = SystemClock.uptimeMillis();
            if (!z10) {
                if (uptimeMillis - this.z0 < 250) {
                    return;
                } else {
                    this.z0 = uptimeMillis;
                }
            }
            g91 g91Var = this.N0;
            int i12 = 0;
            View view2 = null;
            View view3 = g91Var == null ? null : g91Var.getViewPages()[0];
            g91 g91Var2 = this.N0;
            View view4 = g91Var2 == null ? null : g91Var2.getViewPages()[1];
            StringBuilder sb2 = new StringBuilder("root=");
            sb2.append(Integer.toHexString(System.identityHashCode(this)));
            sb2.append(" gesture=");
            sb2.append(this.D0);
            sb2.append(" transition=");
            sb2.append(this.E0);
            sb2.append(" event=");
            sb2.append(str);
            sb2.append(" target=");
            sb2.append(g0(view));
            sb2.append(" dy=");
            sb2.append(i10);
            sb2.append(" used=");
            sb2.append(i11);
            sb2.append(" transitioning=");
            sb2.append(this.g1);
            sb2.append(" progress=");
            sb2.append(this.J0.e);
            sb2.append(" ageMs=");
            sb2.append(this.g1 ? uptimeMillis - this.B0 : 0L);
            sb2.append(" unchangedMs=");
            sb2.append(this.g1 ? uptimeMillis - this.C0 : 0L);
            sb2.append(" depth=");
            sb2.append(this.W0);
            sb2.append(" updating=");
            sb2.append(this.f1);
            sb2.append(" callback=");
            sb2.append(g0(this.V0));
            sb2.append(" common=");
            sb2.append(g0(this.K0));
            sb2.append(" active=");
            sb2.append(g0(this.L0));
            sb2.append(" current=");
            sb2.append(g0(view3));
            sb2.append(" other=");
            sb2.append(g0(view4));
            sb2.append(" source=");
            sb2.append(g0(this.Q0));
            sb2.append(" incoming=");
            sb2.append(g0(this.R0));
            sb2.append(" boundary=");
            sb2.append(j0());
            sb2.append(" pin=");
            sb2.append(this.a1);
            sb2.append(" tail=");
            sb2.append(this.d1);
            sb2.append(" alignPending=");
            sb2.append(this.j1);
            wv0 wv0Var = this.T0;
            int i13 = -1;
            int b10 = wv0Var == null ? -1 : wv0Var.b();
            RecyclerView recyclerView = this.K0;
            s4.o0 layoutManager = recyclerView == null ? null : recyclerView.getLayoutManager();
            if (layoutManager != null && b10 != -1) {
                view2 = layoutManager.m(b10);
            }
            StringBuilder j3 = hg.k0.j(b10, " row=", " anchor=");
            j3.append(g0(view2));
            j3.append(" anchorTop=");
            j3.append(view2 == null ? 0 : view2.getTop());
            j3.append(" anchorHeight=");
            j3.append(view2 == null ? 0 : view2.getHeight());
            j3.append(" decoratedTop=");
            if (view2 != null) {
                layoutManager.getClass();
                i12 = s4.o0.z(view2);
            }
            j3.append(i12);
            j3.append(" adapterPosition=");
            if (view2 != null) {
                this.K0.getClass();
                i13 = RecyclerView.R(view2);
            }
            j3.append(i13);
            j3.append(" pageOffset=");
            RecyclerView recyclerView2 = this.L0;
            j3.append((recyclerView2 == null || (yv0Var = this.U0) == null) ? 0.0f : yv0Var.h(recyclerView2));
            j3.append(" tabsTop=");
            j3.append(this.e1);
            j3.append(" draw=");
            j3.append(this.y0);
            sb2.append(j3.toString());
            Log.d("SiblingScroll", sb2.toString());
        }
    }

    public final void f0(String str) {
        e0(str, this.N0, 0, 0, true);
    }

    public int getBottomBleed() {
        return this.Z0;
    }

    @Override // org.telegram.ui.Components.lw0
    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.H0.b();
    }

    public float getTabsTop() {
        return this.e1;
    }

    public int getTopBleed() {
        return this.Y0;
    }

    public final void h0(String str) {
        aw0 aw0Var;
        if (this.w0) {
            aw0Var = this;
            aw0Var.e0("TRANSITION_END_".concat(str), null, 0, 0, true);
        } else {
            aw0Var = this;
        }
        aw0Var.g1 = false;
        aw0Var.R0 = null;
        aw0Var.Q0 = null;
        aw0Var.G0.invalidate();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000f, code lost:
    
        if (r3.J0.f != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean i0(float f7, float f10) {
        float x10 = this.g1 ? this.R0.getX() : 0.0f;
        return f10 >= 0.0f && f10 < this.d1 && f7 >= Math.max(0.0f, x10) && f7 < Math.min((float) getWidth(), x10 + ((float) getWidth()));
    }

    public final float j0() {
        View m10;
        RecyclerView recyclerView = this.K0;
        if (recyclerView == null || this.T0 == null || recyclerView.getLayoutManager() == null) {
            return Float.POSITIVE_INFINITY;
        }
        s4.o0 layoutManager = this.K0.getLayoutManager();
        int b10 = this.T0.b();
        if (b10 == -1 || (m10 = layoutManager.m(b10)) == null) {
            return Float.POSITIVE_INFINITY;
        }
        return (s4.o0.z(m10) + this.K0.getTop()) - ((ViewGroup.MarginLayoutParams) ((s4.p0) m10.getLayoutParams())).topMargin;
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x00e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k0() {
        g91 g91Var;
        aw0 aw0Var;
        View view;
        if (this.f1 || (g91Var = this.N0) == null || this.U0 == null || this.S0 == null) {
            return;
        }
        View[] viewPages = g91Var.getViewPages();
        boolean z10 = false;
        View view2 = viewPages[0];
        View view3 = viewPages[1];
        g91 g91Var2 = this.N0;
        if (g91Var2 instanceof bm0) {
            bm0 bm0Var = (bm0) g91Var2;
            if (view2 != null && view3 != null && view2 == bm0Var.W && view3 == bm0Var.a0 && !bm0Var.H && view2.getTranslationX() == 0.0f && view2.getMeasuredWidth() > 0 && Math.abs(view3.getTranslationX()) >= view2.getMeasuredWidth()) {
                z10 = true;
            }
        }
        if (this.g1 && z10) {
            h0("drag_aborted");
        }
        if (this.g1 && (view3 == null || ((view2 != (view = this.Q0) && view2 != this.R0) || (view3 != view && view3 != this.R0)))) {
            h0("page_slots_changed");
        }
        l0();
        boolean z11 = this.g1;
        ai.f0 f0Var = this.G0;
        am0 am0Var = this.J0;
        if (!z11 && !z10 && view2 != null && view3 != null) {
            float j02 = j0();
            if (!Float.isInfinite(j02)) {
                v0();
                t0();
                this.Q0 = view2;
                this.R0 = view3;
                float f7 = this.a1;
                if (j02 <= 0.5f + f7) {
                    j02 = f7;
                }
                yv0 yv0Var = this.U0;
                am0Var.a(j02, yv0Var.h(yv0Var.i(view2)), this.a1, this.b1);
                this.g1 = true;
                if (this.w0) {
                    this.E0++;
                    long uptimeMillis = SystemClock.uptimeMillis();
                    this.B0 = uptimeMillis;
                    this.C0 = uptimeMillis;
                    this.A0 = 0L;
                    aw0Var = this;
                    aw0Var.e0("TRANSITION_BEGIN", view2, 0, 0, true);
                } else {
                    aw0Var = this;
                }
                f0Var.invalidate();
                if (aw0Var.g1) {
                    float max = Math.max(1, aw0Var.Q0.getWidth());
                    float f10 = am0Var.e;
                    float max2 = Math.max(0.0f, Math.min(1.0f, Math.abs(aw0Var.Q0.getTranslationX()) / max));
                    am0Var.e = max2;
                    if (f10 != max2) {
                        f0Var.invalidate();
                        if (aw0Var.w0) {
                            aw0Var.C0 = SystemClock.uptimeMillis();
                        }
                    }
                }
                u0();
            }
        }
        aw0Var = this;
        if (aw0Var.g1) {
        }
        u0();
    }

    public final void l0() {
        g91 g91Var = this.N0;
        RecyclerView i10 = (g91Var == null || this.U0 == null || g91Var.getCurrentView() == null) ? null : this.U0.i(this.N0.getCurrentView());
        if (i10 == this.L0) {
            return;
        }
        e0("ACTIVE_CHANGE", i10, 0, 0, true);
        RecyclerView recyclerView = this.L0;
        xb0 xb0Var = this.m1;
        if (recyclerView != null) {
            recyclerView.C0();
            ArrayList arrayList = this.L0.v0;
            if (arrayList != null) {
                arrayList.remove(xb0Var);
            }
        }
        this.L0 = i10;
        if (i10 != null) {
            i10.j(xb0Var);
        }
    }

    @Override // r0.l
    public final void m(int i10, View view) {
        e0(i10 == 0 ? "NESTED_STOP_TOUCH" : "NESTED_STOP_NON_TOUCH", view, 0, 0, true);
        b2.q0 q0Var = this.H0;
        if (i10 == 1) {
            q0Var.b = 0;
        } else {
            q0Var.a = 0;
        }
    }

    public final int m0(RecyclerView recyclerView, int i10) {
        if (recyclerView == null || i10 == 0) {
            if (i10 != 0) {
                e0("TRANSFER_NO_TARGET", recyclerView, i10, 0, false);
            }
            return 0;
        }
        if (recyclerView == this.V0) {
            e0("TRANSFER_REENTRY", recyclerView, i10, 0, true);
            throw new IllegalStateException("Reentrant scrollBy on nested source");
        }
        RecyclerView recyclerView2 = this.M0;
        int i11 = this.X0;
        this.M0 = recyclerView;
        this.X0 = 0;
        this.W0++;
        try {
            recyclerView.scrollBy(0, i10);
            int i12 = this.X0;
            int max = i10 > 0 ? Math.max(0, Math.min(i10, i12)) : Math.min(0, Math.max(i10, i12));
            e0(i12 == 0 ? "TRANSFER_ZERO" : "TRANSFER", recyclerView, i10, max, false);
            return max;
        } finally {
            this.W0--;
            this.M0 = recyclerView2;
            this.X0 = i11;
        }
    }

    @Override // r0.m
    public final void n(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        RecyclerView recyclerView;
        if (this.W0 != 0 || (view != (recyclerView = this.K0) && view != this.L0)) {
            e0("POST_IGNORED", view, i13, 0, false);
            return;
        }
        if (this.g1) {
            d0("POST_BLOCKED", view, i13, i14);
            iArr[1] = iArr[1] + i13;
            return;
        }
        this.V0 = view;
        try {
            k2.e eVar = this.l1;
            int i15 = 0;
            boolean z10 = view == recyclerView;
            if (z10 && i11 > 0 && i13 > 0) {
                aw0 aw0Var = (aw0) eVar.b;
                wv0 wv0Var = aw0Var.T0;
                if (wv0Var != null && wv0Var.b() != -1) {
                    i15 = aw0Var.m0(aw0Var.L0, i13);
                }
            } else if (!z10 && i13 < 0) {
                aw0 aw0Var2 = (aw0) eVar.b;
                i15 = aw0Var2.m0(aw0Var2.K0, i13);
            }
            iArr[1] = iArr[1] + i15;
            e0("POST", view, i13, i15, false);
        } finally {
            this.V0 = null;
            u0();
        }
    }

    public final void n0(zl0 zl0Var, wv0 wv0Var) {
        RecyclerView recyclerView = this.K0;
        ai.f0 f0Var = this.G0;
        xb0 xb0Var = this.m1;
        if (recyclerView != null) {
            recyclerView.C0();
            ArrayList arrayList = this.K0.v0;
            if (arrayList != null) {
                arrayList.remove(xb0Var);
            }
            f0Var.removeView(this.K0);
        }
        this.K0 = zl0Var;
        this.T0 = wv0Var;
        f0Var.addView(zl0Var, new FrameLayout.LayoutParams(-1, -1));
        zl0Var.j(xb0Var);
        zl0Var.setNestedScrollingEnabled(true);
        u0();
    }

    @Override // r0.l
    public final void o(View view, int i10, int i11, int i12, int i13, int i14) {
        int[] iArr = this.I0;
        iArr[1] = 0;
        iArr[0] = 0;
        n(view, i10, i11, i12, i13, i14, iArr);
    }

    @Override // org.telegram.ui.Components.lw0, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnPreDrawListener(this.n1);
    }

    @Override // org.telegram.ui.Components.lw0, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        t0();
        getViewTreeObserver().removeOnPreDrawListener(this.n1);
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
        if (this.W0 == 0 && z11 && (view2 == this.K0 || view2 == this.L0)) {
            z10 = true;
        }
        if (this.w0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(z10 ? "NESTED_START" : "NESTED_REJECT");
            sb2.append("_axes=");
            sb2.append(i10);
            sb2.append("_type=");
            sb2.append(i11);
            e0(sb2.toString(), view2, 0, 0, true);
        }
        return z10;
    }

    public final void p0(View view, float f7) {
        if (view == null) {
            return;
        }
        this.U0.i(view).setTranslationY((f7 + this.a1) - Math.round(r0));
    }

    public final void q0(View view, g91 g91Var, yv0 yv0Var) {
        View view2 = this.O0;
        if (view2 != null) {
            removeView(view2);
        }
        this.O0 = view;
        this.N0 = g91Var;
        this.U0 = yv0Var;
        addView(view, 0, new FrameLayout.LayoutParams(-1, -1));
        u0();
    }

    public final void r0(View view) {
        View view2 = this.P0;
        if (view2 != null) {
            removeView(view2);
        }
        this.P0 = view;
        addView(view, new FrameLayout.LayoutParams(-1, -2, 48));
        u0();
    }

    @Override // r0.l
    public final void s(View view, View view2, int i10, int i11) {
        b2.q0 q0Var = this.H0;
        if (i11 == 1) {
            q0Var.b = i10;
        } else {
            q0Var.a = i10;
        }
    }

    public final void s0(int i10, int i11) {
        this.Y0 = Math.max(0, i10);
        this.Z0 = Math.max(0, i11);
        requestLayout();
        u0();
    }

    public void setCommonInsetsManagedExternally(boolean z10) {
        if (this.k1 == z10) {
            return;
        }
        this.k1 = z10;
        u0();
        requestLayout();
    }

    public void setDebugLoggingEnabled(boolean z10) {
        this.w0 = z10;
        if (z10) {
            this.z0 = 0L;
            this.A0 = 0L;
            long uptimeMillis = SystemClock.uptimeMillis();
            this.B0 = uptimeMillis;
            this.C0 = uptimeMillis;
            e0("DEBUG_ENABLED", null, 0, 0, true);
        }
    }

    public void setGeometry(xv0 xv0Var) {
        this.S0 = xv0Var;
        requestLayout();
        u0();
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
        if (this.W0 != 0 || (view != (recyclerView = this.K0) && view != this.L0)) {
            e0("PRE_IGNORED", view, i11, 0, false);
            return;
        }
        if (this.g1) {
            d0("PRE_BLOCKED", view, i11, i12);
            iArr[1] = iArr[1] + i11;
            return;
        }
        this.V0 = view;
        try {
            k2.e eVar = this.l1;
            int i13 = 0;
            if (view == recyclerView) {
                if (i11 >= 0) {
                    aw0 aw0Var = (aw0) eVar.b;
                    float j02 = aw0Var.j0();
                    if (!Float.isInfinite(j02)) {
                        j02 = Math.max(0.0f, j02 - aw0Var.a1);
                    }
                }
                aw0 aw0Var2 = (aw0) eVar.b;
                wv0 wv0Var = aw0Var2.T0;
                if (wv0Var != null && wv0Var.b() != -1) {
                    i13 = aw0Var2.m0(aw0Var2.L0, i11);
                }
            } else if (i11 > 0) {
                aw0 aw0Var3 = (aw0) eVar.b;
                float j03 = aw0Var3.j0();
                if (!Float.isInfinite(j03)) {
                    j03 = Math.max(0.0f, j03 - aw0Var3.a1);
                }
                int min = Float.isInfinite(j03) ? i11 : Math.min(i11, Math.max(0, Math.round(j03)));
                aw0 aw0Var4 = (aw0) eVar.b;
                i13 = aw0Var4.m0(aw0Var4.K0, min);
            }
            iArr[1] = iArr[1] + i13;
            e0("PRE", view, i11, i13, false);
        } finally {
            this.V0 = null;
            u0();
        }
    }

    public final void t0() {
        e0("STOP_SCROLLING", null, 0, 0, true);
        RecyclerView recyclerView = this.K0;
        if (recyclerView != null) {
            recyclerView.C0();
        }
        g91 g91Var = this.N0;
        if (g91Var == null || this.U0 == null) {
            return;
        }
        for (View view : g91Var.getViewPages()) {
            if (view != null) {
                this.U0.i(view).C0();
            }
        }
    }

    public final void u0() {
        am0 am0Var = this.J0;
        if (this.f1 || this.S0 == null) {
            return;
        }
        boolean z10 = true;
        this.f1 = true;
        try {
            float f7 = this.d1;
            v0();
            RecyclerView recyclerView = this.K0;
            if (recyclerView != null && !this.k1) {
                setBleed(recyclerView);
                RecyclerView recyclerView2 = this.K0;
                int i10 = this.Y0;
                this.S0.getClass();
                o0(recyclerView2, i10, this.Z0);
            }
            g91 g91Var = this.N0;
            if (g91Var != null && this.U0 != null && this.P0 != null) {
                for (View view : g91Var.getViewPages()) {
                    if (view != null && view.getParent() == this.N0) {
                        a0(this.U0.i(view));
                    }
                }
                l0();
                float j02 = j0();
                boolean isInfinite = Float.isInfinite(j02);
                ai.f0 f0Var = this.G0;
                float f10 = 0.0f;
                if (isInfinite) {
                    this.d1 = Float.POSITIVE_INFINITY;
                    this.O0.setVisibility(4);
                    this.P0.setVisibility(4);
                    RecyclerView recyclerView3 = this.K0;
                    if (recyclerView3 != null) {
                        recyclerView3.setTranslationY(0.0f);
                    }
                    setTabsPinned(false);
                    if (f7 != this.d1) {
                        f0Var.invalidate();
                    }
                    this.f1 = false;
                    return;
                }
                float f11 = this.a1;
                if (j02 > f11 + 0.5f) {
                    f11 = j02;
                }
                this.c1 = f11;
                this.O0.setVisibility(0);
                this.P0.setVisibility(0);
                if (this.g1) {
                    this.d1 = am0Var.b();
                    this.e1 = Math.max(am0Var.d, am0Var.b());
                    View view2 = this.Q0;
                    float max = Math.max(0.0f, am0Var.a - am0Var.d);
                    if (!am0Var.f) {
                        f10 = am0Var.b() - am0Var.b;
                    }
                    p0(view2, max + f10);
                    p0(this.R0, Math.max(am0Var.d, am0Var.b()) - am0Var.d);
                } else {
                    RecyclerView recyclerView4 = this.L0;
                    float max2 = this.c1 - Math.max(0.0f, Math.min(recyclerView4 == null ? 0.0f : this.U0.h(recyclerView4), Math.max(0.0f, this.a1 - this.b1)));
                    this.d1 = max2;
                    this.e1 = Math.max(this.a1, max2);
                    p0(this.N0.getCurrentView(), Math.max(0.0f, this.c1 - this.a1));
                }
                this.K0.setTranslationY(this.d1 - j02);
                this.P0.setTranslationY(this.e1 - r0.getTop());
                if (this.e1 > this.a1 + 0.5f) {
                    z10 = false;
                }
                setTabsPinned(z10);
                this.S0.getClass();
                if (f7 != this.d1) {
                    f0Var.invalidate();
                }
                this.f1 = false;
            }
        } finally {
            this.f1 = false;
        }
    }

    public final void v0() {
        xv0 xv0Var = this.S0;
        if (xv0Var == null) {
            return;
        }
        float Y0 = xv0Var.Y0();
        this.S0.getClass();
        if (Float.isNaN(Y0) || Float.isInfinite(Y0) || Float.isNaN(0.0f) || Float.isInfinite(0.0f) || Y0 < 0.0f) {
            throw new IllegalArgumentException("Require finite 0 <= commonHiddenTop <= tabsPinnedTop");
        }
        if (this.i1 && (Y0 != this.a1 || 0.0f != this.b1)) {
            float j02 = j0();
            if (!Float.isInfinite(j02)) {
                float f7 = this.a1;
                boolean z10 = j02 <= 0.5f + f7 || j02 < Y0;
                if (z10 && Y0 != f7) {
                    this.j1 = true;
                }
                if (this.g1) {
                    am0 am0Var = this.J0;
                    float f10 = am0Var.e;
                    if (z10) {
                        j02 = Y0;
                    }
                    yv0 yv0Var = this.U0;
                    am0Var.a(j02, yv0Var.h(yv0Var.i(this.Q0)), Y0, 0.0f);
                    am0Var.e = Math.max(0.0f, Math.min(1.0f, f10));
                    this.G0.invalidate();
                }
            }
        }
        this.a1 = Y0;
        this.b1 = 0.0f;
        this.i1 = true;
    }
}
