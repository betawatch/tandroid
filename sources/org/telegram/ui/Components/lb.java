package org.telegram.ui.Components;

import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class lb extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ bb a;
    public final /* synthetic */ oa b;

    public lb(oa oaVar, bb bbVar) {
        this.b = oaVar;
        this.a = bbVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        oa oaVar = this.b;
        if (oaVar.s) {
            return false;
        }
        bb bbVar = this.a;
        oaVar.w = bb.access$1400(bbVar, true);
        oaVar.x = bb.access$1400(bbVar, false);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        boolean z10 = false;
        if (Math.abs(f7) <= 2000.0f) {
            return false;
        }
        oa oaVar = this.b;
        if ((f7 < 0.0f && oaVar.w) || (f7 > 0.0f && oaVar.x)) {
            z10 = true;
        }
        float signum = Math.signum(f7);
        bb bbVar = this.a;
        o1.j jVar = new o1.j(bbVar, o1.j.o, signum * bbVar.getWidth() * 2.0f);
        if (!z10) {
            final int i10 = 0;
            jVar.a(new o1.f(this) { // from class: org.telegram.ui.Components.jb
                public final /* synthetic */ lb b;

                {
                    this.b = this;
                }

                @Override // o1.f
                public final void a(o1.j jVar2, boolean z11, float f11, float f12) {
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
            jVar.b(new a7(bbVar, 2));
        }
        jVar.m.a(1.0f);
        jVar.m.b(100.0f);
        jVar.a = f7;
        jVar.h();
        if (z10) {
            o1.j jVar2 = new o1.j((Object) bbVar, (o1.h) o1.j.v, 0.0f);
            final int i11 = 1;
            jVar2.a(new o1.f(this) { // from class: org.telegram.ui.Components.jb
                public final /* synthetic */ lb b;

                {
                    this.b = this;
                }

                @Override // o1.f
                public final void a(o1.j jVar22, boolean z11, float f11, float f12) {
                    switch (i11) {
                        case 0:
                            this.b.b.D.b();
                            break;
                        default:
                            this.b.b.D.b();
                            break;
                    }
                }
            });
            jVar2.b(new kb());
            jVar.m.a(1.0f);
            jVar.m.b(10.0f);
            jVar.a = f7;
            jVar2.h();
        }
        oaVar.s = true;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        oa oaVar = this.b;
        float f11 = oaVar.h + f7;
        oaVar.h = f11;
        float f12 = oaVar.n + f10;
        oaVar.n = f12;
        if (Utilities.t(0.0f, 0.0f, f11, f12) > org.telegram.messenger.i0.e) {
            oaVar.r = true;
        }
        if (!oaVar.d) {
            return false;
        }
        float f13 = oaVar.f - f7;
        oaVar.f = f13;
        bb bbVar = this.a;
        bbVar.setTranslationX(f13);
        float f14 = oaVar.f;
        if (f14 == 0.0f || ((f14 < 0.0f && oaVar.w) || (f14 > 0.0f && oaVar.x))) {
            bbVar.setAlpha(1.0f - (Math.abs(f14) / bbVar.getWidth()));
        }
        return true;
    }
}
