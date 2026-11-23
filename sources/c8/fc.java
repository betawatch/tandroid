package c8;

import com.google.android.gms.tasks.Task;
import com.google.mlkit.nl.languageid.internal.LanguageIdentifierImpl;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public abstract class fc {
    public static LanguageIdentifierImpl a() {
        tb.a aVar = (tb.a) pb.g.c().a(tb.a.class);
        tb.e eVar = aVar.b;
        eVar.getClass();
        y7.e9 e9Var = aVar.a;
        LanguageIdentifierImpl languageIdentifierImpl = new LanguageIdentifierImpl(eVar, e9Var, (Executor) aVar.c.a.get());
        xi.e eVar2 = new xi.e();
        eVar2.c = languageIdentifierImpl.f;
        y7.s2 s2Var = new y7.s2(2, false);
        s2Var.c = LanguageIdentifierImpl.k();
        eVar2.d = new y7.l7(s2Var);
        a8.xa xaVar = new a8.xa(eVar2, 1);
        Task task = e9Var.e;
        pb.n.a.execute(new a8.qa(e9Var, xaVar, y7.m6.c, task.isSuccessful() ? (String) task.getResult() : q6.j.c.a(e9Var.g), 7));
        ((tb.e) languageIdentifierImpl.d.get()).b.incrementAndGet();
        return languageIdentifierImpl;
    }
}
