package com.google.android.gms.common.api.internal;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class w {
    public final u5.c[] a;
    public final boolean b;
    public final int c;

    public w(u5.c[] cVarArr, boolean z10, int i9) {
        this.a = cVarArr;
        boolean z11 = false;
        if (cVarArr != null && z10) {
            z11 = true;
        }
        this.b = z11;
        this.c = i9;
    }

    public static v b() {
        v vVar = new v();
        vVar.b = true;
        vVar.a = 0;
        return vVar;
    }

    public abstract void c(com.google.android.gms.common.api.c cVar, TaskCompletionSource taskCompletionSource);
}
