package k2;

import android.text.TextUtils;
import b8.zb;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class e {
    public final String a;
    public final d2.v b;
    public final d2.v c;
    public final int d;
    public final int e;

    public e(String str, d2.v vVar, d2.v vVar2, int i3, int i10) {
        zb.f(i3 == 0 || i10 == 0);
        zb.f(true ^ TextUtils.isEmpty(str));
        this.a = str;
        vVar.getClass();
        this.b = vVar;
        vVar2.getClass();
        this.c = vVar2;
        this.d = i3;
        this.e = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e.class == obj.getClass()) {
            e eVar = (e) obj;
            if (this.d == eVar.d && this.e == eVar.e && this.a.equals(eVar.a) && this.b.equals(eVar.b) && this.c.equals(eVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + com.google.android.recaptcha.internal.a.g((((527 + this.d) * 31) + this.e) * 31, 31, this.a)) * 31);
    }
}
