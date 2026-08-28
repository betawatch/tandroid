package n4;

import g7.c0;
import java.util.Arrays;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class b {
    public final String a;
    public final String b;
    public final int c;
    public final int d;

    public b(int i9, int i10, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = i9;
        this.d = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.c == bVar.c && this.d == bVar.d && c0.a(this.a, bVar.a) && c0.a(this.b, bVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Integer.valueOf(this.c), Integer.valueOf(this.d)});
    }
}
