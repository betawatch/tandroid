package mi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.Cells.s1;
import s4.e1;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class i extends AnimatorListenerAdapter {
    public final /* synthetic */ e1 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ View c;
    public final /* synthetic */ m d;

    public i(m mVar, e1 e1Var, int i10, View view) {
        this.d = mVar;
        this.a = e1Var;
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
        e1 e1Var = this.a;
        View view = e1Var.a;
        m mVar = this.d;
        mVar.X(view);
        View view2 = e1Var.a;
        if (view2 instanceof s1) {
            s1 s1Var = (s1) view2;
            if (s1Var.fd) {
                s1Var.fd = false;
                s1Var.setVisibility(0);
            }
            MessageObject.GroupedMessages currentMessagesGroup = s1Var.getCurrentMessagesGroup();
            if (currentMessagesGroup != null) {
                currentMessagesGroup.transitionParams.reset();
            }
        }
        if (mVar.z.remove(e1Var)) {
            mVar.v(e1Var);
            mVar.G();
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.d.getClass();
    }
}
