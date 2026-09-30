package ii;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
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
