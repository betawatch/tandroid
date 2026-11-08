package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class hc1 extends AnimatorListenerAdapter {
    public final /* synthetic */ org.telegram.ui.Cells.q1 a;
    public final /* synthetic */ org.telegram.ui.Components.ci b;
    public final /* synthetic */ ic1 c;

    public hc1(ic1 ic1Var, org.telegram.ui.Cells.q1 q1Var, org.telegram.ui.Components.ci ciVar) {
        this.c = ic1Var;
        this.a = q1Var;
        this.b = ciVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.setEnterTransitionInProgress(false);
        org.telegram.ui.Components.ci ciVar = this.b;
        ArrayList arrayList = (ArrayList) ciVar.c;
        ic1 ic1Var = this.c;
        arrayList.remove(ic1Var);
        ciVar.a();
        ((ViewGroup) ciVar.d).invalidate();
        ChatActivityEnterView.RecordCircle recordCircle = ic1Var.g;
        if (recordCircle != null) {
            recordCircle.N = false;
        }
    }
}
