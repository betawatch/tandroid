package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class jc1 extends AnimatorListenerAdapter {
    public final /* synthetic */ org.telegram.ui.Cells.r1 a;
    public final /* synthetic */ org.telegram.ui.Components.ri b;
    public final /* synthetic */ kc1 c;

    public jc1(kc1 kc1Var, org.telegram.ui.Cells.r1 r1Var, org.telegram.ui.Components.ri riVar) {
        this.c = kc1Var;
        this.a = r1Var;
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
