package m4;

import android.os.Bundle;
import j$.util.Objects;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class w {
    public final n4.r a;
    public final int b;
    public final int c;
    public final v d;
    public final Bundle e;

    public w(n4.r rVar, int i10, int i11, boolean z10, v vVar, Bundle bundle) {
        this.a = rVar;
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
        n4.r rVar = this.a;
        sb2.append(rVar.a.a);
        sb2.append(", uid=");
        return a1.g.p(sb2, rVar.a.c, "}");
    }
}
