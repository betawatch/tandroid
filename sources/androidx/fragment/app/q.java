package androidx.fragment.app;

import android.os.Bundle;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
