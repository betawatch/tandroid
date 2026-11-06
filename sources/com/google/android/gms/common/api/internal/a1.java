package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class a1 extends s0 {
    public final TaskCompletionSource b;
    public final /* synthetic */ int c;
    public final Object d;

    public a1(int i7, TaskCompletionSource taskCompletionSource) {
        super(i7);
        this.b = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.api.internal.c1
    public final void a(Status status) {
        this.b.trySetException(new com.google.android.gms.common.api.f(status));
    }

    @Override // com.google.android.gms.common.api.internal.c1
    public final void b(Exception exc) {
        this.b.trySetException(exc);
    }

    @Override // com.google.android.gms.common.api.internal.c1
    public final /* bridge */ /* synthetic */ void c(y0 y0Var, boolean z9) {
        int i7 = this.c;
    }

    @Override // com.google.android.gms.common.api.internal.c1
    public final void d(j0 j0Var) {
        try {
            k(j0Var);
        } catch (DeadObjectException e10) {
            a(c1.e(e10));
            throw e10;
        } catch (RemoteException e11) {
            a(c1.e(e11));
        } catch (RuntimeException e12) {
            this.b.trySetException(e12);
        }
    }

    @Override // com.google.android.gms.common.api.internal.s0
    public final n6.c[] f(j0 j0Var) {
        switch (this.c) {
            case 0:
                return (n6.c[]) ((u0) this.d).a.d;
            default:
                u0 u0Var = (u0) j0Var.f.get((m) this.d);
                if (u0Var == null) {
                    return null;
                }
                return (n6.c[]) u0Var.a.d;
        }
    }

    @Override // com.google.android.gms.common.api.internal.s0
    public final boolean g(j0 j0Var) {
        switch (this.c) {
            case 0:
                return ((u0) this.d).a.a;
            default:
                u0 u0Var = (u0) j0Var.f.get((m) this.d);
                return u0Var != null && u0Var.a.a;
        }
    }

    @Override // com.google.android.gms.common.api.internal.s0
    public final int h(j0 j0Var) {
        switch (this.c) {
            case 0:
                return ((u0) this.d).a.b;
            default:
                u0 u0Var = (u0) j0Var.f.get((m) this.d);
                if (u0Var != null) {
                    return u0Var.a.b;
                }
                return -1;
        }
    }

    public final void k(j0 j0Var) {
        switch (this.c) {
            case 0:
                u0 u0Var = (u0) this.d;
                h2.w wVar = u0Var.a;
                ((p) ((bi.a) wVar.e).c).accept(j0Var.b, this.b);
                m mVar = ((o) wVar.c).b;
                if (mVar != null) {
                    j0Var.f.put(mVar, u0Var);
                    break;
                }
                break;
            default:
                u0 u0Var2 = (u0) j0Var.f.remove((m) this.d);
                if (u0Var2 == null) {
                    this.b.trySetResult(Boolean.FALSE);
                    break;
                } else {
                    ((p) ((bi.a) u0Var2.b.b).d).accept(j0Var.b, this.b);
                    ((o) u0Var2.a.c).b = null;
                    break;
                }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a1(m mVar, TaskCompletionSource taskCompletionSource) {
        this(4, taskCompletionSource);
        this.c = 1;
        this.d = mVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a1(u0 u0Var, TaskCompletionSource taskCompletionSource) {
        this(3, taskCompletionSource);
        this.c = 0;
        this.d = u0Var;
    }

    private final /* bridge */ /* synthetic */ void i(y0 y0Var, boolean z9) {
    }

    private final /* bridge */ /* synthetic */ void j(y0 y0Var, boolean z9) {
    }
}
