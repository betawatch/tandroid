package org.telegram.ui.Components;

import j$.util.Objects;
import org.telegram.messenger.ContactsController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class rj {
    public final int a;
    public final long b;

    public rj(int i10, long j3) {
        this.a = i10;
        this.b = j3;
    }

    public static rj a(Object obj) {
        if (obj instanceof ContactsController.Contact) {
            return new rj(2, ((ContactsController.Contact) obj).contact_id);
        }
        if (obj instanceof TLRPC.User) {
            return new rj(1, ((TLRPC.User) obj).id);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || rj.class != obj.getClass()) {
            return false;
        }
        rj rjVar = (rj) obj;
        return this.b == rjVar.b && this.a == rjVar.a;
    }

    public final int hashCode() {
        return Objects.hash(m1.j.a(this.a), Long.valueOf(this.b));
    }
}
