package l5;

import android.content.Context;
import com.google.android.gms.internal.vision.e2;
import j$.util.DesugarCollections;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class s {
    public static volatile j e;
    public final u5.a a;
    public final u5.a b;
    public final q5.b c;
    public final da.b d;

    public s(u5.a aVar, u5.a aVar2, q5.b bVar, da.b bVar2, com.google.firebase.messaging.s sVar) {
        this.a = aVar;
        this.b = aVar2;
        this.c = bVar;
        this.d = bVar2;
        ((Executor) sVar.b).execute(new org.telegram.ui.web.b(sVar, 18));
    }

    public static s a() {
        j jVar = e;
        if (jVar != null) {
            return (s) jVar.f.get();
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static void b(Context context) {
        if (e == null) {
            synchronized (s.class) {
                try {
                    if (e == null) {
                        k6.h hVar = new k6.h();
                        context.getClass();
                        hVar.a = context;
                        e = hVar.a();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final q c(k kVar) {
        byte[] bytes;
        Set unmodifiableSet = kVar != null ? DesugarCollections.unmodifiableSet(j5.a.d) : Collections.singleton(new i5.c("proto"));
        aa.a a2 = i.a();
        kVar.getClass();
        a2.b = "cct";
        j5.a aVar = (j5.a) kVar;
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
        return new q(unmodifiableSet, a2.f(), this);
    }
}
