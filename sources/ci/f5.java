package ci;

import android.text.TextUtils;
import j$.util.Objects;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
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
