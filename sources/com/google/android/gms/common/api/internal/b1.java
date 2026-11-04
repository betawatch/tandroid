package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class b1 extends t0 {
    public final TaskCompletionSource b;
    public final /* synthetic */ int c;
    public final Object d;

    public b1(int i3, TaskCompletionSource taskCompletionSource) {
        super(i3);
        this.b = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.api.internal.d1
    public final void a(Status status) {
        this.b.trySetException(new com.google.android.gms.common.api.f(status));
    }

    @Override // com.google.android.gms.common.api.internal.d1
    public final void b(Exception exc) {
        this.b.trySetException(exc);
    }

    @Override // com.google.android.gms.common.api.internal.d1
    public final /* bridge */ /* synthetic */ void c(z0 z0Var, boolean z10) {
        int i3 = this.c;
    }

    @Override // com.google.android.gms.common.api.internal.d1
    public final void d(j0 j0Var) {
        try {
            k(j0Var);
        } catch (DeadObjectException e10) {
            a(d1.e(e10));
            throw e10;
        } catch (RemoteException e11) {
            a(d1.e(e11));
        } catch (RuntimeException e12) {
            this.b.trySetException(e12);
        }
    }

    @Override // com.google.android.gms.common.api.internal.t0
    public final m6.c[] f(j0 j0Var) {
        switch (this.c) {
            case 0:
                return (m6.c[]) ((v0) this.d).a.d;
            default:
                v0 v0Var = (v0) j0Var.f.get((m) this.d);
                if (v0Var == null) {
                    return null;
                }
                return (m6.c[]) v0Var.a.d;
        }
    }

    @Override // com.google.android.gms.common.api.internal.t0
    public final boolean g(j0 j0Var) {
        switch (this.c) {
            case 0:
                return ((v0) this.d).a.a;
            default:
                v0 v0Var = (v0) j0Var.f.get((m) this.d);
                return v0Var != null && v0Var.a.a;
        }
    }

    @Override // com.google.android.gms.common.api.internal.t0
    public final int h(j0 j0Var) {
        switch (this.c) {
            case 0:
                return ((v0) this.d).a.b;
            default:
                v0 v0Var = (v0) j0Var.f.get((m) this.d);
                if (v0Var != null) {
                    return v0Var.a.b;
                }
                return -1;
        }
    }

    public final void k(j0 j0Var) {
        switch (this.c) {
            case 0:
                v0 v0Var = (v0) this.d;
                g2.x xVar = v0Var.a;
                ((p) ((ci.a) xVar.e).c).accept(j0Var.b, this.b);
                m mVar = ((o) xVar.c).b;
                if (mVar != null) {
                    j0Var.f.put(mVar, v0Var);
                    break;
                }
                break;
            default:
                v0 v0Var2 = (v0) j0Var.f.remove((m) this.d);
                if (v0Var2 == null) {
                    this.b.trySetResult(Boolean.FALSE);
                    break;
                } else {
                    ((p) ((ci.a) v0Var2.b.b).d).accept(j0Var.b, this.b);
                    ((o) v0Var2.a.c).b = null;
                    break;
                }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b1(m mVar, TaskCompletionSource taskCompletionSource) {
        this(4, taskCompletionSource);
        this.c = 1;
        this.d = mVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b1(v0 v0Var, TaskCompletionSource taskCompletionSource) {
        this(3, taskCompletionSource);
        this.c = 0;
        this.d = v0Var;
    }

    private final /* bridge */ /* synthetic */ void i(z0 z0Var, boolean z10) {
    }

    private final /* bridge */ /* synthetic */ void j(z0 z0Var, boolean z10) {
    }
}
