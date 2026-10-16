package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class ej1 extends AnimatorListenerAdapter {
    public final /* synthetic */ org.telegram.ui.Cells.u1 a;
    public final /* synthetic */ org.telegram.ui.Components.ui b;
    public final /* synthetic */ fj1 c;

    public ej1(fj1 fj1Var, org.telegram.ui.Cells.u1 u1Var, org.telegram.ui.Components.ui uiVar) {
        this.c = fj1Var;
        this.a = u1Var;
        this.b = uiVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.setEnterTransitionInProgress(false);
        org.telegram.ui.Components.ui uiVar = this.b;
        ArrayList arrayList = (ArrayList) uiVar.c;
        fj1 fj1Var = this.c;
        arrayList.remove(fj1Var);
        uiVar.a();
        ((ViewGroup) uiVar.d).invalidate();
        ChatActivityEnterView.RecordCircle recordCircle = fj1Var.g;
        if (recordCircle != null) {
            recordCircle.N = false;
        }
    }
}
