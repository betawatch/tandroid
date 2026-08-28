package org.telegram.ui.Components;

import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class yk0 implements f2.c1 {
    public RecyclerView a;
    public boolean c;
    public int d;
    public int e;
    public int f;
    public boolean g;
    public boolean h;
    public int i;
    public final xk0 k;
    public int b = -1;
    public final int j = AndroidUtilities.dp(80.0f);
    public final m.i3 l = new m.i3(this, 28);

    public yk0(xk0 xk0Var) {
        this.k = xk0Var;
    }

    @Override // f2.c1
    public final void a(RecyclerView recyclerView, MotionEvent motionEvent) {
        View E = recyclerView.E(motionEvent.getX(), motionEvent.getY());
        int R = E != null ? RecyclerView.R(E) : -1;
        float y10 = motionEvent.getY();
        int action = motionEvent.getAction();
        xk0 xk0Var = this.k;
        m.i3 i3Var = this.l;
        if (action == 1) {
            this.c = false;
            this.g = false;
            this.h = false;
            AndroidUtilities.cancelRunOnUIThread(i3Var);
            xk0Var.a(false);
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
                    AndroidUtilities.cancelRunOnUIThread(i3Var);
                    AndroidUtilities.runOnUIThread(i3Var);
                }
                this.i = ((int) (this.d - (y10 - f10))) / 2;
            } else if (y10 >= this.e && y10 <= this.f) {
                this.g = false;
                if (!this.h) {
                    this.h = true;
                    AndroidUtilities.cancelRunOnUIThread(i3Var);
                    AndroidUtilities.runOnUIThread(i3Var);
                }
                this.i = ((int) ((y10 + this.f) - (this.e + r11))) / 2;
            } else if (this.g || this.h) {
                AndroidUtilities.cancelRunOnUIThread(i3Var);
                this.g = false;
                this.h = false;
            }
        }
        if (R == -1 || this.b == R) {
            return;
        }
        this.b = R;
        xk0Var.c(E, !xk0Var.d(R));
    }

    @Override // f2.c1
    public final boolean b(RecyclerView recyclerView, MotionEvent motionEvent) {
        boolean z10 = this.c && !(recyclerView.getAdapter() == null || recyclerView.getAdapter().h() == 0);
        if (z10) {
            this.a = recyclerView;
            int i9 = this.j;
            if (i9 > -1) {
                this.d = i9;
                this.e = recyclerView.getMeasuredHeight() - i9;
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

    public final void d(View view, int i9, boolean z10) {
        if (this.c) {
            return;
        }
        this.b = -1;
        AndroidUtilities.cancelRunOnUIThread(this.l);
        this.g = false;
        this.h = false;
        xk0 xk0Var = this.k;
        if (!xk0Var.b(i9)) {
            this.c = false;
            return;
        }
        xk0Var.a(true);
        xk0Var.c(view, z10);
        this.c = true;
        this.b = i9;
    }

    @Override // f2.c1
    public final void c(boolean z10) {
    }
}
