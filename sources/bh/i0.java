package bh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.OvershootInterpolator;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.gl0;
import org.telegram.ui.Components.gw;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.kx0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.xa0;
import org.telegram.ui.c51;
import org.telegram.ui.d3;
import org.telegram.ui.g51;
import org.telegram.ui.o51;
import org.telegram.ui.s41;
import org.telegram.ui.wn;
import org.telegram.ui.z41;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class i0 {
    public final int[] A;
    public final AnimationNotificationsLocker B;
    public boolean C;
    public final HashSet D;
    public final ArrayList E;
    public int F;
    public final h0 a;
    public final WindowManager b;
    public final p c;
    public final boolean d;
    public float e;
    public float g;
    public float h;
    public float j;
    public boolean k;
    public boolean l;
    public final d0 m;
    public final gl0 n;
    public final List o;
    public xa0 p;
    public boolean q;
    public final r2 r;
    public final u6 s;
    public float t;
    public float u;
    public boolean v;
    public boolean w;
    public ValueAnimator x;
    public final int y;
    public eh.d z;
    public final RectF f = new RectF();
    public final RectF i = new RectF();

    public i0(int i10, r2 r2Var, ArrayList arrayList, HashSet hashSet, gl0 gl0Var, u6 u6Var, boolean z10) {
        new Path();
        int i11 = 2;
        this.A = new int[2];
        this.B = new AnimationNotificationsLocker();
        this.D = new HashSet();
        this.E = new ArrayList();
        int i12 = 0;
        this.F = 0;
        this.y = i10;
        this.o = arrayList;
        this.r = r2Var;
        this.s = u6Var;
        Context context = r2Var != null ? r2Var.getContext() : gl0Var.getContext();
        p pVar = new p(this, context);
        this.c = pVar;
        pVar.setOnClickListener(new ai.s(this, i11));
        boolean z11 = i10 == 2 || i10 == 4 || i10 == 5 || z10;
        this.d = z11;
        h0 h0Var = new h0(this, context);
        this.a = h0Var;
        boolean z12 = z11;
        d0 d0Var = new d0(this, r2Var, context, gl0Var.getWindowType(), i10 != 1, u6Var, gl0Var, r2Var);
        this.m = d0Var;
        d0Var.setOutlineProvider(new e0(this));
        d0Var.setClipToOutline(true);
        boolean z13 = gl0Var.g1;
        boolean z14 = gl0Var.h1;
        if (d0Var.L1 != z13) {
            d0Var.L1 = z13;
            d0Var.M1 = z14;
            c51 c51Var = d0Var.h0;
            if (c51Var != null) {
                c51Var.invalidate();
            }
            s41 s41Var = d0Var.i0;
            if (s41Var != null) {
                s41Var.invalidate();
            }
        }
        d0Var.setOnLongPressedListener(new za.c(gl0Var, 7));
        d0Var.setOnRecentClearedListener(new tb.a(3));
        d0Var.setRecentReactions(arrayList);
        d0Var.setSelectedReactions((HashSet<x0>) hashSet);
        d0Var.setDrawBackground(false);
        d0Var.s(null);
        h0Var.addView(d0Var, kb1.h(-1, -2.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        int i13 = i10 == 5 ? 2 : 16;
        if (i10 == 5) {
            h0Var.setClipChildren(false);
            h0Var.setClipToPadding(false);
            pVar.setClipChildren(false);
            pVar.setClipToPadding(false);
        }
        float f7 = i13;
        pVar.addView(h0Var, kb1.h(-1, -1.0f, i10 == 5 ? 85 : 48, f7, f7, f7, 16.0f));
        pVar.setClipChildren(false);
        if (i10 == 1 || (gl0Var.getDelegate() != null && gl0Var.getDelegate().o())) {
            d0Var.setBackgroundDelegate(new ai.f0(2, this, gl0Var));
        }
        if (z12) {
            ((ViewGroup) gl0Var.getParent()).addView(pVar);
        } else {
            WindowManager.LayoutParams b10 = b(false);
            WindowManager windowManager = AndroidUtilities.findActivity(context).getWindowManager();
            this.b = windowManager;
            AndroidUtilities.setPreferredMaxRefreshRate(windowManager, pVar, b10);
            windowManager.addView(pVar, b10);
        }
        this.n = gl0Var;
        gl0Var.setOnSwitchedToLoopView(new y(this, i12));
        gl0Var.c1 = true;
        gl0Var.invalidate();
        AndroidUtilities.runOnUIThread(new a1.f(24, this, gl0Var), 50L);
        if (i10 != 5) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 7);
        }
    }

    public static void a(i0 i0Var, boolean z10) {
        View view;
        gl0 gl0Var = i0Var.n;
        d0 d0Var = i0Var.m;
        if (i0Var.E.isEmpty()) {
            i0Var.h(false);
            m0.a();
            i0Var.B.unlock();
            d0Var.setEnterAnimationInProgress(false);
            c51 c51Var = d0Var.h0;
            if (z10) {
                d0Var.d0.m(false);
                c51Var.invalidate();
                ArrayList arrayList = c51Var.i3;
                c51Var.g1();
                d0Var.f0.b();
                d0Var.sendAccessibilityEvent(32);
                gl0Var.setImportantForAccessibility(4);
                int i10 = 0;
                while (true) {
                    if (i10 >= c51Var.getChildCount()) {
                        view = null;
                        break;
                    } else {
                        if (c51Var.getChildAt(i10) instanceof o51) {
                            view = c51Var.getChildAt(i10);
                            break;
                        }
                        i10++;
                    }
                }
                if (view != null) {
                    view.performAccessibilityAction(64, null);
                } else {
                    d0Var.performAccessibilityAction(64, null);
                }
                if (gl0Var.getPullingLeftProgress() > 0.0f) {
                    gl0Var.O0 = false;
                    ValueAnimator valueAnimator = gl0Var.y0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    gl0Var.B0 = 0.0f;
                    p pVar = gl0Var.S;
                    if (pVar != null) {
                        pVar.invalidate();
                    }
                    gl0Var.invalidate();
                } else {
                    gl0Var.O0 = true;
                    ValueAnimator valueAnimator2 = gl0Var.y0;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    gl0Var.B0 = 0.0f;
                    p pVar2 = gl0Var.S;
                    if (pVar2 != null) {
                        pVar2.invalidate();
                    }
                    gl0Var.invalidate();
                }
                s41 s41Var = d0Var.i0;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    g51 g51Var = (g51) arrayList.get(i11);
                    for (int i12 = 0; i12 < g51Var.O.size(); i12++) {
                        if (((o51) g51Var.O.get(i12)).b) {
                            ((o51) g51Var.O.get(i12)).b = false;
                            ((o51) g51Var.O.get(i12)).invalidate();
                            g51Var.k();
                        }
                    }
                }
                c51Var.invalidate();
                for (int i13 = 0; i13 < s41Var.i3.size(); i13++) {
                    g51 g51Var2 = (g51) s41Var.i3.get(i13);
                    for (int i14 = 0; i14 < g51Var2.O.size(); i14++) {
                        if (((o51) g51Var2.O.get(i14)).b) {
                            ((o51) g51Var2.O.get(i14)).b = false;
                            ((o51) g51Var2.O.get(i14)).invalidate();
                            g51Var2.k();
                        }
                    }
                }
                s41Var.invalidate();
                i0Var.i();
                i0Var.a.invalidate();
            }
        }
    }

    public static void g(View view, float f7) {
        if (view instanceof o51) {
            ((o51) view).setAnimatedScale(f7);
        } else if (view instanceof gw) {
            view.setScaleX(f7);
            view.setScaleY(f7);
        }
    }

    public final WindowManager.LayoutParams b(boolean z10) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.height = -1;
        layoutParams.width = -1;
        int i10 = this.y;
        layoutParams.type = (i10 == 0 || i10 == 3) ? MediaDataController.MAX_STYLE_RUNS_COUNT : 99;
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
        d0 d0Var = this.m;
        int i10 = this.y;
        p pVar = this.c;
        int[] iArr = this.A;
        h0 h0Var = this.a;
        RectF rectF = this.f;
        gl0 gl0Var = this.n;
        rectF.set(gl0Var.w);
        this.e = gl0Var.y;
        int[] iArr2 = new int[2];
        if (z10) {
            gl0Var.getLocationOnScreen(iArr);
        }
        pVar.getLocationOnScreen(iArr2);
        int i11 = 0;
        float topOffset = gl0Var.getTopOffset() + ((((iArr[1] - iArr2[1]) - AndroidUtilities.dp(44.0f)) - AndroidUtilities.dp(52.0f)) - (d0Var.O0 ? AndroidUtilities.dp(26.0f) : 0));
        if (gl0Var.F0) {
            topOffset = (iArr[1] - iArr2[1]) - AndroidUtilities.dp(12.0f);
        }
        if (h0Var.getMeasuredHeight() + topOffset > pVar.getMeasuredHeight() - AndroidUtilities.dp(32.0f)) {
            topOffset = (pVar.getMeasuredHeight() - AndroidUtilities.dp(32.0f)) - h0Var.getMeasuredHeight();
        }
        if (topOffset < AndroidUtilities.dp(16.0f)) {
            topOffset = AndroidUtilities.dp(16.0f);
        }
        if (i10 == 5) {
            topOffset = Math.min(topOffset, 0.0f);
        }
        if (i10 == 1) {
            r18 = 1;
            h0Var.setTranslationX(((pVar.getMeasuredWidth() - h0Var.getMeasuredWidth()) / 2.0f) - AndroidUtilities.dp(16.0f));
        } else {
            boolean z13 = true;
            if (i10 == 2 || i10 == 4) {
                h0Var.setTranslationX((iArr[0] - iArr2[0]) - AndroidUtilities.dp(18.0f));
                r18 = z13;
            } else {
                h0Var.setTranslationX((iArr[0] - iArr2[0]) - AndroidUtilities.dp(2.0f));
                r18 = z13;
            }
        }
        if (z10) {
            this.t = topOffset;
            h0Var.setTranslationY(topOffset);
        } else {
            this.t = h0Var.getTranslationY();
        }
        float x9 = (iArr[0] - iArr2[0]) - h0Var.getX();
        this.g = x9;
        float y3 = (iArr[r18] - iArr2[r18]) - h0Var.getY();
        this.h = y3;
        rectF.offset(x9, y3);
        gl0Var.setCustomEmojiEnterProgress(this.j);
        if (z10) {
            this.w = (SharedConfig.getDevicePerformanceClass() < 2 || !LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS)) ? false : r18;
            this.k = false;
        } else {
            this.w = false;
        }
        if (this.w) {
            z11 = r18;
            j(0.0f, z11);
        } else {
            z11 = r18;
        }
        k();
        d0Var.setEnterAnimationInProgress(z11);
        d0Var.d0.m(z10 && this.w);
        this.B.lock();
        ValueAnimator valueAnimator2 = this.x;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        this.C = true;
        float f7 = this.j;
        if (i10 == 4) {
            valueAnimator = ValueAnimator.ofFloat(f7, z10 ? 1.0f : 0.0f);
        } else {
            float f10 = z10 ? 1.0f : 0.0f;
            kx0 kx0Var = new kx0();
            kx0Var.a = 0;
            kx0Var.b = 0;
            kx0Var.setFloatValues(new float[]{f7, f10});
            valueAnimator = kx0Var;
        }
        this.x = valueAnimator;
        valueAnimator.addUpdateListener(new a0(i11, this, z10));
        if (!z10) {
            i();
        }
        this.x.addListener(new f0(i11, this, z10));
        if (i10 == 4) {
            this.x.setDuration(420L);
            this.x.setInterpolator(ds.h);
        } else if (this.w) {
            this.x.setDuration(450L);
            d3.m(0.5f, this.x);
        } else {
            this.x.setDuration(350L);
            this.x.setInterpolator(ds.f);
        }
        h0Var.invalidate();
        h(true);
        if (z10) {
            gl0Var.setCustomEmojiReactionsBackground(false);
            ValueAnimator valueAnimator3 = this.x;
            Objects.requireNonNull(valueAnimator3);
            a3.d dVar = new a3.d(valueAnimator3, 14);
            m0.f = this.w;
            m0.e = true;
            m0.g = false;
            if (m0.d) {
                m0.d = false;
            }
            m0.c = dVar;
        } else {
            gl0Var.O0 = true;
            gl0Var.invalidate();
            this.x.setStartDelay(30L);
            this.x.start();
        }
        HashSet hashSet = m0.a;
        jf.c cacheOutQueue = ImageLoader.getInstance().getCacheOutQueue();
        if (cacheOutQueue.b == null) {
            z12 = true;
            cacheOutQueue.b = new CountDownLatch(1);
        } else {
            z12 = true;
        }
        m0.b = z12;
        m0.e = false;
        m0.g = false;
    }

    public final void d() {
        if (this.q) {
            return;
        }
        gl0 gl0Var = this.n;
        if (gl0Var != null) {
            ValueAnimator valueAnimator = gl0Var.y0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            gl0Var.B0 = 0.0f;
            p pVar = gl0Var.S;
            if (pVar != null) {
                pVar.invalidate();
            }
            gl0Var.invalidate();
        }
        qc.e();
        this.q = true;
        AndroidUtilities.hideKeyboard(this.c);
        c(false);
        if (this.v) {
            r2 r2Var = this.r;
            if (r2Var instanceof wn) {
                ((wn) r2Var).ga(true, true);
            }
        }
    }

    public final void e() {
        if (this.q) {
            return;
        }
        qc.e();
        this.q = true;
        p pVar = this.c;
        AndroidUtilities.hideKeyboard(pVar);
        pVar.animate().alpha(0.0f).setDuration(150L).setListener(new g0(this, 1));
        if (this.v) {
            r2 r2Var = this.r;
            if (r2Var instanceof wn) {
                ((wn) r2Var).ga(true, true);
            }
        }
    }

    public final void f() {
        int i10 = 1;
        if (this.y != 5) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 7);
        }
        AndroidUtilities.runOnUIThread(new y(this, i10));
    }

    public final void h(boolean z10) {
        int i10 = z10 ? 2 : 0;
        d0 d0Var = this.m;
        d0Var.h0.setLayerType(i10, null);
        d0Var.f0.setLayerType(i10, null);
        if (!this.w) {
            d0Var.e0.setLayerType(i10, null);
            d0Var.d0.setLayerType(i10, null);
        } else {
            for (int i11 = 0; i11 < Math.min(d0Var.d0.b.getChildCount(), 16); i11++) {
                d0Var.d0.b.getChildAt(i11).setLayerType(i10, null);
            }
        }
    }

    public final void i() {
        int i10 = 0;
        while (true) {
            d0 d0Var = this.m;
            c51 c51Var = d0Var.h0;
            c51 c51Var2 = d0Var.h0;
            if (i10 >= c51Var.getChildCount()) {
                return;
            }
            if (c51Var2.getChildAt(i10) instanceof o51) {
                o51 o51Var = (o51) c51Var2.getChildAt(i10);
                if (o51Var.x != null) {
                    o51Var.b = false;
                    o51Var.invalidate();
                }
            }
            i10++;
        }
    }

    public final void j(float f7, boolean z10) {
        RectF rectF;
        HashSet hashSet;
        d0 d0Var = this.m;
        float y3 = d0Var.getY();
        z41 z41Var = d0Var.a0;
        float y10 = z41Var.getY() + y3;
        c51 c51Var = d0Var.h0;
        int y11 = (int) (c51Var.getY() + y10);
        ArrayList arrayList = null;
        int i10 = 0;
        int i11 = 0;
        boolean z11 = false;
        while (true) {
            int childCount = c51Var.getChildCount();
            rectF = this.i;
            hashSet = this.D;
            if (i11 >= childCount) {
                break;
            }
            View childAt = c51Var.getChildAt(i11);
            if (!hashSet.contains(childAt)) {
                float measuredHeight = (childAt.getMeasuredHeight() / 2.0f) + childAt.getTop() + y11;
                if (measuredHeight >= rectF.bottom || measuredHeight <= rectF.top || f7 == 0.0f) {
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
        int y12 = (int) (d0Var.d0.getY() + z41Var.getY() + d0Var.getY());
        for (int i12 = 0; i12 < d0Var.d0.b.getChildCount(); i12++) {
            View childAt2 = d0Var.d0.b.getChildAt(i12);
            if (!hashSet.contains(childAt2)) {
                float measuredHeight2 = (childAt2.getMeasuredHeight() / 2.0f) + childAt2.getTop() + y12;
                if (measuredHeight2 >= rectF.bottom || measuredHeight2 <= rectF.top || f7 == 0.0f) {
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
            d0Var.k0.invalidate();
        }
        if (arrayList != null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new b0(i10, this, arrayList));
            this.E.add(ofFloat);
            ofFloat.addListener(new ai.l0(this, ofFloat, z10, 3));
            if (this.y == 4) {
                ofFloat.setDuration(420L);
                ofFloat.setInterpolator(ds.h);
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
        d0 d0Var = this.m;
        d0Var.f0.setAlpha(this.j);
        d0Var.h0.setAlpha(this.j);
        d0Var.i0.setAlpha(this.j);
        d0Var.d0.setAlpha(this.j);
        d0Var.e0.setAlpha(this.j);
    }

    public final void l() {
        d0 d0Var = this.m;
        z41 z41Var = d0Var.a0;
        z41 z41Var2 = d0Var.a0;
        boolean z10 = this.w;
        h0 h0Var = this.a;
        z41Var.setTranslationX(z10 ? 0.0f : h0Var.f);
        z41Var2.setTranslationY(h0Var.h);
        z41Var2.setPivotX(h0Var.r);
        z41Var2.setPivotY(h0Var.s);
        z41Var2.setScaleX(h0Var.n);
        z41Var2.setScaleY(h0Var.n);
    }
}
