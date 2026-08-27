package org.telegram.ui.Components;

import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class tb extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ jb a;
    public final /* synthetic */ xa b;

    public tb(xa xaVar, jb jbVar) {
        this.b = xaVar;
        this.a = jbVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        xa xaVar = this.b;
        if (xaVar.s) {
            return false;
        }
        jb jbVar = this.a;
        xaVar.v = jb.access$1400(jbVar, true);
        xaVar.w = jb.access$1400(jbVar, false);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        boolean z10 = false;
        if (Math.abs(f10) <= 2000.0f) {
            return false;
        }
        xa xaVar = this.b;
        if ((f10 < 0.0f && xaVar.v) || (f10 > 0.0f && xaVar.w)) {
            z10 = true;
        }
        float signum = Math.signum(f10);
        jb jbVar = this.a;
        o1.j jVar = new o1.j(jbVar, o1.h.m, signum * jbVar.getWidth() * 2.0f);
        if (!z10) {
            final int i10 = 0;
            jVar.a(new o1.f(this) { // from class: org.telegram.ui.Components.rb
                public final /* synthetic */ tb b;

                {
                    this.b = this;
                }

                @Override // o1.f
                public final void a(o1.h hVar, boolean z11, float f12, float f13) {
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
            jVar.b(new e7(jbVar, 2));
        }
        jVar.u.a(1.0f);
        jVar.u.b(100.0f);
        jVar.a = f10;
        jVar.f();
        if (z10) {
            o1.j jVar2 = new o1.j(jbVar, o1.h.t, 0.0f);
            final int i11 = 1;
            jVar2.a(new o1.f(this) { // from class: org.telegram.ui.Components.rb
                public final /* synthetic */ tb b;

                {
                    this.b = this;
                }

                @Override // o1.f
                public final void a(o1.h hVar, boolean z11, float f12, float f13) {
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
            jVar2.b(new sb());
            jVar.u.a(1.0f);
            jVar.u.b(10.0f);
            jVar.a = f10;
            jVar2.f();
        }
        xaVar.s = true;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        xa xaVar = this.b;
        float f12 = xaVar.h + f10;
        xaVar.h = f12;
        float f13 = xaVar.n + f11;
        xaVar.n = f13;
        if (Utilities.dist(0.0f, 0.0f, f12, f13) > AndroidUtilities.touchSlop) {
            xaVar.r = true;
        }
        if (!xaVar.d) {
            return false;
        }
        float f14 = xaVar.f - f10;
        xaVar.f = f14;
        jb jbVar = this.a;
        jbVar.setTranslationX(f14);
        float f15 = xaVar.f;
        if (f15 == 0.0f || ((f15 < 0.0f && xaVar.v) || (f15 > 0.0f && xaVar.w))) {
            jbVar.setAlpha(1.0f - (Math.abs(f15) / jbVar.getWidth()));
        }
        return true;
    }
}
