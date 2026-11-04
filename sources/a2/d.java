package a2;

import android.text.TextUtils;
import j$.util.Objects;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public class d {
    public final String a;
    public final int b;
    public final int c;

    public d(String str, int i3, int i10) {
        this.a = str;
        this.b = i3;
        this.c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        int i3 = dVar.c;
        String str = dVar.a;
        int i10 = dVar.b;
        int i11 = this.c;
        String str2 = this.a;
        int i12 = this.b;
        return (i12 < 0 || i10 < 0) ? TextUtils.equals(str2, str) && i11 == i3 : TextUtils.equals(str2, str) && i12 == i10 && i11 == i3;
    }

    public final int hashCode() {
        return Objects.hash(this.a, Integer.valueOf(this.c));
    }
}
