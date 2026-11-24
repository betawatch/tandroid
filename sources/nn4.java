// default package

import j$.util.Objects;
import java.util.List;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class nn4 {
    public String a;
    public String b;
    public List c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nn4)) {
            return false;
        }
        nn4 nn4Var = (nn4) obj;
        return Objects.equals(this.a, nn4Var.a) && Objects.equals(this.b, nn4Var.b) && Objects.equals(this.c, nn4Var.c);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c);
    }
}
