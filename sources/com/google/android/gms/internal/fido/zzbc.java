package com.google.android.gms.internal.fido;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class zzbc {
    public static final Appendable zza(Appendable appendable, Iterator it, zzbd zzbdVar, String str) {
        String str2;
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            appendable.append(zzbd.zzd(entry.getKey()));
            appendable.append(" : ");
            appendable.append(zzbd.zzd(entry.getValue()));
            while (it.hasNext()) {
                str2 = zzbdVar.zza;
                appendable.append(str2);
                Map.Entry entry2 = (Map.Entry) it.next();
                appendable.append(zzbd.zzd(entry2.getKey()));
                appendable.append(" : ");
                appendable.append(zzbd.zzd(entry2.getValue()));
            }
        }
        return appendable;
    }
}
