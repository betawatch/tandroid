package org.telegram.ui.Components;

import j$.util.Objects;
import org.telegram.messenger.ContactsController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class aj {
    public final int a;
    public final long b;

    public aj(int i10, long j10) {
        this.a = i10;
        this.b = j10;
    }

    public static aj a(Object obj) {
        if (obj instanceof ContactsController.Contact) {
            return new aj(2, ((ContactsController.Contact) obj).contact_id);
        }
        if (obj instanceof TLRPC.User) {
            return new aj(1, ((TLRPC.User) obj).id);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || aj.class != obj.getClass()) {
            return false;
        }
        aj ajVar = (aj) obj;
        return this.b == ajVar.b && this.a == ajVar.a;
    }

    public final int hashCode() {
        Long valueOf = Long.valueOf(this.b);
        int i10 = this.a;
        return Objects.hash(i10 == 0 ? null : Integer.valueOf(i10 - 1), valueOf);
    }
}
