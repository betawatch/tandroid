package com.google.android.gms.internal.clearcut;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import java.util.HashMap;
import org.telegram.ui.yh;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements h, ra.m {
    public final /* synthetic */ int a;
    public String b;

    public /* synthetic */ e() {
        this.a = 1;
    }

    public String toString() {
        switch (this.a) {
            case 2:
                return "<" + this.b + '>';
            default:
                return super.toString();
        }
    }

    @Override // ra.m
    public Object y2() {
        throw new pa.j(this.b);
    }

    @Override // com.google.android.gms.internal.clearcut.h
    public Object zzp() {
        Object obj;
        boolean z4;
        String str = this.b;
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
            z4 = bool2.booleanValue();
        } else {
            String b10 = f2.b(contentResolver, str);
            boolean z10 = false;
            if (b10 != null && !b10.equals("")) {
                if (f2.c.matcher(b10).matches()) {
                    bool = Boolean.TRUE;
                    z10 = true;
                } else if (!f2.d.matcher(b10).matches()) {
                    Log.w("Gservices", yh.l("attempt to read gservices key ", str, " (value \"", b10, "\") as boolean"));
                }
                f2.e(obj, hashMap, str, bool);
                z4 = z10;
            }
            bool = bool2;
            f2.e(obj, hashMap, str, bool);
            z4 = z10;
        }
        return Boolean.valueOf(z4);
    }

    public /* synthetic */ e(String str, int i10) {
        this.a = i10;
        this.b = str;
    }
}
