package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class p51 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ x61 c;

    public /* synthetic */ p51(x61 x61Var, boolean z4, int i10) {
        this.a = i10;
        this.c = x61Var;
        this.b = z4;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ArrayList arrayList;
        ArrayList arrayList2;
        switch (this.a) {
            case 0:
                x61 x61Var = this.c;
                i51 i51Var = x61Var.f0;
                boolean z4 = this.b;
                i51Var.setVisibility(z4 ? 0 : 8);
                x61Var.e0.setVisibility(z4 ? 8 : 0);
                x61Var.B1 = null;
                if (!z4 && (arrayList2 = x61Var.x1) != null) {
                    arrayList2.clear();
                    ArrayList arrayList3 = x61Var.A1;
                    if (arrayList3 != null) {
                        arrayList3.clear();
                    }
                    x61Var.n0.E(false);
                }
                if (!z4 && (arrayList = x61Var.y1) != null) {
                    arrayList.clear();
                    break;
                }
                break;
            default:
                x61 x61Var2 = this.c;
                x61Var2.g0.setVisibility((this.b && x61Var2.f0.getVisibility() == 0) ? 0 : 8);
                x61Var2.E1 = null;
                break;
        }
    }
}
