package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
        boolean z10 = height < r1Var.c.getBottom();
        r1Var.s = z10;
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
            LaunchActivity launchActivity = LaunchActivity.G1;
            int expandedHeight = (launchActivity == null || launchActivity.P() == null) ? 0 : LaunchActivity.G1.P().getExpandedHeight();
            boolean z11 = r1Var instanceof yg.o;
            if (!z11) {
                r1Var.h(Math.max(i12, height + expandedHeight));
            }
            r1Var.d.requestLayout();
            r1Var.g(height, z10);
            float f7 = height - i12;
            Math.abs(f7);
            r1Var.f = true;
            if (height > i12) {
                float f10 = f7 - i13;
                if (!z11) {
                    frameLayout.setTranslationY(-f10);
                }
                r1Var.e(f10, 1.0f, z10);
                r1Var.p = -f10;
                r1Var.q = -expandedHeight;
                r1Var.r = true;
            } else {
                if (!z11) {
                    frameLayout.setTranslationY(r1Var.k);
                }
                r1Var.e(-r1Var.k, 0.0f, z10);
                r1Var.q = -r1Var.k;
                r1Var.p = f7;
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
