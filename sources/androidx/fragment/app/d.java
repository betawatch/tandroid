package androidx.fragment.app;

import android.util.Log;
import android.view.ViewGroup;
import android.view.animation.Animation;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final class d implements Animation.AnimationListener {
    public final /* synthetic */ ViewGroup a;
    public final /* synthetic */ e b;

    public d(u0 u0Var, ViewGroup viewGroup, e eVar) {
        this.a = viewGroup;
        this.b = eVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        kotlin.jvm.internal.j.e(animation, "animation");
        ViewGroup viewGroup = this.a;
        viewGroup.post(new a1.e(21, viewGroup, this.b));
        if (j0.K(2)) {
            Log.v("FragmentManager", "Animation from operation " + ((Object) null) + " has ended.");
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        kotlin.jvm.internal.j.e(animation, "animation");
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        kotlin.jvm.internal.j.e(animation, "animation");
        if (j0.K(2)) {
            Log.v("FragmentManager", "Animation from operation " + ((Object) null) + " has reached onAnimationStart.");
        }
    }
}
