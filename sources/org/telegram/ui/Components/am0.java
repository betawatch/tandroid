package org.telegram.ui.Components;

import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class am0 implements s4.r0 {
    public RecyclerView a;
    public boolean c;
    public int d;
    public int e;
    public int f;
    public boolean g;
    public boolean h;
    public int i;
    public final zl0 k;
    public int b = -1;
    public final int j = AndroidUtilities.dp(80.0f);
    public final org.telegram.ui.Cells.u6 l = new org.telegram.ui.Cells.u6(this, 22);

    public am0(zl0 zl0Var) {
        this.k = zl0Var;
    }

    @Override // s4.r0
    public final void a(RecyclerView recyclerView, MotionEvent motionEvent) {
        View F = recyclerView.F(motionEvent.getX(), motionEvent.getY());
        int S = F != null ? RecyclerView.S(F) : -1;
        float y3 = motionEvent.getY();
        int action = motionEvent.getAction();
        zl0 zl0Var = this.k;
        org.telegram.ui.Cells.u6 u6Var = this.l;
        if (action == 1) {
            this.c = false;
            this.g = false;
            this.h = false;
            AndroidUtilities.cancelRunOnUIThread(u6Var);
            zl0Var.a(false);
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
                    AndroidUtilities.cancelRunOnUIThread(u6Var);
                    AndroidUtilities.runOnUIThread(u6Var);
                }
                this.i = ((int) (this.d - (y3 - f7))) / 2;
            } else if (y3 >= this.e && y3 <= this.f) {
                this.g = false;
                if (!this.h) {
                    this.h = true;
                    AndroidUtilities.cancelRunOnUIThread(u6Var);
                    AndroidUtilities.runOnUIThread(u6Var);
                }
                this.i = ((int) ((y3 + this.f) - (this.e + r11))) / 2;
            } else if (this.g || this.h) {
                AndroidUtilities.cancelRunOnUIThread(u6Var);
                this.g = false;
                this.h = false;
            }
        }
        if (S == -1 || this.b == S) {
            return;
        }
        this.b = S;
        zl0Var.c(F, !zl0Var.d(S));
    }

    @Override // s4.r0
    public final boolean b(RecyclerView recyclerView, MotionEvent motionEvent) {
        boolean z10 = this.c && !(recyclerView.getAdapter() == null || recyclerView.getAdapter().h() == 0);
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
            AndroidUtilities.cancelRunOnUIThread(this.l);
            this.k.a(false);
        }
        return z10;
    }

    public final void d(View view, int i10, boolean z10) {
        if (this.c) {
            return;
        }
        this.b = -1;
        AndroidUtilities.cancelRunOnUIThread(this.l);
        this.g = false;
        this.h = false;
        zl0 zl0Var = this.k;
        if (!zl0Var.b(i10)) {
            this.c = false;
            return;
        }
        zl0Var.a(true);
        zl0Var.c(view, z10);
        this.c = true;
        this.b = i10;
    }

    @Override // s4.r0
    public final void c(boolean z10) {
    }
}
