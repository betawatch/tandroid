package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class ei1 extends AnimatorListenerAdapter {
    public final /* synthetic */ org.telegram.ui.Cells.t1 a;
    public final /* synthetic */ org.telegram.ui.Components.li b;
    public final /* synthetic */ fi1 c;

    public ei1(fi1 fi1Var, org.telegram.ui.Cells.t1 t1Var, org.telegram.ui.Components.li liVar) {
        this.c = fi1Var;
        this.a = t1Var;
        this.b = liVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.setEnterTransitionInProgress(false);
        org.telegram.ui.Components.li liVar = this.b;
        ArrayList arrayList = (ArrayList) liVar.c;
        fi1 fi1Var = this.c;
        arrayList.remove(fi1Var);
        liVar.a();
        ((ViewGroup) liVar.d).invalidate();
        ChatActivityEnterView.RecordCircle recordCircle = fi1Var.g;
        if (recordCircle != null) {
            recordCircle.K = false;
        }
    }
}
