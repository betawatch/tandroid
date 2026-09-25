package e2;

import java.util.NoSuchElementException;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes.dex */
public final class q implements w3.c {
    public int a;
    public int b;
    public int c;
    public int d;
    public Object e;

    @Override // w3.c
    public int a() {
        return -1;
    }

    @Override // w3.c
    public int b() {
        return this.a;
    }

    @Override // w3.c
    public int c() {
        v vVar = (v) this.e;
        int i10 = this.b;
        if (i10 == 8) {
            return vVar.x();
        }
        if (i10 == 16) {
            return vVar.D();
        }
        int i11 = this.c;
        this.c = i11 + 1;
        if (i11 % 2 != 0) {
            return this.d & 15;
        }
        int x10 = vVar.x();
        this.d = x10;
        return (x10 & 240) >> 4;
    }

    public long d() {
        int i10 = this.c;
        if (i10 == 0) {
            throw new NoSuchElementException();
        }
        long[] jArr = (long[]) this.e;
        int i11 = this.a;
        long j3 = jArr[i11];
        this.a = this.d & (i11 + 1);
        this.c = i10 - 1;
        return j3;
    }
}
