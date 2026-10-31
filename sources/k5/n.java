package k5;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class n extends v {
    public final u a;
    public final t b;

    public n(u uVar, t tVar) {
        this.a = uVar;
        this.b = tVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v) {
            v vVar = (v) obj;
            u uVar = this.a;
            if (uVar != null ? uVar.equals(((n) vVar).a) : ((n) vVar).a == null) {
                t tVar = this.b;
                if (tVar != null ? tVar.equals(((n) vVar).b) : ((n) vVar).b == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        u uVar = this.a;
        int hashCode = ((uVar == null ? 0 : uVar.hashCode()) ^ 1000003) * 1000003;
        t tVar = this.b;
        return (tVar != null ? tVar.hashCode() : 0) ^ hashCode;
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.a + ", mobileSubtype=" + this.b + "}";
    }
}
