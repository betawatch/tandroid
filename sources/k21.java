// default package

import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class k21 extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ z11 a;
    public final /* synthetic */ l11 b;

    public k21(l11 l11Var, z11 z11Var) {
        this.b = l11Var;
        this.a = z11Var;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        l11 l11Var = this.b;
        if (l11Var.s) {
            return false;
        }
        vk4 vk4Var = z11.IN_OUT_OFFSET_Y;
        z11 z11Var = this.a;
        l11Var.w = z11Var.c(true);
        l11Var.x = z11Var.c(false);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        final byte b = 0;
        if (Math.abs(f) <= 2000.0f) {
            return false;
        }
        final byte b2 = 1;
        l11 l11Var = this.b;
        boolean z = (f < 0.0f && l11Var.w) || (f > 0.0f && l11Var.x);
        float signum = Math.signum(f);
        z11 z11Var = this.a;
        vpa vpaVar = new vpa(z11Var, vpa.o, signum * z11Var.getWidth() * 2.0f);
        if (!z) {
            vpaVar.a(new ps3(this) { // from class: i21
                public final /* synthetic */ k21 b;

                {
                    this.b = this;
                }

                @Override // ps3
                public final void a(vpa vpaVar2, boolean z2, float f3, float f4) {
                    byte b3 = b;
                    k21 k21Var = this.b;
                    switch (b3) {
                        case 0:
                            k21Var.b.E.b();
                            break;
                        default:
                            k21Var.b.E.b();
                            break;
                    }
                }
            });
            vpaVar.b(new i10(z11Var, (byte) 2));
        }
        vpaVar.m.a(1.0f);
        vpaVar.m.b(100.0f);
        vpaVar.a = f;
        vpaVar.h();
        if (z) {
            vpa vpaVar2 = new vpa((Object) z11Var, (vk4) vpa.v, 0.0f);
            vpaVar2.a(new ps3(this) { // from class: i21
                public final /* synthetic */ k21 b;

                {
                    this.b = this;
                }

                @Override // ps3
                public final void a(vpa vpaVar22, boolean z2, float f3, float f4) {
                    byte b3 = b2;
                    k21 k21Var = this.b;
                    switch (b3) {
                        case 0:
                            k21Var.b.E.b();
                            break;
                        default:
                            k21Var.b.E.b();
                            break;
                    }
                }
            });
            vpaVar2.b(new j21());
            vpaVar.m.a(1.0f);
            vpaVar.m.b(10.0f);
            vpaVar.a = f;
            vpaVar2.h();
        }
        l11Var.s = true;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        l11 l11Var = this.b;
        float f3 = l11Var.h + f;
        l11Var.h = f3;
        float f4 = l11Var.n + f2;
        l11Var.n = f4;
        if (Utilities.t(0.0f, 0.0f, f3, f4) > hl.e) {
            l11Var.r = true;
        }
        if (!l11Var.d) {
            return false;
        }
        float f5 = l11Var.f - f;
        l11Var.f = f5;
        z11 z11Var = this.a;
        z11Var.setTranslationX(f5);
        float f6 = l11Var.f;
        if (f6 != 0.0f && ((f6 >= 0.0f || !l11Var.w) && (f6 <= 0.0f || !l11Var.x))) {
            return true;
        }
        z11Var.setAlpha(1.0f - (Math.abs(f6) / z11Var.getWidth()));
        return true;
    }
}
