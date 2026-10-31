package com.google.android.recaptcha.internal;

import android.net.Uri;
import android.text.TextUtils;
import bd.k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.i;
import rd.j;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class zzig {
    private final List zza;

    public zzig() {
        this(true);
    }

    public static final boolean zzc(Uri uri) {
        return zze(uri);
    }

    private final boolean zzd(String str) {
        List list = this.zza;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (j.h(str, (String) it.next())) {
                return true;
            }
        }
        return false;
    }

    private static final boolean zze(Uri uri) {
        return (TextUtils.isEmpty(uri.toString()) || !"https".equals(uri.getScheme()) || TextUtils.isEmpty(uri.getHost())) ? false : true;
    }

    private static final List zzf(List list) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(k.d(list2));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add("https://" + ((String) it.next()) + "/");
        }
        return arrayList;
    }

    public final boolean zza(Uri uri) {
        return zze(uri) && zzd(uri.toString());
    }

    public final boolean zzb(String str) {
        Uri parse = Uri.parse(str);
        i.b(parse);
        return zze(parse) && zzd(parse.toString());
    }

    public zzig(boolean z10) {
        this.zza = zzf(bd.j.c("www.recaptcha.net", "www.gstatic.com/recaptcha", "www.gstatic.cn/recaptcha"));
    }
}
