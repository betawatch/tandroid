// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.WindowManager;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class n85 extends AnimatorListenerAdapter {
    public final /* synthetic */ m85 a;
    public final /* synthetic */ yc b;
    public final /* synthetic */ WindowManager c;
    public final /* synthetic */ FrameLayout d;
    public final /* synthetic */ r71 e;
    public final /* synthetic */ o85 f;

    public n85(o85 o85Var, m85 m85Var, yc ycVar, WindowManager windowManager, FrameLayout frameLayout, r71 r71Var) {
        this.f = o85Var;
        this.a = m85Var;
        this.b = ycVar;
        this.c = windowManager;
        this.d = frameLayout;
        this.e = r71Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        kk7.f(this.f.h).d(new vz4((Object) this.a, (Object) this.b, (Object) this.c, (Object) this.d, (Object) this.e, (byte) 6));
    }
}
