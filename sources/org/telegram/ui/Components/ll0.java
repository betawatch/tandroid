package org.telegram.ui.Components;

import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class ll0 implements f2.z0 {
    public RecyclerView a;
    public boolean c;
    public int d;
    public int e;
    public int f;
    public boolean g;
    public boolean h;
    public int i;
    public final kl0 k;
    public int b = -1;
    public final int j = AndroidUtilities.dp(80.0f);
    public final rk0 l = new rk0(this, 1);

    public ll0(kl0 kl0Var) {
        this.k = kl0Var;
    }

    @Override // f2.z0
    public final void a(RecyclerView recyclerView, MotionEvent motionEvent) {
        View E = recyclerView.E(motionEvent.getX(), motionEvent.getY());
        int R = E != null ? RecyclerView.R(E) : -1;
        float y8 = motionEvent.getY();
        int action = motionEvent.getAction();
        kl0 kl0Var = this.k;
        rk0 rk0Var = this.l;
        if (action == 1) {
            this.c = false;
            this.g = false;
            this.h = false;
            AndroidUtilities.cancelRunOnUIThread(rk0Var);
            kl0Var.a(false);
            return;
        }
        if (action != 2) {
            return;
        }
        if (this.j > -1) {
            float f9 = 0;
            if (y8 >= f9 && y8 <= this.d) {
                this.h = false;
                if (!this.g) {
                    this.g = true;
                    AndroidUtilities.cancelRunOnUIThread(rk0Var);
                    AndroidUtilities.runOnUIThread(rk0Var);
                }
                this.i = ((int) (this.d - (y8 - f9))) / 2;
            } else if (y8 >= this.e && y8 <= this.f) {
                this.g = false;
                if (!this.h) {
                    this.h = true;
                    AndroidUtilities.cancelRunOnUIThread(rk0Var);
                    AndroidUtilities.runOnUIThread(rk0Var);
                }
                this.i = ((int) ((y8 + this.f) - (this.e + r11))) / 2;
            } else if (this.g || this.h) {
                AndroidUtilities.cancelRunOnUIThread(rk0Var);
                this.g = false;
                this.h = false;
            }
        }
        if (R == -1 || this.b == R) {
            return;
        }
        this.b = R;
        kl0Var.c(E, !kl0Var.d(R));
    }

    @Override // f2.z0
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
        kl0 kl0Var = this.k;
        if (!kl0Var.b(i10)) {
            this.c = false;
            return;
        }
        kl0Var.a(true);
        kl0Var.c(view, z10);
        this.c = true;
        this.b = i10;
    }

    @Override // f2.z0
    public final void c(boolean z10) {
    }
}
