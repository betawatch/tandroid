// default package

import android.text.TextUtils;
import j$.util.Objects;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
