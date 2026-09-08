package c5;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import com.google.android.gms.internal.clearcut.e2;
import java.util.HashMap;
import org.telegram.ui.Cells.p6;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class i implements com.google.android.gms.internal.clearcut.g {
    public String a;

    @Override // com.google.android.gms.internal.clearcut.g
    public Object zzp() {
        Object obj;
        boolean z10;
        String str = this.a;
        ContentResolver contentResolver = com.google.android.gms.internal.clearcut.d.g.getContentResolver();
        Uri uri = e2.a;
        synchronized (e2.class) {
            e2.c(contentResolver);
            obj = e2.k;
        }
        HashMap hashMap = e2.g;
        Boolean bool = Boolean.FALSE;
        Boolean bool2 = (Boolean) e2.a(hashMap, str, bool);
        if (bool2 != null) {
            z10 = bool2.booleanValue();
        } else {
            String b10 = e2.b(contentResolver, str);
            boolean z11 = false;
            if (b10 != null && !b10.equals("")) {
                if (e2.c.matcher(b10).matches()) {
                    bool = Boolean.TRUE;
                    z11 = true;
                } else if (!e2.d.matcher(b10).matches()) {
                    Log.w("Gservices", p6.j("attempt to read gservices key ", str, " (value \"", b10, "\") as boolean"));
                }
                e2.e(obj, hashMap, str, bool);
                z10 = z11;
            }
            bool = bool2;
            e2.e(obj, hashMap, str, bool);
            z10 = z11;
        }
        return Boolean.valueOf(z10);
    }
}
