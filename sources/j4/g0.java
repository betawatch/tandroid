package j4;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class g0 {
    public final String a;
    public final int b;
    public final int c;
    public int d;
    public String e;

    public g0(int i10, int i11) {
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

    public g0(int i10, int i11, int i12) {
        this.a = i10 != Integer.MIN_VALUE ? a4.a.m(i10, "/") : "";
        this.b = i11;
        this.c = i12;
        this.d = TLObject.FLAG_31;
        this.e = "";
    }
}
