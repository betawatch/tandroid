package j3;

import android.net.Uri;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class r0 implements g {
    public static final String b;
    public static final q0 c;
    public final Uri a;

    static {
        int i10 = h5.d0.a;
        b = Integer.toString(0, 36);
        c = new q0(0);
    }

    public r0(a3.c cVar) {
        this.a = (Uri) cVar.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r0) || !this.a.equals(((r0) obj).a)) {
            return false;
        }
        int i10 = h5.d0.a;
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }
}
