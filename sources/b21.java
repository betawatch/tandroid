// default package

import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class b21 extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ q11 a;
    public final /* synthetic */ c11 b;

    public b21(c11 c11Var, q11 q11Var) {
        this.b = c11Var;
        this.a = q11Var;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        c11 c11Var = this.b;
        if (c11Var.s) {
            return false;
        }
        q11 q11Var = this.a;
        c11Var.w = q11.access$1600(q11Var, true);
        c11Var.x = q11.access$1600(q11Var, false);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        final byte b = 0;
        if (Math.abs(f) <= 2000.0f) {
            return false;
        }
        final byte b2 = 1;
        c11 c11Var = this.b;
        boolean z = (f < 0.0f && c11Var.w) || (f > 0.0f && c11Var.x);
        float signum = Math.signum(f);
        q11 q11Var = this.a;
        yla ylaVar = new yla(q11Var, yla.o, signum * q11Var.getWidth() * 2.0f);
        if (!z) {
            ylaVar.a(new xr3(this) { // from class: z11
                public final /* synthetic */ b21 b;

                {
                    this.b = this;
                }

                @Override // xr3
                public final void a(yla ylaVar2, boolean z2, float f3, float f4) {
                    byte b3 = b;
                    b21 b21Var = this.b;
                    switch (b3) {
                        case 0:
                            b21Var.b.E.b();
                            break;
                        default:
                            b21Var.b.E.b();
                            break;
                    }
                }
            });
            ylaVar.b(new h10(q11Var, (byte) 2));
        }
        ylaVar.m.a(1.0f);
        ylaVar.m.b(100.0f);
        ylaVar.a = f;
        ylaVar.h();
        if (z) {
            yla ylaVar2 = new yla((Object) q11Var, (ri4) yla.v, 0.0f);
            ylaVar2.a(new xr3(this) { // from class: z11
                public final /* synthetic */ b21 b;

                {
                    this.b = this;
                }

                @Override // xr3
                public final void a(yla ylaVar22, boolean z2, float f3, float f4) {
                    byte b3 = b2;
                    b21 b21Var = this.b;
                    switch (b3) {
                        case 0:
                            b21Var.b.E.b();
                            break;
                        default:
                            b21Var.b.E.b();
                            break;
                    }
                }
            });
            ylaVar2.b(new a21());
            ylaVar.m.a(1.0f);
            ylaVar.m.b(10.0f);
            ylaVar.a = f;
            ylaVar2.h();
        }
        c11Var.s = true;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        c11 c11Var = this.b;
        float f3 = c11Var.h + f;
        c11Var.h = f3;
        float f4 = c11Var.n + f2;
        c11Var.n = f4;
        if (Utilities.t(0.0f, 0.0f, f3, f4) > gl.e) {
            c11Var.r = true;
        }
        if (!c11Var.d) {
            return false;
        }
        float f5 = c11Var.f - f;
        c11Var.f = f5;
        q11 q11Var = this.a;
        q11Var.setTranslationX(f5);
        float f6 = c11Var.f;
        if (f6 != 0.0f && ((f6 >= 0.0f || !c11Var.w) && (f6 <= 0.0f || !c11Var.x))) {
            return true;
        }
        q11Var.setAlpha(1.0f - (Math.abs(f6) / q11Var.getWidth()));
        return true;
    }
}
