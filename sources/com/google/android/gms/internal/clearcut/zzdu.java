package com.google.android.gms.internal.clearcut;

import androidx.appcompat.app.WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
final class zzdu implements zzef {
    private final zzdo zzmn;
    private final boolean zzmo;
    private final zzex zzmx;
    private final zzbu zzmy;

    private zzdu(zzex zzexVar, zzbu zzbuVar, zzdo zzdoVar) {
        this.zzmx = zzexVar;
        this.zzmo = zzbuVar.zze(zzdoVar);
        this.zzmy = zzbuVar;
        this.zzmn = zzdoVar;
    }

    static zzdu zza(zzex zzexVar, zzbu zzbuVar, zzdo zzdoVar) {
        return new zzdu(zzexVar, zzbuVar, zzdoVar);
    }

    @Override // com.google.android.gms.internal.clearcut.zzef
    public final boolean equals(Object obj, Object obj2) {
        if (!this.zzmx.zzq(obj).equals(this.zzmx.zzq(obj2))) {
            return false;
        }
        if (this.zzmo) {
            return this.zzmy.zza(obj).equals(this.zzmy.zza(obj2));
        }
        return true;
    }

    @Override // com.google.android.gms.internal.clearcut.zzef
    public final int hashCode(Object obj) {
        int hashCode = this.zzmx.zzq(obj).hashCode();
        return this.zzmo ? (hashCode * 53) + this.zzmy.zza(obj).hashCode() : hashCode;
    }

    @Override // com.google.android.gms.internal.clearcut.zzef
    public final Object newInstance() {
        return this.zzmn.zzbd().zzbi();
    }

    @Override // com.google.android.gms.internal.clearcut.zzef
    public final void zza(Object obj, zzfr zzfrVar) {
        Iterator it = this.zzmy.zza(obj).iterator();
        if (it.hasNext()) {
            WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(((Map.Entry) it.next()).getKey());
            throw null;
        }
        zzex zzexVar = this.zzmx;
        zzexVar.zzc(zzexVar.zzq(obj), zzfrVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0064 A[EDGE_INSN: B:24:0x0064->B:25:0x0064 BREAK  A[LOOP:1: B:10:0x0034->B:18:0x0034], SYNTHETIC] */
    @Override // com.google.android.gms.internal.clearcut.zzef
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(Object obj, byte[] bArr, int i, int i2, zzay zzayVar) {
        int i3;
        zzcg zzcgVar = (zzcg) obj;
        zzey zzeyVar = zzcgVar.zzjp;
        if (zzeyVar == zzey.zzea()) {
            zzeyVar = zzey.zzeb();
            zzcgVar.zzjp = zzeyVar;
        }
        zzey zzeyVar2 = zzeyVar;
        while (i < i2) {
            int zza = zzax.zza(bArr, i, zzayVar);
            int i4 = zzayVar.zzfd;
            if (i4 != 11) {
                byte[] bArr2 = bArr;
                int i5 = i2;
                zzay zzayVar2 = zzayVar;
                i = (i4 & 7) == 2 ? zzax.zza(i4, bArr2, zza, i5, zzeyVar2, zzayVar2) : zzax.zza(i4, bArr2, zza, i5, zzayVar2);
            } else {
                byte[] bArr3 = bArr;
                int i6 = i2;
                zzay zzayVar3 = zzayVar;
                int i7 = 0;
                zzbb zzbbVar = null;
                while (true) {
                    if (zza >= i6) {
                        i3 = zza;
                        break;
                    }
                    i3 = zzax.zza(bArr3, zza, zzayVar3);
                    int i8 = zzayVar3.zzfd;
                    int i9 = i8 >>> 3;
                    int i10 = i8 & 7;
                    if (i9 != 2) {
                        if (i9 == 3 && i10 == 2) {
                            zza = zzax.zze(bArr3, i3, zzayVar3);
                            zzbbVar = (zzbb) zzayVar3.zzff;
                        }
                        if (i8 != 12) {
                            break;
                        } else {
                            zza = zzax.zza(i8, bArr3, i3, i6, zzayVar3);
                        }
                    } else if (i10 == 0) {
                        zza = zzax.zza(bArr3, i3, zzayVar3);
                        i7 = zzayVar3.zzfd;
                    } else if (i8 != 12) {
                    }
                }
                if (zzbbVar != null) {
                    zzeyVar2.zzb((i7 << 3) | 2, zzbbVar);
                }
                i = i3;
                bArr = bArr3;
                i2 = i6;
                zzayVar = zzayVar3;
            }
        }
        if (i != i2) {
            throw zzco.zzbo();
        }
    }

    @Override // com.google.android.gms.internal.clearcut.zzef
    public final void zzc(Object obj) {
        this.zzmx.zzc(obj);
        this.zzmy.zzc(obj);
    }

    @Override // com.google.android.gms.internal.clearcut.zzef
    public final void zzc(Object obj, Object obj2) {
        zzeh.zza(this.zzmx, obj, obj2);
        if (this.zzmo) {
            zzeh.zza(this.zzmy, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.clearcut.zzef
    public final int zzm(Object obj) {
        zzex zzexVar = this.zzmx;
        int zzr = zzexVar.zzr(zzexVar.zzq(obj));
        return this.zzmo ? zzr + this.zzmy.zza(obj).zzat() : zzr;
    }

    @Override // com.google.android.gms.internal.clearcut.zzef
    public final boolean zzo(Object obj) {
        return this.zzmy.zza(obj).isInitialized();
    }
}
