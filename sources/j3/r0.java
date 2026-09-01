package j3;

import android.net.Uri;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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

    public r0(ja.c cVar) {
        this.a = (Uri) cVar.a;
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
