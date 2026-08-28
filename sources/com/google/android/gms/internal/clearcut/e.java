package com.google.android.gms.internal.clearcut;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import java.util.HashMap;
import org.telegram.ui.Cells.j2;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements h, na.n {
    public final String a;

    public /* synthetic */ e(String str) {
        this.a = str;
    }

    @Override // na.n
    public Object Y1() {
        throw new la.j(this.a);
    }

    @Override // com.google.android.gms.internal.clearcut.h
    public Object zzp() {
        Object obj;
        boolean z10;
        String str = this.a;
        ContentResolver contentResolver = d.g.getContentResolver();
        Uri uri = g2.a;
        synchronized (g2.class) {
            g2.c(contentResolver);
            obj = g2.k;
        }
        HashMap hashMap = g2.g;
        Boolean bool = Boolean.FALSE;
        Boolean bool2 = (Boolean) g2.a(hashMap, str, bool);
        if (bool2 != null) {
            z10 = bool2.booleanValue();
        } else {
            String b10 = g2.b(contentResolver, str);
            boolean z11 = false;
            if (b10 != null && !b10.equals("")) {
                if (g2.c.matcher(b10).matches()) {
                    bool = Boolean.TRUE;
                    z11 = true;
                } else if (!g2.d.matcher(b10).matches()) {
                    Log.w("Gservices", j2.h("attempt to read gservices key ", str, " (value \"", b10, "\") as boolean"));
                }
                g2.e(obj, hashMap, str, bool);
                z10 = z11;
            }
            bool = bool2;
            g2.e(obj, hashMap, str, bool);
            z10 = z11;
        }
        return Boolean.valueOf(z10);
    }
}
