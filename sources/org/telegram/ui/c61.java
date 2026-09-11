package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class c61 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ j71 c;

    public /* synthetic */ c61(j71 j71Var, boolean z10, int i10) {
        this.a = i10;
        this.c = j71Var;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ArrayList arrayList;
        ArrayList arrayList2;
        switch (this.a) {
            case 0:
                j71 j71Var = this.c;
                w51 w51Var = j71Var.i0;
                boolean z10 = this.b;
                w51Var.setVisibility(z10 ? 0 : 8);
                j71Var.h0.setVisibility(z10 ? 8 : 0);
                j71Var.E1 = null;
                if (!z10 && (arrayList2 = j71Var.A1) != null) {
                    arrayList2.clear();
                    ArrayList arrayList3 = j71Var.D1;
                    if (arrayList3 != null) {
                        arrayList3.clear();
                    }
                    j71Var.q0.E(false);
                }
                if (!z10 && (arrayList = j71Var.B1) != null) {
                    arrayList.clear();
                    break;
                }
                break;
            default:
                j71 j71Var2 = this.c;
                j71Var2.j0.setVisibility((this.b && j71Var2.i0.getVisibility() == 0) ? 0 : 8);
                j71Var2.H1 = null;
                break;
        }
    }
}
