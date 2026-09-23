package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class ei0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ fi0 b;

    public /* synthetic */ ei0(fi0 fi0Var, int i10) {
        this.a = i10;
        this.b = fi0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 1:
                fi0 fi0Var = this.b;
                AnimatorSet animatorSet = fi0Var.s;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    fi0Var.s = null;
                    fi0Var.getClass();
                    break;
                }
                break;
            case 2:
                fi0 fi0Var2 = this.b;
                AnimatorSet animatorSet2 = fi0Var2.s;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    fi0Var2.s = null;
                    fi0Var2.getClass();
                    break;
                }
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.a;
        fi0 fi0Var = this.b;
        switch (i10) {
            case 0:
                AnimatorSet animatorSet = fi0Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    fi0Var.h = null;
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                break;
            case 1:
                AnimatorSet animatorSet2 = fi0Var.s;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    fi0Var.s = null;
                    if (fi0Var.w) {
                        fi0Var.setLayerType(0, null);
                    }
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                break;
            default:
                AnimatorSet animatorSet3 = fi0Var.s;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    fi0Var.s = null;
                    AndroidUtilities.runOnUIThread(new ac0(this, 14));
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                break;
        }
    }
}
