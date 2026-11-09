package org.telegram.messenger;

import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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
