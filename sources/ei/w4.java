package ei;

import android.text.TextUtils;
import j$.util.Objects;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class w4 {
    public boolean a = true;
    public boolean b;
    public String c;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && w4.class == obj.getClass()) {
                w4 w4Var = (w4) obj;
                boolean z10 = (TextUtils.isEmpty(this.c) && TextUtils.isEmpty(w4Var.c)) || Objects.equals(this.c, w4Var.c);
                if (this.a != w4Var.a || this.b != w4Var.b || !z10) {
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
