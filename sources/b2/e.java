package b2;

import android.media.AudioAttributes;
import android.os.Build;
import android.os.Bundle;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class e {
    public static final e h = new e(0, 0, 1, 1, 0, false);
    public static final String i;
    public static final String j;
    public static final String k;
    public static final String l;
    public static final String m;
    public static final String n;
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final boolean f;
    public w0 g;

    static {
        String str = e2.d0.a;
        i = Integer.toString(0, 36);
        j = Integer.toString(1, 36);
        k = Integer.toString(2, 36);
        l = Integer.toString(3, 36);
        m = Integer.toString(4, 36);
        n = Integer.toString(5, 36);
    }

    public e(int i10, int i11, int i12, int i13, int i14, boolean z10) {
        this.a = i10;
        this.b = i11;
        this.c = i12;
        this.d = i13;
        this.e = i14;
        this.f = z10;
    }

    public static e a(Bundle bundle) {
        String str = i;
        int i10 = bundle.containsKey(str) ? bundle.getInt(str) : 0;
        String str2 = j;
        int i11 = bundle.containsKey(str2) ? bundle.getInt(str2) : 0;
        String str3 = k;
        int i12 = bundle.containsKey(str3) ? bundle.getInt(str3) : 1;
        String str4 = l;
        int i13 = bundle.containsKey(str4) ? bundle.getInt(str4) : 1;
        String str5 = m;
        int i14 = bundle.containsKey(str5) ? bundle.getInt(str5) : 0;
        String str6 = n;
        return new e(i10, i11, i12, i13, i14, bundle.containsKey(str6) ? bundle.getBoolean(str6) : false);
    }

    public final w0 b() {
        if (this.g == null) {
            w0 w0Var = new w0();
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(this.a).setFlags(this.b).setUsage(this.c);
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 29) {
                c.k(usage, this.d);
            }
            if (i10 >= 32) {
                d.b(usage, this.e);
                d.a(usage, this.f);
            }
            w0Var.a = usage.build();
            this.g = w0Var;
        }
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e.class == obj.getClass()) {
            e eVar = (e) obj;
            if (this.a == eVar.a && this.b == eVar.b && this.c == eVar.c && this.d == eVar.d && this.e == eVar.e && this.f == eVar.f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((527 + this.a) * 31) + this.b) * 31) + this.c) * 31) + this.d) * 31) + this.e) * 31) + (this.f ? 1 : 0);
    }
}
