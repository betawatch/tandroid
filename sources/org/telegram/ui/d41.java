package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class d41 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ e41 b;

    public /* synthetic */ d41(e41 e41Var, int i10) {
        this.a = i10;
        this.b = e41Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                e41 e41Var = this.b;
                if (e41Var.h != null) {
                    e41Var.h = null;
                    e41Var.e = 0.0f;
                    e41Var.g();
                    e41Var.n.unlock();
                    sx sxVar = e41Var.a;
                    if (sxVar != null) {
                        sxVar.onPause();
                        e41Var.a.onFragmentDestroy();
                        e41Var.removeAllViews();
                        e41Var.a = null;
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
                    }
                    e41Var.d(false);
                    break;
                }
                break;
            default:
                e41 e41Var2 = this.b;
                if (e41Var2.h != null) {
                    e41Var2.h = null;
                    e41Var2.d(true);
                    break;
                }
                break;
        }
    }
}
