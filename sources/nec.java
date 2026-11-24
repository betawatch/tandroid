// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class nec extends AnimatorListenerAdapter {
    public boolean a;
    public final /* synthetic */ View b;
    public final /* synthetic */ float c;
    public final /* synthetic */ wec d;

    public nec(wec wecVar, View view, float f) {
        this.d = wecVar;
        this.b = view;
        this.c = f;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        super.onAnimationCancel(animator);
        this.a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.a) {
            return;
        }
        this.d.F(this.b, this.c);
    }
}
