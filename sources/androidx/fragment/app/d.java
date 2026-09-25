package androidx.fragment.app;

import ai.ba;
import android.util.Log;
import android.view.ViewGroup;
import android.view.animation.Animation;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes.dex */
public final class d implements Animation.AnimationListener {
    public final /* synthetic */ ViewGroup a;
    public final /* synthetic */ e b;

    public d(v0 v0Var, ViewGroup viewGroup, e eVar) {
        this.a = viewGroup;
        this.b = eVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        kotlin.jvm.internal.i.e(animation, "animation");
        ViewGroup viewGroup = this.a;
        viewGroup.post(new ba(4, viewGroup, this.b));
        if (k0.K(2)) {
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
        if (k0.K(2)) {
            Log.v("FragmentManager", "Animation from operation " + ((Object) null) + " has reached onAnimationStart.");
        }
    }
}
