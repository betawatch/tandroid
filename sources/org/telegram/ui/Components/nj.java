package org.telegram.ui.Components;

import j$.util.Objects;
import org.telegram.messenger.ContactsController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class nj {
    public final int a;
    public final long b;

    public nj(int i10, long j10) {
        this.a = i10;
        this.b = j10;
    }

    public static nj a(Object obj) {
        if (obj instanceof ContactsController.Contact) {
            return new nj(2, ((ContactsController.Contact) obj).contact_id);
        }
        if (obj instanceof TLRPC.User) {
            return new nj(1, ((TLRPC.User) obj).id);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || nj.class != obj.getClass()) {
            return false;
        }
        nj njVar = (nj) obj;
        return this.b == njVar.b && this.a == njVar.a;
    }

    public final int hashCode() {
        return Objects.hash(m1.j.a(this.a), Long.valueOf(this.b));
    }
}
