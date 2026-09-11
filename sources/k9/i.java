package k9;

import cc.k;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.t;
import java.util.concurrent.Executor;
import q9.r;
import zd.y0;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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
    public Object D(cf.c cVar) {
        switch (this.a) {
            case 0:
                Object i10 = cVar.i(new r(m9.a.class, Executor.class));
                kotlin.jvm.internal.i.d(i10, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new y0((Executor) i10);
            case 1:
                Object i11 = cVar.i(new r(m9.c.class, Executor.class));
                kotlin.jvm.internal.i.d(i11, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new y0((Executor) i11);
            case 2:
                Object i12 = cVar.i(new r(m9.b.class, Executor.class));
                kotlin.jvm.internal.i.d(i12, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new y0((Executor) i12);
            default:
                Object i13 = cVar.i(new r(m9.d.class, Executor.class));
                kotlin.jvm.internal.i.d(i13, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new y0((Executor) i13);
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
