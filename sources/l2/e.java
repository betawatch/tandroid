package l2;

import a8.ja;
import android.text.TextUtils;
import com.google.android.gms.internal.vision.e2;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final class e {
    public final String a;
    public final e2.u b;
    public final e2.u c;
    public final int d;
    public final int e;

    public e(String str, e2.u uVar, e2.u uVar2, int i7, int i10) {
        ja.f(i7 == 0 || i10 == 0);
        ja.f(true ^ TextUtils.isEmpty(str));
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
