package ch;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.OvershootInterpolator;
import bi.v4;
import c8.ja;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.fc;
import org.telegram.messenger.gz;
import org.telegram.messenger.i20;
import org.telegram.messenger.ns;
import org.telegram.messenger.qc;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.cv;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.hu0;
import org.telegram.ui.Components.mi0;
import org.telegram.ui.Components.wa0;
import org.telegram.ui.Components.xb;
import org.telegram.ui.an;
import org.telegram.ui.b01;
import org.telegram.ui.i01;
import org.telegram.ui.l01;
import org.telegram.ui.p01;
import org.telegram.ui.x01;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
    public final ai.k0 c;
    public final boolean d;
    public float e;
    public float g;
    public float h;
    public float j;
    public boolean k;
    public boolean l;
    public final x m;
    public final mi0 n;
    public final List o;
    public wa0 p;
    public boolean q;
    public final e2 r;
    public final e6 s;
    public float t;
    public float u;
    public boolean v;
    public boolean w;
    public ValueAnimator x;
    public final int y;
    public fh.g z;
    public final RectF f = new RectF();
    public final RectF i = new RectF();

    public b0(int i7, e2 e2Var, ArrayList arrayList, HashSet hashSet, mi0 mi0Var, e6 e6Var, boolean z10) {
        new Path();
        this.A = new int[2];
        this.B = new h2.f((int[]) null);
        this.D = new HashSet();
        this.E = new ArrayList();
        int i10 = 0;
        this.F = 0;
        this.y = i7;
        this.o = arrayList;
        this.r = e2Var;
        this.s = e6Var;
        Context context = e2Var != null ? e2Var.getContext() : mi0Var.getContext();
        ai.k0 k0Var = new ai.k0(this, context);
        this.c = k0Var;
        k0Var.setOnClickListener(new ah.d(this, 8));
        boolean z11 = i7 == 2 || i7 == 4 || i7 == 5 || z10;
        this.d = z11;
        a0 a0Var = new a0(this, context);
        this.a = a0Var;
        boolean z12 = z11;
        x xVar = new x(this, e2Var, context, mi0Var.getWindowType(), i7 != 1, e6Var, mi0Var, e2Var);
        this.m = xVar;
        xVar.setOutlineProvider(new y(this));
        xVar.setClipToOutline(true);
        boolean z13 = mi0Var.h1;
        boolean z14 = mi0Var.i1;
        if (xVar.M1 != z13) {
            xVar.M1 = z13;
            xVar.N1 = z14;
            l01 l01Var = xVar.i0;
            if (l01Var != null) {
                l01Var.invalidate();
            }
            b01 b01Var = xVar.j0;
            if (b01Var != null) {
                b01Var.invalidate();
            }
        }
        int i11 = 10;
        xVar.setOnLongPressedListener(new ob.c(mi0Var, i11));
        xVar.setOnRecentClearedListener(new sa.d(6));
        xVar.setRecentReactions(arrayList);
        xVar.setSelectedReactions((HashSet<p0>) hashSet);
        xVar.setDrawBackground(false);
        xVar.s(null);
        a0Var.addView(xVar, ja.d(-1, -2.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        int i12 = i7 == 5 ? 2 : 16;
        if (i7 == 5) {
            a0Var.setClipChildren(false);
            a0Var.setClipToPadding(false);
            k0Var.setClipChildren(false);
            k0Var.setClipToPadding(false);
        }
        float f10 = i12;
        k0Var.addView(a0Var, ja.d(-1, -1.0f, i7 == 5 ? 85 : 48, f10, f10, f10, 16.0f));
        k0Var.setClipChildren(false);
        if (i7 == 1 || (mi0Var.getDelegate() != null && mi0Var.getDelegate().L())) {
            xVar.setBackgroundDelegate(new ab.g(i11, this, mi0Var));
        }
        if (z12) {
            ((ViewGroup) mi0Var.getParent()).addView(k0Var);
        } else {
            WindowManager.LayoutParams b10 = b(false);
            WindowManager windowManager = org.telegram.messenger.g0.W(context).getWindowManager();
            this.b = windowManager;
            org.telegram.messenger.g0.x3(windowManager, k0Var, b10);
            windowManager.addView(k0Var, b10);
        }
        this.n = mi0Var;
        mi0Var.setOnSwitchedToLoopView(new s(this, i10));
        mi0Var.d1 = true;
        mi0Var.invalidate();
        org.telegram.messenger.g0.i3(new c1.c(5, this, mi0Var), 50L);
        if (i7 != 5) {
            ns.e().k(ns.j1, 7);
        }
    }

    public static void a(b0 b0Var, boolean z10) {
        View view;
        mi0 mi0Var = b0Var.n;
        x xVar = b0Var.m;
        if (b0Var.E.isEmpty()) {
            b0Var.h(false);
            f0.a();
            b0Var.B.e();
            xVar.setEnterAnimationInProgress(false);
            l01 l01Var = xVar.i0;
            if (z10) {
                xVar.e0.m(false);
                l01Var.invalidate();
                ArrayList arrayList = l01Var.i3;
                l01Var.g1();
                xVar.g0.b();
                xVar.sendAccessibilityEvent(32);
                mi0Var.setImportantForAccessibility(4);
                int i7 = 0;
                while (true) {
                    if (i7 >= l01Var.getChildCount()) {
                        view = null;
                        break;
                    } else {
                        if (l01Var.getChildAt(i7) instanceof x01) {
                            view = l01Var.getChildAt(i7);
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
                if (mi0Var.getPullingLeftProgress() > 0.0f) {
                    mi0Var.P0 = false;
                    ValueAnimator valueAnimator = mi0Var.z0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    mi0Var.C0 = 0.0f;
                    ai.k0 k0Var = mi0Var.T;
                    if (k0Var != null) {
                        k0Var.invalidate();
                    }
                    mi0Var.invalidate();
                } else {
                    mi0Var.P0 = true;
                    ValueAnimator valueAnimator2 = mi0Var.z0;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    mi0Var.C0 = 0.0f;
                    ai.k0 k0Var2 = mi0Var.T;
                    if (k0Var2 != null) {
                        k0Var2.invalidate();
                    }
                    mi0Var.invalidate();
                }
                b01 b01Var = xVar.j0;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    p01 p01Var = (p01) arrayList.get(i10);
                    for (int i11 = 0; i11 < p01Var.P.size(); i11++) {
                        if (((x01) p01Var.P.get(i11)).b) {
                            ((x01) p01Var.P.get(i11)).b = false;
                            ((x01) p01Var.P.get(i11)).invalidate();
                            p01Var.k();
                        }
                    }
                }
                l01Var.invalidate();
                for (int i12 = 0; i12 < b01Var.i3.size(); i12++) {
                    p01 p01Var2 = (p01) b01Var.i3.get(i12);
                    for (int i13 = 0; i13 < p01Var2.P.size(); i13++) {
                        if (((x01) p01Var2.P.get(i13)).b) {
                            ((x01) p01Var2.P.get(i13)).b = false;
                            ((x01) p01Var2.P.get(i13)).invalidate();
                            p01Var2.k();
                        }
                    }
                }
                b01Var.invalidate();
                b0Var.i();
                b0Var.a.invalidate();
            }
        }
    }

    public static void g(View view, float f10) {
        if (view instanceof x01) {
            ((x01) view).setAnimatedScale(f10);
        } else if (view instanceof cv) {
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
        ai.k0 k0Var = this.c;
        int[] iArr = this.A;
        a0 a0Var = this.a;
        RectF rectF = this.f;
        mi0 mi0Var = this.n;
        rectF.set(mi0Var.x);
        this.e = mi0Var.E;
        int[] iArr2 = new int[2];
        if (z10) {
            mi0Var.getLocationOnScreen(iArr);
        }
        k0Var.getLocationOnScreen(iArr2);
        int i10 = 0;
        float topOffset = mi0Var.getTopOffset() + ((((iArr[1] - iArr2[1]) - org.telegram.messenger.g0.L(44.0f)) - org.telegram.messenger.g0.L(52.0f)) - (xVar.P0 ? org.telegram.messenger.g0.L(26.0f) : 0));
        if (mi0Var.G0) {
            topOffset = (iArr[1] - iArr2[1]) - org.telegram.messenger.g0.L(12.0f);
        }
        if (a0Var.getMeasuredHeight() + topOffset > k0Var.getMeasuredHeight() - org.telegram.messenger.g0.L(32.0f)) {
            topOffset = (k0Var.getMeasuredHeight() - org.telegram.messenger.g0.L(32.0f)) - a0Var.getMeasuredHeight();
        }
        if (topOffset < org.telegram.messenger.g0.L(16.0f)) {
            topOffset = org.telegram.messenger.g0.L(16.0f);
        }
        if (i7 == 5) {
            topOffset = Math.min(topOffset, 0.0f);
        }
        if (i7 == 1) {
            r18 = 1;
            a0Var.setTranslationX(((k0Var.getMeasuredWidth() - a0Var.getMeasuredWidth()) / 2.0f) - org.telegram.messenger.g0.L(16.0f));
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
        mi0Var.setCustomEmojiEnterProgress(this.j);
        if (z10) {
            this.w = (gz.o() < 2 || !qc.e(8200)) ? false : r18;
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
            hu0 hu0Var = new hu0();
            hu0Var.a = 0;
            hu0Var.b = 0;
            hu0Var.setFloatValues(new float[]{f10, f11});
            valueAnimator = hu0Var;
        }
        this.x = valueAnimator;
        valueAnimator.addUpdateListener(new u(i10, this, z10));
        if (!z10) {
            i();
        }
        this.x.addListener(new v4(1, this, z10));
        if (i7 == 4) {
            this.x.setDuration(420L);
            this.x.setInterpolator(er.h);
        } else if (this.w) {
            this.x.setDuration(450L);
            i20.k(0.5f, this.x);
        } else {
            this.x.setDuration(350L);
            this.x.setInterpolator(er.f);
        }
        a0Var.invalidate();
        h(true);
        if (z10) {
            mi0Var.setCustomEmojiReactionsBackground(false);
            ValueAnimator valueAnimator3 = this.x;
            Objects.requireNonNull(valueAnimator3);
            a3.f fVar = new a3.f(valueAnimator3, 29);
            f0.f = this.w;
            f0.e = true;
            f0.g = false;
            if (f0.d) {
                f0.d = false;
            }
            f0.c = fVar;
        } else {
            mi0Var.P0 = true;
            mi0Var.invalidate();
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
        mi0 mi0Var = this.n;
        if (mi0Var != null) {
            ValueAnimator valueAnimator = mi0Var.z0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            mi0Var.C0 = 0.0f;
            ai.k0 k0Var = mi0Var.T;
            if (k0Var != null) {
                k0Var.invalidate();
            }
            mi0Var.invalidate();
        }
        xb.e();
        this.q = true;
        org.telegram.messenger.g0.v1(this.c);
        c(false);
        if (this.v) {
            e2 e2Var = this.r;
            if (e2Var instanceof an) {
                ((an) e2Var).wa(true, true);
            }
        }
    }

    public final void e() {
        if (this.q) {
            return;
        }
        xb.e();
        this.q = true;
        ai.k0 k0Var = this.c;
        org.telegram.messenger.g0.v1(k0Var);
        k0Var.animate().alpha(0.0f).setDuration(150L).setListener(new z(this, 1));
        if (this.v) {
            e2 e2Var = this.r;
            if (e2Var instanceof an) {
                ((an) e2Var).wa(true, true);
            }
        }
    }

    public final void f() {
        int i7 = 1;
        if (this.y != 5) {
            ns.e().k(ns.k1, 7);
        }
        org.telegram.messenger.g0.h3(new s(this, i7));
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
            l01 l01Var = xVar.i0;
            l01 l01Var2 = xVar.i0;
            if (i7 >= l01Var.getChildCount()) {
                return;
            }
            if (l01Var2.getChildAt(i7) instanceof x01) {
                x01 x01Var = (x01) l01Var2.getChildAt(i7);
                if (x01Var.y != null) {
                    x01Var.b = false;
                    x01Var.invalidate();
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
        i01 i01Var = xVar.b0;
        float y11 = i01Var.getY() + y10;
        l01 l01Var = xVar.i0;
        int y12 = (int) (l01Var.getY() + y11);
        ArrayList arrayList = null;
        int i10 = 0;
        int i11 = 0;
        boolean z11 = false;
        while (true) {
            int childCount = l01Var.getChildCount();
            rectF = this.i;
            i7 = 1;
            hashSet = this.D;
            if (i11 >= childCount) {
                break;
            }
            View childAt = l01Var.getChildAt(i11);
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
        int y13 = (int) (xVar.e0.getY() + i01Var.getY() + xVar.getY());
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
            ofFloat.addUpdateListener(new v(i10, this, arrayList));
            this.E.add(ofFloat);
            ofFloat.addListener(new androidx.fragment.app.g(this, ofFloat, z10, i7));
            if (this.y == 4) {
                ofFloat.setDuration(420L);
                ofFloat.setInterpolator(er.h);
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
        i01 i01Var = xVar.b0;
        i01 i01Var2 = xVar.b0;
        boolean z10 = this.w;
        a0 a0Var = this.a;
        i01Var.setTranslationX(z10 ? 0.0f : a0Var.f);
        i01Var2.setTranslationY(a0Var.h);
        i01Var2.setPivotX(a0Var.r);
        i01Var2.setPivotY(a0Var.s);
        i01Var2.setScaleX(a0Var.n);
        i01Var2.setScaleY(a0Var.n);
    }
}
