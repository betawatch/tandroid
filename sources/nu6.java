// default package

import java.util.Arrays;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class nu6 {
    public final long a;

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof nu6) && this.a == ((nu6) obj).a && cqe.a(null, null);
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), 0, Boolean.FALSE, null});
    }
}
