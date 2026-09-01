package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class q1 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ r1 a;

    public q1(r1 r1Var) {
        this.a = r1Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        r1 r1Var = this.a;
        FrameLayout frameLayout = r1Var.a;
        int height = frameLayout.getHeight();
        int i10 = height - r1Var.i();
        int i11 = r1Var.i;
        if (i10 == i11 - r1Var.k || height == i11 || r1Var.m != null) {
            if (r1Var.m == null) {
                r1Var.i = height;
                r1Var.j = r1Var.c.getHeight();
                r1Var.k = r1Var.i();
                r1Var.e = false;
            }
            return true;
        }
        if (!r1Var.b() || Math.abs(r1Var.i - height) < AndroidUtilities.dp(20.0f)) {
            r1Var.i = height;
            r1Var.j = r1Var.c.getHeight();
            r1Var.k = r1Var.i();
            r1Var.e = false;
            return true;
        }
        if (r1Var.i == -1 || r1Var.j != r1Var.c.getHeight()) {
            r1Var.i = height;
            r1Var.j = r1Var.c.getHeight();
            r1Var.k = r1Var.i();
            return false;
        }
        boolean z4 = height < r1Var.c.getBottom();
        r1Var.s = z4;
        int i12 = r1Var.i;
        if (r1Var.v) {
            r1Var.v = false;
        } else if (r1Var.u) {
            ValueAnimator valueAnimator = r1Var.m;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            int i13 = r1Var.i();
            ArrayList arrayList = r1Var.o;
            arrayList.clear();
            View view = frameLayout;
            while (view != null) {
                arrayList.add(view);
                if (view == r1Var.d) {
                    break;
                }
                view = view.getParent() instanceof View ? (View) view.getParent() : null;
            }
            LaunchActivity launchActivity = LaunchActivity.D1;
            int expandedHeight = (launchActivity == null || launchActivity.P() == null) ? 0 : LaunchActivity.D1.P().getExpandedHeight();
            boolean z10 = r1Var instanceof ng.o;
            if (!z10) {
                r1Var.h(Math.max(i12, height + expandedHeight));
            }
            r1Var.d.requestLayout();
            r1Var.g(height, z4);
            float f10 = height - i12;
            Math.abs(f10);
            r1Var.f = true;
            if (height > i12) {
                float f11 = f10 - i13;
                if (!z10) {
                    frameLayout.setTranslationY(-f11);
                }
                r1Var.e(f11, 1.0f, z4);
                r1Var.p = -f11;
                r1Var.q = -expandedHeight;
                r1Var.r = true;
            } else {
                if (!z10) {
                    frameLayout.setTranslationY(r1Var.k);
                }
                r1Var.e(-r1Var.k, 0.0f, z4);
                r1Var.q = -r1Var.k;
                r1Var.p = f10;
                r1Var.r = false;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            r1Var.m = ofFloat;
            r1Var.e = false;
            ofFloat.addUpdateListener(new x0(r1Var, 3));
            r1Var.m.addListener(new h(r1Var, 2));
            r1Var.m.setDuration(250L);
            r1Var.m.setInterpolator(r1.w);
            r1Var.n.lock();
            if (r1Var.g) {
                r1Var.g = false;
                SystemClock.elapsedRealtime();
                AndroidUtilities.runOnUIThread(r1Var.h, 100L);
            } else {
                r1Var.m.start();
            }
        }
        r1Var.i = height;
        r1Var.j = r1Var.c.getHeight();
        r1Var.k = r1Var.i();
        return false;
    }
}
