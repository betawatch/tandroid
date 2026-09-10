package com.google.android.gms.internal.clearcut;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import java.util.HashMap;
import org.telegram.ui.Cells.r6;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements h, fb.n {
    public final String a;

    public /* synthetic */ e(String str) {
        this.a = str;
    }

    @Override // fb.n
    public Object n2() {
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
                    Log.w("Gservices", r6.j("attempt to read gservices key ", str, " (value \"", b10, "\") as boolean"));
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
