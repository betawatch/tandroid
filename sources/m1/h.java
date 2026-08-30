package m1;

import androidx.datastore.preferences.protobuf.a0;
import androidx.datastore.preferences.protobuf.a1;
import androidx.datastore.preferences.protobuf.b1;
import androidx.datastore.preferences.protobuf.f0;
import androidx.datastore.preferences.protobuf.v;
import androidx.datastore.preferences.protobuf.w;
import androidx.datastore.preferences.protobuf.x;
import androidx.datastore.preferences.protobuf.x0;
import androidx.datastore.preferences.protobuf.z;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class h extends x {
    private static final h DEFAULT_INSTANCE;
    private static volatile x0 PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private z strings_ = a1.d;

    static {
        h hVar = new h();
        DEFAULT_INSTANCE = hVar;
        x.h(h.class, hVar);
    }

    public static void i(h hVar, Set set) {
        z zVar = hVar.strings_;
        if (!((androidx.datastore.preferences.protobuf.b) zVar).a) {
            int size = zVar.size();
            hVar.strings_ = zVar.e(size == 0 ? 10 : size * 2);
        }
        List list = hVar.strings_;
        Charset charset = a0.a;
        if (!(set instanceof f0)) {
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(set.size() + list.size());
            }
            int size2 = list.size();
            for (Object obj : set) {
                if (obj == null) {
                    String str = "Element at index " + (list.size() - size2) + " is null.";
                    for (int size3 = list.size() - 1; size3 >= size2; size3--) {
                        list.remove(size3);
                    }
                    throw new NullPointerException(str);
                }
                list.add(obj);
            }
            return;
        }
        List h = ((f0) set).h();
        f0 f0Var = (f0) list;
        int size4 = list.size();
        for (Object obj2 : h) {
            if (obj2 == null) {
                String str2 = "Element at index " + (f0Var.size() - size4) + " is null.";
                for (int size5 = f0Var.size() - 1; size5 >= size4; size5--) {
                    f0Var.remove(size5);
                }
                throw new NullPointerException(str2);
            }
            if (obj2 instanceof androidx.datastore.preferences.protobuf.g) {
                f0Var.g((androidx.datastore.preferences.protobuf.g) obj2);
            } else {
                f0Var.add((String) obj2);
            }
        }
    }

    public static h j() {
        return DEFAULT_INSTANCE;
    }

    public static g l() {
        return (g) ((v) DEFAULT_INSTANCE.d(5));
    }

    @Override // androidx.datastore.preferences.protobuf.x
    public final Object d(int i10) {
        x0 x0Var;
        switch (j.b(i10)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new b1(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case 3:
                return new h();
            case 4:
                return new g(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                x0 x0Var2 = PARSER;
                if (x0Var2 != null) {
                    return x0Var2;
                }
                synchronized (h.class) {
                    try {
                        x0Var = PARSER;
                        if (x0Var == null) {
                            x0Var = new w();
                            PARSER = x0Var;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return x0Var;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final z k() {
        return this.strings_;
    }
}
