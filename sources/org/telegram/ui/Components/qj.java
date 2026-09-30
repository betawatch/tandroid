package org.telegram.ui.Components;

import j$.util.Objects;
import org.telegram.messenger.ContactsController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
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
