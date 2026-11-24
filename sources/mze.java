// default package

import java.util.Arrays;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class mze {
    public final Float a;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mze) {
            return fse.a(null, null) && fse.a(this.a, ((mze) obj).a) && fse.a(null, null);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, this.a, null});
    }
}
