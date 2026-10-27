package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class i1 extends v0 {
    public final v b;
    public final TaskCompletionSource c;
    public final s d;

    public i1(int i10, v vVar, TaskCompletionSource taskCompletionSource, s sVar) {
        super(i10);
        this.c = taskCompletionSource;
        this.b = vVar;
        this.d = sVar;
        if (i10 == 2 && vVar.b) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // com.google.android.gms.common.api.internal.j1
    public final void a(Status status) {
        this.c.trySetException(this.d.a(status));
    }

    @Override // com.google.android.gms.common.api.internal.j1
    public final void b(Exception exc) {
        this.c.trySetException(exc);
    }

    @Override // com.google.android.gms.common.api.internal.j1
    public final void c(o0 o0Var) {
        TaskCompletionSource taskCompletionSource = this.c;
        try {
            this.b.c(o0Var.b, taskCompletionSource);
        } catch (DeadObjectException e) {
            throw e;
        } catch (RemoteException e10) {
            a(j1.e(e10));
        } catch (RuntimeException e11) {
            taskCompletionSource.trySetException(e11);
        }
    }

    @Override // com.google.android.gms.common.api.internal.j1
    public final void d(f1 f1Var, boolean z10) {
        Boolean valueOf = Boolean.valueOf(z10);
        Map map = (Map) f1Var.b;
        TaskCompletionSource taskCompletionSource = this.c;
        map.put(taskCompletionSource, valueOf);
        taskCompletionSource.getTask().addOnCompleteListener(new f1(f1Var, taskCompletionSource));
    }

    @Override // com.google.android.gms.common.api.internal.v0
    public final boolean f(o0 o0Var) {
        return this.b.b;
    }

    @Override // com.google.android.gms.common.api.internal.v0
    public final l6.c[] g(o0 o0Var) {
        return this.b.a;
    }
}
