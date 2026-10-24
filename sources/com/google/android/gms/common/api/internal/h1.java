package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class h1 extends v0 {
    public final TaskCompletionSource b;
    public final /* synthetic */ int c;
    public final Object d;

    public h1(int i10, TaskCompletionSource taskCompletionSource) {
        super(i10);
        this.b = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.api.internal.j1
    public final void a(Status status) {
        this.b.trySetException(new com.google.android.gms.common.api.f(status));
    }

    @Override // com.google.android.gms.common.api.internal.j1
    public final void b(Exception exc) {
        this.b.trySetException(exc);
    }

    @Override // com.google.android.gms.common.api.internal.j1
    public final void c(o0 o0Var) {
        try {
            h(o0Var);
        } catch (DeadObjectException e) {
            a(j1.e(e));
            throw e;
        } catch (RemoteException e7) {
            a(j1.e(e7));
        } catch (RuntimeException e10) {
            this.b.trySetException(e10);
        }
    }

    @Override // com.google.android.gms.common.api.internal.j1
    public final /* bridge */ /* synthetic */ void d(f1 f1Var, boolean z10) {
        int i10 = this.c;
    }

    @Override // com.google.android.gms.common.api.internal.v0
    public final boolean f(o0 o0Var) {
        switch (this.c) {
            case 0:
                return ((a1) this.d).a.a;
            default:
                a1 a1Var = (a1) o0Var.f.get((n) this.d);
                return a1Var != null && a1Var.a.a;
        }
    }

    @Override // com.google.android.gms.common.api.internal.v0
    public final k6.c[] g(o0 o0Var) {
        switch (this.c) {
            case 0:
                return (k6.c[]) ((a1) this.d).a.d;
            default:
                a1 a1Var = (a1) o0Var.f.get((n) this.d);
                if (a1Var == null) {
                    return null;
                }
                return (k6.c[]) a1Var.a.d;
        }
    }

    public final void h(o0 o0Var) {
        switch (this.c) {
            case 0:
                e2.w wVar = ((a1) this.d).a;
                ((r) ((ai.a) wVar.e).c).accept(o0Var.b, this.b);
                n nVar = ((p) ((a1) this.d).a.c).c;
                if (nVar != null) {
                    o0Var.f.put(nVar, (a1) this.d);
                    break;
                }
                break;
            default:
                TaskCompletionSource taskCompletionSource = this.b;
                a1 a1Var = (a1) o0Var.f.remove((n) this.d);
                if (a1Var == null) {
                    taskCompletionSource.trySetResult(Boolean.FALSE);
                    break;
                } else {
                    ((r) ((ai.a) a1Var.b.b).d).accept(o0Var.b, taskCompletionSource);
                    p pVar = (p) a1Var.a.c;
                    pVar.b = null;
                    pVar.c = null;
                    break;
                }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h1(n nVar, TaskCompletionSource taskCompletionSource) {
        this(4, taskCompletionSource);
        this.c = 1;
        this.d = nVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h1(a1 a1Var, TaskCompletionSource taskCompletionSource) {
        this(3, taskCompletionSource);
        this.c = 0;
        this.d = a1Var;
    }

    private final /* bridge */ /* synthetic */ void i(f1 f1Var, boolean z10) {
    }

    private final /* bridge */ /* synthetic */ void j(f1 f1Var, boolean z10) {
    }
}
