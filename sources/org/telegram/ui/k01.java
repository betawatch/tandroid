package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class k01 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ q11 c;

    public /* synthetic */ k01(q11 q11Var, boolean z10, int i7) {
        this.a = i7;
        this.c = q11Var;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ArrayList arrayList;
        ArrayList arrayList2;
        switch (this.a) {
            case 0:
                q11 q11Var = this.c;
                e01 e01Var = q11Var.j0;
                boolean z10 = this.b;
                e01Var.setVisibility(z10 ? 0 : 8);
                q11Var.i0.setVisibility(z10 ? 8 : 0);
                q11Var.G1 = null;
                if (!z10 && (arrayList2 = q11Var.C1) != null) {
                    arrayList2.clear();
                    ArrayList arrayList3 = q11Var.F1;
                    if (arrayList3 != null) {
                        arrayList3.clear();
                    }
                    q11Var.r0.E(false);
                }
                if (!z10 && (arrayList = q11Var.D1) != null) {
                    arrayList.clear();
                    break;
                }
                break;
            default:
                q11 q11Var2 = this.c;
                q11Var2.k0.setVisibility((this.b && q11Var2.j0.getVisibility() == 0) ? 0 : 8);
                q11Var2.J1 = null;
                break;
        }
    }
}
