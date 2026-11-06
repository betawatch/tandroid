package e2;

import android.media.AudioAttributes;
import android.os.Build;
import android.os.Bundle;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class e {
    public static final e i = new e(0, 0, 1, 1, false, 0, true);
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
        String str = h2.m0.a;
        j = Integer.toString(0, 36);
        k = Integer.toString(1, 36);
        l = Integer.toString(2, 36);
        m = Integer.toString(3, 36);
        n = Integer.toString(4, 36);
        o = Integer.toString(5, 36);
        p = Integer.toString(6, 36);
    }

    public e(int i7, int i10, int i11, int i12, boolean z9, int i13, boolean z10) {
        this.a = i7;
        this.b = i10;
        this.c = i11;
        this.d = i12;
        this.e = i13;
        this.f = z9;
        this.g = z10;
    }

    public static e a(Bundle bundle) {
        String str = j;
        int i7 = bundle.containsKey(str) ? bundle.getInt(str) : 0;
        String str2 = k;
        int i10 = bundle.containsKey(str2) ? bundle.getInt(str2) : 0;
        String str3 = l;
        int i11 = bundle.containsKey(str3) ? bundle.getInt(str3) : 1;
        String str4 = m;
        int i12 = bundle.containsKey(str4) ? bundle.getInt(str4) : 1;
        String str5 = n;
        int i13 = bundle.containsKey(str5) ? bundle.getInt(str5) : 0;
        String str6 = o;
        boolean z9 = bundle.containsKey(str6) ? bundle.getBoolean(str6) : false;
        String str7 = p;
        return new e(i7, i10, i11, i12, z9, i13, bundle.containsKey(str7) ? bundle.getBoolean(str7) : true);
    }

    public final AudioAttributes b() {
        if (this.h == null) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(this.a).setFlags(this.b).setUsage(this.c);
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 29) {
                ab.x.k(usage, this.d);
                ab.x.a(usage, this.g);
            }
            if (i7 >= 32) {
                d.b(usage, this.e);
                d.a(usage, this.f);
            }
            this.h = usage.build();
        }
        return this.h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e.class == obj.getClass()) {
            e eVar = (e) obj;
            if (this.a == eVar.a && this.b == eVar.b && this.c == eVar.c && this.d == eVar.d && this.e == eVar.e && this.f == eVar.f && this.g == eVar.g) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((527 + this.a) * 31) + this.b) * 31) + this.c) * 31) + this.d) * 31) + this.e) * 31) + (this.f ? 1 : 0)) * 31) + (this.g ? 1 : 0);
    }
}
