package org.telegram.ui.Components;

import j$.util.Objects;
import org.telegram.messenger.ContactsController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final class qj {
    public final int a;
    public final long b;

    public qj(int i10, long j3) {
        this.a = i10;
        this.b = j3;
    }

    public static qj a(Object obj) {
        if (obj instanceof ContactsController.Contact) {
            return new qj(2, ((ContactsController.Contact) obj).contact_id);
        }
        if (obj instanceof TLRPC.User) {
            return new qj(1, ((TLRPC.User) obj).id);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || qj.class != obj.getClass()) {
            return false;
        }
        qj qjVar = (qj) obj;
        return this.b == qjVar.b && this.a == qjVar.a;
    }

    public final int hashCode() {
        return Objects.hash(m1.j.a(this.a), Long.valueOf(this.b));
    }
}
