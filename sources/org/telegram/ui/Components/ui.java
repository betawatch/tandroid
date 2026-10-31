package org.telegram.ui.Components;

import j$.util.Objects;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ui {
    public final int a;
    public final long b;

    public ui(int i10, long j10) {
        this.a = i10;
        this.b = j10;
    }

    public static ui a(Object obj) {
        if (obj instanceof org.telegram.messenger.f5) {
            return new ui(2, ((org.telegram.messenger.f5) obj).a);
        }
        if (obj instanceof TLRPC.User) {
            return new ui(1, ((TLRPC.User) obj).id);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ui.class != obj.getClass()) {
            return false;
        }
        ui uiVar = (ui) obj;
        return this.b == uiVar.b && this.a == uiVar.a;
    }

    public final int hashCode() {
        return Objects.hash(m1.j.a(this.a), Long.valueOf(this.b));
    }
}
