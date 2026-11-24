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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public abstract class zzsn<MessageType extends zzsn<MessageType, BuilderType>, BuilderType extends zzsh<MessageType, BuilderType>> extends zzpw<MessageType, BuilderType> {
    private static final Map zzb = new ConcurrentHashMap();
    private int zzd = -1;
    protected zzuw zzc = zzuw.zzc();

    public static zzst zzA() {
        return zzth.zzf();
    }

    public static zzsu zzB() {
        return zzud.zze();
    }

    public static zzsu zzC(zzsu zzsuVar) {
        return zzsuVar.zzd(zzsuVar.size() << 1);
    }

    public static Object zzE(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            fyb.j("Couldn't use Java reflection to implement protocol message reflection.", e);
            return null;
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            fyb.j("Unexpected exception thrown by generated accessor method.", cause);
            return null;
        }
    }

    public static Object zzF(zzts zztsVar, String str, Object[] objArr) {
        return new zzue(zztsVar, str, objArr);
    }

    public static void zzI(Class cls, zzsn zzsnVar) {
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
            fvc.i("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return null;
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

    public static zzsn zzu(Class cls) {
        Map map = zzb;
        zzsn zzsnVar = (zzsn) map.get(cls);
        if (zzsnVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzsnVar = (zzsn) map.get(cls);
            } catch (ClassNotFoundException e) {
                k93.h("Class initialization cannot fail.", e);
                return null;
            }
        }
        if (zzsnVar != null) {
            return zzsnVar;
        }
        zzsn zzsnVar2 = (zzsn) ((zzsn) zzvc.zze(cls)).zzh(6, null, null);
        if (zzsnVar2 != null) {
            map.put(cls, zzsnVar2);
            return zzsnVar2;
        }
        sdb.a();
        return null;
    }

    public static zzsn zzw(zzsn zzsnVar, InputStream inputStream) {
        zzqq zzqoVar;
        if (inputStream == null) {
            byte[] bArr = zzsv.zzb;
            int length = bArr.length;
            zzqoVar = zzqq.zzH(bArr, 0, 0, false);
        } else {
            zzqoVar = new zzqo(inputStream, TLObject.FLAG_12, null);
        }
        int i = zzry.zzb;
        int i2 = zzuc.zza;
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

    public static zzsn zzx(zzsn zzsnVar, byte[] bArr) {
        int i = zzry.zzb;
        int i2 = zzuc.zza;
        zzsn zzi = zzi(zzsnVar, bArr, 0, bArr.length, zzry.zza);
        zzg(zzi);
        return zzi;
    }

    public static zzss zzy() {
        return zzso.zzf();
    }

    public static zzss zzz(zzss zzssVar) {
        return zzssVar.zzd(zzssVar.size() << 1);
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

    public final void zzG() {
        zzuc.zza().zzb(getClass()).zzf(this);
        zzH();
    }

    public final void zzH() {
        this.zzd &= ConnectionsManager.DEFAULT_DATACENTER_ID;
    }

    public final void zzJ(int i) {
        this.zzd = (this.zzd & TLObject.FLAG_31) | ConnectionsManager.DEFAULT_DATACENTER_ID;
    }

    public final boolean zzL() {
        return (this.zzd & TLObject.FLAG_31) != 0;
    }

    @Override // com.google.android.recaptcha.internal.zzpw
    public final int zza(zzug zzugVar) {
        if (zzL()) {
            int zza = zzugVar.zza(this);
            if (zza >= 0) {
                return zza;
            }
            sc8.j(de9.k(zza, "serialized size must be non-negative, was "));
            return 0;
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
        sc8.j(de9.k(zza2, "serialized size must be non-negative, was "));
        return 0;
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

    public abstract Object zzh(int i, Object obj, Object obj2);

    @Override // com.google.android.recaptcha.internal.zztt
    public final /* synthetic */ zzts zzm() {
        return (zzsn) zzh(6, null, null);
    }

    public final int zzn() {
        return zzuc.zza().zzb(getClass()).zzb(this);
    }

    @Override // com.google.android.recaptcha.internal.zzts
    public final int zzo() {
        if (zzL()) {
            int zzf = zzf(null);
            if (zzf >= 0) {
                return zzf;
            }
            sc8.j(de9.k(zzf, "serialized size must be non-negative, was "));
            return 0;
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
        sc8.j(de9.k(zzf2, "serialized size must be non-negative, was "));
        return 0;
    }

    @Override // com.google.android.recaptcha.internal.zztt
    public final boolean zzp() {
        return zzj(this, true);
    }

    public final zzsh zzq() {
        return (zzsh) zzh(5, null, null);
    }

    public final zzsh zzr() {
        zzsh zzshVar = (zzsh) zzh(5, null, null);
        zzshVar.zzh(this);
        return zzshVar;
    }

    public final zzsn zzv() {
        return (zzsn) zzh(4, null, null);
    }
}
