// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class j66 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ float b;
    public final /* synthetic */ k66 c;

    public /* synthetic */ j66(k66 k66Var, float f, byte b) {
        this.a = b;
        this.c = k66Var;
        this.b = f;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        float f = this.b;
        k66 k66Var = this.c;
        switch (b) {
            case 0:
                TextView textView = k66Var.f;
                int w0 = bkb.w0(null, bkb.x6, false);
                int w02 = bkb.w0(null, bkb.m6, false);
                k66Var.s = f;
                textView.setTextColor(bm2.f(f, w0, w02));
                break;
            default:
                TextView textView2 = k66Var.d;
                int w03 = bkb.w0(null, bkb.x6, false);
                int w04 = bkb.w0(null, bkb.m6, false);
                k66Var.x = f;
                textView2.setTextColor(bm2.f(f, w03, w04));
                break;
        }
    }
}
