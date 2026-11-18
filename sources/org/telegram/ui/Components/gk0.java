package org.telegram.ui.Components;

import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class gk0 implements v4.t0 {
    public RecyclerView a;
    public boolean c;
    public int d;
    public int e;
    public int f;
    public boolean g;
    public boolean h;
    public int i;
    public final fk0 k;
    public int b = -1;
    public final int j = org.telegram.messenger.g0.L(80.0f);
    public final gk l = new gk(this, 15);

    public gk0(fk0 fk0Var) {
        this.k = fk0Var;
    }

    @Override // v4.t0
    public final void a(RecyclerView recyclerView, MotionEvent motionEvent) {
        View E = recyclerView.E(motionEvent.getX(), motionEvent.getY());
        int R = E != null ? RecyclerView.R(E) : -1;
        float y10 = motionEvent.getY();
        int action = motionEvent.getAction();
        fk0 fk0Var = this.k;
        gk gkVar = this.l;
        if (action == 1) {
            this.c = false;
            this.g = false;
            this.h = false;
            org.telegram.messenger.g0.r(gkVar);
            fk0Var.e(false);
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
                    org.telegram.messenger.g0.r(gkVar);
                    org.telegram.messenger.g0.g3(gkVar);
                }
                this.i = ((int) (this.d - (y10 - f10))) / 2;
            } else if (y10 >= this.e && y10 <= this.f) {
                this.g = false;
                if (!this.h) {
                    this.h = true;
                    org.telegram.messenger.g0.r(gkVar);
                    org.telegram.messenger.g0.g3(gkVar);
                }
                this.i = ((int) ((y10 + this.f) - (this.e + r11))) / 2;
            } else if (this.g || this.h) {
                org.telegram.messenger.g0.r(gkVar);
                this.g = false;
                this.h = false;
            }
        }
        if (R == -1 || this.b == R) {
            return;
        }
        this.b = R;
        fk0Var.l(E, !fk0Var.m(R));
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
            this.k.e(false);
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
        fk0 fk0Var = this.k;
        if (!fk0Var.f(i7)) {
            this.c = false;
            return;
        }
        fk0Var.e(true);
        fk0Var.l(view, z10);
        this.c = true;
        this.b = i7;
    }

    @Override // v4.t0
    public final void c(boolean z10) {
    }
}
