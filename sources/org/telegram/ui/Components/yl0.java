package org.telegram.ui.Components;

import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class yl0 implements s4.r0 {
    public RecyclerView a;
    public boolean c;
    public int d;
    public int e;
    public int f;
    public boolean g;
    public boolean h;
    public int i;
    public final xl0 k;
    public int b = -1;
    public final int j = AndroidUtilities.dp(80.0f);
    public final org.telegram.ui.Cells.t6 l = new org.telegram.ui.Cells.t6(this, 22);

    public yl0(xl0 xl0Var) {
        this.k = xl0Var;
    }

    @Override // s4.r0
    public final void a(RecyclerView recyclerView, MotionEvent motionEvent) {
        View E = recyclerView.E(motionEvent.getX(), motionEvent.getY());
        int R = E != null ? RecyclerView.R(E) : -1;
        float y3 = motionEvent.getY();
        int action = motionEvent.getAction();
        xl0 xl0Var = this.k;
        org.telegram.ui.Cells.t6 t6Var = this.l;
        if (action == 1) {
            this.c = false;
            this.g = false;
            this.h = false;
            AndroidUtilities.cancelRunOnUIThread(t6Var);
            xl0Var.a(false);
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
                    AndroidUtilities.cancelRunOnUIThread(t6Var);
                    AndroidUtilities.runOnUIThread(t6Var);
                }
                this.i = ((int) (this.d - (y3 - f7))) / 2;
            } else if (y3 >= this.e && y3 <= this.f) {
                this.g = false;
                if (!this.h) {
                    this.h = true;
                    AndroidUtilities.cancelRunOnUIThread(t6Var);
                    AndroidUtilities.runOnUIThread(t6Var);
                }
                this.i = ((int) ((y3 + this.f) - (this.e + r11))) / 2;
            } else if (this.g || this.h) {
                AndroidUtilities.cancelRunOnUIThread(t6Var);
                this.g = false;
                this.h = false;
            }
        }
        if (R == -1 || this.b == R) {
            return;
        }
        this.b = R;
        xl0Var.c(E, !xl0Var.d(R));
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
        xl0 xl0Var = this.k;
        if (!xl0Var.b(i10)) {
            this.c = false;
            return;
        }
        xl0Var.a(true);
        xl0Var.c(view, z10);
        this.c = true;
        this.b = i10;
    }

    @Override // s4.r0
    public final void c(boolean z10) {
    }
}
