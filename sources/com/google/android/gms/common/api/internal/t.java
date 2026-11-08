package com.google.android.gms.common.api.internal;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public abstract class t {
    public final n6.c[] a;
    public final boolean b;
    public final int c;

    public t(n6.c[] cVarArr, boolean z9, int i7) {
        this.a = cVarArr;
        boolean z10 = false;
        if (cVarArr != null && z9) {
            z10 = true;
        }
        this.b = z10;
        this.c = i7;
    }

    public static s b() {
        s sVar = new s();
        sVar.b = true;
        sVar.a = 0;
        return sVar;
    }

    public abstract void c(com.google.android.gms.common.api.c cVar, TaskCompletionSource taskCompletionSource);
}
