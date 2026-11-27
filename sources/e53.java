// default package

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.OvershootInterpolator;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class e53 {
    public boolean C;
    public final d53 a;
    public final WindowManager b;
    public final tt c;
    public final boolean d;
    public float e;
    public float g;
    public float h;
    public float j;
    public boolean k;
    public boolean l;
    public final a53 m;
    public final i49 n;
    public final ArrayList o;
    public uk8 p;
    public boolean q;
    public final e r;
    public final vnb s;
    public float t;
    public float u;
    public boolean v;
    public boolean w;
    public ValueAnimator x;
    public final byte y;
    public jl0 z;
    public final RectF f = new RectF();
    public final RectF i = new RectF();
    public final int[] A = new int[2];
    public final pn B = new pn(null);
    public final HashSet D = new HashSet();
    public final ArrayList E = new ArrayList();
    public int F = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public e53(int i, e eVar, ArrayList arrayList, HashSet hashSet, i49 i49Var, vnb vnbVar, boolean z) {
        byte b = 0;
        this.y = i;
        this.o = arrayList;
        this.r = eVar;
        this.s = vnbVar;
        Context context = eVar != null ? eVar.getContext() : i49Var.getContext();
        tt ttVar = new tt(this, context);
        this.c = ttVar;
        ttVar.setOnClickListener(new r81(this, (byte) 24));
        boolean z2 = i == 2 || i == 4 || i == 5 || z;
        this.d = z2;
        d53 d53Var = new d53(this, context);
        this.a = d53Var;
        boolean z3 = z2;
        a53 a53Var = new a53(this, eVar, context, i49Var.getWindowType(), i != 1, vnbVar, i49Var, eVar);
        this.m = a53Var;
        a53Var.setOutlineProvider(new b53(this));
        a53Var.setClipToOutline(true);
        boolean z4 = i49Var.h1;
        boolean z5 = i49Var.i1;
        if (a53Var.M1 != z4) {
            a53Var.M1 = z4;
            a53Var.N1 = z5;
            k0a k0aVar = a53Var.i0;
            if (k0aVar != null) {
                k0aVar.invalidate();
            }
            a0a a0aVar = a53Var.j0;
            if (a0aVar != null) {
                a0aVar.invalidate();
            }
        }
        byte b2 = 22;
        a53Var.setOnLongPressedListener(new ri6(i49Var, b2));
        byte b3 = 16;
        a53Var.setOnRecentClearedListener(new faf(b3));
        a53Var.setRecentReactions(arrayList);
        a53Var.setSelectedReactions((HashSet<w49>) hashSet);
        a53Var.setDrawBackground(false);
        a53Var.r(null);
        d53Var.addView(a53Var, tre.d(-1, -2.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        if (i == 5) {
            d53Var.setClipChildren(false);
            d53Var.setClipToPadding(false);
            ttVar.setClipChildren(false);
            ttVar.setClipToPadding(false);
            b3 = 2;
        }
        float f = b3;
        ttVar.addView(d53Var, tre.d(-1, -1.0f, i == 5 ? 85 : 48, f, f, f, 16.0f));
        ttVar.setClipChildren(false);
        if (i == 1 || (i49Var.getDelegate() != null && i49Var.getDelegate().p())) {
            a53Var.setBackgroundDelegate(new q72((Object) this, (Object) i49Var, (byte) 15));
        }
        if (z3) {
            ((ViewGroup) i49Var.getParent()).addView(ttVar);
        } else {
            WindowManager.LayoutParams b4 = b(false);
            WindowManager windowManager = hl.W(context).getWindowManager();
            this.b = windowManager;
            hl.s3(windowManager, ttVar, b4);
            windowManager.addView(ttVar, b4);
        }
        this.n = i49Var;
        i49Var.setOnSwitchedToLoopView(new y43(this, b));
        i49Var.d1 = true;
        i49Var.invalidate();
        hl.d3(new bv2(this, i49Var, b2), 50L);
        if (i != 5) {
            jn7.e().k(jn7.j1, 7);
        }
    }

    public static void g(View view, float f) {
        if (view instanceof w0a) {
            ((w0a) view).setAnimatedScale(f);
        } else if (view instanceof uy3) {
            view.setScaleX(f);
            view.setScaleY(f);
        }
    }

    public final void a(boolean z) {
        View view;
        if (this.E.isEmpty()) {
            h(false);
            ri5.a();
            this.B.e();
            a53 a53Var = this.m;
            a53Var.setEnterAnimationInProgress(false);
            k0a k0aVar = a53Var.i0;
            if (z) {
                a53Var.e0.m(false);
                k0aVar.invalidate();
                k0aVar.i1();
                a53Var.g0.a();
                a53Var.sendAccessibilityEvent(32);
                i49 i49Var = this.n;
                i49Var.setImportantForAccessibility(4);
                int i = 0;
                while (true) {
                    if (i >= k0aVar.getChildCount()) {
                        view = null;
                        break;
                    } else {
                        if (k0aVar.getChildAt(i) instanceof w0a) {
                            view = k0aVar.getChildAt(i);
                            break;
                        }
                        i++;
                    }
                }
                if (view != null) {
                    view.performAccessibilityAction(64, null);
                } else {
                    a53Var.performAccessibilityAction(64, null);
                }
                if (i49Var.getPullingLeftProgress() > 0.0f) {
                    i49Var.P0 = false;
                    ValueAnimator valueAnimator = i49Var.z0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    i49Var.C0 = 0.0f;
                    tt ttVar = i49Var.T;
                    if (ttVar != null) {
                        ttVar.invalidate();
                    }
                    i49Var.invalidate();
                } else {
                    i49Var.P0 = true;
                    ValueAnimator valueAnimator2 = i49Var.z0;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    i49Var.C0 = 0.0f;
                    tt ttVar2 = i49Var.T;
                    if (ttVar2 != null) {
                        ttVar2.invalidate();
                    }
                    i49Var.invalidate();
                }
                a0a a0aVar = a53Var.j0;
                for (int i2 = 0; i2 < k0aVar.i3.size(); i2++) {
                    o0a o0aVar = (o0a) k0aVar.i3.get(i2);
                    for (int i3 = 0; i3 < o0aVar.P.size(); i3++) {
                        if (((w0a) o0aVar.P.get(i3)).b) {
                            ((w0a) o0aVar.P.get(i3)).b = false;
                            ((w0a) o0aVar.P.get(i3)).invalidate();
                            o0aVar.k();
                        }
                    }
                }
                k0aVar.invalidate();
                for (int i4 = 0; i4 < a0aVar.i3.size(); i4++) {
                    o0a o0aVar2 = (o0a) a0aVar.i3.get(i4);
                    for (int i5 = 0; i5 < o0aVar2.P.size(); i5++) {
                        if (((w0a) o0aVar2.P.get(i5)).b) {
                            ((w0a) o0aVar2.P.get(i5)).b = false;
                            ((w0a) o0aVar2.P.get(i5)).invalidate();
                            o0aVar2.k();
                        }
                    }
                }
                a0aVar.invalidate();
                i();
                this.a.invalidate();
            }
        }
    }

    public final WindowManager.LayoutParams b(boolean z) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.height = -1;
        layoutParams.width = -1;
        byte b = this.y;
        layoutParams.type = (b == 0 || b == 3) ? 1000 : 99;
        layoutParams.softInputMode = 16;
        if (z) {
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
    /* JADX WARN: Type inference failed for: r2v15, types: [android.animation.ValueAnimator] */
    public final void c(boolean z) {
        ?? r18;
        boolean z2;
        boolean z3;
        dqa dqaVar;
        boolean z4;
        a53 a53Var = this.m;
        byte b = this.y;
        tt ttVar = this.c;
        int[] iArr = this.A;
        d53 d53Var = this.a;
        RectF rectF = this.f;
        i49 i49Var = this.n;
        rectF.set(i49Var.x);
        this.e = i49Var.E;
        int[] iArr2 = new int[2];
        if (z) {
            i49Var.getLocationOnScreen(iArr);
        }
        ttVar.getLocationOnScreen(iArr2);
        float topOffset = i49Var.getTopOffset() + ((((iArr[1] - iArr2[1]) - hl.L(44.0f)) - hl.L(52.0f)) - (a53Var.P0 ? hl.L(26.0f) : 0));
        if (i49Var.G0) {
            topOffset = (iArr[1] - iArr2[1]) - hl.L(12.0f);
        }
        if (d53Var.getMeasuredHeight() + topOffset > ttVar.getMeasuredHeight() - hl.L(32.0f)) {
            topOffset = (ttVar.getMeasuredHeight() - hl.L(32.0f)) - d53Var.getMeasuredHeight();
        }
        if (topOffset < hl.L(16.0f)) {
            topOffset = hl.L(16.0f);
        }
        if (b == 5) {
            topOffset = Math.min(topOffset, 0.0f);
        }
        if (b == 1) {
            r18 = 1;
            d53Var.setTranslationX(((ttVar.getMeasuredWidth() - d53Var.getMeasuredWidth()) / 2.0f) - hl.L(16.0f));
        } else {
            boolean z5 = true;
            if (b == 2 || b == 4) {
                d53Var.setTranslationX((iArr[0] - iArr2[0]) - hl.L(18.0f));
                r18 = z5;
            } else {
                d53Var.setTranslationX((iArr[0] - iArr2[0]) - hl.L(2.0f));
                r18 = z5;
            }
        }
        if (z) {
            this.t = topOffset;
            d53Var.setTranslationY(topOffset);
        } else {
            this.t = d53Var.getTranslationY();
        }
        float x = (iArr[0] - iArr2[0]) - d53Var.getX();
        this.g = x;
        float y = (iArr[r18] - iArr2[r18]) - d53Var.getY();
        this.h = y;
        rectF.offset(x, y);
        i49Var.setCustomEmojiEnterProgress(this.j);
        if (z) {
            z2 = (xea.o() < 2 || !i86.e(8200)) ? false : r18;
            this.w = z2;
            this.k = false;
        } else {
            this.w = false;
            z2 = false;
        }
        if (z2) {
            z3 = r18;
            j(z3, 0.0f);
        } else {
            z3 = r18;
        }
        k();
        a53Var.setEnterAnimationInProgress(z3);
        a53Var.e0.m(z && this.w);
        this.B.d();
        ValueAnimator valueAnimator = this.x;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.C = true;
        float f = this.j;
        if (b == 4) {
            dqaVar = ValueAnimator.ofFloat(f, z ? 1.0f : 0.0f);
        } else {
            float[] fArr = {f, z ? 1.0f : 0.0f};
            dqa dqaVar2 = new dqa();
            dqaVar2.a = 0;
            dqaVar2.b = 0;
            dqaVar2.setFloatValues(fArr);
            dqaVar = dqaVar2;
        }
        this.x = dqaVar;
        dqaVar.addUpdateListener(new e20((byte) 3, this, z));
        if (!z) {
            i();
        }
        this.x.addListener(new z7((byte) 27, (Object) this, z));
        if (b == 4) {
            this.x.setDuration(420L);
            this.x.setInterpolator(k43.h);
        } else {
            boolean z6 = this.w;
            ValueAnimator valueAnimator2 = this.x;
            if (z6) {
                valueAnimator2.setDuration(450L);
                c00.o(0.5f, this.x);
            } else {
                valueAnimator2.setDuration(350L);
                this.x.setInterpolator(k43.f);
            }
        }
        d53Var.invalidate();
        h(true);
        if (z) {
            i49Var.setCustomEmojiReactionsBackground(false);
            ValueAnimator valueAnimator3 = this.x;
            Objects.requireNonNull(valueAnimator3);
            vd2 vd2Var = new vd2(valueAnimator3, (byte) 22);
            ri5.f = this.w;
            ri5.e = true;
            ri5.g = false;
            if (ri5.d) {
                ri5.d = false;
            }
            ri5.c = vd2Var;
        } else {
            i49Var.P0 = true;
            i49Var.invalidate();
            this.x.setStartDelay(30L);
            this.x.start();
        }
        HashSet hashSet = ri5.a;
        sw2 sw2Var = in5.z().p;
        if (((CountDownLatch) sw2Var.c) == null) {
            z4 = true;
            sw2Var.c = new CountDownLatch(1);
        } else {
            z4 = true;
        }
        ri5.b = z4;
        ri5.e = false;
        ri5.g = false;
    }

    public final void d() {
        if (this.q) {
            return;
        }
        i49 i49Var = this.n;
        if (i49Var != null) {
            ValueAnimator valueAnimator = i49Var.z0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            i49Var.C0 = 0.0f;
            tt ttVar = i49Var.T;
            if (ttVar != null) {
                ttVar.invalidate();
            }
            i49Var.invalidate();
        }
        v21.e();
        this.q = true;
        hl.t1(this.c);
        c(false);
        if (this.v) {
            e eVar = this.r;
            if (eVar instanceof zu1) {
                ((zu1) eVar).ja(true, true);
            }
        }
    }

    public final void e() {
        if (this.q) {
            return;
        }
        v21.e();
        this.q = true;
        tt ttVar = this.c;
        hl.t1(ttVar);
        ttVar.animate().alpha(0.0f).setDuration(150L).setListener(new c53(this, (byte) 1));
        if (this.v) {
            e eVar = this.r;
            if (eVar instanceof zu1) {
                ((zu1) eVar).ja(true, true);
            }
        }
    }

    public final void f() {
        byte b = 1;
        if (this.y != 5) {
            jn7.e().k(jn7.k1, 7);
        }
        hl.c3(new y43(this, b));
    }

    public final void h(boolean z) {
        int i = z ? 2 : 0;
        a53 a53Var = this.m;
        a53Var.i0.setLayerType(i, null);
        a53Var.g0.setLayerType(i, null);
        if (!this.w) {
            a53Var.f0.setLayerType(i, null);
            a53Var.e0.setLayerType(i, null);
        } else {
            for (int i2 = 0; i2 < Math.min(a53Var.e0.b.getChildCount(), 16); i2++) {
                a53Var.e0.b.getChildAt(i2).setLayerType(i, null);
            }
        }
    }

    public final void i() {
        int i = 0;
        while (true) {
            a53 a53Var = this.m;
            k0a k0aVar = a53Var.i0;
            k0a k0aVar2 = a53Var.i0;
            if (i >= k0aVar.getChildCount()) {
                return;
            }
            if (k0aVar2.getChildAt(i) instanceof w0a) {
                w0a w0aVar = (w0a) k0aVar2.getChildAt(i);
                if (w0aVar.y != null) {
                    w0aVar.b = false;
                    w0aVar.invalidate();
                }
            }
            i++;
        }
    }

    public final void j(boolean z, float f) {
        RectF rectF;
        HashSet hashSet;
        a53 a53Var = this.m;
        float y = a53Var.getY();
        h0a h0aVar = a53Var.b0;
        float y2 = h0aVar.getY() + y;
        k0a k0aVar = a53Var.i0;
        int y3 = (int) (k0aVar.getY() + y2);
        ArrayList arrayList = null;
        int i = 0;
        boolean z2 = false;
        while (true) {
            int childCount = k0aVar.getChildCount();
            rectF = this.i;
            hashSet = this.D;
            if (i >= childCount) {
                break;
            }
            View childAt = k0aVar.getChildAt(i);
            if (!hashSet.contains(childAt)) {
                float measuredHeight = (childAt.getMeasuredHeight() / 2.0f) + childAt.getTop() + y3;
                if (measuredHeight >= rectF.bottom || measuredHeight <= rectF.top || f == 0.0f) {
                    g(childAt, 0.0f);
                    z2 = true;
                } else {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(childAt);
                    hashSet.add(childAt);
                }
            }
            i++;
        }
        int y4 = (int) (a53Var.e0.getY() + h0aVar.getY() + a53Var.getY());
        for (int i2 = 0; i2 < a53Var.e0.b.getChildCount(); i2++) {
            View childAt2 = a53Var.e0.b.getChildAt(i2);
            if (!hashSet.contains(childAt2)) {
                float measuredHeight2 = (childAt2.getMeasuredHeight() / 2.0f) + childAt2.getTop() + y4;
                if (measuredHeight2 >= rectF.bottom || measuredHeight2 <= rectF.top || f == 0.0f) {
                    g(childAt2, 0.0f);
                    z2 = true;
                } else {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(childAt2);
                    hashSet.add(childAt2);
                }
            }
        }
        if (z2) {
            a53Var.l0.invalidate();
        }
        if (arrayList != null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new lk(this, arrayList, (byte) 10));
            this.E.add(ofFloat);
            ofFloat.addListener(new rw((Object) this, (Object) ofFloat, z, (byte) 3));
            if (this.y == 4) {
                ofFloat.setDuration(420L);
                ofFloat.setInterpolator(k43.h);
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
        a53 a53Var = this.m;
        a53Var.g0.setAlpha(this.j);
        a53Var.i0.setAlpha(this.j);
        a53Var.j0.setAlpha(this.j);
        a53Var.e0.setAlpha(this.j);
        a53Var.f0.setAlpha(this.j);
    }

    public final void l() {
        a53 a53Var = this.m;
        h0a h0aVar = a53Var.b0;
        h0a h0aVar2 = a53Var.b0;
        boolean z = this.w;
        d53 d53Var = this.a;
        h0aVar.setTranslationX(z ? 0.0f : d53Var.f);
        h0aVar2.setTranslationY(d53Var.h);
        h0aVar2.setPivotX(d53Var.r);
        h0aVar2.setPivotY(d53Var.s);
        h0aVar2.setScaleX(d53Var.n);
        h0aVar2.setScaleY(d53Var.n);
    }
}
