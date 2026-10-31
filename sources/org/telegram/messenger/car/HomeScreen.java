package org.telegram.messenger.car;

import androidx.car.app.l;
import androidx.lifecycle.e;
import androidx.lifecycle.t;
import org.telegram.messenger.us;
import org.telegram.messenger.zs;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public class HomeScreen extends l implements e, us {
    @Override // androidx.lifecycle.e
    public final void a(t tVar) {
        zs.e().c(this, zs.d4);
        zs.e().c(this, zs.G4);
        zs.e().c(this, zs.c4);
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == zs.c4) {
            throw null;
        }
        if ((i10 == zs.d4 || i10 == zs.G4) && "tab_notifications".equals(null)) {
            throw null;
        }
    }

    @Override // androidx.lifecycle.e
    public final void e(t tVar) {
        zs.e().n(this, zs.d4);
        zs.e().n(this, zs.G4);
        zs.e().n(this, zs.c4);
    }

    @Override // androidx.lifecycle.e
    public final /* synthetic */ void b(t tVar) {
    }

    @Override // androidx.lifecycle.e
    public final /* synthetic */ void f(t tVar) {
    }

    @Override // androidx.lifecycle.e
    public final /* synthetic */ void h(t tVar) {
    }

    @Override // androidx.lifecycle.e
    public final /* synthetic */ void i(t tVar) {
    }
}
