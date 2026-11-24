// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class i07 {
    public byte a = 0;
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
        if (this.a == 2) {
            return (this.b || this.c || this.d) ? this.h != null : this.g != null;
        }
        return false;
    }
}
