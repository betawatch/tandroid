package org.telegram.messenger.car;

import androidx.car.app.l;
import androidx.lifecycle.e;
import androidx.lifecycle.t;
import org.telegram.messenger.at;
import org.telegram.messenger.vs;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public class HomeScreen extends l implements e, vs {
    @Override // androidx.lifecycle.e
    public final void a(t tVar) {
        at.e().c(this, at.d4);
        at.e().c(this, at.G4);
        at.e().c(this, at.c4);
    }

    @Override // org.telegram.messenger.vs
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == at.c4) {
            throw null;
        }
        if ((i10 == at.d4 || i10 == at.G4) && "tab_notifications".equals(null)) {
            throw null;
        }
    }

    @Override // androidx.lifecycle.e
    public final void e(t tVar) {
        at.e().n(this, at.d4);
        at.e().n(this, at.G4);
        at.e().n(this, at.c4);
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
