package androidx.fragment.app;

import android.animation.AnimatorSet;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.ViewGroup;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class g extends s0 {
    public final f b;
    public AnimatorSet c;

    public g(f fVar) {
        this.b = fVar;
    }

    @Override // androidx.fragment.app.s0
    public final void a(ViewGroup container) {
        kotlin.jvm.internal.i.e(container, "container");
        AnimatorSet animatorSet = this.c;
        animatorSet.getClass();
        animatorSet.start();
        if (i0.K(2)) {
            Log.v("FragmentManager", "Animator from operation " + ((Object) null) + " has started.");
        }
    }

    @Override // androidx.fragment.app.s0
    public final void b(androidx.activity.b backEvent, ViewGroup container) {
        kotlin.jvm.internal.i.e(backEvent, "backEvent");
        kotlin.jvm.internal.i.e(container, "container");
        this.c.getClass();
        if (Build.VERSION.SDK_INT >= 34) {
            throw null;
        }
    }

    @Override // androidx.fragment.app.s0
    public final void c(ViewGroup container) {
        kotlin.jvm.internal.i.e(container, "container");
        f fVar = this.b;
        if (fVar.a()) {
            return;
        }
        Context context = container.getContext();
        kotlin.jvm.internal.i.d(context, "context");
        rf.b b10 = fVar.b(context);
        this.c = b10 != null ? (AnimatorSet) b10.c : null;
        throw null;
    }
}
