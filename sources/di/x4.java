package di;

import android.text.TextUtils;
import j$.util.Objects;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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
