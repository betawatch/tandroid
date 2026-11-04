package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class g0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ q0 c;

    public /* synthetic */ g0(q0 q0Var, ArrayList arrayList, int i3) {
        this.a = i3;
        this.c = q0Var;
        this.b = arrayList;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                q0 q0Var = this.c;
                q0Var.G.setAlpha(0.0f);
                int i3 = 0;
                while (true) {
                    ArrayList arrayList = this.b;
                    if (i3 >= arrayList.size()) {
                        q0Var.G.setVisibility(8);
                        break;
                    } else {
                        ((View) arrayList.get(i3)).setAlpha(1.0f);
                        i3++;
                    }
                }
            default:
                this.c.G.setAlpha(1.0f);
                int i10 = 0;
                while (true) {
                    ArrayList arrayList2 = this.b;
                    if (i10 >= arrayList2.size()) {
                        break;
                    } else {
                        ((View) arrayList2.get(i10)).setAlpha(0.0f);
                        i10++;
                    }
                }
        }
    }
}
