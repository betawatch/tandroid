package org.telegram.ui.Components;

import j$.util.Objects;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class vi {
    public final int a;
    public final long b;

    public vi(int i7, long j3) {
        this.a = i7;
        this.b = j3;
    }

    public static vi a(Object obj) {
        if (obj instanceof org.telegram.messenger.d5) {
            return new vi(2, ((org.telegram.messenger.d5) obj).a);
        }
        if (obj instanceof TLRPC.User) {
            return new vi(1, ((TLRPC.User) obj).id);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || vi.class != obj.getClass()) {
            return false;
        }
        vi viVar = (vi) obj;
        return this.b == viVar.b && this.a == viVar.a;
    }

    public final int hashCode() {
        return Objects.hash(p1.g.a(this.a), Long.valueOf(this.b));
    }
}
