package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class n1 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ o1 a;

    public n1(o1 o1Var) {
        this.a = o1Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        o1 o1Var = this.a;
        FrameLayout frameLayout = o1Var.a;
        int height = frameLayout.getHeight();
        int i10 = height - o1Var.i();
        int i11 = o1Var.i;
        if (i10 == i11 - o1Var.k || height == i11 || o1Var.m != null) {
            if (o1Var.m == null) {
                o1Var.i = height;
                o1Var.j = o1Var.c.getHeight();
                o1Var.k = o1Var.i();
                o1Var.e = false;
            }
            return true;
        }
        if (!o1Var.b() || Math.abs(o1Var.i - height) < AndroidUtilities.dp(20.0f)) {
            o1Var.i = height;
            o1Var.j = o1Var.c.getHeight();
            o1Var.k = o1Var.i();
            o1Var.e = false;
            return true;
        }
        if (o1Var.i == -1 || o1Var.j != o1Var.c.getHeight()) {
            o1Var.i = height;
            o1Var.j = o1Var.c.getHeight();
            o1Var.k = o1Var.i();
            return false;
        }
        boolean z10 = height < o1Var.c.getBottom();
        o1Var.s = z10;
        int i12 = o1Var.i;
        if (o1Var.v) {
            o1Var.v = false;
        } else if (o1Var.u) {
            ValueAnimator valueAnimator = o1Var.m;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            int i13 = o1Var.i();
            ArrayList arrayList = o1Var.o;
            arrayList.clear();
            View view = frameLayout;
            while (view != null) {
                arrayList.add(view);
                if (view == o1Var.d) {
                    break;
                }
                view = view.getParent() instanceof View ? (View) view.getParent() : null;
            }
            LaunchActivity launchActivity = LaunchActivity.G1;
            int expandedHeight = (launchActivity == null || launchActivity.P() == null) ? 0 : LaunchActivity.G1.P().getExpandedHeight();
            boolean z11 = o1Var instanceof zg.n;
            if (!z11) {
                o1Var.h(Math.max(i12, height + expandedHeight));
            }
            o1Var.d.requestLayout();
            o1Var.g(height, z10);
            float f7 = height - i12;
            Math.abs(f7);
            o1Var.f = true;
            if (height > i12) {
                float f10 = f7 - i13;
                if (!z11) {
                    frameLayout.setTranslationY(-f10);
                }
                o1Var.e(f10, 1.0f, z10);
                o1Var.p = -f10;
                o1Var.q = -expandedHeight;
                o1Var.r = true;
            } else {
                if (!z11) {
                    frameLayout.setTranslationY(o1Var.k);
                }
                o1Var.e(-o1Var.k, 0.0f, z10);
                o1Var.q = -o1Var.k;
                o1Var.p = f7;
                o1Var.r = false;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            o1Var.m = ofFloat;
            o1Var.e = false;
            ofFloat.addUpdateListener(new v0(o1Var, 3));
            o1Var.m.addListener(new h(o1Var, 2));
            o1Var.m.setDuration(250L);
            o1Var.m.setInterpolator(o1.w);
            o1Var.n.lock();
            if (o1Var.g) {
                o1Var.g = false;
                SystemClock.elapsedRealtime();
                AndroidUtilities.runOnUIThread(o1Var.h, 100L);
            } else {
                o1Var.m.start();
            }
        }
        o1Var.i = height;
        o1Var.j = o1Var.c.getHeight();
        o1Var.k = o1Var.i();
        return false;
    }
}
