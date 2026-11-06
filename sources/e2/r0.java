package e2;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public class r0 {
    public int a;
    public int b;

    public /* synthetic */ r0(int i7, int i10) {
        this.a = i7;
        this.b = i10;
    }

    public int a() {
        int i7 = this.b;
        if (i7 == 2) {
            return 10;
        }
        if (i7 == 5) {
            return 11;
        }
        if (i7 == 29) {
            return 12;
        }
        if (i7 != 42) {
            return i7 != 22 ? i7 != 23 ? 0 : 15 : TLObject.FLAG_30;
        }
        return 16;
    }

    public int b() {
        return this.a | this.b;
    }
}
