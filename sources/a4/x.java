package a4;

import android.text.TextUtils;
import j7.l1;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class x {
    public final String a;
    public final boolean b;
    public final boolean c;

    public x(String str, boolean z10, boolean z11) {
        this.a = str;
        this.b = z10;
        this.c = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != x.class) {
            return false;
        }
        x xVar = (x) obj;
        return TextUtils.equals(this.a, xVar.a) && this.b == xVar.b && this.c == xVar.c;
    }

    public final int hashCode() {
        return ((l1.f(31, 31, this.a) + (this.b ? 1231 : 1237)) * 31) + (this.c ? 1231 : 1237);
    }
}
