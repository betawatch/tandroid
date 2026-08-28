package com.google.android.recaptcha.internal;

import j$.util.DesugarCollections;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
class zzuo extends AbstractMap {
    private Object[] zza;
    private int zzb;
    private Map zzc;
    private boolean zzd;
    private volatile zzum zze;
    private Map zzf;

    private zzuo() {
        Map map = Collections.EMPTY_MAP;
        this.zzc = map;
        this.zzf = map;
    }

    private final int zzl(Comparable comparable) {
        int i9 = this.zzb;
        int i10 = i9 - 1;
        int i11 = 0;
        if (i10 >= 0) {
            int compareTo = comparable.compareTo(((zzuk) this.zza[i10]).zza());
            if (compareTo > 0) {
                return -(i9 + 1);
            }
            if (compareTo == 0) {
                return i10;
            }
        }
        while (i11 <= i10) {
            int i12 = (i11 + i10) / 2;
            int compareTo2 = comparable.compareTo(((zzuk) this.zza[i12]).zza());
            if (compareTo2 < 0) {
                i10 = i12 - 1;
            } else {
                if (compareTo2 <= 0) {
                    return i12;
                }
                i11 = i12 + 1;
            }
        }
        return -(i11 + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object zzm(int i9) {
        zzo();
        Object value = ((zzuk) this.zza[i9]).getValue();
        Object[] objArr = this.zza;
        System.arraycopy(objArr, i9 + 1, objArr, i9, (this.zzb - i9) - 1);
        this.zzb--;
        if (!this.zzc.isEmpty()) {
            Iterator it = zzn().entrySet().iterator();
            Object[] objArr2 = this.zza;
            int i10 = this.zzb;
            Map.Entry entry = (Map.Entry) it.next();
            objArr2[i10] = new zzuk(this, (Comparable) entry.getKey(), entry.getValue());
            this.zzb++;
            it.remove();
        }
        return value;
    }

    private final SortedMap zzn() {
        zzo();
        if (this.zzc.isEmpty() && !(this.zzc instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.zzc = treeMap;
            this.zzf = treeMap.descendingMap();
        }
        return (SortedMap) this.zzc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzo() {
        if (this.zzd) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        zzo();
        if (this.zzb != 0) {
            this.zza = null;
            this.zzb = 0;
        }
        if (this.zzc.isEmpty()) {
            return;
        }
        this.zzc.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return zzl(comparable) >= 0 || this.zzc.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.zze == null) {
            this.zze = new zzum(this, null);
        }
        return this.zze;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzuo)) {
            return super.equals(obj);
        }
        zzuo zzuoVar = (zzuo) obj;
        int size = size();
        if (size != zzuoVar.size()) {
            return false;
        }
        int i9 = this.zzb;
        if (i9 != zzuoVar.zzb) {
            return entrySet().equals(zzuoVar.entrySet());
        }
        for (int i10 = 0; i10 < i9; i10++) {
            if (!zzg(i10).equals(zzuoVar.zzg(i10))) {
                return false;
            }
        }
        if (i9 != size) {
            return this.zzc.equals(zzuoVar.zzc);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int zzl = zzl(comparable);
        return zzl >= 0 ? ((zzuk) this.zza[zzl]).getValue() : this.zzc.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i9 = this.zzb;
        int i10 = 0;
        for (int i11 = 0; i11 < i9; i11++) {
            i10 += this.zza[i11].hashCode();
        }
        return this.zzc.size() > 0 ? this.zzc.hashCode() + i10 : i10;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        zzo();
        Comparable comparable = (Comparable) obj;
        int zzl = zzl(comparable);
        if (zzl >= 0) {
            return zzm(zzl);
        }
        if (this.zzc.isEmpty()) {
            return null;
        }
        return this.zzc.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.zzc.size() + this.zzb;
    }

    public void zza() {
        if (this.zzd) {
            return;
        }
        this.zzc = this.zzc.isEmpty() ? Collections.EMPTY_MAP : DesugarCollections.unmodifiableMap(this.zzc);
        this.zzf = this.zzf.isEmpty() ? Collections.EMPTY_MAP : DesugarCollections.unmodifiableMap(this.zzf);
        this.zzd = true;
    }

    public final int zzc() {
        return this.zzb;
    }

    public final Iterable zzd() {
        return this.zzc.isEmpty() ? Collections.EMPTY_SET : this.zzc.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        zzo();
        int zzl = zzl(comparable);
        if (zzl >= 0) {
            return ((zzuk) this.zza[zzl]).setValue(obj);
        }
        zzo();
        if (this.zza == null) {
            this.zza = new Object[16];
        }
        int i9 = -(zzl + 1);
        if (i9 >= 16) {
            return zzn().put(comparable, obj);
        }
        if (this.zzb == 16) {
            zzuk zzukVar = (zzuk) this.zza[15];
            this.zzb = 15;
            zzn().put(zzukVar.zza(), zzukVar.getValue());
        }
        Object[] objArr = this.zza;
        int length = objArr.length;
        System.arraycopy(objArr, i9, objArr, i9 + 1, 15 - i9);
        this.zza[i9] = new zzuk(this, comparable, obj);
        this.zzb++;
        return null;
    }

    public final Map.Entry zzg(int i9) {
        if (i9 < this.zzb) {
            return (zzuk) this.zza[i9];
        }
        throw new ArrayIndexOutOfBoundsException(i9);
    }

    public final boolean zzj() {
        return this.zzd;
    }

    public /* synthetic */ zzuo(zzun zzunVar) {
        Map map = Collections.EMPTY_MAP;
        this.zzc = map;
        this.zzf = map;
    }
}
