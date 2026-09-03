package com.google.android.recaptcha.internal;

import a7.b;
import android.content.Context;
import id.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.Timer;
import k7.g8;
import k7.o7;
import kotlin.jvm.internal.j;
import ld.e0;
import tc.n;
import tc.u;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
            int i10 = 0;
            if ((zzd instanceof RandomAccess) && (zzd instanceof List)) {
                List list = zzd;
                int size = list.size();
                arrayList = new ArrayList((size / 20) + (size % 20 == 0 ? 0 : 1));
                for (int i11 = 0; i11 >= 0 && i11 < size; i11 += 20) {
                    int i12 = size - i11;
                    if (20 <= i12) {
                        i12 = 20;
                    }
                    ArrayList arrayList2 = new ArrayList(i12);
                    for (int i13 = 0; i13 < i12; i13++) {
                        arrayList2.add(list.get(i13 + i11));
                    }
                    arrayList.add(arrayList2);
                }
            } else {
                arrayList = new ArrayList();
                Iterator iterator = zzd.iterator();
                j.e(iterator, "iterator");
                if (iterator.hasNext()) {
                    u uVar = new u(iterator, null);
                    c cVar = new c();
                    cVar.c = g8.a(uVar, cVar, cVar);
                    it = cVar;
                } else {
                    it = n.a;
                }
                while (it.hasNext()) {
                    arrayList.add((List) it.next());
                }
            }
            int size2 = arrayList.size();
            while (i10 < size2) {
                Object obj = arrayList.get(i10);
                i10++;
                zzg((List) obj);
            }
        }
    }

    private final void zzg(List list) {
        zzgo zzgoVar;
        zzzm zzk;
        int zzN;
        int i10;
        zzwo zzi = zzwq.zzi();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzgp zzgpVar = (zzgp) it.next();
            try {
                zzk = zzzm.zzk(zzpp.zzg().zzj(zzgpVar.zzc()));
                zzN = zzk.zzN();
                i10 = zzN - 1;
            } catch (Exception unused) {
                zzgo zzgoVar2 = this.zzc;
                if (zzgoVar2 != null) {
                    zzgoVar2.zzf(zzgpVar);
                }
            }
            if (zzN == 0) {
                throw null;
            }
            if (i10 == 0) {
                zzi.zzq(zzk.zzf());
            } else if (i10 == 1) {
                zzi.zzr(zzk.zzg());
            } else if (i10 != 2) {
                throw new b();
            }
            arrayList.add(zzgpVar);
        }
        if (zzi.zzf() + zzi.zze() == 0) {
            return;
        }
        byte[] zzd = ((zzwq) zzi.zzk()).zzd();
        try {
            int i11 = zzby.zza;
            if (!((zzha) o7.a(zzgt.zza).a()).zza(zzd) || (zzgoVar = this.zzc) == null) {
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
            int i10 = zzby.zza;
            e0.q(((zzcr) o7.a(zzgx.zza).a()).zza(), new zzgy(this, zzzmVar, null));
        } catch (Exception unused) {
        }
        zzh();
    }
}
