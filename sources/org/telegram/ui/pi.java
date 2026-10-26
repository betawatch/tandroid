package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class pi extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ un b;

    public /* synthetic */ pi(un unVar, int i10) {
        this.a = i10;
        this.b = unVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        oj ojVar;
        switch (this.a) {
            case 0:
                un unVar = this.b;
                org.telegram.ui.Components.t60 t60Var = unVar.n3;
                if (t60Var != null) {
                    t60Var.setIsMessageTransition(false);
                    unVar.n3.c(true);
                    unVar.n3.setVisibility(4);
                    break;
                }
                break;
            case 1:
                float dp = AndroidUtilities.dp(30.0f);
                un unVar2 = this.b;
                unVar2.M9 = dp;
                unVar2.x9();
                break;
            case 2:
                un unVar3 = this.b;
                if (unVar3.fragmentView != null && (ojVar = unVar3.x0) != null) {
                    ojVar.invalidate();
                    unVar3.fragmentView.invalidate();
                    break;
                }
                break;
            case 3:
                this.b.P.setVisibility(4);
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new ui(this, 4), 2000L);
                break;
            case 5:
                un unVar4 = this.b;
                if (animator.equals(unVar4.s3)) {
                    unVar4.s3 = null;
                    break;
                }
                break;
            case 6:
                un unVar5 = this.b;
                if (animator.equals(unVar5.s3)) {
                    unVar5.s3 = null;
                    break;
                }
                break;
            case 7:
                un unVar6 = this.b;
                if (animator.equals(unVar6.t3)) {
                    unVar6.u3 = 1.0f;
                    unVar6.yc();
                    unVar6.t3 = null;
                    break;
                }
                break;
            case 8:
                un unVar7 = this.b;
                if (animator.equals(unVar7.t3)) {
                    unVar7.u3 = 0.0f;
                    unVar7.yc();
                    unVar7.t3 = null;
                    break;
                }
                break;
            case 9:
                this.b.f5 = null;
                break;
            case 10:
                un unVar8 = this.b;
                unVar8.Qa = 1.0f;
                unVar8.Y.setVisibility(4);
                unVar8.a1.setVisibility(4);
                unVar8.x9();
                break;
            default:
                un unVar9 = this.b;
                unVar9.Qa = 0.0f;
                unVar9.x9();
                break;
        }
    }
}
