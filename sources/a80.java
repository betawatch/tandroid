// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class a80 extends bq2 {
    public final v90 a;

    public a80(v90 v90Var) {
        aq2 aq2Var = aq2.a;
        this.a = v90Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bq2)) {
            return false;
        }
        if (!this.a.equals(((a80) ((bq2) obj)).a)) {
            return false;
        }
        Object obj2 = aq2.a;
        return obj2.equals(obj2);
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ aq2.a.hashCode();
    }

    public final String toString() {
        return "ComplianceData{privacyContext=" + this.a + ", productIdOrigin=" + aq2.a + "}";
    }
}
