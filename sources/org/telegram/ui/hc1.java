package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class hc1 extends AnimatorListenerAdapter {
    public final /* synthetic */ org.telegram.ui.Cells.r1 a;
    public final /* synthetic */ org.telegram.ui.Components.si b;
    public final /* synthetic */ ic1 c;

    public hc1(ic1 ic1Var, org.telegram.ui.Cells.r1 r1Var, org.telegram.ui.Components.si siVar) {
        this.c = ic1Var;
        this.a = r1Var;
        this.b = siVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.setEnterTransitionInProgress(false);
        org.telegram.ui.Components.si siVar = this.b;
        ArrayList arrayList = (ArrayList) siVar.c;
        ic1 ic1Var = this.c;
        arrayList.remove(ic1Var);
        siVar.a();
        ((ViewGroup) siVar.d).invalidate();
        ChatActivityEnterView.RecordCircle recordCircle = ic1Var.g;
        if (recordCircle != null) {
            recordCircle.O = false;
        }
    }
}
