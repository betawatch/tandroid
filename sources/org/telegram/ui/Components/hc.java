package org.telegram.ui.Components;

import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class hc extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ wb a;
    public final /* synthetic */ kb b;

    public hc(kb kbVar, wb wbVar) {
        this.b = kbVar;
        this.a = wbVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        kb kbVar = this.b;
        if (kbVar.s) {
            return false;
        }
        wb wbVar = this.a;
        kbVar.v = wb.access$1400(wbVar, true);
        kbVar.w = wb.access$1400(wbVar, false);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        boolean z10 = false;
        if (Math.abs(f7) <= 2000.0f) {
            return false;
        }
        kb kbVar = this.b;
        if ((f7 < 0.0f && kbVar.v) || (f7 > 0.0f && kbVar.w)) {
            z10 = true;
        }
        float signum = Math.signum(f7);
        wb wbVar = this.a;
        o1.k kVar = new o1.k(wbVar, o1.h.m, signum * wbVar.getWidth() * 2.0f);
        if (!z10) {
            final int i10 = 0;
            kVar.a(new o1.f(this) { // from class: org.telegram.ui.Components.fc
                public final /* synthetic */ hc b;

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
            kVar.b(new n7(wbVar, 2));
        }
        kVar.u.a(1.0f);
        kVar.u.b(100.0f);
        kVar.a = f7;
        kVar.h();
        if (z10) {
            o1.k kVar2 = new o1.k(wbVar, o1.h.t, 0.0f);
            final int i11 = 1;
            kVar2.a(new o1.f(this) { // from class: org.telegram.ui.Components.fc
                public final /* synthetic */ hc b;

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
            kVar2.b(new gc());
            kVar.u.a(1.0f);
            kVar.u.b(10.0f);
            kVar.a = f7;
            kVar2.h();
        }
        kbVar.s = true;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        kb kbVar = this.b;
        float f11 = kbVar.h + f7;
        kbVar.h = f11;
        float f12 = kbVar.n + f10;
        kbVar.n = f12;
        if (Utilities.dist(0.0f, 0.0f, f11, f12) > AndroidUtilities.touchSlop) {
            kbVar.r = true;
        }
        if (!kbVar.d) {
            return false;
        }
        float f13 = kbVar.f - f7;
        kbVar.f = f13;
        wb wbVar = this.a;
        wbVar.setTranslationX(f13);
        float f14 = kbVar.f;
        if (f14 == 0.0f || ((f14 < 0.0f && kbVar.v) || (f14 > 0.0f && kbVar.w))) {
            wbVar.setAlpha(1.0f - (Math.abs(f14) / wbVar.getWidth()));
        }
        return true;
    }
}
