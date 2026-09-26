package org.telegram.ui.Components;

import j$.util.Objects;
import org.telegram.messenger.ContactsController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class pj {
    public final int a;
    public final long b;

    public pj(int i10, long j3) {
        this.a = i10;
        this.b = j3;
    }

    public static pj a(Object obj) {
        if (obj instanceof ContactsController.Contact) {
            return new pj(2, ((ContactsController.Contact) obj).contact_id);
        }
        if (obj instanceof TLRPC.User) {
            return new pj(1, ((TLRPC.User) obj).id);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || pj.class != obj.getClass()) {
            return false;
        }
        pj pjVar = (pj) obj;
        return this.b == pjVar.b && this.a == pjVar.a;
    }

    public final int hashCode() {
        return Objects.hash(m1.j.a(this.a), Long.valueOf(this.b));
    }
}
