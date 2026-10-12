package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class k61 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ r71 c;

    public /* synthetic */ k61(r71 r71Var, boolean z10, int i10) {
        this.a = i10;
        this.c = r71Var;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ArrayList arrayList;
        ArrayList arrayList2;
        switch (this.a) {
            case 0:
                r71 r71Var = this.c;
                e61 e61Var = r71Var.i0;
                boolean z10 = this.b;
                e61Var.setVisibility(z10 ? 0 : 8);
                r71Var.h0.setVisibility(z10 ? 8 : 0);
                r71Var.E1 = null;
                if (!z10 && (arrayList2 = r71Var.A1) != null) {
                    arrayList2.clear();
                    ArrayList arrayList3 = r71Var.D1;
                    if (arrayList3 != null) {
                        arrayList3.clear();
                    }
                    r71Var.q0.E(false);
                }
                if (!z10 && (arrayList = r71Var.B1) != null) {
                    arrayList.clear();
                    break;
                }
                break;
            default:
                r71 r71Var2 = this.c;
                r71Var2.j0.setVisibility((this.b && r71Var2.i0.getVisibility() == 0) ? 0 : 8);
                r71Var2.H1 = null;
                break;
        }
    }
}
