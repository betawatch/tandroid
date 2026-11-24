// default package

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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public class dha extends FrameLayout implements ti7 {
    public final r39 E;
    public o39 F;
    public RecyclerView G;
    public RecyclerView H;
    public wec I;
    public View J;
    public View K;
    public View L;
    public View M;
    public aha N;
    public zga O;
    public bha P;
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
    public final ln8 j0;
    public final n58 k0;
    public final qr1 l0;
    public int n;
    public int r;
    public final RectF s;
    public final oc6 w;
    public final zw8 x;
    public final int[] y;

    public dha(Context context) {
        super(context);
        this.s = new RectF();
        this.x = new zw8((byte) 3);
        this.y = new int[2];
        this.E = new r39();
        this.j0 = new ln8((Object) this, (byte) 15);
        this.k0 = new n58(this, (byte) 22);
        this.l0 = new qr1(this, (byte) 5);
        setClipChildren(false);
        setClipToPadding(false);
        oc6 oc6Var = new oc6(this, context);
        this.w = oc6Var;
        addView(oc6Var, new FrameLayout.LayoutParams(-1, -1));
    }

    public static String h(View view) {
        if (view == null) {
            return "null";
        }
        String str = view.getClass().getSimpleName() + "@" + Integer.toHexString(System.identityHashCode(view)) + "(x=" + view.getTranslationX() + ",y=" + view.getTranslationY() + ",w=" + view.getWidth() + ",visibility=" + view.getVisibility() + ",attached=" + view.isAttachedToWindow() + ",top=" + view.getTop() + ",height=" + view.getHeight() + ",layoutRequested=" + view.isLayoutRequested();
        if (view instanceof RecyclerView) {
            RecyclerView recyclerView = (RecyclerView) view;
            StringBuilder k = b00.k(str, ",scrollState=");
            k.append(recyclerView.getScrollState());
            k.append(",up=");
            k.append(recyclerView.canScrollVertically(-1));
            k.append(",down=");
            k.append(recyclerView.canScrollVertically(1));
            k.append(",layout=");
            k.append(recyclerView.d0());
            k.append(",pendingUpdates=");
            k.append(recyclerView.a0());
            k.append(",animating=");
            k.append(recyclerView.c0());
            k.append(",paddingTop=");
            k.append(recyclerView.getPaddingTop());
            k.append(",count=");
            k.append(recyclerView.getAdapter() == null ? 0 : recyclerView.getAdapter().b());
            str = k.toString();
        }
        return str.concat(")");
    }

    public static float j(RecyclerView recyclerView) {
        d49 layoutManager = recyclerView.getLayoutManager();
        if (layoutManager == null || !recyclerView.canScrollVertically(-1)) {
            return 0.0f;
        }
        if (layoutManager.m(0) == null) {
            return Float.POSITIVE_INFINITY;
        }
        return Math.max(0.0f, (recyclerView.getPaddingTop() - d49.y(r0)) + ((ViewGroup.MarginLayoutParams) ((e49) r0.getLayoutParams())).topMargin);
    }

    private void setBleed(RecyclerView recyclerView) {
        ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            int i = marginLayoutParams.topMargin;
            int i2 = this.T;
            if (i == (-i2) && marginLayoutParams.bottomMargin == (-this.U)) {
                return;
            }
            marginLayoutParams.topMargin = -i2;
            marginLayoutParams.bottomMargin = -this.U;
            recyclerView.setLayoutParams(marginLayoutParams);
        }
    }

    private void setTabsPinned(boolean z) {
        if (this.f0 == z) {
            return;
        }
        this.f0 = z;
        f(z ? "TABS_PINNED" : "TABS_UNPINNED", this.F, 0, 0, true);
        this.N.o(z);
    }

    public static void w(RecyclerView recyclerView, int i, int i2) {
        int i3;
        if (recyclerView.getPaddingTop() == i && recyclerView.getPaddingBottom() == i2) {
            return;
        }
        d49 layoutManager = recyclerView.getLayoutManager();
        int i4 = 0;
        View q = (layoutManager == null || layoutManager.r() == 0) ? null : layoutManager.q(0);
        if (q == null) {
            i3 = -1;
        } else {
            layoutManager.getClass();
            int b = ((e49) q.getLayoutParams()).b();
            int y = (d49.y(q) - recyclerView.getPaddingTop()) - ((ViewGroup.MarginLayoutParams) ((e49) q.getLayoutParams())).topMargin;
            i3 = b;
            i4 = y;
        }
        recyclerView.setPadding(recyclerView.getPaddingLeft(), i, recyclerView.getPaddingRight(), i2);
        if (i3 == -1 || !(layoutManager instanceof t26)) {
            return;
        }
        ((t26) layoutManager).g1(i3, i4);
    }

    public final void A(int i, int i2) {
        this.T = Math.max(0, i);
        this.U = Math.max(0, i2);
        requestLayout();
        C();
    }

    public final void B() {
        f("STOP_SCROLLING", null, 0, 0, true);
        o39 o39Var = this.F;
        if (o39Var != null) {
            o39Var.D0();
        }
        wec wecVar = this.I;
        if (wecVar == null || this.P == null) {
            return;
        }
        for (View view : wecVar.getViewPages()) {
            if (view != null) {
                this.P.h(view).D0();
            }
        }
    }

    public final void C() {
        r39 r39Var = this.E;
        if (this.d0 || this.N == null) {
            return;
        }
        this.d0 = true;
        try {
            float f = this.b0;
            D();
            o39 o39Var = this.F;
            if (o39Var != null && !this.i0) {
                setBleed(o39Var);
                o39 o39Var2 = this.F;
                int i = this.T;
                this.N.getClass();
                w(o39Var2, i, this.U);
            }
            wec wecVar = this.I;
            if (wecVar != null && this.P != null && this.K != null) {
                for (View view : wecVar.getViewPages()) {
                    if (view != null && view.getParent() == this.I) {
                        b(this.P.h(view));
                    }
                }
                t();
                float p = p();
                boolean isInfinite = Float.isInfinite(p);
                oc6 oc6Var = this.w;
                if (isInfinite) {
                    this.b0 = Float.POSITIVE_INFINITY;
                    this.J.setVisibility(4);
                    this.K.setVisibility(4);
                    o39 o39Var3 = this.F;
                    if (o39Var3 != null) {
                        o39Var3.setTranslationY(0.0f);
                    }
                    setTabsPinned(false);
                    if (f != this.b0) {
                        oc6Var.invalidate();
                    }
                } else {
                    float f2 = this.V;
                    if (p > f2 + 0.5f) {
                        f2 = p;
                    }
                    this.a0 = f2;
                    this.J.setVisibility(0);
                    this.K.setVisibility(0);
                    if (this.e0) {
                        this.b0 = r39Var.b();
                        this.c0 = Math.max(r39Var.d, r39Var.b());
                        x(this.L, Math.max(0.0f, r39Var.a - r39Var.d) + (r39Var.f ? 0.0f : r39Var.b() - r39Var.b));
                        x(this.M, Math.max(r39Var.d, r39Var.b()) - r39Var.d);
                    } else {
                        RecyclerView recyclerView = this.G;
                        float max = this.a0 - Math.max(0.0f, Math.min(recyclerView == null ? 0.0f : this.P.c(recyclerView), Math.max(0.0f, this.V - this.W)));
                        this.b0 = max;
                        this.c0 = Math.max(this.V, max);
                        x(this.I.getCurrentView(), Math.max(0.0f, this.a0 - this.V));
                    }
                    this.F.setTranslationY(this.b0 - p);
                    this.K.setTranslationY(this.c0 - r0.getTop());
                    setTabsPinned(this.c0 <= this.V + 0.5f);
                    this.N.getClass();
                    if (f != this.b0) {
                        oc6Var.invalidate();
                    }
                }
            }
        } finally {
            this.d0 = false;
        }
    }

    public final void D() {
        aha ahaVar = this.N;
        if (ahaVar == null) {
            return;
        }
        float P = ahaVar.P();
        this.N.getClass();
        if (Float.isNaN(P) || Float.isInfinite(P) || P < 0.0f) {
            w26.j("Require finite 0 <= commonHiddenTop <= tabsPinnedTop");
            return;
        }
        if (this.g0 && (P != this.V || 0.0f != this.W)) {
            float p = p();
            if (!Float.isInfinite(p)) {
                float f = this.V;
                boolean z = p <= 0.5f + f || p < P;
                if (z && P != f) {
                    this.h0 = true;
                }
                if (this.e0) {
                    r39 r39Var = this.E;
                    float f2 = r39Var.e;
                    if (z) {
                        p = P;
                    }
                    bha bhaVar = this.P;
                    r39Var.a(p, bhaVar.c(bhaVar.h(this.L)), P, 0.0f);
                    r39Var.e = Math.max(0.0f, Math.min(1.0f, f2));
                    this.w.invalidate();
                }
            }
        }
        this.V = P;
        this.W = 0.0f;
        this.g0 = true;
    }

    public final void a() {
        zga zgaVar;
        f("ALIGN_BOUNDARY", this.F, 0, 0, true);
        if (this.F == null || (zgaVar = this.O) == null || this.N == null) {
            return;
        }
        int b = zgaVar.b();
        d49 layoutManager = this.F.getLayoutManager();
        if (b == -1 || !(layoutManager instanceof t26)) {
            return;
        }
        D();
        ((t26) layoutManager).g1(b, (Math.round(this.V) - this.F.getTop()) - this.F.getPaddingTop());
        this.h0 = true;
        requestLayout();
    }

    public final void b(RecyclerView recyclerView) {
        int height;
        if (this.N == null || recyclerView == null) {
            return;
        }
        D();
        View view = this.K;
        if (view == null) {
            height = 0;
        } else {
            int height2 = view.getHeight();
            View view2 = this.K;
            height = height2 > 0 ? view2.getHeight() : view2.getLayoutParams().height;
        }
        setBleed(recyclerView);
        w(recyclerView, Math.max(0, height) + Math.round(this.V) + this.T, this.N.Q() + this.U);
        if (recyclerView.isNestedScrollingEnabled()) {
            return;
        }
        recyclerView.setNestedScrollingEnabled(true);
    }

    public final boolean c() {
        wec wecVar = this.I;
        return (wecVar == null || wecVar.getCurrentView() == null || Float.isInfinite(p()) || this.c0 >= ((float) getHeight())) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0059, code lost:
    
        if (r5.E.f == false) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(Canvas canvas, RectF rectF, cha chaVar) {
        if (this.I != null && this.P != null && this.J.getVisibility() == 0 && this.I.getVisibility() == 0) {
            for (View view : this.I.getViewPages()) {
                if (view != null && view.getParent() == this.I && view.getVisibility() == 0) {
                    chaVar.m(canvas, rectF, this.P.h(view));
                }
            }
        }
        o39 o39Var = this.F;
        if (o39Var == null || o39Var.getVisibility() != 0) {
            return;
        }
        float x = this.e0 ? this.M.getX() : 0.0f;
        if (x == 0.0f) {
            chaVar.m(canvas, rectF, this.F);
            return;
        }
        RectF rectF2 = this.s;
        rectF2.set(rectF);
        rectF2.offset(-x, 0.0f);
        int save = canvas.save();
        try {
            canvas.translate(x, 0.0f);
            chaVar.m(canvas, rectF2, this.F);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        dha dhaVar;
        if (motionEvent.getActionMasked() == 0) {
            if (this.a) {
                this.n++;
                this.e = 0L;
                dhaVar = this;
                dhaVar.f("TOUCH_DOWN", null, 0, 0, true);
            } else {
                dhaVar = this;
            }
            dhaVar.B();
        } else {
            dhaVar = this;
            if (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) {
                dhaVar.f(motionEvent.getActionMasked() == 1 ? "TOUCH_UP" : "TOUCH_CANCEL", null, 0, 0, true);
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void e(String str, View view, int i, int i2) {
        if (this.a) {
            long uptimeMillis = SystemClock.uptimeMillis();
            if (uptimeMillis - this.e < 250) {
                return;
            }
            this.e = uptimeMillis;
            f(str.concat(i2 == 0 ? "_TOUCH" : "_NON_TOUCH"), view, i, i, true);
        }
    }

    public final void f(String str, View view, int i, int i2, boolean z) {
        bha bhaVar;
        if (this.a) {
            long uptimeMillis = SystemClock.uptimeMillis();
            if (!z) {
                if (uptimeMillis - this.d < 250) {
                    return;
                } else {
                    this.d = uptimeMillis;
                }
            }
            wec wecVar = this.I;
            int i3 = 0;
            View view2 = null;
            View view3 = wecVar == null ? null : wecVar.getViewPages()[0];
            wec wecVar2 = this.I;
            View view4 = wecVar2 == null ? null : wecVar2.getViewPages()[1];
            StringBuilder sb = new StringBuilder("root=");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" gesture=");
            sb.append(this.n);
            sb.append(" transition=");
            sb.append(this.r);
            sb.append(" event=");
            sb.append(str);
            sb.append(" target=");
            sb.append(h(view));
            sb.append(" dy=");
            sb.append(i);
            sb.append(" used=");
            sb.append(i2);
            sb.append(" transitioning=");
            sb.append(this.e0);
            sb.append(" progress=");
            sb.append(this.E.e);
            sb.append(" ageMs=");
            sb.append(this.e0 ? uptimeMillis - this.f : 0L);
            sb.append(" unchangedMs=");
            sb.append(this.e0 ? uptimeMillis - this.h : 0L);
            sb.append(" depth=");
            sb.append(this.R);
            sb.append(" updating=");
            sb.append(this.d0);
            sb.append(" callback=");
            sb.append(h(this.Q));
            sb.append(" common=");
            sb.append(h(this.F));
            sb.append(" active=");
            sb.append(h(this.G));
            sb.append(" current=");
            sb.append(h(view3));
            sb.append(" other=");
            sb.append(h(view4));
            sb.append(" source=");
            sb.append(h(this.L));
            sb.append(" incoming=");
            sb.append(h(this.M));
            sb.append(" boundary=");
            sb.append(p());
            sb.append(" pin=");
            sb.append(this.V);
            sb.append(" tail=");
            sb.append(this.b0);
            sb.append(" alignPending=");
            sb.append(this.h0);
            zga zgaVar = this.O;
            int i4 = -1;
            int b = zgaVar == null ? -1 : zgaVar.b();
            o39 o39Var = this.F;
            d49 layoutManager = o39Var == null ? null : o39Var.getLayoutManager();
            if (layoutManager != null && b != -1) {
                view2 = layoutManager.m(b);
            }
            StringBuilder m = de9.m(b, " row=", " anchor=");
            m.append(h(view2));
            m.append(" anchorTop=");
            m.append(view2 == null ? 0 : view2.getTop());
            m.append(" anchorHeight=");
            m.append(view2 == null ? 0 : view2.getHeight());
            m.append(" decoratedTop=");
            if (view2 != null) {
                layoutManager.getClass();
                i3 = d49.y(view2);
            }
            m.append(i3);
            m.append(" adapterPosition=");
            if (view2 != null) {
                this.F.getClass();
                i4 = RecyclerView.R(view2);
            }
            m.append(i4);
            m.append(" pageOffset=");
            RecyclerView recyclerView = this.G;
            m.append((recyclerView == null || (bhaVar = this.P) == null) ? 0.0f : bhaVar.c(recyclerView));
            m.append(" tabsTop=");
            m.append(this.c0);
            m.append(" draw=");
            m.append(this.c);
            sb.append(m.toString());
            Log.d("SiblingScroll", sb.toString());
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
        dha dhaVar;
        if (this.a) {
            dhaVar = this;
            dhaVar.f("TRANSITION_END_".concat(str), null, 0, 0, true);
        } else {
            dhaVar = this;
        }
        dhaVar.e0 = false;
        dhaVar.M = null;
        dhaVar.L = null;
        dhaVar.w.invalidate();
    }

    @Override // si7
    public final void k(int i, View view) {
        f(i == 0 ? "NESTED_STOP_TOUCH" : "NESTED_STOP_NON_TOUCH", view, 0, 0, true);
        zw8 zw8Var = this.x;
        if (i == 1) {
            zw8Var.c = 0;
        } else {
            zw8Var.b = 0;
        }
    }

    @Override // ti7
    public final void l(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        o39 o39Var;
        if (this.R != 0 || (view != (o39Var = this.F) && view != this.G)) {
            f("POST_IGNORED", view, i4, 0, false);
            return;
        }
        if (this.e0) {
            e("POST_BLOCKED", view, i4, i5);
            iArr[1] = iArr[1] + i4;
            return;
        }
        this.Q = view;
        try {
            ln8 ln8Var = this.j0;
            int i6 = 0;
            boolean z = view == o39Var;
            if (z && i2 > 0 && i4 > 0) {
                dha dhaVar = (dha) ln8Var.b;
                zga zgaVar = dhaVar.O;
                if (zgaVar != null && zgaVar.b() != -1) {
                    i6 = dhaVar.u(dhaVar.G, i4);
                }
            } else if (!z && i4 < 0) {
                dha dhaVar2 = (dha) ln8Var.b;
                i6 = dhaVar2.u(dhaVar2.F, i4);
            }
            iArr[1] = iArr[1] + i6;
            f("POST", view, i4, i6, false);
        } finally {
            this.Q = null;
            C();
        }
    }

    @Override // si7
    public final void m(View view, int i, int i2, int i3, int i4, int i5) {
        int[] iArr = this.y;
        iArr[1] = 0;
        iArr[0] = 0;
        l(view, i, i2, i3, i4, i5, iArr);
    }

    @Override // si7
    public final boolean n(View view, View view2, int i, int i2) {
        boolean z = false;
        boolean z2 = (i & 2) != 0;
        if (this.R == 0 && z2 && (view2 == this.F || view2 == this.G)) {
            z = true;
        }
        if (this.a) {
            f((z ? "NESTED_START" : "NESTED_REJECT") + "_axes=" + i + "_type=" + i2, view2, 0, 0, true);
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000f, code lost:
    
        if (r3.E.f == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean o(float f, float f2) {
        float f3;
        if (this.e0) {
            f3 = this.M.getX();
        }
        f3 = 0.0f;
        return f2 >= 0.0f && f2 < this.b0 && f >= Math.max(0.0f, f3) && f < Math.min((float) getWidth(), f3 + ((float) getWidth()));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnPreDrawListener(this.l0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        B();
        getViewTreeObserver().removeOnPreDrawListener(this.l0);
        super.onDetachedFromWindow();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        r(view, i, i2, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        m(view, i, i2, i3, i4, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        q(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return n(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        k(0, view);
    }

    public final float p() {
        View m;
        o39 o39Var = this.F;
        if (o39Var == null || this.O == null || o39Var.getLayoutManager() == null) {
            return Float.POSITIVE_INFINITY;
        }
        d49 layoutManager = this.F.getLayoutManager();
        int b = this.O.b();
        if (b == -1 || (m = layoutManager.m(b)) == null) {
            return Float.POSITIVE_INFINITY;
        }
        return (d49.y(m) + this.F.getTop()) - ((ViewGroup.MarginLayoutParams) ((e49) m.getLayoutParams())).topMargin;
    }

    @Override // si7
    public final void q(View view, View view2, int i, int i2) {
        zw8 zw8Var = this.x;
        if (i2 == 1) {
            zw8Var.c = i;
        } else {
            zw8Var.b = i;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0042, code lost:
    
        if (r9 <= 0.5f) goto L21;
     */
    @Override // si7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void r(View view, int i, int i2, int[] iArr, int i3) {
        o39 o39Var;
        if (this.R != 0 || (view != (o39Var = this.F) && view != this.G)) {
            f("PRE_IGNORED", view, i2, 0, false);
            return;
        }
        if (this.e0) {
            e("PRE_BLOCKED", view, i2, i3);
            iArr[1] = iArr[1] + i2;
            return;
        }
        this.Q = view;
        try {
            ln8 ln8Var = this.j0;
            int i4 = 0;
            if (view == o39Var) {
                if (i2 >= 0) {
                    dha dhaVar = (dha) ln8Var.b;
                    float p = dhaVar.p();
                    if (!Float.isInfinite(p)) {
                        p = Math.max(0.0f, p - dhaVar.V);
                    }
                }
                dha dhaVar2 = (dha) ln8Var.b;
                zga zgaVar = dhaVar2.O;
                if (zgaVar != null && zgaVar.b() != -1) {
                    i4 = dhaVar2.u(dhaVar2.G, i2);
                }
            } else if (i2 > 0) {
                dha dhaVar3 = (dha) ln8Var.b;
                float p2 = dhaVar3.p();
                if (!Float.isInfinite(p2)) {
                    p2 = Math.max(0.0f, p2 - dhaVar3.V);
                }
                int min = Float.isInfinite(p2) ? i2 : Math.min(i2, Math.max(0, Math.round(p2)));
                dha dhaVar4 = (dha) ln8Var.b;
                i4 = dhaVar4.u(dhaVar4.F, min);
            }
            iArr[1] = iArr[1] + i4;
            f("PRE", view, i2, i4, false);
        } finally {
            this.Q = null;
            C();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s() {
        wec wecVar;
        dha dhaVar;
        View view;
        if (this.d0 || (wecVar = this.I) == null || this.P == null || this.N == null) {
            return;
        }
        View[] viewPages = wecVar.getViewPages();
        boolean z = false;
        View view2 = viewPages[0];
        View view3 = viewPages[1];
        wec wecVar2 = this.I;
        if (wecVar2 instanceof s39) {
            s39 s39Var = (s39) wecVar2;
            if (view2 != null && view3 != null && view2 == s39Var.b0 && view3 == s39Var.c0 && !s39Var.I && view2.getTranslationX() == 0.0f && view2.getMeasuredWidth() > 0 && Math.abs(view3.getTranslationX()) >= view2.getMeasuredWidth()) {
                z = true;
            }
        }
        if (this.e0 && z) {
            i("drag_aborted");
        }
        if (this.e0 && (view3 == null || ((view2 != (view = this.L) && view2 != this.M) || (view3 != view && view3 != this.M)))) {
            i("page_slots_changed");
        }
        t();
        boolean z2 = this.e0;
        oc6 oc6Var = this.w;
        r39 r39Var = this.E;
        if (!z2 && !z && view2 != null && view3 != null) {
            float p = p();
            if (!Float.isInfinite(p)) {
                D();
                B();
                this.L = view2;
                this.M = view3;
                float f = this.V;
                if (p <= 0.5f + f) {
                    p = f;
                }
                bha bhaVar = this.P;
                r39Var.a(p, bhaVar.c(bhaVar.h(view2)), this.V, this.W);
                this.e0 = true;
                if (this.a) {
                    this.r++;
                    long uptimeMillis = SystemClock.uptimeMillis();
                    this.f = uptimeMillis;
                    this.h = uptimeMillis;
                    this.e = 0L;
                    dhaVar = this;
                    dhaVar.f("TRANSITION_BEGIN", view2, 0, 0, true);
                } else {
                    dhaVar = this;
                }
                oc6Var.invalidate();
                if (dhaVar.e0) {
                    float max = Math.max(1, dhaVar.L.getWidth());
                    float f2 = r39Var.e;
                    float max2 = Math.max(0.0f, Math.min(1.0f, Math.abs(dhaVar.L.getTranslationX()) / max));
                    r39Var.e = max2;
                    if (f2 != max2) {
                        oc6Var.invalidate();
                        if (dhaVar.a) {
                            dhaVar.h = SystemClock.uptimeMillis();
                        }
                    }
                }
                dhaVar.C();
            }
        }
        dhaVar = this;
        if (dhaVar.e0) {
        }
        dhaVar.C();
    }

    public void setCommonInsetsManagedExternally(boolean z) {
        if (this.i0 == z) {
            return;
        }
        this.i0 = z;
        C();
        requestLayout();
    }

    public void setDebugLoggingEnabled(boolean z) {
        this.a = z;
        if (z) {
            this.d = 0L;
            this.e = 0L;
            long uptimeMillis = SystemClock.uptimeMillis();
            this.f = uptimeMillis;
            this.h = uptimeMillis;
            f("DEBUG_ENABLED", null, 0, 0, true);
        }
    }

    public void setGeometry(aha ahaVar) {
        this.N = ahaVar;
        requestLayout();
        C();
    }

    public final void t() {
        wec wecVar = this.I;
        RecyclerView h = (wecVar == null || this.P == null || wecVar.getCurrentView() == null) ? null : this.P.h(this.I.getCurrentView());
        if (h != this.G) {
            f("ACTIVE_CHANGE", h, 0, 0, true);
            RecyclerView recyclerView = this.G;
            n58 n58Var = this.k0;
            if (recyclerView != null) {
                recyclerView.D0();
                ArrayList arrayList = this.G.x0;
                if (arrayList != null) {
                    arrayList.remove(n58Var);
                }
            }
            this.G = h;
            if (h != null) {
                h.j(n58Var);
            }
        }
    }

    public final int u(RecyclerView recyclerView, int i) {
        if (recyclerView == null || i == 0) {
            if (i != 0) {
                f("TRANSFER_NO_TARGET", recyclerView, i, 0, false);
            }
            return 0;
        }
        if (recyclerView == this.Q) {
            f("TRANSFER_REENTRY", recyclerView, i, 0, true);
            sc8.j("Reentrant scrollBy on nested source");
            return 0;
        }
        RecyclerView recyclerView2 = this.H;
        int i2 = this.S;
        this.H = recyclerView;
        this.S = 0;
        this.R++;
        try {
            recyclerView.scrollBy(0, i);
            int i3 = this.S;
            int max = i > 0 ? Math.max(0, Math.min(i, i3)) : Math.min(0, Math.max(i, i3));
            f(i3 == 0 ? "TRANSFER_ZERO" : "TRANSFER", recyclerView, i, max, false);
            return max;
        } finally {
            this.R--;
            this.H = recyclerView2;
            this.S = i2;
        }
    }

    public final void v(o39 o39Var, zga zgaVar) {
        o39 o39Var2 = this.F;
        oc6 oc6Var = this.w;
        n58 n58Var = this.k0;
        if (o39Var2 != null) {
            o39Var2.D0();
            ArrayList arrayList = this.F.x0;
            if (arrayList != null) {
                arrayList.remove(n58Var);
            }
            oc6Var.removeView(this.F);
        }
        this.F = o39Var;
        this.O = zgaVar;
        oc6Var.addView(o39Var, new FrameLayout.LayoutParams(-1, -1));
        o39Var.j(n58Var);
        o39Var.setNestedScrollingEnabled(true);
        C();
    }

    public final void x(View view, float f) {
        if (view == null) {
            return;
        }
        this.P.h(view).setTranslationY((f + this.V) - Math.round(r1));
    }

    public final void y(View view, wec wecVar, bha bhaVar) {
        View view2 = this.J;
        if (view2 != null) {
            removeView(view2);
        }
        this.J = view;
        this.I = wecVar;
        this.P = bhaVar;
        addView(view, 0, new FrameLayout.LayoutParams(-1, -1));
        C();
    }

    public final void z(View view) {
        View view2 = this.K;
        if (view2 != null) {
            removeView(view2);
        }
        this.K = view;
        addView(view, new FrameLayout.LayoutParams(-1, -2, 48));
        C();
    }
}
