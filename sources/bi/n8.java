package bi;

import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public final class n8 {
    public int a;
    public long b;
    public int c;

    public n8(int i10, int i11, long j3) {
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
