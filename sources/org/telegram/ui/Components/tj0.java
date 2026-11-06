package org.telegram.ui.Components;

import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class tj0 implements v4.r0 {
    public RecyclerView a;
    public boolean c;
    public int d;
    public int e;
    public int f;
    public boolean g;
    public boolean h;
    public int i;
    public final sj0 k;
    public int b = -1;
    public final int j = org.telegram.messenger.g0.L(80.0f);
    public final dt l = new dt(this, 12);

    public tj0(sj0 sj0Var) {
        this.k = sj0Var;
    }

    @Override // v4.r0
    public final void a(RecyclerView recyclerView, MotionEvent motionEvent) {
        View E = recyclerView.E(motionEvent.getX(), motionEvent.getY());
        int R = E != null ? RecyclerView.R(E) : -1;
        float y10 = motionEvent.getY();
        int action = motionEvent.getAction();
        sj0 sj0Var = this.k;
        dt dtVar = this.l;
        if (action == 1) {
            this.c = false;
            this.g = false;
            this.h = false;
            org.telegram.messenger.g0.r(dtVar);
            sj0Var.d(false);
            return;
        }
        if (action != 2) {
            return;
        }
        if (this.j > -1) {
            float f10 = 0;
            if (y10 >= f10 && y10 <= this.d) {
                this.h = false;
                if (!this.g) {
                    this.g = true;
                    org.telegram.messenger.g0.r(dtVar);
                    org.telegram.messenger.g0.h3(dtVar);
                }
                this.i = ((int) (this.d - (y10 - f10))) / 2;
            } else if (y10 >= this.e && y10 <= this.f) {
                this.g = false;
                if (!this.h) {
                    this.h = true;
                    org.telegram.messenger.g0.r(dtVar);
                    org.telegram.messenger.g0.h3(dtVar);
                }
                this.i = ((int) ((y10 + this.f) - (this.e + r11))) / 2;
            } else if (this.g || this.h) {
                org.telegram.messenger.g0.r(dtVar);
                this.g = false;
                this.h = false;
            }
        }
        if (R == -1 || this.b == R) {
            return;
        }
        this.b = R;
        sj0Var.j(E, !sj0Var.k(R));
    }

    @Override // v4.r0
    public final boolean b(RecyclerView recyclerView, MotionEvent motionEvent) {
        boolean z9 = this.c && !(recyclerView.getAdapter() == null || recyclerView.getAdapter().b() == 0);
        if (z9) {
            this.a = recyclerView;
            int i7 = this.j;
            if (i7 > -1) {
                this.d = i7;
                this.e = recyclerView.getMeasuredHeight() - i7;
                this.f = recyclerView.getMeasuredHeight();
            }
        }
        if (z9 && motionEvent.getAction() == 1) {
            this.c = false;
            this.g = false;
            this.h = false;
            org.telegram.messenger.g0.r(this.l);
            this.k.d(false);
        }
        return z9;
    }

    public final void d(int i7, View view, boolean z9) {
        if (this.c) {
            return;
        }
        this.b = -1;
        org.telegram.messenger.g0.r(this.l);
        this.g = false;
        this.h = false;
        sj0 sj0Var = this.k;
        if (!sj0Var.e(i7)) {
            this.c = false;
            return;
        }
        sj0Var.d(true);
        sj0Var.j(view, z9);
        this.c = true;
        this.b = i7;
    }

    @Override // v4.r0
    public final void c(boolean z9) {
    }
}
