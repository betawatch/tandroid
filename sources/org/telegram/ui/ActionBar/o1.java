package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class o1 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ p1 a;

    public o1(p1 p1Var) {
        this.a = p1Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        p1 p1Var = this.a;
        FrameLayout frameLayout = p1Var.a;
        int height = frameLayout.getHeight();
        int i10 = height - p1Var.i();
        int i11 = p1Var.i;
        if (i10 == i11 - p1Var.k || height == i11 || p1Var.m != null) {
            if (p1Var.m == null) {
                p1Var.i = height;
                p1Var.j = p1Var.c.getHeight();
                p1Var.k = p1Var.i();
                p1Var.e = false;
            }
            return true;
        }
        if (!p1Var.b() || Math.abs(p1Var.i - height) < AndroidUtilities.dp(20.0f)) {
            p1Var.i = height;
            p1Var.j = p1Var.c.getHeight();
            p1Var.k = p1Var.i();
            p1Var.e = false;
            return true;
        }
        if (p1Var.i == -1 || p1Var.j != p1Var.c.getHeight()) {
            p1Var.i = height;
            p1Var.j = p1Var.c.getHeight();
            p1Var.k = p1Var.i();
            return false;
        }
        boolean z10 = height < p1Var.c.getBottom();
        p1Var.s = z10;
        int i12 = p1Var.i;
        if (p1Var.v) {
            p1Var.v = false;
        } else if (p1Var.u) {
            ValueAnimator valueAnimator = p1Var.m;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            int i13 = p1Var.i();
            ArrayList arrayList = p1Var.o;
            arrayList.clear();
            View view = frameLayout;
            while (view != null) {
                arrayList.add(view);
                if (view == p1Var.d) {
                    break;
                }
                view = view.getParent() instanceof View ? (View) view.getParent() : null;
            }
            LaunchActivity launchActivity = LaunchActivity.G1;
            int expandedHeight = (launchActivity == null || launchActivity.P() == null) ? 0 : LaunchActivity.G1.P().getExpandedHeight();
            boolean z11 = p1Var instanceof ah.v;
            if (!z11) {
                p1Var.h(Math.max(i12, height + expandedHeight));
            }
            p1Var.d.requestLayout();
            p1Var.g(height, z10);
            float f7 = height - i12;
            Math.abs(f7);
            p1Var.f = true;
            if (height > i12) {
                float f10 = f7 - i13;
                if (!z11) {
                    frameLayout.setTranslationY(-f10);
                }
                p1Var.e(f10, 1.0f, z10);
                p1Var.p = -f10;
                p1Var.q = -expandedHeight;
                p1Var.r = true;
            } else {
                if (!z11) {
                    frameLayout.setTranslationY(p1Var.k);
                }
                p1Var.e(-p1Var.k, 0.0f, z10);
                p1Var.q = -p1Var.k;
                p1Var.p = f7;
                p1Var.r = false;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            p1Var.m = ofFloat;
            p1Var.e = false;
            ofFloat.addUpdateListener(new w0(p1Var, 3));
            p1Var.m.addListener(new h(p1Var, 2));
            p1Var.m.setDuration(250L);
            p1Var.m.setInterpolator(p1.w);
            p1Var.n.lock();
            if (p1Var.g) {
                p1Var.g = false;
                SystemClock.elapsedRealtime();
                AndroidUtilities.runOnUIThread(p1Var.h, 100L);
            } else {
                p1Var.m.start();
            }
        }
        p1Var.i = height;
        p1Var.j = p1Var.c.getHeight();
        p1Var.k = p1Var.i();
        return false;
    }
}
