// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class b94 extends AnimatorListenerAdapter {
    public final /* synthetic */ d94 a;

    public b94(d94 d94Var) {
        this.a = d94Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        d94 d94Var = this.a;
        ok8 ok8Var = d94Var.n;
        TextView textView = d94Var.h;
        uv8 uv8Var = d94Var.f;
        if (d94Var.x) {
            uv8Var.setVisibility(4);
            textView.setVisibility(4);
            ok8Var.setVisibility(0);
        } else {
            if (d94Var.w) {
                uv8Var.setVisibility(4);
            } else {
                textView.setVisibility(4);
            }
            ok8Var.setVisibility(8);
        }
    }
}
