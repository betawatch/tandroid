package androidx.fragment.app;

import android.view.ViewGroup;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
