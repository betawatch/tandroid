package org.telegram.messenger.car;

import androidx.car.app.m;
import androidx.lifecycle.e;
import androidx.lifecycle.t;
import org.telegram.messenger.fs;
import org.telegram.messenger.ks;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public class HomeScreen extends m implements e, fs {
    @Override // androidx.lifecycle.e
    public final void a(t tVar) {
        ks.e().c(this, ks.f4);
        ks.e().c(this, ks.I4);
        ks.e().c(this, ks.e4);
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ks.e4) {
            throw null;
        }
        if ((i7 == ks.f4 || i7 == ks.I4) && "tab_notifications".equals(null)) {
            throw null;
        }
    }

    @Override // androidx.lifecycle.e
    public final void e(t tVar) {
        ks.e().n(this, ks.f4);
        ks.e().n(this, ks.I4);
        ks.e().n(this, ks.e4);
    }

    @Override // androidx.lifecycle.e
    public final /* synthetic */ void b(t tVar) {
    }

    @Override // androidx.lifecycle.e
    public final /* synthetic */ void f(t tVar) {
    }

    @Override // androidx.lifecycle.e
    public final /* synthetic */ void g(t tVar) {
    }

    @Override // androidx.lifecycle.e
    public final /* synthetic */ void i(t tVar) {
    }
}
