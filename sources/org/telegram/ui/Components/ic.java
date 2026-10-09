package org.telegram.ui.Components;

import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class ic extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ xb a;
    public final /* synthetic */ lb b;

    public ic(lb lbVar, xb xbVar) {
        this.b = lbVar;
        this.a = xbVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        lb lbVar = this.b;
        if (lbVar.s) {
            return false;
        }
        xb xbVar = this.a;
        lbVar.v = xb.access$1400(xbVar, true);
        lbVar.w = xb.access$1400(xbVar, false);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        boolean z10 = false;
        if (Math.abs(f7) <= 2000.0f) {
            return false;
        }
        lb lbVar = this.b;
        if ((f7 < 0.0f && lbVar.v) || (f7 > 0.0f && lbVar.w)) {
            z10 = true;
        }
        float signum = Math.signum(f7);
        xb xbVar = this.a;
        o1.k kVar = new o1.k(xbVar, o1.h.m, signum * xbVar.getWidth() * 2.0f);
        if (!z10) {
            final int i10 = 0;
            kVar.a(new o1.f(this) { // from class: org.telegram.ui.Components.gc
                public final /* synthetic */ ic b;

                {
                    this.b = this;
                }

                @Override // o1.f
                public final void a(o1.h hVar, boolean z11, float f11, float f12) {
                    switch (i10) {
                        case 0:
                            this.b.b.y.b();
                            break;
                        default:
                            this.b.b.y.b();
                            break;
                    }
                }
            });
            kVar.b(new m7(xbVar, 2));
        }
        kVar.u.a(1.0f);
        kVar.u.b(100.0f);
        kVar.a = f7;
        kVar.h();
        if (z10) {
            o1.k kVar2 = new o1.k(xbVar, o1.h.t, 0.0f);
            final int i11 = 1;
            kVar2.a(new o1.f(this) { // from class: org.telegram.ui.Components.gc
                public final /* synthetic */ ic b;

                {
                    this.b = this;
                }

                @Override // o1.f
                public final void a(o1.h hVar, boolean z11, float f11, float f12) {
                    switch (i11) {
                        case 0:
                            this.b.b.y.b();
                            break;
                        default:
                            this.b.b.y.b();
                            break;
                    }
                }
            });
            kVar2.b(new hc());
            kVar.u.a(1.0f);
            kVar.u.b(10.0f);
            kVar.a = f7;
            kVar2.h();
        }
        lbVar.s = true;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        lb lbVar = this.b;
        float f11 = lbVar.h + f7;
        lbVar.h = f11;
        float f12 = lbVar.n + f10;
        lbVar.n = f12;
        if (Utilities.dist(0.0f, 0.0f, f11, f12) > AndroidUtilities.touchSlop) {
            lbVar.r = true;
        }
        if (!lbVar.d) {
            return false;
        }
        float f13 = lbVar.f - f7;
        lbVar.f = f13;
        xb xbVar = this.a;
        xbVar.setTranslationX(f13);
        float f14 = lbVar.f;
        if (f14 == 0.0f || ((f14 < 0.0f && lbVar.v) || (f14 > 0.0f && lbVar.w))) {
            xbVar.setAlpha(1.0f - (Math.abs(f14) / xbVar.getWidth()));
        }
        return true;
    }
}
