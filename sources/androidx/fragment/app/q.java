package androidx.fragment.app;

import android.os.Bundle;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class q {
    public final /* synthetic */ s a;

    public q(s sVar) {
        this.a = sVar;
    }

    public final void a() {
        s sVar = this.a;
        sVar.d0.a();
        androidx.lifecycle.j0.d(sVar);
        Bundle bundle = sVar.b;
        sVar.d0.b(bundle != null ? bundle.getBundle("registryState") : null);
    }
}
