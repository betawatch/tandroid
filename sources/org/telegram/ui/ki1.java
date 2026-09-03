package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class ki1 extends AnimatorListenerAdapter {
    public final /* synthetic */ org.telegram.ui.Cells.s1 a;
    public final /* synthetic */ org.telegram.ui.Components.ki b;
    public final /* synthetic */ li1 c;

    public ki1(li1 li1Var, org.telegram.ui.Cells.s1 s1Var, org.telegram.ui.Components.ki kiVar) {
        this.c = li1Var;
        this.a = s1Var;
        this.b = kiVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.setEnterTransitionInProgress(false);
        org.telegram.ui.Components.ki kiVar = this.b;
        ArrayList arrayList = (ArrayList) kiVar.c;
        li1 li1Var = this.c;
        arrayList.remove(li1Var);
        kiVar.a();
        ((ViewGroup) kiVar.d).invalidate();
        ChatActivityEnterView.RecordCircle recordCircle = li1Var.g;
        if (recordCircle != null) {
            recordCircle.K = false;
        }
    }
}
