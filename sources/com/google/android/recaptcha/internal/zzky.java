package com.google.android.recaptcha.internal;

import java.net.ConnectException;
import java.net.Socket;
import java.util.ArrayList;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class zzky implements zzlb {
    private static final boolean zzb(int i9) {
        try {
            new Socket("localhost", i9).close();
            return true;
        } catch (ConnectException unused) {
            return false;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzlb
    public final /* synthetic */ Object cs(Object[] objArr) {
        return zzla.zza(this, objArr);
    }

    @Override // com.google.android.recaptcha.internal.zzlb
    public final Object zza(Object... objArr) {
        ArrayList arrayList = new ArrayList(objArr.length);
        int i9 = 0;
        for (Object obj : objArr) {
            if (true != (obj instanceof Integer)) {
                obj = null;
            }
            Integer num = (Integer) obj;
            if (num == null) {
                throw new zzdm(4, 5, null);
            }
            arrayList.add(Integer.valueOf(num.intValue()));
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        while (i9 < size) {
            Object obj2 = arrayList.get(i9);
            i9++;
            int intValue = ((Number) obj2).intValue();
            if (zzb(intValue)) {
                arrayList2.add(Integer.valueOf(intValue));
            }
        }
        return arrayList2;
    }
}
