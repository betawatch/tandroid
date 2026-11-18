package org.telegram.messenger;

import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final class is implements fs {
    public final ks a;
    public final WeakReference b;
    public final int c;

    public is(ks ksVar, fs fsVar) {
        this.a = ksVar;
        this.b = new WeakReference(fsVar);
        this.c = System.identityHashCode(fsVar);
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        fs fsVar = (fs) this.b.get();
        if (fsVar != null) {
            fsVar.didReceivedNotification(i7, i10, objArr);
        } else {
            this.a.n(this, i7);
        }
    }

    public final boolean equals(Object obj) {
        fs fsVar;
        if (this == obj) {
            return true;
        }
        return (obj instanceof is) && (fsVar = (fs) this.b.get()) != null && fsVar == ((is) obj).b.get();
    }

    public final int hashCode() {
        return this.c;
    }
}
