package i2;

import android.text.TextUtils;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes.dex */
public final class h {
    public final String a;
    public final b2.s b;
    public final b2.s c;
    public final int d;
    public final int e;

    public h(String str, b2.s sVar, b2.s sVar2, int i10, int i11) {
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
        if (obj != null && h.class == obj.getClass()) {
            h hVar = (h) obj;
            if (this.d == hVar.d && this.e == hVar.e && this.a.equals(hVar.a) && this.b.equals(hVar.b) && this.c.equals(hVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + a4.a.h((((527 + this.d) * 31) + this.e) * 31, 31, this.a)) * 31);
    }
}
