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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class k implements u9.e {
    public static final Charset f = Charset.forName("UTF-8");
    public static final u9.c g = new u9.c("key", w.c.h(e2.c.n(i.class, new e(1))));
    public static final u9.c h = new u9.c("value", w.c.h(e2.c.n(i.class, new e(2))));
    public static final j i = j.b;
    public OutputStream a;
    public final HashMap b;
    public final HashMap c;
    public final u9.d d;
    public final l e = new l(this, 0);

    public k(ByteArrayOutputStream byteArrayOutputStream, HashMap hashMap, HashMap hashMap2, u9.d dVar) {
        this.a = byteArrayOutputStream;
        this.b = hashMap;
        this.c = hashMap2;
        this.d = dVar;
    }

    public static int i(u9.c cVar) {
        i iVar = (i) cVar.b(i.class);
        if (iVar != null) {
            return ((e) iVar).a;
        }
        throw new u9.b("Field has no @Protobuf config");
    }

    @Override // u9.e
    public final /* synthetic */ u9.e a(u9.c cVar, int i10) {
        h(cVar, i10, true);
        return this;
    }

    @Override // u9.e
    public final u9.e b(u9.c cVar, long j10) {
        if (j10 == 0) {
            return this;
        }
        i iVar = (i) cVar.b(i.class);
        if (iVar == null) {
            throw new u9.b("Field has no @Protobuf config");
        }
        k(((e) iVar).a << 3);
        l(j10);
        return this;
    }

    @Override // u9.e
    public final u9.e c(u9.c cVar, double d) {
        f(cVar, d, true);
        return this;
    }

    @Override // u9.e
    public final /* synthetic */ u9.e d(u9.c cVar, boolean z4) {
        h(cVar, z4 ? 1 : 0, true);
        return this;
    }

    @Override // u9.e
    public final u9.e e(u9.c cVar, Object obj) {
        g(cVar, obj, true);
        return this;
    }

    public final void f(u9.c cVar, double d, boolean z4) {
        if (z4 && d == 0.0d) {
            return;
        }
        k((i(cVar) << 3) | 1);
        this.a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(d).array());
    }

    public final void g(u9.c cVar, Object obj, boolean z4) {
        if (obj == null) {
            return;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z4 && charSequence.length() == 0) {
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
            f(cVar, ((Double) obj).doubleValue(), z4);
            return;
        }
        if (obj instanceof Float) {
            float floatValue = ((Float) obj).floatValue();
            if (z4 && floatValue == 0.0f) {
                return;
            }
            k((i(cVar) << 3) | 5);
            this.a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(floatValue).array());
            return;
        }
        if (obj instanceof Number) {
            long longValue = ((Number) obj).longValue();
            if (z4 && longValue == 0) {
                return;
            }
            i iVar = (i) cVar.b(i.class);
            if (iVar == null) {
                throw new u9.b("Field has no @Protobuf config");
            }
            k(((e) iVar).a << 3);
            l(longValue);
            return;
        }
        if (obj instanceof Boolean) {
            h(cVar, ((Boolean) obj).booleanValue() ? 1 : 0, z4);
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z4 && bArr.length == 0) {
                return;
            }
            k((i(cVar) << 3) | 2);
            k(bArr.length);
            this.a.write(bArr);
            return;
        }
        u9.d dVar = (u9.d) this.b.get(obj.getClass());
        if (dVar != null) {
            j(dVar, cVar, obj, z4);
            return;
        }
        u9.f fVar = (u9.f) this.c.get(obj.getClass());
        if (fVar != null) {
            l lVar = this.e;
            lVar.b = false;
            lVar.d = cVar;
            lVar.c = z4;
            fVar.a(obj, lVar);
            return;
        }
        if (obj instanceof g) {
            h(cVar, ((g) obj).zza(), true);
        } else if (obj instanceof Enum) {
            h(cVar, ((Enum) obj).ordinal(), true);
        } else {
            j(this.d, cVar, obj, z4);
        }
    }

    public final void h(u9.c cVar, int i10, boolean z4) {
        if (z4 && i10 == 0) {
            return;
        }
        i iVar = (i) cVar.b(i.class);
        if (iVar == null) {
            throw new u9.b("Field has no @Protobuf config");
        }
        k(((e) iVar).a << 3);
        k(i10);
    }

    public final void j(u9.d dVar, u9.c cVar, Object obj, boolean z4) {
        f fVar = new f(0);
        fVar.b = 0L;
        try {
            OutputStream outputStream = this.a;
            this.a = fVar;
            try {
                dVar.a(obj, this);
                this.a = outputStream;
                long j10 = fVar.b;
                fVar.close();
                if (z4 && j10 == 0) {
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
