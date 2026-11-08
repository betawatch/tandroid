package o9;

import a8.i8;
import a8.r7;
import ab.a0;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.q;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.j;
import u9.r;
import zd.v0;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class h implements u9.d, q {
    public static final h b = new h(0);
    public static final h c = new h(1);
    public static final h d = new h(2);
    public static final h e = new h(3);
    public final /* synthetic */ int a;

    public /* synthetic */ h(int i7) {
        this.a = i7;
    }

    @Override // u9.d
    public Object e(r7 r7Var) {
        switch (this.a) {
            case 0:
                Object e10 = r7Var.e(new r(q9.a.class, Executor.class));
                j.d(e10, "get(...)");
                return new v0((Executor) e10);
            case 1:
                Object e11 = r7Var.e(new r(q9.c.class, Executor.class));
                j.d(e11, "get(...)");
                return new v0((Executor) e11);
            case 2:
                Object e12 = r7Var.e(new r(q9.b.class, Executor.class));
                j.d(e12, "get(...)");
                return new v0((Executor) e12);
            default:
                Object e13 = r7Var.e(new r(q9.d.class, Executor.class));
                j.d(e13, "get(...)");
                return new v0((Executor) e13);
        }
    }

    @Override // com.google.android.gms.common.api.internal.q
    public Exception f(Status status) {
        int i7 = status.a;
        int i10 = status.a;
        String str = status.b;
        if (i7 == 8) {
            if (str == null) {
                str = i8.a(i10);
            }
            return new a0(str);
        }
        if (str == null) {
            str = i8.a(i10);
        }
        return new db.b(str);
    }
}
