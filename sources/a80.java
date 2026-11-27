// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
