// default package

import j$.util.DesugarCollections;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Map;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class ek8 extends ju4 {
    private static final ek8 DEFAULT_INSTANCE;
    private static volatile gy7 PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private gk6 preferences_ = gk6.b;

    static {
        ek8 ek8Var = new ek8();
        DEFAULT_INSTANCE = ek8Var;
        ju4.j(ek8.class, ek8Var);
    }

    public static ck8 n() {
        return (ck8) ((hu4) DEFAULT_INSTANCE.c(5));
    }

    public static ek8 o(FileInputStream fileInputStream) {
        ek8 ek8Var = DEFAULT_INSTANCE;
        uk2 uk2Var = new uk2(fileInputStream);
        v74 a = v74.a();
        ju4 i = ek8Var.i();
        try {
            ow8 ow8Var = ow8.c;
            ow8Var.getClass();
            fu9 a2 = ow8Var.a(i.getClass());
            cf0 cf0Var = uk2Var.b;
            if (cf0Var == null) {
                cf0Var = new cf0(uk2Var);
            }
            a2.i(i, cf0Var, a);
            a2.c(i);
            if (ju4.f(i, true)) {
                return (ek8) i;
            }
            throw new bs5(new e9c().getMessage());
        } catch (bs5 e) {
            if (e.a) {
                throw new bs5(e.getMessage(), e);
            }
            throw e;
        } catch (e9c e2) {
            throw new bs5(e2.getMessage());
        } catch (IOException e3) {
            if (e3.getCause() instanceof bs5) {
                throw ((bs5) e3.getCause());
            }
            throw new bs5(e3.getMessage(), e3);
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof bs5) {
                throw ((bs5) e4.getCause());
            }
            throw e4;
        }
    }

    @Override // ju4
    public final Object c(int i) {
        gy7 gy7Var;
        switch (ik8.F(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new v29(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", dk8.a});
            case 3:
                return new ek8();
            case 4:
                return new ck8(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                gy7 gy7Var2 = PARSER;
                if (gy7Var2 != null) {
                    return gy7Var2;
                }
                synchronized (ek8.class) {
                    gy7Var = PARSER;
                    if (gy7Var == null) {
                        gy7Var = new iu4();
                        PARSER = gy7Var;
                    }
                }
                return gy7Var;
            default:
                p3d.a();
                return null;
        }
    }

    public final Map l() {
        return DesugarCollections.unmodifiableMap(this.preferences_);
    }

    public final gk6 m() {
        gk6 gk6Var = this.preferences_;
        if (gk6Var.a) {
            return gk6Var;
        }
        gk6 c = gk6Var.c();
        this.preferences_ = c;
        return c;
    }
}
