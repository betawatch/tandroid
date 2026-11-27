// default package

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class e6c extends ef0 {
    public int i;
    public int j;
    public boolean k;
    public int l;
    public byte[] m;
    public int n;
    public long o;

    @Override // ef0, q20
    public final boolean a() {
        return super.a() && this.n == 0;
    }

    @Override // ef0, q20
    public final ByteBuffer b() {
        int i;
        if (super.a() && (i = this.n) > 0) {
            l(i).put(this.m, 0, this.n).flip();
            this.n = 0;
        }
        return super.b();
    }

    @Override // q20
    public final void d(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = limit - position;
        if (i != 0) {
            int min = Math.min(i, this.l);
            this.o += min / this.b.d;
            this.l -= min;
            byteBuffer.position(position + min);
            if (this.l > 0) {
                return;
            }
            int i2 = i - min;
            int length = (this.n + i2) - this.m.length;
            ByteBuffer l = l(length);
            int i3 = gcc.i(length, 0, this.n);
            l.put(this.m, 0, i3);
            int i4 = gcc.i(length - i3, 0, i2);
            byteBuffer.limit(byteBuffer.position() + i4);
            l.put(byteBuffer);
            byteBuffer.limit(limit);
            int i5 = i2 - i4;
            int i6 = this.n - i3;
            this.n = i6;
            byte[] bArr = this.m;
            System.arraycopy(bArr, i3, bArr, 0, i6);
            byteBuffer.get(this.m, this.n, i5);
            this.n += i5;
            l.flip();
        }
    }

    @Override // ef0, q20
    public final long g(long j) {
        return Math.max(0L, j - gcc.Z(this.b.a, this.j + this.i));
    }

    @Override // ef0
    public final m20 h(m20 m20Var) {
        if (!gcc.N(m20Var.c)) {
            throw new p20(m20Var);
        }
        this.k = true;
        return (this.i == 0 && this.j == 0) ? m20.e : m20Var;
    }

    @Override // ef0
    public final void i() {
        if (this.k) {
            this.k = false;
            int i = this.j;
            int i2 = this.b.d;
            this.m = new byte[i * i2];
            this.l = this.i * i2;
        }
        this.n = 0;
    }

    @Override // ef0
    public final void j() {
        if (this.k) {
            if (this.n > 0) {
                this.o += r0 / this.b.d;
            }
            this.n = 0;
        }
    }

    @Override // ef0
    public final void k() {
        this.m = gcc.b;
    }
}
