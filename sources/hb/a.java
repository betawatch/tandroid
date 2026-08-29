package hb;

import androidx.biometric.e;
import java.util.Arrays;
import z5.l;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class a {
    public final String a;
    public final float b;
    public final int c;
    public final String d;

    public a(float f9, int i10, String str, String str2) {
        int i11 = k7.b.a;
        this.a = str == null ? "" : str;
        this.b = f9;
        this.c = i10;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.l(this.a, aVar.a) && Float.compare(this.b, aVar.b) == 0 && this.c == aVar.c && l.l(this.d, aVar.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Float.valueOf(this.b), Integer.valueOf(this.c), this.d});
    }

    public final String toString() {
        e eVar = new e(a.class.getSimpleName(), 27);
        e eVar2 = new e(26, false);
        ((e) eVar.d).d = eVar2;
        eVar.d = eVar2;
        eVar2.c = this.a;
        eVar2.b = "text";
        String valueOf = String.valueOf(this.b);
        boolean z10 = false;
        k7.a aVar = new k7.a(26, z10);
        ((e) eVar.d).d = aVar;
        eVar.d = aVar;
        aVar.c = valueOf;
        aVar.b = "confidence";
        String valueOf2 = String.valueOf(this.c);
        k7.a aVar2 = new k7.a(26, z10);
        ((e) eVar.d).d = aVar2;
        aVar2.c = valueOf2;
        aVar2.b = "index";
        e eVar3 = new e(26, z10);
        aVar2.d = eVar3;
        eVar.d = eVar3;
        eVar3.c = this.d;
        eVar3.b = "mid";
        return eVar.toString();
    }
}
