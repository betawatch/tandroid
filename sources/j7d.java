// default package

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class j7d extends t6d {
    public final TaskCompletionSource b;
    public final /* synthetic */ byte c;
    public final Object d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public j7d(y76 y76Var, TaskCompletionSource taskCompletionSource) {
        this(4, taskCompletionSource);
        this.c = (byte) 1;
        this.d = y76Var;
    }

    @Override // o7d
    public final void a(Status status) {
        this.b.trySetException(new ao(status));
    }

    @Override // o7d
    public final void b(RuntimeException runtimeException) {
        this.b.trySetException(runtimeException);
    }

    @Override // o7d
    public final /* bridge */ /* synthetic */ void c(zhc zhcVar, boolean z) {
        byte b = this.c;
    }

    @Override // o7d
    public final void d(l6d l6dVar) {
        try {
            k(l6dVar);
        } catch (DeadObjectException e) {
            a(o7d.e(e));
            throw e;
        } catch (RemoteException e2) {
            a(o7d.e(e2));
        } catch (RuntimeException e3) {
            this.b.trySetException(e3);
        }
    }

    @Override // t6d
    public final a94[] f(l6d l6dVar) {
        byte b = this.c;
        Object obj = this.d;
        switch (b) {
            case 0:
                return ((x6d) obj).a.b;
            default:
                x6d x6dVar = (x6d) l6dVar.f.get((y76) obj);
                if (x6dVar == null) {
                    return null;
                }
                return x6dVar.a.b;
        }
    }

    @Override // t6d
    public final boolean g(l6d l6dVar) {
        byte b = this.c;
        Object obj = this.d;
        switch (b) {
            case 0:
                return ((x6d) obj).a.c;
            default:
                x6d x6dVar = (x6d) l6dVar.f.get((y76) obj);
                return x6dVar != null && x6dVar.a.c;
        }
    }

    @Override // t6d
    public final int h(l6d l6dVar) {
        byte b = this.c;
        Object obj = this.d;
        switch (b) {
            case 0:
                return ((x6d) obj).a.d;
            default:
                x6d x6dVar = (x6d) l6dVar.f.get((y76) obj);
                if (x6dVar != null) {
                    return x6dVar.a.d;
                }
                return -1;
        }
    }

    public final void k(l6d l6dVar) {
        switch (this.c) {
            case 0:
                x6d x6dVar = (x6d) this.d;
                y6d y6dVar = x6dVar.a;
                y6dVar.e.a.accept(l6dVar.b, this.b);
                y76 y76Var = y6dVar.a.b;
                if (y76Var != null) {
                    l6dVar.f.put(y76Var, x6dVar);
                    break;
                }
                break;
            default:
                x6d x6dVar2 = (x6d) l6dVar.f.remove((y76) this.d);
                if (x6dVar2 == null) {
                    this.b.trySetResult(Boolean.FALSE);
                    break;
                } else {
                    ((g99) x6dVar2.b.c).b.accept(l6dVar.b, this.b);
                    x6dVar2.a.a.b = null;
                    break;
                }
        }
    }

    public j7d(int i, TaskCompletionSource taskCompletionSource) {
        super(i);
        this.b = taskCompletionSource;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public j7d(x6d x6dVar, TaskCompletionSource taskCompletionSource) {
        this(3, taskCompletionSource);
        this.c = (byte) 0;
        this.d = x6dVar;
    }

    private final /* bridge */ /* synthetic */ void i(zhc zhcVar, boolean z) {
    }

    private final /* bridge */ /* synthetic */ void j(zhc zhcVar, boolean z) {
    }
}
