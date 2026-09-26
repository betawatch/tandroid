package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class oi1 extends AnimatorListenerAdapter {
    public final /* synthetic */ org.telegram.ui.Cells.u1 a;
    public final /* synthetic */ org.telegram.ui.Components.vi b;
    public final /* synthetic */ pi1 c;

    public oi1(pi1 pi1Var, org.telegram.ui.Cells.u1 u1Var, org.telegram.ui.Components.vi viVar) {
        this.c = pi1Var;
        this.a = u1Var;
        this.b = viVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.setEnterTransitionInProgress(false);
        org.telegram.ui.Components.vi viVar = this.b;
        ArrayList arrayList = (ArrayList) viVar.c;
        pi1 pi1Var = this.c;
        arrayList.remove(pi1Var);
        viVar.a();
        ((ViewGroup) viVar.d).invalidate();
        ChatActivityEnterView.RecordCircle recordCircle = pi1Var.g;
        if (recordCircle != null) {
            recordCircle.N = false;
        }
    }
}
