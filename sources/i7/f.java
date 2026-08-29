package i7;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class f implements s9.e {
    public static final Charset f = Charset.forName("UTF-8");
    public static final s9.c g = new s9.c("key", u3.c.h(com.google.android.recaptcha.internal.a.q(d.class, new a(1))));
    public static final s9.c h = new s9.c("value", u3.c.h(com.google.android.recaptcha.internal.a.q(d.class, new a(2))));
    public static final e i = e.b;
    public OutputStream a;
    public final HashMap b;
    public final HashMap c;
    public final s9.d d;
    public final h7.l e = new h7.l(this, 1);

    public f(ByteArrayOutputStream byteArrayOutputStream, HashMap hashMap, HashMap hashMap2, s9.d dVar) {
        this.a = byteArrayOutputStream;
        this.b = hashMap;
        this.c = hashMap2;
        this.d = dVar;
    }

    public static int i(s9.c cVar) {
        d dVar = (d) cVar.b(d.class);
        if (dVar != null) {
            return ((a) dVar).a;
        }
        throw new s9.b("Field has no @Protobuf config");
    }

    @Override // s9.e
    public final s9.e a(s9.c cVar, double d) {
        f(cVar, d, true);
        return this;
    }

    @Override // s9.e
    public final /* synthetic */ s9.e b(s9.c cVar, int i10) {
        h(cVar, i10, true);
        return this;
    }

    @Override // s9.e
    public final s9.e c(s9.c cVar, long j10) {
        if (j10 == 0) {
            return this;
        }
        d dVar = (d) cVar.b(d.class);
        if (dVar == null) {
            throw new s9.b("Field has no @Protobuf config");
        }
        k(((a) dVar).a << 3);
        l(j10);
        return this;
    }

    @Override // s9.e
    public final /* synthetic */ s9.e d(s9.c cVar, boolean z10) {
        h(cVar, z10 ? 1 : 0, true);
        return this;
    }

    @Override // s9.e
    public final s9.e e(s9.c cVar, Object obj) {
        g(cVar, obj, true);
        return this;
    }

    public final void f(s9.c cVar, double d, boolean z10) {
        if (z10 && d == 0.0d) {
            return;
        }
        k((i(cVar) << 3) | 1);
        this.a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(d).array());
    }

    public final void g(s9.c cVar, Object obj, boolean z10) {
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
                g(cVar, it.next(), false);
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
            f(cVar, ((Double) obj).doubleValue(), z10);
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
            d dVar = (d) cVar.b(d.class);
            if (dVar == null) {
                throw new s9.b("Field has no @Protobuf config");
            }
            k(((a) dVar).a << 3);
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
        s9.d dVar2 = (s9.d) this.b.get(obj.getClass());
        if (dVar2 != null) {
            j(dVar2, cVar, obj, z10);
            return;
        }
        s9.f fVar = (s9.f) this.c.get(obj.getClass());
        if (fVar != null) {
            h7.l lVar = this.e;
            lVar.b = false;
            lVar.d = cVar;
            lVar.c = z10;
            fVar.a(obj, lVar);
            return;
        }
        if (obj instanceof b) {
            h(cVar, ((b) obj).zza(), true);
        } else if (obj instanceof Enum) {
            h(cVar, ((Enum) obj).ordinal(), true);
        } else {
            j(this.d, cVar, obj, z10);
        }
    }

    public final void h(s9.c cVar, int i10, boolean z10) {
        if (z10 && i10 == 0) {
            return;
        }
        d dVar = (d) cVar.b(d.class);
        if (dVar == null) {
            throw new s9.b("Field has no @Protobuf config");
        }
        k(((a) dVar).a << 3);
        k(i10);
    }

    public final void j(s9.d dVar, s9.c cVar, Object obj, boolean z10) {
        h7.f fVar = new h7.f(1);
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
            } catch (Throwable th2) {
                this.a = outputStream;
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                fVar.close();
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
            long j10 = i10 & (-128);
            OutputStream outputStream = this.a;
            if (j10 == 0) {
                outputStream.write(i10 & 127);
                return;
            } else {
                outputStream.write((i10 & 127) | 128);
                i10 >>>= 7;
            }
        }
    }

    public final void l(long j10) {
        while (true) {
            long j11 = (-128) & j10;
            OutputStream outputStream = this.a;
            if (j11 == 0) {
                outputStream.write(((int) j10) & 127);
                return;
            } else {
                outputStream.write((((int) j10) & 127) | 128);
                j10 >>>= 7;
            }
        }
    }
}
