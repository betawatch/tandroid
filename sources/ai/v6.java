package ai;

import android.text.TextUtils;
import j$.util.Objects;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class v6 {
    public boolean a = true;
    public boolean b;
    public String c;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && v6.class == obj.getClass()) {
                v6 v6Var = (v6) obj;
                boolean z10 = (TextUtils.isEmpty(this.c) && TextUtils.isEmpty(v6Var.c)) || Objects.equals(this.c, v6Var.c);
                if (this.a != v6Var.a || this.b != v6Var.b || !z10) {
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
