package fi;

import android.text.TextUtils;
import j$.util.Objects;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final class n4 {
    public boolean a = true;
    public boolean b;
    public String c;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && n4.class == obj.getClass()) {
                n4 n4Var = (n4) obj;
                boolean z10 = (TextUtils.isEmpty(this.c) && TextUtils.isEmpty(n4Var.c)) || Objects.equals(this.c, n4Var.c);
                if (this.a != n4Var.a || this.b != n4Var.b || !z10) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.a), Boolean.valueOf(this.b), this.c);
    }
}
