package androidx.fragment.app;

import android.os.Bundle;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
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
