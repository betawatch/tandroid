package b2;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
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
