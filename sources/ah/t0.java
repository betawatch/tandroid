package ah;

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
import org.telegram.messenger.kk;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.cl0;
import org.telegram.ui.Components.gw;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.rc0;
import org.telegram.ui.Components.yw0;
import org.telegram.ui.g51;
import org.telegram.ui.k41;
import org.telegram.ui.qn;
import org.telegram.ui.r41;
import org.telegram.ui.u41;
import org.telegram.ui.y41;
import w7.z5;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class t0 {
    public final int[] A;
    public final AnimationNotificationsLocker B;
    public boolean C;
    public final HashSet D;
    public final ArrayList E;
    public int F;
    public final s0 a;
    public final WindowManager b;
    public final v c;
    public final boolean d;
    public float e;
    public float g;
    public float h;
    public float j;
    public boolean k;
    public boolean l;
    public final n0 m;
    public final cl0 n;
    public final List o;
    public rc0 p;
    public boolean q;
    public final n2 r;
    public final d6 s;
    public float t;
    public float u;
    public boolean v;
    public boolean w;
    public ValueAnimator x;
    public final int y;
    public dh.d z;
    public final RectF f = new RectF();
    public final RectF i = new RectF();

    public t0(int i10, n2 n2Var, ArrayList arrayList, HashSet hashSet, cl0 cl0Var, d6 d6Var, boolean z10) {
        new Path();
        this.A = new int[2];
        this.B = new AnimationNotificationsLocker();
        this.D = new HashSet();
        this.E = new ArrayList();
        int i11 = 0;
        this.F = 0;
        this.y = i10;
        this.o = arrayList;
        this.r = n2Var;
        this.s = d6Var;
        Context context = n2Var != null ? n2Var.getContext() : cl0Var.getContext();
        v vVar = new v(this, context);
        this.c = vVar;
        vVar.setOnClickListener(new g0(this, i11));
        int i12 = 1;
        boolean z11 = i10 == 2 || i10 == 4 || i10 == 5 || z10;
        this.d = z11;
        s0 s0Var = new s0(this, context);
        this.a = s0Var;
        boolean z12 = z11;
        n0 n0Var = new n0(this, n2Var, context, cl0Var.getWindowType(), i10 != 1, d6Var, cl0Var, n2Var);
        this.m = n0Var;
        n0Var.setOutlineProvider(new o0(this));
        n0Var.setClipToOutline(true);
        boolean z13 = cl0Var.f1;
        boolean z14 = cl0Var.g1;
        if (n0Var.K1 != z13) {
            n0Var.K1 = z13;
            n0Var.L1 = z14;
            u41 u41Var = n0Var.h0;
            if (u41Var != null) {
                u41Var.invalidate();
            }
            k41 k41Var = n0Var.i0;
            if (k41Var != null) {
                k41Var.invalidate();
            }
        }
        n0Var.setOnLongPressedListener(new ya.d(cl0Var, r11));
        n0Var.setOnRecentClearedListener(new sb.a(i12));
        n0Var.setRecentReactions(arrayList);
        n0Var.setSelectedReactions((HashSet<i1>) hashSet);
        n0Var.setDrawBackground(false);
        n0Var.s(null);
        s0Var.addView(n0Var, z5.d(-1, -2.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        r11 = i10 != 5 ? 16 : 2;
        if (i10 == 5) {
            s0Var.setClipChildren(false);
            s0Var.setClipToPadding(false);
            vVar.setClipChildren(false);
            vVar.setClipToPadding(false);
        }
        float f7 = r11;
        vVar.addView(s0Var, z5.d(-1, -1.0f, i10 == 5 ? 85 : 48, f7, f7, f7, 16.0f));
        vVar.setClipChildren(false);
        if (i10 == 1 || (cl0Var.getDelegate() != null && cl0Var.getDelegate().w())) {
            n0Var.setBackgroundDelegate(new h0(i11, this, cl0Var));
        }
        if (z12) {
            ((ViewGroup) cl0Var.getParent()).addView(vVar);
        } else {
            WindowManager.LayoutParams b10 = b(false);
            WindowManager windowManager = AndroidUtilities.findActivity(context).getWindowManager();
            this.b = windowManager;
            AndroidUtilities.setPreferredMaxRefreshRate(windowManager, vVar, b10);
            windowManager.addView(vVar, b10);
        }
        this.n = cl0Var;
        cl0Var.setOnSwitchedToLoopView(new i0(this, i11));
        cl0Var.b1 = true;
        cl0Var.invalidate();
        AndroidUtilities.runOnUIThread(new a1.f(10, this, cl0Var), 50L);
        if (i10 != 5) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 7);
        }
    }

    public static void a(t0 t0Var, boolean z10) {
        View view;
        cl0 cl0Var = t0Var.n;
        n0 n0Var = t0Var.m;
        if (t0Var.E.isEmpty()) {
            t0Var.h(false);
            x0.a();
            t0Var.B.unlock();
            n0Var.setEnterAnimationInProgress(false);
            u41 u41Var = n0Var.h0;
            if (z10) {
                n0Var.d0.m(false);
                u41Var.invalidate();
                ArrayList arrayList = u41Var.Y2;
                u41Var.f1();
                n0Var.f0.b();
                n0Var.sendAccessibilityEvent(32);
                cl0Var.setImportantForAccessibility(4);
                int i10 = 0;
                while (true) {
                    if (i10 >= u41Var.getChildCount()) {
                        view = null;
                        break;
                    } else {
                        if (u41Var.getChildAt(i10) instanceof g51) {
                            view = u41Var.getChildAt(i10);
                            break;
                        }
                        i10++;
                    }
                }
                if (view != null) {
                    view.performAccessibilityAction(64, null);
                } else {
                    n0Var.performAccessibilityAction(64, null);
                }
                if (cl0Var.getPullingLeftProgress() > 0.0f) {
                    cl0Var.O0 = false;
                    ValueAnimator valueAnimator = cl0Var.y0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    cl0Var.B0 = 0.0f;
                    v vVar = cl0Var.S;
                    if (vVar != null) {
                        vVar.invalidate();
                    }
                    cl0Var.invalidate();
                } else {
                    cl0Var.O0 = true;
                    ValueAnimator valueAnimator2 = cl0Var.y0;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    cl0Var.B0 = 0.0f;
                    v vVar2 = cl0Var.S;
                    if (vVar2 != null) {
                        vVar2.invalidate();
                    }
                    cl0Var.invalidate();
                }
                k41 k41Var = n0Var.i0;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    y41 y41Var = (y41) arrayList.get(i11);
                    for (int i12 = 0; i12 < y41Var.O.size(); i12++) {
                        if (((g51) y41Var.O.get(i12)).b) {
                            ((g51) y41Var.O.get(i12)).b = false;
                            ((g51) y41Var.O.get(i12)).invalidate();
                            y41Var.k();
                        }
                    }
                }
                u41Var.invalidate();
                for (int i13 = 0; i13 < k41Var.Y2.size(); i13++) {
                    y41 y41Var2 = (y41) k41Var.Y2.get(i13);
                    for (int i14 = 0; i14 < y41Var2.O.size(); i14++) {
                        if (((g51) y41Var2.O.get(i14)).b) {
                            ((g51) y41Var2.O.get(i14)).b = false;
                            ((g51) y41Var2.O.get(i14)).invalidate();
                            y41Var2.k();
                        }
                    }
                }
                k41Var.invalidate();
                t0Var.i();
                t0Var.a.invalidate();
            }
        }
    }

    public static void g(View view, float f7) {
        if (view instanceof g51) {
            ((g51) view).setAnimatedScale(f7);
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
        n0 n0Var = this.m;
        int i10 = this.y;
        v vVar = this.c;
        int[] iArr = this.A;
        s0 s0Var = this.a;
        RectF rectF = this.f;
        cl0 cl0Var = this.n;
        rectF.set(cl0Var.w);
        this.e = cl0Var.y;
        int[] iArr2 = new int[2];
        if (z10) {
            cl0Var.getLocationOnScreen(iArr);
        }
        vVar.getLocationOnScreen(iArr2);
        int i11 = 0;
        float topOffset = cl0Var.getTopOffset() + ((((iArr[1] - iArr2[1]) - AndroidUtilities.dp(44.0f)) - AndroidUtilities.dp(52.0f)) - (n0Var.O0 ? AndroidUtilities.dp(26.0f) : 0));
        if (cl0Var.F0) {
            topOffset = (iArr[1] - iArr2[1]) - AndroidUtilities.dp(12.0f);
        }
        if (s0Var.getMeasuredHeight() + topOffset > vVar.getMeasuredHeight() - AndroidUtilities.dp(32.0f)) {
            topOffset = (vVar.getMeasuredHeight() - AndroidUtilities.dp(32.0f)) - s0Var.getMeasuredHeight();
        }
        if (topOffset < AndroidUtilities.dp(16.0f)) {
            topOffset = AndroidUtilities.dp(16.0f);
        }
        if (i10 == 5) {
            topOffset = Math.min(topOffset, 0.0f);
        }
        int i12 = 4;
        if (i10 == 1) {
            r18 = 1;
            s0Var.setTranslationX(((vVar.getMeasuredWidth() - s0Var.getMeasuredWidth()) / 2.0f) - AndroidUtilities.dp(16.0f));
        } else {
            boolean z13 = true;
            if (i10 == 2 || i10 == 4) {
                s0Var.setTranslationX((iArr[0] - iArr2[0]) - AndroidUtilities.dp(18.0f));
                r18 = z13;
            } else {
                s0Var.setTranslationX((iArr[0] - iArr2[0]) - AndroidUtilities.dp(2.0f));
                r18 = z13;
            }
        }
        if (z10) {
            this.t = topOffset;
            s0Var.setTranslationY(topOffset);
        } else {
            this.t = s0Var.getTranslationY();
        }
        float x10 = (iArr[0] - iArr2[0]) - s0Var.getX();
        this.g = x10;
        float y3 = (iArr[r18] - iArr2[r18]) - s0Var.getY();
        this.h = y3;
        rectF.offset(x10, y3);
        cl0Var.setCustomEmojiEnterProgress(this.j);
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
        n0Var.setEnterAnimationInProgress(z11);
        n0Var.d0.m(z10 && this.w);
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
            yw0 yw0Var = new yw0();
            yw0Var.a = 0;
            yw0Var.b = 0;
            yw0Var.setFloatValues(new float[]{f7, f10});
            valueAnimator = yw0Var;
        }
        this.x = valueAnimator;
        valueAnimator.addUpdateListener(new k0(i11, this, z10));
        if (!z10) {
            i();
        }
        this.x.addListener(new p0(i11, this, z10));
        if (i10 == 4) {
            this.x.setDuration(420L);
            this.x.setInterpolator(bs.h);
        } else if (this.w) {
            this.x.setDuration(450L);
            kk.l(0.5f, this.x);
        } else {
            this.x.setDuration(350L);
            this.x.setInterpolator(bs.f);
        }
        s0Var.invalidate();
        h(true);
        if (z10) {
            cl0Var.setCustomEmojiReactionsBackground(false);
            ValueAnimator valueAnimator3 = this.x;
            Objects.requireNonNull(valueAnimator3);
            a3.d dVar = new a3.d(valueAnimator3, i12);
            x0.f = this.w;
            x0.e = true;
            x0.g = false;
            if (x0.d) {
                x0.d = false;
            }
            x0.c = dVar;
        } else {
            cl0Var.O0 = true;
            cl0Var.invalidate();
            this.x.setStartDelay(30L);
            this.x.start();
        }
        HashSet hashSet = x0.a;
        hf.c cacheOutQueue = ImageLoader.getInstance().getCacheOutQueue();
        if (cacheOutQueue.b == null) {
            z12 = true;
            cacheOutQueue.b = new CountDownLatch(1);
        } else {
            z12 = true;
        }
        x0.b = z12;
        x0.e = false;
        x0.g = false;
    }

    public final void d() {
        if (this.q) {
            return;
        }
        cl0 cl0Var = this.n;
        if (cl0Var != null) {
            ValueAnimator valueAnimator = cl0Var.y0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            cl0Var.B0 = 0.0f;
            v vVar = cl0Var.S;
            if (vVar != null) {
                vVar.invalidate();
            }
            cl0Var.invalidate();
        }
        qc.e();
        this.q = true;
        AndroidUtilities.hideKeyboard(this.c);
        c(false);
        if (this.v) {
            n2 n2Var = this.r;
            if (n2Var instanceof qn) {
                ((qn) n2Var).Y9(true, true);
            }
        }
    }

    public final void e() {
        if (this.q) {
            return;
        }
        qc.e();
        this.q = true;
        v vVar = this.c;
        AndroidUtilities.hideKeyboard(vVar);
        vVar.animate().alpha(0.0f).setDuration(150L).setListener(new r0(this, 1));
        if (this.v) {
            n2 n2Var = this.r;
            if (n2Var instanceof qn) {
                ((qn) n2Var).Y9(true, true);
            }
        }
    }

    public final void f() {
        int i10 = 1;
        if (this.y != 5) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 7);
        }
        AndroidUtilities.runOnUIThread(new i0(this, i10));
    }

    public final void h(boolean z10) {
        int i10 = z10 ? 2 : 0;
        n0 n0Var = this.m;
        n0Var.h0.setLayerType(i10, null);
        n0Var.f0.setLayerType(i10, null);
        if (!this.w) {
            n0Var.e0.setLayerType(i10, null);
            n0Var.d0.setLayerType(i10, null);
        } else {
            for (int i11 = 0; i11 < Math.min(n0Var.d0.b.getChildCount(), 16); i11++) {
                n0Var.d0.b.getChildAt(i11).setLayerType(i10, null);
            }
        }
    }

    public final void i() {
        int i10 = 0;
        while (true) {
            n0 n0Var = this.m;
            u41 u41Var = n0Var.h0;
            u41 u41Var2 = n0Var.h0;
            if (i10 >= u41Var.getChildCount()) {
                return;
            }
            if (u41Var2.getChildAt(i10) instanceof g51) {
                g51 g51Var = (g51) u41Var2.getChildAt(i10);
                if (g51Var.x != null) {
                    g51Var.b = false;
                    g51Var.invalidate();
                }
            }
            i10++;
        }
    }

    public final void j(float f7, boolean z10) {
        RectF rectF;
        HashSet hashSet;
        n0 n0Var = this.m;
        float y3 = n0Var.getY();
        r41 r41Var = n0Var.a0;
        float y10 = r41Var.getY() + y3;
        u41 u41Var = n0Var.h0;
        int y11 = (int) (u41Var.getY() + y10);
        ArrayList arrayList = null;
        int i10 = 0;
        int i11 = 0;
        boolean z11 = false;
        while (true) {
            int childCount = u41Var.getChildCount();
            rectF = this.i;
            hashSet = this.D;
            if (i11 >= childCount) {
                break;
            }
            View childAt = u41Var.getChildAt(i11);
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
        int y12 = (int) (n0Var.d0.getY() + r41Var.getY() + n0Var.getY());
        for (int i12 = 0; i12 < n0Var.d0.b.getChildCount(); i12++) {
            View childAt2 = n0Var.d0.b.getChildAt(i12);
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
            n0Var.k0.invalidate();
        }
        if (arrayList != null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new l0(i10, this, arrayList));
            this.E.add(ofFloat);
            ofFloat.addListener(new q0(this, ofFloat, z10, i10));
            if (this.y == 4) {
                ofFloat.setDuration(420L);
                ofFloat.setInterpolator(bs.h);
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
        n0 n0Var = this.m;
        n0Var.f0.setAlpha(this.j);
        n0Var.h0.setAlpha(this.j);
        n0Var.i0.setAlpha(this.j);
        n0Var.d0.setAlpha(this.j);
        n0Var.e0.setAlpha(this.j);
    }

    public final void l() {
        n0 n0Var = this.m;
        r41 r41Var = n0Var.a0;
        r41 r41Var2 = n0Var.a0;
        boolean z10 = this.w;
        s0 s0Var = this.a;
        r41Var.setTranslationX(z10 ? 0.0f : s0Var.f);
        r41Var2.setTranslationY(s0Var.h);
        r41Var2.setPivotX(s0Var.r);
        r41Var2.setPivotY(s0Var.s);
        r41Var2.setScaleX(s0Var.n);
        r41Var2.setScaleY(s0Var.n);
    }
}
