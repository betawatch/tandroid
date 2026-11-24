// default package

import android.os.Bundle;
import android.util.Log;
import java.math.BigInteger;
import java.util.Map;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class e0f {
    public static final dc6 d = new dc6("ApplicationAnalyticsUtils", null);
    public static final String e = "21.4.0";
    public final String a;
    public final Map b;
    public final Map c;

    public e0f(String str, Bundle bundle) {
        this.a = str;
        this.b = cze.a("com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_ERROR", bundle);
        this.c = cze.a("com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_CHANGE_REASON", bundle);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final y3f a(nwe nweVar, int i) {
        int i2;
        Map map;
        int i3;
        w3f b = b(nweVar);
        k3f m = l3f.m(b.d());
        Map map2 = this.c;
        if (map2 != null) {
            Integer valueOf = Integer.valueOf(i);
            if (map2.containsKey(valueOf)) {
                Integer num = (Integer) map2.get(valueOf);
                fre.h(num);
                i2 = num.intValue();
                m.c();
                l3f.r((l3f) m.b, i2);
                map = this.b;
                if (map != null) {
                    Integer valueOf2 = Integer.valueOf(i);
                    if (map.containsKey(valueOf2)) {
                        Integer num2 = (Integer) map.get(valueOf2);
                        fre.h(num2);
                        i3 = num2.intValue();
                        m.c();
                        l3f.s((l3f) m.b, i3);
                        b.e((l3f) m.a());
                        return (y3f) b.a();
                    }
                }
                i3 = i + 10000;
                m.c();
                l3f.s((l3f) m.b, i3);
                b.e((l3f) m.a());
                return (y3f) b.a();
            }
        }
        i2 = i + 10000;
        m.c();
        l3f.r((l3f) m.b, i2);
        map = this.b;
        if (map != null) {
        }
        i3 = i + 10000;
        m.c();
        l3f.s((l3f) m.b, i3);
        b.e((l3f) m.a());
        return (y3f) b.a();
    }

    public final w3f b(nwe nweVar) {
        long j;
        w3f m = y3f.m();
        long j2 = nweVar.d;
        m.c();
        y3f.t((y3f) m.b, j2);
        int i = nweVar.e;
        nweVar.e = i + 1;
        m.c();
        y3f.o((y3f) m.b, i);
        String str = nweVar.c;
        if (str != null) {
            m.c();
            y3f.y((y3f) m.b, str);
        }
        String str2 = nweVar.h;
        if (str2 != null) {
            m.c();
            y3f.u((y3f) m.b, str2);
        }
        f3f l = i3f.l();
        l.c();
        i3f.n((i3f) l.b, e);
        l.c();
        i3f.m((i3f) l.b, this.a);
        i3f i3fVar = (i3f) l.a();
        m.c();
        y3f.r((y3f) m.b, i3fVar);
        k3f l2 = l3f.l();
        if (nweVar.b != null) {
            f6f l3 = h6f.l();
            String str3 = nweVar.b;
            l3.c();
            h6f.m((h6f) l3.b, str3);
            h6f h6fVar = (h6f) l3.a();
            l2.c();
            l3f.o((l3f) l2.b, h6fVar);
        }
        l2.c();
        l3f.p((l3f) l2.b, false);
        String str4 = nweVar.f;
        if (str4 != null) {
            try {
                String replace = str4.replace("-", "");
                j = new BigInteger(replace.substring(0, Math.min(16, replace.length())), 16).longValue();
            } catch (NumberFormatException e2) {
                Object[] objArr = {str4};
                dc6 dc6Var = d;
                Log.w(dc6Var.a, dc6Var.d("receiverSessionId %s is not valid for hash", objArr), e2);
                j = 0;
            }
            l2.c();
            l3f.q((l3f) l2.b, j);
        }
        int i2 = nweVar.g;
        l2.c();
        l3f.t((l3f) l2.b, i2);
        boolean z = nweVar.a.c == 2;
        l2.c();
        l3f.u((l3f) l2.b, z);
        boolean z2 = nweVar.i;
        l2.c();
        l3f.x((l3f) l2.b, z2);
        m.c();
        y3f.p((y3f) m.b, (l3f) l2.a());
        return m;
    }
}
