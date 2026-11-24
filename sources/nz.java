// default package

import android.media.AudioAttributes;
import android.os.Build;
import android.os.Bundle;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class nz {
    public static final nz i = new nz(0, 0, 1, 1, false, 0, true);
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
        String str = g8c.a;
        j = "0";
        k = "1";
        l = "2";
        m = "3";
        n = "4";
        o = "5";
        p = "6";
    }

    public nz(int i2, int i3, int i4, int i5, boolean z, int i6, boolean z2) {
        this.a = i2;
        this.b = i3;
        this.c = i4;
        this.d = i5;
        this.e = i6;
        this.f = z;
        this.g = z2;
    }

    public static nz a(Bundle bundle) {
        String str = j;
        int i2 = bundle.containsKey(str) ? bundle.getInt(str) : 0;
        String str2 = k;
        int i3 = bundle.containsKey(str2) ? bundle.getInt(str2) : 0;
        String str3 = l;
        int i4 = bundle.containsKey(str3) ? bundle.getInt(str3) : 1;
        String str4 = m;
        int i5 = bundle.containsKey(str4) ? bundle.getInt(str4) : 1;
        String str5 = n;
        int i6 = bundle.containsKey(str5) ? bundle.getInt(str5) : 0;
        String str6 = o;
        boolean z = bundle.containsKey(str6) ? bundle.getBoolean(str6) : false;
        String str7 = p;
        return new nz(i2, i3, i4, i5, z, i6, bundle.containsKey(str7) ? bundle.getBoolean(str7) : true);
    }

    public final AudioAttributes b() {
        AudioAttributes audioAttributes = this.h;
        if (audioAttributes != null) {
            return audioAttributes;
        }
        AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(this.a).setFlags(this.b).setUsage(this.c);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            rr.p(usage, this.d);
            rr.t(usage, this.g);
        }
        if (i2 >= 32) {
            mz.b(usage, this.e);
            mz.a(usage, this.f);
        }
        AudioAttributes build = usage.build();
        this.h = build;
        return build;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && nz.class == obj.getClass()) {
            nz nzVar = (nz) obj;
            if (this.a == nzVar.a && this.b == nzVar.b && this.c == nzVar.c && this.d == nzVar.d && this.e == nzVar.e && this.f == nzVar.f && this.g == nzVar.g) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((527 + this.a) * 31) + this.b) * 31) + this.c) * 31) + this.d) * 31) + this.e) * 31) + (this.f ? 1 : 0)) * 31) + (this.g ? 1 : 0);
    }
}
