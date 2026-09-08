package f0;

import android.content.LocusId;
import android.os.Build;
import android.text.TextUtils;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class h {
    public final String a;
    public final LocusId b;

    public h(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("id cannot be empty");
        }
        this.a = str;
        if (Build.VERSION.SDK_INT >= 29) {
            this.b = g.a(str);
        } else {
            this.b = null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h.class != obj.getClass()) {
            return false;
        }
        String str = ((h) obj).a;
        String str2 = this.a;
        return str2 == null ? str == null : str2.equals(str);
    }

    public final int hashCode() {
        String str = this.a;
        return 31 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LocusIdCompat[");
        sb2.append(this.a.length() + "_chars");
        sb2.append("]");
        return sb2.toString();
    }
}
