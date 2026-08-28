package ih;

import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class p6 {
    public final int a;
    public final int b;
    public final long c;

    public p6(int i9, int i10, long j10) {
        this.b = i9;
        this.c = j10;
        this.a = i10;
    }

    public final boolean a(int i9, int i10) {
        int i11 = this.b;
        if (i11 != 1) {
            if ((i11 == 2 || i11 == 3) && ConnectionsManager.getInstance(i9).getCurrentTime() >= this.c) {
                return false;
            }
        } else if (this.a >= i10) {
            return false;
        }
        return true;
    }

    public final int b() {
        int i9 = this.b;
        if (i9 != 2) {
            return i9 != 3 ? 14 : 16;
        }
        return 15;
    }
}
