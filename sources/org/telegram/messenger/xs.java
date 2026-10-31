package org.telegram.messenger;

import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class xs implements us {
    public final zs a;
    public final WeakReference b;
    public final int c;

    public xs(zs zsVar, us usVar) {
        this.a = zsVar;
        this.b = new WeakReference(usVar);
        this.c = System.identityHashCode(usVar);
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        us usVar = (us) this.b.get();
        if (usVar != null) {
            usVar.didReceivedNotification(i10, i11, objArr);
        } else {
            this.a.n(this, i10);
        }
    }

    public final boolean equals(Object obj) {
        us usVar;
        if (this == obj) {
            return true;
        }
        return (obj instanceof xs) && (usVar = (us) this.b.get()) != null && usVar == ((xs) obj).b.get();
    }

    public final int hashCode() {
        return this.c;
    }
}
