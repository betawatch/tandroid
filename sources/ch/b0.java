package ch;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.OvershootInterpolator;
import bi.a4;
import bi.ab;
import bi.de;
import bi.x5;
import c8.ha;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.gc;
import org.telegram.messenger.iz;
import org.telegram.messenger.qs;
import org.telegram.messenger.sc;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.bc;
import org.telegram.ui.Components.hu0;
import org.telegram.ui.Components.ii0;
import org.telegram.ui.Components.ob0;
import org.telegram.ui.Components.wq;
import org.telegram.ui.Components.wu;
import org.telegram.ui.cn;
import org.telegram.ui.d11;
import org.telegram.ui.h01;
import org.telegram.ui.o01;
import org.telegram.ui.r01;
import org.telegram.ui.v01;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
    public final x5 c;
    public final boolean d;
    public float e;
    public float g;
    public float h;
    public float j;
    public boolean k;
    public boolean l;
    public final w m;
    public final ii0 n;
    public final List o;
    public ob0 p;
    public boolean q;
    public final f2 r;
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

    public b0(int i7, f2 f2Var, ArrayList arrayList, HashSet hashSet, ii0 ii0Var, h6 h6Var, boolean z9) {
        new Path();
        this.A = new int[2];
        this.B = new h2.f((int[]) null);
        this.D = new HashSet();
        this.E = new ArrayList();
        int i10 = 0;
        this.F = 0;
        this.y = i7;
        this.o = arrayList;
        this.r = f2Var;
        this.s = h6Var;
        Context context = f2Var != null ? f2Var.getContext() : ii0Var.getContext();
        x5 x5Var = new x5(this, context);
        this.c = x5Var;
        x5Var.setOnClickListener(new ah.d(this, 13));
        boolean z10 = i7 == 2 || i7 == 4 || i7 == 5 || z9;
        this.d = z10;
        a0 a0Var = new a0(this, context);
        this.a = a0Var;
        boolean z11 = z10;
        w wVar = new w(this, f2Var, context, ii0Var.getWindowType(), i7 != 1, h6Var, ii0Var, f2Var);
        this.m = wVar;
        wVar.setOutlineProvider(new x(this));
        wVar.setClipToOutline(true);
        boolean z12 = ii0Var.g1;
        boolean z13 = ii0Var.h1;
        if (wVar.L1 != z12) {
            wVar.L1 = z12;
            wVar.M1 = z13;
            r01 r01Var = wVar.h0;
            if (r01Var != null) {
                r01Var.invalidate();
            }
            h01 h01Var = wVar.i0;
            if (h01Var != null) {
                h01Var.invalidate();
            }
        }
        wVar.setOnLongPressedListener(new aa.n(ii0Var, 9));
        wVar.setOnRecentClearedListener(new qb.a(6));
        wVar.setRecentReactions(arrayList);
        wVar.setSelectedReactions((HashSet<o0>) hashSet);
        wVar.setDrawBackground(false);
        wVar.s(null);
        a0Var.addView(wVar, ha.d(-1, -2.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        int i11 = i7 == 5 ? 2 : 16;
        if (i7 == 5) {
            a0Var.setClipChildren(false);
            a0Var.setClipToPadding(false);
            x5Var.setClipChildren(false);
            x5Var.setClipToPadding(false);
        }
        float f10 = i11;
        x5Var.addView(a0Var, ha.d(-1, -1.0f, i7 == 5 ? 85 : 48, f10, f10, f10, 16.0f));
        x5Var.setClipChildren(false);
        if (i7 == 1 || (ii0Var.getDelegate() != null && ii0Var.getDelegate().U())) {
            wVar.setBackgroundDelegate(new ab.g(8, this, ii0Var));
        }
        if (z11) {
            ((ViewGroup) ii0Var.getParent()).addView(x5Var);
        } else {
            WindowManager.LayoutParams b10 = b(false);
            WindowManager windowManager = org.telegram.messenger.g0.W(context).getWindowManager();
            this.b = windowManager;
            org.telegram.messenger.g0.y3(windowManager, x5Var, b10);
            windowManager.addView(x5Var, b10);
        }
        this.n = ii0Var;
        ii0Var.setOnSwitchedToLoopView(new s(this, i10));
        ii0Var.c1 = true;
        ii0Var.invalidate();
        org.telegram.messenger.g0.i3(new a4(18, this, ii0Var), 50L);
        if (i7 != 5) {
            qs.e().k(qs.j1, 7);
        }
    }

    public static void a(b0 b0Var, boolean z9) {
        View view;
        ii0 ii0Var = b0Var.n;
        w wVar = b0Var.m;
        if (b0Var.E.isEmpty()) {
            b0Var.h(false);
            e0.a();
            b0Var.B.e();
            wVar.setEnterAnimationInProgress(false);
            r01 r01Var = wVar.h0;
            if (z9) {
                wVar.d0.m(false);
                r01Var.invalidate();
                ArrayList arrayList = r01Var.h3;
                r01Var.g1();
                wVar.f0.b();
                wVar.sendAccessibilityEvent(32);
                ii0Var.setImportantForAccessibility(4);
                int i7 = 0;
                while (true) {
                    if (i7 >= r01Var.getChildCount()) {
                        view = null;
                        break;
                    } else {
                        if (r01Var.getChildAt(i7) instanceof d11) {
                            view = r01Var.getChildAt(i7);
                            break;
                        }
                        i7++;
                    }
                }
                if (view != null) {
                    view.performAccessibilityAction(64, null);
                } else {
                    wVar.performAccessibilityAction(64, null);
                }
                if (ii0Var.getPullingLeftProgress() > 0.0f) {
                    ii0Var.O0 = false;
                    ValueAnimator valueAnimator = ii0Var.y0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    ii0Var.B0 = 0.0f;
                    x5 x5Var = ii0Var.S;
                    if (x5Var != null) {
                        x5Var.invalidate();
                    }
                    ii0Var.invalidate();
                } else {
                    ii0Var.O0 = true;
                    ValueAnimator valueAnimator2 = ii0Var.y0;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    ii0Var.B0 = 0.0f;
                    x5 x5Var2 = ii0Var.S;
                    if (x5Var2 != null) {
                        x5Var2.invalidate();
                    }
                    ii0Var.invalidate();
                }
                h01 h01Var = wVar.i0;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    v01 v01Var = (v01) arrayList.get(i10);
                    for (int i11 = 0; i11 < v01Var.O.size(); i11++) {
                        if (((d11) v01Var.O.get(i11)).b) {
                            ((d11) v01Var.O.get(i11)).b = false;
                            ((d11) v01Var.O.get(i11)).invalidate();
                            v01Var.k();
                        }
                    }
                }
                r01Var.invalidate();
                for (int i12 = 0; i12 < h01Var.h3.size(); i12++) {
                    v01 v01Var2 = (v01) h01Var.h3.get(i12);
                    for (int i13 = 0; i13 < v01Var2.O.size(); i13++) {
                        if (((d11) v01Var2.O.get(i13)).b) {
                            ((d11) v01Var2.O.get(i13)).b = false;
                            ((d11) v01Var2.O.get(i13)).invalidate();
                            v01Var2.k();
                        }
                    }
                }
                h01Var.invalidate();
                b0Var.i();
                b0Var.a.invalidate();
            }
        }
    }

    public static void g(View view, float f10) {
        if (view instanceof d11) {
            ((d11) view).setAnimatedScale(f10);
        } else if (view instanceof wu) {
            view.setScaleX(f10);
            view.setScaleY(f10);
        }
    }

    public final WindowManager.LayoutParams b(boolean z9) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.height = -1;
        layoutParams.width = -1;
        int i7 = this.y;
        layoutParams.type = (i7 == 0 || i7 == 3) ? 1000 : 99;
        layoutParams.softInputMode = 16;
        if (z9) {
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
    public final void c(boolean z9) {
        ?? r18;
        boolean z10;
        ValueAnimator valueAnimator;
        boolean z11;
        w wVar = this.m;
        int i7 = this.y;
        x5 x5Var = this.c;
        int[] iArr = this.A;
        a0 a0Var = this.a;
        RectF rectF = this.f;
        ii0 ii0Var = this.n;
        rectF.set(ii0Var.x);
        this.e = ii0Var.D;
        int[] iArr2 = new int[2];
        if (z9) {
            ii0Var.getLocationOnScreen(iArr);
        }
        x5Var.getLocationOnScreen(iArr2);
        int i10 = 0;
        float topOffset = ii0Var.getTopOffset() + ((((iArr[1] - iArr2[1]) - org.telegram.messenger.g0.L(44.0f)) - org.telegram.messenger.g0.L(52.0f)) - (wVar.O0 ? org.telegram.messenger.g0.L(26.0f) : 0));
        if (ii0Var.F0) {
            topOffset = (iArr[1] - iArr2[1]) - org.telegram.messenger.g0.L(12.0f);
        }
        if (a0Var.getMeasuredHeight() + topOffset > x5Var.getMeasuredHeight() - org.telegram.messenger.g0.L(32.0f)) {
            topOffset = (x5Var.getMeasuredHeight() - org.telegram.messenger.g0.L(32.0f)) - a0Var.getMeasuredHeight();
        }
        if (topOffset < org.telegram.messenger.g0.L(16.0f)) {
            topOffset = org.telegram.messenger.g0.L(16.0f);
        }
        if (i7 == 5) {
            topOffset = Math.min(topOffset, 0.0f);
        }
        if (i7 == 1) {
            r18 = 1;
            a0Var.setTranslationX(((x5Var.getMeasuredWidth() - a0Var.getMeasuredWidth()) / 2.0f) - org.telegram.messenger.g0.L(16.0f));
        } else {
            boolean z12 = true;
            if (i7 == 2 || i7 == 4) {
                a0Var.setTranslationX((iArr[0] - iArr2[0]) - org.telegram.messenger.g0.L(18.0f));
                r18 = z12;
            } else {
                a0Var.setTranslationX((iArr[0] - iArr2[0]) - org.telegram.messenger.g0.L(2.0f));
                r18 = z12;
            }
        }
        if (z9) {
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
        ii0Var.setCustomEmojiEnterProgress(this.j);
        if (z9) {
            this.w = (iz.o() < 2 || !sc.e(8200)) ? false : r18;
            this.k = false;
        } else {
            this.w = false;
        }
        if (this.w) {
            z10 = r18;
            j(z10, 0.0f);
        } else {
            z10 = r18;
        }
        k();
        wVar.setEnterAnimationInProgress(z10);
        wVar.d0.m(z9 && this.w);
        this.B.d();
        ValueAnimator valueAnimator2 = this.x;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        this.C = true;
        float f10 = this.j;
        if (i7 == 4) {
            valueAnimator = ValueAnimator.ofFloat(f10, z9 ? 1.0f : 0.0f);
        } else {
            float f11 = z9 ? 1.0f : 0.0f;
            hu0 hu0Var = new hu0();
            hu0Var.a = 0;
            hu0Var.b = 0;
            hu0Var.setFloatValues(new float[]{f10, f11});
            valueAnimator = hu0Var;
        }
        this.x = valueAnimator;
        valueAnimator.addUpdateListener(new u(i10, this, z9));
        if (!z9) {
            i();
        }
        this.x.addListener(new y(i10, this, z9));
        if (i7 == 4) {
            this.x.setDuration(420L);
            this.x.setInterpolator(wq.h);
        } else if (this.w) {
            this.x.setDuration(450L);
            org.telegram.messenger.camera.q.i(0.5f, this.x);
        } else {
            this.x.setDuration(350L);
            this.x.setInterpolator(wq.f);
        }
        a0Var.invalidate();
        h(true);
        if (z9) {
            ii0Var.setCustomEmojiReactionsBackground(false);
            ValueAnimator valueAnimator3 = this.x;
            Objects.requireNonNull(valueAnimator3);
            ab abVar = new ab(valueAnimator3, 9);
            e0.f = this.w;
            e0.e = true;
            e0.g = false;
            if (e0.d) {
                e0.d = false;
            }
            e0.c = abVar;
        } else {
            ii0Var.O0 = true;
            ii0Var.invalidate();
            this.x.setStartDelay(30L);
            this.x.start();
        }
        HashSet hashSet = e0.a;
        com.google.android.gms.internal.cast.b0 b0Var = gc.D().p;
        if (((CountDownLatch) b0Var.c) == null) {
            z11 = true;
            b0Var.c = new CountDownLatch(1);
        } else {
            z11 = true;
        }
        e0.b = z11;
        e0.e = false;
        e0.g = false;
    }

    public final void d() {
        if (this.q) {
            return;
        }
        ii0 ii0Var = this.n;
        if (ii0Var != null) {
            ValueAnimator valueAnimator = ii0Var.y0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ii0Var.B0 = 0.0f;
            x5 x5Var = ii0Var.S;
            if (x5Var != null) {
                x5Var.invalidate();
            }
            ii0Var.invalidate();
        }
        bc.e();
        this.q = true;
        org.telegram.messenger.g0.v1(this.c);
        c(false);
        if (this.v) {
            f2 f2Var = this.r;
            if (f2Var instanceof cn) {
                ((cn) f2Var).va(true, true);
            }
        }
    }

    public final void e() {
        if (this.q) {
            return;
        }
        bc.e();
        this.q = true;
        x5 x5Var = this.c;
        org.telegram.messenger.g0.v1(x5Var);
        x5Var.animate().alpha(0.0f).setDuration(150L).setListener(new z(this, 1));
        if (this.v) {
            f2 f2Var = this.r;
            if (f2Var instanceof cn) {
                ((cn) f2Var).va(true, true);
            }
        }
    }

    public final void f() {
        int i7 = 1;
        if (this.y != 5) {
            qs.e().k(qs.k1, 7);
        }
        org.telegram.messenger.g0.h3(new s(this, i7));
    }

    public final void h(boolean z9) {
        int i7 = z9 ? 2 : 0;
        w wVar = this.m;
        wVar.h0.setLayerType(i7, null);
        wVar.f0.setLayerType(i7, null);
        if (!this.w) {
            wVar.e0.setLayerType(i7, null);
            wVar.d0.setLayerType(i7, null);
        } else {
            for (int i10 = 0; i10 < Math.min(wVar.d0.b.getChildCount(), 16); i10++) {
                wVar.d0.b.getChildAt(i10).setLayerType(i7, null);
            }
        }
    }

    public final void i() {
        int i7 = 0;
        while (true) {
            w wVar = this.m;
            r01 r01Var = wVar.h0;
            r01 r01Var2 = wVar.h0;
            if (i7 >= r01Var.getChildCount()) {
                return;
            }
            if (r01Var2.getChildAt(i7) instanceof d11) {
                d11 d11Var = (d11) r01Var2.getChildAt(i7);
                if (d11Var.y != null) {
                    d11Var.b = false;
                    d11Var.invalidate();
                }
            }
            i7++;
        }
    }

    public final void j(boolean z9, float f10) {
        RectF rectF;
        int i7;
        HashSet hashSet;
        w wVar = this.m;
        float y10 = wVar.getY();
        o01 o01Var = wVar.a0;
        float y11 = o01Var.getY() + y10;
        r01 r01Var = wVar.h0;
        int y12 = (int) (r01Var.getY() + y11);
        ArrayList arrayList = null;
        int i10 = 0;
        boolean z10 = false;
        while (true) {
            int childCount = r01Var.getChildCount();
            rectF = this.i;
            i7 = 1;
            hashSet = this.D;
            if (i10 >= childCount) {
                break;
            }
            View childAt = r01Var.getChildAt(i10);
            if (!hashSet.contains(childAt)) {
                float measuredHeight = (childAt.getMeasuredHeight() / 2.0f) + childAt.getTop() + y12;
                if (measuredHeight >= rectF.bottom || measuredHeight <= rectF.top || f10 == 0.0f) {
                    g(childAt, 0.0f);
                    z10 = true;
                } else {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(childAt);
                    hashSet.add(childAt);
                }
            }
            i10++;
        }
        int y13 = (int) (wVar.d0.getY() + o01Var.getY() + wVar.getY());
        for (int i11 = 0; i11 < wVar.d0.b.getChildCount(); i11++) {
            View childAt2 = wVar.d0.b.getChildAt(i11);
            if (!hashSet.contains(childAt2)) {
                float measuredHeight2 = (childAt2.getMeasuredHeight() / 2.0f) + childAt2.getTop() + y13;
                if (measuredHeight2 >= rectF.bottom || measuredHeight2 <= rectF.top || f10 == 0.0f) {
                    g(childAt2, 0.0f);
                    z10 = true;
                } else {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(childAt2);
                    hashSet.add(childAt2);
                }
            }
        }
        if (z10) {
            wVar.k0.invalidate();
        }
        if (arrayList != null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new de(i7, this, arrayList));
            this.E.add(ofFloat);
            ofFloat.addListener(new ai.g0(this, ofFloat, z9, 3));
            if (this.y == 4) {
                ofFloat.setDuration(420L);
                ofFloat.setInterpolator(wq.h);
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
        w wVar = this.m;
        wVar.f0.setAlpha(this.j);
        wVar.h0.setAlpha(this.j);
        wVar.i0.setAlpha(this.j);
        wVar.d0.setAlpha(this.j);
        wVar.e0.setAlpha(this.j);
    }

    public final void l() {
        w wVar = this.m;
        o01 o01Var = wVar.a0;
        o01 o01Var2 = wVar.a0;
        boolean z9 = this.w;
        a0 a0Var = this.a;
        o01Var.setTranslationX(z9 ? 0.0f : a0Var.f);
        o01Var2.setTranslationY(a0Var.h);
        o01Var2.setPivotX(a0Var.r);
        o01Var2.setPivotY(a0Var.s);
        o01Var2.setScaleX(a0Var.n);
        o01Var2.setScaleY(a0Var.n);
    }
}
