package i2;

import android.text.TextUtils;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class i {
    public final String a;
    public final b2.s b;
    public final b2.s c;
    public final int d;
    public final int e;

    public i(String str, b2.s sVar, b2.s sVar2, int i10, int i11) {
        e2.d.b(i10 == 0 || i11 == 0);
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException();
        }
        this.a = str;
        sVar.getClass();
        this.b = sVar;
        sVar2.getClass();
        this.c = sVar2;
        this.d = i10;
        this.e = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i.class == obj.getClass()) {
            i iVar = (i) obj;
            if (this.d == iVar.d && this.e == iVar.e && this.a.equals(iVar.a) && this.b.equals(iVar.b) && this.c.equals(iVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + a4.a.h((((527 + this.d) * 31) + this.e) * 31, 31, this.a)) * 31);
    }
}
