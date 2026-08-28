package hg;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.OvershootInterpolator;
import fh.o1;
import g7.e6;
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
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.ib0;
import org.telegram.ui.Components.jv;
import org.telegram.ui.Components.lv0;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.c51;
import org.telegram.ui.k51;
import org.telegram.ui.o41;
import org.telegram.ui.qn;
import org.telegram.ui.v41;
import org.telegram.ui.y41;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class e0 {
    public final int[] A;
    public final AnimationNotificationsLocker B;
    public boolean C;
    public final HashSet D;
    public final ArrayList E;
    public int F;
    public final d0 a;
    public final WindowManager b;
    public final fh.v c;
    public final boolean d;
    public float e;
    public float g;
    public float h;
    public float j;
    public boolean k;
    public boolean l;
    public final z m;
    public final uj0 n;
    public final List o;
    public ib0 p;
    public boolean q;
    public final o2 r;
    public final b6 s;
    public float t;
    public float u;
    public boolean v;
    public boolean w;
    public ValueAnimator x;
    public final int y;
    public kg.d z;
    public final RectF f = new RectF();
    public final RectF i = new RectF();

    public e0(int i9, o2 o2Var, ArrayList arrayList, HashSet hashSet, uj0 uj0Var, b6 b6Var, boolean z10) {
        new Path();
        this.A = new int[2];
        this.B = new AnimationNotificationsLocker();
        this.D = new HashSet();
        this.E = new ArrayList();
        int i10 = 0;
        this.F = 0;
        this.y = i9;
        this.o = arrayList;
        this.r = o2Var;
        this.s = b6Var;
        Context context = o2Var != null ? o2Var.getContext() : uj0Var.getContext();
        fh.v vVar = new fh.v(this, context);
        this.c = vVar;
        vVar.setOnClickListener(new androidx.mediarouter.app.c(this, 18));
        boolean z11 = i9 == 2 || i9 == 4 || i9 == 5 || z10;
        this.d = z11;
        d0 d0Var = new d0(this, context);
        this.a = d0Var;
        boolean z12 = z11;
        z zVar = new z(this, o2Var, context, uj0Var.getWindowType(), i9 != 1, b6Var, uj0Var, o2Var);
        this.m = zVar;
        zVar.setOutlineProvider(new a0(this));
        zVar.setClipToOutline(true);
        boolean z13 = uj0Var.b1;
        boolean z14 = uj0Var.c1;
        if (zVar.G1 != z13) {
            zVar.G1 = z13;
            zVar.H1 = z14;
            y41 y41Var = zVar.d0;
            if (y41Var != null) {
                y41Var.invalidate();
            }
            o41 o41Var = zVar.e0;
            if (o41Var != null) {
                o41Var.invalidate();
            }
        }
        zVar.setOnLongPressedListener(new fa.c(uj0Var, 21));
        zVar.setOnRecentClearedListener(new v9.d(9));
        zVar.setRecentReactions(arrayList);
        zVar.setSelectedReactions((HashSet<r0>) hashSet);
        zVar.setDrawBackground(false);
        zVar.s(null);
        d0Var.addView(zVar, e6.d(-1, -2.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        int i11 = i9 == 5 ? 2 : 16;
        if (i9 == 5) {
            d0Var.setClipChildren(false);
            d0Var.setClipToPadding(false);
            vVar.setClipChildren(false);
            vVar.setClipToPadding(false);
        }
        float f10 = i11;
        vVar.addView(d0Var, e6.d(-1, -1.0f, i9 == 5 ? 85 : 48, f10, f10, f10, 16.0f));
        vVar.setClipChildren(false);
        if (i9 == 1 || (uj0Var.getDelegate() != null && uj0Var.getDelegate().u())) {
            zVar.setBackgroundDelegate(new b5.d(24, this, uj0Var));
        }
        if (z12) {
            ((ViewGroup) uj0Var.getParent()).addView(vVar);
        } else {
            WindowManager.LayoutParams b10 = b(false);
            WindowManager windowManager = AndroidUtilities.findActivity(context).getWindowManager();
            this.b = windowManager;
            AndroidUtilities.setPreferredMaxRefreshRate(windowManager, vVar, b10);
            windowManager.addView(vVar, b10);
        }
        this.n = uj0Var;
        uj0Var.setOnSwitchedToLoopView(new w(this, i10));
        uj0Var.X0 = true;
        uj0Var.invalidate();
        AndroidUtilities.runOnUIThread(new h3.g0(4, this, uj0Var), 50L);
        if (i9 != 5) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 7);
        }
    }

    public static void a(e0 e0Var, boolean z10) {
        View view;
        uj0 uj0Var = e0Var.n;
        z zVar = e0Var.m;
        if (e0Var.E.isEmpty()) {
            e0Var.h(false);
            h0.a();
            e0Var.B.unlock();
            zVar.setEnterAnimationInProgress(false);
            y41 y41Var = zVar.d0;
            if (z10) {
                zVar.W.m(false);
                y41Var.invalidate();
                ArrayList arrayList = y41Var.W2;
                y41Var.f1();
                zVar.b0.b();
                zVar.sendAccessibilityEvent(32);
                uj0Var.setImportantForAccessibility(4);
                int i9 = 0;
                while (true) {
                    if (i9 >= y41Var.getChildCount()) {
                        view = null;
                        break;
                    } else {
                        if (y41Var.getChildAt(i9) instanceof k51) {
                            view = y41Var.getChildAt(i9);
                            break;
                        }
                        i9++;
                    }
                }
                if (view != null) {
                    view.performAccessibilityAction(64, null);
                } else {
                    zVar.performAccessibilityAction(64, null);
                }
                if (uj0Var.getPullingLeftProgress() > 0.0f) {
                    uj0Var.K0 = false;
                    ValueAnimator valueAnimator = uj0Var.u0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    uj0Var.x0 = 0.0f;
                    fh.v vVar = uj0Var.O;
                    if (vVar != null) {
                        vVar.invalidate();
                    }
                    uj0Var.invalidate();
                } else {
                    uj0Var.K0 = true;
                    ValueAnimator valueAnimator2 = uj0Var.u0;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    uj0Var.x0 = 0.0f;
                    fh.v vVar2 = uj0Var.O;
                    if (vVar2 != null) {
                        vVar2.invalidate();
                    }
                    uj0Var.invalidate();
                }
                o41 o41Var = zVar.e0;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    c51 c51Var = (c51) arrayList.get(i10);
                    for (int i11 = 0; i11 < c51Var.K.size(); i11++) {
                        if (((k51) c51Var.K.get(i11)).b) {
                            ((k51) c51Var.K.get(i11)).b = false;
                            ((k51) c51Var.K.get(i11)).invalidate();
                            c51Var.k();
                        }
                    }
                }
                y41Var.invalidate();
                for (int i12 = 0; i12 < o41Var.W2.size(); i12++) {
                    c51 c51Var2 = (c51) o41Var.W2.get(i12);
                    for (int i13 = 0; i13 < c51Var2.K.size(); i13++) {
                        if (((k51) c51Var2.K.get(i13)).b) {
                            ((k51) c51Var2.K.get(i13)).b = false;
                            ((k51) c51Var2.K.get(i13)).invalidate();
                            c51Var2.k();
                        }
                    }
                }
                o41Var.invalidate();
                e0Var.i();
                e0Var.a.invalidate();
            }
        }
    }

    public static void g(View view, float f10) {
        if (view instanceof k51) {
            ((k51) view).setAnimatedScale(f10);
        } else if (view instanceof jv) {
            view.setScaleX(f10);
            view.setScaleY(f10);
        }
    }

    public final WindowManager.LayoutParams b(boolean z10) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.height = -1;
        layoutParams.width = -1;
        int i9 = this.y;
        layoutParams.type = (i9 == 0 || i9 == 3) ? MediaDataController.MAX_STYLE_RUNS_COUNT : 99;
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
        int i9 = this.y;
        fh.v vVar = this.c;
        int[] iArr = this.A;
        d0 d0Var = this.a;
        RectF rectF = this.f;
        uj0 uj0Var = this.n;
        rectF.set(uj0Var.w);
        this.e = uj0Var.y;
        int[] iArr2 = new int[2];
        if (z10) {
            uj0Var.getLocationOnScreen(iArr);
        }
        vVar.getLocationOnScreen(iArr2);
        int i10 = 0;
        float topOffset = uj0Var.getTopOffset() + ((((iArr[1] - iArr2[1]) - AndroidUtilities.dp(44.0f)) - AndroidUtilities.dp(52.0f)) - (zVar.K0 ? AndroidUtilities.dp(26.0f) : 0));
        if (uj0Var.B0) {
            topOffset = (iArr[1] - iArr2[1]) - AndroidUtilities.dp(12.0f);
        }
        if (d0Var.getMeasuredHeight() + topOffset > vVar.getMeasuredHeight() - AndroidUtilities.dp(32.0f)) {
            topOffset = (vVar.getMeasuredHeight() - AndroidUtilities.dp(32.0f)) - d0Var.getMeasuredHeight();
        }
        if (topOffset < AndroidUtilities.dp(16.0f)) {
            topOffset = AndroidUtilities.dp(16.0f);
        }
        if (i9 == 5) {
            topOffset = Math.min(topOffset, 0.0f);
        }
        if (i9 == 1) {
            c10 = 1;
            d0Var.setTranslationX(((vVar.getMeasuredWidth() - d0Var.getMeasuredWidth()) / 2.0f) - AndroidUtilities.dp(16.0f));
        } else {
            c10 = 1;
            if (i9 == 2 || i9 == 4) {
                d0Var.setTranslationX((iArr[0] - iArr2[0]) - AndroidUtilities.dp(18.0f));
            } else {
                d0Var.setTranslationX((iArr[0] - iArr2[0]) - AndroidUtilities.dp(2.0f));
            }
        }
        if (z10) {
            this.t = topOffset;
            d0Var.setTranslationY(topOffset);
        } else {
            this.t = d0Var.getTranslationY();
        }
        float x10 = (iArr[0] - iArr2[0]) - d0Var.getX();
        this.g = x10;
        float y10 = (iArr[c10] - iArr2[c10]) - d0Var.getY();
        this.h = y10;
        rectF.offset(x10, y10);
        uj0Var.setCustomEmojiEnterProgress(this.j);
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
        if (i9 == 4) {
            valueAnimator = ValueAnimator.ofFloat(f10, z10 ? 1.0f : 0.0f);
        } else {
            float f11 = z10 ? 1.0f : 0.0f;
            lv0 lv0Var = new lv0();
            lv0Var.a = 0;
            lv0Var.b = 0;
            lv0Var.setFloatValues(new float[]{f10, f11});
            valueAnimator = lv0Var;
        }
        this.x = valueAnimator;
        valueAnimator.addUpdateListener(new y(i10, this, z10));
        if (!z10) {
            i();
        }
        this.x.addListener(new b0(i10, this, z10));
        if (i9 == 4) {
            this.x.setDuration(420L);
            this.x.setInterpolator(gr.h);
        } else if (this.w) {
            this.x.setDuration(450L);
            this.x.setInterpolator(new OvershootInterpolator(0.5f));
        } else {
            this.x.setDuration(350L);
            this.x.setInterpolator(gr.f);
        }
        d0Var.invalidate();
        h(true);
        if (z10) {
            uj0Var.setCustomEmojiReactionsBackground(false);
            ValueAnimator valueAnimator3 = this.x;
            Objects.requireNonNull(valueAnimator3);
            o1 o1Var = new o1(valueAnimator3, 27);
            h0.f = this.w;
            h0.e = true;
            h0.g = false;
            if (h0.d) {
                h0.d = false;
            }
            h0.c = o1Var;
        } else {
            uj0Var.K0 = true;
            uj0Var.invalidate();
            this.x.setStartDelay(30L);
            this.x.start();
        }
        HashSet hashSet = h0.a;
        me.c cacheOutQueue = ImageLoader.getInstance().getCacheOutQueue();
        if (cacheOutQueue.b == null) {
            z12 = true;
            cacheOutQueue.b = new CountDownLatch(1);
        } else {
            z12 = true;
        }
        h0.b = z12;
        h0.e = false;
        h0.g = false;
    }

    public final void d() {
        if (this.q) {
            return;
        }
        uj0 uj0Var = this.n;
        if (uj0Var != null) {
            ValueAnimator valueAnimator = uj0Var.u0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            uj0Var.x0 = 0.0f;
            fh.v vVar = uj0Var.O;
            if (vVar != null) {
                vVar.invalidate();
            }
            uj0Var.invalidate();
        }
        gc.e();
        this.q = true;
        AndroidUtilities.hideKeyboard(this.c);
        c(false);
        if (this.v) {
            o2 o2Var = this.r;
            if (o2Var instanceof qn) {
                ((qn) o2Var).T9(true, true);
            }
        }
    }

    public final void e() {
        if (this.q) {
            return;
        }
        gc.e();
        this.q = true;
        fh.v vVar = this.c;
        AndroidUtilities.hideKeyboard(vVar);
        vVar.animate().alpha(0.0f).setDuration(150L).setListener(new c0(this, 1));
        if (this.v) {
            o2 o2Var = this.r;
            if (o2Var instanceof qn) {
                ((qn) o2Var).T9(true, true);
            }
        }
    }

    public final void f() {
        int i9 = 1;
        if (this.y != 5) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 7);
        }
        AndroidUtilities.runOnUIThread(new w(this, i9));
    }

    public final void h(boolean z10) {
        int i9 = z10 ? 2 : 0;
        z zVar = this.m;
        zVar.d0.setLayerType(i9, null);
        zVar.b0.setLayerType(i9, null);
        if (!this.w) {
            zVar.a0.setLayerType(i9, null);
            zVar.W.setLayerType(i9, null);
        } else {
            for (int i10 = 0; i10 < Math.min(zVar.W.b.getChildCount(), 16); i10++) {
                zVar.W.b.getChildAt(i10).setLayerType(i9, null);
            }
        }
    }

    public final void i() {
        int i9 = 0;
        while (true) {
            z zVar = this.m;
            y41 y41Var = zVar.d0;
            y41 y41Var2 = zVar.d0;
            if (i9 >= y41Var.getChildCount()) {
                return;
            }
            if (y41Var2.getChildAt(i9) instanceof k51) {
                k51 k51Var = (k51) y41Var2.getChildAt(i9);
                if (k51Var.x != null) {
                    k51Var.b = false;
                    k51Var.invalidate();
                }
            }
            i9++;
        }
    }

    public final void j(float f10, boolean z10) {
        RectF rectF;
        int i9;
        HashSet hashSet;
        z zVar = this.m;
        float y10 = zVar.getY();
        v41 v41Var = zVar.T;
        float y11 = v41Var.getY() + y10;
        y41 y41Var = zVar.d0;
        int y12 = (int) (y41Var.getY() + y11);
        ArrayList arrayList = null;
        int i10 = 0;
        boolean z11 = false;
        while (true) {
            int childCount = y41Var.getChildCount();
            rectF = this.i;
            i9 = 1;
            hashSet = this.D;
            if (i10 >= childCount) {
                break;
            }
            View childAt = y41Var.getChildAt(i10);
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
            i10++;
        }
        int y13 = (int) (zVar.W.getY() + v41Var.getY() + zVar.getY());
        for (int i11 = 0; i11 < zVar.W.b.getChildCount(); i11++) {
            View childAt2 = zVar.W.b.getChildAt(i11);
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
            ofFloat.addUpdateListener(new f2.g(2, this, arrayList));
            this.E.add(ofFloat);
            ofFloat.addListener(new androidx.fragment.app.g(this, ofFloat, z10, i9));
            if (this.y == 4) {
                ofFloat.setDuration(420L);
                ofFloat.setInterpolator(gr.h);
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
        v41 v41Var = zVar.T;
        v41 v41Var2 = zVar.T;
        boolean z10 = this.w;
        d0 d0Var = this.a;
        v41Var.setTranslationX(z10 ? 0.0f : d0Var.f);
        v41Var2.setTranslationY(d0Var.h);
        v41Var2.setPivotX(d0Var.r);
        v41Var2.setPivotY(d0Var.s);
        v41Var2.setScaleX(d0Var.n);
        v41Var2.setScaleY(d0Var.n);
    }
}
