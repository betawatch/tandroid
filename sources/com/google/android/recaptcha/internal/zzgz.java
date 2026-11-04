package com.google.android.recaptcha.internal;

import android.content.Context;
import b8.hb;
import b8.jc;
import ed.n;
import ed.v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.Timer;
import kotlin.jvm.internal.j;
import td.c;
import wd.b0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
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
            j.e(zzd, "<this>");
            int i3 = 0;
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
                j.e(iterator, "iterator");
                if (iterator.hasNext()) {
                    v vVar = new v(iterator, null);
                    c cVar = new c();
                    cVar.c = jc.a(cVar, cVar, vVar);
                    it = cVar;
                } else {
                    it = n.a;
                }
                while (it.hasNext()) {
                    arrayList.add((List) it.next());
                }
            }
            int size2 = arrayList.size();
            while (i3 < size2) {
                Object obj = arrayList.get(i3);
                i3++;
                zzg((List) obj);
            }
        }
    }

    private final void zzg(List list) {
        zzgo zzgoVar;
        zzzm zzk;
        int zzN;
        int i3;
        zzwo zzi = zzwq.zzi();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzgp zzgpVar = (zzgp) it.next();
            try {
                zzk = zzzm.zzk(zzpp.zzg().zzj(zzgpVar.zzc()));
                zzN = zzk.zzN();
                i3 = zzN - 1;
            } catch (Exception unused) {
                zzgo zzgoVar2 = this.zzc;
                if (zzgoVar2 != null) {
                    zzgoVar2.zzf(zzgpVar);
                }
            }
            if (zzN == 0) {
                throw null;
            }
            if (i3 == 0) {
                zzi.zzq(zzk.zzf());
            } else if (i3 == 1) {
                zzi.zzr(zzk.zzg());
            } else if (i3 != 2) {
                throw new androidx.car.app.j();
            }
            arrayList.add(zzgpVar);
        }
        if (zzi.zzf() + zzi.zze() == 0) {
            return;
        }
        byte[] zzd = ((zzwq) zzi.zzk()).zzd();
        try {
            int i10 = zzby.zza;
            if (!((zzha) hb.b(zzgt.zza).getValue()).zza(zzd) || (zzgoVar = this.zzc) == null) {
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
            int i3 = zzby.zza;
            b0.q(((zzcr) hb.b(zzgx.zza).getValue()).zza(), new zzgy(this, zzzmVar, null));
        } catch (Exception unused) {
        }
        zzh();
    }
}
