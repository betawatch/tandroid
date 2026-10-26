package e2;

import java.util.NoSuchElementException;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class s implements w3.b {
    public int a;
    public int b;
    public int c;
    public int d;
    public Object e;

    @Override // w3.b
    public int a() {
        return -1;
    }

    @Override // w3.b
    public int b() {
        return this.a;
    }

    @Override // w3.b
    public int c() {
        x xVar = (x) this.e;
        int i10 = this.b;
        if (i10 == 8) {
            return xVar.A();
        }
        if (i10 == 16) {
            return xVar.H();
        }
        int i11 = this.c;
        this.c = i11 + 1;
        if (i11 % 2 != 0) {
            return this.d & 15;
        }
        int A = xVar.A();
        this.d = A;
        return (A & 240) >> 4;
    }

    public long d() {
        int i10 = this.c;
        if (i10 == 0) {
            throw new NoSuchElementException();
        }
        long[] jArr = (long[]) this.e;
        int i11 = this.a;
        long j10 = jArr[i11];
        this.a = this.d & (i11 + 1);
        this.c = i10 - 1;
        return j10;
    }
}
