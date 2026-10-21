package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class q41 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ x51 c;

    public /* synthetic */ q41(x51 x51Var, boolean z10, int i10) {
        this.a = i10;
        this.c = x51Var;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ArrayList arrayList;
        ArrayList arrayList2;
        switch (this.a) {
            case 0:
                x51 x51Var = this.c;
                k41 k41Var = x51Var.i0;
                boolean z10 = this.b;
                k41Var.setVisibility(z10 ? 0 : 8);
                x51Var.h0.setVisibility(z10 ? 8 : 0);
                x51Var.E1 = null;
                if (!z10 && (arrayList2 = x51Var.A1) != null) {
                    arrayList2.clear();
                    ArrayList arrayList3 = x51Var.D1;
                    if (arrayList3 != null) {
                        arrayList3.clear();
                    }
                    x51Var.q0.E(false);
                }
                if (!z10 && (arrayList = x51Var.B1) != null) {
                    arrayList.clear();
                    break;
                }
                break;
            default:
                x51 x51Var2 = this.c;
                x51Var2.j0.setVisibility((this.b && x51Var2.i0.getVisibility() == 0) ? 0 : 8);
                x51Var2.H1 = null;
                break;
        }
    }
}
