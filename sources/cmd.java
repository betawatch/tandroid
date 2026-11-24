// default package

import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class cmd implements bpd {
    public static final Object d = new Object();
    public static final f26 e = new f26(wqd.class, (byte) 3);
    public static final boolean f;
    public static final x2f h;
    public volatile Object a;
    public volatile old b;
    public volatile wld c;

    static {
        boolean z;
        x2f uldVar;
        Throwable th;
        Throwable th2;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        f = z;
        String property = System.getProperty("java.runtime.name", "");
        Throwable th3 = null;
        if (property == null || property.contains("Android")) {
            try {
                uldVar = new vld();
            } catch (Error | Exception e2) {
                try {
                    uldVar = new tld();
                } catch (Error | Exception e3) {
                    th3 = e3;
                    uldVar = new uld();
                }
                th = th3;
                th2 = e2;
            }
        } else {
            try {
                uldVar = new tld();
            } catch (NoClassDefFoundError unused2) {
                uldVar = new uld();
            }
        }
        th = null;
        th2 = null;
        h = uldVar;
        if (th != null) {
            f26 f26Var = e;
            Logger c = f26Var.c();
            Level level = Level.SEVERE;
            c.logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            f26Var.c().logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "AtomicReferenceFieldUpdaterAtomicHelper is broken!", th);
        }
    }

    public final void a(wld wldVar) {
        wldVar.a = null;
        while (true) {
            wld wldVar2 = this.c;
            if (wldVar2 != wld.c) {
                wld wldVar3 = null;
                while (wldVar2 != null) {
                    wld wldVar4 = wldVar2.b;
                    if (wldVar2.a != null) {
                        wldVar3 = wldVar2;
                    } else if (wldVar3 != null) {
                        wldVar3.b = wldVar4;
                        if (wldVar3.a == null) {
                            break;
                        }
                    } else if (h.g(this, wldVar2, wldVar4)) {
                    }
                    wldVar2 = wldVar4;
                }
                return;
            }
            return;
        }
    }

    public abstract Throwable d();
}
