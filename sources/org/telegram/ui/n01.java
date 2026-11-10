package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class n01 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ t11 c;

    public /* synthetic */ n01(t11 t11Var, boolean z9, int i7) {
        this.a = i7;
        this.c = t11Var;
        this.b = z9;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ArrayList arrayList;
        ArrayList arrayList2;
        switch (this.a) {
            case 0:
                t11 t11Var = this.c;
                h01 h01Var = t11Var.i0;
                boolean z9 = this.b;
                h01Var.setVisibility(z9 ? 0 : 8);
                t11Var.h0.setVisibility(z9 ? 8 : 0);
                t11Var.F1 = null;
                if (!z9 && (arrayList2 = t11Var.B1) != null) {
                    arrayList2.clear();
                    ArrayList arrayList3 = t11Var.E1;
                    if (arrayList3 != null) {
                        arrayList3.clear();
                    }
                    t11Var.q0.E(false);
                }
                if (!z9 && (arrayList = t11Var.C1) != null) {
                    arrayList.clear();
                    break;
                }
                break;
            default:
                t11 t11Var2 = this.c;
                t11Var2.j0.setVisibility((this.b && t11Var2.i0.getVisibility() == 0) ? 0 : 8);
                t11Var2.I1 = null;
                break;
        }
    }
}
