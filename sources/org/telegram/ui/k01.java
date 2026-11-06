package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class k01 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ q11 c;

    public /* synthetic */ k01(q11 q11Var, boolean z9, int i7) {
        this.a = i7;
        this.c = q11Var;
        this.b = z9;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ArrayList arrayList;
        ArrayList arrayList2;
        switch (this.a) {
            case 0:
                q11 q11Var = this.c;
                e01 e01Var = q11Var.i0;
                boolean z9 = this.b;
                e01Var.setVisibility(z9 ? 0 : 8);
                q11Var.h0.setVisibility(z9 ? 8 : 0);
                q11Var.F1 = null;
                if (!z9 && (arrayList2 = q11Var.B1) != null) {
                    arrayList2.clear();
                    ArrayList arrayList3 = q11Var.E1;
                    if (arrayList3 != null) {
                        arrayList3.clear();
                    }
                    q11Var.q0.E(false);
                }
                if (!z9 && (arrayList = q11Var.C1) != null) {
                    arrayList.clear();
                    break;
                }
                break;
            default:
                q11 q11Var2 = this.c;
                q11Var2.j0.setVisibility((this.b && q11Var2.i0.getVisibility() == 0) ? 0 : 8);
                q11Var2.I1 = null;
                break;
        }
    }
}
