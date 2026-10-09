package m4;

import android.os.Bundle;
import j$.util.Objects;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class r {
    public final n4.z a;
    public final int b;
    public final int c;
    public final q d;
    public final Bundle e;

    public r(n4.z zVar, int i10, int i11, boolean z10, q qVar, Bundle bundle) {
        this.a = zVar;
        this.b = i10;
        this.c = i11;
        this.d = qVar;
        this.e = bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof r)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        r rVar = (r) obj;
        q qVar = rVar.d;
        q qVar2 = this.d;
        return (qVar2 == null && qVar == null) ? this.a.equals(rVar.a) : Objects.equals(qVar2, qVar);
    }

    public final int hashCode() {
        return Objects.hash(this.d, this.a);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ControllerInfo {pkg=");
        n4.z zVar = this.a;
        sb2.append(zVar.a.a);
        sb2.append(", uid=");
        return a1.g.o(zVar.a.c, "}", sb2);
    }
}
