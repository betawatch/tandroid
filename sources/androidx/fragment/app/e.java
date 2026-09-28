package androidx.fragment.app;

import android.view.ViewGroup;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes.dex */
public final class e extends u0 {
    public final f b;

    public e(f fVar) {
        this.b = fVar;
    }

    @Override // androidx.fragment.app.u0
    public final void a(ViewGroup container) {
        kotlin.jvm.internal.i.e(container, "container");
        if (this.b.a()) {
            throw null;
        }
        container.getContext();
        throw null;
    }
}
