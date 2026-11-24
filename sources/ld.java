// default package

import android.view.animation.Animation;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class ld implements Animation.AnimationListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ld(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((nd) obj).o1.setAlpha(0.0f);
                break;
            case 1:
                ((ek4) obj).f.post(new s54((Object) this, (byte) 20));
                break;
            default:
                rt6 rt6Var = ((pt6) obj).x;
                rt6Var.P = false;
                rt6Var.o();
                break;
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        byte b = this.a;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                break;
            case 1:
                ek4 ek4Var = (ek4) obj;
                ek4Var.i.setEnabled(false);
                ek4Var.g.setVisibility(0);
                ek4Var.h.setVisibility(0);
                break;
            default:
                ((pt6) obj).x.P = true;
                break;
        }
    }

    private final void a(Animation animation) {
    }

    private final void b(Animation animation) {
    }

    private final void c(Animation animation) {
    }

    private final void d(Animation animation) {
    }
}
