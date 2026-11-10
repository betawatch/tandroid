package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class lc1 extends AnimatorListenerAdapter {
    public final /* synthetic */ org.telegram.ui.Cells.q1 a;
    public final /* synthetic */ org.telegram.ui.Components.bi b;
    public final /* synthetic */ mc1 c;

    public lc1(mc1 mc1Var, org.telegram.ui.Cells.q1 q1Var, org.telegram.ui.Components.bi biVar) {
        this.c = mc1Var;
        this.a = q1Var;
        this.b = biVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.setEnterTransitionInProgress(false);
        org.telegram.ui.Components.bi biVar = this.b;
        ArrayList arrayList = (ArrayList) biVar.c;
        mc1 mc1Var = this.c;
        arrayList.remove(mc1Var);
        biVar.a();
        ((ViewGroup) biVar.d).invalidate();
        ChatActivityEnterView.RecordCircle recordCircle = mc1Var.g;
        if (recordCircle != null) {
            recordCircle.N = false;
        }
    }
}
