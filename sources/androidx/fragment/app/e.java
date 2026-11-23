package androidx.fragment.app;

import android.view.ViewGroup;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final class e extends t0 {
    public final f b;

    public e(f fVar) {
        this.b = fVar;
    }

    @Override // androidx.fragment.app.t0
    public final void a(ViewGroup container) {
        kotlin.jvm.internal.j.e(container, "container");
        if (this.b.a()) {
            throw null;
        }
        container.getContext();
        throw null;
    }
}
