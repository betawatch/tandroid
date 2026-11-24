// default package

import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class joe {
    public static dz5 a() {
        cz5 cz5Var = (cz5) cg7.c().a(cz5.class);
        g8e g8eVar = cz5Var.b;
        g8eVar.getClass();
        uze uzeVar = cz5Var.a;
        dz5 dz5Var = new dz5(g8eVar, uzeVar, (Executor) cz5Var.c.a.get());
        e7a e7aVar = new e7a();
        e7aVar.c = dz5Var.f;
        uqd uqdVar = new uqd((byte) 6);
        uqdVar.c = dz5.e();
        e7aVar.d = new jqe(uqdVar);
        ry ryVar = new ry(e7aVar, 1);
        Task task = uzeVar.e;
        mlb.c(1, new de1(uzeVar, ryVar, kje.c, task.isSuccessful() ? (String) task.getResult() : r26.c.a(uzeVar.g), (byte) 2));
        ((g8e) dz5Var.d.get()).b.incrementAndGet();
        return dz5Var;
    }
}
