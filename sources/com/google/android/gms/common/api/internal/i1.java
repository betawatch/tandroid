package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class i1 extends w0 {
    public final TaskCompletionSource b;
    public final /* synthetic */ int c;
    public final Object d;

    public i1(int i10, TaskCompletionSource taskCompletionSource) {
        super(i10);
        this.b = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.api.internal.k1
    public final void a(Status status) {
        this.b.trySetException(new com.google.android.gms.common.api.f(status));
    }

    @Override // com.google.android.gms.common.api.internal.k1
    public final void b(Exception exc) {
        this.b.trySetException(exc);
    }

    @Override // com.google.android.gms.common.api.internal.k1
    public final void c(p0 p0Var) {
        try {
            h(p0Var);
        } catch (DeadObjectException e7) {
            a(k1.e(e7));
            throw e7;
        } catch (RemoteException e10) {
            a(k1.e(e10));
        } catch (RuntimeException e11) {
            this.b.trySetException(e11);
        }
    }

    @Override // com.google.android.gms.common.api.internal.k1
    public final /* bridge */ /* synthetic */ void d(g1 g1Var, boolean z10) {
        int i10 = this.c;
    }

    @Override // com.google.android.gms.common.api.internal.w0
    public final boolean f(p0 p0Var) {
        switch (this.c) {
            case 0:
                return ((b1) this.d).a.a;
            default:
                b1 b1Var = (b1) p0Var.f.get((n) this.d);
                return b1Var != null && b1Var.a.a;
        }
    }

    @Override // com.google.android.gms.common.api.internal.w0
    public final k6.c[] g(p0 p0Var) {
        switch (this.c) {
            case 0:
                return (k6.c[]) ((b1) this.d).a.d;
            default:
                b1 b1Var = (b1) p0Var.f.get((n) this.d);
                if (b1Var == null) {
                    return null;
                }
                return (k6.c[]) b1Var.a.d;
        }
    }

    public final void h(p0 p0Var) {
        switch (this.c) {
            case 0:
                e2.u uVar = ((b1) this.d).a;
                ((s) ((r) uVar.e).c).accept(p0Var.b, this.b);
                n nVar = ((p) ((b1) this.d).a.c).c;
                if (nVar != null) {
                    p0Var.f.put(nVar, (b1) this.d);
                    break;
                }
                break;
            default:
                TaskCompletionSource taskCompletionSource = this.b;
                b1 b1Var = (b1) p0Var.f.remove((n) this.d);
                if (b1Var == null) {
                    taskCompletionSource.trySetResult(Boolean.FALSE);
                    break;
                } else {
                    ((s) ((r) b1Var.b.b).d).accept(p0Var.b, taskCompletionSource);
                    p pVar = (p) b1Var.a.c;
                    pVar.b = null;
                    pVar.c = null;
                    break;
                }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i1(n nVar, TaskCompletionSource taskCompletionSource) {
        this(4, taskCompletionSource);
        this.c = 1;
        this.d = nVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i1(b1 b1Var, TaskCompletionSource taskCompletionSource) {
        this(3, taskCompletionSource);
        this.c = 0;
        this.d = b1Var;
    }

    private final /* bridge */ /* synthetic */ void i(g1 g1Var, boolean z10) {
    }

    private final /* bridge */ /* synthetic */ void j(g1 g1Var, boolean z10) {
    }
}
