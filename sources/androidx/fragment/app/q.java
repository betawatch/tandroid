package androidx.fragment.app;

import android.os.Bundle;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
