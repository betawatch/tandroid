package org.telegram.ui.Components;

import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class fc extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ ub a;
    public final /* synthetic */ ib b;

    public fc(ib ibVar, ub ubVar) {
        this.b = ibVar;
        this.a = ubVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        ib ibVar = this.b;
        if (ibVar.s) {
            return false;
        }
        ub ubVar = this.a;
        ibVar.v = ub.access$1400(ubVar, true);
        ibVar.w = ub.access$1400(ubVar, false);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        boolean z10 = false;
        if (Math.abs(f7) <= 2000.0f) {
            return false;
        }
        ib ibVar = this.b;
        if ((f7 < 0.0f && ibVar.v) || (f7 > 0.0f && ibVar.w)) {
            z10 = true;
        }
        float signum = Math.signum(f7);
        ub ubVar = this.a;
        o1.k kVar = new o1.k(ubVar, o1.h.m, signum * ubVar.getWidth() * 2.0f);
        if (!z10) {
            final int i10 = 0;
            kVar.a(new o1.f(this) { // from class: org.telegram.ui.Components.dc
                public final /* synthetic */ fc b;

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
            kVar.b(new l7(ubVar, 2));
        }
        kVar.u.a(1.0f);
        kVar.u.b(100.0f);
        kVar.a = f7;
        kVar.f();
        if (z10) {
            o1.k kVar2 = new o1.k(ubVar, o1.h.t, 0.0f);
            final int i11 = 1;
            kVar2.a(new o1.f(this) { // from class: org.telegram.ui.Components.dc
                public final /* synthetic */ fc b;

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
            kVar2.b(new ec());
            kVar.u.a(1.0f);
            kVar.u.b(10.0f);
            kVar.a = f7;
            kVar2.f();
        }
        ibVar.s = true;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        ib ibVar = this.b;
        float f11 = ibVar.h + f7;
        ibVar.h = f11;
        float f12 = ibVar.n + f10;
        ibVar.n = f12;
        if (Utilities.dist(0.0f, 0.0f, f11, f12) > AndroidUtilities.touchSlop) {
            ibVar.r = true;
        }
        if (!ibVar.d) {
            return false;
        }
        float f13 = ibVar.f - f7;
        ibVar.f = f13;
        ub ubVar = this.a;
        ubVar.setTranslationX(f13);
        float f14 = ibVar.f;
        if (f14 == 0.0f || ((f14 < 0.0f && ibVar.v) || (f14 > 0.0f && ibVar.w))) {
            ubVar.setAlpha(1.0f - (Math.abs(f14) / ubVar.getWidth()));
        }
        return true;
    }
}
