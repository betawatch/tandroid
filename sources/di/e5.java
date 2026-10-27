package di;

import android.text.TextUtils;
import j$.util.Objects;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
