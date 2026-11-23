package fi;

import android.text.TextUtils;
import j$.util.Objects;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final class n4 {
    public boolean a = true;
    public boolean b;
    public String c;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && n4.class == obj.getClass()) {
                n4 n4Var = (n4) obj;
                boolean z10 = (TextUtils.isEmpty(this.c) && TextUtils.isEmpty(n4Var.c)) || Objects.equals(this.c, n4Var.c);
                if (this.a != n4Var.a || this.b != n4Var.b || !z10) {
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
