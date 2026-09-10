package n7;

import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayDeque;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class g1 implements Closeable {
    public final ByteArrayInputStream a;
    public f1 b;
    public final byte[] c = new byte[8];
    public final l2.h d = new l2.h(5);

    public g1(ByteArrayInputStream byteArrayInputStream) {
        this.a = byteArrayInputStream;
    }

    public final long a() {
        h(Byte.MIN_VALUE);
        g();
        long f7 = f();
        if (f7 < 0) {
            throw new UnsupportedOperationException("the maximum supported array length is 9223372036854775807");
        }
        if (f7 > 0) {
            ((ArrayDeque) this.d.b).push(Long.valueOf(f7));
        }
        return f7;
    }

    public final long b() {
        boolean z10;
        d();
        byte b10 = this.b.a;
        if (b10 == 0) {
            z10 = true;
        } else {
            if (b10 != 32) {
                throw new IllegalStateException(hc.b.j((this.b.a >> 5) & 7, "expected major type 0 or 1 but found "));
            }
            z10 = false;
        }
        long f7 = f();
        if (f7 >= 0) {
            return z10 ? f7 : ~f7;
        }
        throw new UnsupportedOperationException("the maximum supported unsigned/negative integer is 9223372036854775807");
    }

    public final long c() {
        h((byte) -96);
        g();
        long f7 = f();
        if (f7 < 0 || f7 > 4611686018427387903L) {
            throw new UnsupportedOperationException("the maximum supported map length is 4611686018427387903L");
        }
        if (f7 > 0) {
            ((ArrayDeque) this.d.b).push(Long.valueOf(f7 + f7));
        }
        return f7;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
        this.d.E();
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0098, code lost:
    
        if (r0 != (-2)) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final f1 d() {
        if (this.b == null) {
            int read = this.a.read();
            l2.h hVar = this.d;
            if (read == -1) {
                hVar.E();
                return null;
            }
            f1 f1Var = new f1(read);
            this.b = f1Var;
            long j3 = -2;
            byte b10 = f1Var.a;
            if (b10 != Byte.MIN_VALUE && b10 != -96 && b10 != -64) {
                if (b10 != -32) {
                    if (b10 != 0 && b10 != 32) {
                        if (b10 == 64) {
                            hVar.F(-1L);
                        } else {
                            if (b10 != 96) {
                                throw new IllegalStateException(hc.b.j((this.b.a >> 5) & 7, "invalid major type: "));
                            }
                            hVar.F(-2L);
                        }
                        long G = hVar.G();
                        ArrayDeque arrayDeque = (ArrayDeque) hVar.b;
                        if (G == 1) {
                            arrayDeque.pop();
                        } else if (G > 1) {
                            arrayDeque.pop();
                            arrayDeque.push(Long.valueOf(G - 1));
                        } else if (G == -4) {
                            arrayDeque.pop();
                            arrayDeque.push(-5L);
                        } else if (G == -5) {
                            arrayDeque.pop();
                            arrayDeque.push(-4L);
                        }
                    }
                } else if (f1Var.b == 31) {
                    long G2 = hVar.G();
                    if (G2 >= 0) {
                        throw new IOException(a4.a.o(G2, "expected indefinite length scope but found "));
                    }
                    if (G2 == -5) {
                        throw new IOException("expected a value for dangling key in indefinite-length map");
                    }
                    ((ArrayDeque) hVar.b).pop();
                }
            }
            long G3 = hVar.G();
            if (G3 == -1) {
                j3 = G3;
            }
            throw new IOException(a4.a.o(j3, "expected non-string scope but found "));
        }
        return this.b;
    }

    public final boolean e() {
        h((byte) -32);
        if (this.b.b > 24) {
            throw new IllegalStateException("expected simple value");
        }
        int f7 = (int) f();
        if (f7 == 20) {
            return false;
        }
        if (f7 == 21) {
            return true;
        }
        throw new IllegalStateException("expected FALSE or TRUE");
    }

    public final long f() {
        byte b10 = this.b.b;
        if (b10 < 24) {
            long j3 = b10;
            this.b = null;
            return j3;
        }
        if (b10 == 24) {
            int read = this.a.read();
            if (read == -1) {
                throw new EOFException();
            }
            this.b = null;
            return read & 255;
        }
        byte[] bArr = this.c;
        if (b10 == 25) {
            i(2, bArr);
            return ((bArr[0] & 255) << 8) | (255 & bArr[1]);
        }
        if (b10 == 26) {
            i(4, bArr);
            return ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        }
        if (b10 != 27) {
            f1 f1Var = this.b;
            throw new IOException(a4.a.l(f1Var.b, (f1Var.a >> 5) & 7, "invalid additional information ", " for major type "));
        }
        i(8, bArr);
        return ((bArr[0] & 255) << 56) | ((bArr[1] & 255) << 48) | ((bArr[2] & 255) << 40) | ((bArr[3] & 255) << 32) | ((bArr[4] & 255) << 24) | ((bArr[5] & 255) << 16) | ((bArr[6] & 255) << 8) | (bArr[7] & 255);
    }

    public final void g() {
        d();
        if (this.b.b == 31) {
            throw new IllegalStateException(hc.b.j(this.b.b, "expected definite length but found "));
        }
    }

    public final void h(byte b10) {
        d();
        if (this.b.a != b10) {
            throw new IllegalStateException(a4.a.l((b10 >> 5) & 7, (this.b.a >> 5) & 7, "expected major type ", " but found "));
        }
    }

    public final void i(int i10, byte[] bArr) {
        int i11 = 0;
        while (i11 != i10) {
            int read = this.a.read(bArr, i11, i10 - i11);
            if (read == -1) {
                throw new EOFException();
            }
            i11 += read;
        }
        this.b = null;
    }

    public final byte[] j() {
        g();
        long f7 = f();
        if (f7 < 0 || f7 > 2147483647L) {
            throw new UnsupportedOperationException("the maximum supported byte/text string length is 2147483647 bytes");
        }
        if (this.a.available() < f7) {
            throw new EOFException();
        }
        int i10 = (int) f7;
        byte[] bArr = new byte[i10];
        i(i10, bArr);
        return bArr;
    }
}
