package ch;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.OvershootInterpolator;
import bi.g7;
import c8.ma;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.cz;
import org.telegram.messenger.fc;
import org.telegram.messenger.ls;
import org.telegram.messenger.qc;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.hb0;
import org.telegram.ui.Components.kv;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.su0;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.bn;
import org.telegram.ui.c11;
import org.telegram.ui.g01;
import org.telegram.ui.n01;
import org.telegram.ui.q01;
import org.telegram.ui.u01;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class b0 {
    public final int[] A;
    public final h2.f B;
    public boolean C;
    public final HashSet D;
    public final ArrayList E;
    public int F;
    public final a0 a;
    public final WindowManager b;
    public final ai.l0 c;
    public final boolean d;
    public float e;
    public float g;
    public float h;
    public float j;
    public boolean k;
    public boolean l;
    public final x m;
    public final xi0 n;
    public final List o;
    public hb0 p;
    public boolean q;
    public final g2 r;
    public final h6 s;
    public float t;
    public float u;
    public boolean v;
    public boolean w;
    public ValueAnimator x;
    public final int y;
    public fh.g z;
    public final RectF f = new RectF();
    public final RectF i = new RectF();

    public b0(int i7, g2 g2Var, ArrayList arrayList, HashSet hashSet, xi0 xi0Var, h6 h6Var, boolean z10) {
        new Path();
        this.A = new int[2];
        this.B = new h2.f((int[]) null);
        this.D = new HashSet();
        this.E = new ArrayList();
        int i10 = 0;
        this.F = 0;
        this.y = i7;
        this.o = arrayList;
        this.r = g2Var;
        this.s = h6Var;
        Context context = g2Var != null ? g2Var.getContext() : xi0Var.getContext();
        ai.l0 l0Var = new ai.l0(this, context);
        this.c = l0Var;
        l0Var.setOnClickListener(new ah.d(this, 8));
        boolean z11 = i7 == 2 || i7 == 4 || i7 == 5 || z10;
        this.d = z11;
        a0 a0Var = new a0(this, context);
        this.a = a0Var;
        boolean z12 = z11;
        x xVar = new x(this, g2Var, context, xi0Var.getWindowType(), i7 != 1, h6Var, xi0Var, g2Var);
        this.m = xVar;
        xVar.setOutlineProvider(new y(this));
        xVar.setClipToOutline(true);
        boolean z13 = xi0Var.h1;
        boolean z14 = xi0Var.i1;
        if (xVar.M1 != z13) {
            xVar.M1 = z13;
            xVar.N1 = z14;
            q01 q01Var = xVar.i0;
            if (q01Var != null) {
                q01Var.invalidate();
            }
            g01 g01Var = xVar.j0;
            if (g01Var != null) {
                g01Var.invalidate();
            }
        }
        xVar.setOnLongPressedListener(new cb.c(xi0Var, 11));
        int i11 = 6;
        xVar.setOnRecentClearedListener(new sa.d(i11));
        xVar.setRecentReactions(arrayList);
        xVar.setSelectedReactions((HashSet<p0>) hashSet);
        xVar.setDrawBackground(false);
        xVar.s(null);
        a0Var.addView(xVar, ma.d(-1, -2.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        int i12 = i7 == 5 ? 2 : 16;
        if (i7 == 5) {
            a0Var.setClipChildren(false);
            a0Var.setClipToPadding(false);
            l0Var.setClipChildren(false);
            l0Var.setClipToPadding(false);
        }
        float f10 = i12;
        l0Var.addView(a0Var, ma.d(-1, -1.0f, i7 == 5 ? 85 : 48, f10, f10, f10, 16.0f));
        l0Var.setClipChildren(false);
        if (i7 == 1 || (xi0Var.getDelegate() != null && xi0Var.getDelegate().E())) {
            xVar.setBackgroundDelegate(new ab.g(9, this, xi0Var));
        }
        if (z12) {
            ((ViewGroup) xi0Var.getParent()).addView(l0Var);
        } else {
            WindowManager.LayoutParams b10 = b(false);
            WindowManager windowManager = org.telegram.messenger.g0.W(context).getWindowManager();
            this.b = windowManager;
            org.telegram.messenger.g0.w3(windowManager, l0Var, b10);
            windowManager.addView(l0Var, b10);
        }
        this.n = xi0Var;
        xi0Var.setOnSwitchedToLoopView(new t(this, i10));
        xi0Var.d1 = true;
        xi0Var.invalidate();
        org.telegram.messenger.g0.h3(new c1.a(i11, this, xi0Var), 50L);
        if (i7 != 5) {
            ls.e().k(ls.j1, 7);
        }
    }

    public static void a(b0 b0Var, boolean z10) {
        View view;
        xi0 xi0Var = b0Var.n;
        x xVar = b0Var.m;
        if (b0Var.E.isEmpty()) {
            b0Var.h(false);
            f0.a();
            b0Var.B.e();
            xVar.setEnterAnimationInProgress(false);
            q01 q01Var = xVar.i0;
            if (z10) {
                xVar.e0.m(false);
                q01Var.invalidate();
                ArrayList arrayList = q01Var.i3;
                q01Var.g1();
                xVar.g0.b();
                xVar.sendAccessibilityEvent(32);
                xi0Var.setImportantForAccessibility(4);
                int i7 = 0;
                while (true) {
                    if (i7 >= q01Var.getChildCount()) {
                        view = null;
                        break;
                    } else {
                        if (q01Var.getChildAt(i7) instanceof c11) {
                            view = q01Var.getChildAt(i7);
                            break;
                        }
                        i7++;
                    }
                }
                if (view != null) {
                    view.performAccessibilityAction(64, null);
                } else {
                    xVar.performAccessibilityAction(64, null);
                }
                if (xi0Var.getPullingLeftProgress() > 0.0f) {
                    xi0Var.P0 = false;
                    ValueAnimator valueAnimator = xi0Var.z0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    xi0Var.C0 = 0.0f;
                    ai.l0 l0Var = xi0Var.T;
                    if (l0Var != null) {
                        l0Var.invalidate();
                    }
                    xi0Var.invalidate();
                } else {
                    xi0Var.P0 = true;
                    ValueAnimator valueAnimator2 = xi0Var.z0;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    xi0Var.C0 = 0.0f;
                    ai.l0 l0Var2 = xi0Var.T;
                    if (l0Var2 != null) {
                        l0Var2.invalidate();
                    }
                    xi0Var.invalidate();
                }
                g01 g01Var = xVar.j0;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    u01 u01Var = (u01) arrayList.get(i10);
                    for (int i11 = 0; i11 < u01Var.P.size(); i11++) {
                        if (((c11) u01Var.P.get(i11)).b) {
                            ((c11) u01Var.P.get(i11)).b = false;
                            ((c11) u01Var.P.get(i11)).invalidate();
                            u01Var.k();
                        }
                    }
                }
                q01Var.invalidate();
                for (int i12 = 0; i12 < g01Var.i3.size(); i12++) {
                    u01 u01Var2 = (u01) g01Var.i3.get(i12);
                    for (int i13 = 0; i13 < u01Var2.P.size(); i13++) {
                        if (((c11) u01Var2.P.get(i13)).b) {
                            ((c11) u01Var2.P.get(i13)).b = false;
                            ((c11) u01Var2.P.get(i13)).invalidate();
                            u01Var2.k();
                        }
                    }
                }
                g01Var.invalidate();
                b0Var.i();
                b0Var.a.invalidate();
            }
        }
    }

    public static void g(View view, float f10) {
        if (view instanceof c11) {
            ((c11) view).setAnimatedScale(f10);
        } else if (view instanceof kv) {
            view.setScaleX(f10);
            view.setScaleY(f10);
        }
    }

    public final WindowManager.LayoutParams b(boolean z10) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.height = -1;
        layoutParams.width = -1;
        int i7 = this.y;
        layoutParams.type = (i7 == 0 || i7 == 3) ? 1000 : 99;
        layoutParams.softInputMode = 16;
        if (z10) {
            layoutParams.flags = 65792;
        } else {
            layoutParams.flags = 65800;
        }
        layoutParams.format = -3;
        return layoutParams;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v4 */
    /* JADX WARN: Type inference failed for: r18v5 */
    /* JADX WARN: Type inference failed for: r18v6 */
    public final void c(boolean z10) {
        ?? r18;
        boolean z11;
        ValueAnimator valueAnimator;
        boolean z12;
        x xVar = this.m;
        int i7 = this.y;
        ai.l0 l0Var = this.c;
        int[] iArr = this.A;
        a0 a0Var = this.a;
        RectF rectF = this.f;
        xi0 xi0Var = this.n;
        rectF.set(xi0Var.x);
        this.e = xi0Var.E;
        int[] iArr2 = new int[2];
        if (z10) {
            xi0Var.getLocationOnScreen(iArr);
        }
        l0Var.getLocationOnScreen(iArr2);
        int i10 = 0;
        float topOffset = xi0Var.getTopOffset() + ((((iArr[1] - iArr2[1]) - org.telegram.messenger.g0.L(44.0f)) - org.telegram.messenger.g0.L(52.0f)) - (xVar.P0 ? org.telegram.messenger.g0.L(26.0f) : 0));
        if (xi0Var.G0) {
            topOffset = (iArr[1] - iArr2[1]) - org.telegram.messenger.g0.L(12.0f);
        }
        if (a0Var.getMeasuredHeight() + topOffset > l0Var.getMeasuredHeight() - org.telegram.messenger.g0.L(32.0f)) {
            topOffset = (l0Var.getMeasuredHeight() - org.telegram.messenger.g0.L(32.0f)) - a0Var.getMeasuredHeight();
        }
        if (topOffset < org.telegram.messenger.g0.L(16.0f)) {
            topOffset = org.telegram.messenger.g0.L(16.0f);
        }
        if (i7 == 5) {
            topOffset = Math.min(topOffset, 0.0f);
        }
        if (i7 == 1) {
            r18 = 1;
            a0Var.setTranslationX(((l0Var.getMeasuredWidth() - a0Var.getMeasuredWidth()) / 2.0f) - org.telegram.messenger.g0.L(16.0f));
        } else {
            boolean z13 = true;
            if (i7 == 2 || i7 == 4) {
                a0Var.setTranslationX((iArr[0] - iArr2[0]) - org.telegram.messenger.g0.L(18.0f));
                r18 = z13;
            } else {
                a0Var.setTranslationX((iArr[0] - iArr2[0]) - org.telegram.messenger.g0.L(2.0f));
                r18 = z13;
            }
        }
        if (z10) {
            this.t = topOffset;
            a0Var.setTranslationY(topOffset);
        } else {
            this.t = a0Var.getTranslationY();
        }
        float x10 = (iArr[0] - iArr2[0]) - a0Var.getX();
        this.g = x10;
        float y10 = (iArr[r18] - iArr2[r18]) - a0Var.getY();
        this.h = y10;
        rectF.offset(x10, y10);
        xi0Var.setCustomEmojiEnterProgress(this.j);
        if (z10) {
            this.w = (cz.o() < 2 || !qc.e(8200)) ? false : r18;
            this.k = false;
        } else {
            this.w = false;
        }
        if (this.w) {
            z11 = r18;
            j(z11, 0.0f);
        } else {
            z11 = r18;
        }
        k();
        xVar.setEnterAnimationInProgress(z11);
        xVar.e0.m(z10 && this.w);
        this.B.d();
        ValueAnimator valueAnimator2 = this.x;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        this.C = true;
        float f10 = this.j;
        if (i7 == 4) {
            valueAnimator = ValueAnimator.ofFloat(f10, z10 ? 1.0f : 0.0f);
        } else {
            float f11 = z10 ? 1.0f : 0.0f;
            su0 su0Var = new su0();
            su0Var.a = 0;
            su0Var.b = 0;
            su0Var.setFloatValues(new float[]{f10, f11});
            valueAnimator = su0Var;
        }
        this.x = valueAnimator;
        valueAnimator.addUpdateListener(new v(i10, this, z10));
        if (!z10) {
            i();
        }
        this.x.addListener(new g7(1, this, z10));
        if (i7 == 4) {
            this.x.setDuration(420L);
            this.x.setInterpolator(nr.h);
        } else if (this.w) {
            this.x.setDuration(450L);
            org.telegram.ui.Cells.c0.q(0.5f, this.x);
        } else {
            this.x.setDuration(350L);
            this.x.setInterpolator(nr.f);
        }
        a0Var.invalidate();
        h(true);
        if (z10) {
            xi0Var.setCustomEmojiReactionsBackground(false);
            ValueAnimator valueAnimator3 = this.x;
            Objects.requireNonNull(valueAnimator3);
            ca.r rVar = new ca.r(valueAnimator3, 3);
            f0.f = this.w;
            f0.e = true;
            f0.g = false;
            if (f0.d) {
                f0.d = false;
            }
            f0.c = rVar;
        } else {
            xi0Var.P0 = true;
            xi0Var.invalidate();
            this.x.setStartDelay(30L);
            this.x.start();
        }
        HashSet hashSet = f0.a;
        com.google.android.gms.internal.cast.b0 b0Var = fc.D().p;
        if (((CountDownLatch) b0Var.c) == null) {
            z12 = true;
            b0Var.c = new CountDownLatch(1);
        } else {
            z12 = true;
        }
        f0.b = z12;
        f0.e = false;
        f0.g = false;
    }

    public final void d() {
        if (this.q) {
            return;
        }
        xi0 xi0Var = this.n;
        if (xi0Var != null) {
            ValueAnimator valueAnimator = xi0Var.z0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            xi0Var.C0 = 0.0f;
            ai.l0 l0Var = xi0Var.T;
            if (l0Var != null) {
                l0Var.invalidate();
            }
            xi0Var.invalidate();
        }
        gc.e();
        this.q = true;
        org.telegram.messenger.g0.v1(this.c);
        c(false);
        if (this.v) {
            g2 g2Var = this.r;
            if (g2Var instanceof bn) {
                ((bn) g2Var).wa(true, true);
            }
        }
    }

    public final void e() {
        if (this.q) {
            return;
        }
        gc.e();
        this.q = true;
        ai.l0 l0Var = this.c;
        org.telegram.messenger.g0.v1(l0Var);
        l0Var.animate().alpha(0.0f).setDuration(150L).setListener(new z(this, 1));
        if (this.v) {
            g2 g2Var = this.r;
            if (g2Var instanceof bn) {
                ((bn) g2Var).wa(true, true);
            }
        }
    }

    public final void f() {
        int i7 = 1;
        if (this.y != 5) {
            ls.e().k(ls.k1, 7);
        }
        org.telegram.messenger.g0.g3(new t(this, i7));
    }

    public final void h(boolean z10) {
        int i7 = z10 ? 2 : 0;
        x xVar = this.m;
        xVar.i0.setLayerType(i7, null);
        xVar.g0.setLayerType(i7, null);
        if (!this.w) {
            xVar.f0.setLayerType(i7, null);
            xVar.e0.setLayerType(i7, null);
        } else {
            for (int i10 = 0; i10 < Math.min(xVar.e0.b.getChildCount(), 16); i10++) {
                xVar.e0.b.getChildAt(i10).setLayerType(i7, null);
            }
        }
    }

    public final void i() {
        int i7 = 0;
        while (true) {
            x xVar = this.m;
            q01 q01Var = xVar.i0;
            q01 q01Var2 = xVar.i0;
            if (i7 >= q01Var.getChildCount()) {
                return;
            }
            if (q01Var2.getChildAt(i7) instanceof c11) {
                c11 c11Var = (c11) q01Var2.getChildAt(i7);
                if (c11Var.y != null) {
                    c11Var.b = false;
                    c11Var.invalidate();
                }
            }
            i7++;
        }
    }

    public final void j(boolean z10, float f10) {
        RectF rectF;
        int i7;
        HashSet hashSet;
        x xVar = this.m;
        float y10 = xVar.getY();
        n01 n01Var = xVar.b0;
        float y11 = n01Var.getY() + y10;
        q01 q01Var = xVar.i0;
        int y12 = (int) (q01Var.getY() + y11);
        ArrayList arrayList = null;
        int i10 = 0;
        int i11 = 0;
        boolean z11 = false;
        while (true) {
            int childCount = q01Var.getChildCount();
            rectF = this.i;
            i7 = 1;
            hashSet = this.D;
            if (i11 >= childCount) {
                break;
            }
            View childAt = q01Var.getChildAt(i11);
            if (!hashSet.contains(childAt)) {
                float measuredHeight = (childAt.getMeasuredHeight() / 2.0f) + childAt.getTop() + y12;
                if (measuredHeight >= rectF.bottom || measuredHeight <= rectF.top || f10 == 0.0f) {
                    g(childAt, 0.0f);
                    z11 = true;
                } else {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(childAt);
                    hashSet.add(childAt);
                }
            }
            i11++;
        }
        int y13 = (int) (xVar.e0.getY() + n01Var.getY() + xVar.getY());
        for (int i12 = 0; i12 < xVar.e0.b.getChildCount(); i12++) {
            View childAt2 = xVar.e0.b.getChildAt(i12);
            if (!hashSet.contains(childAt2)) {
                float measuredHeight2 = (childAt2.getMeasuredHeight() / 2.0f) + childAt2.getTop() + y13;
                if (measuredHeight2 >= rectF.bottom || measuredHeight2 <= rectF.top || f10 == 0.0f) {
                    g(childAt2, 0.0f);
                    z11 = true;
                } else {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(childAt2);
                    hashSet.add(childAt2);
                }
            }
        }
        if (z11) {
            xVar.l0.invalidate();
        }
        if (arrayList != null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new w(i10, this, arrayList));
            this.E.add(ofFloat);
            ofFloat.addListener(new androidx.fragment.app.g(this, ofFloat, z10, i7));
            if (this.y == 4) {
                ofFloat.setDuration(420L);
                ofFloat.setInterpolator(nr.h);
            } else {
                ofFloat.setDuration(350L);
                ofFloat.setInterpolator(new OvershootInterpolator(1.0f));
            }
            ofFloat.start();
        }
    }

    public final void k() {
        if (this.w) {
            return;
        }
        x xVar = this.m;
        xVar.g0.setAlpha(this.j);
        xVar.i0.setAlpha(this.j);
        xVar.j0.setAlpha(this.j);
        xVar.e0.setAlpha(this.j);
        xVar.f0.setAlpha(this.j);
    }

    public final void l() {
        x xVar = this.m;
        n01 n01Var = xVar.b0;
        n01 n01Var2 = xVar.b0;
        boolean z10 = this.w;
        a0 a0Var = this.a;
        n01Var.setTranslationX(z10 ? 0.0f : a0Var.f);
        n01Var2.setTranslationY(a0Var.h);
        n01Var2.setPivotX(a0Var.r);
        n01Var2.setPivotY(a0Var.s);
        n01Var2.setScaleX(a0Var.n);
        n01Var2.setScaleY(a0Var.n);
    }
}
