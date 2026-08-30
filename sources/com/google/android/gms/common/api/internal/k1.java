package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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
        } catch (DeadObjectException e) {
            throw e;
        } catch (RemoteException e6) {
            a(l1.e(e6));
        } catch (RuntimeException e10) {
            taskCompletionSource.trySetException(e10);
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
