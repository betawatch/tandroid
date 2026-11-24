// default package

import android.transition.Transition;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class i7 implements Transition.TransitionListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i7(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition transition) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((r7) obj).j0.e();
                break;
            case 1:
                ((oq4) obj).F.e();
                break;
        }
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((r7) obj).j0.e();
                break;
            case 1:
                ((oq4) obj).F.e();
                break;
            default:
                ((ge7) obj).run();
                break;
        }
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionPause(Transition transition) {
        byte b = this.a;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionResume(Transition transition) {
        byte b = this.a;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((r7) obj).j0.d();
                break;
            case 1:
                ((oq4) obj).F.d();
                break;
        }
    }

    private final void a(Transition transition) {
    }

    private final void b(Transition transition) {
    }

    private final void c(Transition transition) {
    }

    private final void d(Transition transition) {
    }

    private final void e(Transition transition) {
    }

    private final void f(Transition transition) {
    }

    private final void g(Transition transition) {
    }

    private final void h(Transition transition) {
    }
}
