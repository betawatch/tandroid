package com.google.android.recaptcha.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import k7.s7;
import kotlin.jvm.internal.j;
import tc.g;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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
        int d = jd.j.d(0, str, valueOf, false);
        if (d != -1) {
            ArrayList arrayList = new ArrayList(10);
            int i10 = 0;
            do {
                arrayList.add(str.subSequence(i10, d).toString());
                i10 = valueOf.length() + d;
                d = jd.j.d(i10, str, valueOf, false);
            } while (d != -1);
            arrayList.add(str.subSequence(i10, str.length()).toString());
            list = arrayList;
        } else {
            list = s7.a(str.toString());
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
