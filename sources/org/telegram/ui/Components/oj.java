package org.telegram.ui.Components;

import j$.util.Objects;
import org.telegram.messenger.ContactsController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
/* loaded from: classes3.dex */
public final class oj {
    public final int a;
    public final long b;

    public oj(int i10, long j3) {
        this.a = i10;
        this.b = j3;
    }

    public static oj a(Object obj) {
        if (obj instanceof ContactsController.Contact) {
            return new oj(2, ((ContactsController.Contact) obj).contact_id);
        }
        if (obj instanceof TLRPC.User) {
            return new oj(1, ((TLRPC.User) obj).id);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || oj.class != obj.getClass()) {
            return false;
        }
        oj ojVar = (oj) obj;
        return this.b == ojVar.b && this.a == ojVar.a;
    }

    public final int hashCode() {
        return Objects.hash(m1.j.a(this.a), Long.valueOf(this.b));
    }
}
