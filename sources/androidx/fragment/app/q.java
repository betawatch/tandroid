package androidx.fragment.app;

import android.os.Bundle;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
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
