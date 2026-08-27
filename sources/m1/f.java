package m1;

import androidx.datastore.preferences.protobuf.a1;
import androidx.datastore.preferences.protobuf.b0;
import androidx.datastore.preferences.protobuf.b1;
import androidx.datastore.preferences.protobuf.n;
import androidx.datastore.preferences.protobuf.n0;
import androidx.datastore.preferences.protobuf.u;
import androidx.datastore.preferences.protobuf.v;
import androidx.datastore.preferences.protobuf.w;
import androidx.datastore.preferences.protobuf.w0;
import androidx.datastore.preferences.protobuf.y0;
import androidx.datastore.preferences.protobuf.z;
import j$.util.DesugarCollections;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Map;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class f extends w {
    private static final f DEFAULT_INSTANCE;
    private static volatile w0 PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private n0 preferences_ = n0.b;

    static {
        f fVar = new f();
        DEFAULT_INSTANCE = fVar;
        w.h(f.class, fVar);
    }

    public static n0 i(f fVar) {
        n0 n0Var = fVar.preferences_;
        if (!n0Var.a) {
            fVar.preferences_ = n0Var.b();
        }
        return fVar.preferences_;
    }

    public static d k() {
        return (d) ((u) DEFAULT_INSTANCE.d(5));
    }

    public static f l(FileInputStream fileInputStream) {
        f fVar = DEFAULT_INSTANCE;
        androidx.datastore.preferences.protobuf.h hVar = new androidx.datastore.preferences.protobuf.h(fileInputStream);
        n a2 = n.a();
        w wVar = (w) fVar.d(4);
        try {
            y0 y0Var = y0.c;
            y0Var.getClass();
            b1 a3 = y0Var.a(wVar.getClass());
            androidx.datastore.preferences.protobuf.i iVar = hVar.b;
            if (iVar == null) {
                iVar = new androidx.datastore.preferences.protobuf.i();
                iVar.c = 0;
                Charset charset = z.a;
                iVar.d = hVar;
                hVar.b = iVar;
            }
            a3.i(wVar, iVar, a2);
            a3.c(wVar);
            if (wVar.g()) {
                return (f) wVar;
            }
            throw new b0(new a7.c().getMessage());
        } catch (IOException e9) {
            if (e9.getCause() instanceof b0) {
                throw ((b0) e9.getCause());
            }
            throw new b0(e9.getMessage());
        } catch (RuntimeException e10) {
            if (e10.getCause() instanceof b0) {
                throw ((b0) e10.getCause());
            }
            throw e10;
        }
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
                return new a1(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", e.a});
            case 3:
                return new f();
            case 4:
                return new d(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                w0 w0Var2 = PARSER;
                if (w0Var2 != null) {
                    return w0Var2;
                }
                synchronized (f.class) {
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

    public final Map j() {
        return DesugarCollections.unmodifiableMap(this.preferences_);
    }
}
