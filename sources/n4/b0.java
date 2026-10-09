package n4;

import android.text.TextUtils;
import j$.util.Objects;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public class b0 {
    public final String a;
    public final int b;
    public final int c;

    public b0(String str, int i10, int i11) {
        this.a = str;
        this.b = i10;
        this.c = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        int i10 = b0Var.c;
        String str = b0Var.a;
        int i11 = b0Var.b;
        int i12 = this.c;
        String str2 = this.a;
        int i13 = this.b;
        return (i13 < 0 || i11 < 0) ? TextUtils.equals(str2, str) && i12 == i10 : TextUtils.equals(str2, str) && i13 == i11 && i12 == i10;
    }

    public final int hashCode() {
        return Objects.hash(this.a, Integer.valueOf(this.c));
    }
}
