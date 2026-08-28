package androidx.fragment.app;

import android.animation.AnimatorSet;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.ViewGroup;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class h extends t0 {
    public final f b;
    public AnimatorSet c;

    public h(f fVar) {
        this.b = fVar;
    }

    @Override // androidx.fragment.app.t0
    public final void a(ViewGroup container) {
        kotlin.jvm.internal.i.e(container, "container");
        AnimatorSet animatorSet = this.c;
        animatorSet.getClass();
        animatorSet.start();
        if (j0.K(2)) {
            Log.v("FragmentManager", "Animator from operation " + ((Object) null) + " has started.");
        }
    }

    @Override // androidx.fragment.app.t0
    public final void b(androidx.activity.b backEvent, ViewGroup container) {
        kotlin.jvm.internal.i.e(backEvent, "backEvent");
        kotlin.jvm.internal.i.e(container, "container");
        this.c.getClass();
        if (Build.VERSION.SDK_INT >= 34) {
            throw null;
        }
    }

    @Override // androidx.fragment.app.t0
    public final void c(ViewGroup container) {
        kotlin.jvm.internal.i.e(container, "container");
        f fVar = this.b;
        if (fVar.a()) {
            return;
        }
        Context context = container.getContext();
        kotlin.jvm.internal.i.d(context, "context");
        we.b b10 = fVar.b(context);
        this.c = b10 != null ? (AnimatorSet) b10.c : null;
        throw null;
    }
}
