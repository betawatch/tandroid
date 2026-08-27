package com.google.android.gms.internal.clearcut;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import java.util.HashMap;
import org.telegram.ui.Cells.pa;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements h, oa.m {
    public String a;

    public /* synthetic */ e(String str) {
        this.a = str;
    }

    public static e a(d5.z zVar) {
        String str;
        zVar.D(2);
        int r10 = zVar.r();
        int i10 = r10 >> 1;
        int r11 = ((zVar.r() >> 3) & 31) | ((r10 & 1) << 5);
        if (i10 == 4 || i10 == 5 || i10 == 7) {
            str = "dvhe";
        } else if (i10 == 8) {
            str = "hev1";
        } else {
            if (i10 != 9) {
                return null;
            }
            str = "avc3";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(".0");
        sb2.append(i10);
        sb2.append(r11 >= 10 ? "." : ".0");
        sb2.append(r11);
        return new e(sb2.toString());
    }

    @Override // oa.m
    public Object f2() {
        throw new ma.j(this.a);
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
                    Log.w("Gservices", pa.j("attempt to read gservices key ", str, " (value \"", b10, "\") as boolean"));
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
