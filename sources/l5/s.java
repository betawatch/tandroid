package l5;

import android.content.Context;
import com.google.android.gms.internal.vision.e2;
import com.google.firebase.messaging.t;
import j$.util.DesugarCollections;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import k2.u;
import org.telegram.ui.web.q0;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes.dex */
public final class s {
    public static volatile j e;
    public final u5.a a;
    public final u5.a b;
    public final q5.b c;
    public final da.b d;

    public s(u5.a aVar, u5.a aVar2, q5.b bVar, da.b bVar2, t tVar) {
        this.a = aVar;
        this.b = aVar2;
        this.c = bVar;
        this.d = bVar2;
        ((Executor) tVar.b).execute(new q0(tVar, 24));
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
                        u uVar = new u(3, false);
                        context.getClass();
                        uVar.b = context;
                        e = uVar.c();
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
        return new q(unmodifiableSet, a2.e(), this);
    }
}
