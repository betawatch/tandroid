package m1;

import androidx.datastore.preferences.protobuf.a1;
import androidx.datastore.preferences.protobuf.e0;
import androidx.datastore.preferences.protobuf.u;
import androidx.datastore.preferences.protobuf.v;
import androidx.datastore.preferences.protobuf.w;
import androidx.datastore.preferences.protobuf.w0;
import androidx.datastore.preferences.protobuf.y;
import androidx.datastore.preferences.protobuf.z;
import androidx.datastore.preferences.protobuf.z0;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class h extends w {
    private static final h DEFAULT_INSTANCE;
    private static volatile w0 PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private y strings_ = z0.d;

    static {
        h hVar = new h();
        DEFAULT_INSTANCE = hVar;
        w.h(h.class, hVar);
    }

    public static void i(h hVar, Set set) {
        y yVar = hVar.strings_;
        if (!((androidx.datastore.preferences.protobuf.b) yVar).a) {
            int size = yVar.size();
            hVar.strings_ = yVar.e(size == 0 ? 10 : size * 2);
        }
        List list = hVar.strings_;
        Charset charset = z.a;
        if (!(set instanceof e0)) {
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
        List h = ((e0) set).h();
        e0 e0Var = (e0) list;
        int size4 = list.size();
        for (Object obj2 : h) {
            if (obj2 == null) {
                String str2 = "Element at index " + (e0Var.size() - size4) + " is null.";
                for (int size5 = e0Var.size() - 1; size5 >= size4; size5--) {
                    e0Var.remove(size5);
                }
                throw new NullPointerException(str2);
            }
            if (obj2 instanceof androidx.datastore.preferences.protobuf.g) {
                e0Var.g((androidx.datastore.preferences.protobuf.g) obj2);
            } else {
                e0Var.add((String) obj2);
            }
        }
    }

    public static h j() {
        return DEFAULT_INSTANCE;
    }

    public static g l() {
        return (g) ((u) DEFAULT_INSTANCE.d(5));
    }

    @Override // androidx.datastore.preferences.protobuf.w
    public final Object d(int i10) {
        w0 w0Var;
        switch (j.b(i10)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new a1(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case 3:
                return new h();
            case 4:
                return new g(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                w0 w0Var2 = PARSER;
                if (w0Var2 != null) {
                    return w0Var2;
                }
                synchronized (h.class) {
                    try {
                        w0Var = PARSER;
                        if (w0Var == null) {
                            w0Var = new v();
                            PARSER = w0Var;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return w0Var;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final y k() {
        return this.strings_;
    }
}
