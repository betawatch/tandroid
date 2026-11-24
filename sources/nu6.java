// default package

import java.util.Arrays;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
