package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.internal.zzsh;
import com.google.android.recaptcha.internal.zzsn;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;

/* loaded from: classes.dex */
public abstract class zzsn<MessageType extends zzsn<MessageType, BuilderType>, BuilderType extends zzsh<MessageType, BuilderType>> extends zzpw<MessageType, BuilderType> {
    private static final Map zzb = new ConcurrentHashMap();
    private int zzd = -1;
    protected zzuw zzc = zzuw.zzc();

    protected static zzst zzA() {
        return zzth.zzf();
    }

    protected static zzsu zzB() {
        return zzud.zze();
    }

    protected static zzsu zzC(zzsu zzsuVar) {
        int size = zzsuVar.size();
        return zzsuVar.zzd(size + size);
    }

    static Object zzE(Method method, Object obj, Object... objArr) {
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

    protected static Object zzF(zzts zztsVar, String str, Object[] objArr) {
        return new zzue(zztsVar, str, objArr);
    }

    protected static void zzI(Class cls, zzsn zzsnVar) {
        zzsnVar.zzH();
        zzb.put(cls, zzsnVar);
    }

    private final int zzf(zzug zzugVar) {
        return zzuc.zza().zzb(getClass()).zza(this);
    }

    private static zzsn zzg(zzsn zzsnVar) {
        if (zzsnVar == null || zzj(zzsnVar, true)) {
            return zzsnVar;
        }
        throw new zzuu(zzsnVar).zza();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzsn zzi(zzsn zzsnVar, byte[] bArr, int i, int i2, zzry zzryVar) {
        if (i2 == 0) {
            return zzsnVar;
        }
        zzsn zzv = zzsnVar.zzv();
        try {
            zzug zzb2 = zzuc.zza().zzb(zzv.getClass());
            zzb2.zzi(zzv, bArr, 0, i2, new zzqb(zzryVar));
            zzb2.zzf(zzv);
            return zzv;
        } catch (zzsx e) {
            if (e.zzb()) {
                throw new zzsx(e);
            }
            throw e;
        } catch (zzuu e2) {
            throw e2.zza();
        } catch (IOException e3) {
            if (e3.getCause() instanceof zzsx) {
                throw ((zzsx) e3.getCause());
            }
            throw new zzsx(e3);
        } catch (IndexOutOfBoundsException unused) {
            throw new zzsx("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean zzj(zzsn zzsnVar, boolean z) {
        byte byteValue = ((Byte) zzsnVar.zzh(1, null, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean zzl = zzuc.zza().zzb(zzsnVar.getClass()).zzl(zzsnVar);
        if (z) {
            zzsnVar.zzh(2, true != zzl ? null : zzsnVar, null);
        }
        return zzl;
    }

    public static zzsm zzs(zzts zztsVar, Object obj, zzts zztsVar2, zzsq zzsqVar, int i, zzvg zzvgVar, Class cls) {
        return new zzsm(zztsVar, "", null, new zzsl(null, i, zzvgVar, false, false), cls);
    }

    static zzsn zzu(Class cls) {
        Map map = zzb;
        zzsn zzsnVar = (zzsn) map.get(cls);
        if (zzsnVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzsnVar = (zzsn) map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (zzsnVar != null) {
            return zzsnVar;
        }
        zzsn zzsnVar2 = (zzsn) ((zzsn) zzvc.zze(cls)).zzh(6, null, null);
        if (zzsnVar2 == null) {
            throw new IllegalStateException();
        }
        map.put(cls, zzsnVar2);
        return zzsnVar2;
    }

    protected static zzsn zzw(zzsn zzsnVar, InputStream inputStream) {
        zzqq zzqoVar;
        int i = zzqq.zze;
        if (inputStream == null) {
            byte[] bArr = zzsv.zzb;
            int length = bArr.length;
            zzqoVar = zzqq.zzH(bArr, 0, 0, false);
        } else {
            zzqoVar = new zzqo(inputStream, 4096, null);
        }
        int i2 = zzry.zzb;
        int i3 = zzuc.zza;
        zzry zzryVar = zzry.zza;
        zzsn zzv = zzsnVar.zzv();
        try {
            zzug zzb2 = zzuc.zza().zzb(zzv.getClass());
            zzb2.zzh(zzv, zzqr.zzq(zzqoVar), zzryVar);
            zzb2.zzf(zzv);
            zzg(zzv);
            return zzv;
        } catch (zzsx e) {
            if (e.zzb()) {
                throw new zzsx(e);
            }
            throw e;
        } catch (zzuu e2) {
            throw e2.zza();
        } catch (IOException e3) {
            if (e3.getCause() instanceof zzsx) {
                throw ((zzsx) e3.getCause());
            }
            throw new zzsx(e3);
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof zzsx) {
                throw ((zzsx) e4.getCause());
            }
            throw e4;
        }
    }

    protected static zzsn zzx(zzsn zzsnVar, byte[] bArr) {
        int i = zzry.zzb;
        int i2 = zzuc.zza;
        zzsn zzi = zzi(zzsnVar, bArr, 0, bArr.length, zzry.zza);
        zzg(zzi);
        return zzi;
    }

    protected static zzss zzy() {
        return zzso.zzf();
    }

    protected static zzss zzz(zzss zzssVar) {
        int size = zzssVar.size();
        return zzssVar.zzd(size + size);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return zzuc.zza().zzb(getClass()).zzk(this, (zzsn) obj);
    }

    public final int hashCode() {
        if (zzL()) {
            return zzn();
        }
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int zzn = zzn();
        this.zza = zzn;
        return zzn;
    }

    public final String toString() {
        return zztu.zza(this, super.toString());
    }

    @Override // com.google.android.recaptcha.internal.zzts
    public final zzua zzD() {
        return (zzua) zzh(7, null, null);
    }

    protected final void zzG() {
        zzuc.zza().zzb(getClass()).zzf(this);
        zzH();
    }

    final void zzH() {
        this.zzd &= ConnectionsManager.DEFAULT_DATACENTER_ID;
    }

    final void zzJ(int i) {
        this.zzd = (this.zzd & TLObject.FLAG_31) | ConnectionsManager.DEFAULT_DATACENTER_ID;
    }

    final boolean zzL() {
        return (this.zzd & TLObject.FLAG_31) != 0;
    }

    @Override // com.google.android.recaptcha.internal.zzpw
    final int zza(zzug zzugVar) {
        if (zzL()) {
            int zza = zzugVar.zza(this);
            if (zza >= 0) {
                return zza;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + zza);
        }
        int i = this.zzd & ConnectionsManager.DEFAULT_DATACENTER_ID;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int zza2 = zzugVar.zza(this);
        if (zza2 >= 0) {
            this.zzd = (this.zzd & TLObject.FLAG_31) | zza2;
            return zza2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + zza2);
    }

    @Override // com.google.android.recaptcha.internal.zzts
    public final /* synthetic */ zztr zzaf() {
        return (zzsh) zzh(5, null, null);
    }

    @Override // com.google.android.recaptcha.internal.zzts
    public final /* synthetic */ zztr zzag() {
        zzsh zzshVar = (zzsh) zzh(5, null, null);
        zzshVar.zzh(this);
        return zzshVar;
    }

    @Override // com.google.android.recaptcha.internal.zzts
    public final void zze(zzqv zzqvVar) {
        zzuc.zza().zzb(getClass()).zzj(this, zzqw.zza(zzqvVar));
    }

    protected abstract Object zzh(int i, Object obj, Object obj2);

    @Override // com.google.android.recaptcha.internal.zztt
    public final /* synthetic */ zzts zzm() {
        return (zzsn) zzh(6, null, null);
    }

    final int zzn() {
        return zzuc.zza().zzb(getClass()).zzb(this);
    }

    @Override // com.google.android.recaptcha.internal.zztt
    public final boolean zzp() {
        return zzj(this, true);
    }

    protected final zzsh zzq() {
        return (zzsh) zzh(5, null, null);
    }

    public final zzsh zzr() {
        zzsh zzshVar = (zzsh) zzh(5, null, null);
        zzshVar.zzh(this);
        return zzshVar;
    }

    final zzsn zzv() {
        return (zzsn) zzh(4, null, null);
    }

    @Override // com.google.android.recaptcha.internal.zzts
    public final int zzo() {
        if (zzL()) {
            int zzf = zzf(null);
            if (zzf >= 0) {
                return zzf;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + zzf);
        }
        int i = this.zzd & ConnectionsManager.DEFAULT_DATACENTER_ID;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int zzf2 = zzf(null);
        if (zzf2 >= 0) {
            this.zzd = (this.zzd & TLObject.FLAG_31) | zzf2;
            return zzf2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + zzf2);
    }
}
