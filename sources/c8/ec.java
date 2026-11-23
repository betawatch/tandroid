package c8;

import com.google.android.gms.tasks.Task;
import com.google.mlkit.nl.languageid.internal.LanguageIdentifierImpl;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public abstract class ec {
    public static LanguageIdentifierImpl a() {
        tb.a aVar = (tb.a) pb.g.c().a(tb.a.class);
        tb.e eVar = aVar.b;
        eVar.getClass();
        y7.d9 d9Var = aVar.a;
        LanguageIdentifierImpl languageIdentifierImpl = new LanguageIdentifierImpl(eVar, d9Var, (Executor) aVar.c.a.get());
        xi.e eVar2 = new xi.e();
        eVar2.c = languageIdentifierImpl.f;
        y7.f7 f7Var = new y7.f7();
        f7Var.b = LanguageIdentifierImpl.k();
        eVar2.d = new y7.k7(f7Var);
        a8.xa xaVar = new a8.xa(eVar2, 1);
        Task task = d9Var.e;
        pb.n.a.execute(new a8.qa(d9Var, xaVar, y7.l6.c, task.isSuccessful() ? (String) task.getResult() : q6.j.c.a(d9Var.g), 7));
        ((tb.e) languageIdentifierImpl.d.get()).b.incrementAndGet();
        return languageIdentifierImpl;
    }
}
