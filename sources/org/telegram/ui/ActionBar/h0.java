package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class h0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ r0 c;

    public /* synthetic */ h0(r0 r0Var, ArrayList arrayList, int i7) {
        this.a = i7;
        this.c = r0Var;
        this.b = arrayList;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                r0 r0Var = this.c;
                r0Var.F.setAlpha(0.0f);
                int i7 = 0;
                while (true) {
                    ArrayList arrayList = this.b;
                    if (i7 >= arrayList.size()) {
                        r0Var.F.setVisibility(8);
                        break;
                    } else {
                        ((View) arrayList.get(i7)).setAlpha(1.0f);
                        i7++;
                    }
                }
            default:
                this.c.F.setAlpha(1.0f);
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
