package androidx.fragment.app;

import android.os.Bundle;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class p {
    public final /* synthetic */ r a;

    public p(r rVar) {
        this.a = rVar;
    }

    public final void a() {
        r rVar = this.a;
        rVar.g0.b();
        androidx.lifecycle.j0.d(rVar);
        Bundle bundle = rVar.b;
        rVar.g0.c(bundle != null ? bundle.getBundle("registryState") : null);
    }
}
