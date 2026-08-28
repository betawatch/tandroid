package f2;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class a {
    public int a;
    public int b;
    public Object c;
    public int d;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            int i9 = this.a;
            if (i9 != aVar.a) {
                return false;
            }
            if (i9 != 8 || Math.abs(this.d - this.b) != 1 || this.d != aVar.b || this.b != aVar.d) {
                if (this.d != aVar.d || this.b != aVar.b) {
                    return false;
                }
                Object obj2 = this.c;
                if (obj2 != null) {
                    if (!obj2.equals(aVar.c)) {
                        return false;
                    }
                } else if (aVar.c != null) {
                    return false;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        return (((this.a * 31) + this.b) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("[");
        int i9 = this.a;
        sb2.append(i9 != 1 ? i9 != 2 ? i9 != 4 ? i9 != 8 ? "??" : "mv" : "up" : "rm" : "add");
        sb2.append(",s:");
        sb2.append(this.b);
        sb2.append("c:");
        sb2.append(this.d);
        sb2.append(",p:");
        sb2.append(this.c);
        sb2.append("]");
        return sb2.toString();
    }
}
