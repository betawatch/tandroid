package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class a01 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ g11 c;

    public /* synthetic */ a01(g11 g11Var, boolean z10, int i3) {
        this.a = i3;
        this.c = g11Var;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ArrayList arrayList;
        ArrayList arrayList2;
        switch (this.a) {
            case 0:
                g11 g11Var = this.c;
                uz0 uz0Var = g11Var.j0;
                boolean z10 = this.b;
                uz0Var.setVisibility(z10 ? 0 : 8);
                g11Var.i0.setVisibility(z10 ? 8 : 0);
                g11Var.G1 = null;
                if (!z10 && (arrayList2 = g11Var.C1) != null) {
                    arrayList2.clear();
                    ArrayList arrayList3 = g11Var.F1;
                    if (arrayList3 != null) {
                        arrayList3.clear();
                    }
                    g11Var.r0.E(false);
                }
                if (!z10 && (arrayList = g11Var.D1) != null) {
                    arrayList.clear();
                    break;
                }
                break;
            default:
                g11 g11Var2 = this.c;
                g11Var2.k0.setVisibility((this.b && g11Var2.j0.getVisibility() == 0) ? 0 : 8);
                g11Var2.J1 = null;
                break;
        }
    }
}
