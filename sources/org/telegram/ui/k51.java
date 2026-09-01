package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class k51 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ r61 c;

    public /* synthetic */ k51(r61 r61Var, boolean z4, int i10) {
        this.a = i10;
        this.c = r61Var;
        this.b = z4;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ArrayList arrayList;
        ArrayList arrayList2;
        switch (this.a) {
            case 0:
                r61 r61Var = this.c;
                d51 d51Var = r61Var.f0;
                boolean z4 = this.b;
                d51Var.setVisibility(z4 ? 0 : 8);
                r61Var.e0.setVisibility(z4 ? 8 : 0);
                r61Var.B1 = null;
                if (!z4 && (arrayList2 = r61Var.x1) != null) {
                    arrayList2.clear();
                    ArrayList arrayList3 = r61Var.A1;
                    if (arrayList3 != null) {
                        arrayList3.clear();
                    }
                    r61Var.n0.E(false);
                }
                if (!z4 && (arrayList = r61Var.y1) != null) {
                    arrayList.clear();
                    break;
                }
                break;
            default:
                r61 r61Var2 = this.c;
                r61Var2.g0.setVisibility((this.b && r61Var2.f0.getVisibility() == 0) ? 0 : 8);
                r61Var2.E1 = null;
                break;
        }
    }
}
