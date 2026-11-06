package di;

import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class s6 implements f3.g0 {
    public final /* synthetic */ int a = 1;
    public int b;
    public long c;
    public int d;

    public /* synthetic */ s6() {
    }

    public boolean a(int i7, int i10) {
        int i11 = this.d;
        if (i11 != 1) {
            if ((i11 == 2 || i11 == 3) && ConnectionsManager.getInstance(i7).getCurrentTime() >= this.c) {
                return false;
            }
        } else if (this.b >= i10) {
            return false;
        }
        return true;
    }

    public int b() {
        int i7 = this.d;
        if (i7 != 2) {
            return i7 != 3 ? 14 : 16;
        }
        return 15;
    }

    public String toString() {
        switch (this.a) {
            case 3:
                StringBuilder sb2 = new StringBuilder("AtomSizeTooSmall{type=");
                sb2.append(h2.m0.e0(this.b));
                sb2.append(", size=");
                sb2.append(this.c);
                sb2.append(", minHeaderSize=");
                return a8.p0.n(this.d, "}", sb2);
            default:
                return super.toString();
        }
    }

    public s6(int i7, long j3, int i10) {
        this.b = i7;
        this.c = j3;
        this.d = i10;
    }

    public s6(long j3, int i7, int i10) {
        this.c = j3;
        this.b = i7;
        this.d = i10;
    }

    public s6(int i7, int i10, long j3) {
        this.d = i7;
        this.c = j3;
        this.b = i10;
    }
}
