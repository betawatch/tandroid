package bi;

import android.text.TextUtils;
import j$.util.Objects;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
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
