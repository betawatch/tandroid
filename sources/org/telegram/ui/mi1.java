package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class mi1 extends AnimatorListenerAdapter {
    public final /* synthetic */ org.telegram.ui.Cells.u1 a;
    public final /* synthetic */ org.telegram.ui.Components.wi b;
    public final /* synthetic */ ni1 c;

    public mi1(ni1 ni1Var, org.telegram.ui.Cells.u1 u1Var, org.telegram.ui.Components.wi wiVar) {
        this.c = ni1Var;
        this.a = u1Var;
        this.b = wiVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.setEnterTransitionInProgress(false);
        org.telegram.ui.Components.wi wiVar = this.b;
        ArrayList arrayList = (ArrayList) wiVar.c;
        ni1 ni1Var = this.c;
        arrayList.remove(ni1Var);
        wiVar.a();
        ((ViewGroup) wiVar.d).invalidate();
        ChatActivityEnterView.RecordCircle recordCircle = ni1Var.g;
        if (recordCircle != null) {
            recordCircle.N = false;
        }
    }
}
