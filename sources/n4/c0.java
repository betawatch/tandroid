package n4;

import android.text.TextUtils;
import j$.util.Objects;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public class c0 {
    public final String a;
    public final int b;
    public final int c;

    public c0(String str, int i10, int i11) {
        this.a = str;
        this.b = i10;
        this.c = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        int i10 = c0Var.c;
        String str = c0Var.a;
        int i11 = c0Var.b;
        int i12 = this.c;
        String str2 = this.a;
        int i13 = this.b;
        return (i13 < 0 || i11 < 0) ? TextUtils.equals(str2, str) && i12 == i10 : TextUtils.equals(str2, str) && i13 == i11 && i12 == i10;
    }

    public final int hashCode() {
        return Objects.hash(this.a, Integer.valueOf(this.c));
    }
}
