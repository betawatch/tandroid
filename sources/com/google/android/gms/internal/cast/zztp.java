package com.google.android.gms.internal.cast;

import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import org.telegram.tgnet.ConnectionsManager;

/* loaded from: classes.dex */
public abstract class zztp extends zzsh {
    private static final Map zzb = new ConcurrentHashMap();
    private int zzd = -1;
    protected zzwa zzc = zzwa.zzc();

    protected static zztx zzA() {
        return zzvg.zzd();
    }

    protected static zztx zzB(zztx zztxVar) {
        int size = zztxVar.size();
        return zztxVar.zzg(size == 0 ? 10 : size + size);
    }

    static Object zzD(Method method, Object obj, Object... objArr) {
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

    protected static Object zzE(zzux zzuxVar, String str, Object[] objArr) {
        return new zzvh(zzuxVar, str, objArr);
    }

    protected static void zzH(Class cls, zztp zztpVar) {
        zztpVar.zzG();
        zzb.put(cls, zztpVar);
    }

    private final int zza(zzvi zzviVar) {
        return zzvf.zza().zzb(getClass()).zza(this);
    }

    static zztp zzw(Class cls) {
        Map map = zzb;
        zztp zztpVar = (zztp) map.get(cls);
        if (zztpVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zztpVar = (zztp) map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (zztpVar == null) {
            zztpVar = (zztp) ((zztp) zzwj.zze(cls)).zzb(6, null, null);
            if (zztpVar == null) {
                throw new IllegalStateException();
            }
            map.put(cls, zztpVar);
        }
        return zztpVar;
    }

    protected static zztu zzy() {
        return zztq.zze();
    }

    protected static zztw zzz() {
        return zzum.zze();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return zzvf.zza().zzb(getClass()).zzg(this, (zztp) obj);
    }

    public final int hashCode() {
        if (zzK()) {
            return zzs();
        }
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int zzs = zzs();
        this.zza = zzs;
        return zzs;
    }

    public final String toString() {
        return zzuz.zza(this, super.toString());
    }

    @Override // com.google.android.gms.internal.cast.zzux
    public final /* synthetic */ zzuw zzC() {
        return (zztm) zzb(5, null, null);
    }

    protected final void zzF() {
        zzvf.zza().zzb(getClass()).zzd(this);
        zzG();
    }

    final void zzG() {
        this.zzd &= ConnectionsManager.DEFAULT_DATACENTER_ID;
    }

    final void zzI(int i) {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | ConnectionsManager.DEFAULT_DATACENTER_ID;
    }

    @Override // com.google.android.gms.internal.cast.zzux
    public final void zzJ(zztc zztcVar) {
        zzvf.zza().zzb(getClass()).zzf(this, zztd.zza(zztcVar));
    }

    final boolean zzK() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    protected abstract Object zzb(int i, Object obj, Object obj2);

    @Override // com.google.android.gms.internal.cast.zzsh
    final int zzq(zzvi zzviVar) {
        if (zzK()) {
            int zza = zzviVar.zza(this);
            if (zza >= 0) {
                return zza;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + zza);
        }
        int i = this.zzd & ConnectionsManager.DEFAULT_DATACENTER_ID;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int zza2 = zzviVar.zza(this);
        if (zza2 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | zza2;
            return zza2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + zza2);
    }

    final int zzs() {
        return zzvf.zza().zzb(getClass()).zzb(this);
    }

    @Override // com.google.android.gms.internal.cast.zzuy
    public final /* synthetic */ zzux zzt() {
        return (zztp) zzb(6, null, null);
    }

    @Override // com.google.android.gms.internal.cast.zzux
    public final int zzu() {
        int i;
        if (zzK()) {
            i = zza(null);
            if (i < 0) {
                throw new IllegalStateException("serialized size must be non-negative, was " + i);
            }
        } else {
            i = this.zzd & ConnectionsManager.DEFAULT_DATACENTER_ID;
            if (i == Integer.MAX_VALUE) {
                i = zza(null);
                if (i < 0) {
                    throw new IllegalStateException("serialized size must be non-negative, was " + i);
                }
                this.zzd = (this.zzd & Integer.MIN_VALUE) | i;
            }
        }
        return i;
    }

    protected final zztm zzv() {
        return (zztm) zzb(5, null, null);
    }

    final zztp zzx() {
        return (zztp) zzb(4, null, null);
    }
}
