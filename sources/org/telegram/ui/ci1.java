package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class ci1 extends AnimatorListenerAdapter {
    public final /* synthetic */ org.telegram.ui.Cells.t1 a;
    public final /* synthetic */ org.telegram.ui.Components.ki b;
    public final /* synthetic */ di1 c;

    public ci1(di1 di1Var, org.telegram.ui.Cells.t1 t1Var, org.telegram.ui.Components.ki kiVar) {
        this.c = di1Var;
        this.a = t1Var;
        this.b = kiVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.setEnterTransitionInProgress(false);
        org.telegram.ui.Components.ki kiVar = this.b;
        ArrayList arrayList = (ArrayList) kiVar.c;
        di1 di1Var = this.c;
        arrayList.remove(di1Var);
        kiVar.a();
        ((ViewGroup) kiVar.d).invalidate();
        ChatActivityEnterView.RecordCircle recordCircle = di1Var.g;
        if (recordCircle != null) {
            recordCircle.K = false;
        }
    }
}
