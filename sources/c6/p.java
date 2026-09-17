package c6;

import java.util.Arrays;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes.dex */
public final class p {
    public final long a;

    public /* synthetic */ p(long j3) {
        this.a = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p) && this.a == ((p) obj).a && n6.l.l(null, null);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), 0, Boolean.FALSE, null});
    }
}
