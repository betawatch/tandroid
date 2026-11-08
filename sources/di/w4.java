package di;

import android.text.TextUtils;
import j$.util.Objects;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class w4 {
    public boolean a = true;
    public boolean b;
    public String c;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && w4.class == obj.getClass()) {
                w4 w4Var = (w4) obj;
                boolean z9 = (TextUtils.isEmpty(this.c) && TextUtils.isEmpty(w4Var.c)) || Objects.equals(this.c, w4Var.c);
                if (this.a != w4Var.a || this.b != w4Var.b || !z9) {
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
