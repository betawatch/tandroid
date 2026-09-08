package androidx.fragment.app;

import android.util.Log;
import android.view.ViewGroup;
import android.view.animation.Animation;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class d implements Animation.AnimationListener {
    public final /* synthetic */ ViewGroup a;
    public final /* synthetic */ e b;

    public d(t0 t0Var, ViewGroup viewGroup, e eVar) {
        this.a = viewGroup;
        this.b = eVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        kotlin.jvm.internal.i.e(animation, "animation");
        ViewGroup viewGroup = this.a;
        viewGroup.post(new a1.e(11, viewGroup, this.b));
        if (i0.K(2)) {
            Log.v("FragmentManager", "Animation from operation " + ((Object) null) + " has ended.");
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        kotlin.jvm.internal.i.e(animation, "animation");
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        kotlin.jvm.internal.i.e(animation, "animation");
        if (i0.K(2)) {
            Log.v("FragmentManager", "Animation from operation " + ((Object) null) + " has reached onAnimationStart.");
        }
    }
}
