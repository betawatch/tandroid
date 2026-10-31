package l9;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.t;
import j6.l;
import java.util.concurrent.Executor;
import r9.r;
import td.y0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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

    @Override // r9.d
    public Object K(bh.d dVar) {
        switch (this.a) {
            case 0:
                Object d10 = dVar.d(new r(n9.a.class, Executor.class));
                kotlin.jvm.internal.i.d(d10, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new y0((Executor) d10);
            case 1:
                Object d11 = dVar.d(new r(n9.c.class, Executor.class));
                kotlin.jvm.internal.i.d(d11, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new y0((Executor) d11);
            case 2:
                Object d12 = dVar.d(new r(n9.b.class, Executor.class));
                kotlin.jvm.internal.i.d(d12, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new y0((Executor) d12);
            default:
                Object d13 = dVar.d(new r(n9.d.class, Executor.class));
                kotlin.jvm.internal.i.d(d13, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new y0((Executor) d13);
        }
    }

    @Override // com.google.android.gms.common.api.internal.t
    public Exception a(Status status) {
        int i10 = status.a;
        int i11 = status.a;
        String str = status.b;
        if (i10 == 8) {
            if (str == null) {
                str = x8.c.a(i11);
            }
            return new l(str);
        }
        if (str == null) {
            str = x8.c.a(i11);
        }
        return new c(str);
    }
}
