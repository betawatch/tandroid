package androidx.fragment.app;

import android.os.Bundle;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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
