package com.google.android.gms.tasks;

import java.util.ArrayList;
import java.util.Collection;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
final class zzab implements Continuation {
    final /* synthetic */ Collection zza;

    public zzab(Collection collection) {
        this.zza = collection;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* bridge */ /* synthetic */ Object then(Task task) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.zza);
        return Tasks.forResult(arrayList);
    }
}
