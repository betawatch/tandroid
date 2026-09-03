package b7;

import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayDeque;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class j1 implements Closeable {
    public final ByteArrayInputStream a;
    public i1 b;
    public final byte[] c = new byte[8];
    public final y5.h d = new y5.h(6);

    public j1(ByteArrayInputStream byteArrayInputStream) {
        this.a = byteArrayInputStream;
    }

    public final long a() {
        h(Byte.MIN_VALUE);
        g();
        long f10 = f();
        if (f10 < 0) {
            throw new UnsupportedOperationException("the maximum supported array length is 9223372036854775807");
        }
        if (f10 > 0) {
            ((ArrayDeque) this.d.b).push(Long.valueOf(f10));
        }
        return f10;
    }

    public final long b() {
        boolean z4;
        d();
        byte b10 = this.b.a;
        if (b10 == 0) {
            z4 = true;
        } else {
            if (b10 != 32) {
                throw new IllegalStateException(l.d.j((this.b.a >> 5) & 7, "expected major type 0 or 1 but found "));
            }
            z4 = false;
        }
        long f10 = f();
        if (f10 >= 0) {
            return z4 ? f10 : ~f10;
        }
        throw new UnsupportedOperationException("the maximum supported unsigned/negative integer is 9223372036854775807");
    }

    public final long c() {
        h((byte) -96);
        g();
        long f10 = f();
        if (f10 < 0 || f10 > 4611686018427387903L) {
            throw new UnsupportedOperationException("the maximum supported map length is 4611686018427387903L");
        }
        if (f10 > 0) {
            ((ArrayDeque) this.d.b).push(Long.valueOf(f10 + f10));
        }
        return f10;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
        this.d.v();
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0098, code lost:
    
        if (r0 != (-2)) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final i1 d() {
        if (this.b == null) {
            int read = this.a.read();
            y5.h hVar = this.d;
            if (read == -1) {
                hVar.v();
                return null;
            }
            i1 i1Var = new i1(read);
            this.b = i1Var;
            long j10 = -2;
            byte b10 = i1Var.a;
            if (b10 != Byte.MIN_VALUE && b10 != -96 && b10 != -64) {
                if (b10 != -32) {
                    if (b10 != 0 && b10 != 32) {
                        if (b10 == 64) {
                            hVar.x(-1L);
                        } else {
                            if (b10 != 96) {
                                throw new IllegalStateException(l.d.j((this.b.a >> 5) & 7, "invalid major type: "));
                            }
                            hVar.x(-2L);
                        }
                        long z4 = hVar.z();
                        ArrayDeque arrayDeque = (ArrayDeque) hVar.b;
                        if (z4 == 1) {
                            arrayDeque.pop();
                        } else if (z4 > 1) {
                            arrayDeque.pop();
                            arrayDeque.push(Long.valueOf(z4 - 1));
                        } else if (z4 == -4) {
                            arrayDeque.pop();
                            arrayDeque.push(-5L);
                        } else if (z4 == -5) {
                            arrayDeque.pop();
                            arrayDeque.push(-4L);
                        }
                    }
                } else if (i1Var.b == 31) {
                    long z10 = hVar.z();
                    if (z10 >= 0) {
                        throw new IOException(android.support.v4.media.a.n(z10, "expected indefinite length scope but found "));
                    }
                    if (z10 == -5) {
                        throw new IOException("expected a value for dangling key in indefinite-length map");
                    }
                    ((ArrayDeque) hVar.b).pop();
                }
            }
            long z11 = hVar.z();
            if (z11 == -1) {
                j10 = z11;
            }
            throw new IOException(android.support.v4.media.a.n(j10, "expected non-string scope but found "));
        }
        return this.b;
    }

    public final boolean e() {
        h((byte) -32);
        if (this.b.b > 24) {
            throw new IllegalStateException("expected simple value");
        }
        int f10 = (int) f();
        if (f10 == 20) {
            return false;
        }
        if (f10 == 21) {
            return true;
        }
        throw new IllegalStateException("expected FALSE or TRUE");
    }

    public final long f() {
        byte b10 = this.b.b;
        if (b10 < 24) {
            long j10 = b10;
            this.b = null;
            return j10;
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
            i1 i1Var = this.b;
            throw new IOException(android.support.v4.media.a.k(i1Var.b, (i1Var.a >> 5) & 7, "invalid additional information ", " for major type "));
        }
        i(8, bArr);
        return ((bArr[0] & 255) << 56) | ((bArr[1] & 255) << 48) | ((bArr[2] & 255) << 40) | ((bArr[3] & 255) << 32) | ((bArr[4] & 255) << 24) | ((bArr[5] & 255) << 16) | ((bArr[6] & 255) << 8) | (bArr[7] & 255);
    }

    public final void g() {
        d();
        if (this.b.b == 31) {
            throw new IllegalStateException(l.d.j(this.b.b, "expected definite length but found "));
        }
    }

    public final void h(byte b10) {
        d();
        if (this.b.a != b10) {
            throw new IllegalStateException(android.support.v4.media.a.k((b10 >> 5) & 7, (this.b.a >> 5) & 7, "expected major type ", " but found "));
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
        long f10 = f();
        if (f10 < 0 || f10 > 2147483647L) {
            throw new UnsupportedOperationException("the maximum supported byte/text string length is 2147483647 bytes");
        }
        if (this.a.available() < f10) {
            throw new EOFException();
        }
        int i10 = (int) f10;
        byte[] bArr = new byte[i10];
        i(i10, bArr);
        return bArr;
    }
}
