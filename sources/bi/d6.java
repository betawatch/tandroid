package bi;

import android.text.TextUtils;
import j$.util.Objects;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final class d6 {
    public boolean a = true;
    public boolean b;
    public String c;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && d6.class == obj.getClass()) {
                d6 d6Var = (d6) obj;
                boolean z10 = (TextUtils.isEmpty(this.c) && TextUtils.isEmpty(d6Var.c)) || Objects.equals(this.c, d6Var.c);
                if (this.a != d6Var.a || this.b != d6Var.b || !z10) {
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
