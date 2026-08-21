package com.google.android.gms.internal.play_billing;

import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;

/* loaded from: classes.dex */
public abstract class zzfi extends zzds {
    private static final Map zzb = new ConcurrentHashMap();
    private int zzd = -1;
    protected zzhi zzc = zzhi.zzc();

    private static final boolean zzA(zzfi zzfiVar, boolean z) {
        byte byteValue = ((Byte) zzfiVar.zzb(1, null, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean zzk = zzgs.zza().zzb(zzfiVar.getClass()).zzk(zzfiVar);
        if (z) {
            zzfiVar.zzb(2, true != zzk ? null : zzfiVar, null);
        }
        return zzk;
    }

    private final int zzc(zzgv zzgvVar) {
        return zzgs.zza().zzb(getClass()).zza(this);
    }

    private static zzfi zzd(zzfi zzfiVar, byte[] bArr, int i, int i2, zzeu zzeuVar) {
        if (i2 == 0) {
            return zzfiVar;
        }
        zzfi zzo = zzfiVar.zzo();
        try {
            zzgv zzb2 = zzgs.zza().zzb(zzo.getClass());
            zzb2.zzh(zzo, bArr, 0, i2, new zzdw(zzeuVar));
            zzb2.zzf(zzo);
            return zzo;
        } catch (zzfq e) {
            throw e;
        } catch (zzhg e2) {
            throw e2.zza();
        } catch (IOException e3) {
            if (e3.getCause() instanceof zzfq) {
                throw ((zzfq) e3.getCause());
            }
            throw new zzfq(e3);
        } catch (IndexOutOfBoundsException unused) {
            throw new zzfq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    static zzfi zzn(Class cls) {
        Map map = zzb;
        zzfi zzfiVar = (zzfi) map.get(cls);
        if (zzfiVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzfiVar = (zzfi) map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (zzfiVar != null) {
            return zzfiVar;
        }
        zzfi zzfiVar2 = (zzfi) ((zzfi) zzho.zze(cls)).zzb(6, null, null);
        if (zzfiVar2 == null) {
            throw new IllegalStateException();
        }
        map.put(cls, zzfiVar2);
        return zzfiVar2;
    }

    protected static zzfi zzp(zzfi zzfiVar, byte[] bArr, zzeu zzeuVar) {
        zzfi zzd = zzd(zzfiVar, bArr, 0, bArr.length, zzeuVar);
        if (zzd == null || zzA(zzd, true)) {
            return zzd;
        }
        throw new zzhg(zzd).zza();
    }

    protected static zzfm zzq() {
        return zzfj.zzf();
    }

    protected static zzfn zzr() {
        return zzgt.zze();
    }

    static Object zzs(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    protected static Object zzt(zzgl zzglVar, String str, Object[] objArr) {
        return new zzgu(zzglVar, str, objArr);
    }

    protected static void zzw(Class cls, zzfi zzfiVar) {
        zzfiVar.zzv();
        zzb.put(cls, zzfiVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return zzgs.zza().zzb(getClass()).zzj(this, (zzfi) obj);
    }

    public final int hashCode() {
        if (zzz()) {
            return zzi();
        }
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int zzi = zzi();
        this.zza = zzi;
        return zzi;
    }

    public final String toString() {
        return zzgn.zza(this, super.toString());
    }

    @Override // com.google.android.gms.internal.play_billing.zzgl
    public final /* synthetic */ zzgk zzK() {
        return (zzfe) zzb(5, null, null);
    }

    @Override // com.google.android.gms.internal.play_billing.zzgl
    public final void zzL(zzep zzepVar) {
        zzgs.zza().zzb(getClass()).zzi(this, zzeq.zza(zzepVar));
    }

    protected abstract Object zzb(int i, Object obj, Object obj2);

    @Override // com.google.android.gms.internal.play_billing.zzds
    final int zze(zzgv zzgvVar) {
        if (zzz()) {
            int zza = zzgvVar.zza(this);
            if (zza >= 0) {
                return zza;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + zza);
        }
        int i = this.zzd & ConnectionsManager.DEFAULT_DATACENTER_ID;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int zza2 = zzgvVar.zza(this);
        if (zza2 >= 0) {
            this.zzd = (this.zzd & TLObject.FLAG_31) | zza2;
            return zza2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + zza2);
    }

    @Override // com.google.android.gms.internal.play_billing.zzgm
    public final /* synthetic */ zzgl zzh() {
        return (zzfi) zzb(6, null, null);
    }

    final int zzi() {
        return zzgs.zza().zzb(getClass()).zzb(this);
    }

    public final boolean zzk() {
        return zzA(this, true);
    }

    protected final zzfe zzl() {
        return (zzfe) zzb(5, null, null);
    }

    public final zzfe zzm() {
        zzfe zzfeVar = (zzfe) zzb(5, null, null);
        zzfeVar.zzd(this);
        return zzfeVar;
    }

    final zzfi zzo() {
        return (zzfi) zzb(4, null, null);
    }

    protected final void zzu() {
        zzgs.zza().zzb(getClass()).zzf(this);
        zzv();
    }

    final void zzv() {
        this.zzd &= ConnectionsManager.DEFAULT_DATACENTER_ID;
    }

    final void zzx(int i) {
        this.zzd = (this.zzd & TLObject.FLAG_31) | ConnectionsManager.DEFAULT_DATACENTER_ID;
    }

    final boolean zzz() {
        return (this.zzd & TLObject.FLAG_31) != 0;
    }

    @Override // com.google.android.gms.internal.play_billing.zzgl
    public final int zzj() {
        if (zzz()) {
            int zzc = zzc(null);
            if (zzc >= 0) {
                return zzc;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + zzc);
        }
        int i = this.zzd & ConnectionsManager.DEFAULT_DATACENTER_ID;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int zzc2 = zzc(null);
        if (zzc2 >= 0) {
            this.zzd = (this.zzd & TLObject.FLAG_31) | zzc2;
            return zzc2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + zzc2);
    }
}
