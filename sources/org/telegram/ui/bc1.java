package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class bc1 extends AnimatorListenerAdapter {
    public final /* synthetic */ org.telegram.ui.Cells.q1 a;
    public final /* synthetic */ org.telegram.ui.Components.ai b;
    public final /* synthetic */ cc1 c;

    public bc1(cc1 cc1Var, org.telegram.ui.Cells.q1 q1Var, org.telegram.ui.Components.ai aiVar) {
        this.c = cc1Var;
        this.a = q1Var;
        this.b = aiVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.setEnterTransitionInProgress(false);
        org.telegram.ui.Components.ai aiVar = this.b;
        ArrayList arrayList = (ArrayList) aiVar.c;
        cc1 cc1Var = this.c;
        arrayList.remove(cc1Var);
        aiVar.a();
        ((ViewGroup) aiVar.d).invalidate();
        ChatActivityEnterView.RecordCircle recordCircle = cc1Var.g;
        if (recordCircle != null) {
            recordCircle.O = false;
        }
    }
}
