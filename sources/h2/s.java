package h2;

import java.util.NoSuchElementException;
import org.telegram.messenger.qs;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class s implements z3.b {
    public int a;
    public int b;
    public int c;
    public int d;
    public Object e;

    @Override // z3.b
    public int a() {
        return -1;
    }

    @Override // z3.b
    public int b() {
        return this.a;
    }

    @Override // z3.b
    public int c() {
        x xVar = (x) this.e;
        int i7 = this.b;
        if (i7 == 8) {
            return xVar.A();
        }
        if (i7 == 16) {
            return xVar.H();
        }
        int i10 = this.c;
        this.c = i10 + 1;
        if (i10 % 2 != 0) {
            return this.d & 15;
        }
        int A = xVar.A();
        this.d = A;
        return (A & qs.P3) >> 4;
    }

    public long d() {
        int i7 = this.c;
        if (i7 == 0) {
            throw new NoSuchElementException();
        }
        long[] jArr = (long[]) this.e;
        int i10 = this.a;
        long j3 = jArr[i10];
        this.a = this.d & (i10 + 1);
        this.c = i7 - 1;
        return j3;
    }
}
