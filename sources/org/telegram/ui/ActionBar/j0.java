package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class j0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ t0 c;

    public /* synthetic */ j0(t0 t0Var, ArrayList arrayList, int i10) {
        this.a = i10;
        this.c = t0Var;
        this.b = arrayList;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                t0 t0Var = this.c;
                t0Var.F.setAlpha(0.0f);
                int i10 = 0;
                while (true) {
                    ArrayList arrayList = this.b;
                    if (i10 >= arrayList.size()) {
                        t0Var.F.setVisibility(8);
                        break;
                    } else {
                        ((View) arrayList.get(i10)).setAlpha(1.0f);
                        i10++;
                    }
                }
            default:
                this.c.F.setAlpha(1.0f);
                int i11 = 0;
                while (true) {
                    ArrayList arrayList2 = this.b;
                    if (i11 >= arrayList2.size()) {
                        break;
                    } else {
                        ((View) arrayList2.get(i11)).setAlpha(0.0f);
                        i11++;
                    }
                }
        }
    }
}
