package org.telegram.ui.ActionBar;

import android.transition.Transition;
import android.widget.FrameLayout;
import org.telegram.ui.Components.h10;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class k0 implements Transition.TransitionListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrameLayout b;

    public /* synthetic */ k0(int i10, FrameLayout frameLayout) {
        this.a = i10;
        this.b = frameLayout;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition transition) {
        switch (this.a) {
            case 0:
                ((t0) this.b).i0.e();
                break;
            default:
                ((h10) this.b).E.e();
                break;
        }
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        switch (this.a) {
            case 0:
                ((t0) this.b).i0.e();
                break;
            default:
                ((h10) this.b).E.e();
                break;
        }
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionPause(Transition transition) {
        int i10 = this.a;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionResume(Transition transition) {
        int i10 = this.a;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
        switch (this.a) {
            case 0:
                ((t0) this.b).i0.d();
                break;
            default:
                ((h10) this.b).E.d();
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
