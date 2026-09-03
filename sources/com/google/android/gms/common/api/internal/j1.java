package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class j1 extends w0 {
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
    public final void c(p0 p0Var) {
        try {
            h(p0Var);
        } catch (DeadObjectException e6) {
            a(l1.e(e6));
            throw e6;
        } catch (RemoteException e10) {
            a(l1.e(e10));
        } catch (RuntimeException e11) {
            this.b.trySetException(e11);
        }
    }

    @Override // com.google.android.gms.common.api.internal.l1
    public final /* bridge */ /* synthetic */ void d(h1 h1Var, boolean z4) {
        int i10 = this.c;
    }

    @Override // com.google.android.gms.common.api.internal.w0
    public final boolean f(p0 p0Var) {
        switch (this.c) {
            case 0:
                return ((b1) this.d).a.b;
            default:
                b1 b1Var = (b1) p0Var.f.get((n) this.d);
                return b1Var != null && b1Var.a.b;
        }
    }

    @Override // com.google.android.gms.common.api.internal.w0
    public final y5.c[] g(p0 p0Var) {
        switch (this.c) {
            case 0:
                return (y5.c[]) ((b1) this.d).a.d;
            default:
                b1 b1Var = (b1) p0Var.f.get((n) this.d);
                if (b1Var == null) {
                    return null;
                }
                return (y5.c[]) b1Var.a.d;
        }
    }

    public final void h(p0 p0Var) {
        switch (this.c) {
            case 0:
                d1 d1Var = ((b1) this.d).a;
                ((s) ((r) d1Var.e).c).accept(p0Var.b, this.b);
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
    public j1(n nVar, TaskCompletionSource taskCompletionSource) {
        this(4, taskCompletionSource);
        this.c = 1;
        this.d = nVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public j1(b1 b1Var, TaskCompletionSource taskCompletionSource) {
        this(3, taskCompletionSource);
        this.c = 0;
        this.d = b1Var;
    }

    private final /* bridge */ /* synthetic */ void i(h1 h1Var, boolean z4) {
    }

    private final /* bridge */ /* synthetic */ void j(h1 h1Var, boolean z4) {
    }
}
