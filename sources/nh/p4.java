package nh;

import android.text.TextUtils;
import j$.util.Objects;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class p4 {
    public boolean a = true;
    public boolean b;
    public String c;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && p4.class == obj.getClass()) {
                p4 p4Var = (p4) obj;
                boolean z4 = (TextUtils.isEmpty(this.c) && TextUtils.isEmpty(p4Var.c)) || Objects.equals(this.c, p4Var.c);
                if (this.a != p4Var.a || this.b != p4Var.b || !z4) {
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
