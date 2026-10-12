package l5;

import android.content.Context;
import com.google.android.gms.internal.play_billing.k3;
import j$.util.DesugarCollections;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import org.telegram.ui.Components.voip.m2;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class s {
    public static volatile j e;
    public final u5.a a;
    public final u5.a b;
    public final q5.b c;
    public final ea.b d;

    public s(u5.a aVar, u5.a aVar2, q5.b bVar, ea.b bVar2, com.google.firebase.messaging.s sVar) {
        this.a = aVar;
        this.b = aVar2;
        this.c = bVar;
        this.d = bVar2;
        ((Executor) sVar.b).execute(new m2(sVar, 22));
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
                        k0.b bVar = new k0.b();
                        context.getClass();
                        bVar.a = context;
                        e = bVar.b();
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
        androidx.biometric.e a2 = i.a();
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
            bytes = k3.k("1$", str, "\\", str2).getBytes(Charset.forName("UTF-8"));
        }
        a2.c = bytes;
        return new q(unmodifiableSet, a2.g(), this);
    }
}
