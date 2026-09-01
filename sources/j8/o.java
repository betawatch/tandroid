package j8;

import java.util.Arrays;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
