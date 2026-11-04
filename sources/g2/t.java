package g2;

import java.util.NoSuchElementException;
import org.telegram.messenger.hs;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class t implements y3.c {
    public int a;
    public int b;
    public int c;
    public int d;
    public Object e;

    @Override // y3.c
    public int a() {
        return -1;
    }

    @Override // y3.c
    public int b() {
        return this.a;
    }

    @Override // y3.c
    public int c() {
        y yVar = (y) this.e;
        int i3 = this.b;
        if (i3 == 8) {
            return yVar.A();
        }
        if (i3 == 16) {
            return yVar.H();
        }
        int i10 = this.c;
        this.c = i10 + 1;
        if (i10 % 2 != 0) {
            return this.d & 15;
        }
        int A = yVar.A();
        this.d = A;
        return (A & hs.P3) >> 4;
    }

    public long d() {
        int i3 = this.c;
        if (i3 == 0) {
            throw new NoSuchElementException();
        }
        long[] jArr = (long[]) this.e;
        int i10 = this.a;
        long j10 = jArr[i10];
        this.a = this.d & (i10 + 1);
        this.c = i3 - 1;
        return j10;
    }
}
