package gb;

import a5.n;
import java.util.Arrays;
import y5.l;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class a {
    public final String a;
    public final float b;
    public final int c;
    public final String d;

    public a(float f10, int i10, String str, String str2) {
        int i11 = j7.b.a;
        this.a = str == null ? "" : str;
        this.b = f10;
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
        n nVar = new n(a.class.getSimpleName(), 29);
        n nVar2 = new n(28, false);
        ((n) nVar.d).d = nVar2;
        nVar.d = nVar2;
        nVar2.c = this.a;
        nVar2.b = "text";
        String valueOf = String.valueOf(this.b);
        boolean z10 = false;
        j7.a aVar = new j7.a(28, z10);
        ((n) nVar.d).d = aVar;
        nVar.d = aVar;
        aVar.c = valueOf;
        aVar.b = "confidence";
        String valueOf2 = String.valueOf(this.c);
        j7.a aVar2 = new j7.a(28, z10);
        ((n) nVar.d).d = aVar2;
        aVar2.c = valueOf2;
        aVar2.b = "index";
        n nVar3 = new n(28, z10);
        aVar2.d = nVar3;
        nVar.d = nVar3;
        nVar3.c = this.d;
        nVar3.b = "mid";
        return nVar.toString();
    }
}
