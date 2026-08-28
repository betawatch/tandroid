package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class i1 extends w0 {
    public final TaskCompletionSource b;
    public final /* synthetic */ int c;
    public final Object d;

    public i1(int i9, TaskCompletionSource taskCompletionSource) {
        super(i9);
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
        } catch (DeadObjectException e10) {
            a(k1.e(e10));
            throw e10;
        } catch (RemoteException e11) {
            a(k1.e(e11));
        } catch (RuntimeException e12) {
            this.b.trySetException(e12);
        }
    }

    @Override // com.google.android.gms.common.api.internal.k1
    public final /* bridge */ /* synthetic */ void d(g1 g1Var, boolean z10) {
        int i9 = this.c;
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
    public final u5.c[] g(p0 p0Var) {
        switch (this.c) {
            case 0:
                return (u5.c[]) ((b1) this.d).a.d;
            default:
                b1 b1Var = (b1) p0Var.f.get((n) this.d);
                if (b1Var == null) {
                    return null;
                }
                return (u5.c[]) b1Var.a.d;
        }
    }

    public final void h(p0 p0Var) {
        switch (this.c) {
            case 0:
                com.google.android.exoplayer2.upstream.t tVar = ((b1) this.d).a;
                ((s) ((r) tVar.e).c).accept(p0Var.b, this.b);
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
