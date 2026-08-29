package org.telegram.ui.Components;

import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class bc extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ rb a;
    public final /* synthetic */ eb b;

    public bc(eb ebVar, rb rbVar) {
        this.b = ebVar;
        this.a = rbVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        eb ebVar = this.b;
        if (ebVar.s) {
            return false;
        }
        rb rbVar = this.a;
        ebVar.v = rb.access$1400(rbVar, true);
        ebVar.w = rb.access$1400(rbVar, false);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f9, float f10) {
        boolean z10 = false;
        if (Math.abs(f9) <= 2000.0f) {
            return false;
        }
        eb ebVar = this.b;
        if ((f9 < 0.0f && ebVar.v) || (f9 > 0.0f && ebVar.w)) {
            z10 = true;
        }
        float signum = Math.signum(f9);
        rb rbVar = this.a;
        o1.k kVar = new o1.k(rbVar, o1.i.m, signum * rbVar.getWidth() * 2.0f);
        if (!z10) {
            final int i10 = 0;
            kVar.a(new o1.g(this) { // from class: org.telegram.ui.Components.zb
                public final /* synthetic */ bc b;

                {
                    this.b = this;
                }

                @Override // o1.g
                public final void a(o1.i iVar, boolean z11, float f11, float f12) {
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
            kVar.b(new j7(rbVar, 2));
        }
        kVar.u.a(1.0f);
        kVar.u.b(100.0f);
        kVar.a = f9;
        kVar.f();
        if (z10) {
            o1.k kVar2 = new o1.k(rbVar, o1.i.t, 0.0f);
            final int i11 = 1;
            kVar2.a(new o1.g(this) { // from class: org.telegram.ui.Components.zb
                public final /* synthetic */ bc b;

                {
                    this.b = this;
                }

                @Override // o1.g
                public final void a(o1.i iVar, boolean z11, float f11, float f12) {
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
            kVar2.b(new ac());
            kVar.u.a(1.0f);
            kVar.u.b(10.0f);
            kVar.a = f9;
            kVar2.f();
        }
        ebVar.s = true;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f9, float f10) {
        eb ebVar = this.b;
        float f11 = ebVar.h + f9;
        ebVar.h = f11;
        float f12 = ebVar.n + f10;
        ebVar.n = f12;
        if (Utilities.dist(0.0f, 0.0f, f11, f12) > AndroidUtilities.touchSlop) {
            ebVar.r = true;
        }
        if (!ebVar.d) {
            return false;
        }
        float f13 = ebVar.f - f9;
        ebVar.f = f13;
        rb rbVar = this.a;
        rbVar.setTranslationX(f13);
        float f14 = ebVar.f;
        if (f14 == 0.0f || ((f14 < 0.0f && ebVar.v) || (f14 > 0.0f && ebVar.w))) {
            rbVar.setAlpha(1.0f - (Math.abs(f14) / rbVar.getWidth()));
        }
        return true;
    }
}
