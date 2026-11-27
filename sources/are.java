// default package

import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public abstract class are {
    public static iz5 a() {
        hz5 hz5Var = (hz5) jg7.c().a(hz5.class);
        tae taeVar = hz5Var.b;
        taeVar.getClass();
        j2f j2fVar = hz5Var.a;
        iz5 iz5Var = new iz5(taeVar, j2fVar, (Executor) hz5Var.c.a.get());
        u8a u8aVar = new u8a();
        u8aVar.c = iz5Var.f;
        htd htdVar = new htd((byte) 6);
        htdVar.c = iz5.e();
        u8aVar.d = new yse(htdVar);
        rx rxVar = new rx(u8aVar, 1);
        Task task = j2fVar.e;
        xnb.c(1, new dd1(j2fVar, rxVar, ame.c, task.isSuccessful() ? (String) task.getResult() : v26.c.a(j2fVar.g), (byte) 2));
        ((tae) iz5Var.d.get()).b.incrementAndGet();
        return iz5Var;
    }
}
