package androidx.fragment.app;

import android.os.Bundle;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
