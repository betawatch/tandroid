package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class jc1 extends AnimatorListenerAdapter {
    public final /* synthetic */ org.telegram.ui.Cells.q1 a;
    public final /* synthetic */ org.telegram.ui.Components.ri b;
    public final /* synthetic */ kc1 c;

    public jc1(kc1 kc1Var, org.telegram.ui.Cells.q1 q1Var, org.telegram.ui.Components.ri riVar) {
        this.c = kc1Var;
        this.a = q1Var;
        this.b = riVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.setEnterTransitionInProgress(false);
        org.telegram.ui.Components.ri riVar = this.b;
        ArrayList arrayList = (ArrayList) riVar.c;
        kc1 kc1Var = this.c;
        arrayList.remove(kc1Var);
        riVar.a();
        ((ViewGroup) riVar.d).invalidate();
        ChatActivityEnterView.RecordCircle recordCircle = kc1Var.g;
        if (recordCircle != null) {
            recordCircle.O = false;
        }
    }
}
