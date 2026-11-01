package androidx.fragment.app;

import android.view.ViewGroup;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class e extends t0 {
    public final f b;

    public e(f fVar) {
        this.b = fVar;
    }

    @Override // androidx.fragment.app.t0
    public final void a(ViewGroup container) {
        kotlin.jvm.internal.i.e(container, "container");
        if (this.b.a()) {
            throw null;
        }
        container.getContext();
        throw null;
    }
}
