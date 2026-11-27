// default package

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class kjd extends ebd {
    public final /* synthetic */ rjd c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kjd(rjd rjdVar) {
        super((byte) 1);
        this.c = rjdVar;
    }

    @Override // ebd
    public final void T(xr xrVar, String str, String str2, boolean z) {
        rjd rjdVar = this.c;
        rjdVar.u = xrVar;
        rjdVar.v = str;
        zdf zdfVar = new zdf(new Status(0, null, null, null), xrVar, str, str2, z);
        synchronized (rjdVar.s) {
            TaskCompletionSource taskCompletionSource = rjdVar.p;
            if (taskCompletionSource != null) {
                taskCompletionSource.setResult(zdfVar);
            }
            rjdVar.p = null;
        }
    }

    @Override // ebd
    public final void V(int i) {
        this.c.i(i);
    }

    @Override // ebd
    public final void W(int i) {
        rjd rjdVar = this.c;
        rjd.g(rjdVar, i);
        if (rjdVar.E != null) {
            rjd.k(rjdVar).post(new uid(this, i, (byte) 2));
        }
    }

    @Override // ebd
    public final void X(int i) {
        rjd.g(this.c, i);
    }

    @Override // ebd
    public final void Y(t9d t9dVar) {
        rjd.k(this.c).post(new xs4((Object) this, (Object) t9dVar, (byte) 20));
    }

    @Override // ebd
    public final void Z(int i) {
        rjd.g(this.c, i);
    }

    @Override // ebd
    public final void b0(int i) {
        rjd.k(this.c).post(new uid(this, i, (byte) 1));
    }

    @Override // ebd
    public final void c0(fad fadVar) {
        rjd.k(this.c).post(new iqd(this, fadVar, (byte) 17));
    }

    @Override // ebd
    public final void d0(int i) {
        rjd.k(this.c).post(new uid(this, i, (byte) 0));
    }

    @Override // ebd
    public final void e0(long j) {
        rjd.f(this.c, j, 0);
    }

    @Override // ebd
    public final void f0(int i, long j) {
        rjd.f(this.c, j, i);
    }

    @Override // ebd
    public final void h0(int i) {
        rjd.k(this.c).post(new uid(this, i, (byte) 3));
    }

    @Override // ebd
    public final void i0(String str, String str2) {
        rjd.H.b("Receive (type=text, ns=%s) %s", str, str2);
        rjd.k(this.c).post(new uy1(this, str, str2, false, (byte) 6));
    }
}
