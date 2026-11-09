package org.telegram.ui.Components;

import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class rb extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ gb a;
    public final /* synthetic */ ua b;

    public rb(ua uaVar, gb gbVar) {
        this.b = uaVar;
        this.a = gbVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        ua uaVar = this.b;
        if (uaVar.s) {
            return false;
        }
        gb gbVar = this.a;
        uaVar.w = gb.access$1400(gbVar, true);
        uaVar.x = gb.access$1400(gbVar, false);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        boolean z9 = false;
        if (Math.abs(f10) <= 2000.0f) {
            return false;
        }
        ua uaVar = this.b;
        if ((f10 < 0.0f && uaVar.w) || (f10 > 0.0f && uaVar.x)) {
            z9 = true;
        }
        float signum = Math.signum(f10);
        gb gbVar = this.a;
        r1.g gVar = new r1.g(gbVar, r1.g.o, signum * gbVar.getWidth() * 2.0f);
        if (!z9) {
            final int i7 = 0;
            gVar.a(new r1.c(this) { // from class: org.telegram.ui.Components.pb
                public final /* synthetic */ rb b;

                {
                    this.b = this;
                }

                @Override // r1.c
                public final void a(r1.g gVar2, boolean z10, float f12, float f13) {
                    switch (i7) {
                        case 0:
                            this.b.b.D.b();
                            break;
                        default:
                            this.b.b.D.b();
                            break;
                    }
                }
            });
            gVar.b(new e7(gbVar, 2));
        }
        gVar.m.a(1.0f);
        gVar.m.b(100.0f);
        gVar.a = f10;
        gVar.h();
        if (z9) {
            r1.g gVar2 = new r1.g((Object) gbVar, (r1.e) r1.g.v, 0.0f);
            final int i10 = 1;
            gVar2.a(new r1.c(this) { // from class: org.telegram.ui.Components.pb
                public final /* synthetic */ rb b;

                {
                    this.b = this;
                }

                @Override // r1.c
                public final void a(r1.g gVar22, boolean z10, float f12, float f13) {
                    switch (i10) {
                        case 0:
                            this.b.b.D.b();
                            break;
                        default:
                            this.b.b.D.b();
                            break;
                    }
                }
            });
            gVar2.b(new qb());
            gVar.m.a(1.0f);
            gVar.m.b(10.0f);
            gVar.a = f10;
            gVar2.h();
        }
        uaVar.s = true;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        ua uaVar = this.b;
        float f12 = uaVar.h + f10;
        uaVar.h = f12;
        float f13 = uaVar.n + f11;
        uaVar.n = f13;
        if (Utilities.t(0.0f, 0.0f, f12, f13) > org.telegram.messenger.g0.e) {
            uaVar.r = true;
        }
        if (!uaVar.d) {
            return false;
        }
        float f14 = uaVar.f - f10;
        uaVar.f = f14;
        gb gbVar = this.a;
        gbVar.setTranslationX(f14);
        float f15 = uaVar.f;
        if (f15 == 0.0f || ((f15 < 0.0f && uaVar.w) || (f15 > 0.0f && uaVar.x))) {
            gbVar.setAlpha(1.0f - (Math.abs(f15) / gbVar.getWidth()));
        }
        return true;
    }
}
