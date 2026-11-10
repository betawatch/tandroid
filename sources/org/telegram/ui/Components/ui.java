package org.telegram.ui.Components;

import j$.util.Objects;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class ui {
    public final int a;
    public final long b;

    public ui(int i7, long j3) {
        this.a = i7;
        this.b = j3;
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
        return Objects.hash(p1.g.a(this.a), Long.valueOf(this.b));
    }
}
