package l9;

import be.z0;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.internal.cast.z5;
import com.google.firebase.messaging.q;
import java.util.concurrent.Executor;
import r9.r;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final class i implements r9.d, s {
    public static final i b = new i(0);
    public static final i c = new i(1);
    public static final i d = new i(2);
    public static final i e = new i(3);
    public final /* synthetic */ int a;

    public /* synthetic */ i(int i10) {
        this.a = i10;
    }

    @Override // com.google.android.gms.common.api.internal.s
    public Exception a(Status status) {
        int i10 = status.a;
        int i11 = status.a;
        String str = status.b;
        if (i10 == 8) {
            if (str == null) {
                str = x8.j.a(i11);
            }
            return new q(str);
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
                Object c10 = z5Var.c(new r(n9.a.class, Executor.class));
                kotlin.jvm.internal.i.d(c10, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new z0((Executor) c10);
            case 1:
                Object c11 = z5Var.c(new r(n9.c.class, Executor.class));
                kotlin.jvm.internal.i.d(c11, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new z0((Executor) c11);
            case 2:
                Object c12 = z5Var.c(new r(n9.b.class, Executor.class));
                kotlin.jvm.internal.i.d(c12, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new z0((Executor) c12);
            default:
                Object c13 = z5Var.c(new r(n9.d.class, Executor.class));
                kotlin.jvm.internal.i.d(c13, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new z0((Executor) c13);
        }
    }
}
