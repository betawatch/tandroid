package org.telegram.ui.Components;

import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class uj0 implements v4.r0 {
    public RecyclerView a;
    public boolean c;
    public int d;
    public int e;
    public int f;
    public boolean g;
    public boolean h;
    public int i;
    public final tj0 k;
    public int b = -1;
    public final int j = org.telegram.messenger.g0.L(80.0f);
    public final et l = new et(this, 12);

    public uj0(tj0 tj0Var) {
        this.k = tj0Var;
    }

    @Override // v4.r0
    public final void a(RecyclerView recyclerView, MotionEvent motionEvent) {
        View E = recyclerView.E(motionEvent.getX(), motionEvent.getY());
        int R = E != null ? RecyclerView.R(E) : -1;
        float y10 = motionEvent.getY();
        int action = motionEvent.getAction();
        tj0 tj0Var = this.k;
        et etVar = this.l;
        if (action == 1) {
            this.c = false;
            this.g = false;
            this.h = false;
            org.telegram.messenger.g0.r(etVar);
            tj0Var.d(false);
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
                    org.telegram.messenger.g0.r(etVar);
                    org.telegram.messenger.g0.h3(etVar);
                }
                this.i = ((int) (this.d - (y10 - f10))) / 2;
            } else if (y10 >= this.e && y10 <= this.f) {
                this.g = false;
                if (!this.h) {
                    this.h = true;
                    org.telegram.messenger.g0.r(etVar);
                    org.telegram.messenger.g0.h3(etVar);
                }
                this.i = ((int) ((y10 + this.f) - (this.e + r11))) / 2;
            } else if (this.g || this.h) {
                org.telegram.messenger.g0.r(etVar);
                this.g = false;
                this.h = false;
            }
        }
        if (R == -1 || this.b == R) {
            return;
        }
        this.b = R;
        tj0Var.j(E, !tj0Var.k(R));
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
        tj0 tj0Var = this.k;
        if (!tj0Var.e(i7)) {
            this.c = false;
            return;
        }
        tj0Var.d(true);
        tj0Var.j(view, z9);
        this.c = true;
        this.b = i7;
    }

    @Override // v4.r0
    public final void c(boolean z9) {
    }
}
