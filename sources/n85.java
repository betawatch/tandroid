// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.WindowManager;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
