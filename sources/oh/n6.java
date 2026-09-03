package oh;

import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class n6 {
    public final int a;
    public final int b;
    public final long c;

    public n6(int i10, int i11, long j10) {
        this.b = i10;
        this.c = j10;
        this.a = i11;
    }

    public final boolean a(int i10, int i11) {
        int i12 = this.b;
        if (i12 != 1) {
            if ((i12 == 2 || i12 == 3) && ConnectionsManager.getInstance(i10).getCurrentTime() >= this.c) {
                return false;
            }
        } else if (this.a >= i11) {
            return false;
        }
        return true;
    }

    public final int b() {
        int i10 = this.b;
        if (i10 != 2) {
            return i10 != 3 ? 14 : 16;
        }
        return 15;
    }
}
