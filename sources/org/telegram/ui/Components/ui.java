package org.telegram.ui.Components;

import j$.util.Objects;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ui {
    public final int a;
    public final long b;

    public ui(int i3, long j10) {
        this.a = i3;
        this.b = j10;
    }

    public static ui a(Object obj) {
        if (obj instanceof org.telegram.messenger.d5) {
            return new ui(2, ((org.telegram.messenger.d5) obj).a);
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
        return Objects.hash(o1.g.a(this.a), Long.valueOf(this.b));
    }
}
