// default package

import android.view.animation.Animation;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class md implements Animation.AnimationListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ md(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((od) obj).o1.setAlpha(0.0f);
                break;
            case 1:
                ((jm4) obj).f.post(new rj4(this, (byte) 4));
                break;
            default:
                wv6 wv6Var = ((uv6) obj).x;
                wv6Var.P = false;
                wv6Var.o();
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
                jm4 jm4Var = (jm4) obj;
                jm4Var.i.setEnabled(false);
                jm4Var.g.setVisibility(0);
                jm4Var.h.setVisibility(0);
                break;
            default:
                ((uv6) obj).x.P = true;
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
