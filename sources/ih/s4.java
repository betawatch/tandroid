package ih;

import android.text.TextUtils;
import j$.util.Objects;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class s4 {
    public boolean a = true;
    public boolean b;
    public String c;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && s4.class == obj.getClass()) {
                s4 s4Var = (s4) obj;
                boolean z10 = (TextUtils.isEmpty(this.c) && TextUtils.isEmpty(s4Var.c)) || Objects.equals(this.c, s4Var.c);
                if (this.a != s4Var.a || this.b != s4Var.b || !z10) {
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
