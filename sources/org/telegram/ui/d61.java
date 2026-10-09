package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class d61 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ k71 c;

    public /* synthetic */ d61(k71 k71Var, boolean z10, int i10) {
        this.a = i10;
        this.c = k71Var;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ArrayList arrayList;
        ArrayList arrayList2;
        switch (this.a) {
            case 0:
                k71 k71Var = this.c;
                x51 x51Var = k71Var.i0;
                boolean z10 = this.b;
                x51Var.setVisibility(z10 ? 0 : 8);
                k71Var.h0.setVisibility(z10 ? 8 : 0);
                k71Var.E1 = null;
                if (!z10 && (arrayList2 = k71Var.A1) != null) {
                    arrayList2.clear();
                    ArrayList arrayList3 = k71Var.D1;
                    if (arrayList3 != null) {
                        arrayList3.clear();
                    }
                    k71Var.q0.E(false);
                }
                if (!z10 && (arrayList = k71Var.B1) != null) {
                    arrayList.clear();
                    break;
                }
                break;
            default:
                k71 k71Var2 = this.c;
                k71Var2.j0.setVisibility((this.b && k71Var2.i0.getVisibility() == 0) ? 0 : 8);
                k71Var2.H1 = null;
                break;
        }
    }
}
