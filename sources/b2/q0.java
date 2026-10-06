package b2;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes.dex */
public class q0 {
    public int a;
    public int b;

    public /* synthetic */ q0(int i10, int i11) {
        this.a = i10;
        this.b = i11;
    }

    public int a() {
        int i10 = this.b;
        if (i10 == 2) {
            return 10;
        }
        if (i10 == 5) {
            return 11;
        }
        if (i10 == 29) {
            return 12;
        }
        if (i10 != 42) {
            return i10 != 22 ? i10 != 23 ? 0 : 15 : TLObject.FLAG_30;
        }
        return 16;
    }

    public int b() {
        return this.a | this.b;
    }
}
