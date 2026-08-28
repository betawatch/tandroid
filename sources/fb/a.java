package fb;

import a5.m;
import java.util.Arrays;
import x5.l;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class a {
    public final String a;
    public final float b;
    public final int c;
    public final String d;

    public a(float f10, int i9, String str, String str2) {
        int i10 = i7.b.a;
        this.a = str == null ? "" : str;
        this.b = f10;
        this.c = i9;
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
        m mVar = new m(a.class.getSimpleName(), 26);
        m mVar2 = new m(25, false);
        ((m) mVar.d).d = mVar2;
        mVar.d = mVar2;
        mVar2.c = this.a;
        mVar2.b = "text";
        String valueOf = String.valueOf(this.b);
        boolean z10 = false;
        i7.a aVar = new i7.a(25, z10);
        ((m) mVar.d).d = aVar;
        mVar.d = aVar;
        aVar.c = valueOf;
        aVar.b = "confidence";
        String valueOf2 = String.valueOf(this.c);
        i7.a aVar2 = new i7.a(25, z10);
        ((m) mVar.d).d = aVar2;
        aVar2.c = valueOf2;
        aVar2.b = "index";
        m mVar3 = new m(25, z10);
        aVar2.d = mVar3;
        mVar.d = mVar3;
        mVar3.c = this.d;
        mVar3.b = "mid";
        return mVar.toString();
    }
}
