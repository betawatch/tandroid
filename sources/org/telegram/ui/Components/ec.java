package org.telegram.ui.Components;

import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class ec extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ tb a;
    public final /* synthetic */ hb b;

    public ec(hb hbVar, tb tbVar) {
        this.b = hbVar;
        this.a = tbVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        hb hbVar = this.b;
        if (hbVar.s) {
            return false;
        }
        tb tbVar = this.a;
        hbVar.v = tb.access$1400(tbVar, true);
        hbVar.w = tb.access$1400(tbVar, false);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        boolean z10 = false;
        if (Math.abs(f7) <= 2000.0f) {
            return false;
        }
        hb hbVar = this.b;
        if ((f7 < 0.0f && hbVar.v) || (f7 > 0.0f && hbVar.w)) {
            z10 = true;
        }
        float signum = Math.signum(f7);
        tb tbVar = this.a;
        o1.k kVar = new o1.k(tbVar, o1.h.m, signum * tbVar.getWidth() * 2.0f);
        if (!z10) {
            final int i10 = 0;
            kVar.a(new o1.f(this) { // from class: org.telegram.ui.Components.cc
                public final /* synthetic */ ec b;

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
            kVar.b(new k7(tbVar, 2));
        }
        kVar.u.a(1.0f);
        kVar.u.b(100.0f);
        kVar.a = f7;
        kVar.f();
        if (z10) {
            o1.k kVar2 = new o1.k(tbVar, o1.h.t, 0.0f);
            final int i11 = 1;
            kVar2.a(new o1.f(this) { // from class: org.telegram.ui.Components.cc
                public final /* synthetic */ ec b;

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
            kVar2.b(new dc());
            kVar.u.a(1.0f);
            kVar.u.b(10.0f);
            kVar.a = f7;
            kVar2.f();
        }
        hbVar.s = true;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        hb hbVar = this.b;
        float f11 = hbVar.h + f7;
        hbVar.h = f11;
        float f12 = hbVar.n + f10;
        hbVar.n = f12;
        if (Utilities.dist(0.0f, 0.0f, f11, f12) > AndroidUtilities.touchSlop) {
            hbVar.r = true;
        }
        if (!hbVar.d) {
            return false;
        }
        float f13 = hbVar.f - f7;
        hbVar.f = f13;
        tb tbVar = this.a;
        tbVar.setTranslationX(f13);
        float f14 = hbVar.f;
        if (f14 == 0.0f || ((f14 < 0.0f && hbVar.v) || (f14 > 0.0f && hbVar.w))) {
            tbVar.setAlpha(1.0f - (Math.abs(f14) / tbVar.getWidth()));
        }
        return true;
    }
}
