package com.google.android.gms.internal.clearcut;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import java.util.HashMap;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements h, fb.n {
    public final String a;

    public /* synthetic */ e(String str) {
        this.a = str;
    }

    public static e a(e2.v vVar) {
        String str;
        vVar.K(2);
        int x10 = vVar.x();
        int i10 = x10 >> 1;
        int x11 = ((vVar.x() >> 3) & 31) | ((x10 & 1) << 5);
        if (i10 == 4 || i10 == 5 || i10 == 7 || i10 == 8) {
            str = "dvhe";
        } else if (i10 == 9) {
            str = "dvav";
        } else {
            if (i10 != 10) {
                return null;
            }
            str = "dav1";
        }
        StringBuilder u10 = a4.a.u(str);
        u10.append(i10 < 10 ? ".0" : ".");
        u10.append(i10);
        u10.append(x11 < 10 ? ".0" : ".");
        u10.append(x11);
        return new e(u10.toString());
    }

    @Override // fb.n
    public Object p2() {
        throw new db.j(this.a);
    }

    @Override // com.google.android.gms.internal.clearcut.h
    public Object zzp() {
        Object obj;
        boolean z10;
        String str = this.a;
        ContentResolver contentResolver = d.g.getContentResolver();
        Uri uri = f2.a;
        synchronized (f2.class) {
            f2.c(contentResolver);
            obj = f2.k;
        }
        HashMap hashMap = f2.g;
        Boolean bool = Boolean.FALSE;
        Boolean bool2 = (Boolean) f2.a(hashMap, str, bool);
        if (bool2 != null) {
            z10 = bool2.booleanValue();
        } else {
            String b10 = f2.b(contentResolver, str);
            boolean z11 = false;
            if (b10 != null && !b10.equals("")) {
                if (f2.c.matcher(b10).matches()) {
                    bool = Boolean.TRUE;
                    z11 = true;
                } else if (!f2.d.matcher(b10).matches()) {
                    Log.w("Gservices", org.telegram.ui.Cells.c1.i("attempt to read gservices key ", str, " (value \"", b10, "\") as boolean"));
                }
                f2.e(obj, hashMap, str, bool);
                z10 = z11;
            }
            bool = bool2;
            f2.e(obj, hashMap, str, bool);
            z10 = z11;
        }
        return Boolean.valueOf(z10);
    }
}
