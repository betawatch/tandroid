package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class gc1 extends AnimatorListenerAdapter {
    public final /* synthetic */ org.telegram.ui.Cells.q1 a;
    public final /* synthetic */ org.telegram.ui.Components.ji b;
    public final /* synthetic */ hc1 c;

    public gc1(hc1 hc1Var, org.telegram.ui.Cells.q1 q1Var, org.telegram.ui.Components.ji jiVar) {
        this.c = hc1Var;
        this.a = q1Var;
        this.b = jiVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.setEnterTransitionInProgress(false);
        org.telegram.ui.Components.ji jiVar = this.b;
        ArrayList arrayList = (ArrayList) jiVar.c;
        hc1 hc1Var = this.c;
        arrayList.remove(hc1Var);
        jiVar.a();
        ((ViewGroup) jiVar.d).invalidate();
        ChatActivityEnterView.RecordCircle recordCircle = hc1Var.g;
        if (recordCircle != null) {
            recordCircle.O = false;
        }
    }
}
