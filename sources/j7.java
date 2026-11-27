// default package

import android.transition.Transition;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class j7 implements Transition.TransitionListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ j7(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition transition) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((s7) obj).j0.e();
                break;
            case 1:
                ((rq4) obj).G.e();
                break;
        }
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((s7) obj).j0.e();
                break;
            case 1:
                ((rq4) obj).G.e();
                break;
            default:
                ((oe7) obj).run();
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
                ((s7) obj).j0.d();
                break;
            case 1:
                ((rq4) obj).G.d();
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
