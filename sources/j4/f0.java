package j4;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public final class f0 {
    public final String a;
    public final int b;
    public final int c;
    public int d;
    public String e;

    public f0(int i10, int i11) {
        this(TLObject.FLAG_31, i10, i11);
    }

    public final void a() {
        int i10 = this.d;
        this.d = i10 == Integer.MIN_VALUE ? this.b : i10 + this.c;
        this.e = this.a + this.d;
    }

    public final void b() {
        if (this.d == Integer.MIN_VALUE) {
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }
    }

    public f0(int i10, int i11, int i12) {
        this.a = i10 != Integer.MIN_VALUE ? a4.a.m(i10, "/") : "";
        this.b = i11;
        this.c = i12;
        this.d = TLObject.FLAG_31;
        this.e = "";
    }
}
