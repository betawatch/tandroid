package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class p51 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ w61 c;

    public /* synthetic */ p51(w61 w61Var, boolean z4, int i10) {
        this.a = i10;
        this.c = w61Var;
        this.b = z4;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ArrayList arrayList;
        ArrayList arrayList2;
        switch (this.a) {
            case 0:
                w61 w61Var = this.c;
                i51 i51Var = w61Var.f0;
                boolean z4 = this.b;
                i51Var.setVisibility(z4 ? 0 : 8);
                w61Var.e0.setVisibility(z4 ? 8 : 0);
                w61Var.B1 = null;
                if (!z4 && (arrayList2 = w61Var.x1) != null) {
                    arrayList2.clear();
                    ArrayList arrayList3 = w61Var.A1;
                    if (arrayList3 != null) {
                        arrayList3.clear();
                    }
                    w61Var.n0.E(false);
                }
                if (!z4 && (arrayList = w61Var.y1) != null) {
                    arrayList.clear();
                    break;
                }
                break;
            default:
                w61 w61Var2 = this.c;
                w61Var2.g0.setVisibility((this.b && w61Var2.f0.getVisibility() == 0) ? 0 : 8);
                w61Var2.E1 = null;
                break;
        }
    }
}
