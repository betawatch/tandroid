package com.google.android.recaptcha.internal;

import android.content.Context;
import androidx.car.app.j;
import ed.c;
import g7.g7;
import g7.x5;
import hd.f0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.Timer;
import kotlin.jvm.internal.i;
import pc.n;
import pc.u;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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
            i.e(zzd, "<this>");
            int i9 = 0;
            if ((zzd instanceof RandomAccess) && (zzd instanceof List)) {
                List list = zzd;
                int size = list.size();
                arrayList = new ArrayList((size / 20) + (size % 20 == 0 ? 0 : 1));
                for (int i10 = 0; i10 >= 0 && i10 < size; i10 += 20) {
                    int i11 = size - i10;
                    if (20 <= i11) {
                        i11 = 20;
                    }
                    ArrayList arrayList2 = new ArrayList(i11);
                    for (int i12 = 0; i12 < i11; i12++) {
                        arrayList2.add(list.get(i12 + i10));
                    }
                    arrayList.add(arrayList2);
                }
            } else {
                arrayList = new ArrayList();
                Iterator iterator = zzd.iterator();
                i.e(iterator, "iterator");
                if (iterator.hasNext()) {
                    u uVar = new u(iterator, null);
                    c cVar = new c();
                    cVar.c = g7.a(cVar, cVar, uVar);
                    it = cVar;
                } else {
                    it = n.a;
                }
                while (it.hasNext()) {
                    arrayList.add((List) it.next());
                }
            }
            int size2 = arrayList.size();
            while (i9 < size2) {
                Object obj = arrayList.get(i9);
                i9++;
                zzg((List) obj);
            }
        }
    }

    private final void zzg(List list) {
        zzgo zzgoVar;
        zzzm zzk;
        int zzN;
        int i9;
        zzwo zzi = zzwq.zzi();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzgp zzgpVar = (zzgp) it.next();
            try {
                zzk = zzzm.zzk(zzpp.zzg().zzj(zzgpVar.zzc()));
                zzN = zzk.zzN();
                i9 = zzN - 1;
            } catch (Exception unused) {
                zzgo zzgoVar2 = this.zzc;
                if (zzgoVar2 != null) {
                    zzgoVar2.zzf(zzgpVar);
                }
            }
            if (zzN == 0) {
                throw null;
            }
            if (i9 == 0) {
                zzi.zzq(zzk.zzf());
            } else if (i9 == 1) {
                zzi.zzr(zzk.zzg());
            } else if (i9 != 2) {
                throw new j();
            }
            arrayList.add(zzgpVar);
        }
        if (zzi.zzf() + zzi.zze() == 0) {
            return;
        }
        byte[] zzd = ((zzwq) zzi.zzk()).zzd();
        try {
            int i10 = zzby.zza;
            if (!((zzha) x5.a(zzgt.zza).a()).zza(zzd) || (zzgoVar = this.zzc) == null) {
                return;
            }
            zzgoVar.zza(arrayList);
        } catch (Exception unused2) {
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
            int i9 = zzby.zza;
            f0.q(((zzcr) x5.a(zzgx.zza).a()).zza(), new zzgy(this, zzzmVar, null));
        } catch (Exception unused) {
        }
        zzh();
    }
}
