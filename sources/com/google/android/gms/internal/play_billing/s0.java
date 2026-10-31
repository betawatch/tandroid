package com.google.android.gms.internal.play_billing;

import java.util.logging.Logger;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class s0 {
    public final Object a;
    public final Object b;
    public volatile Object c;

    public s0(Class cls, int i10) {
        switch (i10) {
            case 2:
                this.a = new Object();
                this.b = cls.getName();
                break;
            default:
                this.a = new n();
                this.b = cls.getName();
                break;
        }
    }

    public Logger a() {
        Logger logger = (Logger) this.c;
        if (logger != null) {
            return logger;
        }
        synchronized (this.a) {
            try {
                Logger logger2 = (Logger) this.c;
                if (logger2 != null) {
                    return logger2;
                }
                Logger logger3 = Logger.getLogger((String) this.b);
                this.c = logger3;
                return logger3;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public synchronized int[] b() {
        try {
            if (((int[]) this.c) == null) {
                this.c = ((di.t) this.b).b(this);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (int[]) this.c;
    }

    public Logger c() {
        Logger logger = (Logger) this.c;
        if (logger != null) {
            return logger;
        }
        synchronized (((n) this.a)) {
            try {
                Logger logger2 = (Logger) this.c;
                if (logger2 != null) {
                    return logger2;
                }
                Logger logger3 = Logger.getLogger((String) this.b);
                this.c = logger3;
                return logger3;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public s0(int[] iArr, di.t tVar) {
        this.a = iArr;
        this.b = tVar;
    }
}
