// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.WindowManager;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class na5 extends AnimatorListenerAdapter {
    public final /* synthetic */ ma5 a;
    public final /* synthetic */ yd b;
    public final /* synthetic */ WindowManager c;
    public final /* synthetic */ FrameLayout d;
    public final /* synthetic */ z81 e;
    public final /* synthetic */ oa5 f;

    public na5(oa5 oa5Var, ma5 ma5Var, yd ydVar, WindowManager windowManager, FrameLayout frameLayout, z81 z81Var) {
        this.f = oa5Var;
        this.a = ma5Var;
        this.b = ydVar;
        this.c = windowManager;
        this.d = frameLayout;
        this.e = z81Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        nm7.f(this.f.h).d(new v15((Object) this.a, (Object) this.b, (Object) this.c, (Object) this.d, (Object) this.e, (byte) 6));
    }
}
