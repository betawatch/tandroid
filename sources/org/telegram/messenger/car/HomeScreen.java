package org.telegram.messenger.car;

import androidx.car.app.m;
import androidx.lifecycle.e;
import androidx.lifecycle.t;
import org.telegram.messenger.ls;
import org.telegram.messenger.qs;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public class HomeScreen extends m implements e, ls {
    @Override // androidx.lifecycle.e
    public final void a(t tVar) {
        qs.e().c(this, qs.d4);
        qs.e().c(this, qs.G4);
        qs.e().c(this, qs.c4);
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == qs.c4) {
            throw null;
        }
        if ((i7 == qs.d4 || i7 == qs.G4) && "tab_notifications".equals(null)) {
            throw null;
        }
    }

    @Override // androidx.lifecycle.e
    public final void e(t tVar) {
        qs.e().n(this, qs.d4);
        qs.e().n(this, qs.G4);
        qs.e().n(this, qs.c4);
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
