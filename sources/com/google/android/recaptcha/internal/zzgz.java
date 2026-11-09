package com.google.android.recaptcha.internal;

import a8.ab;
import android.content.Context;
import c8.u0;
import hd.m;
import hd.u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.Timer;
import kotlin.jvm.internal.j;
import wd.c;
import zd.b0;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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
            int i7 = 0;
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
                    u uVar = new u(iterator, null);
                    c cVar = new c();
                    cVar.c = u0.a(cVar, cVar, uVar);
                    it = cVar;
                } else {
                    it = m.a;
                }
                while (it.hasNext()) {
                    arrayList.add((List) it.next());
                }
            }
            int size2 = arrayList.size();
            while (i7 < size2) {
                Object obj = arrayList.get(i7);
                i7++;
                zzg((List) obj);
            }
        }
    }

    private final void zzg(List list) {
        zzgo zzgoVar;
        zzzm zzk;
        int zzN;
        int i7;
        zzwo zzi = zzwq.zzi();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzgp zzgpVar = (zzgp) it.next();
            try {
                zzk = zzzm.zzk(zzpp.zzg().zzj(zzgpVar.zzc()));
                zzN = zzk.zzN();
                i7 = zzN - 1;
            } catch (Exception unused) {
                zzgo zzgoVar2 = this.zzc;
                if (zzgoVar2 != null) {
                    zzgoVar2.zzf(zzgpVar);
                }
            }
            if (zzN == 0) {
                throw null;
            }
            if (i7 == 0) {
                zzi.zzq(zzk.zzf());
            } else if (i7 == 1) {
                zzi.zzr(zzk.zzg());
            } else if (i7 != 2) {
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
            if (!((zzha) ab.b(zzgt.zza).getValue()).zza(zzd) || (zzgoVar = this.zzc) == null) {
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
            int i7 = zzby.zza;
            b0.q(((zzcr) ab.b(zzgx.zza).getValue()).zza(), new zzgy(this, zzzmVar, null));
        } catch (Exception unused) {
        }
        zzh();
    }
}
