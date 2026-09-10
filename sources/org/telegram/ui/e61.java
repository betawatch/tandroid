package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class e61 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ l71 c;

    public /* synthetic */ e61(l71 l71Var, boolean z10, int i10) {
        this.a = i10;
        this.c = l71Var;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ArrayList arrayList;
        ArrayList arrayList2;
        switch (this.a) {
            case 0:
                l71 l71Var = this.c;
                y51 y51Var = l71Var.i0;
                boolean z10 = this.b;
                y51Var.setVisibility(z10 ? 0 : 8);
                l71Var.h0.setVisibility(z10 ? 8 : 0);
                l71Var.E1 = null;
                if (!z10 && (arrayList2 = l71Var.A1) != null) {
                    arrayList2.clear();
                    ArrayList arrayList3 = l71Var.D1;
                    if (arrayList3 != null) {
                        arrayList3.clear();
                    }
                    l71Var.q0.E(false);
                }
                if (!z10 && (arrayList = l71Var.B1) != null) {
                    arrayList.clear();
                    break;
                }
                break;
            default:
                l71 l71Var2 = this.c;
                l71Var2.j0.setVisibility((this.b && l71Var2.i0.getVisibility() == 0) ? 0 : 8);
                l71Var2.H1 = null;
                break;
        }
    }
}
