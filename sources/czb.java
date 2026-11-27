// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class czb extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ tzb c;

    public /* synthetic */ czb(tzb tzbVar, boolean z, byte b) {
        this.a = b;
        this.c = tzbVar;
        this.b = z;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i;
        byte b = this.a;
        tzb tzbVar = this.c;
        boolean z = this.b;
        switch (b) {
            case 0:
                super.onAnimationEnd(animator);
                tzbVar.W0(z ? 1.0f : 0.0f);
                if (!z) {
                    Activity parentActivity = tzbVar.getParentActivity();
                    i = ((e) tzbVar).classGuid;
                    hl.g3(parentActivity, i);
                    tzbVar.s0.setVisibility(8);
                    tzbVar.U0(true);
                    break;
                } else {
                    tzbVar.r0.setVisibility(8);
                    break;
                }
            default:
                if (!z) {
                    tzbVar.p0.setVisibility(8);
                    break;
                }
                break;
        }
    }
}
