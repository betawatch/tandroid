package com.google.android.gms.internal.clearcut;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import j$.util.Objects;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public /* synthetic */ class e implements h {
    public final String a;

    public e(String str, int i10) {
        switch (i10) {
            case 1:
                str.getClass();
                this.a = str;
                break;
            default:
                this.a = str;
                break;
        }
    }

    public static CharSequence c(Object obj) {
        Objects.requireNonNull(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    public void a(StringBuilder sb2, Iterator it) {
        try {
            if (it.hasNext()) {
                sb2.append(c(it.next()));
                while (it.hasNext()) {
                    sb2.append((CharSequence) this.a);
                    sb2.append(c(it.next()));
                }
            }
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public String b(List list) {
        Iterator it = list.iterator();
        StringBuilder sb2 = new StringBuilder();
        a(sb2, it);
        return sb2.toString();
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
                    Log.w("Gservices", org.telegram.ui.Cells.f1.o("attempt to read gservices key ", str, " (value \"", b10, "\") as boolean"));
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
