package kg;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.OvershootInterpolator;
import bg.b3;
import bg.c1;
import bg.d1;
import bg.z2;
import i7.f6;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import jh.w2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.fk0;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.pv;
import org.telegram.ui.Components.vv0;
import org.telegram.ui.Components.xb0;
import org.telegram.ui.a51;
import org.telegram.ui.e51;
import org.telegram.ui.m51;
import org.telegram.ui.q41;
import org.telegram.ui.tn;
import org.telegram.ui.x41;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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
    public final d1 c;
    public final boolean d;
    public float e;
    public float g;
    public float h;
    public float j;
    public boolean k;
    public boolean l;
    public final z m;
    public final fk0 n;
    public final List o;
    public xb0 p;
    public boolean q;
    public final o2 r;
    public final c6 s;
    public float t;
    public float u;
    public boolean v;
    public boolean w;
    public ValueAnimator x;
    public final int y;
    public ng.d z;
    public final RectF f = new RectF();
    public final RectF i = new RectF();

    public d0(int i10, o2 o2Var, ArrayList arrayList, HashSet hashSet, fk0 fk0Var, c6 c6Var, boolean z10) {
        new Path();
        this.A = new int[2];
        this.B = new AnimationNotificationsLocker();
        this.D = new HashSet();
        this.E = new ArrayList();
        int i11 = 0;
        this.F = 0;
        this.y = i10;
        this.o = arrayList;
        this.r = o2Var;
        this.s = c6Var;
        Context context = o2Var != null ? o2Var.getContext() : fk0Var.getContext();
        d1 d1Var = new d1(this, context);
        this.c = d1Var;
        d1Var.setOnClickListener(new ag.o(this, 24));
        boolean z11 = i10 == 2 || i10 == 4 || i10 == 5 || z10;
        this.d = z11;
        c0 c0Var = new c0(this, context);
        this.a = c0Var;
        boolean z12 = z11;
        z zVar = new z(this, o2Var, context, fk0Var.getWindowType(), i10 != 1, c6Var, fk0Var, o2Var);
        this.m = zVar;
        zVar.setOutlineProvider(new a0(this));
        zVar.setClipToOutline(true);
        boolean z13 = fk0Var.b1;
        boolean z14 = fk0Var.c1;
        if (zVar.G1 != z13) {
            zVar.G1 = z13;
            zVar.H1 = z14;
            a51 a51Var = zVar.d0;
            if (a51Var != null) {
                a51Var.invalidate();
            }
            q41 q41Var = zVar.e0;
            if (q41Var != null) {
                q41Var.invalidate();
            }
        }
        zVar.setOnLongPressedListener(new m5.i(fk0Var, 20));
        zVar.setOnRecentClearedListener(new ya.a(11));
        zVar.setRecentReactions(arrayList);
        zVar.setSelectedReactions((HashSet<q0>) hashSet);
        zVar.setDrawBackground(false);
        zVar.s(null);
        c0Var.addView(zVar, f6.d(-1, -2.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        int i12 = i10 == 5 ? 2 : 16;
        if (i10 == 5) {
            c0Var.setClipChildren(false);
            c0Var.setClipToPadding(false);
            d1Var.setClipChildren(false);
            d1Var.setClipToPadding(false);
        }
        float f9 = i12;
        d1Var.addView(c0Var, f6.d(-1, -1.0f, i10 == 5 ? 85 : 48, f9, f9, f9, 16.0f));
        d1Var.setClipChildren(false);
        if (i10 == 1 || (fk0Var.getDelegate() != null && fk0Var.getDelegate().O())) {
            zVar.setBackgroundDelegate(new w(i11, this, fk0Var));
        }
        if (z12) {
            ((ViewGroup) fk0Var.getParent()).addView(d1Var);
        } else {
            WindowManager.LayoutParams b10 = b(false);
            WindowManager windowManager = AndroidUtilities.findActivity(context).getWindowManager();
            this.b = windowManager;
            AndroidUtilities.setPreferredMaxRefreshRate(windowManager, d1Var, b10);
            windowManager.addView(d1Var, b10);
        }
        this.n = fk0Var;
        fk0Var.setOnSwitchedToLoopView(new x(this, i11));
        fk0Var.X0 = true;
        fk0Var.invalidate();
        AndroidUtilities.runOnUIThread(new w2(17, this, fk0Var), 50L);
        if (i10 != 5) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 7);
        }
    }

    public static void a(d0 d0Var, boolean z10) {
        View view;
        fk0 fk0Var = d0Var.n;
        z zVar = d0Var.m;
        if (d0Var.E.isEmpty()) {
            d0Var.h(false);
            g0.a();
            d0Var.B.unlock();
            zVar.setEnterAnimationInProgress(false);
            a51 a51Var = zVar.d0;
            if (z10) {
                zVar.W.m(false);
                a51Var.invalidate();
                ArrayList arrayList = a51Var.W2;
                a51Var.f1();
                zVar.b0.b();
                zVar.sendAccessibilityEvent(32);
                fk0Var.setImportantForAccessibility(4);
                int i10 = 0;
                while (true) {
                    if (i10 >= a51Var.getChildCount()) {
                        view = null;
                        break;
                    } else {
                        if (a51Var.getChildAt(i10) instanceof m51) {
                            view = a51Var.getChildAt(i10);
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
                if (fk0Var.getPullingLeftProgress() > 0.0f) {
                    fk0Var.K0 = false;
                    ValueAnimator valueAnimator = fk0Var.u0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    fk0Var.x0 = 0.0f;
                    d1 d1Var = fk0Var.O;
                    if (d1Var != null) {
                        d1Var.invalidate();
                    }
                    fk0Var.invalidate();
                } else {
                    fk0Var.K0 = true;
                    ValueAnimator valueAnimator2 = fk0Var.u0;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    fk0Var.x0 = 0.0f;
                    d1 d1Var2 = fk0Var.O;
                    if (d1Var2 != null) {
                        d1Var2.invalidate();
                    }
                    fk0Var.invalidate();
                }
                q41 q41Var = zVar.e0;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    e51 e51Var = (e51) arrayList.get(i11);
                    for (int i12 = 0; i12 < e51Var.K.size(); i12++) {
                        if (((m51) e51Var.K.get(i12)).b) {
                            ((m51) e51Var.K.get(i12)).b = false;
                            ((m51) e51Var.K.get(i12)).invalidate();
                            e51Var.k();
                        }
                    }
                }
                a51Var.invalidate();
                for (int i13 = 0; i13 < q41Var.W2.size(); i13++) {
                    e51 e51Var2 = (e51) q41Var.W2.get(i13);
                    for (int i14 = 0; i14 < e51Var2.K.size(); i14++) {
                        if (((m51) e51Var2.K.get(i14)).b) {
                            ((m51) e51Var2.K.get(i14)).b = false;
                            ((m51) e51Var2.K.get(i14)).invalidate();
                            e51Var2.k();
                        }
                    }
                }
                q41Var.invalidate();
                d0Var.i();
                d0Var.a.invalidate();
            }
        }
    }

    public static void g(View view, float f9) {
        if (view instanceof m51) {
            ((m51) view).setAnimatedScale(f9);
        } else if (view instanceof pv) {
            view.setScaleX(f9);
            view.setScaleY(f9);
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
        char c3;
        boolean z11;
        ValueAnimator valueAnimator;
        boolean z12;
        z zVar = this.m;
        int i10 = this.y;
        d1 d1Var = this.c;
        int[] iArr = this.A;
        c0 c0Var = this.a;
        RectF rectF = this.f;
        fk0 fk0Var = this.n;
        rectF.set(fk0Var.w);
        this.e = fk0Var.y;
        int[] iArr2 = new int[2];
        if (z10) {
            fk0Var.getLocationOnScreen(iArr);
        }
        d1Var.getLocationOnScreen(iArr2);
        float topOffset = fk0Var.getTopOffset() + ((((iArr[1] - iArr2[1]) - AndroidUtilities.dp(44.0f)) - AndroidUtilities.dp(52.0f)) - (zVar.K0 ? AndroidUtilities.dp(26.0f) : 0));
        if (fk0Var.B0) {
            topOffset = (iArr[1] - iArr2[1]) - AndroidUtilities.dp(12.0f);
        }
        if (c0Var.getMeasuredHeight() + topOffset > d1Var.getMeasuredHeight() - AndroidUtilities.dp(32.0f)) {
            topOffset = (d1Var.getMeasuredHeight() - AndroidUtilities.dp(32.0f)) - c0Var.getMeasuredHeight();
        }
        if (topOffset < AndroidUtilities.dp(16.0f)) {
            topOffset = AndroidUtilities.dp(16.0f);
        }
        if (i10 == 5) {
            topOffset = Math.min(topOffset, 0.0f);
        }
        if (i10 == 1) {
            c3 = 1;
            c0Var.setTranslationX(((d1Var.getMeasuredWidth() - c0Var.getMeasuredWidth()) / 2.0f) - AndroidUtilities.dp(16.0f));
        } else {
            c3 = 1;
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
        float x4 = (iArr[0] - iArr2[0]) - c0Var.getX();
        this.g = x4;
        float y8 = (iArr[c3] - iArr2[c3]) - c0Var.getY();
        this.h = y8;
        rectF.offset(x4, y8);
        fk0Var.setCustomEmojiEnterProgress(this.j);
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
        int i11 = 1;
        this.C = true;
        float f9 = this.j;
        if (i10 == 4) {
            valueAnimator = ValueAnimator.ofFloat(f9, z10 ? 1.0f : 0.0f);
        } else {
            float[] fArr = {f9, z10 ? 1.0f : 0.0f};
            vv0 vv0Var = new vv0();
            vv0Var.a = 0;
            vv0Var.b = 0;
            vv0Var.setFloatValues(fArr);
            valueAnimator = vv0Var;
        }
        this.x = valueAnimator;
        valueAnimator.addUpdateListener(new c1(i11, this, z10));
        if (!z10) {
            i();
        }
        this.x.addListener(new z2(3, this, z10));
        if (i10 == 4) {
            this.x.setDuration(420L);
            this.x.setInterpolator(jr.h);
        } else if (this.w) {
            this.x.setDuration(450L);
            this.x.setInterpolator(new OvershootInterpolator(0.5f));
        } else {
            this.x.setDuration(350L);
            this.x.setInterpolator(jr.f);
        }
        c0Var.invalidate();
        h(true);
        if (z10) {
            fk0Var.setCustomEmojiReactionsBackground(false);
            ValueAnimator valueAnimator3 = this.x;
            Objects.requireNonNull(valueAnimator3);
            jh.o oVar = new jh.o(valueAnimator3, 19);
            g0.f = this.w;
            g0.e = true;
            g0.g = false;
            if (g0.d) {
                g0.d = false;
            }
            g0.c = oVar;
        } else {
            fk0Var.K0 = true;
            fk0Var.invalidate();
            this.x.setStartDelay(30L);
            this.x.start();
        }
        HashSet hashSet = g0.a;
        pe.c cacheOutQueue = ImageLoader.getInstance().getCacheOutQueue();
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
        fk0 fk0Var = this.n;
        if (fk0Var != null) {
            ValueAnimator valueAnimator = fk0Var.u0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            fk0Var.x0 = 0.0f;
            d1 d1Var = fk0Var.O;
            if (d1Var != null) {
                d1Var.invalidate();
            }
            fk0Var.invalidate();
        }
        mc.e();
        this.q = true;
        AndroidUtilities.hideKeyboard(this.c);
        c(false);
        if (this.v) {
            o2 o2Var = this.r;
            if (o2Var instanceof tn) {
                ((tn) o2Var).T9(true, true);
            }
        }
    }

    public final void e() {
        if (this.q) {
            return;
        }
        mc.e();
        this.q = true;
        d1 d1Var = this.c;
        AndroidUtilities.hideKeyboard(d1Var);
        d1Var.animate().alpha(0.0f).setDuration(150L).setListener(new b0(this, 1));
        if (this.v) {
            o2 o2Var = this.r;
            if (o2Var instanceof tn) {
                ((tn) o2Var).T9(true, true);
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
            a51 a51Var = zVar.d0;
            a51 a51Var2 = zVar.d0;
            if (i10 >= a51Var.getChildCount()) {
                return;
            }
            if (a51Var2.getChildAt(i10) instanceof m51) {
                m51 m51Var = (m51) a51Var2.getChildAt(i10);
                if (m51Var.x != null) {
                    m51Var.b = false;
                    m51Var.invalidate();
                }
            }
            i10++;
        }
    }

    public final void j(float f9, boolean z10) {
        RectF rectF;
        HashSet hashSet;
        z zVar = this.m;
        float y8 = zVar.getY();
        x41 x41Var = zVar.T;
        float y10 = x41Var.getY() + y8;
        a51 a51Var = zVar.d0;
        int y11 = (int) (a51Var.getY() + y10);
        ArrayList arrayList = null;
        int i10 = 0;
        boolean z11 = false;
        while (true) {
            int childCount = a51Var.getChildCount();
            rectF = this.i;
            hashSet = this.D;
            if (i10 >= childCount) {
                break;
            }
            View childAt = a51Var.getChildAt(i10);
            if (!hashSet.contains(childAt)) {
                float measuredHeight = (childAt.getMeasuredHeight() / 2.0f) + childAt.getTop() + y11;
                if (measuredHeight >= rectF.bottom || measuredHeight <= rectF.top || f9 == 0.0f) {
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
        int y12 = (int) (zVar.W.getY() + x41Var.getY() + zVar.getY());
        for (int i11 = 0; i11 < zVar.W.b.getChildCount(); i11++) {
            View childAt2 = zVar.W.b.getChildAt(i11);
            if (!hashSet.contains(childAt2)) {
                float measuredHeight2 = (childAt2.getMeasuredHeight() / 2.0f) + childAt2.getTop() + y12;
                if (measuredHeight2 >= rectF.bottom || measuredHeight2 <= rectF.top || f9 == 0.0f) {
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
            ofFloat.addUpdateListener(new b3(4, this, arrayList));
            this.E.add(ofFloat);
            ofFloat.addListener(new androidx.fragment.app.g(this, ofFloat, z10, 2));
            if (this.y == 4) {
                ofFloat.setDuration(420L);
                ofFloat.setInterpolator(jr.h);
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
        x41 x41Var = zVar.T;
        x41 x41Var2 = zVar.T;
        boolean z10 = this.w;
        c0 c0Var = this.a;
        x41Var.setTranslationX(z10 ? 0.0f : c0Var.f);
        x41Var2.setTranslationY(c0Var.h);
        x41Var2.setPivotX(c0Var.r);
        x41Var2.setPivotY(c0Var.s);
        x41Var2.setScaleX(c0Var.n);
        x41Var2.setScaleY(c0Var.n);
    }
}
