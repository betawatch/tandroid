package com.google.android.gms.common.api.internal;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public abstract class w {
    public final k6.c[] a;
    public final boolean b;
    public final int c;

    public w(k6.c[] cVarArr, boolean z10, int i10) {
        this.a = cVarArr;
        boolean z11 = false;
        if (cVarArr != null && z10) {
            z11 = true;
        }
        this.b = z11;
        this.c = i10;
    }

    public static v b() {
        v vVar = new v();
        vVar.b = true;
        vVar.a = 0;
        return vVar;
    }

    public abstract void c(com.google.android.gms.common.api.c cVar, TaskCompletionSource taskCompletionSource);
}
