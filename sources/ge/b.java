package ge;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import d1.e;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class b {
    public int a;
    public float b;
    public float c;
    public Object d;
    public Object e;

    public b(a aVar) {
        this.d = aVar;
    }

    public boolean a(View view, MotionEvent motionEvent) {
        a aVar = (a) this.d;
        float x10 = motionEvent.getX();
        float y3 = motionEvent.getY();
        int action = motionEvent.getAction();
        if (action == 0) {
            b(view, x10, y3);
            if (aVar.V0(x10, y3)) {
                this.a |= 1;
                this.b = x10;
                this.c = y3;
                aVar.t0();
                if (aVar.I1() && view != null) {
                    if (((e) this.e) != null) {
                        throw new AssertionError();
                    }
                    this.a |= 2;
                    e eVar = new e(13, this, view);
                    this.e = eVar;
                    view.postDelayed(eVar, aVar.getLongPressDuration());
                    return true;
                }
            }
        }
        if (action == 1) {
            int i10 = this.a;
            if ((i10 & 1) != 0) {
                if ((i10 & 4) != 0) {
                    aVar.m(view, x10, y3);
                    this.a &= -5;
                } else {
                    aVar.N(x10, y3);
                    if ((this.a & 256) == 0 && view != null) {
                        view.playSoundEffect(0);
                    }
                }
                b(view, x10, y3);
                return true;
            }
        } else if (action != 2) {
            if (action == 3 && (this.a & 1) != 0) {
                b(view, x10, y3);
                return true;
            }
        } else if ((this.a & 1) != 0) {
            aVar.r(x10, y3);
            if ((this.a & 4) != 0) {
                aVar.o1(view, x10, y3);
                return true;
            }
            if (aVar.j0() && Math.max(Math.abs(this.b - x10), Math.abs(this.c - y3)) > ViewConfiguration.get(view.getContext()).getScaledTouchSlop() * 1.89f) {
                b(view, x10, y3);
                return true;
            }
        }
        return (this.a & 1) != 0;
    }

    public void b(View view, float f7, float f10) {
        a aVar = (a) this.d;
        int i10 = this.a;
        if ((i10 & 2) != 0) {
            this.a = i10 & (-3);
            e eVar = (e) this.e;
            if (eVar == null) {
                throw new AssertionError();
            }
            view.removeCallbacks(eVar);
            this.e = null;
        }
        int i11 = this.a;
        if ((i11 & 8) != 0) {
            this.a = i11 & (-9);
            aVar.u(view, f7, f10);
        }
        if ((this.a & 4) != 0) {
            aVar.m(view, f7, f10);
            this.a &= -5;
        }
        if ((this.a & 1) != 0) {
            aVar.G0();
            this.a &= -2;
        }
    }
}
