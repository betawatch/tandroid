package com.google.android.recaptcha.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class zziq {
    private Set zza;
    private Set zzb;
    private Long zzc;
    private int zzd;

    private static final boolean zzc(String str, Set set) {
        List list;
        str.getClass();
        String valueOf = String.valueOf(new char[]{'.'}[0]);
        int e = hbb.e(0, str, valueOf, false);
        if (e != -1) {
            ArrayList arrayList = new ArrayList(10);
            int i = 0;
            do {
                arrayList.add(str.subSequence(i, e).toString());
                i = valueOf.length() + e;
                e = hbb.e(i, str, valueOf, false);
            } while (e != -1);
            arrayList.add(str.subSequence(i, str.length()).toString());
            list = arrayList;
        } else {
            list = lm2.a(str.toString());
        }
        Iterator it = list.iterator();
        String str2 = "";
        while (it.hasNext()) {
            String concat = str2.concat(String.valueOf((String) it.next()));
            if (set.contains(concat)) {
                return true;
            }
            str2 = concat.concat(".");
        }
        return false;
    }

    public final void zza(zzxg zzxgVar) {
        this.zza = km2.m(zzxgVar.zzf().zzi());
        this.zzb = km2.m(zzxgVar.zzg().zzi());
    }

    public final boolean zzb(String str) {
        Set set = this.zza;
        if (set == null || this.zzb == null) {
            if (this.zzc == null) {
                this.zzc = Long.valueOf(System.currentTimeMillis());
            }
            this.zzd++;
            return true;
        }
        if (set.isEmpty()) {
            return true;
        }
        Set set2 = this.zzb;
        set2.getClass();
        if (zzc(str, set2)) {
            return false;
        }
        return zzc(str, set);
    }
}
