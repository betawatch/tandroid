package c8;

import com.google.android.gms.tasks.Task;
import com.google.mlkit.nl.languageid.internal.LanguageIdentifierImpl;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public abstract class zb {
    public static LanguageIdentifierImpl a() {
        tb.a aVar = (tb.a) pb.g.c().a(tb.a.class);
        tb.e eVar = aVar.b;
        eVar.getClass();
        y7.e9 e9Var = aVar.a;
        LanguageIdentifierImpl languageIdentifierImpl = new LanguageIdentifierImpl(eVar, e9Var, (Executor) aVar.c.a.get());
        ab.b0 b0Var = new ab.b0(15, false);
        b0Var.d = languageIdentifierImpl.f;
        y7.d6 d6Var = new y7.d6();
        d6Var.b = LanguageIdentifierImpl.k();
        b0Var.e = new y7.l7(d6Var);
        a8.wa waVar = new a8.wa(b0Var, 1);
        Task task = e9Var.e;
        pb.m.a.execute(new a8.pa(e9Var, waVar, y7.n6.c, task.isSuccessful() ? (String) task.getResult() : q6.j.c.a(e9Var.g), 7));
        ((tb.e) languageIdentifierImpl.d.get()).b.incrementAndGet();
        return languageIdentifierImpl;
    }
}
