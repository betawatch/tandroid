package androidx.fragment.app;

import android.animation.AnimatorSet;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.ViewGroup;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
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
