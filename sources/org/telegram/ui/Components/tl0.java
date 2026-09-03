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

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class tl0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ tl0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                vl0 vl0Var = (vl0) this.b;
                RecyclerView recyclerView = vl0Var.a;
                if (recyclerView == null) {
                    return;
                }
                if (vl0Var.g) {
                    recyclerView.scrollBy(0, -vl0Var.i);
                    AndroidUtilities.runOnUIThread(this);
                    return;
                } else {
                    if (vl0Var.h) {
                        recyclerView.scrollBy(0, vl0Var.i);
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
                    tm0 tm0Var = scrollSlidingTextTabStrip.b;
                    if (tm0Var != null) {
                        tm0Var.w0(1.0f);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                ShutterButton shutterButton = (ShutterButton) this.b;
                dv0 dv0Var = shutterButton.e;
                if (dv0Var == null || ((ol) dv0Var).a()) {
                    return;
                }
                shutterButton.v = false;
                return;
            case 3:
                zw0 zw0Var = (zw0) this.b;
                View view = zw0Var.s;
                if (view == null) {
                    zw0Var.c.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).start();
                    return;
                }
                if (view.getVisibility() != 0) {
                    zw0Var.s.setVisibility(0);
                    zw0Var.s.setAlpha(0.0f);
                }
                zw0Var.s.animate().setListener(null).cancel();
                zw0Var.s.animate().alpha(1.0f).setDuration(150L).start();
                return;
            case 4:
                k81 k81Var = (k81) this.b;
                if (k81Var.G) {
                    float f11 = k81Var.c0 + ((SystemClock.elapsedRealtime() <= 17 ? r5 : 17L) / 200.0f);
                    k81Var.c0 = f11;
                    k81Var.setAnimationIdicatorProgress(k81Var.U.getInterpolation(f11));
                    if (k81Var.c0 > 1.0f) {
                        k81Var.c0 = 1.0f;
                    }
                    if (k81Var.c0 < 1.0f) {
                        AndroidUtilities.runOnUIThread(k81Var.f0);
                        return;
                    }
                    k81Var.G = false;
                    k81Var.setEnabled(true);
                    j81 j81Var = k81Var.y;
                    if (j81Var != null) {
                        ((oh.h4) j81Var).f0(1.0f);
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
                eg.j jVar = ((qh.e9) this.b).G0;
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
