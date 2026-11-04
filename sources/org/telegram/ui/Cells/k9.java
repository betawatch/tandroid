package org.telegram.ui.Cells;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import org.telegram.ui.hc1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class k9 {
    public int a;
    public float b;
    public float c;
    public Object d;
    public Object e;

    public k9(re.a aVar) {
        this.d = aVar;
    }

    public boolean a(View view, MotionEvent motionEvent) {
        re.a aVar = (re.a) this.d;
        float x10 = motionEvent.getX();
        float y9 = motionEvent.getY();
        int action = motionEvent.getAction();
        if (action == 0) {
            b(view, x10, y9);
            if (aVar.U0(x10, y9)) {
                this.a |= 1;
                this.b = x10;
                this.c = y9;
                aVar.u0();
                if (aVar.s1() && view != null) {
                    if (((hc1) this.e) != null) {
                        throw new AssertionError();
                    }
                    this.a |= 2;
                    hc1 hc1Var = new hc1(22, this, view);
                    this.e = hc1Var;
                    view.postDelayed(hc1Var, aVar.getLongPressDuration());
                    return true;
                }
            }
        }
        if (action == 1) {
            int i3 = this.a;
            if ((i3 & 1) != 0) {
                if ((i3 & 4) != 0) {
                    aVar.o(view, x10, y9);
                    this.a &= -5;
                } else {
                    aVar.O(x10, y9);
                    if ((this.a & 256) == 0 && view != null) {
                        view.playSoundEffect(0);
                    }
                }
                b(view, x10, y9);
                return true;
            }
        } else if (action != 2) {
            if (action == 3 && (this.a & 1) != 0) {
                b(view, x10, y9);
                return true;
            }
        } else if ((this.a & 1) != 0) {
            aVar.t(x10, y9);
            if ((this.a & 4) != 0) {
                aVar.o1(view, x10, y9);
                return true;
            }
            if (aVar.g0() && Math.max(Math.abs(this.b - x10), Math.abs(this.c - y9)) > ViewConfiguration.get(view.getContext()).getScaledTouchSlop() * 1.89f) {
                b(view, x10, y9);
                return true;
            }
        }
        return (this.a & 1) != 0;
    }

    public void b(View view, float f10, float f11) {
        re.a aVar = (re.a) this.d;
        int i3 = this.a;
        if ((i3 & 2) != 0) {
            this.a = i3 & (-3);
            hc1 hc1Var = (hc1) this.e;
            if (hc1Var == null) {
                throw new AssertionError();
            }
            view.removeCallbacks(hc1Var);
            this.e = null;
        }
        int i10 = this.a;
        if ((i10 & 8) != 0) {
            this.a = i10 & (-9);
            aVar.x(view, f10, f11);
        }
        if ((this.a & 4) != 0) {
            aVar.o(view, f10, f11);
            this.a &= -5;
        }
        if ((this.a & 1) != 0) {
            aVar.H0();
            this.a &= -2;
        }
    }
}
