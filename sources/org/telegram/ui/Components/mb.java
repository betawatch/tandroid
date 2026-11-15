package org.telegram.ui.Components;

import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class mb extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ cb a;
    public final /* synthetic */ qa b;

    public mb(qa qaVar, cb cbVar) {
        this.b = qaVar;
        this.a = cbVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        qa qaVar = this.b;
        if (qaVar.s) {
            return false;
        }
        cb cbVar = this.a;
        qaVar.w = cb.access$1400(cbVar, true);
        qaVar.x = cb.access$1400(cbVar, false);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        boolean z10 = false;
        if (Math.abs(f10) <= 2000.0f) {
            return false;
        }
        qa qaVar = this.b;
        if ((f10 < 0.0f && qaVar.w) || (f10 > 0.0f && qaVar.x)) {
            z10 = true;
        }
        float signum = Math.signum(f10);
        cb cbVar = this.a;
        r1.g gVar = new r1.g(cbVar, r1.g.o, signum * cbVar.getWidth() * 2.0f);
        if (!z10) {
            final int i7 = 0;
            gVar.a(new r1.c(this) { // from class: org.telegram.ui.Components.kb
                public final /* synthetic */ mb b;

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
            gVar.b(new c7(cbVar, 2));
        }
        gVar.m.a(1.0f);
        gVar.m.b(100.0f);
        gVar.a = f10;
        gVar.h();
        if (z10) {
            r1.g gVar2 = new r1.g((Object) cbVar, (r1.e) r1.g.v, 0.0f);
            final int i10 = 1;
            gVar2.a(new r1.c(this) { // from class: org.telegram.ui.Components.kb
                public final /* synthetic */ mb b;

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
            gVar2.b(new lb());
            gVar.m.a(1.0f);
            gVar.m.b(10.0f);
            gVar.a = f10;
            gVar2.h();
        }
        qaVar.s = true;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        qa qaVar = this.b;
        float f12 = qaVar.h + f10;
        qaVar.h = f12;
        float f13 = qaVar.n + f11;
        qaVar.n = f13;
        if (Utilities.t(0.0f, 0.0f, f12, f13) > org.telegram.messenger.g0.e) {
            qaVar.r = true;
        }
        if (!qaVar.d) {
            return false;
        }
        float f14 = qaVar.f - f10;
        qaVar.f = f14;
        cb cbVar = this.a;
        cbVar.setTranslationX(f14);
        float f15 = qaVar.f;
        if (f15 == 0.0f || ((f15 < 0.0f && qaVar.w) || (f15 > 0.0f && qaVar.x))) {
            cbVar.setAlpha(1.0f - (Math.abs(f15) / cbVar.getWidth()));
        }
        return true;
    }
}
