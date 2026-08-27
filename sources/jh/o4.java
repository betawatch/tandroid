package jh;

import android.text.TextUtils;
import j$.util.Objects;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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
