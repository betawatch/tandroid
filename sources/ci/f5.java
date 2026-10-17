package ci;

import android.text.TextUtils;
import j$.util.Objects;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final class f5 {
    public boolean a = true;
    public boolean b;
    public String c;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && f5.class == obj.getClass()) {
                f5 f5Var = (f5) obj;
                boolean z10 = (TextUtils.isEmpty(this.c) && TextUtils.isEmpty(f5Var.c)) || Objects.equals(this.c, f5Var.c);
                if (this.a != f5Var.a || this.b != f5Var.b || !z10) {
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
