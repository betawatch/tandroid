package com.google.android.gms.internal.clearcut;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import java.util.HashMap;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements h {
    public final /* synthetic */ int a;
    public String b;

    public String toString() {
        switch (this.a) {
            case 1:
                return "<" + this.b + '>';
            default:
                return super.toString();
        }
    }

    @Override // com.google.android.gms.internal.clearcut.h
    public Object zzp() {
        Object obj;
        boolean z9;
        String str = this.b;
        ContentResolver contentResolver = d.g.getContentResolver();
        Uri uri = e2.a;
        synchronized (e2.class) {
            e2.c(contentResolver);
            obj = e2.k;
        }
        HashMap hashMap = e2.g;
        Boolean bool = Boolean.FALSE;
        Boolean bool2 = (Boolean) e2.a(hashMap, str, bool);
        if (bool2 != null) {
            z9 = bool2.booleanValue();
        } else {
            String b10 = e2.b(contentResolver, str);
            boolean z10 = false;
            if (b10 != null && !b10.equals("")) {
                if (e2.c.matcher(b10).matches()) {
                    bool = Boolean.TRUE;
                    z10 = true;
                } else if (!e2.d.matcher(b10).matches()) {
                    Log.w("Gservices", org.telegram.ui.Cells.f1.m("attempt to read gservices key ", str, " (value \"", b10, "\") as boolean"));
                }
                e2.e(obj, hashMap, str, bool);
                z9 = z10;
            }
            bool = bool2;
            e2.e(obj, hashMap, str, bool);
            z9 = z10;
        }
        return Boolean.valueOf(z9);
    }

    public /* synthetic */ e(String str, int i7) {
        this.a = i7;
        this.b = str;
    }
}
