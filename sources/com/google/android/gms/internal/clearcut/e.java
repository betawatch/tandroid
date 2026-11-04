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
    public String a;

    public /* synthetic */ e(String str, boolean z10) {
        this.a = str;
    }

    public static e c(g2.y yVar) {
        String str;
        yVar.O(2);
        int A = yVar.A();
        int i3 = A >> 1;
        int A2 = ((yVar.A() >> 3) & 31) | ((A & 1) << 5);
        if (i3 == 4 || i3 == 5 || i3 == 7 || i3 == 8) {
            str = "dvhe";
        } else if (i3 == 9) {
            str = "dvav";
        } else {
            if (i3 != 10) {
                return null;
            }
            str = "dav1";
        }
        StringBuilder l10 = com.google.android.recaptcha.internal.a.l(str);
        l10.append(i3 < 10 ? ".0" : ".");
        l10.append(i3);
        l10.append(A2 < 10 ? ".0" : ".");
        l10.append(A2);
        return new e(l10.toString(), false);
    }

    public static CharSequence d(Object obj) {
        Objects.requireNonNull(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    public void a(StringBuilder sb2, Iterator it) {
        try {
            if (it.hasNext()) {
                sb2.append(d(it.next()));
                while (it.hasNext()) {
                    sb2.append((CharSequence) this.a);
                    sb2.append(d(it.next()));
                }
            }
        } catch (IOException e10) {
            throw new AssertionError(e10);
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
                    Log.w("Gservices", org.telegram.ui.Cells.f1.q("attempt to read gservices key ", str, " (value \"", b10, "\") as boolean"));
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

    public e(String str) {
        str.getClass();
        this.a = str;
    }
}
