package di;

import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class b7 implements c3.f0 {
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
                sb2.append(e2.n0.e0(this.b));
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
