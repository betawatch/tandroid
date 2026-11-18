package f0;

import android.content.LocusId;
import android.os.Build;
import android.text.TextUtils;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class g {
    public final String a;
    public final LocusId b;

    public g(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("id cannot be empty");
        }
        this.a = str;
        if (Build.VERSION.SDK_INT >= 29) {
            this.b = f.a(str);
        } else {
            this.b = null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g.class != obj.getClass()) {
            return false;
        }
        String str = ((g) obj).a;
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
