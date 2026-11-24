package com.google.android.recaptcha.internal;

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
final class zzop extends AbstractMap {
    private static final Comparator zza = new zzom();
    private final Object[] zzb;
    private final int[] zzc;
    private final Set zzd = new zzoo(this, -1);
    private Integer zze = null;
    private String zzf = null;

    public zzop(List list) {
        Iterator it = list.iterator();
        if (it.hasNext()) {
            zzol.zza((zzol) it.next());
            throw null;
        }
        int size = list.size();
        Object[] objArr = new Object[size];
        Iterator it2 = list.iterator();
        if (it2.hasNext()) {
            zzol.zza((zzol) it2.next());
            throw null;
        }
        int[] iArr = {0};
        if (size > 16 && size * 9 > 0) {
            objArr = Arrays.copyOf(objArr, 0);
        }
        this.zzb = objArr;
        this.zzc = iArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return this.zzd;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        Integer num = this.zze;
        if (num == null) {
            num = Integer.valueOf(super.hashCode());
            this.zze = num;
        }
        return num.intValue();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        String str = this.zzf;
        if (str != null) {
            return str;
        }
        String abstractMap = super.toString();
        this.zzf = abstractMap;
        return abstractMap;
    }
}
