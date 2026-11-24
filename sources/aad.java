// default package

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class aad implements dq7 {
    public static final Charset e = Charset.forName("UTF-8");
    public static final wa4 f = new wa4("key", b10.m(mlb.o(i9d.class, new f8d(1))));
    public static final wa4 g = new wa4("value", b10.m(mlb.o(i9d.class, new f8d(2))));
    public static final u9d h = u9d.b;
    public OutputStream a;
    public final HashMap b;
    public final HashMap c;
    public final kv8 d = new kv8(this, (byte) 1);

    public aad(ByteArrayOutputStream byteArrayOutputStream, HashMap hashMap, HashMap hashMap2) {
        this.a = byteArrayOutputStream;
        this.b = hashMap;
        this.c = hashMap2;
    }

    public static int j(wa4 wa4Var) {
        i9d i9dVar = (i9d) wa4Var.b(i9d.class);
        if (i9dVar != null) {
            return i9dVar.zza();
        }
        throw new e44("Field has no @Protobuf config");
    }

    @Override // dq7
    public final dq7 a(wa4 wa4Var, Object obj) {
        c(wa4Var, obj, true);
        return this;
    }

    public final void b(wa4 wa4Var, double d, boolean z) {
        if (z && d == 0.0d) {
            return;
        }
        l((j(wa4Var) << 3) | 1);
        this.a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(d).array());
    }

    public final void c(wa4 wa4Var, Object obj, boolean z) {
        if (obj != null) {
            if (obj instanceof CharSequence) {
                CharSequence charSequence = (CharSequence) obj;
                if (z && charSequence.length() == 0) {
                    return;
                }
                l((j(wa4Var) << 3) | 2);
                byte[] bytes = charSequence.toString().getBytes(e);
                l(bytes.length);
                this.a.write(bytes);
                return;
            }
            if (obj instanceof Collection) {
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    c(wa4Var, it.next(), false);
                }
                return;
            }
            if (obj instanceof Map) {
                Iterator it2 = ((Map) obj).entrySet().iterator();
                while (it2.hasNext()) {
                    k(h, wa4Var, (Map.Entry) it2.next(), false);
                }
                return;
            }
            if (obj instanceof Double) {
                b(wa4Var, ((Double) obj).doubleValue(), z);
                return;
            }
            if (obj instanceof Float) {
                float floatValue = ((Float) obj).floatValue();
                if (z && floatValue == 0.0f) {
                    return;
                }
                l((j(wa4Var) << 3) | 5);
                this.a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(floatValue).array());
                return;
            }
            if (obj instanceof Number) {
                i(wa4Var, ((Number) obj).longValue(), z);
                return;
            }
            if (obj instanceof Boolean) {
                h(wa4Var, ((Boolean) obj).booleanValue() ? 1 : 0, z);
                return;
            }
            if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                if (z && bArr.length == 0) {
                    return;
                }
                l((j(wa4Var) << 3) | 2);
                l(bArr.length);
                this.a.write(bArr);
                return;
            }
            cq7 cq7Var = (cq7) this.b.get(obj.getClass());
            if (cq7Var != null) {
                k(cq7Var, wa4Var, obj, z);
                return;
            }
            zac zacVar = (zac) this.c.get(obj.getClass());
            if (zacVar != null) {
                kv8 kv8Var = this.d;
                kv8Var.b = false;
                kv8Var.d = wa4Var;
                kv8Var.c = z;
                zacVar.a(obj, kv8Var);
                return;
            }
            if (obj instanceof y8d) {
                h(wa4Var, ((y8d) obj).zza(), true);
            } else if (obj instanceof Enum) {
                h(wa4Var, ((Enum) obj).ordinal(), true);
            } else {
                k(u9d.c, wa4Var, obj, z);
            }
        }
    }

    @Override // dq7
    public final /* synthetic */ dq7 d(wa4 wa4Var, boolean z) {
        h(wa4Var, z ? 1 : 0, true);
        return this;
    }

    @Override // dq7
    public final /* synthetic */ dq7 e(wa4 wa4Var, int i) {
        h(wa4Var, i, true);
        return this;
    }

    @Override // dq7
    public final dq7 f(wa4 wa4Var, double d) {
        b(wa4Var, d, true);
        return this;
    }

    @Override // dq7
    public final /* synthetic */ dq7 g(wa4 wa4Var, long j) {
        i(wa4Var, j, true);
        return this;
    }

    public final void h(wa4 wa4Var, int i, boolean z) {
        if (z && i == 0) {
            return;
        }
        i9d i9dVar = (i9d) wa4Var.b(i9d.class);
        if (i9dVar == null) {
            throw new e44("Field has no @Protobuf config");
        }
        int ordinal = i9dVar.zzb().ordinal();
        if (ordinal == 0) {
            l(i9dVar.zza() << 3);
            l(i);
        } else if (ordinal == 1) {
            l(i9dVar.zza() << 3);
            l((i << 1) ^ (i >> 31));
        } else {
            if (ordinal != 2) {
                return;
            }
            l((i9dVar.zza() << 3) | 5);
            this.a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(i).array());
        }
    }

    public final void i(wa4 wa4Var, long j, boolean z) {
        if (z && j == 0) {
            return;
        }
        i9d i9dVar = (i9d) wa4Var.b(i9d.class);
        if (i9dVar == null) {
            throw new e44("Field has no @Protobuf config");
        }
        int ordinal = i9dVar.zzb().ordinal();
        if (ordinal == 0) {
            l(i9dVar.zza() << 3);
            m(j);
        } else if (ordinal == 1) {
            l(i9dVar.zza() << 3);
            m((j << 1) ^ (j >> 63));
        } else {
            if (ordinal != 2) {
                return;
            }
            l((i9dVar.zza() << 3) | 1);
            this.a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(j).array());
        }
    }

    public final void k(cq7 cq7Var, wa4 wa4Var, Object obj, boolean z) {
        n26 n26Var = new n26((byte) 1);
        n26Var.b = 0L;
        try {
            OutputStream outputStream = this.a;
            this.a = n26Var;
            try {
                cq7Var.a(obj, this);
                this.a = outputStream;
                long j = n26Var.b;
                n26Var.close();
                if (z && j == 0) {
                    return;
                }
                l((j(wa4Var) << 3) | 2);
                m(j);
                cq7Var.a(obj, this);
            } catch (Throwable th) {
                this.a = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                n26Var.close();
            } catch (Throwable th3) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th2, th3);
                } catch (Exception unused) {
                }
            }
            throw th2;
        }
    }

    public final void l(int i) {
        while (true) {
            long j = i & (-128);
            OutputStream outputStream = this.a;
            if (j == 0) {
                outputStream.write(i & nm7.K1);
                return;
            } else {
                outputStream.write((i & nm7.K1) | 128);
                i >>>= 7;
            }
        }
    }

    public final void m(long j) {
        while (true) {
            long j2 = (-128) & j;
            OutputStream outputStream = this.a;
            if (j2 == 0) {
                outputStream.write(((int) j) & nm7.K1);
                return;
            } else {
                outputStream.write((((int) j) & nm7.K1) | 128);
                j >>>= 7;
            }
        }
    }
}
