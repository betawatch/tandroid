package fi;

import android.text.TextUtils;
import j$.util.Objects;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final class m4 {
    public boolean a = true;
    public boolean b;
    public String c;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && m4.class == obj.getClass()) {
                m4 m4Var = (m4) obj;
                boolean z10 = (TextUtils.isEmpty(this.c) && TextUtils.isEmpty(m4Var.c)) || Objects.equals(this.c, m4Var.c);
                if (this.a != m4Var.a || this.b != m4Var.b || !z10) {
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
