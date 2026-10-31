package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class c21 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ i31 c;

    public /* synthetic */ c21(i31 i31Var, boolean z10, int i10) {
        this.a = i10;
        this.c = i31Var;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ArrayList arrayList;
        ArrayList arrayList2;
        switch (this.a) {
            case 0:
                i31 i31Var = this.c;
                v11 v11Var = i31Var.i0;
                boolean z10 = this.b;
                v11Var.setVisibility(z10 ? 0 : 8);
                i31Var.h0.setVisibility(z10 ? 8 : 0);
                i31Var.F1 = null;
                if (!z10 && (arrayList2 = i31Var.B1) != null) {
                    arrayList2.clear();
                    ArrayList arrayList3 = i31Var.E1;
                    if (arrayList3 != null) {
                        arrayList3.clear();
                    }
                    i31Var.q0.E(false);
                }
                if (!z10 && (arrayList = i31Var.C1) != null) {
                    arrayList.clear();
                    break;
                }
                break;
            default:
                i31 i31Var2 = this.c;
                i31Var2.j0.setVisibility((this.b && i31Var2.i0.getVisibility() == 0) ? 0 : 8);
                i31Var2.I1 = null;
                break;
        }
    }
}
