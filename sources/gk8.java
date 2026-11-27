// default package

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Set;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class gk8 extends ju4 {
    private static final gk8 DEFAULT_INSTANCE;
    private static volatile gy7 PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private or5 strings_ = pw8.d;

    static {
        gk8 gk8Var = new gk8();
        DEFAULT_INSTANCE = gk8Var;
        ju4.j(gk8.class, gk8Var);
    }

    public static gk8 m() {
        return DEFAULT_INSTANCE;
    }

    public static fk8 o() {
        return (fk8) ((hu4) DEFAULT_INSTANCE.c(5));
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
                return new v29(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case 3:
                return new gk8();
            case 4:
                return new fk8(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                gy7 gy7Var2 = PARSER;
                if (gy7Var2 != null) {
                    return gy7Var2;
                }
                synchronized (gk8.class) {
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

    public final void l(Set set) {
        or5 or5Var = this.strings_;
        boolean z = ((t3) or5Var).a;
        or5 or5Var2 = or5Var;
        if (!z) {
            int size = or5Var.size();
            pw8 j = ((pw8) or5Var).j(size == 0 ? 10 : size << 1);
            this.strings_ = j;
            or5Var2 = j;
        }
        Charset charset = pr5.a;
        if (or5Var2 instanceof ArrayList) {
            ((ArrayList) or5Var2).ensureCapacity(set.size() + or5Var2.size());
        }
        int size2 = or5Var2.size();
        for (Object obj : set) {
            if (obj == null) {
                String str = "Element at index " + (or5Var2.size() - size2) + " is null.";
                for (int size3 = or5Var2.size() - 1; size3 >= size2; size3--) {
                    or5Var2.remove(size3);
                }
                p3d.h(str);
                return;
            }
            or5Var2.add(obj);
        }
    }

    public final or5 n() {
        return this.strings_;
    }
}
