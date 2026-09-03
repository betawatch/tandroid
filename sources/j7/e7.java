package j7;

import com.google.android.gms.tasks.Task;
import com.google.mlkit.nl.languageid.internal.LanguageIdentifierImpl;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public abstract class e7 {
    public static LanguageIdentifierImpl a() {
        gb.a aVar = (gb.a) cb.h.c().a(gb.a.class);
        gb.e eVar = aVar.b;
        eVar.getClass();
        c9 c9Var = aVar.a;
        LanguageIdentifierImpl languageIdentifierImpl = new LanguageIdentifierImpl(eVar, c9Var, (Executor) aVar.c.a.get());
        com.google.firebase.messaging.r rVar = new com.google.firebase.messaging.r();
        rVar.c = languageIdentifierImpl.f;
        af.d dVar = new af.d(24, false);
        dVar.c = LanguageIdentifierImpl.k();
        rVar.d = new j7(dVar);
        b4.e0 e0Var = new b4.e0(rVar, 1);
        Task task = c9Var.e;
        String a2 = task.isSuccessful() ? (String) task.getResult() : b6.j.c.a(c9Var.g);
        cb.o.a.execute(new c2.p(c9Var, e0Var, m6.c, a2, false, 4));
        ((gb.e) languageIdentifierImpl.d.get()).b.incrementAndGet();
        return languageIdentifierImpl;
    }
}
