package di;

import android.text.TextUtils;
import j$.util.Objects;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class x4 {
    public boolean a = true;
    public boolean b;
    public String c;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && x4.class == obj.getClass()) {
                x4 x4Var = (x4) obj;
                boolean z9 = (TextUtils.isEmpty(this.c) && TextUtils.isEmpty(x4Var.c)) || Objects.equals(this.c, x4Var.c);
                if (this.a != x4Var.a || this.b != x4Var.b || !z9) {
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
