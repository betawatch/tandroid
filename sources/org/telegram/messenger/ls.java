package org.telegram.messenger;

import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class ls implements is {
    public final ns a;
    public final WeakReference b;
    public final int c;

    public ls(ns nsVar, is isVar) {
        this.a = nsVar;
        this.b = new WeakReference(isVar);
        this.c = System.identityHashCode(isVar);
    }

    @Override // org.telegram.messenger.is
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        is isVar = (is) this.b.get();
        if (isVar != null) {
            isVar.didReceivedNotification(i7, i10, objArr);
        } else {
            this.a.n(this, i7);
        }
    }

    public final boolean equals(Object obj) {
        is isVar;
        if (this == obj) {
            return true;
        }
        return (obj instanceof ls) && (isVar = (is) this.b.get()) != null && isVar == ((ls) obj).b.get();
    }

    public final int hashCode() {
        return this.c;
    }
}
