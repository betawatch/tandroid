package com.google.android.gms.cast;

import com.google.android.gms.cast.Cast;
import com.google.android.gms.cast.internal.Logger;
import com.google.android.gms.cast.internal.zzab;
import com.google.android.gms.cast.internal.zzah;
import com.google.android.gms.common.api.Status;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class zzbs extends zzah {
    final /* synthetic */ zzbt zza;

    zzbs(zzbt zzbtVar) {
        this.zza = zzbtVar;
    }

    @Override // com.google.android.gms.cast.internal.zzai
    public final void zzb(ApplicationMetadata applicationMetadata, String str, String str2, boolean z) {
        this.zza.zzp = applicationMetadata;
        this.zza.zzq = str;
        zzbt.zzD(this.zza, new com.google.android.gms.cast.internal.zzq(new Status(0), applicationMetadata, str, str2, z));
    }

    @Override // com.google.android.gms.cast.internal.zzai
    public final void zzc(int i) {
        this.zza.zzU(i);
    }

    @Override // com.google.android.gms.cast.internal.zzai
    public final void zzd(final int i) {
        Cast.Listener listener;
        zzbt.zzF(this.zza, i);
        zzbt zzbtVar = this.zza;
        listener = zzbtVar.zzx;
        if (listener != null) {
            zzbt.zzo(zzbtVar).post(new Runnable() { // from class: com.google.android.gms.cast.zzbq
                @Override // java.lang.Runnable
                public final void run() {
                    Cast.Listener listener2;
                    listener2 = zzbs.this.zza.zzx;
                    listener2.onApplicationDisconnected(i);
                }
            });
        }
    }

    @Override // com.google.android.gms.cast.internal.zzai
    public final void zze(int i) {
        zzbt.zzF(this.zza, i);
    }

    @Override // com.google.android.gms.cast.internal.zzai
    public final void zzf(final com.google.android.gms.cast.internal.zza zzaVar) {
        zzbt.zzo(this.zza).post(new Runnable() { // from class: com.google.android.gms.cast.zzbm
            @Override // java.lang.Runnable
            public final void run() {
                zzbt.zzz(zzbs.this.zza, zzaVar);
            }
        });
    }

    @Override // com.google.android.gms.cast.internal.zzai
    public final void zzg(int i) {
        zzbt.zzF(this.zza, i);
    }

    @Override // com.google.android.gms.cast.internal.zzai
    public final void zzh(String str, byte[] bArr) {
        Logger logger;
        logger = zzbt.zzg;
        logger.d("IGNORING: Receive (type=binary, ns=%s) <%d bytes>", str, Integer.valueOf(bArr.length));
    }

    @Override // com.google.android.gms.cast.internal.zzai
    public final void zzi(final int i) {
        zzbt.zzo(this.zza).post(new Runnable() { // from class: com.google.android.gms.cast.zzbo
            @Override // java.lang.Runnable
            public final void run() {
                List list;
                List list2;
                List list3;
                List list4;
                zzbs zzbsVar = zzbs.this;
                int i2 = i;
                if (i2 != 0) {
                    zzbsVar.zza.zzz = 1;
                    list = zzbsVar.zza.zzy;
                    synchronized (list) {
                        try {
                            list2 = zzbsVar.zza.zzy;
                            Iterator it = list2.iterator();
                            while (it.hasNext()) {
                                ((zzq) it.next()).zzb(i2);
                            }
                        } finally {
                        }
                    }
                    zzbsVar.zza.zzS();
                    return;
                }
                zzbsVar.zza.zzz = 2;
                zzbsVar.zza.zzk = true;
                zzbsVar.zza.zzl = true;
                list3 = zzbsVar.zza.zzy;
                synchronized (list3) {
                    try {
                        list4 = zzbsVar.zza.zzy;
                        Iterator it2 = list4.iterator();
                        while (it2.hasNext()) {
                            ((zzq) it2.next()).zza();
                        }
                    } finally {
                    }
                }
            }
        });
    }

    @Override // com.google.android.gms.cast.internal.zzai
    public final void zzj(final zzab zzabVar) {
        zzbt.zzo(this.zza).post(new Runnable() { // from class: com.google.android.gms.cast.zzbl
            @Override // java.lang.Runnable
            public final void run() {
                zzbt.zzA(zzbs.this.zza, zzabVar);
            }
        });
    }

    @Override // com.google.android.gms.cast.internal.zzai
    public final void zzk(final int i) {
        zzbt.zzo(this.zza).post(new Runnable() { // from class: com.google.android.gms.cast.zzbn
            @Override // java.lang.Runnable
            public final void run() {
                List list;
                List list2;
                zzbs zzbsVar = zzbs.this;
                zzbt.zzy(zzbsVar.zza);
                zzbsVar.zza.zzz = 1;
                int i2 = i;
                list = zzbsVar.zza.zzy;
                synchronized (list) {
                    try {
                        list2 = zzbsVar.zza.zzy;
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            ((zzq) it.next()).zzd(i2);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                zzbsVar.zza.zzS();
                zzbt zzbtVar = zzbsVar.zza;
                zzbtVar.zzQ(zzbtVar.zza);
            }
        });
    }

    @Override // com.google.android.gms.cast.internal.zzai
    public final void zzl(String str, long j) {
        zzbt.zzE(this.zza, j, 0);
    }

    @Override // com.google.android.gms.cast.internal.zzai
    public final void zzm(String str, long j, int i) {
        zzbt.zzE(this.zza, j, i);
    }

    @Override // com.google.android.gms.cast.internal.zzai
    public final void zzn(String str, double d, boolean z) {
        Logger logger;
        logger = zzbt.zzg;
        logger.d("Deprecated callback: \"onStatusReceived\"", new Object[0]);
    }

    @Override // com.google.android.gms.cast.internal.zzai
    public final void zzo(final int i) {
        zzbt.zzo(this.zza).post(new Runnable() { // from class: com.google.android.gms.cast.zzbr
            @Override // java.lang.Runnable
            public final void run() {
                List list;
                List list2;
                zzbs zzbsVar = zzbs.this;
                zzbsVar.zza.zzz = 3;
                int i2 = i;
                list = zzbsVar.zza.zzy;
                synchronized (list) {
                    try {
                        list2 = zzbsVar.zza.zzy;
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            ((zzq) it.next()).zzc(i2);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        });
    }

    @Override // com.google.android.gms.cast.internal.zzai
    public final void zzp(final String str, final String str2) {
        Logger logger;
        logger = zzbt.zzg;
        logger.d("Receive (type=text, ns=%s) %s", str, str2);
        zzbt.zzo(this.zza).post(new Runnable() { // from class: com.google.android.gms.cast.zzbp
            @Override // java.lang.Runnable
            public final void run() {
                Cast.MessageReceivedCallback messageReceivedCallback;
                Logger logger2;
                CastDevice castDevice;
                zzbs zzbsVar = zzbs.this;
                Map map = zzbsVar.zza.zze;
                String str3 = str;
                synchronized (map) {
                    messageReceivedCallback = (Cast.MessageReceivedCallback) zzbsVar.zza.zze.get(str3);
                }
                if (messageReceivedCallback == null) {
                    logger2 = zzbt.zzg;
                    logger2.d("Discarded message for unknown namespace '%s'", str3);
                } else {
                    String str4 = str2;
                    castDevice = zzbsVar.zza.zzw;
                    messageReceivedCallback.onMessageReceived(castDevice, str3, str4);
                }
            }
        });
    }
}
