package b2;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
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
}
