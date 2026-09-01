package j7;

import com.google.android.gms.tasks.Task;
import com.google.mlkit.nl.languageid.internal.LanguageIdentifierImpl;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public abstract class i7 {
    public static LanguageIdentifierImpl a() {
        gb.a aVar = (gb.a) cb.h.c().a(gb.a.class);
        gb.e eVar = aVar.b;
        eVar.getClass();
        c9 c9Var = aVar.a;
        LanguageIdentifierImpl languageIdentifierImpl = new LanguageIdentifierImpl(eVar, c9Var, (Executor) aVar.c.a.get());
        com.google.firebase.messaging.s sVar = new com.google.firebase.messaging.s();
        sVar.c = languageIdentifierImpl.f;
        androidx.biometric.e eVar2 = new androidx.biometric.e(24, false);
        eVar2.c = LanguageIdentifierImpl.k();
        sVar.d = new j7(eVar2);
        b4.e0 e0Var = new b4.e0(sVar, 1);
        Task task = c9Var.e;
        String a2 = task.isSuccessful() ? (String) task.getResult() : b6.j.c.a(c9Var.g);
        cb.o.a.execute(new c2.p(c9Var, e0Var, m6.c, a2, false, 4));
        ((gb.e) languageIdentifierImpl.d.get()).b.incrementAndGet();
        return languageIdentifierImpl;
    }
}
