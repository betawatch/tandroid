package n9;

import b8.ke;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.q;
import java.util.concurrent.Executor;
import l6.m;
import t9.r;
import wd.v0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class i implements t9.d, q {
    public static final i b = new i(0);
    public static final i c = new i(1);
    public static final i d = new i(2);
    public static final i e = new i(3);
    public final /* synthetic */ int a;

    public /* synthetic */ i(int i3) {
        this.a = i3;
    }

    @Override // com.google.android.gms.common.api.internal.q
    public Exception o(Status status) {
        int i3 = status.a;
        int i10 = status.a;
        String str = status.b;
        if (i3 == 8) {
            if (str == null) {
                str = z8.c.a(i10);
            }
            return new m(str);
        }
        if (str == null) {
            str = z8.c.a(i10);
        }
        return new c(str);
    }

    @Override // t9.d
    public Object q1(ke keVar) {
        switch (this.a) {
            case 0:
                Object g7 = keVar.g(new r(p9.a.class, Executor.class));
                kotlin.jvm.internal.j.d(g7, "get(...)");
                return new v0((Executor) g7);
            case 1:
                Object g10 = keVar.g(new r(p9.c.class, Executor.class));
                kotlin.jvm.internal.j.d(g10, "get(...)");
                return new v0((Executor) g10);
            case 2:
                Object g11 = keVar.g(new r(p9.b.class, Executor.class));
                kotlin.jvm.internal.j.d(g11, "get(...)");
                return new v0((Executor) g11);
            default:
                Object g12 = keVar.g(new r(p9.d.class, Executor.class));
                kotlin.jvm.internal.j.d(g12, "get(...)");
                return new v0((Executor) g12);
        }
    }
}
