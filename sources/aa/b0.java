package aa;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import com.google.android.gms.internal.clearcut.d2;
import com.google.android.gms.internal.vision.e2;
import java.util.HashMap;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class b0 implements com.google.android.gms.internal.clearcut.g {
    public String a;

    public /* synthetic */ b0(String str) {
        this.a = str;
    }

    public static b0 a(h2.x xVar) {
        String str;
        xVar.O(2);
        int A = xVar.A();
        int i7 = A >> 1;
        int A2 = ((xVar.A() >> 3) & 31) | ((A & 1) << 5);
        if (i7 == 4 || i7 == 5 || i7 == 7 || i7 == 8) {
            str = "dvhe";
        } else if (i7 == 9) {
            str = "dvav";
        } else {
            if (i7 != 10) {
                return null;
            }
            str = "dav1";
        }
        StringBuilder m10 = e2.m(str);
        m10.append(i7 < 10 ? ".0" : ".");
        m10.append(i7);
        m10.append(A2 < 10 ? ".0" : ".");
        m10.append(A2);
        return new b0(m10.toString());
    }

    @Override // com.google.android.gms.internal.clearcut.g
    public Object zzp() {
        Object obj;
        boolean z10;
        String str = this.a;
        ContentResolver contentResolver = com.google.android.gms.internal.clearcut.d.g.getContentResolver();
        Uri uri = d2.a;
        synchronized (d2.class) {
            d2.c(contentResolver);
            obj = d2.k;
        }
        HashMap hashMap = d2.g;
        Boolean bool = Boolean.FALSE;
        Boolean bool2 = (Boolean) d2.a(hashMap, str, bool);
        if (bool2 != null) {
            z10 = bool2.booleanValue();
        } else {
            String b10 = d2.b(contentResolver, str);
            boolean z11 = false;
            if (b10 != null && !b10.equals("")) {
                if (d2.c.matcher(b10).matches()) {
                    bool = Boolean.TRUE;
                    z11 = true;
                } else if (!d2.d.matcher(b10).matches()) {
                    Log.w("Gservices", p5.c.l("attempt to read gservices key ", str, " (value \"", b10, "\") as boolean"));
                }
                d2.e(obj, hashMap, str, bool);
                z10 = z11;
            }
            bool = bool2;
            d2.e(obj, hashMap, str, bool);
            z10 = z11;
        }
        return Boolean.valueOf(z10);
    }
}
