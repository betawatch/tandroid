package j4;

import e2.l0;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class w implements c3.f0 {
    public final /* synthetic */ int a = 0;
    public long b;
    public int c;
    public int d;

    public /* synthetic */ w() {
    }

    public boolean a(int i10, int i11) {
        int i12 = this.d;
        if (i12 != 1) {
            if ((i12 == 2 || i12 == 3) && ConnectionsManager.getInstance(i10).getCurrentTime() >= this.b) {
                return false;
            }
        } else if (this.c >= i11) {
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
            case 3:
                StringBuilder sb2 = new StringBuilder("AtomSizeTooSmall{type=");
                sb2.append(l0.e0(this.c));
                sb2.append(", size=");
                sb2.append(this.b);
                sb2.append(", minHeaderSize=");
                return a1.g.p(sb2, this.d, "}");
            default:
                return super.toString();
        }
    }

    public w(int i10, long j10, int i11) {
        this.c = i10;
        this.b = j10;
        this.d = i11;
    }

    public w(long j10, int i10, int i11) {
        this.b = j10;
        this.c = i10;
        this.d = i11;
    }

    public w(int i10, int i11, long j10) {
        this.d = i10;
        this.b = j10;
        this.c = i11;
    }
}
