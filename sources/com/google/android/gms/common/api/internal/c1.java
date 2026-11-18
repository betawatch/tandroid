package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final class c1 extends u0 {
    public final TaskCompletionSource b;
    public final /* synthetic */ int c;
    public final Object d;

    public c1(int i7, TaskCompletionSource taskCompletionSource) {
        super(i7);
        this.b = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.api.internal.e1
    public final void a(Status status) {
        this.b.trySetException(new com.google.android.gms.common.api.f(status));
    }

    @Override // com.google.android.gms.common.api.internal.e1
    public final void b(Exception exc) {
        this.b.trySetException(exc);
    }

    @Override // com.google.android.gms.common.api.internal.e1
    public final /* bridge */ /* synthetic */ void c(a1 a1Var, boolean z10) {
        int i7 = this.c;
    }

    @Override // com.google.android.gms.common.api.internal.e1
    public final void d(l0 l0Var) {
        try {
            k(l0Var);
        } catch (DeadObjectException e10) {
            a(e1.e(e10));
            throw e10;
        } catch (RemoteException e11) {
            a(e1.e(e11));
        } catch (RuntimeException e12) {
            this.b.trySetException(e12);
        }
    }

    @Override // com.google.android.gms.common.api.internal.u0
    public final n6.c[] f(l0 l0Var) {
        switch (this.c) {
            case 0:
                return (n6.c[]) ((w0) this.d).a.d;
            default:
                w0 w0Var = (w0) l0Var.f.get((m) this.d);
                if (w0Var == null) {
                    return null;
                }
                return (n6.c[]) w0Var.a.d;
        }
    }

    @Override // com.google.android.gms.common.api.internal.u0
    public final boolean g(l0 l0Var) {
        switch (this.c) {
            case 0:
                return ((w0) this.d).a.a;
            default:
                w0 w0Var = (w0) l0Var.f.get((m) this.d);
                return w0Var != null && w0Var.a.a;
        }
    }

    @Override // com.google.android.gms.common.api.internal.u0
    public final int h(l0 l0Var) {
        switch (this.c) {
            case 0:
                return ((w0) this.d).a.b;
            default:
                w0 w0Var = (w0) l0Var.f.get((m) this.d);
                if (w0Var != null) {
                    return w0Var.a.b;
                }
                return -1;
        }
    }

    public final void k(l0 l0Var) {
        switch (this.c) {
            case 0:
                w0 w0Var = (w0) this.d;
                h2.w wVar = w0Var.a;
                ((q) ((p) wVar.e).c).accept(l0Var.b, this.b);
                m mVar = ((o) wVar.c).b;
                if (mVar != null) {
                    l0Var.f.put(mVar, w0Var);
                    break;
                }
                break;
            default:
                w0 w0Var2 = (w0) l0Var.f.remove((m) this.d);
                if (w0Var2 == null) {
                    this.b.trySetResult(Boolean.FALSE);
                    break;
                } else {
                    ((q) ((p) w0Var2.b.b).d).accept(l0Var.b, this.b);
                    ((o) w0Var2.a.c).b = null;
                    break;
                }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c1(m mVar, TaskCompletionSource taskCompletionSource) {
        this(4, taskCompletionSource);
        this.c = 1;
        this.d = mVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c1(w0 w0Var, TaskCompletionSource taskCompletionSource) {
        this(3, taskCompletionSource);
        this.c = 0;
        this.d = w0Var;
    }

    private final /* bridge */ /* synthetic */ void i(a1 a1Var, boolean z10) {
    }

    private final /* bridge */ /* synthetic */ void j(a1 a1Var, boolean z10) {
    }
}
