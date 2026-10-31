package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class k1 extends x0 {
    public final w b;
    public final TaskCompletionSource c;
    public final t d;

    public k1(int i10, w wVar, TaskCompletionSource taskCompletionSource, t tVar) {
        super(i10);
        this.c = taskCompletionSource;
        this.b = wVar;
        this.d = tVar;
        if (i10 == 2 && wVar.b) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // com.google.android.gms.common.api.internal.l1
    public final void a(Status status) {
        this.c.trySetException(this.d.a(status));
    }

    @Override // com.google.android.gms.common.api.internal.l1
    public final void b(Exception exc) {
        this.c.trySetException(exc);
    }

    @Override // com.google.android.gms.common.api.internal.l1
    public final void c(q0 q0Var) {
        TaskCompletionSource taskCompletionSource = this.c;
        try {
            this.b.c(q0Var.b, taskCompletionSource);
        } catch (DeadObjectException e) {
            throw e;
        } catch (RemoteException e7) {
            a(l1.e(e7));
        } catch (RuntimeException e10) {
            taskCompletionSource.trySetException(e10);
        }
    }

    @Override // com.google.android.gms.common.api.internal.l1
    public final void d(h1 h1Var, boolean z10) {
        Boolean valueOf = Boolean.valueOf(z10);
        Map map = (Map) h1Var.b;
        TaskCompletionSource taskCompletionSource = this.c;
        map.put(taskCompletionSource, valueOf);
        taskCompletionSource.getTask().addOnCompleteListener(new h1(h1Var, taskCompletionSource));
    }

    @Override // com.google.android.gms.common.api.internal.x0
    public final boolean f(q0 q0Var) {
        return this.b.b;
    }

    @Override // com.google.android.gms.common.api.internal.x0
    public final k6.c[] g(q0 q0Var) {
        return this.b.a;
    }
}
