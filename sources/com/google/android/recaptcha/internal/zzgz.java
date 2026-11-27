package com.google.android.recaptcha.internal;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.Timer;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class zzgz implements zzgs {
    private static Timer zza;
    private final Context zzb;
    private final zzgo zzc;

    public zzgz(Context context) {
        zzgo zzgoVar;
        this.zzb = context;
        zzgo zzgoVar2 = null;
        try {
            zzgoVar = zzgo.zzd;
            zzgoVar = zzgoVar == null ? new zzgo(context, null) : zzgoVar;
            zzgo.zzd = zzgoVar;
            zzgoVar2 = zzgoVar;
        } catch (Exception unused) {
        }
        this.zzc = zzgoVar2;
        zzh();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzf() {
        ArrayList arrayList;
        Iterator it;
        zzgo zzgoVar = this.zzc;
        if (zzgoVar != null) {
            List zzd = zzgoVar.zzd();
            zzd.getClass();
            int i = 0;
            if ((zzd instanceof RandomAccess) && (zzd instanceof List)) {
                List list = zzd;
                int size = list.size();
                arrayList = new ArrayList((size / 20) + (size % 20 == 0 ? 0 : 1));
                for (int i2 = 0; i2 >= 0 && i2 < size; i2 += 20) {
                    int i3 = size - i2;
                    if (20 <= i3) {
                        i3 = 20;
                    }
                    ArrayList arrayList2 = new ArrayList(i3);
                    for (int i4 = 0; i4 < i3; i4++) {
                        arrayList2.add(list.get(i4 + i2));
                    }
                    arrayList.add(arrayList2);
                }
            } else {
                arrayList = new ArrayList();
                Iterator it2 = zzd.iterator();
                it2.getClass();
                if (it2.hasNext()) {
                    ina inaVar = new ina(it2, null);
                    g8a g8aVar = new g8a();
                    g8aVar.c = inaVar.create(g8aVar, g8aVar);
                    it = g8aVar;
                } else {
                    it = w24.a;
                }
                while (it.hasNext()) {
                    arrayList.add((List) it.next());
                }
            }
            int size2 = arrayList.size();
            while (i < size2) {
                Object obj = arrayList.get(i);
                i++;
                zzg((List) obj);
            }
        }
    }

    private final void zzg(List list) {
        zzgo zzgoVar;
        zzzm zzk;
        int zzN;
        int i;
        zzwo zzi = zzwq.zzi();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzgp zzgpVar = (zzgp) it.next();
            try {
                zzk = zzzm.zzk(zzpp.zzg().zzj(zzgpVar.zzc()));
                zzN = zzk.zzN();
                i = zzN - 1;
            } catch (Exception unused) {
                zzgo zzgoVar2 = this.zzc;
                if (zzgoVar2 != null) {
                    zzgoVar2.zzf(zzgpVar);
                }
            }
            if (zzN == 0) {
                throw null;
            }
            if (i == 0) {
                zzi.zzq(zzk.zzf());
            } else if (i == 1) {
                zzi.zzr(zzk.zzg());
            } else if (i != 2) {
                throw new zp2();
            }
            arrayList.add(zzgpVar);
        }
        if (zzi.zzf() + zzi.zze() != 0) {
            byte[] zzd = ((zzwq) zzi.zzk()).zzd();
            try {
                int i2 = zzby.zza;
                if (!((zzha) ure.b(zzgt.zza).getValue()).zza(zzd) || (zzgoVar = this.zzc) == null) {
                    return;
                }
                zzgoVar.zza(arrayList);
            } catch (Exception unused2) {
            }
        }
    }

    private final void zzh() {
        if (zza == null) {
            Timer timer = new Timer();
            zza = timer;
            timer.schedule(new zzgu(this), 120000L, 120000L);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzgs
    public final void zza(zzzm zzzmVar) {
        try {
            int i = zzby.zza;
            fud.b(((zzcr) ure.b(zzgx.zza).getValue()).zza(), new zzgy(this, zzzmVar, null));
        } catch (Exception unused) {
        }
        zzh();
    }
}
