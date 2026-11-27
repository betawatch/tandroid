// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class n86 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ float b;
    public final /* synthetic */ o86 c;

    public /* synthetic */ n86(o86 o86Var, float f, byte b) {
        this.a = b;
        this.c = o86Var;
        this.b = f;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        float f = this.b;
        o86 o86Var = this.c;
        switch (b) {
            case 0:
                TextView textView = o86Var.f;
                int w0 = aob.w0(null, aob.y6, false);
                int w02 = aob.w0(null, aob.n6, false);
                o86Var.s = f;
                textView.setTextColor(vm2.f(f, w0, w02));
                break;
            default:
                TextView textView2 = o86Var.d;
                int w03 = aob.w0(null, aob.y6, false);
                int w04 = aob.w0(null, aob.n6, false);
                o86Var.x = f;
                textView2.setTextColor(vm2.f(f, w03, w04));
                break;
        }
    }
}
