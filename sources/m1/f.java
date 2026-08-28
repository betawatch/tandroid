package m1;

import androidx.datastore.preferences.protobuf.a0;
import androidx.datastore.preferences.protobuf.b1;
import androidx.datastore.preferences.protobuf.c0;
import androidx.datastore.preferences.protobuf.c1;
import androidx.datastore.preferences.protobuf.n;
import androidx.datastore.preferences.protobuf.o0;
import androidx.datastore.preferences.protobuf.v;
import androidx.datastore.preferences.protobuf.w;
import androidx.datastore.preferences.protobuf.x;
import androidx.datastore.preferences.protobuf.x0;
import androidx.datastore.preferences.protobuf.z0;
import j$.util.DesugarCollections;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Map;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class f extends x {
    private static final f DEFAULT_INSTANCE;
    private static volatile x0 PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private o0 preferences_ = o0.b;

    static {
        f fVar = new f();
        DEFAULT_INSTANCE = fVar;
        x.h(f.class, fVar);
    }

    public static o0 i(f fVar) {
        o0 o0Var = fVar.preferences_;
        if (!o0Var.a) {
            fVar.preferences_ = o0Var.b();
        }
        return fVar.preferences_;
    }

    public static d k() {
        return (d) ((v) DEFAULT_INSTANCE.d(5));
    }

    public static f l(FileInputStream fileInputStream) {
        f fVar = DEFAULT_INSTANCE;
        androidx.datastore.preferences.protobuf.h hVar = new androidx.datastore.preferences.protobuf.h(fileInputStream);
        n a2 = n.a();
        x xVar = (x) fVar.d(4);
        try {
            z0 z0Var = z0.c;
            z0Var.getClass();
            c1 a3 = z0Var.a(xVar.getClass());
            androidx.datastore.preferences.protobuf.i iVar = hVar.b;
            if (iVar == null) {
                iVar = new androidx.datastore.preferences.protobuf.i();
                iVar.c = 0;
                Charset charset = a0.a;
                iVar.d = hVar;
                hVar.b = iVar;
            }
            a3.i(xVar, iVar, a2);
            a3.c(xVar);
            if (xVar.g()) {
                return (f) xVar;
            }
            throw new c0(new androidx.car.app.j().getMessage());
        } catch (IOException e10) {
            if (e10.getCause() instanceof c0) {
                throw ((c0) e10.getCause());
            }
            throw new c0(e10.getMessage());
        } catch (RuntimeException e11) {
            if (e11.getCause() instanceof c0) {
                throw ((c0) e11.getCause());
            }
            throw e11;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.x
    public final Object d(int i9) {
        x0 x0Var;
        switch (j.b(i9)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new b1(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", e.a});
            case 3:
                return new f();
            case 4:
                return new d(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                x0 x0Var2 = PARSER;
                if (x0Var2 != null) {
                    return x0Var2;
                }
                synchronized (f.class) {
                    try {
                        x0Var = PARSER;
                        if (x0Var == null) {
                            x0Var = new w();
                            PARSER = x0Var;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return x0Var;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final Map j() {
        return DesugarCollections.unmodifiableMap(this.preferences_);
    }
}
