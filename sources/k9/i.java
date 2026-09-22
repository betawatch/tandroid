package k9;

import cc.k;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.t;
import java.util.concurrent.Executor;
import q9.s;
import zd.y0;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public final class i implements q9.d, t {
    public static final i b = new i(0);
    public static final i c = new i(1);
    public static final i d = new i(2);
    public static final i e = new i(3);
    public final /* synthetic */ int a;

    public /* synthetic */ i(int i10) {
        this.a = i10;
    }

    @Override // q9.d
    public Object G(cf.c cVar) {
        switch (this.a) {
            case 0:
                Object m10 = cVar.m(new s(m9.a.class, Executor.class));
                kotlin.jvm.internal.i.d(m10, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new y0((Executor) m10);
            case 1:
                Object m11 = cVar.m(new s(m9.c.class, Executor.class));
                kotlin.jvm.internal.i.d(m11, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new y0((Executor) m11);
            case 2:
                Object m12 = cVar.m(new s(m9.b.class, Executor.class));
                kotlin.jvm.internal.i.d(m12, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new y0((Executor) m12);
            default:
                Object m13 = cVar.m(new s(m9.d.class, Executor.class));
                kotlin.jvm.internal.i.d(m13, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new y0((Executor) m13);
        }
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
            return new k(str);
        }
        if (str == null) {
            str = x8.j.a(i11);
        }
        return new c(str);
    }
}
