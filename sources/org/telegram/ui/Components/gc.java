package org.telegram.ui.Components;

import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class gc extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ vb a;
    public final /* synthetic */ jb b;

    public gc(jb jbVar, vb vbVar) {
        this.b = jbVar;
        this.a = vbVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        jb jbVar = this.b;
        if (jbVar.s) {
            return false;
        }
        vb vbVar = this.a;
        jbVar.v = vb.access$1400(vbVar, true);
        jbVar.w = vb.access$1400(vbVar, false);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        boolean z10 = false;
        if (Math.abs(f7) <= 2000.0f) {
            return false;
        }
        jb jbVar = this.b;
        if ((f7 < 0.0f && jbVar.v) || (f7 > 0.0f && jbVar.w)) {
            z10 = true;
        }
        float signum = Math.signum(f7);
        vb vbVar = this.a;
        o1.k kVar = new o1.k(vbVar, o1.h.m, signum * vbVar.getWidth() * 2.0f);
        if (!z10) {
            final int i10 = 0;
            kVar.a(new o1.f(this) { // from class: org.telegram.ui.Components.ec
                public final /* synthetic */ gc b;

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
            kVar.b(new k7(vbVar, 2));
        }
        kVar.u.a(1.0f);
        kVar.u.b(100.0f);
        kVar.a = f7;
        kVar.f();
        if (z10) {
            o1.k kVar2 = new o1.k(vbVar, o1.h.t, 0.0f);
            final int i11 = 1;
            kVar2.a(new o1.f(this) { // from class: org.telegram.ui.Components.ec
                public final /* synthetic */ gc b;

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
            kVar2.b(new fc());
            kVar.u.a(1.0f);
            kVar.u.b(10.0f);
            kVar.a = f7;
            kVar2.f();
        }
        jbVar.s = true;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        jb jbVar = this.b;
        float f11 = jbVar.h + f7;
        jbVar.h = f11;
        float f12 = jbVar.n + f10;
        jbVar.n = f12;
        if (Utilities.dist(0.0f, 0.0f, f11, f12) > AndroidUtilities.touchSlop) {
            jbVar.r = true;
        }
        if (!jbVar.d) {
            return false;
        }
        float f13 = jbVar.f - f7;
        jbVar.f = f13;
        vb vbVar = this.a;
        vbVar.setTranslationX(f13);
        float f14 = jbVar.f;
        if (f14 == 0.0f || ((f14 < 0.0f && jbVar.v) || (f14 > 0.0f && jbVar.w))) {
            vbVar.setAlpha(1.0f - (Math.abs(f14) / vbVar.getWidth()));
        }
        return true;
    }
}
