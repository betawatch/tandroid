package g7;

import com.google.android.gms.tasks.Task;
import com.google.mlkit.nl.languageid.internal.LanguageIdentifierImpl;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public abstract class g0 {
    public static LanguageIdentifierImpl a() {
        db.a aVar = (db.a) za.g.c().a(db.a.class);
        db.e eVar = aVar.b;
        eVar.getClass();
        b9 b9Var = aVar.a;
        LanguageIdentifierImpl languageIdentifierImpl = new LanguageIdentifierImpl(eVar, b9Var, (Executor) aVar.c.a.get());
        com.google.firebase.messaging.t tVar = new com.google.firebase.messaging.t(8, false);
        tVar.d = languageIdentifierImpl.f;
        a5.n nVar = new a5.n(17, false);
        nVar.c = LanguageIdentifierImpl.k();
        tVar.e = new h7(nVar);
        b6.a aVar2 = new b6.a(tVar, 1);
        Task task = b9Var.e;
        String a2 = task.isSuccessful() ? (String) task.getResult() : y5.i.c.a(b9Var.g);
        za.m.a.execute(new bf.e(b9Var, aVar2, l6.c, a2, false, 4));
        ((db.e) languageIdentifierImpl.d.get()).b.incrementAndGet();
        return languageIdentifierImpl;
    }
}
