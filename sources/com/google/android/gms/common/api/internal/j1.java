package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class j1 extends w0 {
    public final w b;
    public final TaskCompletionSource c;
    public final t d;

    public j1(int i10, w wVar, TaskCompletionSource taskCompletionSource, t tVar) {
        super(i10);
        this.c = taskCompletionSource;
        this.b = wVar;
        this.d = tVar;
        if (i10 == 2 && wVar.b) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // com.google.android.gms.common.api.internal.k1
    public final void a(Status status) {
        this.c.trySetException(this.d.a(status));
    }

    @Override // com.google.android.gms.common.api.internal.k1
    public final void b(Exception exc) {
        this.c.trySetException(exc);
    }

    @Override // com.google.android.gms.common.api.internal.k1
    public final void c(p0 p0Var) {
        TaskCompletionSource taskCompletionSource = this.c;
        try {
            this.b.f(p0Var.b, taskCompletionSource);
        } catch (DeadObjectException e7) {
            throw e7;
        } catch (RemoteException e10) {
            a(k1.e(e10));
        } catch (RuntimeException e11) {
            taskCompletionSource.trySetException(e11);
        }
    }

    @Override // com.google.android.gms.common.api.internal.k1
    public final void d(g1 g1Var, boolean z10) {
        Boolean valueOf = Boolean.valueOf(z10);
        Map map = (Map) g1Var.b;
        TaskCompletionSource taskCompletionSource = this.c;
        map.put(taskCompletionSource, valueOf);
        taskCompletionSource.getTask().addOnCompleteListener(new g1(g1Var, taskCompletionSource));
    }

    @Override // com.google.android.gms.common.api.internal.w0
    public final boolean f(p0 p0Var) {
        return this.b.b;
    }

    @Override // com.google.android.gms.common.api.internal.w0
    public final k6.c[] g(p0 p0Var) {
        return (k6.c[]) this.b.c;
    }
}
