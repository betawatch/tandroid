package mg;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.OvershootInterpolator;
import dg.b1;
import dg.w2;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import k7.b6;
import lh.n2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.cc0;
import org.telegram.ui.Components.ew0;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.pk0;
import org.telegram.ui.Components.tv;
import org.telegram.ui.b51;
import org.telegram.ui.j51;
import org.telegram.ui.m51;
import org.telegram.ui.q51;
import org.telegram.ui.xn;
import org.telegram.ui.y51;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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
    public final ah.d c;
    public final boolean d;
    public float e;
    public float g;
    public float h;
    public float j;
    public boolean k;
    public boolean l;
    public final z m;
    public final pk0 n;
    public final List o;
    public cc0 p;
    public boolean q;
    public final p2 r;
    public final f6 s;
    public float t;
    public float u;
    public boolean v;
    public boolean w;
    public ValueAnimator x;
    public final int y;
    public pg.b z;
    public final RectF f = new RectF();
    public final RectF i = new RectF();

    public d0(int i10, p2 p2Var, ArrayList arrayList, HashSet hashSet, pk0 pk0Var, f6 f6Var, boolean z4) {
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
        this.s = f6Var;
        Context context = p2Var != null ? p2Var.getContext() : pk0Var.getContext();
        ah.d dVar = new ah.d(this, context);
        this.c = dVar;
        dVar.setOnClickListener(new androidx.mediarouter.app.c(this, 24));
        boolean z10 = i10 == 2 || i10 == 4 || i10 == 5 || z4;
        this.d = z10;
        c0 c0Var = new c0(this, context);
        this.a = c0Var;
        boolean z11 = z10;
        z zVar = new z(this, p2Var, context, pk0Var.getWindowType(), i10 != 1, f6Var, pk0Var, p2Var);
        this.m = zVar;
        zVar.setOutlineProvider(new a0(this));
        zVar.setClipToOutline(true);
        boolean z12 = pk0Var.c1;
        boolean z13 = pk0Var.d1;
        if (zVar.H1 != z12) {
            zVar.H1 = z12;
            zVar.I1 = z13;
            m51 m51Var = zVar.e0;
            if (m51Var != null) {
                m51Var.invalidate();
            }
            b51 b51Var = zVar.f0;
            if (b51Var != null) {
                b51Var.invalidate();
            }
        }
        zVar.setOnLongPressedListener(new androidx.biometric.f0(pk0Var, 21));
        zVar.setOnRecentClearedListener(new cb.b(13));
        zVar.setRecentReactions(arrayList);
        zVar.setSelectedReactions((HashSet<q0>) hashSet);
        zVar.setDrawBackground(false);
        zVar.s(null);
        c0Var.addView(zVar, b6.d(-1, -2.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        int i12 = i10 == 5 ? 2 : 16;
        if (i10 == 5) {
            c0Var.setClipChildren(false);
            c0Var.setClipToPadding(false);
            dVar.setClipChildren(false);
            dVar.setClipToPadding(false);
        }
        float f10 = i12;
        dVar.addView(c0Var, b6.d(-1, -1.0f, i10 == 5 ? 85 : 48, f10, f10, f10, 16.0f));
        dVar.setClipChildren(false);
        if (i10 == 1 || (pk0Var.getDelegate() != null && pk0Var.getDelegate().s())) {
            zVar.setBackgroundDelegate(new w(i11, this, pk0Var));
        }
        if (z11) {
            ((ViewGroup) pk0Var.getParent()).addView(dVar);
        } else {
            WindowManager.LayoutParams b10 = b(false);
            WindowManager windowManager = AndroidUtilities.findActivity(context).getWindowManager();
            this.b = windowManager;
            AndroidUtilities.setPreferredMaxRefreshRate(windowManager, dVar, b10);
            windowManager.addView(dVar, b10);
        }
        this.n = pk0Var;
        pk0Var.setOnSwitchedToLoopView(new x(this, i11));
        pk0Var.Y0 = true;
        pk0Var.invalidate();
        AndroidUtilities.runOnUIThread(new n2(19, this, pk0Var), 50L);
        if (i10 != 5) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 7);
        }
    }

    public static void a(d0 d0Var, boolean z4) {
        View view;
        pk0 pk0Var = d0Var.n;
        z zVar = d0Var.m;
        if (d0Var.E.isEmpty()) {
            d0Var.h(false);
            g0.a();
            d0Var.B.unlock();
            zVar.setEnterAnimationInProgress(false);
            m51 m51Var = zVar.e0;
            if (z4) {
                zVar.a0.m(false);
                m51Var.invalidate();
                ArrayList arrayList = m51Var.X2;
                m51Var.f1();
                zVar.c0.b();
                zVar.sendAccessibilityEvent(32);
                pk0Var.setImportantForAccessibility(4);
                int i10 = 0;
                while (true) {
                    if (i10 >= m51Var.getChildCount()) {
                        view = null;
                        break;
                    } else {
                        if (m51Var.getChildAt(i10) instanceof y51) {
                            view = m51Var.getChildAt(i10);
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
                if (pk0Var.getPullingLeftProgress() > 0.0f) {
                    pk0Var.L0 = false;
                    ValueAnimator valueAnimator = pk0Var.v0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    pk0Var.y0 = 0.0f;
                    ah.d dVar = pk0Var.P;
                    if (dVar != null) {
                        dVar.invalidate();
                    }
                    pk0Var.invalidate();
                } else {
                    pk0Var.L0 = true;
                    ValueAnimator valueAnimator2 = pk0Var.v0;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    pk0Var.y0 = 0.0f;
                    ah.d dVar2 = pk0Var.P;
                    if (dVar2 != null) {
                        dVar2.invalidate();
                    }
                    pk0Var.invalidate();
                }
                b51 b51Var = zVar.f0;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    q51 q51Var = (q51) arrayList.get(i11);
                    for (int i12 = 0; i12 < q51Var.L.size(); i12++) {
                        if (((y51) q51Var.L.get(i12)).b) {
                            ((y51) q51Var.L.get(i12)).b = false;
                            ((y51) q51Var.L.get(i12)).invalidate();
                            q51Var.k();
                        }
                    }
                }
                m51Var.invalidate();
                for (int i13 = 0; i13 < b51Var.X2.size(); i13++) {
                    q51 q51Var2 = (q51) b51Var.X2.get(i13);
                    for (int i14 = 0; i14 < q51Var2.L.size(); i14++) {
                        if (((y51) q51Var2.L.get(i14)).b) {
                            ((y51) q51Var2.L.get(i14)).b = false;
                            ((y51) q51Var2.L.get(i14)).invalidate();
                            q51Var2.k();
                        }
                    }
                }
                b51Var.invalidate();
                d0Var.i();
                d0Var.a.invalidate();
            }
        }
    }

    public static void g(View view, float f10) {
        if (view instanceof y51) {
            ((y51) view).setAnimatedScale(f10);
        } else if (view instanceof tv) {
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
        ah.d dVar = this.c;
        int[] iArr = this.A;
        c0 c0Var = this.a;
        RectF rectF = this.f;
        pk0 pk0Var = this.n;
        rectF.set(pk0Var.w);
        this.e = pk0Var.y;
        int[] iArr2 = new int[2];
        if (z4) {
            pk0Var.getLocationOnScreen(iArr);
        }
        dVar.getLocationOnScreen(iArr2);
        float topOffset = pk0Var.getTopOffset() + ((((iArr[1] - iArr2[1]) - AndroidUtilities.dp(44.0f)) - AndroidUtilities.dp(52.0f)) - (zVar.L0 ? AndroidUtilities.dp(26.0f) : 0));
        if (pk0Var.C0) {
            topOffset = (iArr[1] - iArr2[1]) - AndroidUtilities.dp(12.0f);
        }
        if (c0Var.getMeasuredHeight() + topOffset > dVar.getMeasuredHeight() - AndroidUtilities.dp(32.0f)) {
            topOffset = (dVar.getMeasuredHeight() - AndroidUtilities.dp(32.0f)) - c0Var.getMeasuredHeight();
        }
        if (topOffset < AndroidUtilities.dp(16.0f)) {
            topOffset = AndroidUtilities.dp(16.0f);
        }
        if (i10 == 5) {
            topOffset = Math.min(topOffset, 0.0f);
        }
        if (i10 == 1) {
            c3 = 1;
            c0Var.setTranslationX(((dVar.getMeasuredWidth() - c0Var.getMeasuredWidth()) / 2.0f) - AndroidUtilities.dp(16.0f));
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
        pk0Var.setCustomEmojiEnterProgress(this.j);
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
        valueAnimator.addUpdateListener(new b1(i11, this, z4));
        if (!z4) {
            i();
        }
        this.x.addListener(new w2(3, this, z4));
        if (i10 == 4) {
            this.x.setDuration(420L);
            this.x.setInterpolator(nr.h);
        } else if (this.w) {
            this.x.setDuration(450L);
            this.x.setInterpolator(new OvershootInterpolator(0.5f));
        } else {
            this.x.setDuration(350L);
            this.x.setInterpolator(nr.f);
        }
        c0Var.invalidate();
        h(true);
        if (z4) {
            pk0Var.setCustomEmojiReactionsBackground(false);
            ValueAnimator valueAnimator3 = this.x;
            Objects.requireNonNull(valueAnimator3);
            lh.b bVar = new lh.b(valueAnimator3, 19);
            g0.f = this.w;
            g0.e = true;
            g0.g = false;
            if (g0.d) {
                g0.d = false;
            }
            g0.c = bVar;
        } else {
            pk0Var.L0 = true;
            pk0Var.invalidate();
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
        pk0 pk0Var = this.n;
        if (pk0Var != null) {
            ValueAnimator valueAnimator = pk0Var.v0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            pk0Var.y0 = 0.0f;
            ah.d dVar = pk0Var.P;
            if (dVar != null) {
                dVar.invalidate();
            }
            pk0Var.invalidate();
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
        ah.d dVar = this.c;
        AndroidUtilities.hideKeyboard(dVar);
        dVar.animate().alpha(0.0f).setDuration(150L).setListener(new b0(this, 1));
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
            m51 m51Var = zVar.e0;
            m51 m51Var2 = zVar.e0;
            if (i10 >= m51Var.getChildCount()) {
                return;
            }
            if (m51Var2.getChildAt(i10) instanceof y51) {
                y51 y51Var = (y51) m51Var2.getChildAt(i10);
                if (y51Var.x != null) {
                    y51Var.b = false;
                    y51Var.invalidate();
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
        j51 j51Var = zVar.U;
        float y11 = j51Var.getY() + y10;
        m51 m51Var = zVar.e0;
        int y12 = (int) (m51Var.getY() + y11);
        ArrayList arrayList = null;
        int i10 = 0;
        boolean z10 = false;
        while (true) {
            int childCount = m51Var.getChildCount();
            rectF = this.i;
            hashSet = this.D;
            if (i10 >= childCount) {
                break;
            }
            View childAt = m51Var.getChildAt(i10);
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
        int y13 = (int) (zVar.a0.getY() + j51Var.getY() + zVar.getY());
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
            ofFloat.addUpdateListener(new ag.a(5, this, arrayList));
            this.E.add(ofFloat);
            ofFloat.addListener(new androidx.fragment.app.g(this, ofFloat, z4, 2));
            if (this.y == 4) {
                ofFloat.setDuration(420L);
                ofFloat.setInterpolator(nr.h);
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
        j51 j51Var = zVar.U;
        j51 j51Var2 = zVar.U;
        boolean z4 = this.w;
        c0 c0Var = this.a;
        j51Var.setTranslationX(z4 ? 0.0f : c0Var.f);
        j51Var2.setTranslationY(c0Var.h);
        j51Var2.setPivotX(c0Var.r);
        j51Var2.setPivotY(c0Var.s);
        j51Var2.setScaleX(c0Var.n);
        j51Var2.setScaleY(c0Var.n);
    }
}
