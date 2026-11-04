package org.telegram.messenger;

import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class fs implements cs {
    public final hs a;
    public final WeakReference b;
    public final int c;

    public fs(hs hsVar, cs csVar) {
        this.a = hsVar;
        this.b = new WeakReference(csVar);
        this.c = System.identityHashCode(csVar);
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        cs csVar = (cs) this.b.get();
        if (csVar != null) {
            csVar.didReceivedNotification(i3, i10, objArr);
        } else {
            this.a.n(this, i3);
        }
    }

    public final boolean equals(Object obj) {
        cs csVar;
        if (this == obj) {
            return true;
        }
        return (obj instanceof fs) && (csVar = (cs) this.b.get()) != null && csVar == ((fs) obj).b.get();
    }

    public final int hashCode() {
        return this.c;
    }
}
