package ki;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final class t {
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
