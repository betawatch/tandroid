package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class jc1 extends AnimatorListenerAdapter {
    public final /* synthetic */ org.telegram.ui.Cells.r1 a;
    public final /* synthetic */ org.telegram.ui.Components.ti b;
    public final /* synthetic */ kc1 c;

    public jc1(kc1 kc1Var, org.telegram.ui.Cells.r1 r1Var, org.telegram.ui.Components.ti tiVar) {
        this.c = kc1Var;
        this.a = r1Var;
        this.b = tiVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.setEnterTransitionInProgress(false);
        org.telegram.ui.Components.ti tiVar = this.b;
        ArrayList arrayList = (ArrayList) tiVar.c;
        kc1 kc1Var = this.c;
        arrayList.remove(kc1Var);
        tiVar.a();
        ((ViewGroup) tiVar.d).invalidate();
        ChatActivityEnterView.RecordCircle recordCircle = kc1Var.g;
        if (recordCircle != null) {
            recordCircle.O = false;
        }
    }
}
