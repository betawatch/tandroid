package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class ki1 extends AnimatorListenerAdapter {
    public final /* synthetic */ org.telegram.ui.Cells.t1 a;
    public final /* synthetic */ org.telegram.ui.Components.li b;
    public final /* synthetic */ li1 c;

    public ki1(li1 li1Var, org.telegram.ui.Cells.t1 t1Var, org.telegram.ui.Components.li liVar) {
        this.c = li1Var;
        this.a = t1Var;
        this.b = liVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.setEnterTransitionInProgress(false);
        org.telegram.ui.Components.li liVar = this.b;
        ArrayList arrayList = (ArrayList) liVar.c;
        li1 li1Var = this.c;
        arrayList.remove(li1Var);
        liVar.a();
        ((ViewGroup) liVar.d).invalidate();
        ChatActivityEnterView.RecordCircle recordCircle = li1Var.g;
        if (recordCircle != null) {
            recordCircle.K = false;
        }
    }
}
