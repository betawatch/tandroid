package m9;

import a8.me;
import ce.z0;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.s;
import com.google.firebase.messaging.p;
import java.util.concurrent.Executor;
import s9.r;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class i implements s9.d, s {
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
                str = y8.j.a(i11);
            }
            return new p(str);
        }
        if (str == null) {
            str = y8.j.a(i11);
        }
        return new c(str);
    }

    @Override // s9.d
    public Object d1(me meVar) {
        switch (this.a) {
            case 0:
                Object n10 = meVar.n(new r(o9.a.class, Executor.class));
                kotlin.jvm.internal.i.d(n10, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new z0((Executor) n10);
            case 1:
                Object n11 = meVar.n(new r(o9.c.class, Executor.class));
                kotlin.jvm.internal.i.d(n11, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new z0((Executor) n11);
            case 2:
                Object n12 = meVar.n(new r(o9.b.class, Executor.class));
                kotlin.jvm.internal.i.d(n12, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new z0((Executor) n12);
            default:
                Object n13 = meVar.n(new r(o9.d.class, Executor.class));
                kotlin.jvm.internal.i.d(n13, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new z0((Executor) n13);
        }
    }
}
