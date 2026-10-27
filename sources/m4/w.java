package m4;

import android.os.Bundle;
import j$.util.Objects;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class w {
    public final n4.t a;
    public final int b;
    public final int c;
    public final v d;
    public final Bundle e;

    public w(n4.t tVar, int i10, int i11, boolean z10, v vVar, Bundle bundle) {
        this.a = tVar;
        this.b = i10;
        this.c = i11;
        this.d = vVar;
        this.e = bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof w)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        w wVar = (w) obj;
        v vVar = wVar.d;
        v vVar2 = this.d;
        return (vVar2 == null && vVar == null) ? this.a.equals(wVar.a) : Objects.equals(vVar2, vVar);
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
