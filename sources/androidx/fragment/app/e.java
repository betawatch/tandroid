package androidx.fragment.app;

import android.view.ViewGroup;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
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
