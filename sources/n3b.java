// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class n3b extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ p3b c;

    public /* synthetic */ n3b(p3b p3bVar, boolean z, byte b) {
        this.a = b;
        this.c = p3bVar;
        this.b = z;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        p3b p3bVar = this.c;
        boolean z = this.b;
        switch (b) {
            case 0:
                if (!z) {
                    p3bVar.h.setVisibility(4);
                    break;
                }
                break;
            default:
                if (!z) {
                    p3bVar.y.setVisibility(4);
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        byte b = this.a;
        p3b p3bVar = this.c;
        boolean z = this.b;
        switch (b) {
            case 0:
                if (z) {
                    p3bVar.h.setVisibility(0);
                    break;
                }
                break;
            default:
                if (z) {
                    p3bVar.y.setVisibility(0);
                    break;
                }
                break;
        }
    }
}
