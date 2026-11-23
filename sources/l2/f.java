package l2;

import a8.ma;
import android.text.TextUtils;
import com.google.android.gms.internal.vision.e2;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class f {
    public final String a;
    public final e2.u b;
    public final e2.u c;
    public final int d;
    public final int e;

    public f(String str, e2.u uVar, e2.u uVar2, int i7, int i10) {
        ma.f(i7 == 0 || i10 == 0);
        ma.f(true ^ TextUtils.isEmpty(str));
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
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (this.d == fVar.d && this.e == fVar.e && this.a.equals(fVar.a) && this.b.equals(fVar.b) && this.c.equals(fVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + e2.h((((527 + this.d) * 31) + this.e) * 31, 31, this.a)) * 31);
    }
}
