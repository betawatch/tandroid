package j4;

import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class w {
    public int a;
    public int b;
    public long c;

    public w(int i10, int i11, long j3) {
        this.b = i10;
        this.c = j3;
        this.a = i11;
    }

    public boolean a(int i10, int i11) {
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

    public int b() {
        int i10 = this.b;
        if (i10 != 2) {
            return i10 != 3 ? 14 : 16;
        }
        return 15;
    }
}
