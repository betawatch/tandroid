package j7;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class y implements q9.e {
    public static final Charset f = Charset.forName("UTF-8");
    public static final q9.c g = new q9.c("key", ta.b.g(j3.r0.r(w.class, new s(1))));
    public static final q9.c h = new q9.c("value", ta.b.g(j3.r0.r(w.class, new s(2))));
    public static final x i = x.b;
    public OutputStream a;
    public final HashMap b;
    public final HashMap c;
    public final q9.d d;
    public final f7.l e = new f7.l(this, 3);

    public y(ByteArrayOutputStream byteArrayOutputStream, HashMap hashMap, HashMap hashMap2, q9.d dVar) {
        this.a = byteArrayOutputStream;
        this.b = hashMap;
        this.c = hashMap2;
        this.d = dVar;
    }

    public static int i(q9.c cVar) {
        w wVar = (w) cVar.b(w.class);
        if (wVar != null) {
            return ((s) wVar).a;
        }
        throw new q9.b("Field has no @Protobuf config");
    }

    @Override // q9.e
    public final /* synthetic */ q9.e a(q9.c cVar, boolean z10) {
        h(cVar, z10 ? 1 : 0, true);
        return this;
    }

    @Override // q9.e
    public final q9.e b(q9.c cVar, double d) {
        e(cVar, d, true);
        return this;
    }

    @Override // q9.e
    public final /* synthetic */ q9.e c(q9.c cVar, int i9) {
        h(cVar, i9, true);
        return this;
    }

    @Override // q9.e
    public final q9.e d(q9.c cVar, long j10) {
        if (j10 == 0) {
            return this;
        }
        w wVar = (w) cVar.b(w.class);
        if (wVar == null) {
            throw new q9.b("Field has no @Protobuf config");
        }
        k(((s) wVar).a << 3);
        l(j10);
        return this;
    }

    public final void e(q9.c cVar, double d, boolean z10) {
        if (z10 && d == 0.0d) {
            return;
        }
        k((i(cVar) << 3) | 1);
        this.a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(d).array());
    }

    public final void f(q9.c cVar, Object obj, boolean z10) {
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
                f(cVar, it.next(), false);
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
            e(cVar, ((Double) obj).doubleValue(), z10);
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
            w wVar = (w) cVar.b(w.class);
            if (wVar == null) {
                throw new q9.b("Field has no @Protobuf config");
            }
            k(((s) wVar).a << 3);
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
        q9.d dVar = (q9.d) this.b.get(obj.getClass());
        if (dVar != null) {
            j(dVar, cVar, obj, z10);
            return;
        }
        q9.f fVar = (q9.f) this.c.get(obj.getClass());
        if (fVar != null) {
            f7.l lVar = this.e;
            lVar.b = false;
            lVar.d = cVar;
            lVar.c = z10;
            fVar.a(obj, lVar);
            return;
        }
        if (obj instanceof u) {
            h(cVar, ((u) obj).zza(), true);
        } else if (obj instanceof Enum) {
            h(cVar, ((Enum) obj).ordinal(), true);
        } else {
            j(this.d, cVar, obj, z10);
        }
    }

    @Override // q9.e
    public final q9.e g(q9.c cVar, Object obj) {
        f(cVar, obj, true);
        return this;
    }

    public final void h(q9.c cVar, int i9, boolean z10) {
        if (z10 && i9 == 0) {
            return;
        }
        w wVar = (w) cVar.b(w.class);
        if (wVar == null) {
            throw new q9.b("Field has no @Protobuf config");
        }
        k(((s) wVar).a << 3);
        k(i9);
    }

    public final void j(q9.d dVar, q9.c cVar, Object obj, boolean z10) {
        f7.f fVar = new f7.f(3);
        fVar.b = 0L;
        try {
            OutputStream outputStream = this.a;
            this.a = fVar;
            try {
                dVar.a(obj, this);
                this.a = outputStream;
                long j10 = fVar.b;
                fVar.close();
                if (z10 && j10 == 0) {
                    return;
                }
                k((i(cVar) << 3) | 2);
                l(j10);
                dVar.a(obj, this);
            } catch (Throwable th) {
                this.a = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                fVar.close();
            } catch (Throwable th3) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th2, th3);
                } catch (Exception unused) {
                }
            }
            throw th2;
        }
    }

    public final void k(int i9) {
        while (true) {
            int i10 = i9 & 127;
            if ((i9 & (-128)) == 0) {
                this.a.write(i10);
                return;
            } else {
                this.a.write(i10 | 128);
                i9 >>>= 7;
            }
        }
    }

    public final void l(long j10) {
        while (true) {
            int i9 = ((int) j10) & 127;
            if (((-128) & j10) == 0) {
                this.a.write(i9);
                return;
            } else {
                this.a.write(i9 | 128);
                j10 >>>= 7;
            }
        }
    }
}
