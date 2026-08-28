package com.google.android.gms.internal.play_billing;

import java.util.logging.Logger;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class s0 {
    public final n a = new n();
    public final String b;
    public volatile Logger c;

    public s0(Class cls) {
        this.b = cls.getName();
    }

    public final Logger a() {
        Logger logger = this.c;
        if (logger != null) {
            return logger;
        }
        synchronized (this.a) {
            try {
                Logger logger2 = this.c;
                if (logger2 != null) {
                    return logger2;
                }
                Logger logger3 = Logger.getLogger(this.b);
                this.c = logger3;
                return logger3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
