package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class a21 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ g31 c;

    public /* synthetic */ a21(g31 g31Var, boolean z10, int i10) {
        this.a = i10;
        this.c = g31Var;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ArrayList arrayList;
        ArrayList arrayList2;
        switch (this.a) {
            case 0:
                g31 g31Var = this.c;
                t11 t11Var = g31Var.i0;
                boolean z10 = this.b;
                t11Var.setVisibility(z10 ? 0 : 8);
                g31Var.h0.setVisibility(z10 ? 8 : 0);
                g31Var.F1 = null;
                if (!z10 && (arrayList2 = g31Var.B1) != null) {
                    arrayList2.clear();
                    ArrayList arrayList3 = g31Var.E1;
                    if (arrayList3 != null) {
                        arrayList3.clear();
                    }
                    g31Var.q0.E(false);
                }
                if (!z10 && (arrayList = g31Var.C1) != null) {
                    arrayList.clear();
                    break;
                }
                break;
            default:
                g31 g31Var2 = this.c;
                g31Var2.j0.setVisibility((this.b && g31Var2.i0.getVisibility() == 0) ? 0 : 8);
                g31Var2.I1 = null;
                break;
        }
    }
}
