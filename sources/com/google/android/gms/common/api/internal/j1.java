package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class j1 extends x0 {
    public final TaskCompletionSource b;
    public final /* synthetic */ int c;
    public final Object d;

    public j1(int i10, TaskCompletionSource taskCompletionSource) {
        super(i10);
        this.b = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.api.internal.l1
    public final void a(Status status) {
        this.b.trySetException(new com.google.android.gms.common.api.f(status));
    }

    @Override // com.google.android.gms.common.api.internal.l1
    public final void b(Exception exc) {
        this.b.trySetException(exc);
    }

    @Override // com.google.android.gms.common.api.internal.l1
    public final void c(q0 q0Var) {
        try {
            h(q0Var);
        } catch (DeadObjectException e) {
            a(l1.e(e));
            throw e;
        } catch (RemoteException e7) {
            a(l1.e(e7));
        } catch (RuntimeException e10) {
            this.b.trySetException(e10);
        }
    }

    @Override // com.google.android.gms.common.api.internal.l1
    public final /* bridge */ /* synthetic */ void d(h1 h1Var, boolean z10) {
        int i10 = this.c;
    }

    @Override // com.google.android.gms.common.api.internal.x0
    public final boolean f(q0 q0Var) {
        switch (this.c) {
            case 0:
                return ((c1) this.d).a.a;
            default:
                c1 c1Var = (c1) q0Var.f.get((n) this.d);
                return c1Var != null && c1Var.a.a;
        }
    }

    @Override // com.google.android.gms.common.api.internal.x0
    public final k6.c[] g(q0 q0Var) {
        switch (this.c) {
            case 0:
                return (k6.c[]) ((c1) this.d).a.d;
            default:
                c1 c1Var = (c1) q0Var.f.get((n) this.d);
                if (c1Var == null) {
                    return null;
                }
                return (k6.c[]) c1Var.a.d;
        }
    }

    public final void h(q0 q0Var) {
        switch (this.c) {
            case 0:
                e2.w wVar = ((c1) this.d).a;
                ((s) ((r) wVar.e).c).accept(q0Var.b, this.b);
                n nVar = ((p) ((c1) this.d).a.c).c;
                if (nVar != null) {
                    q0Var.f.put(nVar, (c1) this.d);
                    break;
                }
                break;
            default:
                TaskCompletionSource taskCompletionSource = this.b;
                c1 c1Var = (c1) q0Var.f.remove((n) this.d);
                if (c1Var == null) {
                    taskCompletionSource.trySetResult(Boolean.FALSE);
                    break;
                } else {
                    ((s) ((r) c1Var.b.b).d).accept(q0Var.b, taskCompletionSource);
                    p pVar = (p) c1Var.a.c;
                    pVar.b = null;
                    pVar.c = null;
                    break;
                }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public j1(n nVar, TaskCompletionSource taskCompletionSource) {
        this(4, taskCompletionSource);
        this.c = 1;
        this.d = nVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public j1(c1 c1Var, TaskCompletionSource taskCompletionSource) {
        this(3, taskCompletionSource);
        this.c = 0;
        this.d = c1Var;
    }

    private final /* bridge */ /* synthetic */ void i(h1 h1Var, boolean z10) {
    }

    private final /* bridge */ /* synthetic */ void j(h1 h1Var, boolean z10) {
    }
}
