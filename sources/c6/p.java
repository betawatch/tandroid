package c6;

import java.util.Arrays;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
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
