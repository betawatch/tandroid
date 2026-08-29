package h8;

import java.util.Arrays;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class o implements com.google.android.gms.common.api.b {
    public final int a;

    public o(a5.c cVar) {
        this.a = cVar.a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o) || !z5.l.l(Integer.valueOf(this.a), Integer.valueOf(((o) obj).a)) || !z5.l.l(1, 1) || !z5.l.l(null, null)) {
            return false;
        }
        Boolean bool = Boolean.TRUE;
        return z5.l.l(bool, bool);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), 1, null, Boolean.TRUE});
    }
}
