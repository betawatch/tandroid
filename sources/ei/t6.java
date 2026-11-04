package ei;

import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class t6 implements e3.f0 {
    public final /* synthetic */ int a = 1;
    public int b;
    public long c;
    public int d;

    public /* synthetic */ t6() {
    }

    public boolean a(int i3, int i10) {
        int i11 = this.d;
        if (i11 != 1) {
            if ((i11 == 2 || i11 == 3) && ConnectionsManager.getInstance(i3).getCurrentTime() >= this.c) {
                return false;
            }
        } else if (this.b >= i10) {
            return false;
        }
        return true;
    }

    public int b() {
        int i3 = this.d;
        if (i3 != 2) {
            return i3 != 3 ? 14 : 16;
        }
        return 15;
    }

    public String toString() {
        switch (this.a) {
            case 3:
                StringBuilder sb2 = new StringBuilder("AtomSizeTooSmall{type=");
                sb2.append(g2.n0.e0(this.b));
                sb2.append(", size=");
                sb2.append(this.c);
                sb2.append(", minHeaderSize=");
                return a1.g.o(this.d, "}", sb2);
            default:
                return super.toString();
        }
    }

    public t6(int i3, long j10, int i10) {
        this.b = i3;
        this.c = j10;
        this.d = i10;
    }

    public t6(long j10, int i3, int i10) {
        this.c = j10;
        this.b = i3;
        this.d = i10;
    }

    public t6(int i3, int i10, long j10) {
        this.d = i3;
        this.c = j10;
        this.b = i10;
    }
}
