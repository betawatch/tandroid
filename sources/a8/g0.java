package a8;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class g0 implements ka.e {
    public static final Charset f = Charset.forName("UTF-8");
    public static final ka.c g = new ka.c("key", ic.a.m(a1.g.x(e0.class, new z(1))));
    public static final ka.c h = new ka.c("value", ic.a.m(a1.g.x(e0.class, new z(2))));
    public static final f0 i = f0.b;
    public OutputStream a;
    public final HashMap b;
    public final HashMap c;
    public final ka.d d;
    public final i0 e = new i0(this, 0);

    public g0(ByteArrayOutputStream byteArrayOutputStream, HashMap hashMap, HashMap hashMap2, ka.d dVar) {
        this.a = byteArrayOutputStream;
        this.b = hashMap;
        this.c = hashMap2;
        this.d = dVar;
    }

    public static int i(ka.c cVar) {
        e0 e0Var = (e0) cVar.b(e0.class);
        if (e0Var != null) {
            return ((z) e0Var).a;
        }
        throw new ka.b("Field has no @Protobuf config");
    }

    @Override // ka.e
    public final ka.e a(ka.c cVar, Object obj) {
        c(cVar, obj, true);
        return this;
    }

    public final void b(ka.c cVar, double d, boolean z10) {
        if (z10 && d == 0.0d) {
            return;
        }
        k((i(cVar) << 3) | 1);
        this.a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(d).array());
    }

    public final void c(ka.c cVar, Object obj, boolean z10) {
        if (obj == null) {
            return;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z10 && charSequence.length() == 0) {
                return;
            }
            k((i(cVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f);
            k(bytes.length);
            this.a.write(bytes);
            return;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                c(cVar, it.next(), false);
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                j(i, cVar, (Map.Entry) it2.next(), false);
            }
            return;
        }
        if (obj instanceof Double) {
            b(cVar, ((Double) obj).doubleValue(), z10);
            return;
        }
        if (obj instanceof Float) {
            float floatValue = ((Float) obj).floatValue();
            if (z10 && floatValue == 0.0f) {
                return;
            }
            k((i(cVar) << 3) | 5);
            this.a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(floatValue).array());
            return;
        }
        if (obj instanceof Number) {
            long longValue = ((Number) obj).longValue();
            if (z10 && longValue == 0) {
                return;
            }
            e0 e0Var = (e0) cVar.b(e0.class);
            if (e0Var == null) {
                throw new ka.b("Field has no @Protobuf config");
            }
            k(((z) e0Var).a << 3);
            l(longValue);
            return;
        }
        if (obj instanceof Boolean) {
            h(cVar, ((Boolean) obj).booleanValue() ? 1 : 0, z10);
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z10 && bArr.length == 0) {
                return;
            }
            k((i(cVar) << 3) | 2);
            k(bArr.length);
            this.a.write(bArr);
            return;
        }
        ka.d dVar = (ka.d) this.b.get(obj.getClass());
        if (dVar != null) {
            j(dVar, cVar, obj, z10);
            return;
        }
        ka.f fVar = (ka.f) this.c.get(obj.getClass());
        if (fVar != null) {
            i0 i0Var = this.e;
            i0Var.b = false;
            i0Var.d = cVar;
            i0Var.c = z10;
            fVar.a(obj, i0Var);
            return;
        }
        if (obj instanceof c0) {
            h(cVar, ((c0) obj).zza(), true);
        } else if (obj instanceof Enum) {
            h(cVar, ((Enum) obj).ordinal(), true);
        } else {
            j(this.d, cVar, obj, z10);
        }
    }

    @Override // ka.e
    public final /* synthetic */ ka.e d(ka.c cVar, boolean z10) {
        h(cVar, z10 ? 1 : 0, true);
        return this;
    }

    @Override // ka.e
    public final /* synthetic */ ka.e e(ka.c cVar, int i10) {
        h(cVar, i10, true);
        return this;
    }

    @Override // ka.e
    public final ka.e f(ka.c cVar, long j10) {
        if (j10 == 0) {
            return this;
        }
        e0 e0Var = (e0) cVar.b(e0.class);
        if (e0Var == null) {
            throw new ka.b("Field has no @Protobuf config");
        }
        k(((z) e0Var).a << 3);
        l(j10);
        return this;
    }

    @Override // ka.e
    public final ka.e g(ka.c cVar, double d) {
        b(cVar, d, true);
        return this;
    }

    public final void h(ka.c cVar, int i10, boolean z10) {
        if (z10 && i10 == 0) {
            return;
        }
        e0 e0Var = (e0) cVar.b(e0.class);
        if (e0Var == null) {
            throw new ka.b("Field has no @Protobuf config");
        }
        k(((z) e0Var).a << 3);
        k(i10);
    }

    public final void j(ka.d dVar, ka.c cVar, Object obj, boolean z10) {
        b0 b0Var = new b0(0);
        b0Var.b = 0L;
        try {
            OutputStream outputStream = this.a;
            this.a = b0Var;
            try {
                dVar.a(obj, this);
                this.a = outputStream;
                long j10 = b0Var.b;
                b0Var.close();
                if (z10 && j10 == 0) {
                    return;
                }
                k((i(cVar) << 3) | 2);
                l(j10);
                dVar.a(obj, this);
            } catch (Throwable th2) {
                this.a = outputStream;
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                b0Var.close();
            } catch (Throwable th4) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th3, th4);
                } catch (Exception unused) {
                }
            }
            throw th3;
        }
    }

    public final void k(int i10) {
        while (true) {
            int i11 = i10 & 127;
            if ((i10 & (-128)) == 0) {
                this.a.write(i11);
                return;
            } else {
                this.a.write(i11 | 128);
                i10 >>>= 7;
            }
        }
    }

    public final void l(long j10) {
        while (true) {
            int i10 = ((int) j10) & 127;
            if (((-128) & j10) == 0) {
                this.a.write(i10);
                return;
            } else {
                this.a.write(i10 | 128);
                j10 >>>= 7;
            }
        }
    }
}
