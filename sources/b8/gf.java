package b8;

import com.google.android.gms.tasks.Task;
import com.google.mlkit.nl.languageid.internal.LanguageIdentifierImpl;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class gf {
    public static LanguageIdentifierImpl a() {
        qb.a aVar = (qb.a) mb.g.c().a(qb.a.class);
        qb.e eVar = aVar.b;
        eVar.getClass();
        x7.b9 b9Var = aVar.a;
        LanguageIdentifierImpl languageIdentifierImpl = new LanguageIdentifierImpl(eVar, b9Var, (Executor) aVar.c.a.get());
        za.p pVar = new za.p();
        pVar.c = languageIdentifierImpl.f;
        p7.d dVar = new p7.d(24, false);
        dVar.d = LanguageIdentifierImpl.k();
        pVar.d = new x7.i7(dVar);
        kg kgVar = new kg(pVar, 1);
        Task task = b9Var.e;
        mb.m.a.execute(new cg(b9Var, kgVar, x7.k6.c, task.isSuccessful() ? (String) task.getResult() : p6.j.c.a(b9Var.g), 6));
        ((qb.e) languageIdentifierImpl.d.get()).b.incrementAndGet();
        return languageIdentifierImpl;
    }
}
