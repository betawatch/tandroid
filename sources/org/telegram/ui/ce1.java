package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class ce1 extends AnimatorListenerAdapter {
    public final /* synthetic */ org.telegram.ui.Cells.q1 a;
    public final /* synthetic */ ih.e b;
    public final /* synthetic */ de1 c;

    public ce1(de1 de1Var, org.telegram.ui.Cells.q1 q1Var, ih.e eVar) {
        this.c = de1Var;
        this.a = q1Var;
        this.b = eVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.setEnterTransitionInProgress(false);
        ih.e eVar = this.b;
        ArrayList arrayList = (ArrayList) eVar.c;
        de1 de1Var = this.c;
        arrayList.remove(de1Var);
        eVar.a();
        ((ViewGroup) eVar.d).invalidate();
        ChatActivityEnterView.RecordCircle recordCircle = de1Var.g;
        if (recordCircle != null) {
            recordCircle.N = false;
        }
    }
}
