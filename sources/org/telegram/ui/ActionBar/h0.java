package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class h0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ q0 c;

    public /* synthetic */ h0(q0 q0Var, ArrayList arrayList, int i7) {
        this.a = i7;
        this.c = q0Var;
        this.b = arrayList;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                q0 q0Var = this.c;
                q0Var.G.setAlpha(0.0f);
                int i7 = 0;
                while (true) {
                    ArrayList arrayList = this.b;
                    if (i7 >= arrayList.size()) {
                        q0Var.G.setVisibility(8);
                        break;
                    } else {
                        ((View) arrayList.get(i7)).setAlpha(1.0f);
                        i7++;
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
