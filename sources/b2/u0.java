package b2;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes.dex */
public class u0 {
    public int a;
    public int b;

    public /* synthetic */ u0(int i10, int i11) {
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
