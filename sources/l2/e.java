package l2;

import a8.la;
import android.text.TextUtils;
import com.google.android.gms.internal.vision.e2;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final class e {
    public final String a;
    public final e2.u b;
    public final e2.u c;
    public final int d;
    public final int e;

    public e(String str, e2.u uVar, e2.u uVar2, int i7, int i10) {
        la.f(i7 == 0 || i10 == 0);
        la.f(true ^ TextUtils.isEmpty(str));
        this.a = str;
        uVar.getClass();
        this.b = uVar;
        uVar2.getClass();
        this.c = uVar2;
        this.d = i7;
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
        return this.c.hashCode() + ((this.b.hashCode() + e2.h((((527 + this.d) * 31) + this.e) * 31, 31, this.a)) * 31);
    }
}
