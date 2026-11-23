package org.telegram.messenger;

import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final class js implements gs {
    public final ls a;
    public final WeakReference b;
    public final int c;

    public js(ls lsVar, gs gsVar) {
        this.a = lsVar;
        this.b = new WeakReference(gsVar);
        this.c = System.identityHashCode(gsVar);
    }

    @Override // org.telegram.messenger.gs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        gs gsVar = (gs) this.b.get();
        if (gsVar != null) {
            gsVar.didReceivedNotification(i7, i10, objArr);
        } else {
            this.a.n(this, i7);
        }
    }

    public final boolean equals(Object obj) {
        gs gsVar;
        if (this == obj) {
            return true;
        }
        return (obj instanceof js) && (gsVar = (gs) this.b.get()) != null && gsVar == ((js) obj).b.get();
    }

    public final int hashCode() {
        return this.c;
    }
}
