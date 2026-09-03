package nh;

import android.text.TextUtils;
import j$.util.Objects;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
