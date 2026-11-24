// default package

import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.util.ArrayDeque;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class hge implements Closeable {
    public final ByteArrayInputStream a;
    public w9c b;
    public final byte[] c = new byte[8];
    public final xdd d;

    public hge(ByteArrayInputStream byteArrayInputStream) {
        xdd xddVar = new xdd();
        xddVar.a = new ArrayDeque(16);
        this.d = xddVar;
        this.a = byteArrayInputStream;
    }

    public final long a() {
        h(Byte.MIN_VALUE);
        g();
        long f = f();
        if (f < 0) {
            fyb.i("the maximum supported array length is 9223372036854775807");
            return 0L;
        }
        if (f > 0) {
            ((ArrayDeque) this.d.a).push(Long.valueOf(f));
        }
        return f;
    }

    public final long b() {
        boolean z;
        d();
        byte b = this.b.a;
        if (b == 0) {
            z = true;
        } else {
            if (b != 32) {
                sc8.j(de9.k((b >> 5) & 7, "expected major type 0 or 1 but found "));
                return 0L;
            }
            z = false;
        }
        long f = f();
        if (f >= 0) {
            return z ? f : ~f;
        }
        fyb.i("the maximum supported unsigned/negative integer is 9223372036854775807");
        return 0L;
    }

    public final long c() {
        h((byte) -96);
        g();
        long f = f();
        if (f < 0 || f > 4611686018427387903L) {
            fyb.i("the maximum supported map length is 4611686018427387903L");
            return 0L;
        }
        if (f > 0) {
            ((ArrayDeque) this.d.a).push(Long.valueOf(f << 1));
        }
        return f;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
        this.d.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x008d, code lost:
    
        if (r2 != (-2)) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final w9c d() {
        xdd xddVar = this.d;
        ArrayDeque arrayDeque = (ArrayDeque) xddVar.a;
        if (this.b == null) {
            int read = this.a.read();
            if (read == -1) {
                xddVar.a();
                return null;
            }
            w9c w9cVar = new w9c(read);
            this.b = w9cVar;
            long j = -2;
            byte b = w9cVar.a;
            if (b != Byte.MIN_VALUE && b != -96 && b != -64) {
                if (b != -32) {
                    if (b != 0 && b != 32) {
                        if (b == 64) {
                            xddVar.c(-1L);
                        } else {
                            if (b != 96) {
                                sc8.j(de9.k((b >> 5) & 7, "invalid major type: "));
                                return null;
                            }
                            xddVar.c(-2L);
                        }
                        long d = xddVar.d();
                        if (d == 1) {
                            arrayDeque.pop();
                        } else if (d > 1) {
                            arrayDeque.pop();
                            arrayDeque.push(Long.valueOf(d - 1));
                        } else if (d == -4) {
                            arrayDeque.pop();
                            arrayDeque.push(-5L);
                        } else if (d == -5) {
                            arrayDeque.pop();
                            arrayDeque.push(-4L);
                        }
                    }
                } else if (w9cVar.b == 31) {
                    long d2 = xddVar.d();
                    if (d2 >= 0) {
                        k93.f(ls6.n(d2, "expected indefinite length scope but found "));
                        return null;
                    }
                    if (d2 == -5) {
                        k93.f("expected a value for dangling key in indefinite-length map");
                        return null;
                    }
                    arrayDeque.pop();
                }
            }
            long d3 = xddVar.d();
            if (d3 == -1) {
                j = d3;
            }
            k93.f(ls6.n(j, "expected non-string scope but found "));
            return null;
        }
        return this.b;
    }

    public final boolean e() {
        h((byte) -32);
        if (this.b.b > 24) {
            sc8.j("expected simple value");
            return false;
        }
        int f = (int) f();
        if (f == 20) {
            return false;
        }
        if (f == 21) {
            return true;
        }
        sc8.j("expected FALSE or TRUE");
        return false;
    }

    public final long f() {
        w9c w9cVar = this.b;
        byte b = w9cVar.b;
        if (b < 24) {
            long j = b;
            this.b = null;
            return j;
        }
        if (b == 24) {
            int read = this.a.read();
            if (read == -1) {
                throw new EOFException();
            }
            this.b = null;
            return read & 255;
        }
        byte[] bArr = this.c;
        if (b == 25) {
            i(2, bArr);
            return ((bArr[0] & 255) << 8) | (bArr[1] & 255);
        }
        if (b == 26) {
            i(4, bArr);
            return ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        }
        if (b != 27) {
            k93.f(b00.g(b, (w9cVar.a >> 5) & 7, "invalid additional information ", " for major type "));
            return 0L;
        }
        i(8, bArr);
        return ((bArr[0] & 255) << 56) | ((bArr[1] & 255) << 48) | ((bArr[2] & 255) << 40) | ((bArr[3] & 255) << 32) | ((bArr[4] & 255) << 24) | ((bArr[5] & 255) << 16) | ((bArr[6] & 255) << 8) | (bArr[7] & 255);
    }

    public final void g() {
        d();
        byte b = this.b.b;
        if (b != 31) {
            return;
        }
        sc8.j(de9.k(b, "expected definite length but found "));
    }

    public final void h(byte b) {
        d();
        byte b2 = this.b.a;
        if (b2 == b) {
            return;
        }
        sc8.j(b00.g((b >> 5) & 7, (b2 >> 5) & 7, "expected major type ", " but found "));
    }

    public final void i(int i, byte[] bArr) {
        int i2 = 0;
        while (i2 != i) {
            int read = this.a.read(bArr, i2, i - i2);
            if (read == -1) {
                throw new EOFException();
            }
            i2 += read;
        }
        this.b = null;
    }

    public final byte[] j() {
        g();
        long f = f();
        if (f < 0 || f > 2147483647L) {
            fyb.i("the maximum supported byte/text string length is 2147483647 bytes");
            return null;
        }
        if (this.a.available() < f) {
            throw new EOFException();
        }
        int i = (int) f;
        byte[] bArr = new byte[i];
        i(i, bArr);
        return bArr;
    }
}
