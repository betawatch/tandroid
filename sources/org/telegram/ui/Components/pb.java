package org.telegram.ui.Components;

import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class pb extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ fb a;
    public final /* synthetic */ ta b;

    public pb(ta taVar, fb fbVar) {
        this.b = taVar;
        this.a = fbVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        ta taVar = this.b;
        if (taVar.s) {
            return false;
        }
        fb fbVar = this.a;
        taVar.w = fb.access$1400(fbVar, true);
        taVar.x = fb.access$1400(fbVar, false);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        boolean z10 = false;
        if (Math.abs(f10) <= 2000.0f) {
            return false;
        }
        ta taVar = this.b;
        if ((f10 < 0.0f && taVar.w) || (f10 > 0.0f && taVar.x)) {
            z10 = true;
        }
        float signum = Math.signum(f10);
        fb fbVar = this.a;
        q1.g gVar = new q1.g(fbVar, q1.g.o, signum * fbVar.getWidth() * 2.0f);
        if (!z10) {
            final int i3 = 0;
            gVar.a(new q1.c(this) { // from class: org.telegram.ui.Components.nb
                public final /* synthetic */ pb b;

                {
                    this.b = this;
                }

                @Override // q1.c
                public final void a(q1.g gVar2, boolean z11, float f12, float f13) {
                    switch (i3) {
                        case 0:
                            this.b.b.E.b();
                            break;
                        default:
                            this.b.b.E.b();
                            break;
                    }
                }
            });
            gVar.b(new c7(fbVar, 2));
        }
        gVar.m.a(1.0f);
        gVar.m.b(100.0f);
        gVar.a = f10;
        gVar.h();
        if (z10) {
            q1.g gVar2 = new q1.g((Object) fbVar, (q1.e) q1.g.v, 0.0f);
            final int i10 = 1;
            gVar2.a(new q1.c(this) { // from class: org.telegram.ui.Components.nb
                public final /* synthetic */ pb b;

                {
                    this.b = this;
                }

                @Override // q1.c
                public final void a(q1.g gVar22, boolean z11, float f12, float f13) {
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
            gVar2.b(new ob());
            gVar.m.a(1.0f);
            gVar.m.b(10.0f);
            gVar.a = f10;
            gVar2.h();
        }
        taVar.s = true;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        ta taVar = this.b;
        float f12 = taVar.h + f10;
        taVar.h = f12;
        float f13 = taVar.n + f11;
        taVar.n = f13;
        if (Utilities.t(0.0f, 0.0f, f12, f13) > org.telegram.messenger.g0.e) {
            taVar.r = true;
        }
        if (!taVar.d) {
            return false;
        }
        float f14 = taVar.f - f10;
        taVar.f = f14;
        fb fbVar = this.a;
        fbVar.setTranslationX(f14);
        float f15 = taVar.f;
        if (f15 == 0.0f || ((f15 < 0.0f && taVar.w) || (f15 > 0.0f && taVar.x))) {
            fbVar.setAlpha(1.0f - (Math.abs(f15) / fbVar.getWidth()));
        }
        return true;
    }
}
