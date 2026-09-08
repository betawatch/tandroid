package b2;

import j$.util.Objects;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class w {
    public static final String c;
    public static final String d;
    public final String a;
    public final String b;

    static {
        String str = e2.d0.a;
        c = Integer.toString(0, 36);
        d = Integer.toString(1, 36);
    }

    public w(String str, String str2) {
        this.a = e2.d0.R(str);
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && w.class == obj.getClass()) {
            w wVar = (w) obj;
            if (Objects.equals(this.a, wVar.a) && Objects.equals(this.b, wVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        String str = this.a;
        return hashCode + (str != null ? str.hashCode() : 0);
    }
}
