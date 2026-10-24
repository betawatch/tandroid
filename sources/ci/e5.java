package ci;

import android.text.TextUtils;
import j$.util.Objects;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final class e5 {
    public boolean a = true;
    public boolean b;
    public String c;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && e5.class == obj.getClass()) {
                e5 e5Var = (e5) obj;
                boolean z10 = (TextUtils.isEmpty(this.c) && TextUtils.isEmpty(e5Var.c)) || Objects.equals(this.c, e5Var.c);
                if (this.a != e5Var.a || this.b != e5Var.b || !z10) {
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
