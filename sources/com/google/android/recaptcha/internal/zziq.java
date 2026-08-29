package com.google.android.recaptcha.internal;

import i7.m7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.j;
import rc.g;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class zziq {
    private Set zza;
    private Set zzb;
    private Long zzc;
    private int zzd;

    private static final boolean zzc(String str, Set set) {
        List list;
        j.e(str, "<this>");
        String valueOf = String.valueOf(new char[]{'.'}[0]);
        int d = hd.j.d(0, str, valueOf, false);
        if (d != -1) {
            ArrayList arrayList = new ArrayList(10);
            int i10 = 0;
            do {
                arrayList.add(str.subSequence(i10, d).toString());
                i10 = valueOf.length() + d;
                d = hd.j.d(i10, str, valueOf, false);
            } while (d != -1);
            arrayList.add(str.subSequence(i10, str.length()).toString());
            list = arrayList;
        } else {
            list = m7.a(str.toString());
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
        this.zza = g.p(zzxgVar.zzf().zzi());
        this.zzb = g.p(zzxgVar.zzg().zzi());
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
        j.c(set2, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
        if (zzc(str, set2)) {
            return false;
        }
        return zzc(str, set);
    }
}
