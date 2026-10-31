package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ee1 extends AnimatorListenerAdapter {
    public final /* synthetic */ org.telegram.ui.Cells.q1 a;
    public final /* synthetic */ ih.e b;
    public final /* synthetic */ fe1 c;

    public ee1(fe1 fe1Var, org.telegram.ui.Cells.q1 q1Var, ih.e eVar) {
        this.c = fe1Var;
        this.a = q1Var;
        this.b = eVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.setEnterTransitionInProgress(false);
        ih.e eVar = this.b;
        ArrayList arrayList = (ArrayList) eVar.c;
        fe1 fe1Var = this.c;
        arrayList.remove(fe1Var);
        eVar.a();
        ((ViewGroup) eVar.d).invalidate();
        ChatActivityEnterView.RecordCircle recordCircle = fe1Var.g;
        if (recordCircle != null) {
            recordCircle.N = false;
        }
    }
}
