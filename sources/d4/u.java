package d4;

import android.text.TextUtils;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
        return ((l.d.e(31, 31, this.a) + (this.b ? 1231 : 1237)) * 31) + (this.c ? 1231 : 1237);
    }
}
