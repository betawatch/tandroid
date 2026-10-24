package ci;

import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final class b7 implements c3.i0 {
    public final /* synthetic */ int a = 1;
    public int b;
    public long c;
    public int d;

    public /* synthetic */ b7() {
    }

    public boolean a(int i10, int i11) {
        int i12 = this.d;
        if (i12 != 1) {
            if ((i12 == 2 || i12 == 3) && ConnectionsManager.getInstance(i10).getCurrentTime() >= this.c) {
                return false;
            }
        } else if (this.b >= i11) {
            return false;
        }
        return true;
    }

    public int b() {
        int i10 = this.d;
        if (i10 != 2) {
            return i10 != 3 ? 14 : 16;
        }
        return 15;
    }

    public String toString() {
        switch (this.a) {
            case 2:
                StringBuilder sb2 = new StringBuilder("AtomSizeTooSmall{type=");
                sb2.append(e2.m0.e0(this.b));
                sb2.append(", size=");
                sb2.append(this.c);
                sb2.append(", minHeaderSize=");
                return a1.g.n(this.d, "}", sb2);
            default:
                return super.toString();
        }
    }

    public b7(int i10, long j10, int i11) {
        this.b = i10;
        this.c = j10;
        this.d = i11;
    }

    public b7(int i10, int i11, long j10) {
        this.d = i10;
        this.c = j10;
        this.b = i11;
    }
}
