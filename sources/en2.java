// default package

import j$.util.Objects;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class en2 extends wl5 {
    public final String b;
    public final String c;
    public final String d;

    public en2(String str, String str2, String str3) {
        super("COMM");
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || en2.class != obj.getClass()) {
            return false;
        }
        en2 en2Var = (en2) obj;
        return this.c.equals(en2Var.c) && this.b.equals(en2Var.b) && Objects.equals(this.d, en2Var.d);
    }

    public final int hashCode() {
        int j = bs2.j(bs2.j(527, 31, this.b), 31, this.c);
        String str = this.d;
        return j + (str != null ? str.hashCode() : 0);
    }

    @Override // wl5
    public final String toString() {
        return this.a + ": language=" + this.b + ", description=" + this.c + ", text=" + this.d;
    }
}
