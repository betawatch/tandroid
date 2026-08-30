package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class i51 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ q61 c;

    public /* synthetic */ i51(q61 q61Var, boolean z4, int i10) {
        this.a = i10;
        this.c = q61Var;
        this.b = z4;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ArrayList arrayList;
        ArrayList arrayList2;
        switch (this.a) {
            case 0:
                q61 q61Var = this.c;
                b51 b51Var = q61Var.f0;
                boolean z4 = this.b;
                b51Var.setVisibility(z4 ? 0 : 8);
                q61Var.e0.setVisibility(z4 ? 8 : 0);
                q61Var.B1 = null;
                if (!z4 && (arrayList2 = q61Var.x1) != null) {
                    arrayList2.clear();
                    ArrayList arrayList3 = q61Var.A1;
                    if (arrayList3 != null) {
                        arrayList3.clear();
                    }
                    q61Var.n0.E(false);
                }
                if (!z4 && (arrayList = q61Var.y1) != null) {
                    arrayList.clear();
                    break;
                }
                break;
            default:
                q61 q61Var2 = this.c;
                q61Var2.g0.setVisibility((this.b && q61Var2.f0.getVisibility() == 0) ? 0 : 8);
                q61Var2.E1 = null;
                break;
        }
    }
}
