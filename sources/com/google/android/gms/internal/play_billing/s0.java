package com.google.android.gms.internal.play_billing;

import java.util.logging.Logger;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class s0 {
    public final String a;
    public volatile Logger b;
    public final Object c;

    public s0(Class cls, int i10) {
        switch (i10) {
            case 1:
                this.c = new Object();
                this.a = cls.getName();
                break;
            default:
                this.c = new n();
                this.a = cls.getName();
                break;
        }
    }

    public Logger a() {
        Logger logger = this.b;
        if (logger != null) {
            return logger;
        }
        synchronized (this.c) {
            try {
                Logger logger2 = this.b;
                if (logger2 != null) {
                    return logger2;
                }
                Logger logger3 = Logger.getLogger(this.a);
                this.b = logger3;
                return logger3;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public Logger b() {
        Logger logger = this.b;
        if (logger != null) {
            return logger;
        }
        synchronized (((n) this.c)) {
            try {
                Logger logger2 = this.b;
                if (logger2 != null) {
                    return logger2;
                }
                Logger logger3 = Logger.getLogger(this.a);
                this.b = logger3;
                return logger3;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
