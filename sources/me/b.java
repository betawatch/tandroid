package me;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import ji.b5;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class b {
    public final a a;
    public b5 b;
    public int c;
    public float d;
    public float e;
    public float f;
    public float g;

    public b(a aVar) {
        this.a = aVar;
    }

    public final boolean a(MotionEvent motionEvent, View view) {
        float x10 = motionEvent.getX();
        float y3 = motionEvent.getY();
        int action = motionEvent.getAction();
        a aVar = this.a;
        if (action == 0) {
            b(view, x10, y3);
            if (aVar.needClickAt(view, x10, y3)) {
                this.c |= 1;
                this.d = x10;
                this.e = y3;
                aVar.onClickTouchDown(view, x10, y3);
                if (aVar.needLongPress(x10, y3) && view != null) {
                    if (this.b != null) {
                        throw new AssertionError();
                    }
                    this.c |= 2;
                    b5 b5Var = new b5(11, this, view);
                    this.b = b5Var;
                    view.postDelayed(b5Var, aVar.getLongPressDuration());
                    return true;
                }
            }
        }
        if (action == 1) {
            int i10 = this.c;
            if ((i10 & 1) != 0) {
                if ((i10 & 4) != 0) {
                    aVar.onLongPressFinish(view, x10, y3);
                    this.c &= -5;
                } else {
                    aVar.onClickAt(view, x10, y3);
                    if ((this.c & 256) == 0 && view != null) {
                        view.playSoundEffect(0);
                    }
                }
                b(view, x10, y3);
                return true;
            }
        } else if (action != 2) {
            if (action == 3 && (this.c & 1) != 0) {
                b(view, x10, y3);
                return true;
            }
        } else if ((this.c & 1) != 0) {
            aVar.onClickTouchMove(view, x10, y3);
            if ((this.c & 4) != 0) {
                aVar.onLongPressMove(view, motionEvent, x10, y3, this.f, this.g);
                return true;
            }
            if (aVar.needCancelTouchBySlopMove() && Math.max(Math.abs(this.d - x10), Math.abs(this.e - y3)) > ViewConfiguration.get(view.getContext()).getScaledTouchSlop() * 1.89f) {
                b(view, x10, y3);
                return true;
            }
        }
        return (this.c & 1) != 0;
    }

    public final void b(View view, float f7, float f10) {
        int i10 = this.c;
        if ((i10 & 2) != 0) {
            this.c = i10 & (-3);
            b5 b5Var = this.b;
            if (b5Var == null) {
                throw new AssertionError();
            }
            view.removeCallbacks(b5Var);
            this.b = null;
        }
        int i11 = this.c;
        int i12 = i11 & 8;
        a aVar = this.a;
        if (i12 != 0) {
            this.c = i11 & (-9);
            aVar.onLongPressCancelled(view, f7, f10);
        }
        if ((this.c & 4) != 0) {
            aVar.onLongPressFinish(view, f7, f10);
            this.c &= -5;
        }
        if ((this.c & 1) != 0) {
            aVar.onClickTouchUp(view, f7, f10);
            this.c &= -2;
        }
    }
}
