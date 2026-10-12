package l9;

import be.z0;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.t;
import com.google.android.gms.internal.cast.z5;
import com.google.firebase.messaging.r;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class i implements r9.d, t {
    public static final i b = new i(0);
    public static final i c = new i(1);
    public static final i d = new i(2);
    public static final i e = new i(3);
    public final /* synthetic */ int a;

    public /* synthetic */ i(int i10) {
        this.a = i10;
    }

    @Override // com.google.android.gms.common.api.internal.t
    public Exception a(Status status) {
        int i10 = status.a;
        int i11 = status.a;
        String str = status.b;
        if (i10 == 8) {
            if (str == null) {
                str = x8.j.a(i11);
            }
            return new r(str);
        }
        if (str == null) {
            str = x8.j.a(i11);
        }
        return new c(str);
    }

    @Override // r9.d
    public Object j2(z5 z5Var) {
        switch (this.a) {
            case 0:
                Object e7 = z5Var.e(new r9.r(n9.a.class, Executor.class));
                kotlin.jvm.internal.i.d(e7, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new z0((Executor) e7);
            case 1:
                Object e10 = z5Var.e(new r9.r(n9.c.class, Executor.class));
                kotlin.jvm.internal.i.d(e10, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new z0((Executor) e10);
            case 2:
                Object e11 = z5Var.e(new r9.r(n9.b.class, Executor.class));
                kotlin.jvm.internal.i.d(e11, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new z0((Executor) e11);
            default:
                Object e12 = z5Var.e(new r9.r(n9.d.class, Executor.class));
                kotlin.jvm.internal.i.d(e12, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new z0((Executor) e12);
        }
    }
}
