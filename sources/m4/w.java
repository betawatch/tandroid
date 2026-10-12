package m4;

import android.os.Bundle;
import j$.util.Objects;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
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
