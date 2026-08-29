package org.telegram.ui.Components;

import android.os.SystemClock;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AnimationUtils;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.IOException;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class rk0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ rk0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                sk0 sk0Var = (sk0) this.b;
                rk0 rk0Var = sk0Var.e0;
                if (sk0Var.n) {
                    AndroidUtilities.cancelRunOnUIThread(rk0Var);
                    AndroidUtilities.runOnUIThread(rk0Var, 4000L);
                    return;
                } else {
                    sk0Var.Q = false;
                    sk0Var.invalidate();
                    return;
                }
            case 1:
                ll0 ll0Var = (ll0) this.b;
                RecyclerView recyclerView = ll0Var.a;
                if (recyclerView == null) {
                    return;
                }
                if (ll0Var.g) {
                    recyclerView.scrollBy(0, -ll0Var.i);
                    AndroidUtilities.runOnUIThread(this);
                    return;
                } else {
                    if (ll0Var.h) {
                        recyclerView.scrollBy(0, ll0Var.i);
                        AndroidUtilities.runOnUIThread(this);
                        return;
                    }
                    return;
                }
            case 2:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) this.b;
                if (scrollSlidingTextTabStrip.D) {
                    float f9 = scrollSlidingTextTabStrip.O + ((SystemClock.elapsedRealtime() <= 17 ? r5 : 17L) / scrollSlidingTextTabStrip.U);
                    scrollSlidingTextTabStrip.O = f9;
                    scrollSlidingTextTabStrip.setAnimationIdicatorProgress(scrollSlidingTextTabStrip.J.getInterpolation(f9));
                    if (scrollSlidingTextTabStrip.O > 1.0f) {
                        scrollSlidingTextTabStrip.O = 1.0f;
                    }
                    if (scrollSlidingTextTabStrip.O < 1.0f) {
                        AndroidUtilities.runOnUIThread(scrollSlidingTextTabStrip.W);
                        return;
                    }
                    scrollSlidingTextTabStrip.D = false;
                    scrollSlidingTextTabStrip.setEnabled(true);
                    jm0 jm0Var = scrollSlidingTextTabStrip.b;
                    if (jm0Var != null) {
                        jm0Var.u0(1.0f);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                ShutterButton shutterButton = (ShutterButton) this.b;
                vu0 vu0Var = shutterButton.e;
                if (vu0Var == null || ((ml) vu0Var).a()) {
                    return;
                }
                shutterButton.v = false;
                return;
            case 4:
                qw0 qw0Var = (qw0) this.b;
                View view = qw0Var.s;
                if (view == null) {
                    qw0Var.c.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).start();
                    return;
                }
                if (view.getVisibility() != 0) {
                    qw0Var.s.setVisibility(0);
                    qw0Var.s.setAlpha(0.0f);
                }
                qw0Var.s.animate().setListener(null).cancel();
                qw0Var.s.animate().alpha(1.0f).setDuration(150L).start();
                return;
            case 5:
                y71 y71Var = (y71) this.b;
                if (y71Var.F) {
                    float f10 = y71Var.b0 + ((SystemClock.elapsedRealtime() <= 17 ? r5 : 17L) / 200.0f);
                    y71Var.b0 = f10;
                    y71Var.setAnimationIdicatorProgress(y71Var.T.getInterpolation(f10));
                    if (y71Var.b0 > 1.0f) {
                        y71Var.b0 = 1.0f;
                    }
                    if (y71Var.b0 < 1.0f) {
                        AndroidUtilities.runOnUIThread(y71Var.e0);
                        return;
                    }
                    y71Var.F = false;
                    y71Var.setEnabled(true);
                    x71 x71Var = y71Var.y;
                    if (x71Var != null) {
                        ((n) x71Var).j(1.0f);
                        return;
                    }
                    return;
                }
                return;
            case 6:
                org.telegram.ui.j30 j30Var = (org.telegram.ui.j30) this.b;
                if (!j30Var.b || j30Var.M0.v0 != null) {
                    AndroidUtilities.runOnUIThread(j30Var.d0, 3000L);
                    return;
                } else {
                    j30Var.c0 = false;
                    j30Var.setUiVisible(false);
                    return;
                }
            case 7:
                p2.s sVar = (p2.s) this.b;
                p2.b bVar = sVar.d;
                bVar.k(0);
                p2.g gVar = p2.z.i;
                bVar.j(24, gVar);
                sVar.c(gVar);
                return;
            case 8:
                ((r5.h) this.b).g(false);
                return;
            case 9:
                s5.p pVar = (s5.p) this.b;
                synchronized (s5.p.i) {
                    try {
                        if (pVar.d()) {
                            pVar.f(15);
                            return;
                        }
                        return;
                    } finally {
                    }
                }
            case 10:
                u0.d dVar = (u0.d) this.b;
                m.s1 s1Var = dVar.c;
                u0.a aVar = dVar.a;
                if (dVar.A) {
                    if (dVar.x) {
                        dVar.x = false;
                        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        aVar.e = currentAnimationTimeMillis;
                        aVar.g = -1L;
                        aVar.f = currentAnimationTimeMillis;
                        aVar.h = 0.5f;
                    }
                    if ((aVar.g > 0 && AnimationUtils.currentAnimationTimeMillis() > aVar.g + aVar.i) || !dVar.e()) {
                        dVar.A = false;
                        return;
                    }
                    if (dVar.y) {
                        dVar.y = false;
                        long uptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                        s1Var.onTouchEvent(obtain);
                        obtain.recycle();
                    }
                    if (aVar.f == 0) {
                        throw new RuntimeException("Cannot compute scroll delta before calling start()");
                    }
                    long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float a2 = aVar.a(currentAnimationTimeMillis2);
                    long j10 = currentAnimationTimeMillis2 - aVar.f;
                    aVar.f = currentAnimationTimeMillis2;
                    dVar.C.scrollListBy((int) (j10 * ((a2 * 4.0f) + ((-4.0f) * a2 * a2)) * aVar.d));
                    WeakHashMap weakHashMap = r0.j0.a;
                    s1Var.postOnAnimation(this);
                    return;
                }
                return;
            case 11:
                if (((TaskCompletionSource) this.b).trySetException(new IOException("TIMEOUT"))) {
                    Log.w("Rpc", "No response");
                    return;
                }
                return;
            default:
                vf.e eVar = (vf.e) this.b;
                eVar.f.animate().setDuration(120L).alpha(0.0f);
                eVar.h.animate().setListener(null).start();
                if (eVar.h.getVisibility() != 0) {
                    eVar.h.setVisibility(0);
                    eVar.h.setAlpha(0.0f);
                }
                eVar.h.animate().setDuration(120L).alpha(1.0f).start();
                return;
        }
    }
}
