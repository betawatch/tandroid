package org.telegram.ui.Components;

import j$.util.Objects;
import org.telegram.messenger.ContactsController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class sj {
    public final int a;
    public final long b;

    public sj(int i10, long j3) {
        this.a = i10;
        this.b = j3;
    }

    public static sj a(Object obj) {
        if (obj instanceof ContactsController.Contact) {
            return new sj(2, ((ContactsController.Contact) obj).contact_id);
        }
        if (obj instanceof TLRPC.User) {
            return new sj(1, ((TLRPC.User) obj).id);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || sj.class != obj.getClass()) {
            return false;
        }
        sj sjVar = (sj) obj;
        return this.b == sjVar.b && this.a == sjVar.a;
    }

    public final int hashCode() {
        return Objects.hash(m1.j.a(this.a), Long.valueOf(this.b));
    }
}
