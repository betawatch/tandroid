package org.telegram.ui.Components;

import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class dc extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ sb a;
    public final /* synthetic */ gb b;

    public dc(gb gbVar, sb sbVar) {
        this.b = gbVar;
        this.a = sbVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        gb gbVar = this.b;
        if (gbVar.s) {
            return false;
        }
        sb sbVar = this.a;
        gbVar.v = sb.access$1400(sbVar, true);
        gbVar.w = sb.access$1400(sbVar, false);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        boolean z10 = false;
        if (Math.abs(f7) <= 2000.0f) {
            return false;
        }
        gb gbVar = this.b;
        if ((f7 < 0.0f && gbVar.v) || (f7 > 0.0f && gbVar.w)) {
            z10 = true;
        }
        float signum = Math.signum(f7);
        sb sbVar = this.a;
        o1.k kVar = new o1.k(sbVar, o1.h.m, signum * sbVar.getWidth() * 2.0f);
        if (!z10) {
            final int i10 = 0;
            kVar.a(new o1.f(this) { // from class: org.telegram.ui.Components.bc
                public final /* synthetic */ dc b;

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
            kVar.b(new i7(sbVar, 2));
        }
        kVar.u.a(1.0f);
        kVar.u.b(100.0f);
        kVar.a = f7;
        kVar.f();
        if (z10) {
            o1.k kVar2 = new o1.k(sbVar, o1.h.t, 0.0f);
            final int i11 = 1;
            kVar2.a(new o1.f(this) { // from class: org.telegram.ui.Components.bc
                public final /* synthetic */ dc b;

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
            kVar2.b(new cc());
            kVar.u.a(1.0f);
            kVar.u.b(10.0f);
            kVar.a = f7;
            kVar2.f();
        }
        gbVar.s = true;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        gb gbVar = this.b;
        float f11 = gbVar.h + f7;
        gbVar.h = f11;
        float f12 = gbVar.n + f10;
        gbVar.n = f12;
        if (Utilities.dist(0.0f, 0.0f, f11, f12) > AndroidUtilities.touchSlop) {
            gbVar.r = true;
        }
        if (!gbVar.d) {
            return false;
        }
        float f13 = gbVar.f - f7;
        gbVar.f = f13;
        sb sbVar = this.a;
        sbVar.setTranslationX(f13);
        float f14 = gbVar.f;
        if (f14 == 0.0f || ((f14 < 0.0f && gbVar.v) || (f14 > 0.0f && gbVar.w))) {
            sbVar.setAlpha(1.0f - (Math.abs(f14) / sbVar.getWidth()));
        }
        return true;
    }
}
