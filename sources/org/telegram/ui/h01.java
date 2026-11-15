package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class h01 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ n11 c;

    public /* synthetic */ h01(n11 n11Var, boolean z10, int i7) {
        this.a = i7;
        this.c = n11Var;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ArrayList arrayList;
        ArrayList arrayList2;
        switch (this.a) {
            case 0:
                n11 n11Var = this.c;
                b01 b01Var = n11Var.j0;
                boolean z10 = this.b;
                b01Var.setVisibility(z10 ? 0 : 8);
                n11Var.i0.setVisibility(z10 ? 8 : 0);
                n11Var.G1 = null;
                if (!z10 && (arrayList2 = n11Var.C1) != null) {
                    arrayList2.clear();
                    ArrayList arrayList3 = n11Var.F1;
                    if (arrayList3 != null) {
                        arrayList3.clear();
                    }
                    n11Var.r0.E(false);
                }
                if (!z10 && (arrayList = n11Var.D1) != null) {
                    arrayList.clear();
                    break;
                }
                break;
            default:
                n11 n11Var2 = this.c;
                n11Var2.k0.setVisibility((this.b && n11Var2.j0.getVisibility() == 0) ? 0 : 8);
                n11Var2.J1 = null;
                break;
        }
    }
}
