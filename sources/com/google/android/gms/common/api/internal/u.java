package com.google.android.gms.common.api.internal;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public abstract class u {
    public final n6.c[] a;
    public final boolean b;
    public final int c;

    public u(n6.c[] cVarArr, boolean z10, int i7) {
        this.a = cVarArr;
        boolean z11 = false;
        if (cVarArr != null && z10) {
            z11 = true;
        }
        this.b = z11;
        this.c = i7;
    }

    public static t b() {
        t tVar = new t();
        tVar.b = true;
        tVar.a = 0;
        return tVar;
    }

    public abstract void c(com.google.android.gms.common.api.c cVar, TaskCompletionSource taskCompletionSource);
}
