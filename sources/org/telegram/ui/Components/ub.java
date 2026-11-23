package org.telegram.ui.Components;

import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class ub extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ kb a;
    public final /* synthetic */ ya b;

    public ub(ya yaVar, kb kbVar) {
        this.b = yaVar;
        this.a = kbVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        ya yaVar = this.b;
        if (yaVar.s) {
            return false;
        }
        kb kbVar = this.a;
        yaVar.w = kb.access$1600(kbVar, true);
        yaVar.x = kb.access$1600(kbVar, false);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        boolean z10 = false;
        if (Math.abs(f10) <= 2000.0f) {
            return false;
        }
        ya yaVar = this.b;
        if ((f10 < 0.0f && yaVar.w) || (f10 > 0.0f && yaVar.x)) {
            z10 = true;
        }
        float signum = Math.signum(f10);
        kb kbVar = this.a;
        r1.g gVar = new r1.g(kbVar, r1.g.o, signum * kbVar.getWidth() * 2.0f);
        if (!z10) {
            final int i7 = 0;
            gVar.a(new r1.c(this) { // from class: org.telegram.ui.Components.sb
                public final /* synthetic */ ub b;

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
            gVar.b(new i7(kbVar, 2));
        }
        gVar.m.a(1.0f);
        gVar.m.b(100.0f);
        gVar.a = f10;
        gVar.h();
        if (z10) {
            r1.g gVar2 = new r1.g((Object) kbVar, (r1.e) r1.g.v, 0.0f);
            final int i10 = 1;
            gVar2.a(new r1.c(this) { // from class: org.telegram.ui.Components.sb
                public final /* synthetic */ ub b;

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
            gVar2.b(new tb());
            gVar.m.a(1.0f);
            gVar.m.b(10.0f);
            gVar.a = f10;
            gVar2.h();
        }
        yaVar.s = true;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        ya yaVar = this.b;
        float f12 = yaVar.h + f10;
        yaVar.h = f12;
        float f13 = yaVar.n + f11;
        yaVar.n = f13;
        if (Utilities.t(0.0f, 0.0f, f12, f13) > org.telegram.messenger.g0.e) {
            yaVar.r = true;
        }
        if (!yaVar.d) {
            return false;
        }
        float f14 = yaVar.f - f10;
        yaVar.f = f14;
        kb kbVar = this.a;
        kbVar.setTranslationX(f14);
        float f15 = yaVar.f;
        if (f15 == 0.0f || ((f15 < 0.0f && yaVar.w) || (f15 > 0.0f && yaVar.x))) {
            kbVar.setAlpha(1.0f - (Math.abs(f15) / kbVar.getWidth()));
        }
        return true;
    }
}
