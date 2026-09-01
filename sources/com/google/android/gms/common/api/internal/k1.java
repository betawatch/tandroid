package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class k1 extends w0 {
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
    public final void c(p0 p0Var) {
        TaskCompletionSource taskCompletionSource = this.c;
        try {
            this.b.f(p0Var.b, taskCompletionSource);
        } catch (DeadObjectException e6) {
            throw e6;
        } catch (RemoteException e10) {
            a(l1.e(e10));
        } catch (RuntimeException e11) {
            taskCompletionSource.trySetException(e11);
        }
    }

    @Override // com.google.android.gms.common.api.internal.l1
    public final void d(h1 h1Var, boolean z4) {
        Boolean valueOf = Boolean.valueOf(z4);
        Map map = (Map) h1Var.b;
        TaskCompletionSource taskCompletionSource = this.c;
        map.put(taskCompletionSource, valueOf);
        taskCompletionSource.getTask().addOnCompleteListener(new h1(h1Var, taskCompletionSource));
    }

    @Override // com.google.android.gms.common.api.internal.w0
    public final boolean f(p0 p0Var) {
        return this.b.b;
    }

    @Override // com.google.android.gms.common.api.internal.w0
    public final y5.c[] g(p0 p0Var) {
        return (y5.c[]) this.b.c;
    }
}
