package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final class d1 extends u0 {
    public final u b;
    public final TaskCompletionSource c;
    public final r d;

    public d1(int i7, u uVar, TaskCompletionSource taskCompletionSource, r rVar) {
        super(i7);
        this.c = taskCompletionSource;
        this.b = uVar;
        this.d = rVar;
        if (i7 == 2 && uVar.b) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // com.google.android.gms.common.api.internal.e1
    public final void a(Status status) {
        this.c.trySetException(this.d.l(status));
    }

    @Override // com.google.android.gms.common.api.internal.e1
    public final void b(Exception exc) {
        this.c.trySetException(exc);
    }

    @Override // com.google.android.gms.common.api.internal.e1
    public final void c(a1 a1Var, boolean z10) {
        Boolean valueOf = Boolean.valueOf(z10);
        Map map = (Map) a1Var.b;
        TaskCompletionSource taskCompletionSource = this.c;
        map.put(taskCompletionSource, valueOf);
        taskCompletionSource.getTask().addOnCompleteListener(new a1(a1Var, taskCompletionSource));
    }

    @Override // com.google.android.gms.common.api.internal.e1
    public final void d(l0 l0Var) {
        TaskCompletionSource taskCompletionSource = this.c;
        try {
            this.b.c(l0Var.b, taskCompletionSource);
        } catch (DeadObjectException e10) {
            throw e10;
        } catch (RemoteException e11) {
            a(e1.e(e11));
        } catch (RuntimeException e12) {
            taskCompletionSource.trySetException(e12);
        }
    }

    @Override // com.google.android.gms.common.api.internal.u0
    public final n6.c[] f(l0 l0Var) {
        return this.b.a;
    }

    @Override // com.google.android.gms.common.api.internal.u0
    public final boolean g(l0 l0Var) {
        return this.b.b;
    }

    @Override // com.google.android.gms.common.api.internal.u0
    public final int h(l0 l0Var) {
        return this.b.c;
    }
}
