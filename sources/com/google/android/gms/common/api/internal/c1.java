package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class c1 extends t0 {
    public final t b;
    public final TaskCompletionSource c;
    public final q d;

    public c1(int i3, t tVar, TaskCompletionSource taskCompletionSource, q qVar) {
        super(i3);
        this.c = taskCompletionSource;
        this.b = tVar;
        this.d = qVar;
        if (i3 == 2 && tVar.b) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // com.google.android.gms.common.api.internal.d1
    public final void a(Status status) {
        this.c.trySetException(this.d.o(status));
    }

    @Override // com.google.android.gms.common.api.internal.d1
    public final void b(Exception exc) {
        this.c.trySetException(exc);
    }

    @Override // com.google.android.gms.common.api.internal.d1
    public final void c(z0 z0Var, boolean z10) {
        Boolean valueOf = Boolean.valueOf(z10);
        Map map = (Map) z0Var.b;
        TaskCompletionSource taskCompletionSource = this.c;
        map.put(taskCompletionSource, valueOf);
        taskCompletionSource.getTask().addOnCompleteListener(new z0(z0Var, taskCompletionSource));
    }

    @Override // com.google.android.gms.common.api.internal.d1
    public final void d(j0 j0Var) {
        TaskCompletionSource taskCompletionSource = this.c;
        try {
            this.b.c(j0Var.b, taskCompletionSource);
        } catch (DeadObjectException e10) {
            throw e10;
        } catch (RemoteException e11) {
            a(d1.e(e11));
        } catch (RuntimeException e12) {
            taskCompletionSource.trySetException(e12);
        }
    }

    @Override // com.google.android.gms.common.api.internal.t0
    public final m6.c[] f(j0 j0Var) {
        return this.b.a;
    }

    @Override // com.google.android.gms.common.api.internal.t0
    public final boolean g(j0 j0Var) {
        return this.b.b;
    }

    @Override // com.google.android.gms.common.api.internal.t0
    public final int h(j0 j0Var) {
        return this.b.c;
    }
}
