package l5;

import android.content.Context;
import com.google.android.gms.internal.vision.e2;
import j$.util.DesugarCollections;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import org.telegram.ui.web.u0;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final class t {
    public static volatile k e;
    public final u5.a a;
    public final u5.a b;
    public final q5.b c;
    public final da.b d;

    public t(u5.a aVar, u5.a aVar2, q5.b bVar, da.b bVar2, com.google.firebase.messaging.t tVar) {
        this.a = aVar;
        this.b = aVar2;
        this.c = bVar;
        this.d = bVar2;
        ((Executor) tVar.b).execute(new u0(tVar, 23));
    }

    public static t a() {
        k kVar = e;
        if (kVar != null) {
            return (t) kVar.f.get();
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static void b(Context context) {
        if (e == null) {
            synchronized (t.class) {
                try {
                    if (e == null) {
                        j jVar = new j();
                        context.getClass();
                        jVar.a = context;
                        e = jVar.a();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final r c(l lVar) {
        byte[] bytes;
        Set unmodifiableSet = lVar != null ? DesugarCollections.unmodifiableSet(j5.a.d) : Collections.singleton(new i5.c("proto"));
        aa.a a2 = i.a();
        lVar.getClass();
        a2.b = "cct";
        j5.a aVar = (j5.a) lVar;
        String str = aVar.a;
        String str2 = aVar.b;
        if (str2 == null && str == null) {
            bytes = null;
        } else {
            if (str2 == null) {
                str2 = "";
            }
            bytes = e2.j("1$", str, "\\", str2).getBytes(Charset.forName("UTF-8"));
        }
        a2.c = bytes;
        return new r(unmodifiableSet, a2.e(), this);
    }
}
