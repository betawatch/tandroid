package m3;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class s {
    public final u a;
    public final u b;

    public s(u uVar, u uVar2) {
        this.a = uVar;
        this.b = uVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && s.class == obj.getClass()) {
            s sVar = (s) obj;
            if (this.a.equals(sVar.a) && this.b.equals(sVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("[");
        u uVar = this.a;
        sb2.append(uVar);
        u uVar2 = this.b;
        if (uVar.equals(uVar2)) {
            str = "";
        } else {
            str = ", " + uVar2;
        }
        return aa.d.r(sb2, str, "]");
    }
}
