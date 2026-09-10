package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class bj1 extends AnimatorListenerAdapter {
    public final /* synthetic */ org.telegram.ui.Cells.t1 a;
    public final /* synthetic */ org.telegram.ui.Components.xi b;
    public final /* synthetic */ cj1 c;

    public bj1(cj1 cj1Var, org.telegram.ui.Cells.t1 t1Var, org.telegram.ui.Components.xi xiVar) {
        this.c = cj1Var;
        this.a = t1Var;
        this.b = xiVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.setEnterTransitionInProgress(false);
        org.telegram.ui.Components.xi xiVar = this.b;
        ArrayList arrayList = (ArrayList) xiVar.c;
        cj1 cj1Var = this.c;
        arrayList.remove(cj1Var);
        xiVar.a();
        ((ViewGroup) xiVar.d).invalidate();
        ChatActivityEnterView.RecordCircle recordCircle = cj1Var.g;
        if (recordCircle != null) {
            recordCircle.N = false;
        }
    }
}
