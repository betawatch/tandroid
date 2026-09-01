package oh;

import android.text.TextUtils;
import j$.util.Objects;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final class q4 {
    public boolean a = true;
    public boolean b;
    public String c;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && q4.class == obj.getClass()) {
                q4 q4Var = (q4) obj;
                boolean z4 = (TextUtils.isEmpty(this.c) && TextUtils.isEmpty(q4Var.c)) || Objects.equals(this.c, q4Var.c);
                if (this.a != q4Var.a || this.b != q4Var.b || !z4) {
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
