package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final class b1 extends s0 {
    public final t b;
    public final TaskCompletionSource c;
    public final q d;

    public b1(int i7, t tVar, TaskCompletionSource taskCompletionSource, q qVar) {
        super(i7);
        this.c = taskCompletionSource;
        this.b = tVar;
        this.d = qVar;
        if (i7 == 2 && tVar.b) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // com.google.android.gms.common.api.internal.c1
    public final void a(Status status) {
        this.c.trySetException(this.d.f(status));
    }

    @Override // com.google.android.gms.common.api.internal.c1
    public final void b(Exception exc) {
        this.c.trySetException(exc);
    }

    @Override // com.google.android.gms.common.api.internal.c1
    public final void c(y0 y0Var, boolean z9) {
        Boolean valueOf = Boolean.valueOf(z9);
        Map map = (Map) y0Var.b;
        TaskCompletionSource taskCompletionSource = this.c;
        map.put(taskCompletionSource, valueOf);
        taskCompletionSource.getTask().addOnCompleteListener(new y0(y0Var, taskCompletionSource));
    }

    @Override // com.google.android.gms.common.api.internal.c1
    public final void d(j0 j0Var) {
        TaskCompletionSource taskCompletionSource = this.c;
        try {
            this.b.c(j0Var.b, taskCompletionSource);
        } catch (DeadObjectException e10) {
            throw e10;
        } catch (RemoteException e11) {
            a(c1.e(e11));
        } catch (RuntimeException e12) {
            taskCompletionSource.trySetException(e12);
        }
    }

    @Override // com.google.android.gms.common.api.internal.s0
    public final n6.c[] f(j0 j0Var) {
        return this.b.a;
    }

    @Override // com.google.android.gms.common.api.internal.s0
    public final boolean g(j0 j0Var) {
        return this.b.b;
    }

    @Override // com.google.android.gms.common.api.internal.s0
    public final int h(j0 j0Var) {
        return this.b.c;
    }
}
