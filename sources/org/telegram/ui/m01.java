package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class m01 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ s11 c;

    public /* synthetic */ m01(s11 s11Var, boolean z9, int i7) {
        this.a = i7;
        this.c = s11Var;
        this.b = z9;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ArrayList arrayList;
        ArrayList arrayList2;
        switch (this.a) {
            case 0:
                s11 s11Var = this.c;
                g01 g01Var = s11Var.i0;
                boolean z9 = this.b;
                g01Var.setVisibility(z9 ? 0 : 8);
                s11Var.h0.setVisibility(z9 ? 8 : 0);
                s11Var.F1 = null;
                if (!z9 && (arrayList2 = s11Var.B1) != null) {
                    arrayList2.clear();
                    ArrayList arrayList3 = s11Var.E1;
                    if (arrayList3 != null) {
                        arrayList3.clear();
                    }
                    s11Var.q0.E(false);
                }
                if (!z9 && (arrayList = s11Var.C1) != null) {
                    arrayList.clear();
                    break;
                }
                break;
            default:
                s11 s11Var2 = this.c;
                s11Var2.j0.setVisibility((this.b && s11Var2.i0.getVisibility() == 0) ? 0 : 8);
                s11Var2.I1 = null;
                break;
        }
    }
}
