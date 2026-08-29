package lh;

import android.text.TextUtils;
import j$.util.Objects;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class o4 {
    public boolean a = true;
    public boolean b;
    public String c;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && o4.class == obj.getClass()) {
                o4 o4Var = (o4) obj;
                boolean z10 = (TextUtils.isEmpty(this.c) && TextUtils.isEmpty(o4Var.c)) || Objects.equals(this.c, o4Var.c);
                if (this.a != o4Var.a || this.b != o4Var.b || !z10) {
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
