package org.telegram.ui.ActionBar;

import android.transition.Transition;
import android.widget.FrameLayout;
import org.telegram.ui.Components.s00;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class j0 implements Transition.TransitionListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrameLayout b;

    public /* synthetic */ j0(int i7, FrameLayout frameLayout) {
        this.a = i7;
        this.b = frameLayout;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition transition) {
        switch (this.a) {
            case 0:
                ((r0) this.b).i0.e();
                break;
            default:
                ((s00) this.b).E.e();
                break;
        }
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        switch (this.a) {
            case 0:
                ((r0) this.b).i0.e();
                break;
            default:
                ((s00) this.b).E.e();
                break;
        }
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionPause(Transition transition) {
        int i7 = this.a;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionResume(Transition transition) {
        int i7 = this.a;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
        switch (this.a) {
            case 0:
                ((r0) this.b).i0.d();
                break;
            default:
                ((s00) this.b).E.d();
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
}
