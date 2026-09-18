package ii;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes4.dex */
public final class u {
    public int a = 0;
    public boolean b;
    public boolean c;
    public boolean d;
    public String e;
    public float f;
    public TLRPC.Photo g;
    public TLRPC.Document h;
    public TLRPC.Document i;
    public int j;
    public int k;
    public int l;
    public int m;
    public boolean n;

    public final boolean a() {
        return this.a == 1;
    }

    public final boolean b() {
        if (this.a != 2) {
            return false;
        }
        return (this.b || this.c || this.d) ? this.h != null : this.g != null;
    }
}
