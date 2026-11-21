package aa;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import com.google.android.gms.internal.clearcut.d2;
import java.util.HashMap;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final class b0 implements com.google.android.gms.internal.clearcut.g {
    public String a;

    public b0(String str) {
        this.a = str;
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
