package di;

import android.text.TextUtils;
import j$.util.Objects;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
