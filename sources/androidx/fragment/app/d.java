package androidx.fragment.app;

import android.util.Log;
import android.view.ViewGroup;
import android.view.animation.Animation;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
        kotlin.jvm.internal.j.e(animation, "animation");
        ViewGroup viewGroup = this.a;
        viewGroup.post(new a1.e(20, viewGroup, this.b));
        if (i0.K(2)) {
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
        if (i0.K(2)) {
            Log.v("FragmentManager", "Animation from operation " + ((Object) null) + " has reached onAnimationStart.");
        }
    }
}
