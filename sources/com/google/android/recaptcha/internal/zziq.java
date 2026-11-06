package com.google.android.recaptcha.internal;

import c8.d0;
import hd.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.j;
import xd.d;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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
        int g10 = d.g(0, str, valueOf, false);
        if (g10 != -1) {
            ArrayList arrayList = new ArrayList(10);
            int i7 = 0;
            do {
                arrayList.add(str.subSequence(i7, g10).toString());
                i7 = valueOf.length() + g10;
                g10 = d.g(i7, str, valueOf, false);
            } while (g10 != -1);
            arrayList.add(str.subSequence(i7, str.length()).toString());
            list = arrayList;
        } else {
            list = d0.a(str.toString());
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
        this.zza = f.o(zzxgVar.zzf().zzi());
        this.zzb = f.o(zzxgVar.zzg().zzi());
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
