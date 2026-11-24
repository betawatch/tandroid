// default package

import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public abstract class gme {
    public static dx5 a() {
        cx5 cx5Var = (cx5) ae7.c().a(cx5.class);
        d6e d6eVar = cx5Var.b;
        d6eVar.getClass();
        sxe sxeVar = cx5Var.a;
        dx5 dx5Var = new dx5(d6eVar, sxeVar, (Executor) cx5Var.c.a.get());
        wtc wtcVar = new wtc();
        wtcVar.c = dx5Var.f;
        rod rodVar = new rod((byte) 6);
        rodVar.c = dx5.e();
        wtcVar.d = new goe(rodVar);
        qx qxVar = new qx(wtcVar, 1);
        Task task = sxeVar.e;
        yjb.c(1, new vc1(sxeVar, qxVar, jhe.c, task.isSuccessful() ? (String) task.getResult() : r06.c.a(sxeVar.g), (byte) 2));
        ((d6e) dx5Var.d.get()).b.incrementAndGet();
        return dx5Var;
    }
}
