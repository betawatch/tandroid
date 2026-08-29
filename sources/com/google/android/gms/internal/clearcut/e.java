package com.google.android.gms.internal.clearcut;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import j$.util.Objects;
import java.io.IOException;
import java.util.AbstractCollection;
import java.util.HashMap;
import java.util.Iterator;
import org.telegram.ui.th;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements h {
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

    public void a(StringBuilder sb2, AbstractCollection abstractCollection) {
        Iterator it = abstractCollection.iterator();
        try {
            if (it.hasNext()) {
                Object next = it.next();
                Objects.requireNonNull(next);
                sb2.append(next instanceof CharSequence ? (CharSequence) next : next.toString());
                while (it.hasNext()) {
                    sb2.append((CharSequence) this.a);
                    Object next2 = it.next();
                    Objects.requireNonNull(next2);
                    sb2.append(next2 instanceof CharSequence ? (CharSequence) next2 : next2.toString());
                }
            }
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
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
                    Log.w("Gservices", th.j("attempt to read gservices key ", str, " (value \"", b10, "\") as boolean"));
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
