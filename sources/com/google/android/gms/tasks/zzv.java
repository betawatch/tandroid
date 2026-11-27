package com.google.android.gms.tasks;

import android.app.Activity;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
