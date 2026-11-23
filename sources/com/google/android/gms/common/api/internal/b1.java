package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class b1 extends t0 {
    public final TaskCompletionSource b;
    public final /* synthetic */ int c;
    public final Object d;

    public b1(int i7, TaskCompletionSource taskCompletionSource) {
        super(i7);
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
        int i7 = this.c;
    }

    @Override // com.google.android.gms.common.api.internal.d1
    public final void d(k0 k0Var) {
        try {
            k(k0Var);
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
    public final n6.c[] f(k0 k0Var) {
        switch (this.c) {
            case 0:
                return (n6.c[]) ((v0) this.d).a.d;
            default:
                v0 v0Var = (v0) k0Var.f.get((m) this.d);
                if (v0Var == null) {
                    return null;
                }
                return (n6.c[]) v0Var.a.d;
        }
    }

    @Override // com.google.android.gms.common.api.internal.t0
    public final boolean g(k0 k0Var) {
        switch (this.c) {
            case 0:
                return ((v0) this.d).a.a;
            default:
                v0 v0Var = (v0) k0Var.f.get((m) this.d);
                return v0Var != null && v0Var.a.a;
        }
    }

    @Override // com.google.android.gms.common.api.internal.t0
    public final int h(k0 k0Var) {
        switch (this.c) {
            case 0:
                return ((v0) this.d).a.b;
            default:
                v0 v0Var = (v0) k0Var.f.get((m) this.d);
                if (v0Var != null) {
                    return v0Var.a.b;
                }
                return -1;
        }
    }

    public final void k(k0 k0Var) {
        switch (this.c) {
            case 0:
                v0 v0Var = (v0) this.d;
                h2.w wVar = v0Var.a;
                ((q) ((p) wVar.e).c).accept(k0Var.b, this.b);
                m mVar = ((o) wVar.c).b;
                if (mVar != null) {
                    k0Var.f.put(mVar, v0Var);
                    break;
                }
                break;
            default:
                v0 v0Var2 = (v0) k0Var.f.remove((m) this.d);
                if (v0Var2 == null) {
                    this.b.trySetResult(Boolean.FALSE);
                    break;
                } else {
                    ((q) ((p) v0Var2.b.b).d).accept(k0Var.b, this.b);
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
