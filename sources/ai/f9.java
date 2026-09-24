package ai;

import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes4.dex */
public final class f9 {
    public int a;
    public long b;
    public int c;

    public f9(int i10, int i11, long j3) {
        this.c = i10;
        this.b = j3;
        this.a = i11;
    }

    public boolean a(int i10, int i11) {
        int i12 = this.c;
        if (i12 != 1) {
            if ((i12 == 2 || i12 == 3) && ConnectionsManager.getInstance(i10).getCurrentTime() >= this.b) {
                return false;
            }
        } else if (this.a >= i11) {
            return false;
        }
        return true;
    }

    public int b() {
        int i10 = this.c;
        if (i10 != 2) {
            return i10 != 3 ? 14 : 16;
        }
        return 15;
    }
}
