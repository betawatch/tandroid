package org.telegram.ui.Components;

import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
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
        zaVar.w = lb.access$1600(lbVar, true);
        zaVar.x = lb.access$1600(lbVar, false);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        boolean z10 = false;
        if (Math.abs(f10) <= 2000.0f) {
            return false;
        }
        za zaVar = this.b;
        if ((f10 < 0.0f && zaVar.w) || (f10 > 0.0f && zaVar.x)) {
            z10 = true;
        }
        float signum = Math.signum(f10);
        lb lbVar = this.a;
        r1.g gVar = new r1.g(lbVar, r1.g.o, signum * lbVar.getWidth() * 2.0f);
        if (!z10) {
            final int i7 = 0;
            gVar.a(new r1.c(this) { // from class: org.telegram.ui.Components.tb
                public final /* synthetic */ vb b;

                {
                    this.b = this;
                }

                @Override // r1.c
                public final void a(r1.g gVar2, boolean z11, float f12, float f13) {
                    switch (i7) {
                        case 0:
                            this.b.b.E.b();
                            break;
                        default:
                            this.b.b.E.b();
                            break;
                    }
                }
            });
            gVar.b(new j7(lbVar, 2));
        }
        gVar.m.a(1.0f);
        gVar.m.b(100.0f);
        gVar.a = f10;
        gVar.h();
        if (z10) {
            r1.g gVar2 = new r1.g((Object) lbVar, (r1.e) r1.g.v, 0.0f);
            final int i10 = 1;
            gVar2.a(new r1.c(this) { // from class: org.telegram.ui.Components.tb
                public final /* synthetic */ vb b;

                {
                    this.b = this;
                }

                @Override // r1.c
                public final void a(r1.g gVar22, boolean z11, float f12, float f13) {
                    switch (i10) {
                        case 0:
                            this.b.b.E.b();
                            break;
                        default:
                            this.b.b.E.b();
                            break;
                    }
                }
            });
            gVar2.b(new ub());
            gVar.m.a(1.0f);
            gVar.m.b(10.0f);
            gVar.a = f10;
            gVar2.h();
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
        if (Utilities.t(0.0f, 0.0f, f12, f13) > org.telegram.messenger.g0.e) {
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
        if (f15 == 0.0f || ((f15 < 0.0f && zaVar.w) || (f15 > 0.0f && zaVar.x))) {
            lbVar.setAlpha(1.0f - (Math.abs(f15) / lbVar.getWidth()));
        }
        return true;
    }
}
