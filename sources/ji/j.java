package ji;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.Cells.t1;
import s4.c1;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final class j extends AnimatorListenerAdapter {
    public final /* synthetic */ c1 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ View c;
    public final /* synthetic */ n d;

    public j(n nVar, c1 c1Var, int i10, View view) {
        this.d = nVar;
        this.a = c1Var;
        this.b = i10;
        this.c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        if (this.b != 0) {
            this.c.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        animator.removeAllListeners();
        c1 c1Var = this.a;
        View view = c1Var.a;
        n nVar = this.d;
        nVar.X(view);
        View view2 = c1Var.a;
        if (view2 instanceof t1) {
            t1 t1Var = (t1) view2;
            if (t1Var.fd) {
                t1Var.fd = false;
                t1Var.setVisibility(0);
            }
            MessageObject.GroupedMessages currentMessagesGroup = t1Var.getCurrentMessagesGroup();
            if (currentMessagesGroup != null) {
                currentMessagesGroup.transitionParams.reset();
            }
        }
        if (nVar.z.remove(c1Var)) {
            nVar.v(c1Var);
            nVar.G();
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.d.getClass();
    }
}
