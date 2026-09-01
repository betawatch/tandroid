package oh;

import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
