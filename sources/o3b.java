// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class o3b extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ q3b c;

    public /* synthetic */ o3b(q3b q3bVar, boolean z, byte b) {
        this.a = b;
        this.c = q3bVar;
        this.b = z;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        q3b q3bVar = this.c;
        boolean z = this.b;
        switch (b) {
            case 0:
                if (!z) {
                    q3bVar.h.setVisibility(4);
                    break;
                }
                break;
            default:
                if (!z) {
                    q3bVar.y.setVisibility(4);
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        byte b = this.a;
        q3b q3bVar = this.c;
        boolean z = this.b;
        switch (b) {
            case 0:
                if (z) {
                    q3bVar.h.setVisibility(0);
                    break;
                }
                break;
            default:
                if (z) {
                    q3bVar.y.setVisibility(0);
                    break;
                }
                break;
        }
    }
}
