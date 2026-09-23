package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class oi1 extends AnimatorListenerAdapter {
    public final /* synthetic */ org.telegram.ui.Cells.t1 a;
    public final /* synthetic */ org.telegram.ui.Components.vi b;
    public final /* synthetic */ pi1 c;

    public oi1(pi1 pi1Var, org.telegram.ui.Cells.t1 t1Var, org.telegram.ui.Components.vi viVar) {
        this.c = pi1Var;
        this.a = t1Var;
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
