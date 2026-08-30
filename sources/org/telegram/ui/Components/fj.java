package org.telegram.ui.Components;

import j$.util.Objects;
import org.telegram.messenger.ContactsController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class fj {
    public final int a;
    public final long b;

    public fj(int i10, long j10) {
        this.a = i10;
        this.b = j10;
    }

    public static fj a(Object obj) {
        if (obj instanceof ContactsController.Contact) {
            return new fj(2, ((ContactsController.Contact) obj).contact_id);
        }
        if (obj instanceof TLRPC.User) {
            return new fj(1, ((TLRPC.User) obj).id);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || fj.class != obj.getClass()) {
            return false;
        }
        fj fjVar = (fj) obj;
        return this.b == fjVar.b && this.a == fjVar.a;
    }

    public final int hashCode() {
        Long valueOf = Long.valueOf(this.b);
        int i10 = this.a;
        return Objects.hash(i10 == 0 ? null : Integer.valueOf(i10 - 1), valueOf);
    }
}
