package com.google.android.gms.tasks;

import android.app.Activity;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
final class zzv extends y06 {
    private final List zza;

    private zzv(c16 c16Var) {
        super(c16Var);
        this.zza = new ArrayList();
        this.mLifecycleFragment.a("TaskOnStopCallback", this);
    }

    public static zzv zza(Activity activity) {
        zzv zzvVar;
        c16 fragment = y06.getFragment(activity);
        synchronized (fragment) {
            zzvVar = (zzv) fragment.b(zzv.class, "TaskOnStopCallback");
            if (zzvVar == null) {
                zzvVar = new zzv(fragment);
            }
        }
        return zzvVar;
    }

    @Override // y06
    public final void onStop() {
        List list = this.zza;
        synchronized (list) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                zzq zzqVar = (zzq) ((WeakReference) it.next()).get();
                if (zzqVar != null) {
                    zzqVar.zzb();
                }
            }
            list.clear();
        }
    }

    public final void zzb(zzq zzqVar) {
        List list = this.zza;
        synchronized (list) {
            list.add(new WeakReference(zzqVar));
        }
    }
}
