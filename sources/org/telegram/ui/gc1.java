package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class gc1 extends AnimatorListenerAdapter {
    public final /* synthetic */ org.telegram.ui.Cells.q1 a;
    public final /* synthetic */ org.telegram.ui.Components.ci b;
    public final /* synthetic */ hc1 c;

    public gc1(hc1 hc1Var, org.telegram.ui.Cells.q1 q1Var, org.telegram.ui.Components.ci ciVar) {
        this.c = hc1Var;
        this.a = q1Var;
        this.b = ciVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.setEnterTransitionInProgress(false);
        org.telegram.ui.Components.ci ciVar = this.b;
        ArrayList arrayList = (ArrayList) ciVar.c;
        hc1 hc1Var = this.c;
        arrayList.remove(hc1Var);
        ciVar.a();
        ((ViewGroup) ciVar.d).invalidate();
        ChatActivityEnterView.RecordCircle recordCircle = hc1Var.g;
        if (recordCircle != null) {
            recordCircle.N = false;
        }
    }
}
