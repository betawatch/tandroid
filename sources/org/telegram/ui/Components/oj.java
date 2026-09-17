package org.telegram.ui.Components;

import j$.util.Objects;
import org.telegram.messenger.ContactsController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
