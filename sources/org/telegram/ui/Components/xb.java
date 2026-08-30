package org.telegram.ui.Components;

import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class xb extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ nb a;
    public final /* synthetic */ za b;

    public xb(za zaVar, nb nbVar) {
        this.b = zaVar;
        this.a = nbVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        za zaVar = this.b;
        if (zaVar.s) {
            return false;
        }
        nb nbVar = this.a;
        zaVar.v = nb.access$1400(nbVar, true);
        zaVar.w = nb.access$1400(nbVar, false);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        boolean z4 = false;
        if (Math.abs(f10) <= 2000.0f) {
            return false;
        }
        za zaVar = this.b;
        if ((f10 < 0.0f && zaVar.v) || (f10 > 0.0f && zaVar.w)) {
            z4 = true;
        }
        float signum = Math.signum(f10);
        nb nbVar = this.a;
        o1.j jVar = new o1.j(nbVar, o1.h.m, signum * nbVar.getWidth() * 2.0f);
        if (!z4) {
            final int i10 = 0;
            jVar.a(new o1.f(this) { // from class: org.telegram.ui.Components.vb
                public final /* synthetic */ xb b;

                {
                    this.b = this;
                }

                @Override // o1.f
                public final void a(o1.h hVar, boolean z10, float f12, float f13) {
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
            jVar.b(new f7(nbVar, 2));
        }
        jVar.u.a(1.0f);
        jVar.u.b(100.0f);
        jVar.a = f10;
        jVar.f();
        if (z4) {
            o1.j jVar2 = new o1.j(nbVar, o1.h.t, 0.0f);
            final int i11 = 1;
            jVar2.a(new o1.f(this) { // from class: org.telegram.ui.Components.vb
                public final /* synthetic */ xb b;

                {
                    this.b = this;
                }

                @Override // o1.f
                public final void a(o1.h hVar, boolean z10, float f12, float f13) {
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
            jVar2.b(new wb());
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
        nb nbVar = this.a;
        nbVar.setTranslationX(f14);
        float f15 = zaVar.f;
        if (f15 == 0.0f || ((f15 < 0.0f && zaVar.v) || (f15 > 0.0f && zaVar.w))) {
            nbVar.setAlpha(1.0f - (Math.abs(f15) / nbVar.getWidth()));
        }
        return true;
    }
}
