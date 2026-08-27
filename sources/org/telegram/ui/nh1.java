package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class nh1 extends AnimatorListenerAdapter {
    public final /* synthetic */ org.telegram.ui.Cells.s1 a;
    public final /* synthetic */ org.telegram.ui.Components.fi b;
    public final /* synthetic */ oh1 c;

    public nh1(oh1 oh1Var, org.telegram.ui.Cells.s1 s1Var, org.telegram.ui.Components.fi fiVar) {
        this.c = oh1Var;
        this.a = s1Var;
        this.b = fiVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.setEnterTransitionInProgress(false);
        org.telegram.ui.Components.fi fiVar = this.b;
        ArrayList arrayList = (ArrayList) fiVar.c;
        oh1 oh1Var = this.c;
        arrayList.remove(oh1Var);
        fiVar.a();
        ((ViewGroup) fiVar.d).invalidate();
        ChatActivityEnterView.RecordCircle recordCircle = oh1Var.g;
        if (recordCircle != null) {
            recordCircle.J = false;
        }
    }
}
