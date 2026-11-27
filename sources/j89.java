// default package

import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class j89 implements u79 {
    public RecyclerView a;
    public boolean c;
    public int d;
    public int e;
    public int f;
    public boolean g;
    public boolean h;
    public int i;
    public final i89 k;
    public int b = -1;
    public final int j = hl.L(80.0f);
    public final ki7 l = new ki7(this, (byte) 14);

    public j89(i89 i89Var) {
        this.k = i89Var;
    }

    @Override // u79
    public final void a(RecyclerView recyclerView, MotionEvent motionEvent) {
        View F = recyclerView.F(motionEvent.getX(), motionEvent.getY());
        int S = F != null ? RecyclerView.S(F) : -1;
        float y = motionEvent.getY();
        int action = motionEvent.getAction();
        i89 i89Var = this.k;
        ki7 ki7Var = this.l;
        if (action == 1) {
            this.c = false;
            this.g = false;
            this.h = false;
            hl.r(ki7Var);
            i89Var.r(false);
            return;
        }
        if (action == 2) {
            if (this.j > -1) {
                if (y >= 0.0f && y <= this.d) {
                    this.h = false;
                    if (!this.g) {
                        this.g = true;
                        hl.r(ki7Var);
                        hl.c3(ki7Var);
                    }
                    this.i = ((int) (this.d - (y - 0.0f))) / 2;
                } else if (y >= this.e && y <= this.f) {
                    this.g = false;
                    if (!this.h) {
                        this.h = true;
                        hl.r(ki7Var);
                        hl.c3(ki7Var);
                    }
                    this.i = ((int) ((y + this.f) - (this.e + r11))) / 2;
                } else if (this.g || this.h) {
                    hl.r(ki7Var);
                    this.g = false;
                    this.h = false;
                }
            }
            if (S == -1 || this.b == S) {
                return;
            }
            this.b = S;
            i89Var.n0(F, !i89Var.s0(S));
        }
    }

    @Override // u79
    public final boolean b(RecyclerView recyclerView, MotionEvent motionEvent) {
        boolean z = this.c && !(recyclerView.getAdapter() == null || recyclerView.getAdapter().b() == 0);
        if (z) {
            this.a = recyclerView;
            int i = this.j;
            if (i > -1) {
                this.d = i;
                this.e = recyclerView.getMeasuredHeight() - i;
                this.f = recyclerView.getMeasuredHeight();
            }
        }
        if (z && motionEvent.getAction() == 1) {
            this.c = false;
            this.g = false;
            this.h = false;
            hl.r(this.l);
            this.k.r(false);
        }
        return z;
    }

    public final void d(int i, View view, boolean z) {
        if (this.c) {
            return;
        }
        this.b = -1;
        hl.r(this.l);
        this.g = false;
        this.h = false;
        i89 i89Var = this.k;
        if (!i89Var.w(i)) {
            this.c = false;
            return;
        }
        i89Var.r(true);
        i89Var.n0(view, z);
        this.c = true;
        this.b = i;
    }

    @Override // u79
    public final void c(boolean z) {
    }
}
