package org.telegram.ui.Components;

import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class vl0 implements f2.z0 {
    public RecyclerView a;
    public boolean c;
    public int d;
    public int e;
    public int f;
    public boolean g;
    public boolean h;
    public int i;
    public final ul0 k;
    public int b = -1;
    public final int j = AndroidUtilities.dp(80.0f);
    public final tl0 l = new tl0(this, 0);

    public vl0(ul0 ul0Var) {
        this.k = ul0Var;
    }

    @Override // f2.z0
    public final void a(RecyclerView recyclerView, MotionEvent motionEvent) {
        View E = recyclerView.E(motionEvent.getX(), motionEvent.getY());
        int R = E != null ? RecyclerView.R(E) : -1;
        float y10 = motionEvent.getY();
        int action = motionEvent.getAction();
        ul0 ul0Var = this.k;
        tl0 tl0Var = this.l;
        if (action == 1) {
            this.c = false;
            this.g = false;
            this.h = false;
            AndroidUtilities.cancelRunOnUIThread(tl0Var);
            ul0Var.a(false);
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
                    AndroidUtilities.cancelRunOnUIThread(tl0Var);
                    AndroidUtilities.runOnUIThread(tl0Var);
                }
                this.i = ((int) (this.d - (y10 - f10))) / 2;
            } else if (y10 >= this.e && y10 <= this.f) {
                this.g = false;
                if (!this.h) {
                    this.h = true;
                    AndroidUtilities.cancelRunOnUIThread(tl0Var);
                    AndroidUtilities.runOnUIThread(tl0Var);
                }
                this.i = ((int) ((y10 + this.f) - (this.e + r11))) / 2;
            } else if (this.g || this.h) {
                AndroidUtilities.cancelRunOnUIThread(tl0Var);
                this.g = false;
                this.h = false;
            }
        }
        if (R == -1 || this.b == R) {
            return;
        }
        this.b = R;
        ul0Var.c(E, !ul0Var.d(R));
    }

    @Override // f2.z0
    public final boolean b(RecyclerView recyclerView, MotionEvent motionEvent) {
        boolean z4 = this.c && !(recyclerView.getAdapter() == null || recyclerView.getAdapter().h() == 0);
        if (z4) {
            this.a = recyclerView;
            int i10 = this.j;
            if (i10 > -1) {
                this.d = i10;
                this.e = recyclerView.getMeasuredHeight() - i10;
                this.f = recyclerView.getMeasuredHeight();
            }
        }
        if (z4 && motionEvent.getAction() == 1) {
            this.c = false;
            this.g = false;
            this.h = false;
            AndroidUtilities.cancelRunOnUIThread(this.l);
            this.k.a(false);
        }
        return z4;
    }

    public final void d(View view, int i10, boolean z4) {
        if (this.c) {
            return;
        }
        this.b = -1;
        AndroidUtilities.cancelRunOnUIThread(this.l);
        this.g = false;
        this.h = false;
        ul0 ul0Var = this.k;
        if (!ul0Var.b(i10)) {
            this.c = false;
            return;
        }
        ul0Var.a(true);
        ul0Var.c(view, z4);
        this.c = true;
        this.b = i10;
    }

    @Override // f2.z0
    public final void c(boolean z4) {
    }
}
