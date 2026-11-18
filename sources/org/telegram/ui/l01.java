package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class l01 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ r11 c;

    public /* synthetic */ l01(r11 r11Var, boolean z10, int i7) {
        this.a = i7;
        this.c = r11Var;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ArrayList arrayList;
        ArrayList arrayList2;
        switch (this.a) {
            case 0:
                r11 r11Var = this.c;
                f01 f01Var = r11Var.j0;
                boolean z10 = this.b;
                f01Var.setVisibility(z10 ? 0 : 8);
                r11Var.i0.setVisibility(z10 ? 8 : 0);
                r11Var.G1 = null;
                if (!z10 && (arrayList2 = r11Var.C1) != null) {
                    arrayList2.clear();
                    ArrayList arrayList3 = r11Var.F1;
                    if (arrayList3 != null) {
                        arrayList3.clear();
                    }
                    r11Var.r0.E(false);
                }
                if (!z10 && (arrayList = r11Var.D1) != null) {
                    arrayList.clear();
                    break;
                }
                break;
            default:
                r11 r11Var2 = this.c;
                r11Var2.k0.setVisibility((this.b && r11Var2.j0.getVisibility() == 0) ? 0 : 8);
                r11Var2.J1 = null;
                break;
        }
    }
}
