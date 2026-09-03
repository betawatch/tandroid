package ng;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.OvershootInterpolator;
import eg.u2;
import eg.z0;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import k7.c6;
import lh.c3;
import mh.m2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.ec0;
import org.telegram.ui.Components.ew0;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.qk0;
import org.telegram.ui.Components.vv;
import org.telegram.ui.f61;
import org.telegram.ui.i51;
import org.telegram.ui.q51;
import org.telegram.ui.t51;
import org.telegram.ui.x51;
import org.telegram.ui.xn;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class d0 {
    public final int[] A;
    public final AnimationNotificationsLocker B;
    public boolean C;
    public final HashSet D;
    public final ArrayList E;
    public int F;
    public final c0 a;
    public final WindowManager b;
    public final ag.l c;
    public final boolean d;
    public float e;
    public float g;
    public float h;
    public float j;
    public boolean k;
    public boolean l;
    public final z m;
    public final qk0 n;
    public final List o;
    public ec0 p;
    public boolean q;
    public final p2 r;
    public final g6 s;
    public float t;
    public float u;
    public boolean v;
    public boolean w;
    public ValueAnimator x;
    public final int y;
    public qg.b z;
    public final RectF f = new RectF();
    public final RectF i = new RectF();

    public d0(int i10, p2 p2Var, ArrayList arrayList, HashSet hashSet, qk0 qk0Var, g6 g6Var, boolean z4) {
        new Path();
        this.A = new int[2];
        this.B = new AnimationNotificationsLocker();
        this.D = new HashSet();
        this.E = new ArrayList();
        int i11 = 0;
        this.F = 0;
        this.y = i10;
        this.o = arrayList;
        this.r = p2Var;
        this.s = g6Var;
        Context context = p2Var != null ? p2Var.getContext() : qk0Var.getContext();
        ag.l lVar = new ag.l(this, context);
        this.c = lVar;
        int i12 = 24;
        lVar.setOnClickListener(new androidx.mediarouter.app.c(this, i12));
        boolean z10 = i10 == 2 || i10 == 4 || i10 == 5 || z4;
        this.d = z10;
        c0 c0Var = new c0(this, context);
        this.a = c0Var;
        boolean z11 = z10;
        z zVar = new z(this, p2Var, context, qk0Var.getWindowType(), i10 != 1, g6Var, qk0Var, p2Var);
        this.m = zVar;
        zVar.setOutlineProvider(new a0(this));
        zVar.setClipToOutline(true);
        boolean z12 = qk0Var.c1;
        boolean z13 = qk0Var.d1;
        if (zVar.H1 != z12) {
            zVar.H1 = z12;
            zVar.I1 = z13;
            t51 t51Var = zVar.e0;
            if (t51Var != null) {
                t51Var.invalidate();
            }
            i51 i51Var = zVar.f0;
            if (i51Var != null) {
                i51Var.invalidate();
            }
        }
        zVar.setOnLongPressedListener(new o5.i(qk0Var, i12));
        zVar.setOnRecentClearedListener(new cb.b(13));
        zVar.setRecentReactions(arrayList);
        zVar.setSelectedReactions((HashSet<q0>) hashSet);
        zVar.setDrawBackground(false);
        zVar.s(null);
        c0Var.addView(zVar, c6.d(-1, -2.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        int i13 = i10 == 5 ? 2 : 16;
        if (i10 == 5) {
            c0Var.setClipChildren(false);
            c0Var.setClipToPadding(false);
            lVar.setClipChildren(false);
            lVar.setClipToPadding(false);
        }
        float f10 = i13;
        lVar.addView(c0Var, c6.d(-1, -1.0f, i10 == 5 ? 85 : 48, f10, f10, f10, 16.0f));
        lVar.setClipChildren(false);
        if (i10 == 1 || (qk0Var.getDelegate() != null && qk0Var.getDelegate().t())) {
            zVar.setBackgroundDelegate(new w(i11, this, qk0Var));
        }
        if (z11) {
            ((ViewGroup) qk0Var.getParent()).addView(lVar);
        } else {
            WindowManager.LayoutParams b10 = b(false);
            WindowManager windowManager = AndroidUtilities.findActivity(context).getWindowManager();
            this.b = windowManager;
            AndroidUtilities.setPreferredMaxRefreshRate(windowManager, lVar, b10);
            windowManager.addView(lVar, b10);
        }
        this.n = qk0Var;
        qk0Var.setOnSwitchedToLoopView(new x(this, i11));
        qk0Var.Y0 = true;
        qk0Var.invalidate();
        AndroidUtilities.runOnUIThread(new m2(19, this, qk0Var), 50L);
        if (i10 != 5) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 7);
        }
    }

    public static void a(d0 d0Var, boolean z4) {
        View view;
        qk0 qk0Var = d0Var.n;
        z zVar = d0Var.m;
        if (d0Var.E.isEmpty()) {
            d0Var.h(false);
            g0.a();
            d0Var.B.unlock();
            zVar.setEnterAnimationInProgress(false);
            t51 t51Var = zVar.e0;
            if (z4) {
                zVar.a0.m(false);
                t51Var.invalidate();
                ArrayList arrayList = t51Var.X2;
                t51Var.e1();
                zVar.c0.b();
                zVar.sendAccessibilityEvent(32);
                qk0Var.setImportantForAccessibility(4);
                int i10 = 0;
                while (true) {
                    if (i10 >= t51Var.getChildCount()) {
                        view = null;
                        break;
                    } else {
                        if (t51Var.getChildAt(i10) instanceof f61) {
                            view = t51Var.getChildAt(i10);
                            break;
                        }
                        i10++;
                    }
                }
                if (view != null) {
                    view.performAccessibilityAction(64, null);
                } else {
                    zVar.performAccessibilityAction(64, null);
                }
                if (qk0Var.getPullingLeftProgress() > 0.0f) {
                    qk0Var.L0 = false;
                    ValueAnimator valueAnimator = qk0Var.v0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    qk0Var.y0 = 0.0f;
                    ag.l lVar = qk0Var.P;
                    if (lVar != null) {
                        lVar.invalidate();
                    }
                    qk0Var.invalidate();
                } else {
                    qk0Var.L0 = true;
                    ValueAnimator valueAnimator2 = qk0Var.v0;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    qk0Var.y0 = 0.0f;
                    ag.l lVar2 = qk0Var.P;
                    if (lVar2 != null) {
                        lVar2.invalidate();
                    }
                    qk0Var.invalidate();
                }
                i51 i51Var = zVar.f0;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    x51 x51Var = (x51) arrayList.get(i11);
                    for (int i12 = 0; i12 < x51Var.L.size(); i12++) {
                        if (((f61) x51Var.L.get(i12)).b) {
                            ((f61) x51Var.L.get(i12)).b = false;
                            ((f61) x51Var.L.get(i12)).invalidate();
                            x51Var.k();
                        }
                    }
                }
                t51Var.invalidate();
                for (int i13 = 0; i13 < i51Var.X2.size(); i13++) {
                    x51 x51Var2 = (x51) i51Var.X2.get(i13);
                    for (int i14 = 0; i14 < x51Var2.L.size(); i14++) {
                        if (((f61) x51Var2.L.get(i14)).b) {
                            ((f61) x51Var2.L.get(i14)).b = false;
                            ((f61) x51Var2.L.get(i14)).invalidate();
                            x51Var2.k();
                        }
                    }
                }
                i51Var.invalidate();
                d0Var.i();
                d0Var.a.invalidate();
            }
        }
    }

    public static void g(View view, float f10) {
        if (view instanceof f61) {
            ((f61) view).setAnimatedScale(f10);
        } else if (view instanceof vv) {
            view.setScaleX(f10);
            view.setScaleY(f10);
        }
    }

    public final WindowManager.LayoutParams b(boolean z4) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.height = -1;
        layoutParams.width = -1;
        int i10 = this.y;
        layoutParams.type = (i10 == 0 || i10 == 3) ? MediaDataController.MAX_STYLE_RUNS_COUNT : 99;
        layoutParams.softInputMode = 16;
        if (z4) {
            layoutParams.flags = 65792;
        } else {
            layoutParams.flags = 65800;
        }
        layoutParams.format = -3;
        return layoutParams;
    }

    public final void c(boolean z4) {
        char c3;
        boolean z10;
        ValueAnimator valueAnimator;
        boolean z11;
        z zVar = this.m;
        int i10 = this.y;
        ag.l lVar = this.c;
        int[] iArr = this.A;
        c0 c0Var = this.a;
        RectF rectF = this.f;
        qk0 qk0Var = this.n;
        rectF.set(qk0Var.w);
        this.e = qk0Var.y;
        int[] iArr2 = new int[2];
        if (z4) {
            qk0Var.getLocationOnScreen(iArr);
        }
        lVar.getLocationOnScreen(iArr2);
        float topOffset = qk0Var.getTopOffset() + ((((iArr[1] - iArr2[1]) - AndroidUtilities.dp(44.0f)) - AndroidUtilities.dp(52.0f)) - (zVar.L0 ? AndroidUtilities.dp(26.0f) : 0));
        if (qk0Var.C0) {
            topOffset = (iArr[1] - iArr2[1]) - AndroidUtilities.dp(12.0f);
        }
        if (c0Var.getMeasuredHeight() + topOffset > lVar.getMeasuredHeight() - AndroidUtilities.dp(32.0f)) {
            topOffset = (lVar.getMeasuredHeight() - AndroidUtilities.dp(32.0f)) - c0Var.getMeasuredHeight();
        }
        if (topOffset < AndroidUtilities.dp(16.0f)) {
            topOffset = AndroidUtilities.dp(16.0f);
        }
        if (i10 == 5) {
            topOffset = Math.min(topOffset, 0.0f);
        }
        if (i10 == 1) {
            c3 = 1;
            c0Var.setTranslationX(((lVar.getMeasuredWidth() - c0Var.getMeasuredWidth()) / 2.0f) - AndroidUtilities.dp(16.0f));
        } else {
            c3 = 1;
            if (i10 == 2 || i10 == 4) {
                c0Var.setTranslationX((iArr[0] - iArr2[0]) - AndroidUtilities.dp(18.0f));
            } else {
                c0Var.setTranslationX((iArr[0] - iArr2[0]) - AndroidUtilities.dp(2.0f));
            }
        }
        if (z4) {
            this.t = topOffset;
            c0Var.setTranslationY(topOffset);
        } else {
            this.t = c0Var.getTranslationY();
        }
        float x10 = (iArr[0] - iArr2[0]) - c0Var.getX();
        this.g = x10;
        float y10 = (iArr[c3] - iArr2[c3]) - c0Var.getY();
        this.h = y10;
        rectF.offset(x10, y10);
        qk0Var.setCustomEmojiEnterProgress(this.j);
        if (z4) {
            this.w = SharedConfig.getDevicePerformanceClass() >= 2 && LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
            this.k = false;
        } else {
            this.w = false;
        }
        if (this.w) {
            z10 = true;
            j(0.0f, true);
        } else {
            z10 = true;
        }
        k();
        zVar.setEnterAnimationInProgress(z10);
        zVar.a0.m(z4 && this.w);
        this.B.lock();
        ValueAnimator valueAnimator2 = this.x;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        int i11 = 1;
        this.C = true;
        float f10 = this.j;
        if (i10 == 4) {
            valueAnimator = ValueAnimator.ofFloat(f10, z4 ? 1.0f : 0.0f);
        } else {
            float[] fArr = {f10, z4 ? 1.0f : 0.0f};
            ew0 ew0Var = new ew0();
            ew0Var.a = 0;
            ew0Var.b = 0;
            ew0Var.setFloatValues(fArr);
            valueAnimator = ew0Var;
        }
        this.x = valueAnimator;
        valueAnimator.addUpdateListener(new z0(i11, this, z4));
        if (!z4) {
            i();
        }
        this.x.addListener(new u2(3, this, z4));
        if (i10 == 4) {
            this.x.setDuration(420L);
            this.x.setInterpolator(pr.h);
        } else if (this.w) {
            this.x.setDuration(450L);
            this.x.setInterpolator(new OvershootInterpolator(0.5f));
        } else {
            this.x.setDuration(350L);
            this.x.setInterpolator(pr.f);
        }
        c0Var.invalidate();
        h(true);
        if (z4) {
            qk0Var.setCustomEmojiReactionsBackground(false);
            ValueAnimator valueAnimator3 = this.x;
            Objects.requireNonNull(valueAnimator3);
            c3 c3Var = new c3(valueAnimator3, 20);
            g0.f = this.w;
            g0.e = true;
            g0.g = false;
            if (g0.d) {
                g0.d = false;
            }
            g0.c = c3Var;
        } else {
            qk0Var.L0 = true;
            qk0Var.invalidate();
            this.x.setStartDelay(30L);
            this.x.start();
        }
        HashSet hashSet = g0.a;
        re.c cacheOutQueue = ImageLoader.getInstance().getCacheOutQueue();
        if (cacheOutQueue.b == null) {
            z11 = true;
            cacheOutQueue.b = new CountDownLatch(1);
        } else {
            z11 = true;
        }
        g0.b = z11;
        g0.e = false;
        g0.g = false;
    }

    public final void d() {
        if (this.q) {
            return;
        }
        qk0 qk0Var = this.n;
        if (qk0Var != null) {
            ValueAnimator valueAnimator = qk0Var.v0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            qk0Var.y0 = 0.0f;
            ag.l lVar = qk0Var.P;
            if (lVar != null) {
                lVar.invalidate();
            }
            qk0Var.invalidate();
        }
        ic.e();
        this.q = true;
        AndroidUtilities.hideKeyboard(this.c);
        c(false);
        if (this.v) {
            p2 p2Var = this.r;
            if (p2Var instanceof xn) {
                ((xn) p2Var).T9(true, true);
            }
        }
    }

    public final void e() {
        if (this.q) {
            return;
        }
        ic.e();
        this.q = true;
        ag.l lVar = this.c;
        AndroidUtilities.hideKeyboard(lVar);
        lVar.animate().alpha(0.0f).setDuration(150L).setListener(new b0(this, 1));
        if (this.v) {
            p2 p2Var = this.r;
            if (p2Var instanceof xn) {
                ((xn) p2Var).T9(true, true);
            }
        }
    }

    public final void f() {
        int i10 = 1;
        if (this.y != 5) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 7);
        }
        AndroidUtilities.runOnUIThread(new x(this, i10));
    }

    public final void h(boolean z4) {
        int i10 = z4 ? 2 : 0;
        z zVar = this.m;
        zVar.e0.setLayerType(i10, null);
        zVar.c0.setLayerType(i10, null);
        if (!this.w) {
            zVar.b0.setLayerType(i10, null);
            zVar.a0.setLayerType(i10, null);
        } else {
            for (int i11 = 0; i11 < Math.min(zVar.a0.b.getChildCount(), 16); i11++) {
                zVar.a0.b.getChildAt(i11).setLayerType(i10, null);
            }
        }
    }

    public final void i() {
        int i10 = 0;
        while (true) {
            z zVar = this.m;
            t51 t51Var = zVar.e0;
            t51 t51Var2 = zVar.e0;
            if (i10 >= t51Var.getChildCount()) {
                return;
            }
            if (t51Var2.getChildAt(i10) instanceof f61) {
                f61 f61Var = (f61) t51Var2.getChildAt(i10);
                if (f61Var.x != null) {
                    f61Var.b = false;
                    f61Var.invalidate();
                }
            }
            i10++;
        }
    }

    public final void j(float f10, boolean z4) {
        RectF rectF;
        HashSet hashSet;
        z zVar = this.m;
        float y10 = zVar.getY();
        q51 q51Var = zVar.U;
        float y11 = q51Var.getY() + y10;
        t51 t51Var = zVar.e0;
        int y12 = (int) (t51Var.getY() + y11);
        ArrayList arrayList = null;
        int i10 = 0;
        boolean z10 = false;
        while (true) {
            int childCount = t51Var.getChildCount();
            rectF = this.i;
            hashSet = this.D;
            if (i10 >= childCount) {
                break;
            }
            View childAt = t51Var.getChildAt(i10);
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
        int y13 = (int) (zVar.a0.getY() + q51Var.getY() + zVar.getY());
        for (int i11 = 0; i11 < zVar.a0.b.getChildCount(); i11++) {
            View childAt2 = zVar.a0.b.getChildAt(i11);
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
            zVar.h0.invalidate();
        }
        if (arrayList != null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new bg.a(5, this, arrayList));
            this.E.add(ofFloat);
            ofFloat.addListener(new androidx.fragment.app.g(this, ofFloat, z4, 2));
            if (this.y == 4) {
                ofFloat.setDuration(420L);
                ofFloat.setInterpolator(pr.h);
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
        z zVar = this.m;
        zVar.c0.setAlpha(this.j);
        zVar.e0.setAlpha(this.j);
        zVar.f0.setAlpha(this.j);
        zVar.a0.setAlpha(this.j);
        zVar.b0.setAlpha(this.j);
    }

    public final void l() {
        z zVar = this.m;
        q51 q51Var = zVar.U;
        q51 q51Var2 = zVar.U;
        boolean z4 = this.w;
        c0 c0Var = this.a;
        q51Var.setTranslationX(z4 ? 0.0f : c0Var.f);
        q51Var2.setTranslationY(c0Var.h);
        q51Var2.setPivotX(c0Var.r);
        q51Var2.setPivotY(c0Var.s);
        q51Var2.setScaleX(c0Var.n);
        q51Var2.setScaleY(c0Var.n);
    }
}
