// default package

import java.util.logging.Logger;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class j26 {
    public final Object a;
    public final Object b;
    public volatile Object c;

    public j26(Class cls, byte b) {
        switch (b) {
            case 3:
                this.b = new r91();
                this.a = cls.getName();
                break;
            default:
                this.b = new Object();
                this.a = cls.getName();
                break;
        }
    }

    public final Logger a() {
        Logger logger = (Logger) this.c;
        if (logger != null) {
            return logger;
        }
        synchronized (this.b) {
            Logger logger2 = (Logger) this.c;
            if (logger2 != null) {
                return logger2;
            }
            Logger logger3 = Logger.getLogger((String) this.a);
            this.c = logger3;
            return logger3;
        }
    }

    public final synchronized int[] b() {
        if (((int[]) this.c) == null) {
            this.c = ((xm8) this.a).b(this);
        }
        return (int[]) this.c;
    }

    public final Logger c() {
        Logger logger = (Logger) this.c;
        if (logger != null) {
            return logger;
        }
        synchronized (((r91) this.b)) {
            Logger logger2 = (Logger) this.c;
            if (logger2 != null) {
                return logger2;
            }
            Logger logger3 = Logger.getLogger((String) this.a);
            this.c = logger3;
            return logger3;
        }
    }

    public j26(String str, i09 i09Var, ur4 ur4Var, ux2 ux2Var) {
        this.a = str;
        this.b = new Object();
    }

    public j26(int[] iArr, xm8 xm8Var) {
        this.b = iArr;
        this.a = xm8Var;
    }
}
