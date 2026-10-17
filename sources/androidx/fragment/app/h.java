package androidx.fragment.app;

import android.animation.AnimatorSet;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.ViewGroup;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes.dex */
public final class h extends t0 {
    public final g b;
    public AnimatorSet c;

    public h(g gVar) {
        this.b = gVar;
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
        g gVar = this.b;
        if (gVar.a()) {
            return;
        }
        Context context = container.getContext();
        kotlin.jvm.internal.i.d(context, "context");
        n4.s b10 = gVar.b(context);
        this.c = b10 != null ? (AnimatorSet) b10.c : null;
        throw null;
    }
}
