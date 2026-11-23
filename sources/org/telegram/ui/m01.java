package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class m01 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ s11 c;

    public /* synthetic */ m01(s11 s11Var, boolean z10, int i7) {
        this.a = i7;
        this.c = s11Var;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ArrayList arrayList;
        ArrayList arrayList2;
        switch (this.a) {
            case 0:
                s11 s11Var = this.c;
                g01 g01Var = s11Var.j0;
                boolean z10 = this.b;
                g01Var.setVisibility(z10 ? 0 : 8);
                s11Var.i0.setVisibility(z10 ? 8 : 0);
                s11Var.G1 = null;
                if (!z10 && (arrayList2 = s11Var.C1) != null) {
                    arrayList2.clear();
                    ArrayList arrayList3 = s11Var.F1;
                    if (arrayList3 != null) {
                        arrayList3.clear();
                    }
                    s11Var.r0.E(false);
                }
                if (!z10 && (arrayList = s11Var.D1) != null) {
                    arrayList.clear();
                    break;
                }
                break;
            default:
                s11 s11Var2 = this.c;
                s11Var2.k0.setVisibility((this.b && s11Var2.j0.getVisibility() == 0) ? 0 : 8);
                s11Var2.J1 = null;
                break;
        }
    }
}
