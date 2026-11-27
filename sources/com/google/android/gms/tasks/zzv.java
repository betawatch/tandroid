package com.google.android.gms.tasks;

import android.app.Activity;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
final class zzv extends c36 {
    private final List zza;

    private zzv(g36 g36Var) {
        super(g36Var);
        this.zza = new ArrayList();
        this.mLifecycleFragment.a("TaskOnStopCallback", this);
    }

    public static zzv zza(Activity activity) {
        zzv zzvVar;
        g36 fragment = c36.getFragment(activity);
        synchronized (fragment) {
            zzvVar = (zzv) fragment.b(zzv.class, "TaskOnStopCallback");
            if (zzvVar == null) {
                zzvVar = new zzv(fragment);
            }
        }
        return zzvVar;
    }

    @Override // c36
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
