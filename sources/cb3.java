// default package

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class cb3 implements f84 {
    public final z63 b;
    public final long c;
    public long d;
    public int f;
    public int h;
    public byte[] e = new byte[65536];
    public final byte[] a = new byte[TLObject.FLAG_12];

    static {
        gt6.a("media3.extractor");
    }

    public cb3(z63 z63Var, long j, long j2) {
        this.b = z63Var;
        this.d = j;
        this.c = j2;
    }

    public final boolean a(int i, boolean z) {
        f(i);
        int i2 = this.h - this.f;
        while (i2 < i) {
            cb3 cb3Var = this;
            int i3 = i;
            boolean z2 = z;
            i2 = cb3Var.j(this.e, this.f, i3, i2, z2);
            if (i2 == -1) {
                return false;
            }
            cb3Var.h = cb3Var.f + i2;
            this = cb3Var;
            i = i3;
            z = z2;
        }
        this.f += i;
        return true;
    }

    @Override // f84
    public final void b(int i, int i2, byte[] bArr) {
        d(bArr, i, i2, false);
    }

    @Override // f84
    public final boolean c(byte[] bArr, int i, int i2, boolean z) {
        int min;
        int i3 = this.h;
        if (i3 == 0) {
            min = 0;
        } else {
            min = Math.min(i3, i2);
            System.arraycopy(this.e, 0, bArr, i, min);
            m(min);
        }
        int i4 = min;
        while (i4 < i2 && i4 != -1) {
            i4 = j(bArr, i, i2, i4, z);
        }
        if (i4 != -1) {
            this.d += i4;
        }
        return i4 != -1;
    }

    @Override // f84
    public final boolean d(byte[] bArr, int i, int i2, boolean z) {
        if (!a(i2, z)) {
            return false;
        }
        System.arraycopy(this.e, this.f - i2, bArr, i, i2);
        return true;
    }

    @Override // f84
    public final long e() {
        return this.d + this.f;
    }

    public final void f(int i) {
        int i2 = this.f + i;
        byte[] bArr = this.e;
        if (i2 > bArr.length) {
            this.e = Arrays.copyOf(this.e, gcc.i(bArr.length << 1, 65536 + i2, i2 + TLObject.FLAG_19));
        }
    }

    @Override // f84
    public final void g(int i) {
        a(i, false);
    }

    @Override // f84
    public final long getLength() {
        return this.c;
    }

    @Override // f84
    public final long getPosition() {
        return this.d;
    }

    @Override // f84
    public final void h() {
        this.f = 0;
    }

    public final int i(int i, int i2, byte[] bArr) {
        cb3 cb3Var;
        int min;
        f(i2);
        int i3 = this.h;
        int i4 = this.f;
        int i5 = i3 - i4;
        if (i5 == 0) {
            cb3Var = this;
            min = cb3Var.j(this.e, i4, i2, 0, true);
            if (min == -1) {
                return -1;
            }
            cb3Var.h += min;
        } else {
            cb3Var = this;
            min = Math.min(i2, i5);
        }
        System.arraycopy(cb3Var.e, cb3Var.f, bArr, i, min);
        cb3Var.f += min;
        return min;
    }

    public final int j(byte[] bArr, int i, int i2, int i3, boolean z) {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int read = this.b.read(bArr, i + i3, i2 - i3);
        if (read != -1) {
            return i3 + read;
        }
        if (i3 == 0 && z) {
            return -1;
        }
        throw new EOFException();
    }

    public final int k(int i) {
        cb3 cb3Var;
        int min = Math.min(this.h, i);
        m(min);
        if (min == 0) {
            byte[] bArr = this.a;
            cb3Var = this;
            min = cb3Var.j(bArr, 0, Math.min(i, bArr.length), 0, true);
        } else {
            cb3Var = this;
        }
        if (min != -1) {
            cb3Var.d += min;
        }
        return min;
    }

    public final boolean l(int i, boolean z) {
        int min = Math.min(this.h, i);
        m(min);
        int i2 = min;
        while (i2 < i && i2 != -1) {
            byte[] bArr = this.a;
            i2 = j(bArr, -i2, Math.min(i, bArr.length + i2), i2, z);
        }
        if (i2 != -1) {
            this.d += i2;
        }
        return i2 != -1;
    }

    public final void m(int i) {
        int i2 = this.h - i;
        this.h = i2;
        this.f = 0;
        byte[] bArr = this.e;
        byte[] bArr2 = i2 < bArr.length - TLObject.FLAG_19 ? new byte[65536 + i2] : bArr;
        System.arraycopy(bArr, i, bArr2, 0, i2);
        this.e = bArr2;
    }

    @Override // f84
    public final void n(int i) {
        l(i, false);
    }

    @Override // z63
    public final int read(byte[] bArr, int i, int i2) {
        cb3 cb3Var;
        int i3 = this.h;
        int i4 = 0;
        if (i3 != 0) {
            int min = Math.min(i3, i2);
            System.arraycopy(this.e, 0, bArr, i, min);
            m(min);
            i4 = min;
        }
        if (i4 == 0) {
            cb3Var = this;
            i4 = cb3Var.j(bArr, i, i2, 0, true);
        } else {
            cb3Var = this;
        }
        if (i4 != -1) {
            cb3Var.d += i4;
        }
        return i4;
    }

    @Override // f84
    public final void readFully(byte[] bArr, int i, int i2) {
        c(bArr, i, i2, false);
    }
}
