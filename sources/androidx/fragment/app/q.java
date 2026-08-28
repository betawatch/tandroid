package androidx.fragment.app;

import android.os.Bundle;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class q {
    public final /* synthetic */ s a;

    public q(s sVar) {
        this.a = sVar;
    }

    public final void a() {
        s sVar = this.a;
        sVar.c0.a();
        androidx.lifecycle.j0.d(sVar);
        Bundle bundle = sVar.b;
        sVar.c0.b(bundle != null ? bundle.getBundle("registryState") : null);
    }
}
