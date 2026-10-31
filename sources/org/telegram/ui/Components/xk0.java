package org.telegram.ui.Components;

import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class xk0 implements s4.r0 {
    public RecyclerView a;
    public boolean c;
    public int d;
    public int e;
    public int f;
    public boolean g;
    public boolean h;
    public int i;
    public final wk0 k;
    public int b = -1;
    public final int j = org.telegram.messenger.i0.L(80.0f);
    public final ew l = new ew(this, 10);

    public xk0(wk0 wk0Var) {
        this.k = wk0Var;
    }

    @Override // s4.r0
    public final void a(RecyclerView recyclerView, MotionEvent motionEvent) {
        View E = recyclerView.E(motionEvent.getX(), motionEvent.getY());
        int R = E != null ? RecyclerView.R(E) : -1;
        float y3 = motionEvent.getY();
        int action = motionEvent.getAction();
        wk0 wk0Var = this.k;
        ew ewVar = this.l;
        if (action == 1) {
            this.c = false;
            this.g = false;
            this.h = false;
            org.telegram.messenger.i0.r(ewVar);
            wk0Var.b(false);
            return;
        }
        if (action != 2) {
            return;
        }
        if (this.j > -1) {
            float f7 = 0;
            if (y3 >= f7 && y3 <= this.d) {
                this.h = false;
                if (!this.g) {
                    this.g = true;
                    org.telegram.messenger.i0.r(ewVar);
                    org.telegram.messenger.i0.g3(ewVar);
                }
                this.i = ((int) (this.d - (y3 - f7))) / 2;
            } else if (y3 >= this.e && y3 <= this.f) {
                this.g = false;
                if (!this.h) {
                    this.h = true;
                    org.telegram.messenger.i0.r(ewVar);
                    org.telegram.messenger.i0.g3(ewVar);
                }
                this.i = ((int) ((y3 + this.f) - (this.e + r11))) / 2;
            } else if (this.g || this.h) {
                org.telegram.messenger.i0.r(ewVar);
                this.g = false;
                this.h = false;
            }
        }
        if (R == -1 || this.b == R) {
            return;
        }
        this.b = R;
        wk0Var.h(E, !wk0Var.j(R));
    }

    @Override // s4.r0
    public final boolean b(RecyclerView recyclerView, MotionEvent motionEvent) {
        boolean z10 = this.c && !(recyclerView.getAdapter() == null || recyclerView.getAdapter().b() == 0);
        if (z10) {
            this.a = recyclerView;
            int i10 = this.j;
            if (i10 > -1) {
                this.d = i10;
                this.e = recyclerView.getMeasuredHeight() - i10;
                this.f = recyclerView.getMeasuredHeight();
            }
        }
        if (z10 && motionEvent.getAction() == 1) {
            this.c = false;
            this.g = false;
            this.h = false;
            org.telegram.messenger.i0.r(this.l);
            this.k.b(false);
        }
        return z10;
    }

    public final void d(int i10, View view, boolean z10) {
        if (this.c) {
            return;
        }
        this.b = -1;
        org.telegram.messenger.i0.r(this.l);
        this.g = false;
        this.h = false;
        wk0 wk0Var = this.k;
        if (!wk0Var.d(i10)) {
            this.c = false;
            return;
        }
        wk0Var.b(true);
        wk0Var.h(view, z10);
        this.c = true;
        this.b = i10;
    }

    @Override // s4.r0
    public final void c(boolean z10) {
    }
}
