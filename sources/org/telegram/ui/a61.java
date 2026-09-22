package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class a61 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ h71 c;

    public /* synthetic */ a61(h71 h71Var, boolean z10, int i10) {
        this.a = i10;
        this.c = h71Var;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ArrayList arrayList;
        ArrayList arrayList2;
        switch (this.a) {
            case 0:
                h71 h71Var = this.c;
                u51 u51Var = h71Var.i0;
                boolean z10 = this.b;
                u51Var.setVisibility(z10 ? 0 : 8);
                h71Var.h0.setVisibility(z10 ? 8 : 0);
                h71Var.E1 = null;
                if (!z10 && (arrayList2 = h71Var.A1) != null) {
                    arrayList2.clear();
                    ArrayList arrayList3 = h71Var.D1;
                    if (arrayList3 != null) {
                        arrayList3.clear();
                    }
                    h71Var.q0.E(false);
                }
                if (!z10 && (arrayList = h71Var.B1) != null) {
                    arrayList.clear();
                    break;
                }
                break;
            default:
                h71 h71Var2 = this.c;
                h71Var2.j0.setVisibility((this.b && h71Var2.i0.getVisibility() == 0) ? 0 : 8);
                h71Var2.H1 = null;
                break;
        }
    }
}
