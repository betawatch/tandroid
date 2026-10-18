package m4;

import android.os.Bundle;
import j$.util.Objects;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public final class v {
    public final n4.t a;
    public final int b;
    public final int c;
    public final u d;
    public final Bundle e;

    public v(n4.t tVar, int i10, int i11, boolean z10, u uVar, Bundle bundle) {
        this.a = tVar;
        this.b = i10;
        this.c = i11;
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
        n4.t tVar = this.a;
        sb2.append(tVar.a.a);
        sb2.append(", uid=");
        return a1.g.n(tVar.a.c, "}", sb2);
    }
}
