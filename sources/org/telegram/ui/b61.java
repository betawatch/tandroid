package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class b61 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ i71 c;

    public /* synthetic */ b61(i71 i71Var, boolean z10, int i10) {
        this.a = i10;
        this.c = i71Var;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ArrayList arrayList;
        ArrayList arrayList2;
        switch (this.a) {
            case 0:
                i71 i71Var = this.c;
                v51 v51Var = i71Var.i0;
                boolean z10 = this.b;
                v51Var.setVisibility(z10 ? 0 : 8);
                i71Var.h0.setVisibility(z10 ? 8 : 0);
                i71Var.E1 = null;
                if (!z10 && (arrayList2 = i71Var.A1) != null) {
                    arrayList2.clear();
                    ArrayList arrayList3 = i71Var.D1;
                    if (arrayList3 != null) {
                        arrayList3.clear();
                    }
                    i71Var.q0.E(false);
                }
                if (!z10 && (arrayList = i71Var.B1) != null) {
                    arrayList.clear();
                    break;
                }
                break;
            default:
                i71 i71Var2 = this.c;
                i71Var2.j0.setVisibility((this.b && i71Var2.i0.getVisibility() == 0) ? 0 : 8);
                i71Var2.H1 = null;
                break;
        }
    }
}
