package androidx.fragment.app;

import android.os.Bundle;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final class q {
    public final /* synthetic */ s a;

    public q(s sVar) {
        this.a = sVar;
    }

    public final void a() {
        s sVar = this.a;
        sVar.g0.b();
        androidx.lifecycle.j0.d(sVar);
        Bundle bundle = sVar.b;
        sVar.g0.c(bundle != null ? bundle.getBundle("registryState") : null);
    }
}
