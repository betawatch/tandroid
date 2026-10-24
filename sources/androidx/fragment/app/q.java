package androidx.fragment.app;

import android.os.Bundle;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
