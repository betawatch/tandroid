package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class p1 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ q1 a;

    public p1(q1 q1Var) {
        this.a = q1Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        q1 q1Var = this.a;
        FrameLayout frameLayout = q1Var.a;
        int height = frameLayout.getHeight();
        int i9 = height - q1Var.i();
        int i10 = q1Var.i;
        if (i9 == i10 - q1Var.k || height == i10 || q1Var.m != null) {
            if (q1Var.m == null) {
                q1Var.i = height;
                q1Var.j = q1Var.c.getHeight();
                q1Var.k = q1Var.i();
                q1Var.e = false;
            }
            return true;
        }
        if (!q1Var.b() || Math.abs(q1Var.i - height) < AndroidUtilities.dp(20.0f)) {
            q1Var.i = height;
            q1Var.j = q1Var.c.getHeight();
            q1Var.k = q1Var.i();
            q1Var.e = false;
            return true;
        }
        if (q1Var.i == -1 || q1Var.j != q1Var.c.getHeight()) {
            q1Var.i = height;
            q1Var.j = q1Var.c.getHeight();
            q1Var.k = q1Var.i();
            return false;
        }
        boolean z10 = height < q1Var.c.getBottom();
        q1Var.s = z10;
        int i11 = q1Var.i;
        if (q1Var.v) {
            q1Var.v = false;
        } else if (q1Var.u) {
            ValueAnimator valueAnimator = q1Var.m;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            int i12 = q1Var.i();
            ArrayList arrayList = q1Var.o;
            arrayList.clear();
            View view = frameLayout;
            while (view != null) {
                arrayList.add(view);
                if (view == q1Var.d) {
                    break;
                }
                view = view.getParent() instanceof View ? (View) view.getParent() : null;
            }
            LaunchActivity launchActivity = LaunchActivity.C1;
            int expandedHeight = (launchActivity == null || launchActivity.P() == null) ? 0 : LaunchActivity.C1.P().getExpandedHeight();
            boolean z11 = q1Var instanceof hg.o;
            if (!z11) {
                q1Var.h(Math.max(i11, height + expandedHeight));
            }
            q1Var.d.requestLayout();
            q1Var.g(height, z10);
            float f10 = height - i11;
            Math.abs(f10);
            q1Var.f = true;
            if (height > i11) {
                float f11 = f10 - i12;
                if (!z11) {
                    frameLayout.setTranslationY(-f11);
                }
                q1Var.e(f11, 1.0f, z10);
                q1Var.p = -f11;
                q1Var.q = -expandedHeight;
                q1Var.r = true;
            } else {
                if (!z11) {
                    frameLayout.setTranslationY(q1Var.k);
                }
                q1Var.e(-q1Var.k, 0.0f, z10);
                q1Var.q = -q1Var.k;
                q1Var.p = f10;
                q1Var.r = false;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            q1Var.m = ofFloat;
            q1Var.e = false;
            ofFloat.addUpdateListener(new x0(q1Var, 3));
            q1Var.m.addListener(new h(q1Var, 2));
            q1Var.m.setDuration(250L);
            q1Var.m.setInterpolator(q1.w);
            q1Var.n.lock();
            if (q1Var.g) {
                q1Var.g = false;
                SystemClock.elapsedRealtime();
                AndroidUtilities.runOnUIThread(q1Var.h, 100L);
            } else {
                q1Var.m.start();
            }
        }
        q1Var.i = height;
        q1Var.j = q1Var.c.getHeight();
        q1Var.k = q1Var.i();
        return false;
    }
}
