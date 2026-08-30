package d4;

import android.text.TextUtils;
import kh.a2;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class u {
    public final String a;
    public final boolean b;
    public final boolean c;

    public u(String str, boolean z4, boolean z10) {
        this.a = str;
        this.b = z4;
        this.c = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != u.class) {
            return false;
        }
        u uVar = (u) obj;
        return TextUtils.equals(this.a, uVar.a) && this.b == uVar.b && this.c == uVar.c;
    }

    public final int hashCode() {
        return ((a2.e(31, 31, this.a) + (this.b ? 1231 : 1237)) * 31) + (this.c ? 1231 : 1237);
    }
}
