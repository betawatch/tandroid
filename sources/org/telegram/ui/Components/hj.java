package org.telegram.ui.Components;

import j$.util.Objects;
import org.telegram.messenger.ContactsController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class hj {
    public final int a;
    public final long b;

    public hj(int i10, long j10) {
        this.a = i10;
        this.b = j10;
    }

    public static hj a(Object obj) {
        if (obj instanceof ContactsController.Contact) {
            return new hj(2, ((ContactsController.Contact) obj).contact_id);
        }
        if (obj instanceof TLRPC.User) {
            return new hj(1, ((TLRPC.User) obj).id);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || hj.class != obj.getClass()) {
            return false;
        }
        hj hjVar = (hj) obj;
        return this.b == hjVar.b && this.a == hjVar.a;
    }

    public final int hashCode() {
        Long valueOf = Long.valueOf(this.b);
        int i10 = this.a;
        return Objects.hash(i10 == 0 ? null : Integer.valueOf(i10 - 1), valueOf);
    }
}
