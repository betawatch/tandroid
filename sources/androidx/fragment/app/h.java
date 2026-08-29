package androidx.fragment.app;

import android.animation.AnimatorSet;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.ViewGroup;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class h extends t0 {
    public final f b;
    public AnimatorSet c;

    public h(f fVar) {
        this.b = fVar;
    }

    @Override // androidx.fragment.app.t0
    public final void a(ViewGroup container) {
        kotlin.jvm.internal.j.e(container, "container");
        AnimatorSet animatorSet = this.c;
        animatorSet.getClass();
        animatorSet.start();
        if (j0.K(2)) {
            Log.v("FragmentManager", "Animator from operation " + ((Object) null) + " has started.");
        }
    }

    @Override // androidx.fragment.app.t0
    public final void b(androidx.activity.b backEvent, ViewGroup container) {
        kotlin.jvm.internal.j.e(backEvent, "backEvent");
        kotlin.jvm.internal.j.e(container, "container");
        this.c.getClass();
        if (Build.VERSION.SDK_INT >= 34) {
            throw null;
        }
    }

    @Override // androidx.fragment.app.t0
    public final void c(ViewGroup container) {
        kotlin.jvm.internal.j.e(container, "container");
        f fVar = this.b;
        if (fVar.a()) {
            return;
        }
        Context context = container.getContext();
        kotlin.jvm.internal.j.d(context, "context");
        ze.b b10 = fVar.b(context);
        this.c = b10 != null ? (AnimatorSet) b10.b : null;
        throw null;
    }
}
