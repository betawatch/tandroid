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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class ul0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ul0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                wl0 wl0Var = (wl0) this.b;
                RecyclerView recyclerView = wl0Var.a;
                if (recyclerView == null) {
                    return;
                }
                if (wl0Var.g) {
                    recyclerView.scrollBy(0, -wl0Var.i);
                    AndroidUtilities.runOnUIThread(this);
                    return;
                } else {
                    if (wl0Var.h) {
                        recyclerView.scrollBy(0, wl0Var.i);
                        AndroidUtilities.runOnUIThread(this);
                        return;
                    }
                    return;
                }
            case 1:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) this.b;
                if (scrollSlidingTextTabStrip.E) {
                    float f10 = scrollSlidingTextTabStrip.P + ((SystemClock.elapsedRealtime() <= 17 ? r5 : 17L) / scrollSlidingTextTabStrip.V);
                    scrollSlidingTextTabStrip.P = f10;
                    scrollSlidingTextTabStrip.setAnimationIdicatorProgress(scrollSlidingTextTabStrip.K.getInterpolation(f10));
                    if (scrollSlidingTextTabStrip.P > 1.0f) {
                        scrollSlidingTextTabStrip.P = 1.0f;
                    }
                    if (scrollSlidingTextTabStrip.P < 1.0f) {
                        AndroidUtilities.runOnUIThread(scrollSlidingTextTabStrip.a0);
                        return;
                    }
                    scrollSlidingTextTabStrip.E = false;
                    scrollSlidingTextTabStrip.setEnabled(true);
                    um0 um0Var = scrollSlidingTextTabStrip.b;
                    if (um0Var != null) {
                        um0Var.w0(1.0f);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                ShutterButton shutterButton = (ShutterButton) this.b;
                ev0 ev0Var = shutterButton.e;
                if (ev0Var == null || ((ol) ev0Var).a()) {
                    return;
                }
                shutterButton.v = false;
                return;
            case 3:
                ax0 ax0Var = (ax0) this.b;
                View view = ax0Var.s;
                if (view == null) {
                    ax0Var.c.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).start();
                    return;
                }
                if (view.getVisibility() != 0) {
                    ax0Var.s.setVisibility(0);
                    ax0Var.s.setAlpha(0.0f);
                }
                ax0Var.s.animate().setListener(null).cancel();
                ax0Var.s.animate().alpha(1.0f).setDuration(150L).start();
                return;
            case 4:
                l81 l81Var = (l81) this.b;
                if (l81Var.G) {
                    float f11 = l81Var.c0 + ((SystemClock.elapsedRealtime() <= 17 ? r5 : 17L) / 200.0f);
                    l81Var.c0 = f11;
                    l81Var.setAnimationIdicatorProgress(l81Var.U.getInterpolation(f11));
                    if (l81Var.c0 > 1.0f) {
                        l81Var.c0 = 1.0f;
                    }
                    if (l81Var.c0 < 1.0f) {
                        AndroidUtilities.runOnUIThread(l81Var.f0);
                        return;
                    }
                    l81Var.G = false;
                    l81Var.setEnabled(true);
                    k81 k81Var = l81Var.y;
                    if (k81Var != null) {
                        ((oh.h4) k81Var).f0(1.0f);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                org.telegram.ui.w30 w30Var = (org.telegram.ui.w30) this.b;
                if (!w30Var.b || w30Var.N0.w0 != null) {
                    AndroidUtilities.runOnUIThread(w30Var.e0, 3000L);
                    return;
                } else {
                    w30Var.d0 = false;
                    w30Var.setUiVisible(false);
                    return;
                }
            case 6:
                p2.t tVar = (p2.t) this.b;
                p2.b bVar = tVar.d;
                bVar.k(0);
                p2.h hVar = p2.a0.i;
                bVar.j(24, hVar);
                tVar.c(hVar);
                return;
            case 7:
                eg.j jVar = ((qh.f9) this.b).G0;
                if (jVar instanceof eg.z3) {
                    ((eg.z3) jVar).getEditText();
                    return;
                }
                return;
            case 8:
                ((t5.h) this.b).g(false);
                return;
            case 9:
                u0.d dVar = (u0.d) this.b;
                m.r1 r1Var = dVar.c;
                u0.a aVar = dVar.a;
                if (dVar.B) {
                    if (dVar.x) {
                        dVar.x = false;
                        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        aVar.e = currentAnimationTimeMillis;
                        aVar.g = -1L;
                        aVar.f = currentAnimationTimeMillis;
                        aVar.h = 0.5f;
                    }
                    if ((aVar.g > 0 && AnimationUtils.currentAnimationTimeMillis() > aVar.g + aVar.i) || !dVar.e()) {
                        dVar.B = false;
                        return;
                    }
                    if (dVar.y) {
                        dVar.y = false;
                        long uptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                        r1Var.onTouchEvent(obtain);
                        obtain.recycle();
                    }
                    if (aVar.f == 0) {
                        throw new RuntimeException("Cannot compute scroll delta before calling start()");
                    }
                    long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float a2 = aVar.a(currentAnimationTimeMillis2);
                    long j10 = currentAnimationTimeMillis2 - aVar.f;
                    aVar.f = currentAnimationTimeMillis2;
                    dVar.D.scrollListBy((int) (j10 * ((a2 * 4.0f) + ((-4.0f) * a2 * a2)) * aVar.d));
                    WeakHashMap weakHashMap = r0.j0.a;
                    r1Var.postOnAnimation(this);
                    return;
                }
                return;
            case 10:
                u5.p pVar = (u5.p) this.b;
                synchronized (u5.p.i) {
                    try {
                        if (pVar.d()) {
                            pVar.f(15);
                            return;
                        }
                        return;
                    } finally {
                    }
                }
            case 11:
                if (((TaskCompletionSource) this.b).trySetException(new IOException("TIMEOUT"))) {
                    Log.w("Rpc", "No response");
                    return;
                }
                return;
            default:
                yf.e eVar = (yf.e) this.b;
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
