package org.telegram.messenger;

import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class os implements ls {
    public final qs a;
    public final WeakReference b;
    public final int c;

    public os(qs qsVar, ls lsVar) {
        this.a = qsVar;
        this.b = new WeakReference(lsVar);
        this.c = System.identityHashCode(lsVar);
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        ls lsVar = (ls) this.b.get();
        if (lsVar != null) {
            lsVar.didReceivedNotification(i7, i10, objArr);
        } else {
            this.a.n(this, i7);
        }
    }

    public final boolean equals(Object obj) {
        ls lsVar;
        if (this == obj) {
            return true;
        }
        return (obj instanceof os) && (lsVar = (ls) this.b.get()) != null && lsVar == ((os) obj).b.get();
    }

    public final int hashCode() {
        return this.c;
    }
}
