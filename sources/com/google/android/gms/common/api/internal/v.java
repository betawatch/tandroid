package com.google.android.gms.common.api.internal;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public abstract class v {
    public final l6.c[] a;
    public final boolean b;
    public final int c;

    public v(l6.c[] cVarArr, boolean z10, int i10) {
        this.a = cVarArr;
        boolean z11 = false;
        if (cVarArr != null && z10) {
            z11 = true;
        }
        this.b = z11;
        this.c = i10;
    }

    public static u b() {
        u uVar = new u();
        uVar.b = true;
        uVar.a = 0;
        return uVar;
    }

    public abstract void c(com.google.android.gms.common.api.c cVar, TaskCompletionSource taskCompletionSource);
}
