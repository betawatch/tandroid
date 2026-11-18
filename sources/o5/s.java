package o5;

import ab.c0;
import android.content.Context;
import androidx.biometric.t;
import com.google.android.gms.internal.vision.e2;
import j$.util.DesugarCollections;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import org.telegram.ui.web.z0;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final class s {
    public static volatile j e;
    public final x5.a a;
    public final x5.a b;
    public final t5.b c;
    public final ia.c d;

    public s(x5.a aVar, x5.a aVar2, t5.b bVar, ia.c cVar, c0 c0Var) {
        this.a = aVar;
        this.b = aVar2;
        this.c = bVar;
        this.d = cVar;
        ((Executor) c0Var.b).execute(new z0(c0Var, 23));
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
                        t tVar = new t();
                        context.getClass();
                        tVar.a = context;
                        e = tVar.a();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final q c(k kVar) {
        byte[] bytes;
        Set unmodifiableSet = kVar != null ? DesugarCollections.unmodifiableSet(m5.a.d) : Collections.singleton(new l5.c("proto"));
        h6.m a10 = i.a();
        kVar.getClass();
        a10.b = "cct";
        m5.a aVar = (m5.a) kVar;
        String str = aVar.a;
        String str2 = aVar.b;
        if (str2 == null && str == null) {
            bytes = null;
        } else {
            if (str2 == null) {
                str2 = "";
            }
            bytes = e2.l("1$", str, "\\", str2).getBytes(Charset.forName("UTF-8"));
        }
        a10.c = bytes;
        return new q(unmodifiableSet, a10.j(), this);
    }
}
