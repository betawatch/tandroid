package com.google.android.gms.internal.play_billing;

import java.util.logging.Logger;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final class s0 {
    public final Object a;
    public volatile Object b;
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
        Logger logger = (Logger) this.b;
        if (logger != null) {
            return logger;
        }
        synchronized (this.c) {
            try {
                Logger logger2 = (Logger) this.b;
                if (logger2 != null) {
                    return logger2;
                }
                Logger logger3 = Logger.getLogger((String) this.a);
                this.b = logger3;
                return logger3;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public synchronized int[] b() {
        try {
            if (((int[]) this.b) == null) {
                this.b = ((mi.s) this.a).b(this);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (int[]) this.b;
    }

    public Logger c() {
        Logger logger = (Logger) this.b;
        if (logger != null) {
            return logger;
        }
        synchronized (((n) this.c)) {
            try {
                Logger logger2 = (Logger) this.b;
                if (logger2 != null) {
                    return logger2;
                }
                Logger logger3 = Logger.getLogger((String) this.a);
                this.b = logger3;
                return logger3;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public s0(int[] iArr, mi.s sVar) {
        this.c = iArr;
        this.a = sVar;
    }
}
