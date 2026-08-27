package ig;

import ag.t2;
import ag.w0;
import ag.y1;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.OvershootInterpolator;
import h7.z5;
import hh.m5;
import hh.y9;
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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.ec;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.iv;
import org.telegram.ui.Components.mb0;
import org.telegram.ui.Components.nv0;
import org.telegram.ui.Components.wj0;
import org.telegram.ui.b51;
import org.telegram.ui.j51;
import org.telegram.ui.n41;
import org.telegram.ui.rn;
import org.telegram.ui.u41;
import org.telegram.ui.x41;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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
    public final y1 c;
    public final boolean d;
    public float e;
    public float g;
    public float h;
    public float j;
    public boolean k;
    public boolean l;
    public final z m;
    public final wj0 n;
    public final List o;
    public mb0 p;
    public boolean q;
    public final n2 r;
    public final c6 s;
    public float t;
    public float u;
    public boolean v;
    public boolean w;
    public ValueAnimator x;
    public final int y;
    public lg.d z;
    public final RectF f = new RectF();
    public final RectF i = new RectF();

    public d0(int i10, n2 n2Var, ArrayList arrayList, HashSet hashSet, wj0 wj0Var, c6 c6Var, boolean z10) {
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
        this.s = c6Var;
        Context context = n2Var != null ? n2Var.getContext() : wj0Var.getContext();
        y1 y1Var = new y1(this, context);
        this.c = y1Var;
        y1Var.setOnClickListener(new w0(this, 20));
        boolean z11 = i10 == 2 || i10 == 4 || i10 == 5 || z10;
        this.d = z11;
        c0 c0Var = new c0(this, context);
        this.a = c0Var;
        boolean z12 = z11;
        z zVar = new z(this, n2Var, context, wj0Var.getWindowType(), i10 != 1, c6Var, wj0Var, n2Var);
        this.m = zVar;
        zVar.setOutlineProvider(new a0(this));
        zVar.setClipToOutline(true);
        boolean z13 = wj0Var.b1;
        boolean z14 = wj0Var.c1;
        if (zVar.G1 != z13) {
            zVar.G1 = z13;
            zVar.H1 = z14;
            x41 x41Var = zVar.d0;
            if (x41Var != null) {
                x41Var.invalidate();
            }
            n41 n41Var = zVar.e0;
            if (n41Var != null) {
                n41Var.invalidate();
            }
        }
        zVar.setOnLongPressedListener(new k5.i(wj0Var, 19));
        zVar.setOnRecentClearedListener(new xa.a(9));
        zVar.setRecentReactions(arrayList);
        zVar.setSelectedReactions((HashSet<q0>) hashSet);
        zVar.setDrawBackground(false);
        zVar.s(null);
        c0Var.addView(zVar, z5.d(-1, -2.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        int i12 = i10 == 5 ? 2 : 16;
        if (i10 == 5) {
            c0Var.setClipChildren(false);
            c0Var.setClipToPadding(false);
            y1Var.setClipChildren(false);
            y1Var.setClipToPadding(false);
        }
        float f10 = i12;
        y1Var.addView(c0Var, z5.d(-1, -1.0f, i10 == 5 ? 85 : 48, f10, f10, f10, 16.0f));
        y1Var.setClipChildren(false);
        if (i10 == 1 || (wj0Var.getDelegate() != null && wj0Var.getDelegate().t())) {
            zVar.setBackgroundDelegate(new ag.h0(28, this, wj0Var));
        }
        if (z12) {
            ((ViewGroup) wj0Var.getParent()).addView(y1Var);
        } else {
            WindowManager.LayoutParams b10 = b(false);
            WindowManager windowManager = AndroidUtilities.findActivity(context).getWindowManager();
            this.b = windowManager;
            AndroidUtilities.setPreferredMaxRefreshRate(windowManager, y1Var, b10);
            windowManager.addView(y1Var, b10);
        }
        this.n = wj0Var;
        wj0Var.setOnSwitchedToLoopView(new w(this, i11));
        wj0Var.X0 = true;
        wj0Var.invalidate();
        AndroidUtilities.runOnUIThread(new m5(10, this, wj0Var), 50L);
        if (i10 != 5) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 7);
        }
    }

    public static void a(d0 d0Var, boolean z10) {
        View view;
        wj0 wj0Var = d0Var.n;
        z zVar = d0Var.m;
        if (d0Var.E.isEmpty()) {
            d0Var.h(false);
            g0.a();
            d0Var.B.unlock();
            zVar.setEnterAnimationInProgress(false);
            x41 x41Var = zVar.d0;
            if (z10) {
                zVar.W.m(false);
                x41Var.invalidate();
                ArrayList arrayList = x41Var.W2;
                x41Var.f1();
                zVar.b0.b();
                zVar.sendAccessibilityEvent(32);
                wj0Var.setImportantForAccessibility(4);
                int i10 = 0;
                while (true) {
                    if (i10 >= x41Var.getChildCount()) {
                        view = null;
                        break;
                    } else {
                        if (x41Var.getChildAt(i10) instanceof j51) {
                            view = x41Var.getChildAt(i10);
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
                if (wj0Var.getPullingLeftProgress() > 0.0f) {
                    wj0Var.K0 = false;
                    ValueAnimator valueAnimator = wj0Var.u0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    wj0Var.x0 = 0.0f;
                    y1 y1Var = wj0Var.O;
                    if (y1Var != null) {
                        y1Var.invalidate();
                    }
                    wj0Var.invalidate();
                } else {
                    wj0Var.K0 = true;
                    ValueAnimator valueAnimator2 = wj0Var.u0;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    wj0Var.x0 = 0.0f;
                    y1 y1Var2 = wj0Var.O;
                    if (y1Var2 != null) {
                        y1Var2.invalidate();
                    }
                    wj0Var.invalidate();
                }
                n41 n41Var = zVar.e0;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    b51 b51Var = (b51) arrayList.get(i11);
                    for (int i12 = 0; i12 < b51Var.K.size(); i12++) {
                        if (((j51) b51Var.K.get(i12)).b) {
                            ((j51) b51Var.K.get(i12)).b = false;
                            ((j51) b51Var.K.get(i12)).invalidate();
                            b51Var.k();
                        }
                    }
                }
                x41Var.invalidate();
                for (int i13 = 0; i13 < n41Var.W2.size(); i13++) {
                    b51 b51Var2 = (b51) n41Var.W2.get(i13);
                    for (int i14 = 0; i14 < b51Var2.K.size(); i14++) {
                        if (((j51) b51Var2.K.get(i14)).b) {
                            ((j51) b51Var2.K.get(i14)).b = false;
                            ((j51) b51Var2.K.get(i14)).invalidate();
                            b51Var2.k();
                        }
                    }
                }
                n41Var.invalidate();
                d0Var.i();
                d0Var.a.invalidate();
            }
        }
    }

    public static void g(View view, float f10) {
        if (view instanceof j51) {
            ((j51) view).setAnimatedScale(f10);
        } else if (view instanceof iv) {
            view.setScaleX(f10);
            view.setScaleY(f10);
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

    public final void c(boolean z10) {
        char c10;
        boolean z11;
        ValueAnimator valueAnimator;
        boolean z12;
        z zVar = this.m;
        int i10 = this.y;
        y1 y1Var = this.c;
        int[] iArr = this.A;
        c0 c0Var = this.a;
        RectF rectF = this.f;
        wj0 wj0Var = this.n;
        rectF.set(wj0Var.w);
        this.e = wj0Var.y;
        int i11 = 2;
        int[] iArr2 = new int[2];
        if (z10) {
            wj0Var.getLocationOnScreen(iArr);
        }
        y1Var.getLocationOnScreen(iArr2);
        int i12 = 0;
        float topOffset = wj0Var.getTopOffset() + ((((iArr[1] - iArr2[1]) - AndroidUtilities.dp(44.0f)) - AndroidUtilities.dp(52.0f)) - (zVar.K0 ? AndroidUtilities.dp(26.0f) : 0));
        if (wj0Var.B0) {
            topOffset = (iArr[1] - iArr2[1]) - AndroidUtilities.dp(12.0f);
        }
        if (c0Var.getMeasuredHeight() + topOffset > y1Var.getMeasuredHeight() - AndroidUtilities.dp(32.0f)) {
            topOffset = (y1Var.getMeasuredHeight() - AndroidUtilities.dp(32.0f)) - c0Var.getMeasuredHeight();
        }
        if (topOffset < AndroidUtilities.dp(16.0f)) {
            topOffset = AndroidUtilities.dp(16.0f);
        }
        if (i10 == 5) {
            topOffset = Math.min(topOffset, 0.0f);
        }
        if (i10 == 1) {
            c10 = 1;
            c0Var.setTranslationX(((y1Var.getMeasuredWidth() - c0Var.getMeasuredWidth()) / 2.0f) - AndroidUtilities.dp(16.0f));
        } else {
            c10 = 1;
            if (i10 == 2 || i10 == 4) {
                c0Var.setTranslationX((iArr[0] - iArr2[0]) - AndroidUtilities.dp(18.0f));
            } else {
                c0Var.setTranslationX((iArr[0] - iArr2[0]) - AndroidUtilities.dp(2.0f));
            }
        }
        if (z10) {
            this.t = topOffset;
            c0Var.setTranslationY(topOffset);
        } else {
            this.t = c0Var.getTranslationY();
        }
        float x8 = (iArr[0] - iArr2[0]) - c0Var.getX();
        this.g = x8;
        float y10 = (iArr[c10] - iArr2[c10]) - c0Var.getY();
        this.h = y10;
        rectF.offset(x8, y10);
        wj0Var.setCustomEmojiEnterProgress(this.j);
        if (z10) {
            this.w = SharedConfig.getDevicePerformanceClass() >= 2 && LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
            this.k = false;
        } else {
            this.w = false;
        }
        if (this.w) {
            z11 = true;
            j(0.0f, true);
        } else {
            z11 = true;
        }
        k();
        zVar.setEnterAnimationInProgress(z11);
        zVar.W.m(z10 && this.w);
        this.B.lock();
        ValueAnimator valueAnimator2 = this.x;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        this.C = true;
        float f10 = this.j;
        if (i10 == 4) {
            valueAnimator = ValueAnimator.ofFloat(f10, z10 ? 1.0f : 0.0f);
        } else {
            float f11 = z10 ? 1.0f : 0.0f;
            nv0 nv0Var = new nv0();
            nv0Var.a = 0;
            nv0Var.b = 0;
            nv0Var.setFloatValues(new float[]{f10, f11});
            valueAnimator = nv0Var;
        }
        this.x = valueAnimator;
        valueAnimator.addUpdateListener(new y(i12, this, z10));
        if (!z10) {
            i();
        }
        this.x.addListener(new ag.x(i11, this, z10));
        if (i10 == 4) {
            this.x.setDuration(420L);
            this.x.setInterpolator(er.h);
        } else if (this.w) {
            this.x.setDuration(450L);
            this.x.setInterpolator(new OvershootInterpolator(0.5f));
        } else {
            this.x.setDuration(350L);
            this.x.setInterpolator(er.f);
        }
        c0Var.invalidate();
        h(true);
        if (z10) {
            wj0Var.setCustomEmojiReactionsBackground(false);
            ValueAnimator valueAnimator3 = this.x;
            Objects.requireNonNull(valueAnimator3);
            y9 y9Var = new y9(valueAnimator3, 5);
            g0.f = this.w;
            g0.e = true;
            g0.g = false;
            if (g0.d) {
                g0.d = false;
            }
            g0.c = y9Var;
        } else {
            wj0Var.K0 = true;
            wj0Var.invalidate();
            this.x.setStartDelay(30L);
            this.x.start();
        }
        HashSet hashSet = g0.a;
        ne.c cacheOutQueue = ImageLoader.getInstance().getCacheOutQueue();
        if (cacheOutQueue.b == null) {
            z12 = true;
            cacheOutQueue.b = new CountDownLatch(1);
        } else {
            z12 = true;
        }
        g0.b = z12;
        g0.e = false;
        g0.g = false;
    }

    public final void d() {
        if (this.q) {
            return;
        }
        wj0 wj0Var = this.n;
        if (wj0Var != null) {
            ValueAnimator valueAnimator = wj0Var.u0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            wj0Var.x0 = 0.0f;
            y1 y1Var = wj0Var.O;
            if (y1Var != null) {
                y1Var.invalidate();
            }
            wj0Var.invalidate();
        }
        ec.e();
        this.q = true;
        AndroidUtilities.hideKeyboard(this.c);
        c(false);
        if (this.v) {
            n2 n2Var = this.r;
            if (n2Var instanceof rn) {
                ((rn) n2Var).T9(true, true);
            }
        }
    }

    public final void e() {
        if (this.q) {
            return;
        }
        ec.e();
        this.q = true;
        y1 y1Var = this.c;
        AndroidUtilities.hideKeyboard(y1Var);
        y1Var.animate().alpha(0.0f).setDuration(150L).setListener(new b0(this, 1));
        if (this.v) {
            n2 n2Var = this.r;
            if (n2Var instanceof rn) {
                ((rn) n2Var).T9(true, true);
            }
        }
    }

    public final void f() {
        int i10 = 1;
        if (this.y != 5) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 7);
        }
        AndroidUtilities.runOnUIThread(new w(this, i10));
    }

    public final void h(boolean z10) {
        int i10 = z10 ? 2 : 0;
        z zVar = this.m;
        zVar.d0.setLayerType(i10, null);
        zVar.b0.setLayerType(i10, null);
        if (!this.w) {
            zVar.a0.setLayerType(i10, null);
            zVar.W.setLayerType(i10, null);
        } else {
            for (int i11 = 0; i11 < Math.min(zVar.W.b.getChildCount(), 16); i11++) {
                zVar.W.b.getChildAt(i11).setLayerType(i10, null);
            }
        }
    }

    public final void i() {
        int i10 = 0;
        while (true) {
            z zVar = this.m;
            x41 x41Var = zVar.d0;
            x41 x41Var2 = zVar.d0;
            if (i10 >= x41Var.getChildCount()) {
                return;
            }
            if (x41Var2.getChildAt(i10) instanceof j51) {
                j51 j51Var = (j51) x41Var2.getChildAt(i10);
                if (j51Var.x != null) {
                    j51Var.b = false;
                    j51Var.invalidate();
                }
            }
            i10++;
        }
    }

    public final void j(float f10, boolean z10) {
        RectF rectF;
        int i10;
        HashSet hashSet;
        z zVar = this.m;
        float y10 = zVar.getY();
        u41 u41Var = zVar.T;
        float y11 = u41Var.getY() + y10;
        x41 x41Var = zVar.d0;
        int y12 = (int) (x41Var.getY() + y11);
        ArrayList arrayList = null;
        int i11 = 0;
        boolean z11 = false;
        while (true) {
            int childCount = x41Var.getChildCount();
            rectF = this.i;
            i10 = 1;
            hashSet = this.D;
            if (i11 >= childCount) {
                break;
            }
            View childAt = x41Var.getChildAt(i11);
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
        int y13 = (int) (zVar.W.getY() + u41Var.getY() + zVar.getY());
        for (int i12 = 0; i12 < zVar.W.b.getChildCount(); i12++) {
            View childAt2 = zVar.W.b.getChildAt(i12);
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
            zVar.g0.invalidate();
        }
        if (arrayList != null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new t2(3, this, arrayList));
            this.E.add(ofFloat);
            ofFloat.addListener(new androidx.fragment.app.g(this, ofFloat, z10, i10));
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
        z zVar = this.m;
        zVar.b0.setAlpha(this.j);
        zVar.d0.setAlpha(this.j);
        zVar.e0.setAlpha(this.j);
        zVar.W.setAlpha(this.j);
        zVar.a0.setAlpha(this.j);
    }

    public final void l() {
        z zVar = this.m;
        u41 u41Var = zVar.T;
        u41 u41Var2 = zVar.T;
        boolean z10 = this.w;
        c0 c0Var = this.a;
        u41Var.setTranslationX(z10 ? 0.0f : c0Var.f);
        u41Var2.setTranslationY(c0Var.h);
        u41Var2.setPivotX(c0Var.r);
        u41Var2.setPivotY(c0Var.s);
        u41Var2.setScaleX(c0Var.n);
        u41Var2.setScaleY(c0Var.n);
    }
}
