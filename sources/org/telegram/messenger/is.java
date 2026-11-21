package org.telegram.messenger;

import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
