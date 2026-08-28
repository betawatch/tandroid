package org.telegram.ui.Components;

import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class vb extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ lb a;
    public final /* synthetic */ za b;

    public vb(za zaVar, lb lbVar) {
        this.b = zaVar;
        this.a = lbVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        za zaVar = this.b;
        if (zaVar.s) {
            return false;
        }
        lb lbVar = this.a;
        zaVar.v = lb.access$1400(lbVar, true);
        zaVar.w = lb.access$1400(lbVar, false);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        boolean z10 = false;
        if (Math.abs(f10) <= 2000.0f) {
            return false;
        }
        za zaVar = this.b;
        if ((f10 < 0.0f && zaVar.v) || (f10 > 0.0f && zaVar.w)) {
            z10 = true;
        }
        float signum = Math.signum(f10);
        lb lbVar = this.a;
        o1.j jVar = new o1.j(lbVar, o1.h.m, signum * lbVar.getWidth() * 2.0f);
        if (!z10) {
            final int i9 = 0;
            jVar.a(new o1.f(this) { // from class: org.telegram.ui.Components.tb
                public final /* synthetic */ vb b;

                {
                    this.b = this;
                }

                @Override // o1.f
                public final void a(o1.h hVar, boolean z11, float f12, float f13) {
                    switch (i9) {
                        case 0:
                            this.b.b.y.b();
                            break;
                        default:
                            this.b.b.y.b();
                            break;
                    }
                }
            });
            jVar.b(new e7(lbVar, 2));
        }
        jVar.u.a(1.0f);
        jVar.u.b(100.0f);
        jVar.a = f10;
        jVar.f();
        if (z10) {
            o1.j jVar2 = new o1.j(lbVar, o1.h.t, 0.0f);
            final int i10 = 1;
            jVar2.a(new o1.f(this) { // from class: org.telegram.ui.Components.tb
                public final /* synthetic */ vb b;

                {
                    this.b = this;
                }

                @Override // o1.f
                public final void a(o1.h hVar, boolean z11, float f12, float f13) {
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
            jVar2.b(new ub());
            jVar.u.a(1.0f);
            jVar.u.b(10.0f);
            jVar.a = f10;
            jVar2.f();
        }
        zaVar.s = true;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        za zaVar = this.b;
        float f12 = zaVar.h + f10;
        zaVar.h = f12;
        float f13 = zaVar.n + f11;
        zaVar.n = f13;
        if (Utilities.dist(0.0f, 0.0f, f12, f13) > AndroidUtilities.touchSlop) {
            zaVar.r = true;
        }
        if (!zaVar.d) {
            return false;
        }
        float f14 = zaVar.f - f10;
        zaVar.f = f14;
        lb lbVar = this.a;
        lbVar.setTranslationX(f14);
        float f15 = zaVar.f;
        if (f15 == 0.0f || ((f15 < 0.0f && zaVar.v) || (f15 > 0.0f && zaVar.w))) {
            lbVar.setAlpha(1.0f - (Math.abs(f15) / lbVar.getWidth()));
        }
        return true;
    }
}
