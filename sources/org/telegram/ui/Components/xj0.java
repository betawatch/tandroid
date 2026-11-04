package org.telegram.ui.Components;

import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class xj0 implements u4.s0 {
    public RecyclerView a;
    public boolean c;
    public int d;
    public int e;
    public int f;
    public boolean g;
    public boolean h;
    public int i;
    public final wj0 k;
    public int b = -1;
    public final int j = org.telegram.messenger.g0.L(80.0f);
    public final lt l = new lt(this, 11);

    public xj0(wj0 wj0Var) {
        this.k = wj0Var;
    }

    @Override // u4.s0
    public final void a(RecyclerView recyclerView, MotionEvent motionEvent) {
        View E = recyclerView.E(motionEvent.getX(), motionEvent.getY());
        int R = E != null ? RecyclerView.R(E) : -1;
        float y9 = motionEvent.getY();
        int action = motionEvent.getAction();
        wj0 wj0Var = this.k;
        lt ltVar = this.l;
        if (action == 1) {
            this.c = false;
            this.g = false;
            this.h = false;
            org.telegram.messenger.g0.r(ltVar);
            wj0Var.b(false);
            return;
        }
        if (action != 2) {
            return;
        }
        if (this.j > -1) {
            float f10 = 0;
            if (y9 >= f10 && y9 <= this.d) {
                this.h = false;
                if (!this.g) {
                    this.g = true;
                    org.telegram.messenger.g0.r(ltVar);
                    org.telegram.messenger.g0.h3(ltVar);
                }
                this.i = ((int) (this.d - (y9 - f10))) / 2;
            } else if (y9 >= this.e && y9 <= this.f) {
                this.g = false;
                if (!this.h) {
                    this.h = true;
                    org.telegram.messenger.g0.r(ltVar);
                    org.telegram.messenger.g0.h3(ltVar);
                }
                this.i = ((int) ((y9 + this.f) - (this.e + r11))) / 2;
            } else if (this.g || this.h) {
                org.telegram.messenger.g0.r(ltVar);
                this.g = false;
                this.h = false;
            }
        }
        if (R == -1 || this.b == R) {
            return;
        }
        this.b = R;
        wj0Var.f(E, !wj0Var.m(R));
    }

    @Override // u4.s0
    public final boolean b(RecyclerView recyclerView, MotionEvent motionEvent) {
        boolean z10 = this.c && !(recyclerView.getAdapter() == null || recyclerView.getAdapter().b() == 0);
        if (z10) {
            this.a = recyclerView;
            int i3 = this.j;
            if (i3 > -1) {
                this.d = i3;
                this.e = recyclerView.getMeasuredHeight() - i3;
                this.f = recyclerView.getMeasuredHeight();
            }
        }
        if (z10 && motionEvent.getAction() == 1) {
            this.c = false;
            this.g = false;
            this.h = false;
            org.telegram.messenger.g0.r(this.l);
            this.k.b(false);
        }
        return z10;
    }

    public final void d(int i3, View view, boolean z10) {
        if (this.c) {
            return;
        }
        this.b = -1;
        org.telegram.messenger.g0.r(this.l);
        this.g = false;
        this.h = false;
        wj0 wj0Var = this.k;
        if (!wj0Var.c(i3)) {
            this.c = false;
            return;
        }
        wj0Var.b(true);
        wj0Var.f(view, z10);
        this.c = true;
        this.b = i3;
    }

    @Override // u4.s0
    public final void c(boolean z10) {
    }
}
