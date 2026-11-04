package o4;

import android.os.Bundle;
import j$.util.Objects;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class v {
    public final p4.r a;
    public final int b;
    public final int c;
    public final u d;
    public final Bundle e;

    public v(p4.r rVar, int i3, int i10, boolean z10, u uVar, Bundle bundle) {
        this.a = rVar;
        this.b = i3;
        this.c = i10;
        this.d = uVar;
        this.e = bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof v)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        v vVar = (v) obj;
        u uVar = vVar.d;
        u uVar2 = this.d;
        return (uVar2 == null && uVar == null) ? this.a.equals(vVar.a) : Objects.equals(uVar2, uVar);
    }

    public final int hashCode() {
        return Objects.hash(this.d, this.a);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ControllerInfo {pkg=");
        p4.r rVar = this.a;
        sb2.append(rVar.a.a);
        sb2.append(", uid=");
        return a1.g.o(rVar.a.c, "}", sb2);
    }
}
