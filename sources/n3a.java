// default package

import android.text.TextUtils;
import j$.util.Objects;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final class n3a {
    public boolean a = true;
    public boolean b;
    public String c;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && n3a.class == obj.getClass()) {
                n3a n3aVar = (n3a) obj;
                boolean z = (TextUtils.isEmpty(this.c) && TextUtils.isEmpty(n3aVar.c)) || Objects.equals(this.c, n3aVar.c);
                if (this.a != n3aVar.a || this.b != n3aVar.b || !z) {
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
