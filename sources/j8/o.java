package j8;

import java.util.Arrays;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class o implements com.google.android.gms.common.api.b {
    public final int a;

    public o(c5.c cVar) {
        this.a = cVar.a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o) || !b6.m.l(Integer.valueOf(this.a), Integer.valueOf(((o) obj).a)) || !b6.m.l(1, 1) || !b6.m.l(null, null)) {
            return false;
        }
        Boolean bool = Boolean.TRUE;
        return b6.m.l(bool, bool);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), 1, null, Boolean.TRUE});
    }
}
