package h7;

import com.google.android.gms.tasks.Task;
import com.google.mlkit.nl.languageid.internal.LanguageIdentifierImpl;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public abstract class l5 {
    public static LanguageIdentifierImpl a() {
        eb.a aVar = (eb.a) ab.h.c().a(eb.a.class);
        eb.e eVar = aVar.b;
        eVar.getClass();
        a9 a9Var = aVar.a;
        LanguageIdentifierImpl languageIdentifierImpl = new LanguageIdentifierImpl(eVar, a9Var, (Executor) aVar.c.a.get());
        com.google.firebase.messaging.s sVar = new com.google.firebase.messaging.s(9, false);
        sVar.d = languageIdentifierImpl.f;
        androidx.biometric.e eVar2 = new androidx.biometric.e(17, false);
        eVar2.c = LanguageIdentifierImpl.k();
        sVar.e = new h7(eVar2);
        ag.j2 j2Var = new ag.j2(sVar, 1);
        Task task = a9Var.e;
        String a2 = task.isSuccessful() ? (String) task.getResult() : z5.i.c.a(a9Var.g);
        ab.q.a.execute(new c2.p(a9Var, j2Var, k6.c, a2, false, 4));
        ((eb.e) languageIdentifierImpl.d.get()).b.incrementAndGet();
        return languageIdentifierImpl;
    }
}
