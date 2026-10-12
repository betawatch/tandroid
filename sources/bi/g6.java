package bi;

import android.text.TextUtils;
import j$.util.Objects;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class g6 {
    public boolean a = true;
    public boolean b;
    public String c;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && g6.class == obj.getClass()) {
                g6 g6Var = (g6) obj;
                boolean z10 = (TextUtils.isEmpty(this.c) && TextUtils.isEmpty(g6Var.c)) || Objects.equals(this.c, g6Var.c);
                if (this.a != g6Var.a || this.b != g6Var.b || !z10) {
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
