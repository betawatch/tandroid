package dh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.OvershootInterpolator;
import b8.mf;
import ci.d1;
import ci.uc;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.az;
import org.telegram.messenger.hs;
import org.telegram.messenger.lc;
import org.telegram.messenger.zb;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.ac;
import org.telegram.ui.Components.fu0;
import org.telegram.ui.Components.jb0;
import org.telegram.ui.Components.li0;
import org.telegram.ui.Components.vu;
import org.telegram.ui.Components.xq;
import org.telegram.ui.b01;
import org.telegram.ui.e01;
import org.telegram.ui.i01;
import org.telegram.ui.q01;
import org.telegram.ui.uz0;
import org.telegram.ui.wm;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class a0 {
    public final int[] A;
    public final g2.g B;
    public boolean C;
    public final HashSet D;
    public final ArrayList E;
    public int F;
    public final z a;
    public final WindowManager b;
    public final ai.c0 c;
    public final boolean d;
    public float e;
    public float g;
    public float h;
    public float j;
    public boolean k;
    public boolean l;
    public final v m;
    public final li0 n;
    public final List o;
    public jb0 p;
    public boolean q;
    public final d2 r;
    public final e6 s;
    public float t;
    public float u;
    public boolean v;
    public boolean w;
    public ValueAnimator x;
    public final int y;
    public gh.g z;
    public final RectF f = new RectF();
    public final RectF i = new RectF();

    public a0(int i3, d2 d2Var, ArrayList arrayList, HashSet hashSet, li0 li0Var, e6 e6Var, boolean z10) {
        new Path();
        this.A = new int[2];
        this.B = new g2.g((int[]) null);
        this.D = new HashSet();
        this.E = new ArrayList();
        int i10 = 0;
        this.F = 0;
        this.y = i3;
        this.o = arrayList;
        this.r = d2Var;
        this.s = e6Var;
        Context context = d2Var != null ? d2Var.getContext() : li0Var.getContext();
        ai.c0 c0Var = new ai.c0(this, context);
        this.c = c0Var;
        c0Var.setOnClickListener(new ai.b(this, 16));
        int i11 = 5;
        boolean z11 = i3 == 2 || i3 == 4 || i3 == 5 || z10;
        this.d = z11;
        z zVar = new z(this, context);
        this.a = zVar;
        boolean z12 = z11;
        v vVar = new v(this, d2Var, context, li0Var.getWindowType(), i3 != 1, e6Var, li0Var, d2Var);
        this.m = vVar;
        vVar.setOutlineProvider(new w(this));
        vVar.setClipToOutline(true);
        boolean z13 = li0Var.h1;
        boolean z14 = li0Var.i1;
        if (vVar.M1 != z13) {
            vVar.M1 = z13;
            vVar.N1 = z14;
            e01 e01Var = vVar.i0;
            if (e01Var != null) {
                e01Var.invalidate();
            }
            uz0 uz0Var = vVar.j0;
            if (uz0Var != null) {
                uz0Var.invalidate();
            }
        }
        vVar.setOnLongPressedListener(new bb.c(li0Var, 18));
        vVar.setOnRecentClearedListener(new ra.e(i11));
        vVar.setRecentReactions(arrayList);
        vVar.setSelectedReactions((HashSet<n0>) hashSet);
        vVar.setDrawBackground(false);
        vVar.s(null);
        zVar.addView(vVar, mf.d(-1, -2.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        int i12 = i3 == 5 ? 2 : 16;
        if (i3 == 5) {
            zVar.setClipChildren(false);
            zVar.setClipToPadding(false);
            c0Var.setClipChildren(false);
            c0Var.setClipToPadding(false);
        }
        float f10 = i12;
        c0Var.addView(zVar, mf.d(-1, -1.0f, i3 == 5 ? 85 : 48, f10, f10, f10, 16.0f));
        c0Var.setClipChildren(false);
        if (i3 == 1 || (li0Var.getDelegate() != null && li0Var.getDelegate().O())) {
            vVar.setBackgroundDelegate(new ai.n(12, this, li0Var));
        }
        if (z12) {
            ((ViewGroup) li0Var.getParent()).addView(c0Var);
        } else {
            WindowManager.LayoutParams b10 = b(false);
            WindowManager windowManager = org.telegram.messenger.g0.W(context).getWindowManager();
            this.b = windowManager;
            org.telegram.messenger.g0.y3(windowManager, c0Var, b10);
            windowManager.addView(c0Var, b10);
        }
        this.n = li0Var;
        li0Var.setOnSwitchedToLoopView(new s(this, i10));
        li0Var.d1 = true;
        li0Var.invalidate();
        org.telegram.messenger.g0.i3(new ci.e0(23, this, li0Var), 50L);
        if (i3 != 5) {
            hs.e().k(hs.j1, 7);
        }
    }

    public static void a(a0 a0Var, boolean z10) {
        View view;
        li0 li0Var = a0Var.n;
        v vVar = a0Var.m;
        if (a0Var.E.isEmpty()) {
            a0Var.h(false);
            d0.a();
            a0Var.B.e();
            vVar.setEnterAnimationInProgress(false);
            e01 e01Var = vVar.i0;
            if (z10) {
                vVar.e0.m(false);
                e01Var.invalidate();
                ArrayList arrayList = e01Var.i3;
                e01Var.g1();
                vVar.g0.b();
                vVar.sendAccessibilityEvent(32);
                li0Var.setImportantForAccessibility(4);
                int i3 = 0;
                while (true) {
                    if (i3 >= e01Var.getChildCount()) {
                        view = null;
                        break;
                    } else {
                        if (e01Var.getChildAt(i3) instanceof q01) {
                            view = e01Var.getChildAt(i3);
                            break;
                        }
                        i3++;
                    }
                }
                if (view != null) {
                    view.performAccessibilityAction(64, null);
                } else {
                    vVar.performAccessibilityAction(64, null);
                }
                if (li0Var.getPullingLeftProgress() > 0.0f) {
                    li0Var.P0 = false;
                    ValueAnimator valueAnimator = li0Var.z0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    li0Var.C0 = 0.0f;
                    ai.c0 c0Var = li0Var.T;
                    if (c0Var != null) {
                        c0Var.invalidate();
                    }
                    li0Var.invalidate();
                } else {
                    li0Var.P0 = true;
                    ValueAnimator valueAnimator2 = li0Var.z0;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    li0Var.C0 = 0.0f;
                    ai.c0 c0Var2 = li0Var.T;
                    if (c0Var2 != null) {
                        c0Var2.invalidate();
                    }
                    li0Var.invalidate();
                }
                uz0 uz0Var = vVar.j0;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    i01 i01Var = (i01) arrayList.get(i10);
                    for (int i11 = 0; i11 < i01Var.P.size(); i11++) {
                        if (((q01) i01Var.P.get(i11)).b) {
                            ((q01) i01Var.P.get(i11)).b = false;
                            ((q01) i01Var.P.get(i11)).invalidate();
                            i01Var.k();
                        }
                    }
                }
                e01Var.invalidate();
                for (int i12 = 0; i12 < uz0Var.i3.size(); i12++) {
                    i01 i01Var2 = (i01) uz0Var.i3.get(i12);
                    for (int i13 = 0; i13 < i01Var2.P.size(); i13++) {
                        if (((q01) i01Var2.P.get(i13)).b) {
                            ((q01) i01Var2.P.get(i13)).b = false;
                            ((q01) i01Var2.P.get(i13)).invalidate();
                            i01Var2.k();
                        }
                    }
                }
                uz0Var.invalidate();
                a0Var.i();
                a0Var.a.invalidate();
            }
        }
    }

    public static void g(View view, float f10) {
        if (view instanceof q01) {
            ((q01) view).setAnimatedScale(f10);
        } else if (view instanceof vu) {
            view.setScaleX(f10);
            view.setScaleY(f10);
        }
    }

    public final WindowManager.LayoutParams b(boolean z10) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.height = -1;
        layoutParams.width = -1;
        int i3 = this.y;
        layoutParams.type = (i3 == 0 || i3 == 3) ? 1000 : 99;
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
        v vVar = this.m;
        int i3 = this.y;
        ai.c0 c0Var = this.c;
        int[] iArr = this.A;
        z zVar = this.a;
        RectF rectF = this.f;
        li0 li0Var = this.n;
        rectF.set(li0Var.x);
        this.e = li0Var.E;
        int[] iArr2 = new int[2];
        if (z10) {
            li0Var.getLocationOnScreen(iArr);
        }
        c0Var.getLocationOnScreen(iArr2);
        int i10 = 0;
        float topOffset = li0Var.getTopOffset() + ((((iArr[1] - iArr2[1]) - org.telegram.messenger.g0.L(44.0f)) - org.telegram.messenger.g0.L(52.0f)) - (vVar.P0 ? org.telegram.messenger.g0.L(26.0f) : 0));
        if (li0Var.G0) {
            topOffset = (iArr[1] - iArr2[1]) - org.telegram.messenger.g0.L(12.0f);
        }
        if (zVar.getMeasuredHeight() + topOffset > c0Var.getMeasuredHeight() - org.telegram.messenger.g0.L(32.0f)) {
            topOffset = (c0Var.getMeasuredHeight() - org.telegram.messenger.g0.L(32.0f)) - zVar.getMeasuredHeight();
        }
        if (topOffset < org.telegram.messenger.g0.L(16.0f)) {
            topOffset = org.telegram.messenger.g0.L(16.0f);
        }
        if (i3 == 5) {
            topOffset = Math.min(topOffset, 0.0f);
        }
        if (i3 == 1) {
            r18 = 1;
            zVar.setTranslationX(((c0Var.getMeasuredWidth() - zVar.getMeasuredWidth()) / 2.0f) - org.telegram.messenger.g0.L(16.0f));
        } else {
            boolean z13 = true;
            if (i3 == 2 || i3 == 4) {
                zVar.setTranslationX((iArr[0] - iArr2[0]) - org.telegram.messenger.g0.L(18.0f));
                r18 = z13;
            } else {
                zVar.setTranslationX((iArr[0] - iArr2[0]) - org.telegram.messenger.g0.L(2.0f));
                r18 = z13;
            }
        }
        if (z10) {
            this.t = topOffset;
            zVar.setTranslationY(topOffset);
        } else {
            this.t = zVar.getTranslationY();
        }
        float x10 = (iArr[0] - iArr2[0]) - zVar.getX();
        this.g = x10;
        float y9 = (iArr[r18] - iArr2[r18]) - zVar.getY();
        this.h = y9;
        rectF.offset(x10, y9);
        li0Var.setCustomEmojiEnterProgress(this.j);
        if (z10) {
            this.w = (az.o() < 2 || !lc.e(8200)) ? false : r18;
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
        vVar.setEnterAnimationInProgress(z11);
        vVar.e0.m(z10 && this.w);
        this.B.d();
        ValueAnimator valueAnimator2 = this.x;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        this.C = true;
        float f10 = this.j;
        if (i3 == 4) {
            valueAnimator = ValueAnimator.ofFloat(f10, z10 ? 1.0f : 0.0f);
        } else {
            float f11 = z10 ? 1.0f : 0.0f;
            fu0 fu0Var = new fu0();
            fu0Var.a = 0;
            fu0Var.b = 0;
            fu0Var.setFloatValues(new float[]{f10, f11});
            valueAnimator = fu0Var;
        }
        this.x = valueAnimator;
        valueAnimator.addUpdateListener(new u(i10, this, z10));
        if (!z10) {
            i();
        }
        this.x.addListener(new x(i10, this, z10));
        if (i3 == 4) {
            this.x.setDuration(420L);
            this.x.setInterpolator(xq.h);
        } else if (this.w) {
            this.x.setDuration(450L);
            org.telegram.messenger.camera.q.i(0.5f, this.x);
        } else {
            this.x.setDuration(350L);
            this.x.setInterpolator(xq.f);
        }
        zVar.invalidate();
        h(true);
        if (z10) {
            li0Var.setCustomEmojiReactionsBackground(false);
            ValueAnimator valueAnimator3 = this.x;
            Objects.requireNonNull(valueAnimator3);
            d1 d1Var = new d1(valueAnimator3, 16);
            d0.f = this.w;
            d0.e = true;
            d0.g = false;
            if (d0.d) {
                d0.d = false;
            }
            d0.c = d1Var;
        } else {
            li0Var.P0 = true;
            li0Var.invalidate();
            this.x.setStartDelay(30L);
            this.x.start();
        }
        HashSet hashSet = d0.a;
        com.google.android.gms.internal.cast.c0 c0Var2 = zb.D().p;
        if (((CountDownLatch) c0Var2.c) == null) {
            z12 = true;
            c0Var2.c = new CountDownLatch(1);
        } else {
            z12 = true;
        }
        d0.b = z12;
        d0.e = false;
        d0.g = false;
    }

    public final void d() {
        if (this.q) {
            return;
        }
        li0 li0Var = this.n;
        if (li0Var != null) {
            ValueAnimator valueAnimator = li0Var.z0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            li0Var.C0 = 0.0f;
            ai.c0 c0Var = li0Var.T;
            if (c0Var != null) {
                c0Var.invalidate();
            }
            li0Var.invalidate();
        }
        ac.e();
        this.q = true;
        org.telegram.messenger.g0.v1(this.c);
        c(false);
        if (this.v) {
            d2 d2Var = this.r;
            if (d2Var instanceof wm) {
                ((wm) d2Var).ta(true, true);
            }
        }
    }

    public final void e() {
        if (this.q) {
            return;
        }
        ac.e();
        this.q = true;
        ai.c0 c0Var = this.c;
        org.telegram.messenger.g0.v1(c0Var);
        c0Var.animate().alpha(0.0f).setDuration(150L).setListener(new y(this, 1));
        if (this.v) {
            d2 d2Var = this.r;
            if (d2Var instanceof wm) {
                ((wm) d2Var).ta(true, true);
            }
        }
    }

    public final void f() {
        int i3 = 1;
        if (this.y != 5) {
            hs.e().k(hs.k1, 7);
        }
        org.telegram.messenger.g0.h3(new s(this, i3));
    }

    public final void h(boolean z10) {
        int i3 = z10 ? 2 : 0;
        v vVar = this.m;
        vVar.i0.setLayerType(i3, null);
        vVar.g0.setLayerType(i3, null);
        if (!this.w) {
            vVar.f0.setLayerType(i3, null);
            vVar.e0.setLayerType(i3, null);
        } else {
            for (int i10 = 0; i10 < Math.min(vVar.e0.b.getChildCount(), 16); i10++) {
                vVar.e0.b.getChildAt(i10).setLayerType(i3, null);
            }
        }
    }

    public final void i() {
        int i3 = 0;
        while (true) {
            v vVar = this.m;
            e01 e01Var = vVar.i0;
            e01 e01Var2 = vVar.i0;
            if (i3 >= e01Var.getChildCount()) {
                return;
            }
            if (e01Var2.getChildAt(i3) instanceof q01) {
                q01 q01Var = (q01) e01Var2.getChildAt(i3);
                if (q01Var.y != null) {
                    q01Var.b = false;
                    q01Var.invalidate();
                }
            }
            i3++;
        }
    }

    public final void j(boolean z10, float f10) {
        RectF rectF;
        int i3;
        HashSet hashSet;
        v vVar = this.m;
        float y9 = vVar.getY();
        b01 b01Var = vVar.b0;
        float y10 = b01Var.getY() + y9;
        e01 e01Var = vVar.i0;
        int y11 = (int) (e01Var.getY() + y10);
        ArrayList arrayList = null;
        int i10 = 0;
        boolean z11 = false;
        while (true) {
            int childCount = e01Var.getChildCount();
            rectF = this.i;
            i3 = 1;
            hashSet = this.D;
            if (i10 >= childCount) {
                break;
            }
            View childAt = e01Var.getChildAt(i10);
            if (!hashSet.contains(childAt)) {
                float measuredHeight = (childAt.getMeasuredHeight() / 2.0f) + childAt.getTop() + y11;
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
            i10++;
        }
        int y12 = (int) (vVar.e0.getY() + b01Var.getY() + vVar.getY());
        for (int i11 = 0; i11 < vVar.e0.b.getChildCount(); i11++) {
            View childAt2 = vVar.e0.b.getChildAt(i11);
            if (!hashSet.contains(childAt2)) {
                float measuredHeight2 = (childAt2.getMeasuredHeight() / 2.0f) + childAt2.getTop() + y12;
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
            vVar.l0.invalidate();
        }
        if (arrayList != null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new uc(i3, this, arrayList));
            this.E.add(ofFloat);
            ofFloat.addListener(new androidx.fragment.app.g(this, ofFloat, z10, 3));
            if (this.y == 4) {
                ofFloat.setDuration(420L);
                ofFloat.setInterpolator(xq.h);
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
        v vVar = this.m;
        vVar.g0.setAlpha(this.j);
        vVar.i0.setAlpha(this.j);
        vVar.j0.setAlpha(this.j);
        vVar.e0.setAlpha(this.j);
        vVar.f0.setAlpha(this.j);
    }

    public final void l() {
        v vVar = this.m;
        b01 b01Var = vVar.b0;
        b01 b01Var2 = vVar.b0;
        boolean z10 = this.w;
        z zVar = this.a;
        b01Var.setTranslationX(z10 ? 0.0f : zVar.f);
        b01Var2.setTranslationY(zVar.h);
        b01Var2.setPivotX(zVar.r);
        b01Var2.setPivotY(zVar.s);
        b01Var2.setScaleX(zVar.n);
        b01Var2.setScaleY(zVar.n);
    }
}
