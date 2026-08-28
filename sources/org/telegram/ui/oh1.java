package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class oh1 extends AnimatorListenerAdapter {
    public final /* synthetic */ org.telegram.ui.Cells.t1 a;
    public final /* synthetic */ org.telegram.ui.Components.ji b;
    public final /* synthetic */ ph1 c;

    public oh1(ph1 ph1Var, org.telegram.ui.Cells.t1 t1Var, org.telegram.ui.Components.ji jiVar) {
        this.c = ph1Var;
        this.a = t1Var;
        this.b = jiVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.setEnterTransitionInProgress(false);
        org.telegram.ui.Components.ji jiVar = this.b;
        ArrayList arrayList = (ArrayList) jiVar.c;
        ph1 ph1Var = this.c;
        arrayList.remove(ph1Var);
        jiVar.a();
        ((ViewGroup) jiVar.d).invalidate();
        ChatActivityEnterView.RecordCircle recordCircle = ph1Var.g;
        if (recordCircle != null) {
            recordCircle.J = false;
        }
    }
}
