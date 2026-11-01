package org.telegram.messenger;

import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class ys implements vs {
    public final at a;
    public final WeakReference b;
    public final int c;

    public ys(at atVar, vs vsVar) {
        this.a = atVar;
        this.b = new WeakReference(vsVar);
        this.c = System.identityHashCode(vsVar);
    }

    @Override // org.telegram.messenger.vs
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        vs vsVar = (vs) this.b.get();
        if (vsVar != null) {
            vsVar.didReceivedNotification(i10, i11, objArr);
        } else {
            this.a.n(this, i10);
        }
    }

    public final boolean equals(Object obj) {
        vs vsVar;
        if (this == obj) {
            return true;
        }
        return (obj instanceof ys) && (vsVar = (vs) this.b.get()) != null && vsVar == ((ys) obj).b.get();
    }

    public final int hashCode() {
        return this.c;
    }
}
