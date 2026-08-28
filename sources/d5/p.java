package d5;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public class p {
    public int a;
    public int b;

    public /* synthetic */ p(int i9, int i10) {
        this.a = i9;
        this.b = i10;
    }

    public int a() {
        int i9 = this.b;
        if (i9 == 2) {
            return 10;
        }
        if (i9 == 5) {
            return 11;
        }
        if (i9 == 29) {
            return 12;
        }
        if (i9 != 42) {
            return i9 != 22 ? i9 != 23 ? 0 : 15 : TLObject.FLAG_30;
        }
        return 16;
    }
}
