// default package

import android.view.animation.Animation;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class le implements Animation.AnimationListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ le(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((ne) obj).o1.setAlpha(0.0f);
                break;
            case 1:
                ((fm4) obj).f.post(new a14((Object) this, (byte) 27));
                break;
            default:
                rv6 rv6Var = ((pv6) obj).x;
                rv6Var.P = false;
                rv6Var.o();
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
                fm4 fm4Var = (fm4) obj;
                fm4Var.i.setEnabled(false);
                fm4Var.g.setVisibility(0);
                fm4Var.h.setVisibility(0);
                break;
            default:
                ((pv6) obj).x.P = true;
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
