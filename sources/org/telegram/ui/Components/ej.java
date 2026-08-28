package org.telegram.ui.Components;

import j$.util.Objects;
import org.telegram.messenger.ContactsController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ej {
    public final int a;
    public final long b;

    public ej(int i9, long j10) {
        this.a = i9;
        this.b = j10;
    }

    public static ej a(Object obj) {
        if (obj instanceof ContactsController.Contact) {
            return new ej(2, ((ContactsController.Contact) obj).contact_id);
        }
        if (obj instanceof TLRPC.User) {
            return new ej(1, ((TLRPC.User) obj).id);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ej.class != obj.getClass()) {
            return false;
        }
        ej ejVar = (ej) obj;
        return this.b == ejVar.b && this.a == ejVar.a;
    }

    public final int hashCode() {
        Long valueOf = Long.valueOf(this.b);
        int i9 = this.a;
        return Objects.hash(i9 == 0 ? null : Integer.valueOf(i9 - 1), valueOf);
    }
}
