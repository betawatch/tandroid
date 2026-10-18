package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class lh1 extends AnimatorListenerAdapter {
    public final /* synthetic */ org.telegram.ui.Cells.u1 a;
    public final /* synthetic */ org.telegram.ui.Components.si b;
    public final /* synthetic */ mh1 c;

    public lh1(mh1 mh1Var, org.telegram.ui.Cells.u1 u1Var, org.telegram.ui.Components.si siVar) {
        this.c = mh1Var;
        this.a = u1Var;
        this.b = siVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.setEnterTransitionInProgress(false);
        org.telegram.ui.Components.si siVar = this.b;
        ArrayList arrayList = (ArrayList) siVar.c;
        mh1 mh1Var = this.c;
        arrayList.remove(mh1Var);
        siVar.a();
        ((ViewGroup) siVar.d).invalidate();
        ChatActivityEnterView.RecordCircle recordCircle = mh1Var.g;
        if (recordCircle != null) {
            recordCircle.N = false;
        }
    }
}
