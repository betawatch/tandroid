package com.google.android.recaptcha.internal;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

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
        zzgo zzgoVar = this.zzc;
        if (zzgoVar != null) {
            Iterator it = CollectionsKt.windowed(zzgoVar.zzd(), 20, 20, true).iterator();
            while (it.hasNext()) {
                zzg((List) it.next());
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
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                Unit unit = Unit.INSTANCE;
            }
            arrayList.add(zzgpVar);
        }
        if (zzi.zze() + zzi.zzf() == 0) {
            return;
        }
        byte[] zzd = ((zzwq) zzi.zzk()).zzd();
        try {
            int i2 = zzby.zza;
            if (!((zzha) LazyKt.lazy(zzgt.zza).getValue()).zza(zzd) || (zzgoVar = this.zzc) == null) {
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
            int i = zzby.zza;
            BuildersKt__Builders_commonKt.launch$default(((zzcr) LazyKt.lazy(zzgx.zza).getValue()).zza(), null, null, new zzgy(this, zzzmVar, null), 3, null);
        } catch (Exception unused) {
        }
        zzh();
    }
}
