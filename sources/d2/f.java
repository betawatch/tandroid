package d2;

import android.media.AudioAttributes;
import android.os.Build;
import android.os.Bundle;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class f {
    public static final f i = new f(0, 0, 1, 1, false, 0, true);
    public static final String j;
    public static final String k;
    public static final String l;
    public static final String m;
    public static final String n;
    public static final String o;
    public static final String p;
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final boolean f;
    public final boolean g;
    public AudioAttributes h;

    static {
        String str = g2.n0.a;
        j = Integer.toString(0, 36);
        k = Integer.toString(1, 36);
        l = Integer.toString(2, 36);
        m = Integer.toString(3, 36);
        n = Integer.toString(4, 36);
        o = Integer.toString(5, 36);
        p = Integer.toString(6, 36);
    }

    public f(int i3, int i10, int i11, int i12, boolean z10, int i13, boolean z11) {
        this.a = i3;
        this.b = i10;
        this.c = i11;
        this.d = i12;
        this.e = i13;
        this.f = z10;
        this.g = z11;
    }

    public static f a(Bundle bundle) {
        String str = j;
        int i3 = bundle.containsKey(str) ? bundle.getInt(str) : 0;
        String str2 = k;
        int i10 = bundle.containsKey(str2) ? bundle.getInt(str2) : 0;
        String str3 = l;
        int i11 = bundle.containsKey(str3) ? bundle.getInt(str3) : 1;
        String str4 = m;
        int i12 = bundle.containsKey(str4) ? bundle.getInt(str4) : 1;
        String str5 = n;
        int i13 = bundle.containsKey(str5) ? bundle.getInt(str5) : 0;
        String str6 = o;
        boolean z10 = bundle.containsKey(str6) ? bundle.getBoolean(str6) : false;
        String str7 = p;
        return new f(i3, i10, i11, i12, z10, i13, bundle.containsKey(str7) ? bundle.getBoolean(str7) : true);
    }

    public final AudioAttributes b() {
        if (this.h == null) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(this.a).setFlags(this.b).setUsage(this.c);
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 29) {
                d.k(usage, this.d);
                d.a(usage, this.g);
            }
            if (i3 >= 32) {
                e.b(usage, this.e);
                e.a(usage, this.f);
            }
            this.h = usage.build();
        }
        return this.h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (this.a == fVar.a && this.b == fVar.b && this.c == fVar.c && this.d == fVar.d && this.e == fVar.e && this.f == fVar.f && this.g == fVar.g) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((527 + this.a) * 31) + this.b) * 31) + this.c) * 31) + this.d) * 31) + this.e) * 31) + (this.f ? 1 : 0)) * 31) + (this.g ? 1 : 0);
    }
}
