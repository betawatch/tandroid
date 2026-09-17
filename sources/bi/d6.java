package bi;

import android.text.TextUtils;
import j$.util.Objects;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
