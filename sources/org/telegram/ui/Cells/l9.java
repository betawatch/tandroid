package org.telegram.ui.Cells;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class l9 {
    public int a;
    public float b;
    public float c;
    public Object d;
    public Object e;

    public l9(ue.a aVar) {
        this.d = aVar;
    }

    public boolean a(View view, MotionEvent motionEvent) {
        ue.a aVar = (ue.a) this.d;
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        int action = motionEvent.getAction();
        if (action == 0) {
            b(view, x10, y10);
            if (aVar.U0(x10, y10)) {
                this.a |= 1;
                this.b = x10;
                this.c = y10;
                aVar.t0();
                if (aVar.o1() && view != null) {
                    if (((ti.p) this.e) != null) {
                        throw new AssertionError();
                    }
                    this.a |= 2;
                    ti.p pVar = new ti.p(6, this, view);
                    this.e = pVar;
                    view.postDelayed(pVar, aVar.getLongPressDuration());
                    return true;
                }
            }
        }
        if (action == 1) {
            int i7 = this.a;
            if ((i7 & 1) != 0) {
                if ((i7 & 4) != 0) {
                    aVar.m(view, x10, y10);
                    this.a &= -5;
                } else {
                    aVar.O(x10, y10);
                    if ((this.a & 256) == 0 && view != null) {
                        view.playSoundEffect(0);
                    }
                }
                b(view, x10, y10);
                return true;
            }
        } else if (action != 2) {
            if (action == 3 && (this.a & 1) != 0) {
                b(view, x10, y10);
                return true;
            }
        } else if ((this.a & 1) != 0) {
            aVar.s(x10, y10);
            if ((this.a & 4) != 0) {
                aVar.l1(view, x10, y10);
                return true;
            }
            if (aVar.j0() && Math.max(Math.abs(this.b - x10), Math.abs(this.c - y10)) > ViewConfiguration.get(view.getContext()).getScaledTouchSlop() * 1.89f) {
                b(view, x10, y10);
                return true;
            }
        }
        return (this.a & 1) != 0;
    }

    public void b(View view, float f10, float f11) {
        ue.a aVar = (ue.a) this.d;
        int i7 = this.a;
        if ((i7 & 2) != 0) {
            this.a = i7 & (-3);
            ti.p pVar = (ti.p) this.e;
            if (pVar == null) {
                throw new AssertionError();
            }
            view.removeCallbacks(pVar);
            this.e = null;
        }
        int i10 = this.a;
        if ((i10 & 8) != 0) {
            this.a = i10 & (-9);
            aVar.w(view, f10, f11);
        }
        if ((this.a & 4) != 0) {
            aVar.m(view, f10, f11);
            this.a &= -5;
        }
        if ((this.a & 1) != 0) {
            aVar.H0();
            this.a &= -2;
        }
    }
}
