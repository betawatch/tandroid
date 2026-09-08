package com.google.android.recaptcha.internal;

import hd.g;
import hd.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.i;
import xd.j;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class zziq {
    private Set zza;
    private Set zzb;
    private Long zzc;
    private int zzd;

    private static final boolean zzc(String str, Set set) {
        List list;
        i.e(str, "<this>");
        String valueOf = String.valueOf(new char[]{'.'}[0]);
        int d = j.d(0, str, valueOf, false);
        if (d != -1) {
            ArrayList arrayList = new ArrayList(10);
            int i10 = 0;
            do {
                arrayList.add(str.subSequence(i10, d).toString());
                i10 = valueOf.length() + d;
                d = j.d(i10, str, valueOf, false);
            } while (d != -1);
            arrayList.add(str.subSequence(i10, str.length()).toString());
            list = arrayList;
        } else {
            list = h.b(str.toString());
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
        i.c(set2, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
        if (zzc(str, set2)) {
            return false;
        }
        return zzc(str, set);
    }
}
