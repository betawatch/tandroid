package org.telegram.ui.Components;

import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class ik0 implements v4.t0 {
    public RecyclerView a;
    public boolean c;
    public int d;
    public int e;
    public int f;
    public boolean g;
    public boolean h;
    public int i;
    public final hk0 k;
    public int b = -1;
    public final int j = org.telegram.messenger.g0.L(80.0f);
    public final rc l = new rc(this, 17);

    public ik0(hk0 hk0Var) {
        this.k = hk0Var;
    }

    @Override // v4.t0
    public final void a(RecyclerView recyclerView, MotionEvent motionEvent) {
        View E = recyclerView.E(motionEvent.getX(), motionEvent.getY());
        int R = E != null ? RecyclerView.R(E) : -1;
        float y10 = motionEvent.getY();
        int action = motionEvent.getAction();
        hk0 hk0Var = this.k;
        rc rcVar = this.l;
        if (action == 1) {
            this.c = false;
            this.g = false;
            this.h = false;
            org.telegram.messenger.g0.r(rcVar);
            hk0Var.f(false);
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
                    org.telegram.messenger.g0.r(rcVar);
                    org.telegram.messenger.g0.g3(rcVar);
                }
                this.i = ((int) (this.d - (y10 - f10))) / 2;
            } else if (y10 >= this.e && y10 <= this.f) {
                this.g = false;
                if (!this.h) {
                    this.h = true;
                    org.telegram.messenger.g0.r(rcVar);
                    org.telegram.messenger.g0.g3(rcVar);
                }
                this.i = ((int) ((y10 + this.f) - (this.e + r11))) / 2;
            } else if (this.g || this.h) {
                org.telegram.messenger.g0.r(rcVar);
                this.g = false;
                this.h = false;
            }
        }
        if (R == -1 || this.b == R) {
            return;
        }
        this.b = R;
        hk0Var.n(E, !hk0Var.o(R));
    }

    @Override // v4.t0
    public final boolean b(RecyclerView recyclerView, MotionEvent motionEvent) {
        boolean z10 = this.c && !(recyclerView.getAdapter() == null || recyclerView.getAdapter().b() == 0);
        if (z10) {
            this.a = recyclerView;
            int i7 = this.j;
            if (i7 > -1) {
                this.d = i7;
                this.e = recyclerView.getMeasuredHeight() - i7;
                this.f = recyclerView.getMeasuredHeight();
            }
        }
        if (z10 && motionEvent.getAction() == 1) {
            this.c = false;
            this.g = false;
            this.h = false;
            org.telegram.messenger.g0.r(this.l);
            this.k.f(false);
        }
        return z10;
    }

    public final void d(int i7, View view, boolean z10) {
        if (this.c) {
            return;
        }
        this.b = -1;
        org.telegram.messenger.g0.r(this.l);
        this.g = false;
        this.h = false;
        hk0 hk0Var = this.k;
        if (!hk0Var.g(i7)) {
            this.c = false;
            return;
        }
        hk0Var.f(true);
        hk0Var.n(view, z10);
        this.c = true;
        this.b = i7;
    }

    @Override // v4.t0
    public final void c(boolean z10) {
    }
}
